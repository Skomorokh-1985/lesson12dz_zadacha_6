package zadacha_2_6_str274;

public class Main {

    public static void main (String [] args) {

        MyArrayList <Integer> myAL = new MyArrayList<>();
        myAL.add(10);
        myAL.add(11);
        myAL.add(12);
        myAL.add(13);
        myAL.add(14);
        myAL.add(77);
        myAL.add(66);
        myAL.add(55);
        myAL.add(44);

        myAL.showWithIndex();
        myAL.show();

        myAL.add(3, 99);
        myAL.showWithIndex();
        myAL.show();

        myAL.remove(5);
        myAL.show();

        Integer m = 99;
        myAL.remove(m);
        myAL.show();

        Integer b = 12;
        System.out.println ("\nЧисло, наиболее близкое к заданному " + b + " это " + myAL.searchNearest(b));

        myAL.sizeBySize();
        myAL.sizeByArrayLength();
    }
}
