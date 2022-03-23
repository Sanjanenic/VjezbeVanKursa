package kuca.com;

public class Slika {
     double duzina;
     double sirina;

    public Slika(double duzina, double sirina) {
        this.duzina = duzina;
        this.sirina = sirina;
    }

    public double raznajPixel(){
         double brojPixela=duzina*sirina;

         return brojPixela;
     }

     public double totalSize(int bytePerPixel){

         double totalS= bytePerPixel*raznajPixel();
         return totalS;
     }
     public void scale  (double factor){
         sirina=sirina*factor;
         duzina=factor * duzina;

     }



}

