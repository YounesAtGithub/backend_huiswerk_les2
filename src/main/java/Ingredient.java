public class Ingredient {
    int amount; // bijvoorbeeld 200 (gram), 1 (stuk)
    String unit; // bijvoorbeeld gram, snufje, stuks
    String name; // bijvoorbeeld zout, zoete appel, suiker

    public Ingredient(int amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public void LegeConstructor() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

