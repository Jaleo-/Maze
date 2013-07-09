/**
 * 
 */
package edu.wm.cs.cs301.falstad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * @author aablohm and jaleo
 * 
 * This class encapsulates all of the graphics methods from FirstPersonDrawer, MapDrawer, Seg, and RangeSet.
 *
 */
public class GraphicsWrapper extends View{
	public Canvas canvas;
	Bitmap b;
	//Graphics canvas;
	Color color;
	Paint paint = new Paint();
	public Maze maze;
	
	public GraphicsWrapper(Context context){
		super(context);
		b = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
		canvas = new Canvas(b);
		//canvas.setBitmap(b);
		this.onLayout(true, 50, 50, 50, 50);
		
	}
	@Override
	public void onDraw(Canvas canvas){
		this.canvas = canvas;
		this.maze.redraw();

	}
	
//	@Override
//	public void onMeasure(int width, int height){
//		int w = View.MeasureSpec.getSize(width);
//		int h = View.MeasureSpec.getSize(height);
//		
//	}
	 
	public GraphicsWrapper(Context context, AttributeSet attrs) {
	 
		super( context, attrs );
	}
	 
	public GraphicsWrapper(Context context, AttributeSet attrs, int defStyle) {
	 
		super( context, attrs, defStyle );
	}
	/**
	 * Sets the color using a Color input.
	 * @param c
	 */
	/**
	 * Sets the color using an array input
	 * @param c
	 */
	public void setColor(int[] c){
		
		paint.setColor(Color.rgb(c[0], c[1], c[2]));
		//canvas.drawColor((c[0]+c[1]+c[2]));
	}
	
	/**
	 * Sets the color using a string input
	 * @param c
	 */
	public void setColor(String c){
		if (c=="white"){
			paint.setColor(Color.WHITE);}
		if(c =="red"){
			paint.setColor(Color.RED);}
		if(c=="yellow"){
			paint.setColor(Color.YELLOW);}
		if(c=="gray"){
			paint.setColor(Color.GRAY);}
		if(c=="black"){
			paint.setColor(Color.BLACK);}
		if(c=="darkGray"){
			paint.setColor(Color.DKGRAY);}
	}
	
	/**
	 * Calls the graphics fillRect() method
	 * @param i
	 * @param j
	 * @param width
	 * @param halfHeight
	 */
	public void fillRect(int i, int j, int width, int halfHeight){
		paint.setStyle(Paint.Style.FILL);
		canvas.drawRect(i,halfHeight + j,i + width, j, paint);
	}
	
	/**
	 * Calls the graphics fillPolygon() method
	 * @param xps
	 * @param yps
	 * @param z
	 */
	public void fillPolygon(int[] xps, int[] yps, int z){
		paint.setStyle(Paint.Style.FILL);
		Path path = new Path();
		path.moveTo(xps[0], yps[0]);
		for (int i = 1; i < xps.length; i++){
			path.lineTo(xps[i], yps[i]);

		}
		path.close();
		canvas.drawPath(path, paint);	


	}
	
	/**
	 * Calls the graphics setFont() method
	 * @param f
	 */
//	public void setFont(Font f){
		//canvas.setFont(f);
	//}
	
	/**
	        
	         * 
	         * Calls the graphics getFontMetrics() method
	 * @return
	 */
//	public FontMetrics getFontMetrics(){
//		return canvas.getFontMetrics();
//	}
	
//	/**
//	 * Calls the graphics drawString() method
//	 * @param str
//	 * @param x
//	 * @param y
//	 */
//	public void drawString(String str,int x, int y){
//		//canvas.drawString(str, x, y);
//	}

	/**
	 * Calls the graphics drawLine() method
	 * @param nx1
	 * @param ny1
	 * @param nx2
	 * @param ny12
	 */
	public void drawLine(int nx1, int ny1, int nx2, int ny12) {
		canvas.drawLine(nx1, ny1, nx2, ny12, paint);
		
	}

	/**
	 * Calls the graphics fillOval() method
	 * @param i
	 * @param j
	 * @param cirsiz
	 * @param cirsiz2
	 */
	public void fillOval(int i, int j, int cirsiz, int cirsiz2) {
		//RectF oval = new RectF(i,j,i+cirsiz,j+cirsiz2);
		//canvas.drawOval(oval, paint);
		
	}

}
