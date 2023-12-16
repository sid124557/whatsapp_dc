package X;

import android.util.LruCache;
import java.util.List;

/* renamed from: X.2fI  reason: invalid class name and case insensitive filesystem */
public final class C48682fI {
    public final LruCache A00 = new LruCache(300);
    public final C55682qk A01;

    public C48682fI(C55682qk r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
    }

    public final List A00(String str) {
        if (str == null) {
            return null;
        }
        List list = (List) this.A00.get(str);
        if (list == null) {
            this.A01.A0A("mention cache miss", false, (String) null);
        }
        return list;
    }

    public final void A01(String str, List list) {
        C162457s7.A0J(str, 0);
        this.A00.put(str, list);
    }
}
