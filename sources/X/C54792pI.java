package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2pI  reason: invalid class name and case insensitive filesystem */
public class C54792pI {
    public final C27981fH A00;
    public final PhoneUserJid A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C54792pI r5 = (C54792pI) obj;
            if (!this.A02.equals(r5.A02) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public boolean A00() {
        if (!(this.A02 instanceof PhoneUserJid) || this.A00 == null) {
            return false;
        }
        return true;
    }

    public C54792pI(C27981fH r1, PhoneUserJid phoneUserJid, UserJid userJid, String str, String str2) {
        this.A02 = userJid;
        this.A04 = str;
        this.A00 = r1;
        this.A03 = str2;
        this.A01 = phoneUserJid;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A02;
        return C18310x6.A08(this.A04, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParticipantProtocolModel{jid=");
        A0o.append(this.A02);
        A0o.append(", type='");
        char A012 = C18300x5.A01(this.A04, A0o);
        A0o.append(", lid=");
        A0o.append(this.A00);
        A0o.append(", displayName='");
        A0o.append(this.A03);
        A0o.append(A012);
        A0o.append(", phoneNumber='");
        A0o.append(this.A01);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
