import java.util.Scanner;

public class Spaarbedrag {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Wat is uw spaarbedrag op dit moment? ");
        var s = new Scanner(System.in);
        var startBedrag = s.nextFloat();
        System.out.print("Wat is de huidige rente (in %)? ");
        var rente = s.nextFloat();
        System.out.print("Hoeveel jaar rente wilt u berekenen? ");
        var jaren = s.nextInt();

        System.out.println("Met een rente van "+rente+" % per jaar is uw spaargeld na "+jaren+" jaar:");
        var i = 1;
        while (i <= jaren){
            startBedrag = startBedrag*(1+(rente/100));
            System.out.format("Jaar "+i+": € "+"%.2f%n", +startBedrag);
            i++;
        }

    }
}
