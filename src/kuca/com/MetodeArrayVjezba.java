package kuca.com;

import java.util.Arrays;

public class MetodeArrayVjezba {
    public static void main(String[] args) {

        //ako je metoda void ovako se poziva. paznja!!!!ne ide = znak
        // prosljedjuje se samo ime u metodu kao parametar, nista vise
        int[] ime = new int[] {24,56,78};
        primiIspisiNiz(ime);

        // primjer 2
        // ako je metoda return onda mora imati jednako prije imena metode,
        // return uvijek vraca u varijablu (mora biti istog tipa)
        int [] ime2 = getNiz();
        primiIspisiNiz(ime2);

        // primjer 3
        primiIspisiNiz(getNiz());
    }


    public static void primiIspisiNiz(int[]niz){

        for(int i =0; i<niz.length;i++){
            System.out.print(niz[i] + ", ");
        }

        System.out.println();
    }

    public static int[] getNiz() {
        int [] niz = new int[] {24,56,78};
        return niz;
    }

    public static int[] okreniNiz(int[] niz) {
        int [] okrenut = new int[niz.length];

        for(int i=0,j=niz.length-1; i<niz.length; i++, j--) {
            okrenut[j]=niz[i];
        }

        return okrenut;
    }
}
