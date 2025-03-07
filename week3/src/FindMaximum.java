public class FindMaximum {
    public static void main(String[] args) {
        /*
        int firstElement = Integer.parseInt(args[0]);
        int secondElement = Integer.parseInt(args[1]);
        if (args.length == 2 ) {
            if(firstElement>secondElement){
                System.out.println(firstElement);
            }else{
                    System.out.println(secondElement);
                }
            }
        else{
            System.out.println("Two integer expected");
        }

         */
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        boolean condition = num1 > num2;
        int max = condition ? num1 : num2;
        System.out.println(max);
        }

}

