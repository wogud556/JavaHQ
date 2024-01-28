public class SchedulerFactory {
  
    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID){
        switch (strategyID) {
            case RESPONSE_TIME: // 대기 시간 최소화 전략
              scheduler = new ResponseTimeScheduler();
              break;
            case THROUGHPUT: // 처리량 최대화 전략
              scheduler = new ThroughputScheduler();
              break;
            case DYNAMIC: // 동적 스케줄링
              // 0..23
              int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
              // 오전: 대기 시간 최소화, 오후: 처리량 최대화
              if (hour < 12)
                scheduler = new ResponseTimeScheduler();
              else
                scheduler = new ThroughputScheduler();
              break;
          }
          return scheduler;
    }
}