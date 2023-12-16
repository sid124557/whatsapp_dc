package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2nT  reason: invalid class name and case insensitive filesystem */
public final class C53672nT {
    public final C172548Lq A00;
    public final C172548Lq A01;
    public final C95814uZ A02;
    public final UserJid A03;
    public final AnonymousClass1ET A04;
    public final AnonymousClass2z0 A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53672nT) {
                C53672nT r5 = (C53672nT) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass2z0 r0 = this.A05;
        return AnonymousClass0x7.A08(this.A06, (((((AnonymousClass000.A08(r0, ((AnonymousClass000.A07(this.A00) * 31) + AnonymousClass000.A07(this.A01)) * 31) + AnonymousClass000.A07(this.A04)) * 31) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A03)) * 31);
    }

    public C53672nT(C172548Lq r1, C172548Lq r2, C95814uZ r3, UserJid userJid, AnonymousClass1ET r5, AnonymousClass2z0 r6, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = userJid;
        this.A06 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageSecretDecryptionParams(encIv=");
        A0o.append(this.A00);
        A0o.append(", encPayload=");
        A0o.append(this.A01);
        A0o.append(", messageKey=");
        A0o.append(this.A05);
        A0o.append(", targetMessageKey=");
        A0o.append(this.A04);
        A0o.append(", remoteSenderJid=");
        A0o.append(this.A02);
        A0o.append(", senderUserJid=");
        A0o.append(this.A03);
        A0o.append(", messageSecretUseCase=");
        return C18260x0.A07(this.A06, A0o);
    }
}
