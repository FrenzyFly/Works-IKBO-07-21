package ru.mirea.task28;

public class Automobile {
    public enum TireType {
        Studded,
        OffRoad,
        Road,
        RacingSlick
    }

    public enum TransmissionType {
        Robot,
        Mechanical,
        VariableSpeedDrive,
        AutomaticTransmission
    }

    public static class Wheel {
        private double wheelPressure;
        private TireType type;

        public Wheel(double wp, TireType t) {
            this.wheelPressure = wp;
            this.type = t;
        }

        public double getWheelPressure() {
            return wheelPressure;
        }

        public void setWheelPressure(double wp) {
            this.wheelPressure = wp;
        }

        public TireType getType() {
            return type;
        }

        public void setType(TireType t) {
            this.type = t;
        }
    }

    public static class Engine {
        private double volume;
        private int HorsePower;

        public Engine(double v, int hp) {
            this.volume = volume;
            this.HorsePower = hp;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double v) {
            this.volume = v;
        }

        public int getPointsOfHorsePower() {
            return HorsePower;
        }

        public void setPointsOfHorsePower(int hp) {
            this.HorsePower = hp;
        }
    }

    public static class Transmission {
        private int adhesionDegree;
        private TransmissionType transmissionType;

        public Transmission(int ad, TransmissionType tt) {
            this.adhesionDegree = ad;
            this.transmissionType = tt;
        }

        public int getAdhesionDegree() {
            return adhesionDegree;
        }

        public void setAdhesionDegree(int ad) {
            this.adhesionDegree = ad;
        }

        public TransmissionType getTransmissionType() {
            return transmissionType;
        }

        public void setTransmissionType(TransmissionType tt) {
            this.transmissionType = tt;
        }
    }

    private Wheel wheel;
    private Engine engine;
    private Transmission transmission;

    public Automobile(Wheel w, Engine e, Transmission t) {
        this.wheel = w;
        this.engine = e;
        this.transmission = t;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel w) {
        this.wheel = w;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine e) {
        this.engine = e;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission t) {
        this.transmission = t;
    }
}
