public class Karakter {
    protected String nama;
    protected int darah;
    protected int attack;
    protected int shild;

    public Karakter(String nama, int darah, int attack, int shild) {
        this.nama = nama;
        this.darah = darah;
        this.attack = attack;
        this.shild = shild;
    }

    public void statusKarakter() {
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Darah \t\t: " + darah);
        System.out.println("Kekuatan \t: " + attack);
    }

    public void takeDamage(int damage) {
        darah -= damage;
        if (darah <= 0) {
            System.out.println(nama + " has been defeated!");
        } else {
            System.out.println(nama + " takes " + damage + " damage!");
        }
    }

    public void statusDarah() {
        System.out.println("Darah " + nama + " setelah diserang: " + darah);
    }
}



class Archer extends Karakter {

    public Archer(String nama) {
        super(nama, 100, 150, 0);
    }

    public void attack() {
        System.out.println(nama + " menembakkan anak panah --> " + attack + " damage!");
    }

    public void darah() {
        System.out.println(nama + " menambahkan darah --> " + darah + " health");
    }

    public void serangMusuh(Goblin musuh) {
        musuh.takeDamage(attack);
        System.out.println(nama + " menyerang " + musuh.nama + " dengan damage " + attack);
    }
}





class Ksatria extends Karakter {

    public Ksatria(String nama) {
        super(nama, 125, 130, 0);
    }

    public void attack() {
        System.out.println(nama + " melancarkan serangan --> " + attack + " damage!");
    }

    public void darah() {
        System.out.println(nama + " menambahkan darah --> " + darah + " health");
    }

    public void serangMusuh(Goblin musuh) {
        musuh.darah -= attack;
        System.out.println(nama + " menyerang " + musuh.nama + " dengan damage " + attack);
    }
}





class Tank extends Karakter {

    public Tank (String nama) {
        super(nama, 150, 100, 70);
    }

    public void attack() {
        System.out.println(nama + " melancarkan serangan --> " + attack + " damage!");
    }

    public void darah() {
        System.out.println(nama + " menambahkan darah --> " + darah + " health");
    }

    public void defend(){
        System.out.println(nama + " menahan serangan --> " + 70 + " defend!");
    }

    public void serangMusuh(Goblin musuh) {
        musuh.darah -= attack;
        System.out.println(nama + " menyerang " + musuh.nama + " dengan damage " + attack);
    }
}





class Goblin extends Karakter {

    public Goblin(){
        super("Goblin", 75, 50, 0);
    }

    public void attack(){
        System.out.println("Goblin melancarkan serangan --> " + attack + " damage");
    }

    public void darah(int amount) {
        darah += amount;
        System.out.println(nama + " menambahkan darah --> " + darah + " health");
    }

    public void serangMusuh(Archer musuh) {
        musuh.takeDamage(attack);
        System.out.println(nama + " menyerang " + musuh.nama + " dengan damage " + attack);
    }
}
