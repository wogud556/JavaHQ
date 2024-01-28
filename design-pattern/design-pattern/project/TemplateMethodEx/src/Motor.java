public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    public Motor(Door door){
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {return motorStatus;}
    protected void setMotorStatus(MotorStatus motorStatus) {this.motorStatus = motorStatus;}

    public void move(Direction direction){
        MotorStatus motorStatus = getMotorStatus();

        if(motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();

        if(doorStatus == DoorStatus.OPENED) door.close();

        moveMotor(direction);

        setMotorStatue(MotorStatus.MOVING);
    }
}