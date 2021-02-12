import java.util.Scanner;
public class Quadratic{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter value b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter value c: ");
        double c = scanner.nextDouble();
        double disc;
        double root1;
        double root2;
        disc = Math.pow(b, 2)-4*a*c;
        if(disc >=0){
            root1 = (-b + Math.sqrt(disc))/(2*a);
            root2 = (-b - Math.sqrt(disc))/(2*a);
            if(root1==root2){
                System.out.println("the roots are equal");
                System.out.println("the value is: " +root1);
            }
            else{
                System.out.println("root1 is: "+root1);
                System.out.println("root1 is: "+root2);
            }
        }
        else if(disc <0 ){
            System.out.println("there are no real roots");
        }
    }
}