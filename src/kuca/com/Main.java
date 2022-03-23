package kuca.com;

public class Main {

    public static void main(String[] args) {
        Slika s= new Slika(2,3);

        System.out.println(s.raznajPixel());
        System.out.println(s.totalSize(4));
        s.scale(2);
        System.out.println(s.raznajPixel());
        System.out.println(s.totalSize(4));

    }
}
