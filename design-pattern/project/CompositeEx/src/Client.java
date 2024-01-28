public class Client {
    public static void main(String[] args){
      Keyboard keyboard = new Keyboard(5, 2);
      Body body = new Body(100, 70);
      Monitor monitor = new Monitor(20, 30);

      Computer computer = new Computer();
      computer.addKeyboard(keyboard);
      computer.addBody(body);
      computer.addMonitor(monitor);

      // 컴퓨터의 가격과 전력 소비량을 구함
    int computerPrice = computer.getPrice();
    int computerPower = computer.getPower();
    System.out.println("Computer Price: " + computerPrice + "만원");
    System.out.println("Computer Power: " + computerPower + "W");
    }

}