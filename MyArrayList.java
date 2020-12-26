package zadacha_2_6_str274;

public class MyArrayList<E> {

    public static int size = 0;
    ArrayListElement [] array;

    public MyArrayList() {
        array = new ArrayListElement [10];
    }

    void add (E value) {
        if (size == array.length) {
            ArrayListElement [] array2 = new ArrayListElement [array.length + 1];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        array[size++] = new ArrayListElement (value);
    }

    void add (int index, E value) {
        if (size == 0 && index != 0) {
            System.out.println(" Ошибка! В списке отсутствуют элементы! ");
            System.out.println(" Вы не можете добавить элемент с индексом " + index);
        } else {
            ArrayListElement [] array2;
            if (size == array.length) {
                array2 = new ArrayListElement[array.length + 1];
            } else {
                array2 = new ArrayListElement[array.length];
            }
            for (int i = 0; i < index; i++) {
                array2[i] = array[i];
            }
            array2[index] = new ArrayListElement(value);
            size++;

            for (int i = index + 1; i < size; i++) {
                array2[i] = array[i-1];
            }
            array = array2;
        }
    }

    void remove (int index) {
        if (index >= size) {
            System.out.println("\n Ошибка! В списке отсутствует элемент с таким индексом! ");
        } else {
            ArrayListElement[] array2 = new ArrayListElement[array.length - 1];
            for (int i = 0; i < index; i++) {
                array2[i] = array[i];
            }

            for (int i = index; i < array.length - 1; i++) {
                array2[i] = array[i+1];
            }
            array = array2;
        }
        size--;
    }

    void remove (E value) {
            boolean m = false;
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].value == value) {
                    m = true;
                    k = i;
                    break;
                }
            }
            if (m == true) {
                ArrayListElement[] array2 = new ArrayListElement[array.length - 1];
                for (int i = 0; i < k; i++) {
                    array2[i] = array[i];
                }

                for (int i = k; i < array.length - 1; i++) {
                    array2[i] = array[i+1];
                }
                array = array2;
            }
        size--;
    }

    ArrayListElement searchNearest (Integer value) {

        int k = 0;
        ArrayListElement nearestElem = array[0];
        Integer min = Math.abs((Integer) array[0].value - value); // повидимому, увлекся излишне универсальными типамиSystem.out.println (k + "  " + min);
        try {
            for (int i = 0; i < array.length; i++) {
                if (Math.abs((Integer) array[i].value - value) < min) {
                    k = i;
                    min = Math.abs((Integer) array[i].value - value);
                    nearestElem = array[i];
                }
            }
        } catch (NullPointerException se) {
        }
        return nearestElem;
    }

        void showWithIndex () {
        System.out.println();
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println(" индекс - " + i + ", значение - " + array[i].toString());
            }
        } catch (NullPointerException se) {
        }
    }

    void show () {
        System.out.println();
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i].toString());
            }
        } catch (NullPointerException se) {
        }
    }

    void sizeBySize () {
        System.out.println("sizeBySize = " + size);
    }

    void sizeByArrayLength () {
        System.out.println("sizeByArrayLength = " + array.length);
    }

}










