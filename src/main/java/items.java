class Items {
    private String name;
    private String key;
    private int frequency;

    // Constructor to initialize the item
    public Items(String name, String key, int frequency) {
        this.name = name;
        this.key = key;
        this.frequency = frequency;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public int getFrequency() {
        return frequency;
    }

    // Optional: Add setters if you need to modify these fields
}
