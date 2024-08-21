package pl.kurs.homework01.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private String producer;
    private double weightKG;
    private LocalDate expirationDate;
    private String originCountry;
    private double pricePLN;
    private double vatPercentage;

    public Product(String name, String producer, double weight, LocalDate expirationDate, String originCountry, double pricePLN, double vatPercentage) {
        this.name = name;
        this.producer = producer;
        this.weightKG = weight;
        this.expirationDate = expirationDate;
        this.originCountry = originCountry;
        this.pricePLN = pricePLN;
        this.vatPercentage = vatPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public double getPricePLN() {
        return pricePLN;
    }

    public void setPricePLN(double pricePLN) {
        this.pricePLN = pricePLN;
    }

    public double getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(double vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(weightKG, product.weightKG) == 0 && Double.compare(pricePLN, product.pricePLN) == 0 && Double.compare(vatPercentage, product.vatPercentage) == 0 && Objects.equals(name, product.name) && Objects.equals(producer, product.producer) && Objects.equals(expirationDate, product.expirationDate) && Objects.equals(originCountry, product.originCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, producer, weightKG, expirationDate, originCountry, pricePLN, vatPercentage);
    }

    @Override
    public int compareTo(Product o) {
        int result = name.compareTo(o.name);

        if (result == 0) {
            result = expirationDate.compareTo(o.expirationDate);
        }
        if (result == 0) {
            result = Double.compare(pricePLN, o.pricePLN);
        }
        if (result == 0) {
            result = Double.compare(vatPercentage, o.vatPercentage);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", weight=" + weightKG +
                ", expirationDate='" + expirationDate + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", price=" + pricePLN +
                ", vatPercentage=" + vatPercentage +
                '}';
    }
}
