package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2lP  reason: invalid class name and case insensitive filesystem */
public final class C52392lP {
    public final UserJid A00;
    public final String A01;
    public final boolean A02;

    public C52392lP(UserJid userJid, String str, boolean z) {
        C162457s7.A0J(str, 2);
        this.A00 = userJid;
        this.A01 = str;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52392lP) {
                C52392lP r5 = (C52392lP) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A07(this.A01, C18300x5.A04(this.A00)), this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MutationKey(callCreatorJid=");
        A0o.append(this.A00);
        A0o.append(", callId=");
        A0o.append(this.A01);
        A0o.append(", isIncoming=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
