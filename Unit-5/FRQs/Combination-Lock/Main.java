class Main {
    public static void main(String[] args) {
        // tests DO NOT ALTER
        CombinationLock comboLock = new CombinationLock("frog");
        System.out.println(comboLock.getClue("oooo"));
        System.out.println(comboLock.getClue("flip"));
        System.out.println(comboLock.getClue("form"));
        System.out.println(comboLock.getClue("frag"));
        System.out.println(comboLock.getClue("frog"));
    }
}