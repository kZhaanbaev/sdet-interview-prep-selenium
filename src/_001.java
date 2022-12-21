public class _001 {
    //For windows
    //static String driverPath = "_drivers/browser-drivers/windows/chromedriver.exe";
    //For Mac
    static String driverPath = "_drivers/browser-drivers/mac64m1/chromedriver";


    static void sleep (long milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
