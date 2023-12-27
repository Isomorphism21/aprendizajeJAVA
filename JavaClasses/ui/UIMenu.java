/* package ui;

import java.util.Scanner;

public class UIMenu {
    public static String[] MONTHS = 
    {"Enero","Febrero","Marzo","Abril","Mayo",
    "Junio","Julio","Agosto", "Septiembre", "Octubre", 
    "Noviembre", "Diciembre"};
    
    public static void showMenu(){
        int entrada = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            entrada = Integer.valueOf(sc.nextLine());

            switch (entrada) {
                case 1:
                    System.out.println("Doctor");    
                    break;
                case 2:
                    System.out.println("paciente Menu");
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thanks fou you visit");        
                default:
                    System.out.println("Please select a correct answer");
                    break;
            }
        } while (entrada != 0);
    }

    public static void showPatientMenu(){
        int entrada = 0;
        do {
            System.out.println("\n");
            System.out.println("Patient");
            System.out.println("1.Book an appoiment");
            System.out.println("2. My appoiments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            entrada = Integer.valueOf(sc.nextLine());

            switch (entrada) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i+". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    break;
            }
        } while (entrada != 0);
    }
}
 */