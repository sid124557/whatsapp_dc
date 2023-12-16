package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2l8  reason: invalid class name and case insensitive filesystem */
public class C52222l8 {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C52222l8 r7 = (C52222l8) obj;
            if (this.A00 != r7.A00 || !this.A02.equals(r7.A02) || !AnonymousClass75J.A00(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public C52222l8(UserJid userJid, String str, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = userJid;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        C18280x3.A1S(A1X, this.A00);
        A1X[1] = this.A02;
        return C18310x6.A08(this.A01, A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallLink[rowId=");
        A0o.append(this.A00);
        A0o.append(", token='");
        A0o.append(this.A02);
        A0o.append(", creatorJid=");
        A0o.append(this.A01);
        return AnonymousClass0x2.A0f(A0o);
    }
}
