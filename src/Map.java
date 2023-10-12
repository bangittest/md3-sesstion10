public class Map <K,V>{
    private K key;
    private V value;


    public  Map(){

    }
    private Element<K,V> element;
    public Map(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
