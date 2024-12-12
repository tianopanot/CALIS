public class Item {
    private String name;
    private String key;
    private int frequency;

    public Item(String name, String key, int frequency) {
        this.name = name;
        this.key = key;
        this.frequency = frequency;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public int getFrequency() {
        return frequency;
    }

    // Increment the frequency of the item
    public void incrementFrequency() {
        this.frequency++;
    }

    // Decrement the frequency of the item
    public void decrementFrequency() {
        if (this.frequency > 0) {
            this.frequency--;
        }
    }

}
