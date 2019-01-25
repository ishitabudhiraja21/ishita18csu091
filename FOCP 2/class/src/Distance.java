import java.lang.Math;
class Distance
{
	 private double x,y;
	 Distance()
	 {
	 this.x=0;
	 this.y=0;
	 
	 }
	 Distance(double x)
	 {
	 this.x=x;
	 this.y=0;
	 
	 }
	 Distance(double x,double y)
	 {
	 this.x=x;
	 this.y=y;
	 }
	 public void setX(double x)
	 {	 
	 this.x=x;
	 }
	 public double getX()
	 {
	 return this.x;
	 }
	 public void setY(double y)
	 {
	 this.y=y;
	 }
	 public double getY(double y)
	 {
	 return this.y;

	 }
	 public double calculateDistance(Distance d1, Distance d2)
	 {
	double dis= Math.sqrt((d1.getX()-d2.getX())*(d1.getX()-d2.getX())+(d1.getY()-d2.getY())*(d1.getY()-d2.getY()));
	return dis;
	 }
	 
	 }
