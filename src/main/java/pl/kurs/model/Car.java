package pl.kurs.model;

import java.util.Objects;

public class Car {
    private String fproducer;
    private String model;
    private char modelCode;
    private int powerHp;
    private int torqueNm;
    private int vMaxInKph;

    public Car(String fproducer, String model, char modelCode, int powerHp, int torqueNm, int vMaxInKph) {
        this.fproducer = fproducer;
        this.model = model;
        this.modelCode = modelCode;
        this.powerHp = powerHp;
        this.torqueNm = torqueNm;
        this.vMaxInKph = vMaxInKph;
    }

    public String getFproducer() {
        return fproducer;
    }

    public void setFproducer(String fproducer) {
        this.fproducer = fproducer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getModelCode() {
        return modelCode;
    }

    public void setModelCode(char modelCode) {
        this.modelCode = modelCode;
    }

    public int getPowerHp() {
        return powerHp;
    }

    public void setPowerHp(int powerHp) {
        this.powerHp = powerHp;
    }

    public int getTorqueNm() {
        return torqueNm;
    }

    public void setTorqueNm(int torqueNm) {
        this.torqueNm = torqueNm;
    }

    public int getvMaxInKph() {
        return vMaxInKph;
    }

    public void setvMaxInKph(int vMaxInKph) {
        this.vMaxInKph = vMaxInKph;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + fproducer + '\'' +
                ", model='" + model + '\'' +
                ", modelCode=" + modelCode +
                ", powerHp=" + powerHp +
                ", torqueNm=" + torqueNm +
                ", vMaxInKph=" + vMaxInKph +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelCode == car.modelCode && powerHp == car.powerHp && torqueNm == car.torqueNm && vMaxInKph == car.vMaxInKph && Objects.equals(fproducer, car.fproducer) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fproducer, model, modelCode, powerHp, torqueNm, vMaxInKph);
    }
}
