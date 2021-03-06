/**
 * 
 */
package edu.wm.cs.cs301.UI;

//import edu.wm.cs.cs301.R;
import edu.wm.cs.cs301.falstad.BasicRobot;
import edu.wm.cs.cs301.falstad.FirstPersonDrawer;
import edu.wm.cs.cs301.falstad.GraphicsWrapper;
import edu.wm.cs.cs301.falstad.ManualDriver;
import edu.wm.cs.cs301.falstad.MapDrawer;
import edu.wm.cs.cs301.falstad.Maze;
import edu.wm.cs.cs301.falstad.Robot;
import edu.wm.cs.cs301.falstad.UnsuitableRobotException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author aablohm and jaleo
 * 
 * This class is the third screen in the AMaze app.  It allows the user to actually play the maze.  Currently,
 * there is a finish button since the maze doesn't exist.  The user can also toggle the map, show the solution
 * to the maze and show the currently visible walls.  
 *
 */
public class PlayActivity extends Activity{
	
	ProgressBar batteryLevel;
    Context context;
    CharSequence text;
    int duration;
	Toast toast;
	Maze maze;
	boolean toggleMapBoolean;
	boolean showSolutionBoolean;
	boolean showVisibleWallsBoolean;
	TextView level;
	
	private static final String TAG = "TAG_PlayActivity";
	
