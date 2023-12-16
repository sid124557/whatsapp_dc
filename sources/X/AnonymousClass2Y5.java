package X;

import java.util.HashMap;

/* renamed from: X.2Y5  reason: invalid class name */
public class AnonymousClass2Y5 {
    public final HashMap A00 = AnonymousClass001.A0t();
    public final HashMap A01 = AnonymousClass001.A0t();

    public void A00(C53312mt r3) {
        HashMap hashMap = this.A00;
        synchronized (hashMap) {
            hashMap.put(r3.A03, r3);
        }
        if (r3.A01 != null) {
            HashMap hashMap2 = this.A01;
            synchronized (hashMap2) {
                hashMap2.put(r3.A01, r3);
            }
        }
    }
}
