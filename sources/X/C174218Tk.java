package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8Tk  reason: invalid class name and case insensitive filesystem */
public class C174218Tk<K, V> extends LinkedHashMap<K, V> {
    public int cacheLimit;

    public C174218Tk(int i) {
        super(((int) Math.ceil((double) (((float) i) / 0.75f))) + 1, 0.75f, true);
        this.cacheLimit = i;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return C86624Kv.A1W(size(), this.cacheLimit);
    }
}
