package pl.kurs.homework02.model;

import java.util.Objects;

public class Processor {
    private String producer;
    private String model;
    private double processorClockSpeedGHZ;
    private String gen;
    private double nodesNM;

    public Processor(String producer, String model, double processorClockSpeedGHZ, String gen, double nodesNM) {
        this.producer = producer;
        this.model = model;
        this.processorClockSpeedGHZ = processorClockSpeedGHZ;
        this.gen = gen;
        this.nodesNM = nodesNM;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getProcessorClockSpeedGHZ() {
        return processorClockSpeedGHZ;
    }

    public void setProcessorClockSpeedGHZ(double processorClockSpeedGHZ) {
        this.processorClockSpeedGHZ = processorClockSpeedGHZ;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getNodesNM() {
        return nodesNM;
    }

    public void setNodesNM(double nodesNM) {
        this.nodesNM = nodesNM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return Double.compare(processorClockSpeedGHZ, processor.processorClockSpeedGHZ) == 0 && Double.compare(nodesNM, processor.nodesNM) == 0 && Objects.equals(producer, processor.producer) && Objects.equals(model, processor.model) && Objects.equals(gen, processor.gen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, processorClockSpeedGHZ, gen, nodesNM);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", processorClockSpeedGHZ=" + processorClockSpeedGHZ +
                ", gen='" + gen + '\'' +
                ", nodesNM=" + nodesNM +
                '}';
    }
}

