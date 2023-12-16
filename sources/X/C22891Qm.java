package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1Qm  reason: invalid class name and case insensitive filesystem */
public final class C22891Qm extends C22901Qn {
    public static final long A08 = AnonymousClass0x7.A0C();
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22891Qm(UserJid userJid, String str, String str2, String str3, List list, int i, long j, boolean z, boolean z2) {
        super(userJid, 1);
        C18260x0.A0S(str, str2);
        C162457s7.A0J(str3, 8);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A01 = j;
        this.A06 = z;
        this.A07 = z2;
        this.A04 = str3;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C22891Qm.class)) {
                return false;
            }
            C22891Qm r7 = (C22891Qm) obj;
            if (this.A00 != r7.A00 || !C162457s7.A0P(this.A00.getRawString(), r7.A00.getRawString()) || !C162457s7.A0P(this.A02, r7.A02) || !C162457s7.A0P(this.A03, r7.A03) || this.A01 != r7.A01 || !C162457s7.A0P(this.A04, r7.A04) || this.A00 != r7.A00 || !C162457s7.A0P(this.A05, r7.A05) || this.A06 != r7.A06 || this.A07 != r7.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        boolean A1Y = C18300x5.A1Y(objArr, this.A00);
        objArr[1] = this.A00.getRawString();
        objArr[2] = this.A02;
        objArr[3] = this.A03;
        C18300x5.A1R(objArr, this.A01);
        objArr[5] = this.A04;
        C18290x4.A1U(objArr, this.A00);
        objArr[7] = Boolean.valueOf(this.A06);
        objArr[8] = Boolean.valueOf(this.A07);
        return C18310x6.A08(Integer.valueOf(C18310x6.A08(this.A05, new Object[1], A1Y ? 1 : 0)), objArr, 9);
    }
}
