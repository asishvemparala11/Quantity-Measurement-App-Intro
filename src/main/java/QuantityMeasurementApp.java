public class QuantityMeasurementApp {

    public enum LengthUnit {
        FEET(12.0),
        INCH(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public static class Quantity {
        private final double value;
        private final LengthUnit unit;

        public Quantity(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || !(obj instanceof Quantity)) {
                return false;
            }

            Quantity other = (Quantity) obj;
            
            if (this.unit == null || other.unit == null) {
                return false;
            }

            double thisBaseValue = this.value * this.unit.getConversionFactor();
            double otherBaseValue = other.value * other.unit.getConversionFactor();

            // Using Math.abs to accommodate floating-point rounding precision between conversions
            return Math.abs(thisBaseValue - otherBaseValue) < 0.0001;
        }
    }

    public static class Feet extends Quantity {
        public Feet(double value) {
            super(value, LengthUnit.FEET);
        }
    }

    public static class Inches extends Quantity {
        public Inches(double value) {
            super(value, LengthUnit.INCH);
        }
    }

    public static boolean checkFeetEquality(double val1, double val2) {
        Quantity q1 = new Quantity(val1, LengthUnit.FEET);
        Quantity q2 = new Quantity(val2, LengthUnit.FEET);
        return q1.equals(q2);
    }

    public static boolean checkInchesEquality(double val1, double val2) {
        Quantity q1 = new Quantity(val1, LengthUnit.INCH);
        Quantity q2 = new Quantity(val2, LengthUnit.INCH);
        return q1.equals(q2);
    }

    public static void main(String[] args) {
        System.out.println("Input: Quantity(1.0, YARDS) and Quantity(3.0, FEET)");
        System.out.println("Output: Equal (" + new Quantity(1.0, LengthUnit.YARDS).equals(new Quantity(3.0, LengthUnit.FEET)) + ")");
        System.out.println("Input: Quantity(1.0, YARDS) and Quantity(36.0, INCHES)");
        System.out.println("Output: Equal (" + new Quantity(1.0, LengthUnit.YARDS).equals(new Quantity(36.0, LengthUnit.INCH)) + ")");
        System.out.println("Input: Quantity(2.0, YARDS) and Quantity(2.0, YARDS)");
        System.out.println("Output: Equal (" + new Quantity(2.0, LengthUnit.YARDS).equals(new Quantity(2.0, LengthUnit.YARDS)) + ")");
        System.out.println("Input: Quantity(2.0, CENTIMETERS) and Quantity(2.0, CENTIMETERS)");
        System.out.println("Output: Equal (" + new Quantity(2.0, LengthUnit.CENTIMETERS).equals(new Quantity(2.0, LengthUnit.CENTIMETERS)) + ")");
        System.out.println("Input: Quantity(1.0, CENTIMETERS) and Quantity(0.393701, INCHES)");
        System.out.println("Output: Equal (" + new Quantity(1.0, LengthUnit.CENTIMETERS).equals(new Quantity(0.393701, LengthUnit.INCH)) + ")");
    }
}
