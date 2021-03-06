/**
 * 
 */
package edu.wm.cs.cs301.UI;



//import edu.wm.cs.cs301.R;
import edu.wm.cs.cs301.falstad.Maze;
import edu.wm.cs.cs301.falstad.MazeFileReader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;

/**
 * @author aablohm and jaleo
 * 
 * This class is the second screen in the AMaze app.  It is started by the AMazeActivity and tracks the progress
 * of the maze generation with a progress bar.
 *
 */
public class GeneratingActivity extends Activity {
	
	GeneratingActivity gen = this;
	ProgressBar generatingProgress;
    Context context;
    CharSequence text;
    int duration;
	Toast toast;
	Thread thread;
	Maze maze;
	boolean finishScreen = false;
	private static final String TAG = "TAG_GeneratingActivity";
	boolean toggleMapBoolean;
	boolean showSolutionBoolean;
	boolean showVisibleWallsBoolean;
	int  option, mazew,mazeh;


	
	/**
	 * Called when the activity is first created. Provides the original setup for the generating activity.
	 * Creates a new thread in order to properly increment the progress bar.
	 */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
//        setContentView(R.layout.generating);
//     	Intent mainIntent = getIntent();
//    	final int skillLevel = mainIntent.getIntExtra("level", 7);
//    	Log.v("skillLevel", ""+skillLevel);
//    	toggleMapBoolean = mainIntent.getBooleanExtra("toggleMap", false);
//    	showSolutionBoolean = mainIntent.getBooleanExtra("showSolution", false);
//    	showVisibleWallsBoolean = mainIntent.getBooleanExtra("showVisibleWalls", false);
//    	int[] algorithm = mainIntent.getIntArrayExtra("algorithm");
//    	String driver = mainIntent.getStringExtra("driver");
//        generatingProgress = (ProgressBar) findViewById(R.id.generatingProgress);
//	    generatingProgress.setMax(100);
//	    generatingProgress.setProgress(0);
//	    if (1==algorithm[0]){
//	    	maze = new Maze(1);
//	    	Log.v(TAG, "Prim");
//            Log.v(TAG, ""+algorithm[0]);
//	    }
//	    else if (2 == algorithm[0]){
//	    	maze = new Maze(2);
//	    	Log.v(TAG, "Kruskal");
//            Log.v(TAG, ""+algorithm[0]);
//	    }
//	    else{
//	    	maze = new Maze(0);
//	    	Log.v(TAG, " Falstad");
//            Log.v(TAG, ""+algorithm[0]);
//	    }
//	    maze.init();
//    	option = mainIntent.getIntExtra("option", 0);
//	    if(option ==1){
//	    	Log.v(TAG, "Loading a Maze");
//	    	String workingdir = System.getProperty("user.dir"+"/res/values/eek");
//			// open a file selection dialog
//	    	MazeFileReader mfr = new MazeFileReader(workingdir) ;
//			mazeh = mfr.getHeight() ;
//			mazew = mfr.getWidth() ;
//			maze.newMaze(mfr.getRootNode(),mfr.getCells(),mfr.getDistances(),mfr.getStartX(), mfr.getStartY()) ;
//			int count =0;
//    		while (count < 99){
//    			count +=1;
//    			generatingProgress.setProgress(count);
//
//    			}
//			showScreen();
//	    }
//	    	
//	    
//	    else{
//		    Runnable runnable = new Runnable(){
//		    	public void run(){
//		    		int count = 0;
//		    		maze.build(skillLevel);
//	
//	
//		    		while (maze.percentdone < 99){
//		    			count +=1;
//		    			generatingProgress.setProgress(maze.percentdone);
//	//	    			try {
//	//						Thread.currentThread().sleep(80);
//	//					} catch (InterruptedException e) {
//	//						// TODO Auto-generated catch block
//	//						e.printStackTrace();
//	//					}
//		    			}
//		    		try {
//						maze.mazebuilder.buildThread.join();
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//		    		showScreen();}
//		    	};
//		    	thread = new Thread(runnable);
//		    	thread.start();
//	    }
//	//	    Runnable runnable = new Runnable(){
//	//	    	public void run(){
//	//	    		int count = 0;
//	//	    		while (count < 100){
//	//	    			count +=1;
//	//	    			generatingProgress.setProgress(count);
//	//	    			try {
//	//						Thread.currentThread().sleep(80);
//	//					} catch (InterruptedException e) {
//	//						// TODO Auto-generated catch block
//	//						e.printStackTrace();
//	//					}
//	//	    			}
//	//	    		showScreen();}
//	//	    	};
//	//	    	thread = new Thread(runnable);
//	//	    	thread.start();
//	
//		    
//		   
//    }
//	/**
//	 * Changes the intent to the PlayActivity.  Forwards the information concerning toogleMap, showSolution, showVisibleWalls from MainActivity to Play.      
//	 */
//    public void showScreen() {
//    	if (!finishScreen){
//    		Intent playIntent = new Intent(this, PlayActivity.class);
//    		playIntent.putExtra("toggleMap", toggleMapBoolean );
//			playIntent.putExtra("showSolution", showSolutionBoolean);
//			playIntent.putExtra("showVisibleWalls", showVisibleWallsBoolean);
//			playIntent.putExtra("maze", maze);
//    		startActivity(playIntent);
//    		}
//		finish();
//		
//	}
////    private Handler messageHandler = new Handler(){
////    	@Override 
////    	public void handleMessage(Message msg){
////    		switch(msg.what){
////    		generatingProgress.setProgress(count);
////    		}
////    	}
////    };
//
//    
//    /**
//     * Overrides the back button to change the intent back to the main activity.
//     */
//    @Override
//    public void onBackPressed(){
//    	finishScreen = true;
//		Log.v(TAG, "Back");
//		finish();
//    }

    
}

