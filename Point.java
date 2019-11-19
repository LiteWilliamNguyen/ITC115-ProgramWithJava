
// A Point object represents a pair of (x, y) coordinates.
// Third version: state and behavior with constructor.

public class Point {
	//fields
    private int x; //private is an access modifier
    private int y;
    
    //Constructs a new point at the origin {0,0}
    public Point() {
    	this(0,0); //calls Point(int, int) constructor
    }
    
    

    // Constructs a new point with the given (x, y) location.
    public Point(int x, int y) {
    	if (x < 0 || y < 0) {
    		throw new IllegalArgumentException();
    	}
        this.x = x;
        this.y = y;
    }

    // Returns the distance between this point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Shifts this point's location by the given amount.
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
	// Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {  // not a Point object
            return false;
        }
    }
    
    @Override
    // Returns a String representation of this point.
    public String toString() {
    	return "Point coordinates: (" + x + ", " + y +")"; 
    }


	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}

    
    
}
