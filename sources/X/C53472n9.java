package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2n9  reason: invalid class name and case insensitive filesystem */
public final class C53472n9 {
    public final long A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53472n9) {
                C53472n9 r8 = (C53472n9) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A04, r8.A04) || this.A00 != r8.A00 || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A03, AnonymousClass0x2.A07(this.A05, AnonymousClass000.A00(AnonymousClass0x2.A07(this.A04, AnonymousClass0x2.A07(this.A02, C18300x5.A04(this.A01))), this.A00)));
    }

    public C53472n9(UserJid userJid, String str, String str2, String str3, String str4, long j) {
        C18260x0.A0V(userJid, str, str2);
        C18260x0.A0T(str3, str4);
        this.A01 = userJid;
        this.A02 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A05 = str3;
        this.A03 = str4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FlowsContextParams(bizJid=");
        A0o.append(this.A01);
        A0o.append(", flowId=");
        A0o.append(this.A02);
        A0o.append(", messageId=");
        A0o.append(this.A04);
        A0o.append(", messageRowId=");
        A0o.append(this.A00);
        A0o.append(", sessionId=");
        A0o.append(this.A05);
        A0o.append(", flowMessageVersion=");
        return C18260x0.A07(this.A03, A0o);
    }
}
