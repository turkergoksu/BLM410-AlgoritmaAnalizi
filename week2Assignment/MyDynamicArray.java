public class MyDynamicArray {
    // Template(Generic) yerine Object seçmemin sebebi videoda
    // String ve Integer tipindeki değerleri aynı arrayde bulundurmamız
    private Object[] A;
    private int n; // Actual element count
    private int capacity; // Size of dynamic array

    public MyDynamicArray() {
        this.n = 0;
        this.capacity = 1;
        this.A = makeArray(this.capacity);
    }

    // O(1)
    public void append(Object obj) {
        if (this.n == this.capacity) resize(2 * capacity); // Double capacity
        this.A[n] = obj;
        this.n += 1;
    }

    // Ödevde belirtildiği üzere en son eklenen silineceği için parametre olarak 'value' parametresi eklemedim.
    // Fakat ne olur ne olmaz diye value parametreli olarak da bir fonksiyon ekledim.

    // O(1)
    public void remove() {
        if (n == 0) {
            System.out.println("...DynamicArray bos..");
            return;
        }
        this.A[n - 1] = null;
        n -= 1;
    }

    // O(n)
    public void remove(Object value) {
        if (n == 0) {
            System.out.println("...DynamicArray bos..");
            return;
        }
        for (int i = 0; i < n; ++i) { // --> Bu for icin: Eger silmek istedigimiz eleman bastaysa O(1), sondaysa O(n)
            if (this.A[i] == value) {
                for (int j = i; j < n - 1; ++j) { // Bu for icin eger silmek istedigimiz eleman:
                    // bastaysa: O(n-1) = O(n)
                    // sondaysa: O(1)
                    this.A[j] = this.A[j + 1];
                }
                // --> Bastaysa: O(1) + O(n) = O(n)
                // --> Sondaysa: O(n) + O(1) = O(n)
                // Silinmek istenen degerin indexi fark etmeksizin fonksiyonun complexitysi O(n)
                this.A[n - 1] = null;
                n -= 1;
                return;
            }
        }
    }

    // O(n)
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < n; ++i) {
            builder.append(A[i]).append(",");
        }
        builder.append("]");
        return builder.toString();
    }

    // O(n)
    private void resize(int c) {
        Object[] B = makeArray(c); // --> O(1)
//        System.out.println("...amortized cost...");
        for (int i = 0; i < this.n; ++i) { // --> O(n)
            B[i] = this.A[i];
//            System.out.println("...move operation...");
        }
        this.A = B;
        this.capacity = c;
    }

    // O(1)
    private Object[] makeArray(int c) {
        return new Object[c];
    }
}
