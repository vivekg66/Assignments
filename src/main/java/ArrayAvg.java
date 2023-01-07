import java.util.Scanner;

public class ArrayAvg {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        MinAndMax m = new MinAndMax();
        m.getMinNumber(myArray);


        System.out.println("average is " + AverageOfArray(myArray));
        AverageOfArray(myArray);
        System.out.println("Maximum value in the array is::" + m.getMaxNumber(myArray));
        //System.out.println("Minimum value in the array is::"+m.min(myArray));
        System.out.println("sum odf 10 nos is" + " " + SumOfNO(myArray));
        System.out.println("Reverse Number is" + " " + ReverseNumber());
        System.out.println("Reverse string is" + " " + StringReverse());
        LeapYear();
        ReverseArray();

    }


    public static class MinAndMax {

        /**
         * This method will check for the max number in array and will return max number
         * @param array input array to search the max number
         * @return return the max value
         */
        public int getMaxNumber(int[] array) {
            //declaring the variable max and initialise value to 0
            int max = 0;
            // create a for loop from 0 till length of the array
            for (int i = 0; i < array.length; i++) {
                //check if array value at ith postion is greater then max value
                //If it is equal assign the ith value of array to max
                if (array[i] > max) {
                    max = array[i];
                }
            }
            //and return the max value
            return max;
        }

        /**
         * This method will check for the min number in array and will return min number
         * @param array input array to search the min number
         * @return return the min value
         */
        public void getMinNumber(int[] array) {
            //declaring the variable min and initialise value to 0
            int min = array[0];
            // create a for loop from 0 till length of the array
            for (int i = 0; i < array.length; i++) {
                //check if array value at ith postion is greater then min value
                //If it is equal assign the ith value of array to min
                if (array[i] < min) {
                    min = array[i];
                }
            }
            //prints the min value of the given array
            System.out.println("min is" + min);
        }
    }

    private static double AverageOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;

    }

    /**
     * This method will perform the addition of all the elements in the given array and return the sum
     * @param array input array to perform additon
     * @return return the sum of the numbers in array
     */
    public static int SumOfNO(int[] array) {
        //declaring the variable sum and initialise value to 0
        int sum = 0;
        // create a for loop from 0 till length of the array
        for (int i = 0; i < array.length; i++) {
            //adding ith value each time with sum  and store it to sum
            sum = sum + array[i];

        }
        // //and return the sum value
        return sum;

    }

    /**
     * This method will perform the reverse of the given number
     * @return return the reverse of the given number
     */
    public static int ReverseNumber() {
      //declaring the variable number,rev  and initialise value to 2345,0
        int number = 2345, rev = 0;
        //create while loop and run it until the given number is not equal to zero
        while (number != 0) {
            //perform mod of 10 with the given number and multiple the rev value with 10 add these results and store it to rev
            rev = rev * 10 + number % 10;
            //divide the number by 10 and store it to number
            number = number / 10;
        }
        //returns the reverse number
        return rev;
    }

    public static String StringReverse() {
        String str = "vivek";
        String rev = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        return rev;
    }

    public static void LeapYear() {
        int year;
        System.out.println("Enter an Year :");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }

    public static void ReverseArray() {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Reverse array is:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");

        }
    }


}






