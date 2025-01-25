package frc.robot.subsystems.elevator;

import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.util.Units;

public class ElevatorConstants {
    public static final DCMotor motor = DCMotor.getNEO(2);

    public static final double mass = Units.lbsToKilograms(30.0); // change to actual weight
    public static final double radius = Units.inchesToMeters(0.9175);
    public static final double gearing = 6.75;

    public static final double maxHeight = Units.inchesToMeters(46.5);
    public static final double minHeight = Units.inchesToMeters(0.0);
    public static final double startingHeight = minHeight;

    public static final double p = 0.0;
    public static final double i = 0.0;
    public static final double d = 0.0;

    public static final double s = 0.0;
    public static final double g = 0.0;
    public static final double v = 0.0;
    public static final double a = 0.0;

    public static final double maxProfileVelocity = 0.5;
    public static final double maxProfileAcceleration = 0.5;

    public static final int leftMotorId = 30;
    public static final int rightMotorId = 31;

    public static final double positionConversionFactor = 2.0 * Math.PI * radius / gearing;
    public static final double velocityConversionFactor = positionConversionFactor / 60.0;

    public static final double sysIdMinPosition = 0.1;
    public static final double sysIdMaxPosition = 0.8;

    public static final double sysIdRampUp = 0.5;
    public static final double sysIdStep = 2.5;
    public static final double sysIdTimeout = 20.0;
}