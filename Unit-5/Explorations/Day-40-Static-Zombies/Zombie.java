class Zombie {
    // static variables
    private static int numZombies = 0;
    private static int oldestAge = 0;

    // instance variables
    private String name;
    private int age;

    public Zombie(String name, int age) {
        // initialize instance variables
        this.name = name;
        this.age = age;

        // update static variables
        Zombie.numZombies++;
        
        // check if this is the oldest zombie
        if (this.age > Zombie.oldestAge) {
            Zombie.oldestAge = age;
        }
    }

    public static int getNumZombies() {
        return Zombie.numZombies;
    }

    public static int getOldestAge() {
        return Zombie.oldestAge;
    }

    public boolean isOldestZombie() {
        return age >= Zombie.oldestAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " the zombie is " + age + " years old";
    }
}
