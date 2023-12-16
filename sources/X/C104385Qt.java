package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5Qt  reason: invalid class name and case insensitive filesystem */
public class C104385Qt {
    public final int A00;
    public final UserJid A01;
    public final C624134x A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C104385Qt r5 = (C104385Qt) obj;
            if (!(this.A07 == r5.A07 && this.A09 == r5.A09 && this.A04 == r5.A04 && this.A06 == r5.A06 && this.A08 == r5.A08 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02.equals(r5.A02) && AnonymousClass75J.A00(this.A01, r5.A01) && this.A05 == r5.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A02;
        AnonymousClass000.A1R(objArr, this.A07);
        AnonymousClass001.A1S(objArr, this.A09);
        objArr[3] = Boolean.valueOf(this.A04);
        objArr[4] = Boolean.valueOf(this.A06);
        objArr[5] = Boolean.valueOf(this.A08);
        objArr[6] = Boolean.valueOf(this.A03);
        objArr[7] = C18320x8.A0U();
        objArr[8] = Integer.valueOf(this.A00);
        objArr[9] = this.A01;
        return C18310x6.A08(Boolean.valueOf(this.A05), objArr, 10);
    }

    public C104385Qt(UserJid userJid, C624134x r2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A02 = r2;
        this.A07 = z;
        this.A09 = z2;
        this.A04 = z3;
        this.A06 = z4;
        this.A08 = z5;
        this.A03 = z6;
        this.A00 = i;
        this.A01 = userJid;
        this.A05 = z7;
    }
}
