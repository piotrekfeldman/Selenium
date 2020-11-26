package dataUtilities;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyLogger {

    static final Logger logger = Logger.getLogger(MyLogger.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();  //basic configurator stands for setting up the console logs by default

        logger.info("coś");
        PropertyConfigurator.configure("C:\\Users\\piotr\\Testuj.pl\\src\\test\\java\\resources\\log4j.properties");

    }
}
