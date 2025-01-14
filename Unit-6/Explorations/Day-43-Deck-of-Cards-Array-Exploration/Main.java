class Main {
    public static void main(String[] args) {
        deckOfCards();
    }

    public static void deckOfCards() {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

/* SECTION 1 */
        // initialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

/* SECTION 2 */
        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

/* SECTION 3 */
        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~   TASK 1 BELOW   ~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~   TASK 2 BELOW   ~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~   TASK 3 BELOW   ~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~   TASK 4 BELOW   ~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~
    // ~~   TASK 5 BELOW   ~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~

    public static void arrayChallenges() {
        // after completing the Card challenges, begin here

    }
}
