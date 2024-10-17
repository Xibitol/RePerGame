package game.soup.reper.character;

/**
 * @author ErnestErgonomique
 */
public sealed abstract class Warrior extends Character
    permits Knight, Assassin
{

}
