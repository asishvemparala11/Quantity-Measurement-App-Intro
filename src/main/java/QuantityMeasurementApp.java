public class QuantityMeasurementApp {

    public enum LengthUnit {
        FEET(12.0),
        INCH(1.0);

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

            return Double.compare(thisBaseValue, otherBaseValue) == 0;
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
        System.out.println("Input: Quantity(1.0, \"feet\") and Quantity(12.0, \"inches\")");
        System.out.println("Output: Equal (" + new Quantity(1.0, LengthUnit.FEET).equals(new Quantity(12.0, LengthUnit.INCH)) + ")");
        System.out.println("Input: Quantity(1.0, \"inch\") and Quantity(1.0, \"inch\")");
        System.out.println("Output: Equal (" + new Quantity(1.0, LengthUnit.INCH).equals(new Quantity(1.0, LengthUnit.INCH)) + ")");
    }
}
