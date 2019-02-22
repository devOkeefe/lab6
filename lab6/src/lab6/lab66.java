package lab6;
import java.util.*;
public class lab66 {
	public static void main(String[] args){
	ColoredPoint L = new ColoredPoint(3,5,"Blue");
	ColoredPoint D = new ColoredPoint(4,6,"Green");
	
	System.out.println(L.toString());
	System.out.println(L.equals(D));
}

}
interface Colored{

public String getColor();
		
}




//Point class

class Point {

private int x;

private int y;

public Point() {

this(0, 0);

}

public Point(int x, int y) {

setLocation(x, y);

}

public boolean equals(Object o) {

if (o instanceof Point) {

Point other = (Point) o;

return x == other.x && y == other.y;

} else {

return false;

}

}

public int getX() {

return x;

}

public int getY() {

return y;

}

public void setLocation(int x, int y) {

this.x = x;

this.y = y;

}

public String toString() {

return "(" + x + ", " + y + ")";

}

public void translate(int dx, int dy) {

setLocation(x + dx, y + dy);

}

}
class ColoredPoint extends Point implements Colored {
	private String Color;
	private int x;

	private int y;
	
	
	public ColoredPoint (int x, int y, String Color){
		setColoredPoint(x,y,Color);
	}
	public void setColoredPoint(int x, int y, String Color){
		this.x = x;
		this.y = y;
		this.Color=Color;
	}


	public String getColor() {
		
		return Color;
	}
	public boolean equals(Object b){
		if (b instanceof ColoredPoint){
			ColoredPoint otherb = (ColoredPoint)b;
			return x == otherb.x && y == otherb.y && Color==otherb.Color;
		}
		else {
			return false;
		}
	}
	public String toString(){
		return "("+x+","+y+","+Color+")";
	}
	
	

}

	

