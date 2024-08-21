package pl.kurs.homework02.model;

import java.util.Objects;

public class Motherboard {
    private String socket;
    private String producer;
    private String model;

    public Motherboard(String socket, String producer, String model) {
        this.socket = socket;
        this.producer = producer;
        this.model = model;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
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
        Motherboard that = (Motherboard) o;
        return Objects.equals(socket, that.socket) && Objects.equals(producer, that.producer) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socket, producer, model);
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "socket='" + socket + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
