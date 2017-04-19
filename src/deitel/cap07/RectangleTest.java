package deitel.cap07;

public class RectangleTest {
	
	public static void main(String[] args) {
		int[] widths = { 1, 3, 7, 9 };
		int[] heights = { 2, 5, 9, 1 };
		Rectangle[] rectangles = new Rectangle[4];
		int totalArea = 0;
		
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(widths[i], heights[i]);
		}
		for (int i = 0; i < rectangles.length; i++) {
			int area = rectangles[i].getArea();
			totalArea += area;
			System.out.printf("%s, Area: %d.%n", rectangles[i].toString(), area);
		}
		System.out.printf("%nTotal area of all rectangles is %d.%n", totalArea);
		System.out.printf("%nAverage area of all rectangles  is %d.%n%n", totalArea / rectangles.length);
		
		Rectangle myrect = new Rectangle(widths[widths.length - 1], heights[heights.length - 1]);
		
		for (int i = 0; i < rectangles.length; i++) {
			boolean areEquals = myrect.equals(rectangles[i]);
			
			System.out.printf("The rectangle %s, Area: %d is ", rectangles[i].toString(), rectangles[i].getArea());
			if (areEquals != true) {
				System.out.printf("NOT ");
			}
			System.out.printf("equal to the rectangle %s, Area: %d .%n", myrect.toString(), myrect.getArea());
			
		}
	}
	
}
