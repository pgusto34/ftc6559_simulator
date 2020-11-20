package org.firstinspires.ftc.teamcode.ftc6559;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "FTC 6559 Sample", group = "ftc6559")
public class ftc_6559_sample extends OpMode {
    DcMotor rfMotor;
    DcMotor rrMotor;
    DcMotor lfMotor;
    DcMotor lrMotor;

    @Override
    public void init() {
        rfMotor = hardwareMap.dcMotor.get("front_right_motor");
        rrMotor = hardwareMap.dcMotor.get("back_right_motor");
        lfMotor = hardwareMap.dcMotor.get("front_left_motor");
        lrMotor = hardwareMap.dcMotor.get("back_left_motor");

        lfMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        lrMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void start() {
        // Decimal between 0 (0%) and 1 (100%) with sign for direction

        // Forward
        rfMotor.setPower(1);
        rrMotor.setPower(1);
        lfMotor.setPower(1);
        lrMotor.setPower(1);
    }

    @Override
    public void loop() {
    }

    public void stop() {

    }
}
