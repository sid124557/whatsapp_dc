package X;

import android.util.LruCache;

/* renamed from: X.7nT  reason: invalid class name and case insensitive filesystem */
public final class C160337nT {
    public static final C160337nT A01 = new C160337nT();
    public LruCache A00 = new LruCache(50);

    public synchronized Boolean A01(String str) {
        return Boolean.valueOf(AnonymousClass000.A1W(this.A00.get(str)));
    }

    public synchronized void A02(String str, String str2) {
        this.A00.put(str, str2);
    }

    public static C160337nT A00() {
        return A01;
    }
}
