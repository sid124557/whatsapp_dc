package X;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.5QO  reason: invalid class name */
public class AnonymousClass5QO {
    public boolean A00;
    public final C69263Wi A01;
    public final AnonymousClass4FW A02;
    public final C29431io A03;
    public final HashMap A04 = AnonymousClass001.A0t();

    public void A01() {
        this.A00 = true;
        C69263Wi r2 = this.A01;
        r2.A02.post(new C117615sD((Object) this, 8));
    }

    public Collection A00() {
        HashMap hashMap = this.A04;
        if (hashMap.size() == 0) {
            return AnonymousClass002.A0K();
        }
        return hashMap.values();
    }

    public AnonymousClass5QO(C69263Wi r2, AnonymousClass656 r3, AnonymousClass5QO r4, C29431io r5) {
        if (r4 != null) {
            r4.A01();
        }
        this.A01 = r2;
        this.A03 = r5;
        this.A00 = false;
        C113865m7 r0 = new C113865m7(r3, this);
        this.A02 = r0;
        r5.A06(r0);
    }
}
