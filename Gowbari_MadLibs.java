import java.util.Scanner;
public class Gowbari_madLibs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the land of Brainrot, where ____ escapes from ____ and travels through the void of ____, all while ____ at a speed of 67 thoughts per second. Suddenly, they ____ with a ____, ____ creature named TralaleroTralala. Nothing makes sense anymore. The sky is ____. Reality is optional."); //original story printed out
        // 8 input options
        System.out.println("Enter a name: ");
        String noun1 = scanner.nextLine();
        System.out.println("Enter a name of a place: ");
        String noun2 = scanner.nextLine();
        System.out.println("Enter another name of a place: ");
        String noun3 = scanner.nextLine();
        System.out.println("Enter a verb not ending in -ing: ");
        String verb1 = scanner.nextLine();
        System.out.println("Enter an action that ends with -ing: ");
        String verb2 = scanner.nextLine();
        System.out.println("Enter a adjective: ");
        String adj1 = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        String adj2 = scanner.nextLine();
        System.out.println("Enter a food: ");
        String food = scanner.nextLine();

        // story printed out
        System.out.println("Welcome to the land of Brainrot, where " + noun1 + " escapes from " + noun2 + " and travels through the void of " + noun3 + ", all while " + verb2 + " at a speed of 67 thoughts per second. Suddenly, they " + verb1 + " with a " + adj1 + ", " + adj2 + " creature named TralaleroTralala. Nothing makes sense anymore. The sky is "+food+". Reality is optional.");
        scanner.close();
    }
}