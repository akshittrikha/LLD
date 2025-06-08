package designPatterns.AdapterDesign.Client;

import designPatterns.AdapterDesign.Adaptee.WeighingMachineImpl;
import designPatterns.AdapterDesign.Adapter.WeighingMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeighingMachineImpl weighingMachine = new WeighingMachineImpl();
        WeighingMachineAdapterImpl weighingMachineAdapter = new WeighingMachineAdapterImpl(weighingMachine);

        System.out.println(weighingMachineAdapter.getWeight());
    }
}
