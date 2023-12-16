package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2qS  reason: invalid class name and case insensitive filesystem */
public class C55502qS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final UserJid A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C55502qS r7 = (C55502qS) obj;
            if (!(AnonymousClass75J.A00(this.A06, r7.A06) && this.A05 == r7.A05 && AnonymousClass75J.A00(this.A07, r7.A07) && AnonymousClass75J.A00(this.A08, r7.A08) && this.A03 == r7.A03 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A04 == r7.A04)) {
                return false;
            }
        }
        return true;
    }

    public static void A00(C55502qS r1, AnonymousClass35K r2) {
        r2.A03 = r1.A03;
        r2.A07 = r1.A08;
        r2.A05 = r1.A01();
    }

    public AnonymousClass3ZC A01() {
        return new AnonymousClass3ZC(this.A01, this.A04, this.A00);
    }

    public boolean A02() {
        String str = this.A07;
        if (str == null || !str.startsWith("ent:")) {
            return false;
        }
        return true;
    }

    public boolean A03() {
        String str = this.A07;
        if (str == null || !str.startsWith("smb:")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A06;
        AnonymousClass001.A1Q(objArr, this.A05);
        objArr[2] = this.A07;
        objArr[3] = this.A08;
        C18280x3.A1P(objArr, this.A03);
        C18310x6.A1U(objArr, this.A02);
        C18290x4.A1U(objArr, this.A01);
        C18310x6.A1V(objArr, this.A00);
        return C18310x6.A08(Long.valueOf(this.A04), objArr, 8);
    }

    public C55502qS(UserJid userJid, AnonymousClass3ZC r4, String str, String str2, int i, int i2, long j, boolean z) {
        this.A09 = z;
        this.A06 = userJid;
        this.A05 = j;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = r4.hostStorage;
        this.A00 = r4.actualActors;
        this.A04 = r4.privacyModeTs;
    }
}
