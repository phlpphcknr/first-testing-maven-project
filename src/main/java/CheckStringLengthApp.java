public class CheckStringLengthApp{

    public static void main(String[] args) {
        //System.out.println("Hello guys!");

        // Relational operators

        int a = 3;
        int b = 8;

        boolean equals = a==b;
        System.out.println("a and b are equal: " + equals);

        boolean compare = a < b;
        System.out.println("a is smaller b: " + compare);

        System.out.println(triplicate(3));


        System.out.println("The string is longer than 20 characters: " + longer20("buzdwibzudbeubuixfancybeow"));
        System.out.println("The string contains the word fancy: " + containsFancy("buzdwibzudbeubuixfancybeow"));

    }

    // new method
    public static int triplicate(int value){
        return value * 3;
    }



    // sum String method
    public static String sumSt(int value1, int value2){
        if (value1 > 100 || value2 > 100){
            System.out.println("At least One or both of the values is bigger t");
        }
        return "Summe: " + (value1 + value2);
    }


    public static String sumBigger100(int value1, int value2){
        if (value1 > 100 || value2 > 100){
            System.out.println("At least One or both of the values is bigger t");
        }
        return "Summe: " + (value1 + value2);
    }

    public static boolean longer20(String str){
        return str.length() > 20;
    }

    public static boolean containsFancy(String str){
        return str.contains("fancy");
    }

}
