
package area;

import java.util.Scanner; 
public class Area {

    
     public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble(); 
      Scanner h= new Scanner(System.in);
      System.out.println("Enter the Height of Cylinder:");
      double height= h.nextDouble();
      
      AreaOfCircle  a = new AreaOfCircle();
      a.circle(rad);
      System.out.println("Area of Circle is: " + a.areaOfCircle);
      
      AreaOfCylinder  b = new AreaOfCylinder();
      b.cylinder(rad,height);
      System.out.println("Area of Cylinder is: " + b.areaOfCylinder);
      System.out.println("Volume of Cylinder is: " + b.volume);
      
      
   }
    
}
