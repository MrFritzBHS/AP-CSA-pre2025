class Main {
    public static void main(String[] args) {
        // create a couple of zombies, NBD
        Zombie zombA = new Zombie("Hank", 12);
        Zombie zombB = new Zombie("Geraldine", 29);
        
        // check if zombA is the oldest
        System.out.println(
            zombA.getName() + " is the oldest zombie: " + zombA.isOldestZombie()
        );
        
        // check if zombB is the oldest
        System.out.println(
            zombB.getName() + " is the oldest zombie: " + zombB.isOldestZombie()
        );

        // print static variable to see number of zombies created
        System.out.println("Num of zombies created: " + Zombie.getNumZombies());

        /*
            YOU DO THE STUFF BELOW
        */
        // Create two more Zombie objects:
            // one who is 35
            // one who is 5
        
        // For each Zombie object, print the object as well as a 
            // statement declaring if it is the oldest zombie 
            // (like in the example)
        
        
        // Finally, use the Zombie static methods to print the number
            // of zombies created as well as the age of the 
            // oldest zombie.
    }
}
