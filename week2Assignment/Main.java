public class Main {
    public static void main(String[] args) {
        ornek1();
//        ornek2();
//        ornek3();
//        ornek4();
//        ornek5();
    }

    static void ornek1() {
        System.out.println("-----------------------------------");
        System.out.println("Ornek1");
        MyDynamicArray arr = new MyDynamicArray();
        int n = 5;
        for (int i = 0; i < n; ++i) {
            arr.append(33);
            arr.append("vsdfasdfa");
        }

        System.out.println(arr.toString());
        System.out.println("-----------------------------------");
    }

    static void ornek2() {
        System.out.println("-----------------------------------");
        System.out.println("Ornek2");
        MyDynamicArray arr = new MyDynamicArray();
        int n = 5;
        for (int i = 0; i < n; ++i) {
            arr.append(33);
            arr.append("vsdfasdfa");
        }
        System.out.println("Silmeden önce: " + arr.toString());

        arr.remove(33);
        System.out.println("Sildikten sonra: " + arr.toString());
        System.out.println("-----------------------------------");
    }

    static void ornek3() {
        System.out.println("-----------------------------------");
        System.out.println("Ornek3");
        MyDynamicArray arr = new MyDynamicArray();
        int n = 1;
        for (int i = 0; i < n; ++i) {
            arr.append(33);
            arr.append("vsdfasdfa");
        }
        System.out.println(arr.toString());

        arr.remove();
        arr.remove();

        System.out.println(arr.toString());

        arr.remove();

        System.out.println("-----------------------------------");
    }

    static void ornek4() {
        System.out.println("-----------------------------------");
        System.out.println("Ornek4");
        MyDynamicArray arr = new MyDynamicArray();
        int n = 32767;
        for (int i = 0; i < n; ++i) {
            arr.append(33);
            arr.append("vsdfasdfa");
        }
        System.out.println(arr.toString());

        System.out.println("-----------------------------------");
    }

    static void ornek5() {
        System.out.println("-----------------------------------");
        System.out.println("Ornek5");
        MyDynamicArray arr = new MyDynamicArray();

        System.out.println(arr.toString());

        arr.remove();

        System.out.println("-----------------------------------");
    }
}
