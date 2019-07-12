
class Conversion {
    public static void main(String[] args) {
        String number = "10";
        int result = Integer.parseInt(number);
        System.out.println(result);

        int a = 1234;
        int b = -1234;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);
    }
}