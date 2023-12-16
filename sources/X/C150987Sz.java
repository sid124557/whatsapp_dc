package X;

import java.util.UUID;

/* renamed from: X.7Sz  reason: invalid class name and case insensitive filesystem */
public final class C150987Sz {
    public UUID A00;
    public boolean A01 = true;
    public final AnonymousClass4FV A02;

    public C150987Sz(AnonymousClass4FV r2) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
    }

    public final AnonymousClass4s0 A00() {
        String str;
        AnonymousClass4s0 r1 = new AnonymousClass4s0();
        UUID uuid = this.A00;
        if (uuid != null) {
            str = uuid.toString();
        } else {
            str = null;
        }
        r1.A05 = str;
        return r1;
    }
}
