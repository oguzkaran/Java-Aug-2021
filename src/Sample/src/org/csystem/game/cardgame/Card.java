package org.csystem.game.cardgame;

public class Card {

   private CardValue m_value;
   private CardType m_type;			
   //...

  public static Card[] getDeck()
  {
     Card[] deck = new Card[52];

     int index = 0;

     for (CardType type : CardType.values())
        for (CardValue value : CardValue.values())
           deck[index++] = new Card(value, type);

     return deck;
  }

  public static Card[] getShuffledDeck()
  {
      Card[] deck = getDeck();
      //...

      return deck;
  }

   public Card(CardValue value, CardType type)
   {
      m_value = value;
      m_type = type;
   }

   //...

   public String toString()
   {
      return String.format("%s-%s", m_type.toString(), m_value.toString());
   }
	
   //...
}
