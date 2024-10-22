public class AirConditioningTurnOffCommand implements Command {
    private AirConditioning airConditioning;

    public AirConditioningTurnOffCommand(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void execute() {
        airConditioning.turnOff();
    }

    @Override
    public void undo() {
        airConditioning.turnOn();
    }
}
