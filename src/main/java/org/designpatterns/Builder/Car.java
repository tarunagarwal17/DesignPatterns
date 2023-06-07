package org.designpatterns.Builder;

public class Car {
    private int topSpeed;
    private int cost;
    private String company;
    private String tyreType;
    private String color;
    private int version;

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCost() {
        return cost;
    }

    public String getCompany() {
        return company;
    }

    public String getTyreType() {
        return tyreType;
    }

    public String getColor() {
        return color;
    }

    public int getVersion() {
        return version;
    }

    private Car(CarBuilder carBuilder) {
        this.topSpeed = carBuilder.topSpeed;
        this.cost = carBuilder.cost;
        this.company = carBuilder.company;
        this.tyreType = carBuilder.tyreType;
        this.color = carBuilder.color;
        this.version = carBuilder.version;
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                ", cost=" + cost +
                ", company='" + company + '\'' +
                ", tyreType='" + tyreType + '\'' +
                ", color='" + color + '\'' +
                ", version=" + version +
                '}';
    }

    public static class CarBuilder{
        private int topSpeed;
        private int cost;
        private String company;
        private String tyreType;
        private String color;
        private int version;

        public CarBuilder() {
        }

        public CarBuilder setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
            return this;
        }

        public CarBuilder setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public CarBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public CarBuilder setTyreType(String tyreType) {
            this.tyreType = tyreType;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setVersion(int version) {
            this.version = version;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

}
