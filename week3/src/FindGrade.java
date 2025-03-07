
public class FindGrade{

    public static void main(String[] args){


        int score = Integer.parseInt(args[0]);
        if(args.length>=1) {
            //Get the score from the user as a file parameter
            //Calculate the grade based on the score
            //Print the grade to the console
            if (score >= 90 && score <= 100) {
                System.out.println("Grade is A");
            } else if (score >= 80) {
                System.out.println("Grade is B");
            } else if (score >= 70) {
                System.out.println("Grade is C");
            } else if (score >= 60) {
                System.out.println("Grade is D");
            } else if (score >= 0 && score <= 59) {
                System.out.println("Grade is F");
            } else {
                System.out.println("Invalid Grade!!");
            }
        }else{
            System.out.println("Please provide a score");
        }
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F





    }



}