public class DoorFactory {
    public static Motor createMotor(VenderID vendorID){
        Motor motor = null;

        switch(vendorID){
            case LG:
                motor = new LGDoor();
                break;
            case HYUNDAI:
                motor = new HyundaiDoor();
                break;
        }
        return motor;
    }
}