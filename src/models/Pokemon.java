package models;

import java.util.ArrayList;
import java.util.List;

/* @author paolo */
public class Pokemon {

    private String name;
    private int totalHitPoints;
    private int hitPoints;
    private int attack;
    private int defense;
    private int speed;
    private List<Move> moves;
    private List<Move> choosenMoves;

    public Pokemon() {

    }

    public Pokemon(Pokemon pokemon) {
        name = pokemon.name;
        hitPoints = pokemon.hitPoints;
        attack = pokemon.attack;
        defense = pokemon.defense;
        speed = pokemon.speed;
        moves = pokemon.moves;
        choosenMoves = new ArrayList<>();
    }

    /**
     * @return the hitPoints
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * @param hitPoints the hitPoints to set
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * @return the attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * @param attack the attack to set
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * @return the defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * @param defense the defense to set
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the moves
     */
    public List<Move> getMoves() {
        return moves;
    }

    /**
     * @param moves the moves to set
     */
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    /**
     * TODO These are "bussiness" function
     *
     * @param pokemon
     * @param moveNumber
     * @return
     */
    public int damage(Pokemon pokemon, int moveNumber) {
        int damage = (int) ((this.attack / (pokemon.getDefense() + pokemon.getSpeed() * 0.1))
                * moves.get(moveNumber).getBasePower());
        return damage;
    }

    public void getChosenMoves(List<Move> choosenMoves) {
        this.choosenMoves = choosenMoves;
    }

    public List<Move> getChosenMoves() {
        return choosenMoves;
    }

    public boolean lowHP() {
        return (totalHitPoints / 10 <= hitPoints);
    }

    /**
     * @return the totalHitPoints
     */
    public int getTotalHitPoints() {
        return totalHitPoints;
    }

    /**
     * @param totalHitPoints the totalHitPoints to set
     */
    public void setTotalHitPoints(int totalHitPoints) {
        this.totalHitPoints = totalHitPoints;
    }

    public boolean bestDamage(Pokemon p) {
        int maxDamage = -9999;
        //jugada del 0 al 3, el numero 4 es cambiar
        for (int i = 0; i < this.getChosenMoves().size(); i++) {
            int damage = this.damage(p, i);
            if (maxDamage < damage) {
                maxDamage = damage;
            }
        }

        if (p.getHitPoints() - maxDamage <= 0) {
            p.setHitPoints(0);
            return true;
        }
        
        p.setHitPoints(p.getHitPoints()-maxDamage);
        return false;
    }


}
