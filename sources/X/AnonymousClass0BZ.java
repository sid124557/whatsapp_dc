package X;

import java.util.Collections;

/* renamed from: X.0BZ  reason: invalid class name */
public class AnonymousClass0BZ extends C04850Qx {
    public final Object A00;

    public float A07() {
        return 1.0f;
    }

    public Object A0A() {
        C05560Tz r2 = this.A03;
        Object obj = this.A00;
        AnonymousClass0LM r0 = r2.A02;
        r0.A01 = obj;
        r0.A00 = obj;
        return r2.A00(r0);
    }

    public void A0D() {
        if (this.A03 != null) {
            super.A0D();
        }
    }

    public AnonymousClass0BZ(C05560Tz r2, Object obj) {
        super(Collections.emptyList());
        A0F(r2);
        this.A00 = obj;
    }

    public Object A0B(C06230Wt r2, float f) {
        return A0A();
    }

    public void A0E(float f) {
        this.A02 = f;
    }
}
