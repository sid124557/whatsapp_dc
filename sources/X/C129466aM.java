package X;

import java.util.Map;

/* renamed from: X.6aM  reason: invalid class name and case insensitive filesystem */
public class C129466aM<K, V> extends AnonymousClass8TH<K, V, Map.Entry<V, K>> {
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int findEntryByValue = this.biMap.findEntryByValue(key);
        if (findEntryByValue == -1 || !C1447372t.A00(this.biMap.keys[findEntryByValue], value)) {
            return false;
        }
        return true;
    }

    public Map.Entry forEntry(int i) {
        return new C129336a9(this.biMap, i);
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int smearedHash = C159347lg.smearedHash(key);
        int findEntryByValue = this.biMap.findEntryByValue(key, smearedHash);
        if (findEntryByValue == -1 || !C1447372t.A00(this.biMap.keys[findEntryByValue], value)) {
            return false;
        }
        this.biMap.removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return true;
    }

    public C129466aM(AnonymousClass8TE r1) {
        super(r1);
    }
}
