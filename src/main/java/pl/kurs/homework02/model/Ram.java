package pl.kurs.homework02.model;

import java.util.Objects;

public class Ram {
    private double sizeGB;
    private double frequencyMhz;
    private String ddrType;
    private String producer;
    private String model;

    public Ram(double sizeGB, double frequencyMhz, String ddrType, String producer, String model) {
        this.sizeGB = sizeGB;
        this.frequencyMhz = frequencyMhz;
        this.ddrType = ddrType;
        this.producer = producer;
        this.model = model;
    }

    public double getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(double sizeGB) {
        this.sizeGB = sizeGB;
    }

    public double getFrequencyMhz() {
        return frequencyMhz;
    }

    public void setFrequencyMhz(double frequencyMhz) {
        this.frequencyMhz = frequencyMhz;
    }

    public String getDdrType() {
        return ddrType;
    }

    public void setDdrType(String ddrType) {
        this.ddrType = ddrType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ram ram = (Ram) o;
        return Double.compare(sizeGB, ram.sizeGB) == 0 && Double.compare(frequencyMhz, ram.frequencyMhz) == 0 && Objects.equals(ddrType, ram.ddrType) && Objects.equals(producer, ram.producer) && Objects.equals(model, ram.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeGB, frequencyMhz, ddrType, producer, model);
    }

    @Override
    public String toString() {
        return "Ram{" +
                "sizeGB=" + sizeGB +
                ", frequencyMhz=" + frequencyMhz +
                ", ddrType='" + ddrType + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
