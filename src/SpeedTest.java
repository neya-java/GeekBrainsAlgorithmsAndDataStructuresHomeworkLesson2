public class SpeedTest {

    private static Long time;

        public static void startTime() {
        time = System.currentTimeMillis();
    }

    public static void endTime() {
        time = System.currentTimeMillis() - time;
        System.out.printf("%dms", time);

    }
}
