package models;

/**
 * @author paolo
 */
public class Move {
    private String name;
    private String type;
    private int basePower;
    private double accuracy;
    private String kind;
    private String special;
    private int specialChance;

    public Move (){        
    }
    
    public Move (Move e){
        name = e.name;
        type = e.type;
        basePower=e.basePower;
        accuracy = e.accuracy;
    }
    
    /**
     * @return the basePower
     */
    public int getBasePower() {
        return basePower;
    }

    /**
     * @param basePower the basePower to set
     */
    public void setBasePower(int basePower) {
        this.basePower = basePower;
    }

    /**
     * @return the accuracy
     */
    public double getAccuracy() {
        return accuracy;
    }

    /**
     * @param accuracy the accuracy to set
     */
    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }
    
    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSpecial() {
        return special;
    }
    
    public void setSpecial(String special) {
        this.special = special;
    }

    public int getSpecialChance() {
        return specialChance;
    }
    
    public void setSpecialChance(int specialChance) {
        this.specialChance = specialChance;
    }
}