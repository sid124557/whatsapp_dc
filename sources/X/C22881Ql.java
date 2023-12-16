package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Ql  reason: invalid class name and case insensitive filesystem */
public final class C22881Ql extends C22901Qn {
    public static final long A07 = AnonymousClass0x7.A0C();
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22881Ql(UserJid userJid, String str, String str2, int i, long j, long j2, long j3, boolean z) {
        super(userJid, 2);
        C162457s7.A0J(str, 2);
        this.A05 = str;
        this.A01 = j;
        this.A03 = j2;
        this.A04 = str2;
        this.A06 = z;
        this.A00 = i;
        this.A02 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C22881Ql.class)) {
                return false;
            }
            C22881Ql r7 = (C22881Ql) obj;
            if (!(this.A00 == r7.A00 && C162457s7.A0P(this.A00.getRawString(), r7.A00.getRawString()) && C162457s7.A0P(this.A05, r7.A05) && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A02 == r7.A02 && C162457s7.A0P(this.A04, r7.A04) && this.A06 == r7.A06 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        AnonymousClass000.A1L(objArr, this.A00);
        C18310x6.A1D(this.A00, objArr);
        objArr[2] = this.A05;
        AnonymousClass0x2.A1V(objArr, this.A01);
        C18300x5.A1R(objArr, this.A03);
        objArr[5] = this.A04;
        objArr[6] = Boolean.valueOf(this.A06);
        C18310x6.A1V(objArr, this.A00);
        return C18310x6.A08(Long.valueOf(this.A02), objArr, 8);
    }
}
