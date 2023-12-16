package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2zN  reason: invalid class name and case insensitive filesystem */
public class C60912zN {
    public static final C60912zN A05 = new C60912zN((PhoneUserJid) null, (UserJid) null, (String) null, (String) null, 0);
    public final long A00;
    public final PhoneUserJid A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C60912zN r7 = (C60912zN) obj;
            if (this.A00 != r7.A00 || !AnonymousClass75J.A00(this.A04, r7.A04) || !AnonymousClass75J.A00(this.A02, r7.A02) || !AnonymousClass75J.A00(this.A03, r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A04;
        AnonymousClass001.A1Q(objArr, this.A00);
        objArr[2] = this.A02;
        return C18310x6.A08(this.A03, objArr, 3);
    }

    public C60912zN(PhoneUserJid phoneUserJid, UserJid userJid, String str, String str2, long j) {
        this.A04 = str;
        this.A00 = j;
        this.A02 = userJid;
        this.A03 = str2;
        this.A01 = phoneUserJid;
    }

    public String toString() {
        Object valueOf;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupDescription{id=");
        A0o.append(this.A04);
        A0o.append(", time=");
        A0o.append(this.A00);
        A0o.append(", setterJid='");
        A0o.append(this.A02);
        A0o.append('\'');
        A0o.append(", len(description)='");
        String str = this.A03;
        if (str == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(str.length());
        }
        A0o.append(valueOf);
        A0o.append('\'');
        return AnonymousClass000.A0d(A0o);
    }
}
