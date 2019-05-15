# Ali Labbaize, Guillaume Gatti, Florian Renou, Alxandre Gigleux


<h1>Projet de Compilation</h1>

<h2>Grammaire Tiger</h2>

<p>Pour ce projet , nous devoins utiliser la grammaire Tiger avec les spécification que 
l'on peut trouver à l'adresse : <a href="./Tiger_Specification.pdf"></a></p>

<h2>Faire les tests : utilisation des scripts</h2>

<br/>
<hr/>
<h3>Compilation de la grammaire</h3>

<h4>Grammaire à utiliser</h4>

<p>Pour que la gramaire puisse être compilée et testée sans erreur, elle doitporter le nom : <strong>Expr.g</strong> </p>

<h4>Compilation par Antlr</h4>

<p><em>Sans utiliation des scripts </em> </p>

<pre><code>java -jar .\antlr-3.5.2-complete.jar .\Expr.g</code></pre>

<p><Strong>Sortie</Strong></p>
<p>Cette étape va créer 2 fichiers <strong>ExprLexer.java</strong> et <strong>ExprParser.java </strong> nécessaire pour lire les fichiers tiger en entrée</p>
<br/>
<hr/>

<h3>Lecture des fichiers Tiger en entrée</h3>

<p><em><strong>Sans utiliation des scripts </strong> </em> </p>

<p>Prérequis : grammaire compilée (paragraphe précédent) </p>
<br/>
<p>Compilation des lexer et parser, puis de la classe de test</p>
<pre><code>javac  .\src\ExprLexer.java .\src\ExprParser.java</code>
<code>javac  .\src\ExprLexer.java .\src\ExprParser.java</code>
<code>javac  .\Test_compil.java </code>
</pre>
<p>Run du test avec en entrée le fichier de test</p>
<pre><code>java Test_compil fichier_Tiger_a_tester</code>
</pre>

<p><em><strong>Avec utiliation des scripts</strong> </em> </p>

<p>Pour ce srcipt, l'étape de compilation de la grammaire présentée dans le paragraphe précédent n'est pas nécessaire 
  (déja effectuée par le script)</p>

<pre><code>.\test_compilation.ps1</code></pre>


<p><Strong>Sortie</Strong> 
<ul>
    <li>Affichage de l'AST complet en sortie console</li>
    <li>Création de tous les .class correspondant aux différentes règles (Visible dans le dossier .\src)</li>
</ul></p>

<br/>
<hr/>

<h3>Création des Table Des Symboles</h3>

<p><em><strong>Sans utiliation des scripts </strong> </em> </p>

<p>Prérequis : grammaire compilée (paragraphe précédent) </p>
<br/>
<p>Compilation des lexer et parser, puis de la classe de test</p>
<pre><code>javac  .\src\ExprLexer.java .\src\ExprParser.java</code>
<code>javac  .\src\ExprLexer.java .\src\ExprParser.java</code>
<code>javac  .\Test_TDS.java </code>
</pre>
<p>Run du test avec en entrée le fichier de test</p>
<pre><code>java Test_TDS fichier_Tiger_a_tester</code>
</pre>

<p><em><strong>Avec utiliation des scripts</strong> </em> </p>

<p>Pour ce srcipt, la compilation de la grammaire présentée dans le paragraphe précédent n'est pas nécessaire 
  (déja effectué par le script)</p>

<pre><code>.\test_TDS.ps1</code></pre>


<p><Strong>Sortie</Strong> 
<ul>
    <li>Affichage des tables des symboles en sortie console</li>
    <li>Création de tous les .class correspondant aux différentes règles (Visible dans le dossier .\src)</li>
</ul></p>

<br/>
<hr/>

<h3>Fichiers de test en entrée</h3>

<h4>Emplacement</h4>

<p>Les fichier tiger de test sont placés dans le répertoire .\test soit dans 
        <ul>
                <li>.\test\Success</li>
                <li>.\test\Fail</li>
        </ul>
</p>

<h4>Modifier les scripts</h4>

<p> Modifier les scripts pour sélectionner dans la fonction get-childitem le filtre qui selectionne
    les fichiers <strong>.Tiger</strong>
</p>

<h3>Fichiers de test en entrée</h3>

<p> Avant de push, merci de faire un clear</p>

<pre><code>.\test_clear.ps1</code></pre>


<br><hr>

<p>Pour réaliser ce doument : <a href="https://blog.wax-o.com/2014/04/tutoriel-un-guide-pour-bien-commencer-avec-markdown/"></a> </p>