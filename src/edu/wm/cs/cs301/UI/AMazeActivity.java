package edu.wm.cs.cs301.UI;


//import edu.wm.cs.cs301.R;

import edu.wm.cs.cs301.falstad.MazeFileReader;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
/**
 * 
 * @author aablohm and jaleo
 * 
 * This class is the initial activity for the AMaze app.  It allows the user to select parameters for the maze.  The user
 * can also generate and save a maze as well as load a previously generated maze.  A reset button changes all the values
 * back to where they were set originally.
 *
 */
public class AMazeActivity extends Activity{// implements OnSeekBarChangeListener {
	int option = 0;
    Context context;
    CharSequence text;
    int duration;
	SeekBar difficulty;
	Spinner algorithms;
	int skillLevel;
	boolean toggleMapBoolean;
	boolean showSolutionBoolean;
	boolean showVisibleWallsBoolean;
	String algorithm;
	String driver;
	int [] algo = new int [1];
	
	private static final String TAG = "TAG_AMazeActivity";
	
	/**
	 * Called when the activity is first created. Provides the original setup for the main activity.  
	 * It also gets the spinners and the seekbar in order to add toasts and logs to them.
	 */
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
    }
//        setContentView(R.layout.main);
//        SeekBar difficulty = (SeekBar) findViewById(R.id.difficulty);
//	    difficulty.setMax(15);
//	    difficulty.setProgress(7);
//	    skillLevel = 7;
//	    difficulty.setOnSeekBarChangeListener(this);
//	    toggleMapBoolean = false;
//	    showSolutionBoolean = false;
//	    showVisibleWallsBoolean = false;
//
//	    final Spinner algorithms = (Spinner) findViewById(R.id.algorithm);
//	    algorithms.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//	    	        public void onItemSelected(AdapterView<?> parent, View arg1,int pos, long arg3) 
//	    	        { 
//	    	             algorithm = (String) parent.getItemAtPosition(pos);
//	    	             Log.v(TAG, algorithm);
//	    	             algo[0]=pos;
//
//	    	             
//	    	        }
//	    	        public void onNothingSelected(AdapterView<?> arg0) {
//	    	        }
//	    });
//	    
//	    final Spinner robotDriver = (Spinner) findViewById(R.id.robotDriverSpinner);
//	    robotDriver.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//	        public void onItemSelected(AdapterView<?> parent, View arg1,int pos, long arg3) 
//	        { 
//	             String driver = (String) parent.getItemAtPosition(pos);
//	             Log.v(TAG, driver);
//
//
//	        }
//	        public void onNothingSelected(AdapterView<?> arg0) {
//	        }
//});
//
//	    context = getApplicationContext();
//	    TextView level = (TextView) findViewById(R.id.level);
//	    level.setTextColor(Color.BLACK);
//	 
//	}
//	
//    /**
//     * Creates toasts for all of the different buttons.  Changes the intent if the reset button or the generate button
//     * is selected.
//     * 
//     * @param clickedButton
//     */
//	public void showGeneratingScreen(View clickedButton) {
//		
//		Button b = (Button) clickedButton;
//
//		   // do what I need to do when a button is clicked here...
//		switch (b.getId()){
//			case R.id.resetButton:
//				text = "Reset";
//		    	Intent startOver = new Intent(this, AMazeActivity.class);
//		    	startActivity(startOver);
//		    	finish();
//				Log.v(TAG,"Reset");
//				break;
//			case R.id.loadButton:
//				option =1;
//				text = "Load";
//				Log.v(TAG, "Load");
//				break;
//			case R.id.saveButton:
//				option =2;
//				text ="Save";
//				Log.v(TAG, "Save");
//				break;
//			case R.id.algorithm:
//				text ="Maze Algorithm";
//				Log.v(TAG, "Maze Algorithm");
//				break;
//			case R.id.robotDriverWords:
//				text = "Robot Driver";
//				Log.v(TAG, "Robot Driver");
//				break;
//			case R.id.showSolution:
//				showSolutionBoolean =! showSolutionBoolean;
//				text = "Show Solution";
//				Log.v(TAG, "Show Solution");
//				break;
//			case R.id.showVisibleWalls:
//				text = "Show Visible Walls";
//				showVisibleWallsBoolean =! showVisibleWallsBoolean;
//				Log.v(TAG, "Show Visible Walls");
//				break;
//			case R.id.toggleMap:
//				text = "Show Map";
//				toggleMapBoolean =!toggleMapBoolean;
//				Log.v(TAG, "Show Map");
//				Log.v(TAG, "mapBoolean");
//				break;
//			case R.id.generateMazeButton:
//				Log.v(TAG, "Generate");
//				Intent generatingIntent = new Intent(this, GeneratingActivity.class);
//				generatingIntent.putExtra("level", skillLevel );
//				Log.v(TAG, ""+toggleMapBoolean);
//				generatingIntent.putExtra("generate_state", option);
//				generatingIntent.putExtra("toggleMap", toggleMapBoolean );
//				generatingIntent.putExtra("showSolution", showSolutionBoolean);
//				generatingIntent.putExtra("showVisibleWalls", showVisibleWallsBoolean);
//				generatingIntent.putExtra("algorithm", algo);
//				generatingIntent.putExtra("driver", driver);
//				startActivity(generatingIntent);
//				break;
//		}
//
//	}
//	
//	/**
//	 * Tracks the user's changes to the seekBar and indicates the integer value of these changes.
//	 */
//	@Override
//	public void onProgressChanged(SeekBar seekBar, int level,
//			boolean fromUser) {
//		Log.v("ze level", ""+level);
//		skillLevel = level;
//		Log.v(TAG, "Progress Bar");
//		TextView tv = (TextView) findViewById(R.id.level);
//		tv.setText(Integer.toString(skillLevel));
//		
//	}
//	
//	/**
//	 * Method required to implement OnSeekBarChangeListener
//	 */
//	@Override
//	public void onStartTrackingTouch(SeekBar seekBar) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	/**
//	 * Method required to implement OnSeekBarChangeListener
//	 */
//	@Override
//	public void onStopTrackingTouch(SeekBar seekBar) {
//		// TODO Auto-generated method stub
//		
//	}
}