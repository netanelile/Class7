import java.io.FileWriter;
import java.io.IOException;

public class SingleTon {

    private static SingleTon singleTon = null;

    private SingleTon(){}

    public static SingleTon getInstance(){
        if (singleTon ==null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    public void writeLogsIntoFile(String textInput) {

        try {
            FileWriter myWriter = new FileWriter("log", true);
            myWriter.write(textInput +"\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
