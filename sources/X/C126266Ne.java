package X;

import android.content.Context;

/* renamed from: X.6Ne  reason: invalid class name and case insensitive filesystem */
public class C126266Ne extends C126276Nf implements C180538lE, C177908ge {
    public AnonymousClass853 A00;

    public void A02(Context context) {
        C158107jR r0;
        synchronized (C158107jR.class) {
            r0 = C158107jR.A03;
            if (r0 == null) {
                r0 = new C158107jR(context);
                C158107jR.A03 = r0;
            }
        }
        this.A00 = r0;
        this.A01 = this;
        this.A00 = new AnonymousClass853(context, this);
    }

    public C180528lD Azh(C150297Qb r4) {
        if (!(this instanceof C126256Nd)) {
            return null;
        }
        C126256Nd r2 = (C126256Nd) this;
        C162457s7.A0J(r4, 0);
        String A01 = r4.A01();
        switch (A01.hashCode()) {
            case 101264299:
                if (A01.equals("eviction.v2")) {
                    return (AnonymousClass851) r2.A01.A00.getValue();
                }
                return null;
            case 351608024:
                if (A01.equals("version")) {
                    return (AnonymousClass850) r2.A01.A03.getValue();
                }
                return null;
            case 408072700:
                if (A01.equals("max_size")) {
                    return (AnonymousClass852) r2.A01.A01.getValue();
                }
                return null;
            case 1738660166:
                if (A01.equals("stale_removal")) {
                    return (C1683284z) r2.A01.A02.getValue();
                }
                return null;
            default:
                return null;
        }
    }

    public C126266Ne(Context context) {
        A02(context);
    }

    public C126266Ne() {
    }
}
