package writefile;

import parcours.Registre;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    // private ArrayList<String> towrite ;
    private String[] towrite;

    private String filename;
    private int numberofBlock;
    private Registre registre;

    public Writer(String filename, int numberofBlock) {
        this.filename = filename;
        this.numberofBlock = numberofBlock;

        this.towrite = new String[numberofBlock+1];
        for (int i = 0; i < numberofBlock; i++) {
            towrite[i] = " ";
        }
        this.registre = new Registre();

    }

    public void initialiseWriter() {
        this.towrite[this.numberofBlock] = "// Inspiré du code fourni par M. Parodi dans le fichier tst_itoa_cisc.src\n"
                + "sp          equ r15\n" + "wr          equ r14\n" + "bp          equ r13\n" + "\n"
                + "SP          equ r15\n" + "WR          equ r14\n" + "BP          equ r13\n" + "\n"
                + "EXIT_EXC   EQU   64    // n° d'exception de EXIT\n"
                + "READ_EXC   EQU   65    // n° d'exception de READ  (lit 1 ligne)\n"
                + "WRITE_EXC  EQU   66    // n° d'exception de WRITE (affiche texte)\n" + "\n"
                + "NUL         equ  0     // caractère NUL qui doit terminer une chaîne de caractères\n"
                + "NULL        equ  0     // pointeur nul\n" + "NIL         equ  0     // fin de liste chaînée\n" + "\n"
                + "STACK_ADRS  equ 0x1000 // adresse de base de pile\n"
                + "LOAD_ADRS   equ 0x1010 // adresse de chargement du programme\n" + "\n"
                + "            org LOAD_ADRS\n" + "            start main_\n" + "\n"
                + "// initialise pointeur de pile sp et pointeur de base d'environnement bp\n"
                + "\n// Définition des strings\n";
        this.towrite[0] = "\nmain_   ldw sp, #STACK_ADRS // pile sera au dessus de STACK_ADRS\n"
                + "        ldw bp, #NIL        // bp initial (fin de liste chaînée d'environnements)\n" + "\n"
                + "// { // ouverture du bloc englobant de main\n"
                + "// LNK crée environnement du main pour permettre des variables locales \n"
                + "// mais sans encore les réserver     \n" + "        stw bp, -(sp)\n" + "        ldw bp, sp\n";
    }

    public void primitivFuntion() { // fonctions primitives
        this.towrite[0] += "// void printAdrs(int i) Affiche un entier en base 16\n" + "\n"
                + "printAdrs_ LDQ 8, R1      // R1 = taille données locales (ici 8) de fonction appelée\n" + "\n"
                + "     // LINK R1        // crée et lie l'environnement de fonction appelée\n"
                + "           STW BP, -(SP)  // empile le contenu du registre BP\n"
                + "           LDW BP, SP     // charge contenu SP ds BP qui pointe sur sa sauvegarde\n"
                + "           SUB SP, R1, SP // réserve R1 octets sur la pile pour la variable locale z[7] pour stocker la chaine de caractere correspondant à l'entier\n"
                + "\n" + "// itoa(value, text, 16); // appelle itoa avec i = value, p = text, b = 16\n" + "\n"
                + "        ldw r0, #16       // charge 16 (pour base hexadécimale) dans r0\n"
                + "        stw r0, -(sp)     // empile contenu de r0 (paramètre b)\n" + "\n"
                + "        adi bp, r0, #-8   // r0 = bp - 8 = adresse du tableau text\n"
                + "        stw r0, -(sp)     // empile contenu de r0 (paramètre p)\n" + "\n"
                + "        ldw r0, (bp)4     // charge r0 avec le parametre i de printi(int i)\n"
                + "        stw r0, -(sp)     // empile contenu de r0 (paramètre i) de itoa(i,p,b)\n" + "\n"
                + "        jsr @itoa_        // appelle fonction itoa d'adresse itoa_\n" + "\n"
                + "        adi sp, sp, #6    // nettoie la pile des paramètres \n"
                + "                          // de taille totale 6 octets\n" + "\n" + "// print(text);\n" + "\n"
                + "        adi bp, r0, #-8   // r0 = bp - 8 = adresse du tableau text\n"
                + "        stw r0, -(sp)     // empile contenu de r0 (paramètre p)\n" + "        \n"
                + "        jsr @print_       // appelle fonction print d'adresse print_\n" + "\n"
                + "        adi sp, sp, #2    // nettoie la pile des paramètres\n"
                + "                          // de taille totale 2 octets\n" + "\n"
                + "// fin de la fonction (épilogue) :\n" + "\n" + "    // UNLINK \n"
                + "           LDW SP, BP    // charge SP avec contenu de BP: abandon infos locales\n"
                + "           LDW BP, (SP)+ // dépile ancien BP dans BP\n" + "\n"
                + "           RTS  // retour au programme appelant\n" + "\n"
                + "// void printi(int i) Affiche un entier en base 10\n" + "\n"
                + "printi_   LDQ 8, R1      // R1 = taille données locales (ici 8) de fonction appelée\n" + "\n"
                + "     // LINK R1        // crée et lie l'environnement de fonction appelée\n"
                + "           STW BP, -(SP)  // empile le contenu du registre BP\n"
                + "           LDW BP, SP     // charge contenu SP ds BP qui pointe sur sa sauvegarde\n"
                + "           SUB SP, R1, SP // réserve R1 octets sur la pile pour la variable locale z[7] pour stocker la chaine de caractere correspondant à l'entier\n"
                + "\n" + "// itoa(value, text, 10); // appelle itoa avec i = value, p = text, b = 10\n" + "\n"
                + "        ldw r0, #10       // charge 10 (pour base décimale) dans r0\n"
                + "        stw r0, -(sp)     // empile contenu de r0 (paramètre b)\n" + "\n"
                + "        adi bp, r0, #-8   // r0 = bp - 8 = adresse du tableau text\n"
                + "        stw r0, -(sp)     // empile contenu de r0 (paramètre p)\n" + "\n"
                + "        ldw r0, (bp)4     // charge r0 avec le parametre i de printi(int i)\n"
                + "        stw r0, -(sp)     // empile contenu de r0 (paramètre i) de itoa(i,p,b)\n" + "\n"
                + "        jsr @itoa_        // appelle fonction itoa d'adresse itoa_\n" + "\n"
                + "        adi sp, sp, #6    // nettoie la pile des paramètres \n"
                + "                          // de taille totale 6 octets\n" + "\n" + "// print(text);\n" + "\n"
                + "        adi bp, r0, #-8   // r0 = bp - 8 = adresse du tableau text\n"
                + "        stw r0, -(sp)     // empile contenu de r0 (paramètre p)\n" + "        \n"
                + "        jsr @print_       // appelle fonction print d'adresse print_\n" + "\n"
                + "        adi sp, sp, #2    // nettoie la pile des paramètres\n"
                + "                          // de taille totale 2 octets\n" + "\n"
                + "// fin de la fonction (épilogue) :\n" + "\n" + "    // UNLINK \n"
                + "           LDW SP, BP    // charge SP avec contenu de BP: abandon infos locales\n"
                + "           LDW BP, (SP)+ // dépile ancien BP dans BP\n" + "\n"
                + "           RTS  // retour au programme appelant\n" + "\n" + "\n"
                + "// FONCTIONS PRé-DéFINIES EN LANAGAGE D'ASSEMBLAGE\n" + "\n"
                + "// char *itoa(int i, char *p, int b);\n" + "//\n" + "// i entier à convertir\n"
                + "// p pointeur du tampon déjà alloué en mémoire où copier la chaîne de caractères\n"
                + "// b base de numération utilisée (de 2 à 36 inclus car il n'y a que 36 chiffres; par exemple: 2, 4, 8, 10, 16)\n"
                + "//\n" + "// Convertit un entier en chaîne de caractères codée en ASCII\n"
                + "// (cette fonction fait partie de la bibliothèque standard portable C stdlib et est normalement écrite en C).\n"
                + "// Limitation ici: b doit être pair.\n" + "// Retourne le pointeur sur la chaîne de caractère\n"
                + "//\n" + "// Ce programme terminera automatiquement la chaîne de caractères par NUL;\n"
                + "// le tampon devrait avoir une taille suffisante (par exemple sizeof(int)*8+1 octets pour b=2)\n"
                + "// Si la base = 10 et que l'entier est négatif la chaîne de caractères est précédée d'un signe moins (-);\n"
                + "// pour toute autre base, la valeur i est considérée non signée.\n"
                + "// Les 36 chiffres utilisables sont dans l'ordre: 0, 1, 2,..., 9, A, B, C, ... , Z .\n"
                + "// Aucune erreur n'est gérée.\n" + "     \n" + "\n"
                + "ITOA_I      equ 4      // offset du paramètre i\n"
                + "ITOA_P      equ 6      // offset du paramètre p\n"
                + "ITOA_B      equ 8      // offset du paramètre b\n" + "\n"
                + "ASCII_MINUS equ 45     // code ASCII de -\n" + "ASCII_PLUS  equ 43     // code ASCII de +\n"
                + "ASCII_SP    equ 32     // code ASCII d'espace SP\n"
                + "ASCII_0     equ 48     // code ASCII de zéro (les autres chiffres jusqu'à 9 suivent dans l'ordre)\n"
                + "ASCII_A     equ 65     // code ASCII de A (les autres lettres jusqu'à Z suivent dans l'ordre alphabétique)\n"
                + "\n" + "// LNK: crée environnement du main pour permettre des variables locales \n"
                + "// mais sans encore les réserver\n" + "itoa_   stw bp, -(sp)\n" + "        ldw bp, sp\n" + "\n"
                + "// récupération des paramètres depuis pile vers registres\n"
                + "        ldw r0, (bp)ITOA_I    // r0 = i    \n" + "        ldw r1, (bp)ITOA_B    // r1 = b\n"
                + "        \n" + "// gère le signe: normalement itoa gère des int c'est à dire des entiers signés, \n"
                + "// mais en fait seulement pour b=10;\n"
                + "// dans ce cas calcule le signe dans r3 et charge r0 avec la valeur absolue de i\n"
                + "        ldq ASCII_SP, r3      // code ASCII de espace (SPace) -> r3\n"
                + "        ldq 10, wr            // 10 -> wr\n"
                + "        cmp r1, wr            // charge les indicateurs de b - 10\n"
                + "        bne NOSIGN-$-2        // si non égal (donc si b != 10) saute en NOSIGN, sinon calcule signe\n"
                + "        ldq ASCII_PLUS, r3    // charge le code ASCII du signe plus + dans r3\n"
                + "        tst r0                // charge les indicateurs de r0 et donc de i\n"
                + "        bge POSIT-$-2         // saute en POSIT si i >= 0\n"
                + "        neg r0, r0            // change le signe de r0\n"
                + "        ldq ASCII_MINUS, r3   // charge le code ASCII du signe moins - dans r3\n"
                + "POSIT   NOP                   // r3 = code ASCII de signe: SP pour aucun, - ou +\n" + "\n" + "\n"
                + "// convertit l'entier i en chiffres et les empile de droite à gauche\n"
                + "NOSIGN  ldw r2, r0            // r2 <- r0\n" + "CNVLOOP ldw r0, r2            // r0 <- r2\n"
                + "   \n"
                + "   // effectue \"créativement\" la division par b supposé pair (car l'instruction div est hélas signée ...)\n"
                + "   // d=2*d' , D = d * q + r  , D = 2*D'+r\" , D' = d' * q + r' => r = 2*r'+r\"\n"
                + "   // un bug apparaît avec SRL R0, R0 avec R0 = 2 : met CF à 1 !!\n"
                + "        srl r1, r1            // r1 = b/2\n"
                + "        ani r0, r4, #1        // ANd Immédiate entre r0 et 00...01 vers r4:\n"
                + "                              // bit n°0 de r0 -> r4; r4 = reste\" de r0/2\n"
                + "        srl r0, r0            // r0 / 2 -> r0\n"
                + "        div r0, r1, r2        // quotient = r0 / r1 -> r2, reste' = r0 % r1 -> r0\n"
                + "        shl r0, r0            // r0 = 2 * reste'\n"
                + "        add r0, r4, r0        // r0 = reste = 2 * reste' + reste\" => r0 = chiffre\n"
                + "        shl r1, r1            // r1 = b\n" + "\n"
                + "        adq -10, r0           // chiffre - 10 -> r0 \n"
                + "        bge LETTER-$-2        // saute en LETTER si chiffre >= 10\n"
                + "        adq 10+ASCII_0, r0    // ajoute 10 => r0 = chiffre, ajoute code ASCII de 0 \n"
                + "                              // => r0 = code ASCII de chiffre\n"
                + "        bmp STKCHR-$-2        // saute en STKCHR \n" + "\n"
                + "LETTER  adq ASCII_A, r0       // r0 = ASCII(A) pour chiffre = 10, ASCII(B) pour 11 ...\n"
                + "                              // ajoute code ASCII de A => r = code ASCII de chiffre\n"
                + "STKCHR  stw r0, -(sp)         // empile code ASCII du chiffre \n"
                + "                              // (sur un mot complet pour pas désaligner pile)\n"
                + "        tst r2                // charge les indicateurs en fonction du quotient ds r2)\n"
                + "        bne CNVLOOP-$-2       // boucle si quotient non nul; sinon sort\n" + "\n"
                + "// les caractères sont maintenant empilés : gauche en haut et droit en bas\n" + "\n"
                + "// recopie les caractères dans le tampon dans le bon ordre: de gauche à droite\n"
                + "        ldw r1, (bp)ITOA_P    // r1 pointe sur le début du tampon déjà alloué \n"
                + "        stb r3, (r1)+         // copie le signe dans le tampon\n"
                + "CPYLOOP ldw r0, (sp)+         // dépile code du chiffre gauche (sur un mot) dans r0\n"
                + "        stb r0, (r1)+         // copie code du chiffre dans un Byte du tampon de gauche à droite\n"
                + "        cmp sp, bp            // compare sp et sa valeur avant empilement des caractères qui était bp\n"
                + "        bne CPYLOOP-$-2       // boucle s'il reste au moins un chiffre sur la pile\n"
                + "        ldq NUL, r0           // charge le code du caractère NUL dans r0\n"
                + "        stb r0, (r1)+         // sauve code NUL pour terminer la chaîne de caractères\n" + "\n"
                + "// termine\n" + "        ldw r0, (bp)ITOA_P    // retourne le pointeur sur la chaîne de caractères\n"
                + "\n" + "    // UNLINK: fermeture de l'environnement de la fonction itoa\n"
                + "        ldw sp, bp            // sp <- bp : abandonne infos locales; sp pointe sur ancinne valeur de bp\n"
                + "        ldw bp, (sp)+         // dépile ancienne valeur de bp dans bp; sp pointe sur adresse de retour\n"
                + "\n" + "        rts                   // retourne au programme appelant\n" + "\n"
                + "//-----------------------------------------------------------------------------------------------------\n"
                + "\n" + "// void print(char* p)     // imprime le texte pointé par paramètre p\n" + "\n"
                + "// prépare l'environnement de la fonction appelée (prologue) :\n" + "\n"
                + "print_     LDQ 0, R1      // R1 = taille données locales (ici 0) de fonction appelée\n" + "\n"
                + "     // LINK R1        // crée et lie l'environnement de fonction appelée\n"
                + "           STW BP, -(SP)  // empile le contenu du registre BP\n"
                + "           LDW BP, SP     // charge contenu SP ds BP qui pointe sur sa sauvegarde\n"
                + "           SUB SP, R1, SP // réserve R1 octets sur la pile pour la variable locale z\n" + "\n"
                + "// charge R0 avec le paramètre p de déplacement 4\n"
                + "           LDW R0, (BP)4  // R0 = M[BP + 4]\n" + "\n" + "// affiche texte pointé par R0\n"
                + "           TRP #WRITE_EXC // lance trappe n° WRITE_EXC: affiche texte d'adresse R0\n" + "\n"
                + "// fin de la fonction (épilogue) :\n" + "\n" + "    // UNLINK \n"
                + "           LDW SP, BP    // charge SP avec contenu de BP: abandon infos locales\n"
                + "           LDW BP, (SP)+ // dépile ancien BP dans BP\n" + "\n"
                + "           RTS  // retour au programme appelant\n";
    }

    public void end() {
        this.towrite[0] += "\n// fermeture du bloc englobant de main\n"
                + "        ldw sp, bp        // abandonne variables locales de main\n"
                + "        ldw bp, (sp)+     // dépile ancien bp dans bp\n"
                + "        trp #EXIT_EXC     // lance trappe EXIT\n"
                + "        jea @main_        // revient au début du main \n"
                + "                          // si on relance la simulation après EXIT\n";
    }

    public void newEnvironment(String alias, int numenv) {
        this.towrite[numenv] += "\n " + alias;
        this.towrite[numenv] += "\n// LINK crée environnement du main pour permettre des variables locales \n"
                + "// mais sans encore les réserver     \n" + "        stw bp, -(sp)\n" + "        ldw bp, sp\n\n";
    }

    public void callFunction(String alias, int tailleArguments, int numenv) {
        this.towrite[numenv] += "        jsr @" + alias + "         // appelle fonction " + alias + "\n" + "\n"
                + "        adi sp, sp, #" + tailleArguments + "      // nettoie la pile des paramètres\n"
                + "                            // de taille totale " + tailleArguments + " octets\n";
    }

    public void endEvironment(int numenv) {
        this.towrite[numenv] += "// fin de la fonction (épilogue) :\n" + "\n" + "    // UNLINK \n"
                + "           LDW SP, BP    // charge SP avec contenu de BP: abandon infos locales\n"
                + "           LDW BP, (SP)+ // dépile ancien BP dans BP\n" + "\n"
                + "           RTS  // retour au programme appelant\n"
                + "\n//----------------------------------------------------------------------------------------------------\n";
    }

    public void sautSP(int taille, int numenv) {
        this.towrite[numenv] += "        adi sp, sp, #-" + taille
                + "    // reserve la place pour les paramètres d'une fonction\n"
                + "                          // de taille totale " + taille + " octets\n";
    }

    public void functionBlock() {
        this.towrite[0] += "\n//===================================== BLOCK DE FONCTION ===================================\n\n";
       // System.out.println("Nombre de blocvk : " + this.numberofBlock);

        for (int i = 1; i < this.numberofBlock; i++) {
            this.towrite[0] += this.towrite[i];
            this.towrite[0] += "\n";
        }
    }

    public void generate() {
        try (FileWriter writer = new FileWriter(this.filename); BufferedWriter bw = new BufferedWriter(writer)) {
            this.towrite[numberofBlock] += this.towrite[0];
            // for (String var : this.towrite) {
            bw.write(this.towrite[numberofBlock]); // ecrit chaque env dans l'ordre
            // }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public int remonteStatique(int nbchainage, int deplacement, int numenv) { // revoie le registre dans lequel est
                                                                              // stocké l'adresse de la variabla

        int reg_used1 = this.registre.getFirstFree();
        int reg_used2 = this.registre.getFirstFree();

        if (nbchainage == 0) {

            this.towrite[numenv] += "adi BP, R" + reg_used2 + ", #" + deplacement
                    + "   // stoque l'adresse de la variable dans R" + reg_used2 + "\n";

        } else {

            this.towrite[numenv] += "LDW R" + reg_used2 + ", BP\n";

            for (int i = 0; i < nbchainage; i++) {
                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + reg_used2 + ")\n";
                this.towrite[numenv] += "LDW R" + reg_used2 + ", R" + reg_used1 + "\n";
            }

            this.towrite[numenv] += "adi R" + reg_used2 + ", R" + reg_used2 + ", #" + deplacement
                    + "   // stoque l'adresse de la variable dans R" + reg_used2 + "\n";

        }

        registre.freeRegistre(reg_used1);
        return reg_used2;

    }

    // AFFECTATION ///

    public void writeVariableInt(int deplacement, String valeur, int numenv) { // pas de chainage statique car
                                                                               // declaration de variable
       // System.out.println("j'ecrit" + valeur + "avec deplacement" + deplacement + "\n");
        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "adi sp, sp, #-2   // réserve place pour une variable de taille int\n";
        this.towrite[numenv] += "LDW R" + reg_used + ", #" + valeur + "\n";
        this.towrite[numenv] += "STW R" + reg_used + " , (BP)" + deplacement + "\n";
        registre.freeRegistre(reg_used);
    }

    public void writeVariableString(int deplacement, int alias, String valeur, int numenv) {
        writeVariableString(alias,valeur,numenv);
        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "adi sp, sp, #-2   // réserve place pour l'adresse de la string\n";
        this.towrite[numenv] += "LDW R" + reg_used + ", #STRING_" + alias + "_\n";
        this.towrite[numenv] += "STW R" + reg_used + " , (BP)" + deplacement + "\n";
        registre.freeRegistre(reg_used);
    }

    public void writeVariableString(int alias, String valeur, int numenv) {
        int regtmp = this.registre.getFirstFree();
        this.towrite[this.numberofBlock] += "STRING_" + alias + "_     string " + valeur
                + " // on ne sait pas où est stoqué la string d'où l'alias. sauf qu'on ne connait pas la taille de la string ...\n"
                + "             // visiblement, elle est stockée dans une sorte de tas tout en bas de l'espace mémoire disponible.\n";
        registre.freeRegistre(regtmp);
    }

    public void writeVariableString(int alias, int deplacement, String valeur, int nbchainage, int numenv) {
        writeVariableString(alias, valeur, numenv);
        int regaddr = remonteStatique(nbchainage, deplacement, numenv);
        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used + ", #STRING_" + alias + "_\n";
        this.towrite[numenv] += "STW R" + reg_used + " , (R" + regaddr + ")\n";
        registre.freeRegistre(reg_used);
        registre.freeRegistre(regaddr);
    }

    public void writeVariableInt(int deplacement, String valeur, int nbchainage, int numenv) {
        int regaddr = remonteStatique(nbchainage, deplacement, numenv);
        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used + ", #" + valeur + "\n";
        this.towrite[numenv] += "STW R" + reg_used + " , (R" + regaddr + ")\n";
        registre.freeRegistre(reg_used);
        registre.freeRegistre(regaddr);
    }

    public void returnInt(int valeur, int numenv) { // Si sp est mal géré c'est la merde, stoque dans r0
        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used + ", #" + valeur + "\n";
        this.towrite[numenv] += "STW R" + reg_used + " , -(SP)\n";
        this.towrite[numenv] += "LDW R0, (SP)\n";
        registre.freeRegistre(reg_used);

    }

    public void returnString(int alias, String valeur, int numenv) { // Si sp est mal géré c'est la merde stoque dans r0
        writeVariableString(alias, valeur, numenv);
        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used + ", #STRING_" + alias + "_\n";
        this.towrite[numenv] += "STW R" + reg_used + " , -(SP)\n";
        this.towrite[numenv] += "LDW R0, (SP)\n";
        registre.freeRegistre(reg_used);

    }

    public int callCrochetFunct(int taille, int deplacement, int nbchainage, int regcrochet, int numenv) {

        int regaddr = remonteStatique(nbchainage,deplacement,numenv);
        int load = this.registre.getFirstFree();
        int mult = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R"+load+", (R"+regcrochet+")\n"
                +"LDW R"+mult+", #"+taille+"\n"
                +"MUL R"+load+", R"+mult+", R"+load+"\n";
        this.towrite[numenv] += "ADD R"+regaddr+", R"+load+", R"+regaddr+"\n";
        registre.freeRegistre(regcrochet);
        registre.freeRegistre(load);
        registre.freeRegistre(mult);
        return regaddr;

    }

    public int callCrochetOp(int taille, int deplacement, int nbchainage, int regcrochet, int numenv) {

        int regaddr = remonteStatique(nbchainage,deplacement,numenv);
        int load = this.registre.getFirstFree();
        int mult = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R"+load+", (R"+regcrochet+")\n"
                +"LDW R"+mult+", #"+taille+"\n"
                +"MUL R"+load+", R"+mult+", R"+load+"\n";
        this.towrite[numenv] += "ADD R"+regaddr+", R"+load+", R"+regaddr+"\n";
        registre.freeRegistre(load);
        registre.freeRegistre(mult);
        registre.freeRegistre(regcrochet);
        return regaddr;

    }

    public int callCrochetVar(int taille, int deplacement1, int nbchainage1, int deplacement2, int nbchainage2, int numenv) {

        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int adr2 = remonteStatique(nbchainage2,deplacement2,numenv);
        int load = this.registre.getFirstFree();
        int mult = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R"+load+", (R"+adr2+")\n"
                +"LDW R"+mult+", #"+taille+"\n"
                +"MUL R"+load+", R"+mult+", R"+load+"\n";
        this.towrite[numenv] += "ADD R"+adr1+", R"+load+", R"+adr1+"\n";
        registre.freeRegistre(adr2);
        registre.freeRegistre(load);
        registre.freeRegistre(mult);
        return adr1;

    }

    public void copyValue(int deplacementdest, int nbchainagedest, int deplacementsource, int nbchainagesource,
            int numenv) {

       // System.out.println("je paaaaaaaaaaaasssssssssssse par copyvalue");
        int regaddrsource = remonteStatique(nbchainagesource, deplacementsource, numenv);
        int regaddrdest = remonteStatique(nbchainagedest, deplacementdest, numenv);
        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used + ", (R" + regaddrsource + ")\n";
        this.towrite[numenv] += "STW R" + reg_used + ", (R" + regaddrdest + ")\n";
        registre.freeRegistre(reg_used);
        registre.freeRegistre(regaddrdest);
        registre.freeRegistre(regaddrsource);

    }

    public void copyfromRegistre(int deplacementdest, int nbchainagedest, int registresource, int numenv) {
        int regaddr = remonteStatique(nbchainagedest, deplacementdest, numenv);
        this.towrite[numenv] += "STW R" + registresource + ", (R" + regaddr + ")\n";
        registre.freeRegistre(registresource);
        registre.freeRegistre(regaddr);
    }

    public void copyfromRegistre(int registresource, int numenv) {
        this.towrite[numenv] += "STW R" + registresource + ", -(SP)" + "\n";
        registre.freeRegistre(registresource);

    }

    public void copyfromRegistreArg(int registresource, int deplacement, int numenv) {
        this.towrite[numenv] += "STW R" + registresource + ", (SP)" + deplacement + "\n";
        registre.freeRegistre(registresource);

    }

    public void copytoRegistre(int registredest, int deplacementsource, int nbchainagesource, int numenv) {
        int regaddr = remonteStatique(nbchainagesource, deplacementsource, numenv);
        this.towrite[numenv] += "LDW R" + registredest + ", (R" + regaddr + ")\n";
        registre.freeRegistre(regaddr);
    }

    public void copytoRegistreAddr(int registredest, int deplacementsource, int numchainagesource, int numenv) {
        int adr = remonteStatique(numchainagesource,deplacementsource,numenv);
        this.towrite[numenv] += "LDW R" + registredest + ", R" + adr + "\n";
        registre.freeRegistre(adr);
    }

    public void copytoRegistre(int registredest, int valeur, int numenv) {
        this.towrite[numenv] += "LDW R" + registredest + ", #" + valeur + "\n";
    }

    public void copytoRegistreString(int registredest, int alias, int numenv) {
        this.towrite[numenv] += "LDW R" + registredest + ", #STRING_" + alias + "_\n";
    }

    public void copyAnything(int deplacementDestination, int nbChainageDestination, int deplacementSource,
            int nbChainageSource, int taille, int numenv) {
        int regaddrdest = remonteStatique(nbChainageDestination, deplacementDestination, numenv);
        int regaddrsource = remonteStatique(nbChainageSource, deplacementSource, numenv);
        int reg_used1 = this.registre.getFirstFree();
        int dSourceTmp = deplacementSource;
        int dDestinationTmp = deplacementDestination;

        for (int i = 0; i < taille / 2; i++) {

            if (i == 0) {

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regaddrsource + ")\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (R" + regaddrdest + ")\n";

            } else {

                dSourceTmp += 2;
                dDestinationTmp += 2;

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regaddrsource + ")" + dSourceTmp + "\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (R" + regaddrdest + ")" + dDestinationTmp + "\n";

            }
        }

        registre.freeRegistre(reg_used1);
        registre.freeRegistre(regaddrdest);
        registre.freeRegistre(regaddrsource);
    }

    public void copyArg(int deplacementDestination, int deplacementSource, int nbChainageSource, int taille,
            int numenv) { // destination depuis sp
        int regaddrsource = remonteStatique(nbChainageSource, deplacementSource, numenv);
        int reg_used1 = this.registre.getFirstFree();
        int dSourceTmp = deplacementSource;
        int dDestinationTmp = deplacementDestination;

        for (int i = 0; i < taille / 2; i++) {

            if (i == 0) {

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regaddrsource + ")\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (SP)" + deplacementDestination + "\n";

            } else {

                dSourceTmp += 2;
                dDestinationTmp += 2;

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regaddrsource + ")" + dSourceTmp + "\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (SP)" + dDestinationTmp + "\n";

            }
        }

        registre.freeRegistre(reg_used1);
        registre.freeRegistre(regaddrsource);
    }

    public void copyFromRegAddr(int regSource, int deplacementDestination, int nbChainageDestination, int taille,
            int numenv) {
        int regaddrdest = remonteStatique(nbChainageDestination, deplacementDestination, numenv);
        int reg_used1 = this.registre.getFirstFree();
        int dSourceTmp = 0;
        int dDestinationTmp = deplacementDestination;

        for (int i = 0; i < taille / 2; i++) {

            if (i == 0) {

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regSource + ")\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (R" + regaddrdest + ")\n";

            } else {

                dSourceTmp += 2;
                dDestinationTmp += 2;

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regSource + ")" + dSourceTmp + "\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (R" + regaddrdest + ")" + dDestinationTmp + "\n";

            }
        }

        registre.freeRegistre(reg_used1);
        registre.freeRegistre(regaddrdest);
    }

    public void copyFromRegAddrArg(int regSource, int deplacement, int taille, int numenv) { // destination depuis sp
        int reg_used1 = this.registre.getFirstFree();
        int dSourceTmp = 0;
        int dDestinationTmp = deplacement;

        for (int i = 0; i < taille / 2; i++) {

            if (i == 0) {

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regSource + ")\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (SP)" + deplacement + "\n";

            } else {

                dSourceTmp += 2;
                dDestinationTmp += 2;

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regSource + ")" + dSourceTmp + "\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (SP)" + dDestinationTmp + "\n";

            }
        }

        registre.freeRegistre(reg_used1);
    }

    public void copyToRegAddrString(int alias, int regDestAddr, String value, int numenv) {
        writeVariableString(alias,value,numenv);
        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used + ", #STRING_" + alias + "_\n";
        this.towrite[numenv] += "STW R" + reg_used + " , (R" + regDestAddr + ")\n";
        registre.freeRegistre(reg_used);
        registre.freeRegistre(regDestAddr);

    }

    public void copyToRegAddrInt(int regDestAddr, String value, int numenv) {

        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used + ", #" + value + "\n";
        this.towrite[numenv] += "STW R" + reg_used + " , (R" + regDestAddr + ")\n";
        registre.freeRegistre(reg_used);
        registre.freeRegistre(regDestAddr);

    }

    public void copyToRegAddr(int regDestAddr, int regSource, int numenv) { //Aussi taille 2

        int reg_used = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used + ", R" + regSource+ "\n";
        this.towrite[numenv] += "STW R" + reg_used + " , (R" + regDestAddr + ")\n";
        registre.freeRegistre(reg_used);
        registre.freeRegistre(regDestAddr);

    }

    public void copyToRegAddrFromRegAddr(int regDestAddr, int regSourceAddr,int taille, int numenv) {

        int reg_used1 = this.registre.getFirstFree();
        int dSourceTmp = 0;
        int dDestinationTmp = 0;

        for (int i = 0; i < taille / 2; i++) {

            if (i == 0) {

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regSourceAddr + ")\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (R" + regDestAddr + ")\n";

            } else {

                dSourceTmp += 2;
                dDestinationTmp += 2;

                this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + regSourceAddr + ")" + dSourceTmp + "\n";
                this.towrite[numenv] += "STW R" + reg_used1 + ", (R" + regDestAddr + ")" + dDestinationTmp + "\n";

            }
        }

        registre.freeRegistre(reg_used1);
        registre.freeRegistre(regDestAddr);
        registre.freeRegistre(regSourceAddr);

    }

    public void print(int numenv) { // mettre les parametre nécessaire /!\ utilise R0

        this.towrite[numenv] += "        \n"
                + "        jsr @print_         // appelle fonction print d'adresse print_\n" + "\n"
                + "        adi sp, sp, #2      // nettoie la pile des paramètres\n"
                + "                            // de taille totale 2 octets\n";
    }

    public void printi(int numenv) { // mettre les parametre nécessaire /!\ utilise registre ET R0
        // ecrire le code lié au print

        this.towrite[numenv] += "        \n"
                + "        jsr @printi_         // appelle fonction printi d'adresse printi_\n" + "\n"
                + "        adi sp, sp, #2      // nettoie la pile des paramètres\n"
                + "                            // de taille totale 2 octets\n";

    }

    // OPERATIONS///

    /// Addition /////

    // addition deux variables
    public int addition(int deplacement1, int nbchainage1, int deplacement2, int nbchainage2, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int adr2 = remonteStatique(nbchainage2,deplacement2,numenv);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", (BP)" + deplacement2 + "\n";
        registre.freeRegistre(adr2);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "ADD R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // addition d'une variable et constante
    public int addition(int deplacement1, int nbchainage1, String valeur1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" +valeur1+ "\n";
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "ADD R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // addition de deux constantes
    public int addition(String valeur1, String valeur2, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int reg_used2 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" + valeur2 + "\n";
        this.towrite[numenv] += "ADD R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // addition d'un registre et une constante
    public int addition(int numreg_stock, String valeur1, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "ADD R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    // addition d'un registre et une variable
    public int addition(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "ADD R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    public int additionAddr(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {
        
        int reg_used1 = this.registre.getFirstFree();

        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "ADD R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    // addition deux register
    public int addition(int numreg_stock1, int numreg_stock2, int numenv) {
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "ADD R" + numreg_stock1 + ", R" + numreg_stock2 + ", R" + numreg + "\n";
        registre.freeRegistre(numreg_stock1);
        registre.freeRegistre(numreg_stock2);
        return numreg;
    }

    /// Soustraction

    // soustraction de deux variables
    public int soustraction(int deplacement1, int nbchainage1, int deplacement2, int nbchainage2, int numenv) {
        int adr1 = remonteStatique(nbchainage1, deplacement1, numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int adr2 = remonteStatique(nbchainage2, deplacement2, numenv);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", (BP)" + deplacement2 + "\n";
        registre.freeRegistre(adr2);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "SUB R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // soustraction d'une variable et constante
    public int soustraction(int deplacement1, int nbchainage1, String valeur1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" +valeur1+ "\n";
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "SUB R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // soustraction de deux constantes
    public int soustraction(String valeur1, String valeur2, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int reg_used2 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" + valeur2 + "\n";
        this.towrite[numenv] += "SUB R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // soustraction d'un registre et une constante
    public int soustraction(int numreg_stock, String valeur1, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "SUB R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    // soustraction d'un registre et une variable
    public int soustraction(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "SUB R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    public int soustractionAddr(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {
        
        int reg_used1 = this.registre.getFirstFree();

        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "SUB R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    // soustraction deux register
    public int soustraction(int numreg_stock1, int numreg_stock2, int numenv) {
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "SUB R" + numreg_stock1 + ", R" + numreg_stock2 + ", R" + numreg + "\n";
        registre.freeRegistre(numreg_stock1);
        registre.freeRegistre(numreg_stock2);
        return numreg;
    }

    // Moins unaire

    // variable
    public int moins_unaire(int deplacement1, int nbchainage1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "NEG R" + reg_used1 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        return numreg;
    }

    // constante
    public int moins_unaire(String valeur1, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "NEG R" + reg_used1 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        return numreg;
    }

    // registre
    public int moins_unaire(int numreg_stock, int numenv) {
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "NEG R" + numreg_stock + ", R" + numreg + "\n";
        return numreg;
    }

    // Multiplication//

    // multiication deux variables
    public int multiplication(int deplacement1, int nbchainage1, int deplacement2, int nbchainage2, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int adr2 = remonteStatique(nbchainage2,deplacement2,numenv);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", (R" + adr2 + ")\n";
        registre.freeRegistre(adr2);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "MUL R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // multiplication d'une variable et constante
    public int multiplication(int deplacement1, int nbchainage1, String valeur1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" + valeur1 + "\n";
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "MUL R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // multiication de deux constantes
    public int multiplication(String valeur1, String valeur2, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int reg_used2 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" + valeur2 + "\n";
        this.towrite[numenv] += "MUL R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // multiication d'un registre et une constante
    public int multiplication(int numreg_stock, String valeur1, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "MUL R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    // multiplication d'un registre et une variable
    public int multiplication(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "MUL R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    public int multiplicationAddr(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {
        
        int reg_used1 = this.registre.getFirstFree();
  
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "MUL R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    // multiplication deux register
    public int multiplication(int numreg_stock1, int numreg_stock2, int numenv) {
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "MUL R" + numreg_stock1 + ", R" + numreg_stock2 + ", R" + numreg + "\n";
        registre.freeRegistre(numreg_stock1);
        registre.freeRegistre(numreg_stock2);
        return numreg;
    }

    // Division //
    // division deux variables
    public int division(int deplacement1, int nbchainage1, int deplacement2, int nbchainage2, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int adr2 = remonteStatique(nbchainage2,deplacement2,numenv);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", (R" + adr2 + ")\n";
        registre.freeRegistre(adr2);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "DIV R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // multiplication d'une variable et constante
    public int division(int deplacement1, int nbchainage1, String valeur1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" + valeur1 + "\n";
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "DIV R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    

    // multiication de deux constantes
    public int division(String valeur1, String valeur2, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int reg_used2 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" + valeur2 + "\n";
        this.towrite[numenv] += "DIV R" + reg_used1 + ", R" + reg_used2 + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
        return numreg;
    }

    // multiication d'un registre et une constante
    public int division(int numreg_stock, String valeur1, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "DIV R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    // multiplication d'un registre et une variable
    public int division(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "DIV R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    public int divisionAddr(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {

        int reg_used1 = this.registre.getFirstFree();
       // this.towrite[numenv] += "LDW R" + reg_used1 + ", R" + numreg_stock + "\n";
       // registre.freeRegistre(numreg_stock);
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "DIV R" + reg_used1 + ", R" + numreg_stock + ", R" + numreg + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
        return numreg;
    }

    // multiplication deux register
    public int division(int numreg_stock1, int numreg_stock2, int numenv) {
        int numreg = this.registre.getFirstFree();
        this.towrite[numenv] += "DIV R" + numreg_stock1 + ", R" + numreg_stock2 + ", R" + numreg + "\n";
        registre.freeRegistre(numreg_stock1);
        registre.freeRegistre(numreg_stock2);
        return numreg;
    }

    // COMPARAISONS//

    // comparaison deux valeurs
    public void compare(String valeur1, String valeur2, int numenv) {
        int numreg_stock1 = this.registre.getFirstFree();
        int numreg_stock2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + numreg_stock1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock2 + ", #" + valeur2 + "\n";
        this.towrite[numenv] += "CMP R" + numreg_stock1 + ", R" + numreg_stock2 + "\n";

        registre.freeRegistre(numreg_stock1);
        registre.freeRegistre(numreg_stock2);
    }

    // comparaison deux varibales
    public void compare(int deplacement1, int nbchainage1, int deplacement2, int nbchainage2, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int adr2 = remonteStatique(nbchainage2,deplacement2,numenv);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", (R" + adr2 + ")\n";
        registre.freeRegistre(adr2);
        this.towrite[numenv] += "CMP R" + reg_used1 + ", R" + reg_used2 + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
    }

    // comparaison valeur varuable
    public void compare(int deplacement1, int nbchainage1, String valeur1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int reg_used2 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "CMP R" + reg_used1 + ", R" + reg_used2 + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);
    }

    // comparaison registre registre
    public void compare(int numreg_stock1, int numreg_stock2, int numenv) {
        this.towrite[numenv] += "CMP R" + numreg_stock1 + ", R" + numreg_stock2 + "\n";
        registre.freeRegistre(numreg_stock1);
        registre.freeRegistre(numreg_stock2);
    }

    // comparaison register et variable
    public void compare(int numreg_stock, int deplacement1, int nbchainage1, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        this.towrite[numenv] += "CMP R" + reg_used1 + ", R" + numreg_stock + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
    }

    // comparaison register constante
    public void compare(int numreg_stock, String valeur1, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #" + valeur1 + "\n";
        this.towrite[numenv] += "CMP R" + reg_used1 + ", R" + numreg_stock + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
    }

    // saut vers if si cond egal vérifié
    public int equal(int numenv) {
        int numreg_stock = this.registre.getFirstFree();
        this.towrite[numenv] += "BEQ 6" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #0" + "\n";
        this.towrite[numenv] += "BMP 2" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #1" + "\n";
        return (numreg_stock);

    }

    // inférieur ou égal
    public int inf_equal(int numenv) {
        int numreg_stock = this.registre.getFirstFree();
        this.towrite[numenv] += "BLE 6" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #0" + "\n";
        this.towrite[numenv] += "BMP 2" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #1" + "\n";
        return (numreg_stock);
    }

    // supérieur ou égal
    public int sup_equal(int numenv) {
        int numreg_stock = this.registre.getFirstFree();
        this.towrite[numenv] += "BGE 6" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #0" + "\n";
        this.towrite[numenv] += "BMP 2" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #1" + "\n";
        return (numreg_stock);
    }

    // inférieur strictement
    public int inf(int numenv) {
        int numreg_stock = this.registre.getFirstFree();
        this.towrite[numenv] += "BLW 6" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #0" + "\n";
        this.towrite[numenv] += "BMP 2" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #1" + "\n";
        return (numreg_stock);
    }

    // sup strictement
    public int sup(int numenv) {
        int numreg_stock = this.registre.getFirstFree();
        this.towrite[numenv] += "BGT 6" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #0" + "\n";
        this.towrite[numenv] += "BMP 2" + "\n";
        this.towrite[numenv] += "LDW R" + numreg_stock + ", #1" + "\n";
        return (numreg_stock);
    }

    public int andd(int numreg_stock1, int numreg_stock2, int numenv) {
        this.towrite[numenv] += "AND R" + numreg_stock1 + ", R" + numreg_stock2 + ", R" + numreg_stock1 + "\n";
        registre.freeRegistre(numreg_stock2);
        return (numreg_stock1);
    }

    public int orr(int numreg_stock1, int numreg_stock2, int numenv) {
        this.towrite[numenv] += "OR R" + numreg_stock1 + ", R" + numreg_stock2 + ", R" + numreg_stock1 + "\n";
        registre.freeRegistre(numreg_stock2);
        return (numreg_stock1);
    }

    // IF//
    // écrire alias else
    public void else_(int alias, int numenv) {
        this.towrite[numenv] += "ELSE_" + alias + "                \n  ";
    }

    // écrire alias end
    public void end_(int alias, int numenv) {
        this.towrite[numenv] += "ENDIF_" + alias + "               \n ";
    }

    // écrire if
    public void if_(int alias, int numenv) {
        this.towrite[numenv] += "IF_" + alias + "               \n  ";
    }

    public void if_else_vrai(int numreg_stock, int alias, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #1" + "\n";
        this.towrite[numenv] += "CMP R" + numreg_stock + ", R" + reg_used1 + "\n";
        this.towrite[numenv] += "BEQ IF_" + alias + "-$-2" + "\n";
        this.towrite[numenv] += "BMP ELSE_" + alias + "-$-2" + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);

    }

    public void if_end_vrai(int numreg_stock, int alias, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #1" + "\n";
        this.towrite[numenv] += "CMP R" + numreg_stock + ", R" + reg_used1 + "\n";
        this.towrite[numenv] += "BEQ IF_" + alias + "-$-2" + "\n";
        this.towrite[numenv] += "BMP ENDIF_" + alias + "-$-2" + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);

    }

    // saut vers if si cond egal vérifié
    public void if_equal(int alias, int numenv) {
        this.towrite[numenv] += "BEQ IF_" + alias + "-$-2" + "\n";
    }

    // saut à else sans condition
    public void if_else(int alias, int numenv) {
        this.towrite[numenv] += "BMP ELSE_" + alias + "-$-2" + "\n";
    }

    // saut end sans condition
    public void if_end(int alias, int numenv) {
        this.towrite[numenv] += "BMP ENDIF_" + alias + "-$-2" + "\n";
    }

    // inférieur ou égal
    public void if_else_inf_equal(int alias, int numenv) {
        this.towrite[numenv] += "BLE IF_" + alias + "-$-2" + "\n";
    }

    // supérieur ou égal
    public void if_else_sup_equal(int alias, int numenv) {
        this.towrite[numenv] += "BGE IF_" + alias + "-$-2" + "\n";
    }

    // inférieur strictement
    public void if_else_inf(int alias, int numenv) {
        this.towrite[numenv] += "BLW IF_" + alias + "-$-2" + "\n";
    }

    // sup strictement
    public void if_else_sup(int alias, int numenv) {
        this.towrite[numenv] += "BGT IF_" + alias + "-$-2" + "\n";
    }

    public void while_(int alias, int numenv) {
        this.towrite[numenv] += "loop_" + alias + "           \n ";

    }

    public void fin_while(int alias, int numenv) {
        this.towrite[numenv] += "BMP loop_" + alias + "-$-2" + "\n";
        this.towrite[numenv] += "endloop_" + alias + "            \n";
    }

    public void while_cond(int numreg_stock, int alias, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #1" + "\n";
        this.towrite[numenv] += "CMP R" + numreg_stock + ", R" + reg_used1 + "\n";
        this.towrite[numenv] += "BEQ 2" + "\n";
        this.towrite[numenv] += "BMP endloop_" + alias + "-$-2" + "\n";
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(numreg_stock);
    }

    public void breakk(int alias, int numenv) {
        this.towrite[numenv] += "BMP endloop_" + alias + "-$-2" + "\n";
    }

    //////////////////////////// FOR//////////////////////////

    public void for_(int alias, int deplacement1, int nbchainage1, String bornesup, int numenv) {
        
        int reg_used1 = this.registre.getFirstFree();
        int reg_used2 = this.registre.getFirstFree();

        this.towrite[numenv] += "loopfor_" + alias + "          \n ";
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #1" + "\n";
        this.towrite[numenv] += "ADD R" + reg_used1 + ", R" + reg_used2 + ", R" + reg_used1 + "\n";
        this.towrite[numenv] += "STW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        int numreg_stock1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + numreg_stock1 + ", #" + bornesup + "\n";
        this.towrite[numenv] += "CMP R" + reg_used1 + ", R" + numreg_stock1 + "\n";
        registre.freeRegistre(numreg_stock1);
        registre.freeRegistre(reg_used1);
        this.towrite[numenv] += "BLE 6" + "\n";
        int reg_used3 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used3 + ", #0" + "\n";
        this.towrite[numenv] += "BMP 2" + "\n";
        this.towrite[numenv] += "LDW R" + reg_used3 + ", #1" + "\n";
        this.towrite[numenv] += "CMP R" + reg_used3 + ", R" + reg_used2 + "\n";
        registre.freeRegistre(reg_used3);
        this.towrite[numenv] += "BEQ 2" + "\n";
        this.towrite[numenv] += "BMP endloopfor_" + alias + "-$-2" + "\n";
        int reg_used4 = this.registre.getFirstFree();
        int adr2 = remonteStatique(nbchainage1,deplacement1,numenv);
        this.towrite[numenv] += "LDW R" + reg_used4 + ", (R" + adr2 + ")\n";
        this.towrite[numenv] += "SUB R" + reg_used4 + ", R" + reg_used2 + ", R" + reg_used4 + "\n";
        this.towrite[numenv] += "STW R" + reg_used4 + ", (R" + adr2 + ")\n";
        registre.freeRegistre(adr2);

        
        registre.freeRegistre(reg_used4);
        registre.freeRegistre(reg_used2);

    }

    public void fin_for(int deplacement1,int nbchainage1, int alias, int numenv) {
        int adr1 = remonteStatique(nbchainage1,deplacement1,numenv);
        int reg_used1 = this.registre.getFirstFree();
        int reg_used2 = this.registre.getFirstFree();

        this.towrite[numenv] += "LDW R" + reg_used1 + ", (R" + adr1 + ")\n";
        this.towrite[numenv] += "LDW R" + reg_used2 + ", #1" + "\n";
        this.towrite[numenv] += "ADD R" + reg_used1 + ", R" + reg_used2 + ", R" + reg_used1 + "\n";
        this.towrite[numenv] += "STW R" + reg_used1 + ", (R" + adr1 + ")\n";
        registre.freeRegistre(adr1);
        this.towrite[numenv] += "BMP loopfor_" + alias + "-$-2" + "\n";
        this.towrite[numenv] += "endloopfor_" + alias + "          \n  ";
        
        registre.freeRegistre(reg_used1);
        registre.freeRegistre(reg_used2);

    }

    public void for_cond(int numreg_stock, int alias, int numenv) {
        int reg_used1 = this.registre.getFirstFree();
        this.towrite[numenv] += "LDW R" + reg_used1 + ", #1" + "\n";
        this.towrite[numenv] += "CMP R" + numreg_stock + ", R" + reg_used1 + "\n";
        this.towrite[numenv] += "BEQ 2" + "\n";
        this.towrite[numenv] += "BMP endloopfor_" + alias + "-$-2" + "\n";
        registre.freeRegistre(reg_used1);
    }

}