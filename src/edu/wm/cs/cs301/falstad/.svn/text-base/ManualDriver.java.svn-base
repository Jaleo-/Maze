/**
 * 
 */
package edu.wm.cs.cs301.falstad;



/**
 * @author aablohm,jaelo
 * Today we start our story with our dear friend Manual, cousin to Mexican war hero Manuel.  
 * Manual's basic purpose in life is to create a Robot that allows the player to manually operate it.  
 * In many regards this would seem almost exact to how a player would typically play, but with certain added features.
 * Now the player is given the task of God as they can play in regards to the robot's safety or act in the nature of killing
 * the poor innocent robot(draining the battery).   
 *
 */
public class ManualDriver implements RobotDriver {
	
	Robot optimus = new BasicRobot();

	
	public ManualDriver(){
		
	}

	@Override
	/**
	 * Maze calls this function so that we can assign the robot that will be used within the application.  
	 */
	public void setRobot(Robot r) throws UnsuitableRobotException {
		optimus = r;	
	}

	@Override
	/**
	 * The robot will continue to be able to drive until it's battery is depleted.  Then it remains frozen, only terminating him now will
	 * he truly be saved....and they said this was a kid friendly game.
	 */
	public boolean drive2Exit() throws Exception {
		if(optimus.hasStopped())
			return false;
		return true;
	}

	@Override
	/**
	 * The robot's actions require a certain amount of energy to function.  This function keeps track of the the amount of the total
	 * energy consumed by this robot. 
	 * 
	 */
	public float getEnergyConsumption() {
		return 2500 - optimus.getCurrentBatteryLevel();
	}

	@Override
	/**
	 * Finds the number of steps that the robot has taken.
	 * 
	 */
	public int getPathLength() {
		return optimus.getCurrentPosition()[2];
	}


	/**
	 * Sends commands to the robot, which will either rotate left/right or move forward/backward depending on what key is pressed.
	 * The key should always be obeyed until the robot no longer has the means or will to move (battery <= 0).
	 * 
	 */
	public void keyPressed(int arrow) {
			//Up=0
			if (arrow == 0 && !optimus.hasStopped()){

				try {
					optimus.move(1, true) ;
				} catch (HitObstacleException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			//Down=1
			if (arrow == 1 && !optimus.hasStopped()){
				try {
					optimus.move(1, false) ;
				} catch (HitObstacleException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			//Left=2
			if (arrow == 2 && !optimus.hasStopped()){
				try {
					optimus.rotate(90) ;
				} catch (UnsupportedArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//Right = 3
			if (arrow == 3 && !optimus.hasStopped()){
				try {
					optimus.rotate(-90) ;
				} catch (UnsupportedArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		//System.out.println("Calling keydown with " + key) ;

	}



	

}






