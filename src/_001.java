public class _001 {
    static String driverPath = "_drivers/browser-drivers/windows/chromedriver.exe";

    static void sleep (long milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
