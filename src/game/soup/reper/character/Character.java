package game.soup.reper.character;

/**
 * @author ErnestErgonomique
 */
public abstract class Character {

    // GETTERS
    public abstract float getHealth();
    public abstract float getAttack();
    public abstract float getPhysicalResistance();
    public abstract float getMagicResistance();
    
    // FUNCTIONS
    public abstract void performNormalAttack();
    public abstract void performAbility();
    public abstract void performUltimate();
}
