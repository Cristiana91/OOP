package string;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String propozitie = scanner.nextLine();
        int endIndex = propozitie.lastIndexOf('.');
        int startIndex = propozitie.lastIndexOf(" ") + 1;
        String cuvant = propozitie.substring(startIndex, endIndex);
        System.out.println("Ultimul cuvant este:" + cuvant);

        String[] cuvinte = propozitie.split(" ");
        for (String cuv : cuvinte){
            if (cuv.contains(".")){
                cuv = cuv.replace(".", " ");
            }
            System.out.println(cuv);
        }
    }
}
