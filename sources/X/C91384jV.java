package X;

import com.whatsapp.R;

/* renamed from: X.4jV  reason: invalid class name and case insensitive filesystem */
public final class C91384jV extends C151657Vt {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91384jV) {
                C91384jV r5 = (C91384jV) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int A00() {
        return this.A01;
    }

    public Integer A01() {
        return Integer.valueOf(this.A00);
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x9.A04(this.A03), this.A02);
    }

    public C91384jV(boolean z, boolean z2) {
        super(z2, z);
        this.A03 = z;
        this.A02 = z2;
        int i = z ? R.string.f11nameremoved : R.string.f11nameremoved;
        this.A00 = i;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MuteToggle(isMuted=");
        A0o.append(this.A03);
        A0o.append(", canToggleMute=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
