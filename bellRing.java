import java.util.Scanner;
public class bellRing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your info: ");
        String input = sc.nextLine();
        int comma2 = input.lastIndexOf(",");
        String grade = input.substring(comma2+1);
        System.out.println(comma2);
        Double dubGrade = Double.parseDouble(grade);
        System.out.println(dubGrade);
        int rounded = (int)(Math.round(dubGrade));
        System.out.print("Rounded grade: "+rounded);
    
    }
}