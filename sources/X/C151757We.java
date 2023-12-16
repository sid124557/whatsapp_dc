package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.7We  reason: invalid class name and case insensitive filesystem */
public final class C151757We {
    public Map A00 = null;
    public C158337jo[] A01;
    public final String A02;
    public final byte[] A03;

    public void A00(C141716w1 r3, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(C141716w1.class);
            this.A00 = map;
        }
        map.put(r3, obj);
    }

    public String toString() {
        return this.A02;
    }

    public C151757We(String str, byte[] bArr, C158337jo[] r4) {
        System.currentTimeMillis();
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = r4;
    }
}
