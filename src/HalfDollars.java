public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000,4_600_00,2_100_000};
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int avarage;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_000_000;

        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];

        avarage = (total[0]+total[1]+total[2])/total.length;

        System.out.print("Produkcja w 2012: ");
        System.out.printf("%,d%n ",total[0]);
        System.out.print("Produkcja w 2013: ");
        System.out.printf("%,d%n ",total[1]);
        System.out.print("Produkcja w 2014: ");
        System.out.printf("%,d%n ",total[2]);
        System.out.print("Wartość średniej produkcji: ");
        System.out.printf("%,d%n ",avarage);

    }
}
