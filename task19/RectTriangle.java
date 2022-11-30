package ru.mirea.task19;

public class RectTriangle {
    private final int firstAngle;
    private final int secondAngle;
    private final int thirdAngle;

    public RectTriangle(int fan, int san, int tan) throws BadAngles {
        if (fan != 90 && san != 90 && tan != 90) {
            throw new BadAngles("A triangle is not rectangular, if it doesn't have an angle of 90");
        }
        if (fan + san + tan != 180) {
            throw new BadAngles("The sum of the triangle's angles must be 180");
        }
        if (fan <= 0 || san <= 0 || tan <= 0) {
            throw new BadAngles("One of the angles is less than or equal to 0");
        }
        this.firstAngle = fan;
        this.secondAngle = san;
        this.thirdAngle = tan;
    }

    public int getFirstAngle() {
        return firstAngle;
    }

    public int getSecondAngle() {
        return secondAngle;
    }

    public int getThirdAngle() {
        return thirdAngle;
    }
}
