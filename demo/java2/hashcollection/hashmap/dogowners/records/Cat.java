package demo.java2.hashcollection.hashmap.dogowners.records;

public record Cat(String name, int age, int height) {
    public boolean isOld() {
        return age() > 4;
    }
}
