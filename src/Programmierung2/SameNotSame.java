package Programmierung2;

public class SameNotSame {
    public static void main(String[] args) {
        //zelimo provjeriti koja je klasa objekat
        //mozemo na 2 nacina:
        //ako je moguce koristi poloymorphisen -> base class

        //situacija 1: check if object of a class is  exacly this class
        //(maybe less  useful than the other one)

        //ovo nije komentar: Beagle b =new Baegle (...ovdje m ispuniti atribute)
        //ovo nije zabavno jer vec znamo
        // System.out.println(b.getClass());

        //System.out.println(Beagle.class);

        //if(b.getClass().equals(Beagle.class)){
        // System.out.println("the same");
        // }

        //Object obj =b;
        //sout  (obj.Class());

        // situation 2:
        //ovdje me ne zanima tacan tip samo neophodne stvari da li je to correct callas, subclass, interface...
        //if (b instanceof Beagle({
        //System.out.println("yep");
    //}
        //if (b instanceof Beagle({
                //System.out.println("yep");
                //}

      //  if (b instanceof Dog({
                //System.out.println("yep");
                //}

       // if (obj instanceof Beagle({
                //System.out.println("yep");
                //}
    }
}

//napraviti interface GoestoParty  u Hase.

