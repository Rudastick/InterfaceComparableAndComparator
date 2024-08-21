package pl.kurs.homework02.model;

import java.util.Objects;

public class GraphicsCard  {
    private int busWidthMBit;
    private double vRamMemorySize;
    private String model;
    private String producer;

    public GraphicsCard(int busWidthMBit, double vRamMemorySize, String model, String producer) {
        this.busWidthMBit = busWidthMBit;
        this.vRamMemorySize = vRamMemorySize;
        this.model = model;
        this.producer = producer;
    }

    public int getBusWidthMBit() {
        return busWidthMBit;
    }

    public void setBusWidthMBit(int busWidthMBit) {
        this.busWidthMBit = busWidthMBit;
    }

    public double getvRamMemorySize() {
        return vRamMemorySize;
    }

    public void setvRamMemorySize(double vRamMemorySize) {
        this.vRamMemorySize = vRamMemorySize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphicsCard that = (GraphicsCard) o;
        return busWidthMBit == that.busWidthMBit && Double.compare(vRamMemorySize, that.vRamMemorySize) == 0 && Objects.equals(model, that.model) && Objects.equals(producer, that.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busWidthMBit, vRamMemorySize, model, producer);
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "busWidthMBit=" + busWidthMBit +
                ", vRamMemorySize=" + vRamMemorySize +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
