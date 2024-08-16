package HashMap;

public class HashMapBasics {
    private int size;
    private Entry[] buckets;

    public HashMapBasics() {
        size = 16;
        buckets = new Entry[size];
    }

    public void put(String key, String value) {
        int index = hash(key);
        Entry entry = buckets[index];

        if (entry == null) {
            buckets[index] = new Entry(key, value);
        } else {
            while (entry.next != null) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
                entry = entry.next;
            }

            if (entry.key.equals(key)) {
                entry.value = value;
            } else {
                entry.next = new Entry(key, value);
            }
        }
    }

    public String get(String key) {
        int index = hash(key);
        Entry entry = buckets[index];

        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }

    private int hash(String key) {
        return key.hashCode() % size;
    }

    private class Entry {
        String key;
        String value;
        Entry next;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}