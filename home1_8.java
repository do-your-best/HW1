package com.company;

public class home1_8 {

    public static void main(String[] args) {
        public static int[] ArrayList = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}
