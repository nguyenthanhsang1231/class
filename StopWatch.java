import java.time.LocalTime;
import java.time.temporal.Temporal;
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }

    public LocalTime getEndTime(LocalTime endTime) {
        return endTime;
    }

    StopWatch() {
        startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
        getStartTime(startTime);
    }

    public void stop() {
        this.endTime = LocalTime.now();
        getEndTime(endTime);
    }

    public void getElapsedTime() {
        int ElaspedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay()) * 100;
        System.out.println("Số mili giây đếm đc:" + ElaspedTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian");
        for (int i = 1; 1 <= 1000000; i++)
            stopWatch.stop();
    }
}
