import java.util.Scanner;

public class zodyak {
    public static void main(String[] args) {
        int maymun,horoz,kopek,domuz,fare,okuz,kaplan,tavsan,ejderha,yilan,at,koyun;
        int yil,artan;
        Scanner in =new Scanner(System.in);

        System.out.print("Dogum Yilini Gir :");
        yil = in.nextInt();

        artan = yil%12;

        switch (artan) {
            case 0:
                System.out.print("Maymun");
                break;
            case 1:
                System.out.print("Horoz");
                break;
            case 2:
                System.out.print("KOpek");
                break;
            case 3:
                System.out.print("Domuz");
                break;
            case 4:
                System.out.print("Fare");
                break;
            case 5:
                System.out.print("Okuz");
                break;

            case 6:
                System.out.print("Kaplan");
                break;
            case 7:
                System.out.print("Tavsan");
                break;
            case 8:
                System.out.print("Ejderha");
                break;
            case 9:
                System.out.print("Yilan");
                break;
            case 10:
                System.out.print("At");
                break;
            case 11:
                System.out.print("Koyun");
                break;
        }













    }
}
