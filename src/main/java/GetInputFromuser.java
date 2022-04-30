import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SplittableRandom;

class GetInputFromUser {
    private String name;
    private String Age;
    private String Address;
    private String PhoneNumber;
    private Scanner scan = new Scanner(System.in);

    public  GetInputFromUser(){

        System.out.println("Please enter Your Name");
        setName(scan.next());
        System.out.println("Please enter your Age");
        setAge(scan.next());
        System.out.println("Please enter you address");
        setAddress(scan.next());
        System.out.println("Please enter your Phone Numer");
        setPhoneNumber(scan.next());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
