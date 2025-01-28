package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="FromAndroidStudio")
public class Testandroid1_28 extends LinearOpMode {


    private DcMotor rf_motor = null;
    private DcMotor lf_motor = null;

    @Override
    public void runOpMode() {

        rf_motor  = hardwareMap.get(DcMotor.class, "rf_motor");
        lf_motor  = hardwareMap.get(DcMotor.class, "lf_motor");


        waitForStart();

        rf_motor.setPower(.5);
        lf_motor.setPower(.5);

        sleep(5000);

        rf_motor.setPower(0);
        lf_motor.setPower(0);



    }



}
