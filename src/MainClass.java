public class MainClass {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert("One");
        array.insert("Two");
        array.insert("Three");
        array.print();
        array.insert("Four");
        array.insert("Five");
        array.print();
        System.out.println(array.indexOf("Five"));
        array.remove("Two");
        array.print();

    }
}
