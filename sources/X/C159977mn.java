package X;

import android.util.LruCache;

/* renamed from: X.7mn  reason: invalid class name and case insensitive filesystem */
public class C159977mn {
    public static final C159977mn A01 = new C159977mn();
    public LruCache A00;

    public static synchronized C159977mn A00() {
        C159977mn r0;
        synchronized (C159977mn.class) {
            r0 = A01;
        }
        return r0;
    }
}
