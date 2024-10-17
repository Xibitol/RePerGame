package game.soup.reper.character;

/**
 * @author ErnestErgonomique
 */
public sealed abstract class Mage extends Character
    permits MaliciousWizard, BattleMage
{

}
