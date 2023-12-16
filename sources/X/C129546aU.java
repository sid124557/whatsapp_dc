package X;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6aU  reason: invalid class name and case insensitive filesystem */
public class C129546aU extends C129586aY<Map.Entry<K, V>> {
    public final /* synthetic */ C129716al this$0;

    public C129546aU(C129716al r1) {
        this.this$0 = r1;
    }

    public Map.Entry get(int i) {
        C162187rP.A01(i, this.this$0.size);
        C129716al r0 = this.this$0;
        int i2 = i * 2;
        Object obj = r0.alternatingKeysAndValues[C129716al.access$200(r0) + i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.this$0.alternatingKeysAndValues[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.this$0.size;
    }
}
