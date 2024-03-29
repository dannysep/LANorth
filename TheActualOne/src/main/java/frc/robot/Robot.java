/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.subsystems.Arm;
import frc.subsystems.Drivetrain;
import frc.subsystems.Wrist;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

//@date 3/12

public class Robot extends TimedRobot {

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    
    
  }
  
  @Override
  public void robotPeriodic() {
    
    Scheduler.getInstance().run();
    
  }
  
  /**
   * This function is run once each time the robot enters autonomous mode.
   */
  @Override
  public void autonomousInit() {
    
    Wrist.getInstance().z();
    Arm.getInstance().z();    
   
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    
    Drivetrain.getInstance().setSpeed(OI.getInstance().getDriveFwd(), OI.getInstance().getDriveHoz());
  
  }
  
  /**
   * This function is called once each time the robot enters teleoperated mode.
   */
  @Override
  public void teleopInit() {

    //should be erased for comp
    Wrist.getInstance().z();
    Arm.getInstance().z();

  }
  
  /**
   * This function is called periodically during teleoperated mode.
   */
  
  
  @Override
  public void teleopPeriodic() {

    Drivetrain.getInstance().setSpeed(OI.getInstance().getDriveFwd(), OI.getInstance().getDriveHoz());
    System.out.println("wrist: " + Wrist.getInstance().getPos());
    System.out.println("arm: " + Arm.getInstance().getPos());
  }

  /**
   * This function is called periodically during test mode.
   */

  @Override
  public void testPeriodic() {
  }

  @Override
  public void disabledInit(){
  }

}