import java.util.Scanner;
public class PracticeQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ques 1
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("The sum of these two numbers is : " + sum);

        //Ques 2
//        System.out.println("Enter three numbers");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a>b && a>c){
//            System.out.println("The max value is: " +a);
//        }
//        else if(b>a && b>c){
//            System.out.println("The max value is: " +b);
//        }
//        else{
//            System.out.println("The max value is: " +c);
//        }

        //Ques 3
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 2; i <= n; i+=2) {
//            if (n % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("The sum of the even numbers are : " +sum);

        //Ques 4
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//        int ans=1;
//        for(int i=1;i<=n;i++) {
//            ans *= i;
//        }
//        System.out.println("The factorial of the number is : " + ans);

        //Ques 5
        //System.out.println("Enter n");
//        int n = sc.nextInt();
//        int reverse=0;
//        int remainder;
//        while(n!=0){
//            remainder=n%10;
//            reverse=reverse*10+remainder;
//            n/=10;
//        }
//        System.out.println("The reverse no is " + reverse);

        //Ques 6
        System.out.println("ENTER N");
        int n = sc.nextInt();
        boolean flag= false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }


    }

}
