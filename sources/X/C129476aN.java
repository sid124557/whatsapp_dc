package X;

import java.util.Map;

/* renamed from: X.6aN  reason: invalid class name and case insensitive filesystem */
public final class C129476aN extends AnonymousClass8TH<K, V, Map.Entry<K, V>> {
    public final /* synthetic */ AnonymousClass8TE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129476aN(AnonymousClass8TE r1) {
        super(r1);
        this.this$0 = r1;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int findEntryByKey = this.this$0.findEntryByKey(key);
        if (findEntryByKey == -1 || !C1447372t.A00(value, this.this$0.values[findEntryByKey])) {
            return false;
        }
        return true;
    }

    public Map.Entry forEntry(int i) {
        return new C129316a7(this.this$0, i);
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int smearedHash = C159347lg.smearedHash(key);
        int findEntryByKey = this.this$0.findEntryByKey(key, smearedHash);
        if (findEntryByKey == -1 || !C1447372t.A00(value, this.this$0.values[findEntryByKey])) {
            return false;
        }
        this.this$0.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return true;
    }
}
