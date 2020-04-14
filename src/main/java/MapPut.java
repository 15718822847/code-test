import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public interface MapPut<K, V> {
    public void putImpl(K key, V value);

    public default MapPut<K,V> put(K key, V value) {
        putImpl(key, value);
        return this;
    }
    /*
     * 一个简单地使用例子：
     * Map map = MapPut.getHash((mp)->mp.put("a", "b").put("c", "d"));
     * 得到的map中已经储存了两组键值对
     *
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static Map getHash(Consumer<MapPut> mp) {
        Map map = new HashMap();
        mp.accept(map::put);
        return map;
    }
}
