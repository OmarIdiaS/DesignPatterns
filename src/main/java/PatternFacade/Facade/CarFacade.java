package PatternFacade.Facade;

import PatternFacade.CarsSubSystem.Engine;
import PatternFacade.CarsSubSystem.Lights;
import PatternFacade.CarsSubSystem.Transmission;

public class CarFacade {
    private Engine engine;
    private Transmission transmission;
    private Lights lights;

    public CarFacade() {
        engine = new Engine();
        transmission = new Transmission();
        lights = new Lights();
    }

    public void startCar(){
        engine.start();
        transmission.shiftUp();
        lights.turnOn();
        System.out.println("Car stared and ready to drive");
    }

    public void stopCar(){
        lights.turnOff();
        transmission.shiftDown();
        engine.stop();
        System.out.println("Car stopped");
    }
}