	/**
	 * Called when the activity is first created. Provides the original setup for the play activity.  Sets the 
	 * level for the battery.
	 */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
//       //context = getApplicationContext();
////        maze = new Maze(0);
////        maze.init();
////        maze.build(7);
////        try {
////			maze.mazebuilder.buildThread.join();
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////        GraphicsWrapper things = new GraphicsWrapper(PlayActivity.this, maze);
////        maze.gw = things;
////        Log.v("after maze creation", ""+maze.view_dx);
////        Log.v("after maze creation", ""+maze.view_dy);
//////        maze.gw.maze = maze;
//
////        setContentView(maze.gw);
////        maze.gw.onDraw(maze.gw.canvas);
//        //maze.gw.invalidate();
//
//        Intent generatingIntent = getIntent();
//        
//    	maze = (Maze) generatingIntent.getSerializableExtra("maze");
//    	GraphicsWrapper gw = new GraphicsWrapper(this);
//    	gw.maze = maze;
//    	maze.gw = gw;
////    	try {
////			maze.mo.setRobot(maze.walle);
////		} catch (UnsuitableRobotException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//    	maze.firstpersondrawer = new FirstPersonDrawer(maze.view_width, maze.view_height,maze.map_unit,maze.step_size, maze.mazecells, maze.seencells, 10, maze.mazedists, maze.mazew, maze.mazeh, maze.bsp);
//    	maze.mapdrawer = new MapDrawer(maze.view_width,maze.view_height,maze.map_unit,maze.step_size, maze.mazecells, maze.seencells, 10, maze.mazedists, maze.mazew, maze.mazeh) ;
//    	maze.init();
////	    maze.showSolution = true;
////	    maze.showMaze = true;
////	    maze.map_mode = true;
//	    
//    	Robot robo = new BasicRobot(maze);
//    	ManualDriver manuel = new ManualDriver();
//    	try {
//			manuel.setRobot(robo);
//		} catch (UnsuitableRobotException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//    	maze.mo = manuel;
//    
////	    maze.newMaze(maze.bsp, maze.mazecells, maze.mazedists, maze.px, maze.py);
////	    //maze.redraw();
////	    //maze.gw.onDraw(maze.gw.canvas);
//	    //setContentView(maze.gw);
////	    Log.v("well", "then");
//	    maze.gw.invalidate();
////	    gw.invalidate();
//        setContentView(R.layout.play);
//        //View GraphicsMaze = (View) findViewById(R.id.view1);
//        //GraphicsMaze.draw(maze.gw.canvas);
//        addContentView(maze.gw, new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
//        
//        batteryLevel = (ProgressBar) findViewById(R.id.progressBar1);
//        level = (TextView) findViewById(R.id.batteryLevel);
//	    batteryLevel.setMax(2500);
//	    batteryLevel.setProgress(2500);
//	       
//
//		    
//		    duration = Toast.LENGTH_SHORT/25;
//		    
//		    toggleMapBoolean = generatingIntent.getBooleanExtra("toggleMap", false);
//	    	showSolutionBoolean = generatingIntent.getBooleanExtra("showSolution", false);
//	    	showVisibleWallsBoolean = generatingIntent.getBooleanExtra("showVisibleWalls", false);
//	    	CheckBox toggleMap = (CheckBox) findViewById(R.id.toggleMap);
//	    	if (toggleMapBoolean){
//	    		toggleMap.setChecked(true);
//	    		maze.map_mode = true;
//	    	}
//		    
//		    CheckBox showSolution = (CheckBox) findViewById(R.id.showSolution);
//		    if(showSolutionBoolean){
//		    	showSolution.setChecked(true);
//		    	maze.showSolution = true;
//		    }
//		    
//		    CheckBox showVisibleWalls = (CheckBox) findViewById(R.id.showVisibleWalls);
//		    if(showVisibleWallsBoolean){
//		    	showVisibleWalls.setChecked(true);
//		    	maze.showMaze = true;
//		    }
//		  
//
//    }
//    
//    /**
//     * Creates the toasts and logs for all the buttons and the checkboxes on the screen.  It also changes the intent
//     * to the finish activity.
//     * @param clickedButton
//     */
//    public void showFinishScreen(View clickedButton) {
//    	Button b = (Button) clickedButton;
//		   // do what I need to do when a button is clicked here...
//		switch (b.getId()){
//			case R.id.showSolution:
//				maze.showSolution =! maze.showSolution;
//		    	Log.v(TAG, "Show Solution");
//				break;
//			case R.id.showVisibleWalls:
//				maze.showMaze =! maze.showMaze;
//		    	Log.v(TAG, "Show Visible Walls");
//				break;
//			case R.id.toggleMap:
//				maze.map_mode=! maze.map_mode;
//				
//				Log.v(TAG, "Show Map");
//				break;
////			case R.id.solveMaze:
////				Log.v(TAG, "Solve");
////				finish();
////				Intent finishIntent = new Intent(this, FinishActivity.class);
////				startActivity(finishIntent);
////				break;
//		}
//
//		maze.gw.invalidate();
//
//		
//	}
//    
//    /**
//     * Overrides the dispatchKeyEvent method to make the DPAD keys produce toasts and logs.
//     */
//    @Override
//    public boolean onKeyDown(int KeyCode, KeyEvent msg){
//    	int keyCode = msg.getKeyCode();
//    	if(keyCode == KeyEvent.KEYCODE_PLUS||keyCode == KeyEvent.KEYCODE_EQUALS||keyCode == KeyEvent.KEYCODE_O){
//			Log.v(TAG, "Plus Key, magnify");
//    		if (maze.mapdrawer != null){
//    			Log.v(TAG, "Plus Key, magnify");
//    			maze.mapdrawer.incrementMapScale() ;
//    			maze.gw.invalidate();
//    		}
//    	}
//    	
//    	if(keyCode == KeyEvent.KEYCODE_MINUS||keyCode == KeyEvent.KEYCODE_I){
//    		if (maze.mapdrawer != null){
//    			Log.v(TAG, "Minus Key, demagnify");
//    			maze.mapdrawer.decrementMapScale();
//    			maze.gw.invalidate();
//    		}
//    	}
//    	if (keyCode==KeyEvent.KEYCODE_DPAD_LEFT){ 
//    		maze.mo.keyPressed(2);
//    	    batteryLevel.setProgress((int)(2500 - maze.mo.getEnergyConsumption()));
//    	    level.setText("Battery Level: " + (2500-maze.mo.getEnergyConsumption()));
//    		maze.gw.invalidate();
//    		Exit();
//    		Log.v(TAG, "Left");
//    		
//    	}
//    	
//    	if (keyCode==KeyEvent.KEYCODE_DPAD_RIGHT) { 
//    		maze.mo.keyPressed(3);
//    	    batteryLevel.setProgress((int)(2500 - maze.mo.getEnergyConsumption()));
//    	    level.setText("Battery Level: " + (2500-maze.mo.getEnergyConsumption()));
//    		maze.gw.invalidate();
//    		Log.v(TAG, "Right");
//    		Exit();
//    	}
//    	
//    	if (keyCode==KeyEvent.KEYCODE_DPAD_UP) { 
//    		maze.mo.keyPressed(0);
//    	    batteryLevel.setProgress((int)(2500 - maze.mo.getEnergyConsumption()));
//    	    level.setText("Battery Level: " + (2500-maze.mo.getEnergyConsumption()));
//    		maze.gw.invalidate();
//    		Log.v(TAG, "Up");
//    		Exit();
//    	}
//    	
//    	if (keyCode==KeyEvent.KEYCODE_DPAD_DOWN) { 
//    		maze.mo.keyPressed(1);
//    	    batteryLevel.setProgress((int)(2500 - maze.mo.getEnergyConsumption()));
//    	    level.setText("Battery Level: " + (2500-maze.mo.getEnergyConsumption()));
//    		maze.gw.invalidate();
//    		Log.v(TAG, "Down");
//    		Exit();
//    	}
//
//    	
//    	if(keyCode == KeyEvent.KEYCODE_BACK){		
//    		Log.v(TAG, "Back Button");
//    	
//    		Intent startOver = new Intent(this, AMazeActivity.class);
//    		startActivity(startOver);}
//
//
//
//    	return true;
//    }
//    public void Exit(){
//    	if(maze.isEndPosition(maze.px, maze.py)||(maze.mo.getEnergyConsumption()>=2500)){
//    		
//			finish();
//			Intent finishIntent = new Intent(this, FinishActivity.class);
//			if(maze.mo.getEnergyConsumption()>=2500& !maze.isEndPosition(maze.px, maze.py)){
//				int []i = {1};
//				Log.v(TAG, "Game Lost");
//				finishIntent.putExtra("consume","The robot is dead.");
//				finishIntent.putExtra("pathLength", "He had a wife and kid too.");
//				finishIntent.putExtra("win_lose", i);
//			}
//			else{
//				int []i = {0};
//				Log.v(TAG, "Game Won");
//				finishIntent.putExtra("consume", ""+(maze.mo.getEnergyConsumption()));
//				finishIntent.putExtra("pathLength", ""+(maze.mo.getPathLength()));
//				finishIntent.putExtra("win_lose", i);
//			}
//			startActivity(finishIntent);
//    	}
//    }

    
}
