import java.util.Scanner;

public class countingInts
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length;
        String  g1 =" ", g2=" ", g3=" ", g4=" ", g5 = " ";
        System.out.println("How many numbers do you need to enter?");
        length = scan.nextInt();
        int[] input = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter an integer between 0 and 50.");
            input[i] = scan.nextInt();

            if (input[i] < 0 || input[i] > 50) {
                System.out.println("Please enter a valid number");
                input[i] = scan.nextInt();

            }//end if
            if (input[i] <= 10){
                g1 += "* ";
            }//end end second if
            else if (input[i] <= 20 && input[i] > 10)
            {
                g2 += "* ";
            }//end first else if
            else if(input[i] <= 30 && input[i] > 20)
            {
                g3 += "* ";
            }//end second else if
            else if (input[i] <= 40&& input[i] > 30)
            {
                g4 +="* ";
            }//end third else if
            else
            {
                g5 +="* ";
            }//end else
        }//end for loop

        System.out.println("00 - 10 | " + g1 + "\n11 - 20 | " + g2 +
                "\n21 - 30 | " + g3 + "\n31 - 40 | " + g4 + "\n41 - 50 | " + g5);





        }//end main method
    }//end countingInts

