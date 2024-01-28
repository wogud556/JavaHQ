import jdk.nashorn.internal.ir.BreakableNode;

public class MotorFactory {
    public static Motor createMotor(VenderID vendorID){
        Motor motor = null;

        switch(vendorID){
            case LG:
                motor = new LGMotor();
                break;
            case HYUNDAI:
                motor = new HyundaiMotor();
                break;
        }
        return motor;
    }
}