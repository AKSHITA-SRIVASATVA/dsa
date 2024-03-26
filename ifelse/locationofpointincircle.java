package ifelse;
import java.util.Scanner;
import java.lang.Math;


public class locationofpointincircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println('enter the centre of circle;');
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("enter the radius of circle");
        int r=sc.nextInt();
        System.out.println('enter the coordinates of the points:');
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int t=math.pow(x1-x,2);
        int g=math.pow(y1-y,2);

        int d=math.sqrt(t+g);
        if(d<r){
            System.out.println("point lies within circle;");
        }
        else if(d>r){
            System.out.println("point lies outside circle");
        }
        else{
            System.out.println("point lies on the circle");
        }

        
    }
    
}
