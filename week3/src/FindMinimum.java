public class FindMinimum {
    public static void main(String[] args) {
        /*
        if(args.length == 3) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
            boolean condition = num1 < num2;
            boolean condition2 = num2 < num3;
            int min1 = condition ? num1 : num2;
            int min2 = condition2 ? num2 : num3;
            boolean condition3 = min1 < min2;
            int min = condition3 ? min1 : min2;
            System.out.println(min);
        }
        else{
            System.out.println("Needed 3 integer!");
        }

         */
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        boolean num1_min = num1 <num2 && num1 < num3;
        boolean num2_min = num2 <num1 && num2 < num3;
        int min =num1_min ? num1:num2_min ? num2 : num3;
        System.out.println(min);
    }
}
