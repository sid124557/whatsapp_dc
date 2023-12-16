package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1pl  reason: invalid class name and case insensitive filesystem */
public final class C32221pl extends C47742dk {
    public final C95814uZ A00;
    public final GroupJid A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32221pl) {
                C32221pl r5 = (C32221pl) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A08(this.A00, (C18310x6.A09(this.A02) + C18270x1.A00(this.A03)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + AnonymousClass0x7.A07(this.A04);
    }

    public C32221pl(C95814uZ r1, GroupJid groupJid, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r1;
        this.A01 = groupJid;
        this.A04 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessagePushPayload(dataNotificationType=");
        A0o.append(this.A02);
        A0o.append(", dataToLid=");
        A0o.append(this.A03);
        A0o.append(", senderJid=");
        A0o.append(this.A00);
        A0o.append(", groupJid=");
        A0o.append(this.A01);
        A0o.append(", displayName=");
        return C18260x0.A07(this.A04, A0o);
    }
}
