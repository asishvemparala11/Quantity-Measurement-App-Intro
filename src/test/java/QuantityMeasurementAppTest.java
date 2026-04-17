import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testEquality_SameValue() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f1.equals(f2));
    }

    @Test
    void testEquality_DifferentValue() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(2.0);
        assertFalse(f1.equals(f2));
    }

    @Test
    void testEquality_NullComparison() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f1.equals(null));
    }

    @Test
    void testEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        Object nonFeetObject = new Object();
        assertFalse(f1.equals(nonFeetObject));
    }

    @Test
    void testEquality_SameReference() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f1.equals(f1));
    }

    @Test
    void testInchesEquality_SameValue() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches i2 = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(i1.equals(i2));
    }

    @Test
    void testInchesEquality_DifferentValue() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches i2 = new QuantityMeasurementApp.Inches(2.0);
        assertFalse(i1.equals(i2));
    }

    @Test
    void testInchesEquality_NullComparison() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i1.equals(null));
    }

    @Test
    void testInchesEquality_NonNumericInput() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        Object nonInchesObject = new Object();
        assertFalse(i1.equals(nonInchesObject));
    }

    @Test
    void testInchesEquality_SameReference() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(i1.equals(i1));
    }

    @Test
    void testEquality_FeetToFeet_SameValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_InchToInch_SameValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_FeetToInches_EquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_InchToFeet_EquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_FeetToFeet_DifferentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(2.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_InchToInch_DifferentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(2.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_NullUnit() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, null);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_QuantitySameReference() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(q1.equals(q1));
    }

    @Test
    void testEquality_QuantityNullComparison() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertFalse(q1.equals(null));
    }

    @Test
    void testEquality_YardToYard_SameValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_YardToYard_DifferentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(2.0, QuantityMeasurementApp.LengthUnit.YARDS);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_YardToFeet_EquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_FeetToYard_EquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_YardToInches_EquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(36.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_InchesToYard_EquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(36.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_YardToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(2.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_centimetersToInches_EquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(0.393701, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(q1.equals(q2));
    }

    @Test
    void testEquality_centimetersToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_MultiUnit_TransitiveProperty() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.Quantity q3 = new QuantityMeasurementApp.Quantity(36.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(q1.equals(q2));
        assertTrue(q2.equals(q3));
        assertTrue(q1.equals(q3));
    }

    @Test
    void testEquality_YardWithNullUnit() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, null);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_YardSameReference() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        assertTrue(q1.equals(q1));
    }

    @Test
    void testEquality_YardNullComparison() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        assertFalse(q1.equals(null));
    }

    @Test
    void testEquality_CentimetersWithNullUnit() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(1.0, null);
        assertFalse(q1.equals(q2));
    }

    @Test
    void testEquality_CentimetersSameReference() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        assertTrue(q1.equals(q1));
    }

    @Test
    void testEquality_CentimetersNullComparison() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        assertFalse(q1.equals(null));
    }

    @Test
    void testEquality_AllUnits_ComplexScenario() {
        QuantityMeasurementApp.Quantity q1 = new QuantityMeasurementApp.Quantity(2.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.Quantity q2 = new QuantityMeasurementApp.Quantity(6.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.Quantity q3 = new QuantityMeasurementApp.Quantity(72.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(q1.equals(q2));
        assertTrue(q2.equals(q3));
        assertTrue(q1.equals(q3));
    }
}
