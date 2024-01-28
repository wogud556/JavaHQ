public class Client {
    public static void main(String[] args){
        ElevatorFactory factory = null;
        String vendorName = args[0];
    
        // 인자에 따라 LG 또는 Hyundai 팩토리를 생성
        if(vendorName.equalsIgnoreCase("LG"))
          factory = new LGElevatorFactory();
        else
          factory = new HyundaiElevatorFactory();
    
        Door door = factory.createDoor(); // 해당 업체의 Door 생성
        Motor motor = factory.createMotor(); // 해당 업체의 Motor 생성
        motor.setDoor(door);
    
        door.open();
        motor.move(Direction.UP);
      }
    }
}