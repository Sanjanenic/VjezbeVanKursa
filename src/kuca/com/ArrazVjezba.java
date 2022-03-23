package kuca.com;

import java.util.Arrays;

public class ArrazVjezba {

    public static void main(String[] args) {

        //ovako napraviti niz
        int[] brojevi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //isprintati jednodimenzionalni array pomocu for
        for (int i = 0; i < brojevi.length; i++) {
            System.out.print(brojevi[i] + ", ");
        }

        System.out.println("----------------------");

//nacin da se fino isprinta array, ovako mi ne treba for petlja
        System.out.println(Arrays.toString(brojevi) );



//Ispisati niz unazad
        for (int j = brojevi.length - 1; j >= 0; j--) {
            System.out.print(brojevi[j] + ", ");

        }
        System.out.println("----------------------");

 //ispisati svaki drugi element, ako je i=0 ispise 1,3,5,../ako je i=1 ispise;2,4,6....
        for (int i = 1; i < brojevi.length; i=i+2) {
                System.out.print(brojevi[i]+", ");



        }

    }
}
