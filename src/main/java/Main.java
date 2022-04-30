import Factory.CarFactory;
import Factory.Drivable;
import org.junit.Test;

public class Main {
    //1. Design patterns are not language dependent.

    public static void main(String[] args) {
        //2.

        GetInputFromUser gifu = new GetInputFromUser();
        SingleTon singleTon = SingleTon.getInstance();

        singleTon.writeLogsIntoFile(gifu.getName());
        singleTon.writeLogsIntoFile(gifu.getAge());
        singleTon.writeLogsIntoFile(gifu.getAddress());
        singleTon.writeLogsIntoFile(gifu.getPhoneNumber());


    }

    //3.
    @Test
    public void carFactoryTest() throws Exception {

        CarFactory carFactory = new CarFactory();
        Drivable drivable = carFactory.getCar("fiat");
        drivable.drive();
    }

    //4. https://github.com/netanelile/NetanelJavaProject
    //5. Maven is a project management tool where you can easily download with the POM file a large verity of External Java Libraries.



}
