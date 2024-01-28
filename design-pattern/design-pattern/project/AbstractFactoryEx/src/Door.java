public abstract class Door {
    private DoorStatus doorStatus;

    public  Door() {doorStatus = DoorStatus.CLOSED;}
    public DoorStatus getDoorStatus() {return doorStatus;}

    protected abstract void doClose();

    public void close(){
        if(doorStatus == DoorStatus.CLOSED)
            return;
        
        doClose();
        doorStatus = DoorStatus.CLOSED;
    }
    
    protected abstract void doOpen();

    public void open(){
        //1)이미 문이 열려 있으면 무시한다.
        if(doorStatus == DoorStatus.OPENED)
            return;
        //2)문을 닫는다. -> 제조업체에 따라 다르다.
        doOpen();
        doorStatus = DoorStatus.OPENED;
        //3)문의 상태를 '닫힘'으로 설정한다.
    }
}