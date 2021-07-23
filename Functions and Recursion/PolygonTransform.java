/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Eshaan Mathur em919@rutgers.edu 
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
    double [] copyArray = new double [array.length];
    for (int i = 0; i<array.length; i++)
    {
        copyArray[i]= array[i];
    }
    return copyArray;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
    for (int i = 0; i<x.length; i++)
    {
        x[i]= alpha * x[i];
        y[i]= alpha * y[i];
    }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
    for (int i = 0; i<x.length; i++)
    {
        x[i]= dx + x[i];
        y[i]= dy + y[i];
    }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
    double radian = theta*Math.PI/180;
    for (int i = 0; i<x.length; i++)
    
    {
        double OG = x[i];
        x[i]= Math.cos(radian) * x[i]-Math.sin(radian)*y[i];
        y[i]= Math.cos(radian) * y[i]+Math.sin(radian)*OG;
    }
	
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {  

        //copy

        StdDraw.setScale(-5.0, +5.0);
        double x[]= {0,1,1,0};
        double y[]= {0,0,2,1};
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        double[] ans1 = copy(x);
        double[] ans2 = copy(y);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(ans1, ans2); 
    
        //scale
    
        StdDraw.setScale(-5.0, +5.0);
        double x[]= {0,1,1,0};
        double y[]= {0,0,2,1};
        double alpha = 2.0;
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        scale(x,y,alpha);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y); 
        
        //translate
    
        StdDraw.setScale(-5.0, +5.0);
        double x[]= {0,1,1,0};
        double y[]= {0,0,2,1};
        double dx = 2.0, dy =1.0;
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        translate(x,y,dx,dy);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);  

        //rotate
    
        StdDraw.setScale(-5.0, +5.0);
        double x[]= {0,1,1,0};
        double y[]= {0,0,2,1};
        double theta = 45.0;
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        rotate(x,y,theta);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);    


    
    }
}
