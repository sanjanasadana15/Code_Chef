import java.util.Scanner;
class question1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of the Student:");
        int marks = sc.nextInt();

        if(marks >=80)
            System.out.println("Outstanding");
        else if(marks>= 60)
            System.out.println("Good");
        else if(marks>=50)
            System.out.println("Average");
        else
            System.out.println("Failed");
    }
}