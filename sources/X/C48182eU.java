package X;

import java.util.Map;

/* renamed from: X.2eU  reason: invalid class name and case insensitive filesystem */
public final class C48182eU {
    public final Map A00 = C18320x8.A0r();

    public final synchronized C152677Zw A00(String str) {
        return (C152677Zw) this.A00.get(str);
    }

    public final synchronized void A01(String str) {
        this.A00.remove(str);
    }
}
