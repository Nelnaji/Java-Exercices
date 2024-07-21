package book.study;


public class Main {


    // this is a class
    public static void printItems(int whatever) {

        for (int i = 0; i < whatever; i++) {
            System.out.println(i);

        }


    }

// this is the main app that will be executed
    public static void main(String[] args) {

        printItems(100);
    }
}