import java.util.Scanner;;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String ready;
        String nama = null;
        String chara = null;
        Karakter player = null;
        Karakter goblin = new Goblin();



        System.out.println(">>>>> Selamat Datang Di Dunia Eldoria <<<<<");
        System.out.println("Pilihan Karakter");
        System.out.println("1. Ksatria\n2. Archer\n3. Tank");
        System.out.print("Pilih karaktermu (1/2/3): ");
        pilihan = input.nextInt();

        input.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama karaktermu: ");
                nama = input.nextLine();
                player = new Ksatria(nama);
                chara = "Ksatria";
                break;
            
            case 2:
                System.out.print("Masukkan nama karaktermu: ");
                nama = input.nextLine();
                player = new Archer(nama);
                chara = "Archer";
                break;

            case 3:
                System.out.print("Masukkan nama karaktermu: ");
                nama = input.nextLine();
                player = new Tank(nama);
                chara = "Tank";
                break;
            default:
                System.out.println("Pilihan anda tidak tersedia!!");
                return;
        }

        System.out.println(">>> Kamu memilih " + chara + " <<<");
        player.statusKarakter();

        System.out.println("Ayo mulai petualangan seru di dunia Eldoria!");
        System.out.println("Selamat datang di desa Oakwood, tempat tanah para goblin dilahirkan");
        System.out.println("Kita akan melewati beberapa pasukan goblin untuk mencapai Tanah Impian yang dijanjikan");
        System.out.print("Apakah kamu siap? (Y/N):  ");
        ready = input.nextLine();

        if (ready.equalsIgnoreCase("Y")){
            System.out.println("Mari bertempur ke Tanah Impian!!");
        } else if (ready.equalsIgnoreCase("N")){
            System.out.println("Yahh sayang sekali pejuang kita berhenti :(");
            return;
        }

        System.out.println("Bersiap menghadapi serangan goblin yang pertama");

        ((Goblin) goblin).serangMusuh((Archer) player);
        player.statusDarah();
    }
}