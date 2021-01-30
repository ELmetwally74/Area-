
package area;


public class AreaOfCylinder extends Area {
    double areaOfCylinder , volume;
	void cylinder (double r,double h)
	{
	 areaOfCylinder = 2 * 22/7 * r * (r + h);
         volume = (22/7) * r * r * h ;
	}
}
