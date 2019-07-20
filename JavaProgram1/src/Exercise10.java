class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExample t = new OverloadingExample();
        t.methodX(5, 9, 2.2);
        t.methodX(5, 9, "Hi");
        t.methodX(5, 9, 2);
        t.methodX(5, 9);
    }

    public void methodX(int a) {
        System.out.println("This is the method X with 1 parameters!");
    }

    public void methodX(int a, int b) {
        System.out.println("This is the method X with 2 parameters!");
    }

    public void methodX(int a, int b, int c) {
        System.out.println("This is the method X with 3 parameters!");
    }

    public void methodX(int a, int b, double c) {
        System.out.println("This is the method X with 3 parameter but last is a double!");
    }

    public void methodX(int a, int b, String c) {
        System.out.println("This is the method X with 3 parameter but last is a string!");
    }
}