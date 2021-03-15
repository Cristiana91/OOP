package string;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cuvant = scanner.nextLine();

        String cuvantCuLitereMici = cuvant.toLowerCase();
        System.out.println(cuvantCuLitereMici);

        String cuvantCuLitereMari = cuvant.toUpperCase();
        System.out.println(cuvantCuLitereMari);

        String cuvantCuSpatiu = cuvant.trim();
        System.out.println(cuvantCuSpatiu);

        String cuvantCuReplace = cuvant.replace('c', 'a');
        System.out.println(cuvantCuReplace);

        String cuvantCuReplaceSir = cuvant.replace("alo", "eu");
        System.out.println(cuvantCuReplaceSir);

        int index = cuvant.indexOf('a');
        String substring = cuvant.substring(2, 4);
        System.out.println(substring);
        System.out.println(index);
    }
}
