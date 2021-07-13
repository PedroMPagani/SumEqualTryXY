package datasync.bungee;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("8001 2000 2001"); // SIM
        list.add("4003 2000 2001"); // NAO
        list.add("1000 3 7"); // SIM
        list.add("2000 1000 2001"); // SIM
        list.add("5000 1000 500"); // SIM
        list.add("5001 500 1000"); // NAO
        list.add("5002 2002 1000"); // SIM
        list.add("105000 5000 10000"); // SIM
        list.add("107500 2500 10000"); // SIM
        list.add("1050 2 3"); // SIM
        list.add("10 9 3"); // NAO
        for (String line : list) {
            String[] xT = line.split(" ");
            int number = Integer.parseInt(xT[0]);
            int n1 = Integer.parseInt(xT[1]);
            int n2 = Integer.parseInt(xT[2]);
            //for (int x = number / n1; x > 0; x--) {
                // 8001/2000, 4
                int tent = number / n1 * n1; // 999
                if (tent == number){
                    System.out.println("SIM");
                    continue;
                }
                while (true){
                    tent -= n1; // 3
                    int rest = number - tent;
                    // 1000 - 996
                    // rest is 4,
                    // rest is 7.
                    int division = rest/n2;
                    if (division > 0){
                        if (tent + n2 * division == number) {
                            tent += n2 * division;
                            System.out.println("SIM");
                        } else {
                            System.out.println("NÃO");
                        }
                        break;
                    }
                }
            //}

        }

        /**
         * 2.4  ExemplosEntrada
         * 4
         * 8001 2000 2001 -> SIM
         * 4003 2000 2001 -> NÃO
         * 1000 3 7 -> SIM
         * 2000 1000 2001  -> SIM
         * Prof. Daniel Saad Nogueira Nunes– Algoritmos e Programação de Computadores– ABI/LFI/TAISaídaSIMNAOSIMSI
         */
    }

}
