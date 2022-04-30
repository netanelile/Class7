package Factory;

public class CarFactory {

    public Drivable getCar(String carType) throws Exception {
        if(carType == null){
            return null;
        }
        if(carType.equalsIgnoreCase("bmw")){
            return new Bmw();
        }else if (carType.equalsIgnoreCase("fiat")){
            return new Fiat();
        }else if (carType.equalsIgnoreCase("porsche")){
            return new Porsche();
        }else {
            throw new Exception("Wrong Car Input");
        }
    }
}
