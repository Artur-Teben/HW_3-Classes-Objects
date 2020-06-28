package main.java.com.teben.count;

public class ObjectCount {
    private static int count;

    public ObjectCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
