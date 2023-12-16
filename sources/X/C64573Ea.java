package X;

/* renamed from: X.3Ea  reason: invalid class name and case insensitive filesystem */
public class C64573Ea implements C84354Ca {
    public final C48912fg A00;
    public final C50392i6 A01;
    public final AnonymousClass3ZH A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C64573Ea)) {
            return false;
        }
        C64573Ea r4 = (C64573Ea) obj;
        if (!this.A02.equals(r4.A02) || !this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public C64573Ea(C48912fg r1, C50392i6 r2, AnonymousClass3ZH r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public int B8k() {
        return 1;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A02;
        A1X[1] = this.A01;
        return C18310x6.A08(this.A00, A1X, 2);
    }
}
