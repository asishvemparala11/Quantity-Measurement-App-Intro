public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            // Step 5 - Equals Method Implementation
            
            // Check if the object is the same reference
            if (this == obj) {
                return true;
            }

            // Check if the object is null or a different type
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            // Cast to Feet type safely
            Feet feet = (Feet) obj;

            // Compare double values using Double.compare()
            return Double.compare(feet.value, this.value) == 0;
        }
    }

    public static void main(String[] args) {
        // Step 6 - Main Method
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        
        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + f1.equals(f2) + ")");
    }
}
