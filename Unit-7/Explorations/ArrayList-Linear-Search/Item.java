class Item {

    private String itemName;
    private String upc = "";
    private int inventory;

    public Item(String itemName, int inventory) {
        this.itemName = itemName;
        this.inventory = inventory;

        // generate random 8-digit upc code;
        for (int i = 0; i < 8; i++) {
            this.upc += (char)((int)((Math.random() * 10) + 48));
        }
    }

    public String getItemName() { return this.itemName; }
    public String getUpc() { return this.upc; }
    public int getInventory() { return this.inventory; }
}
