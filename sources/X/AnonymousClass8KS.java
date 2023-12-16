package X;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8KS  reason: invalid class name */
public final class AnonymousClass8KS implements Closeable {
    public final int A00;
    public final Map A01;
    public final ConcurrentHashMap A02;

    public final Map A00() {
        ConcurrentHashMap concurrentHashMap = this.A02;
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator A0u = AnonymousClass001.A0u(concurrentHashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            C172258Kh r1 = (C172258Kh) A0w.getValue();
            C162457s7.A0H(r1);
            if (r1.A04() && !C172258Kh.A00(r1).isRecycled()) {
                C18270x1.A1N(A0r, A0w);
            }
        }
        return A0r;
    }

    public void close() {
        ConcurrentHashMap concurrentHashMap = this.A02;
        Collection<C172258Kh> values = concurrentHashMap.values();
        C162457s7.A0D(values);
        for (C172258Kh close : values) {
            close.close();
        }
        concurrentHashMap.clear();
    }

    public AnonymousClass8KS(Map map, Map map2) {
        int i;
        Bitmap A002;
        this.A01 = map2;
        this.A02 = new ConcurrentHashMap(map);
        int i2 = 0;
        for (C172258Kh r1 : map.values()) {
            if (!r1.A04() || (A002 = C172258Kh.A00(r1)) == null) {
                i = 0;
            } else {
                try {
                    i = A002.getAllocationByteCount();
                } catch (NullPointerException unused) {
                    i = A002.getByteCount();
                }
            }
            i2 += i;
        }
        this.A00 = i2;
    }
}
