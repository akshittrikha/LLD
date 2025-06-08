package designPatterns.AdapterDesign.Adapter;

import designPatterns.AdapterDesign.Adaptee.WeighingMachine;
import designPatterns.AdapterDesign.Adaptee.WeighingMachineImpl;

public class WeighingMachineAdapterImpl implements WeighingMachineAdapter {
    WeighingMachine weighingMachine;

    public WeighingMachineAdapterImpl(WeighingMachineImpl weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    private double poundToKg(double value) {
        return value * 0.45;
    }

    @Override
    public double getWeight() {
        double weightInPounds = this.weighingMachine.getWeight();

        return poundToKg(weightInPounds);
    }
}