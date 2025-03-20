class Pikachu extends Pokemon {

    public Pikachu(int level) {
        super("Pikachu", "Lightning", level);
    }

    @Override
    public void attack() {
        System.out.println("Pikachu attacks with lightning");
    }
}
