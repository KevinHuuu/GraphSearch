package edu.berkeley.aep;

// Understands Unit
public enum Unit {
    INCHES(1, 0, "Inches", UnitType.LENGTH),
    FEET(12, 0, "Feet", UnitType.LENGTH),
    YARD(36, 0, "Yard", UnitType.LENGTH),
    MILE(1760 * 36, 0, "Mile", UnitType.LENGTH),
    TSP(1, 0, "Tsp", UnitType.VOLUME),
    TBSP(3, 0, "Tbsp", UnitType.VOLUME),
    OZ(6, 0, "Tsp", UnitType.VOLUME),
    CUP(48, 0, "Tsp", UnitType.VOLUME),
    FAHRENHEIT(5, -32, "F", UnitType.TEMPERATURE),
    CELSIUS(9, 0, "C", UnitType.TEMPERATURE);

    @Override
    public String toString() {
        return name;
    }

    //Define the UnitType
    enum UnitType{
        LENGTH,
        VOLUME,
        TEMPERATURE;
    }

    private final int inBaseUnits;
    private final int offset;
    private final String name;
    private final UnitType type;

    //Constructor
    Unit(int inBaseUnits, int offset, String name, UnitType type) {
        this.inBaseUnits = inBaseUnits;
        this.offset = offset;
        this.name = name;
        this.type = type;
    }

    //Convert the current unit to the input unit type
    int convertTo(Unit unit, int size) throws Exception {
        if (unit.type != type){
            throw new Exception("Wrong type of units! Can not compare " + type + " to " + unit.type);
        }
        return (size + offset) * inBaseUnits / unit.inBaseUnits - unit.offset;
    }


}


