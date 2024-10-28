package com.sio;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici

                    System.out.println("Entrer un nombre svp: ");
                    int nombreSvp = scanner.nextInt();
                    System.out.println("Entrer une puissance svp: ");
                    int puissanceSvp = scanner.nextInt();
                    if (puissanceSvp >0);
                    System.out.println("La puissance doit être supérieur ou égal à 0");
                    System.out.println("Entrer une puissance svp: ");
                    int puissanceSvp2 = scanner.nextInt();
                    double resultat = Math.pow(nombreSvp, puissanceSvp);
                    System.out.println("Le résultat est " + resultat);

                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    //Exercice 2 : Entrer votre code ici


                    System.out.println("Entrer le nombre de kilomètres parcourues par le client svp: ");
                    int nombreKm1 = scanner.nextInt();
                    if (nombreKm1 <0) ;
                    System.out.println("Le kilomètes doit être supérieur ou égale à 0" );

                    System.out.println("Entrer le nombre de kilomètres parcourues par le client svp: ");

                     int nombreKm = scanner.nextInt();
                    if (nombreKm < 100) {
                        double prix = 0.20 * nombreKm;
                        System.out.println("Le montant à payer par le client est de :" + prix);
                    }

                    if (nombreKm > 100 && nombreKm < 500) {
                    double prix = 0.50 * nombreKm;
                    System.out.printf("Le montant à payer par le client est de :%s%n", prix);

                    }
                     if (nombreKm >500) {
                         double prix = 0.80 * nombreKm;
                        System.out.println("Le montant à payer par le client est de :" + prix);
                     }



                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    //Exercice 3 : Entrer votre code ici




                    System.out.println("---------------------------------------------");

                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");
                    //Exercice 4 : Entrer votre code ici
                    System.out.println("Entrer un nombre svp");
                    int nombreSvp2 = scanner.nextInt();

                    System.out.println("---------------------------------------------");
                    break;

                case 0:
                    System.out.println(RESET);
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}