public class AirConditioningTurnOnCommand implements Command {
    private AirConditioning airConditioning;

    public AirConditioningTurnOnCommand(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void execute() {
        airConditioning.turnOn();
    }

    @Override
    public void undo() {
        airConditioning.turnOff();
    }
}
