package day26;

public class ExercisesEx {
    public static void main(String[] args) {
        //1. WAP to count a digit 1 in 1 to 100.
        int count = 0;
        for(int i = 1; i<=100; i++){
            String number = Integer.toString(i);

            for(char digit : number.toCharArray()){
                if(digit == '1'){
                    count++;
                }
            }
        }
        System.out.println("count of digit 1 in 1 to 100 is : " + count);

        //2. WAP to calculate sum of odd and sum of even from 1 to 100.

        int evenCount = 0;
        int oddCount = 0;
        for(int i = 1; i<= 100; i++){
            if(i % 2 == 0){
                evenCount += i;
            }
            else {
                oddCount += i;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);

        System.out.println(evenCount == oddCount);
        System.out.println("sum of odd is not equal to sum of even");

        //3. WAP to reverse a given string
        String str = "Chennai";
        for(int i = str.length() - 1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

        //4. WAP to check a palindrome
        String str1 = " malayalam ";
        String removedSpace = str1.replace(" ","");
        System.out.println(removedSpace);
        for(int i = removedSpace.length()-1; i>=0; i--){
            System.out.print(removedSpace.charAt(i));
        }
        System.out.println("it is palindrome");

        //5.WAP to factorial of 5.

        int fact = 1;
        int value = 5;
        for(int i = 1; i<=value; i++){
            fact *= i;
        }
        System.out.println("Factorial of 5 is :" + fact);



    }

}

