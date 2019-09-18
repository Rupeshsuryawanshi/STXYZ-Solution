import java.util.*;

public class Task2
{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int[] arr = {1,0,2,0,3,0,4,0,5,0};
int input = 1;
int acc = 1000;
while(input != 0){
   System.out.println("Enter Your Choice:\n 1) 1 for Bet\n 2) 0 to Exit\n");
   input = s.nextInt();
   if(input == 1){
       int max = 9;
                int min = 0;
                int range = max - min + 1;
       acc -= 10;
       System.out.println("Choose a number between 1 and 5");
       int bet = s.nextInt();
       int index = (int)(Math.random() * range) + min;
       if(arr[index] == bet){
           acc += (10 * bet);
           System.out.println("Congratulations\nYour Account: " + acc);
       }
       else{
           System.out.println("Oops!!!\nYour Account: " + acc);
       }
   }
   else if(input == 0){
       System.out.println("Thanks For Playing");
   }
}
}
}

