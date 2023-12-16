package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2n5  reason: invalid class name and case insensitive filesystem */
public final class C53432n5 {
    public final long A00;
    public final C95814uZ A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C53432n5(C95814uZ r2, UserJid userJid, String str, String str2, String str3, long j) {
        C162457s7.A0J(str, 1);
        this.A05 = str;
        this.A02 = userJid;
        this.A01 = r2;
        this.A04 = str2;
        this.A00 = j;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53432n5) {
                C53432n5 r8 = (C53432n5) obj;
                if (!C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A04, r8.A04) || this.A00 != r8.A00 || !C162457s7.A0P(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A00((((((C18310x6.A09(this.A05) + AnonymousClass000.A07(this.A02)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18270x1.A00(this.A04)) * 31, this.A00) + AnonymousClass0x7.A07(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BotMetadata(targetId=");
        A0o.append(this.A05);
        A0o.append(", targetSenderJid=");
        A0o.append(this.A02);
        A0o.append(", targetChatJid=");
        A0o.append(this.A01);
        A0o.append(", editTargetId=");
        A0o.append(this.A04);
        A0o.append(", senderTimestampMs=");
        A0o.append(this.A00);
        A0o.append(", edit=");
        return C18260x0.A07(this.A03, A0o);
    }
}
