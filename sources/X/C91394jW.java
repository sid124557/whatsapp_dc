package X;

import com.whatsapp.R;

/* renamed from: X.4jW  reason: invalid class name and case insensitive filesystem */
public final class C91394jW extends C151657Vt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public C91394jW(boolean z, boolean z2) {
        super(z2, false);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = z ? R.string.f11nameremoved : R.string.f11nameremoved;
        this.A00 = z ? R.string.f11nameremoved : R.string.f11nameremoved;
        this.A02 = z ? R.string.f11nameremoved : R.string.f11nameremoved;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91394jW) {
                C91394jW r5 = (C91394jW) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03)) {
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
        return AnonymousClass0x7.A00(AnonymousClass0x9.A04(this.A04), this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Join(isMuted=");
        A0o.append(this.A04);
        A0o.append(", canJoinCall=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
