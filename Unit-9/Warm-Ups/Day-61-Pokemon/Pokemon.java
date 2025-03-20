class Pokemon {
    private int level;
    private String name;
    private String type;

    public Pokemon(String name, int level, String type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    public void levelUp() {
        level++;
    }

    public void attack() {
        System.out.print(name + " attack!");
    }
}
