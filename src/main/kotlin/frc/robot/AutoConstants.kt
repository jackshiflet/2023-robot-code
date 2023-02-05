package frc.robot

import com.revrobotics.CANSparkMax
import edu.wpi.first.math.geometry.Pose2d
import edu.wpi.first.math.geometry.Rotation2d
import edu.wpi.first.math.geometry.Translation2d
import edu.wpi.first.math.kinematics.SwerveDriveKinematics
import edu.wpi.first.math.trajectory.Trajectory
import edu.wpi.first.math.trajectory.TrajectoryConfig
import edu.wpi.first.math.trajectory.TrajectoryGenerator
import edu.wpi.first.math.trajectory.TrapezoidProfile
import edu.wpi.first.math.util.Units


object AutoConstants {

    val kMaxSpeedMetersPerSecond:Double = 1.5
    val kMaxAccelerationMetersPerSecondSquared:Double = 1.5
    val kMaxAngularSpeedRadiansPerSecond:Double = 1000 * Math.PI
    val kMaxAngularSpeedRadiansPerSecondSquared:Double = 1000 * Math.PI

    val kPXController:Double = 0.05
    val kPYController:Double = 0.05
    val kPThetaController:Double = 0.075
    val kDThetaController:Double = 0.4

    // Constraint for the motion profiled robot angle controller
    var kThetaControllerConstraints:TrapezoidProfile.Constraints = TrapezoidProfile.Constraints(
        kMaxAngularSpeedRadiansPerSecond,
        kMaxAngularSpeedRadiansPerSecondSquared
    )

    var config:TrajectoryConfig = TrajectoryConfig(
        kMaxSpeedMetersPerSecond,
        kMaxAccelerationMetersPerSecondSquared).setKinematics(DrivetrainConstants.driveKinematics)


}


