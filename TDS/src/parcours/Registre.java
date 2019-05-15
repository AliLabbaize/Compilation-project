package parcours;

public class Registre {

    Boolean register[] = new Boolean[16]; // True = used , False = free
    Boolean attenteR0;

    public Registre() {

        for (int i = 0; i < 16; i++) {
            register[i] = false;
        }
        register[0] = true;
        register[13] = true;
        register[14] = true;
        register[15] = true;

    }

    public int getFirstFree() {
        for (int i = 0; i < 16; i++) {
            if (register[i] == false) {
                register[i] = true;

                return i;
            }

        }
        System.out.println(" !!!!!!!!!No free register !!!!!!!!!!!!!!");
        System.exit(1);
        return -1;
    }

    public void freeAllRegister() {
        for (int i = 1; i < 13; i++) {
            register[i] = false;
        }
    }

    public void freeRegistre(int num) {
        register[num] = false;
    }

    public int fillR0() {
        if (register[0]) {
            System.out.println("Register 0 is already used --> Warning");

            // System.exit(1);

        } else {
            register[0] = true;
        }

        return 0;
    }

    public void freeRo() {
        if (attenteR0) {
            System.out.println("Don't forget the previous value");
        }
        register[0] = false;
    }

}