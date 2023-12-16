package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2i6  reason: invalid class name and case insensitive filesystem */
public class C50392i6 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C95814uZ A04;
    public final UserJid A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C50392i6 r7 = (C50392i6) obj;
            if (!(this.A02 == r7.A02 && this.A09 == r7.A09 && this.A07.equals(r7.A07) && this.A04.equals(r7.A04) && this.A00 == r7.A00 && this.A03 == r7.A03 && this.A06.equals(r7.A06) && this.A05.equals(r7.A05) && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        C18280x3.A1S(objArr, this.A02);
        AnonymousClass000.A1R(objArr, this.A09);
        objArr[2] = this.A07;
        objArr[3] = this.A04;
        C18280x3.A1P(objArr, this.A00);
        C18320x8.A1R(objArr, this.A03);
        objArr[6] = this.A06;
        objArr[7] = this.A05;
        return C18310x6.A08(Long.valueOf(this.A01), objArr, 8);
    }

    public C50392i6(C95814uZ r1, UserJid userJid, String str, String str2, int i, long j, long j2, long j3, boolean z, boolean z2) {
        this.A02 = j;
        this.A09 = z;
        this.A07 = str;
        this.A08 = z2;
        this.A04 = r1;
        this.A00 = i;
        this.A03 = j2;
        this.A06 = str2;
        this.A05 = userJid;
        this.A01 = j3;
    }
}
