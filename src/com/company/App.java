public class App {
    /**
     * This method takes in two int parameters to add.
     *
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     *
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     computes 2 numbers using computeSum
     */

    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    /**
     computes 3 numbers using computeSum
     */
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


    /**
     *
     * Create method that returns the greater integer value
     */
    private static int greaterValue(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else
            return num2;
    }


    /**
     *
     * Create method that returns the greater double value
     *
     */

    private static double greaterValue(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else
            return num2;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        //Calling the Overloading Method that takes in 2 parameters, and 3 parameters
        System.out.println("The Sum of 30 and 70 = " + App.computeSum(30,70));
        System.out.println("The Sum of 30 , 70 and 100 = " + App.computeSum(30,70,100));


        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}
