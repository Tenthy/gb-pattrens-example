package ru.kmetha.patterns.entity.builders;

public class Car {

    private String brandName;
    private String model;
    private String color;
    private Integer releaseYear;
    private Long horsepower;
    private Long marketValue;

    public Car() {
        super();
    }

    public Car(String brandName, String model, String color, Integer releaseYear, Long horsepower, Long marketValue) {
        this();
        this.brandName = brandName;
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsepower = horsepower;
        this.marketValue = marketValue;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Long getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Long horsepower) {
        this.horsepower = horsepower;
    }

    public Long getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Long marketValue) {
        this.marketValue = marketValue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                ", horsepower=" + horsepower +
                ", marketValue=" + marketValue +
                '}';
    }

    public static class CarBuilder {
        private String brandName;
        private String model;
        private String color;
        private Integer releaseYear;
        private Long horsepower;
        private Long marketValue;

        public CarBuilder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder releaseYear(Integer releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public CarBuilder horsepower(Long horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public CarBuilder marketValue(Long marketValue) {
            this.marketValue = marketValue;
            return this;
        }
    }
}
