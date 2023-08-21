package PatternFacade.Client;

import PatternFacade.Facade.CarFacade;

public class ClientApp {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();

        carFacade.startCar();
        System.out.println("                ================================");
        System.out.println("================                                ================");
        System.out.println("================                                ===============0");
        System.out.println("================                                ===============0");
        System.out.println("===========0=======================================O============");
        carFacade.stopCar();
    }
}
