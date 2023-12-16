package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.2mh  reason: invalid class name and case insensitive filesystem */
public final class C53192mh {
    public final UserJid A00;
    public final AnonymousClass2z0 A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53192mh) {
                C53192mh r5 = (C53192mh) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A03 != r5.A03 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, AnonymousClass0x2.A01(((((Arrays.hashCode(this.A04) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01)) * 31, this.A03));
    }

    public C53192mh(UserJid userJid, AnonymousClass2z0 r2, String str, byte[] bArr, boolean z) {
        this.A04 = bArr;
        this.A00 = userJid;
        this.A01 = r2;
        this.A03 = z;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageSecretEncryptionParams(data=");
        C18280x3.A1J(A0o, this.A04);
        A0o.append(", senderUserJid=");
        A0o.append(this.A00);
        A0o.append(", targetMessageKey=");
        A0o.append(this.A01);
        A0o.append(", isTargetMessageLidBased=");
        A0o.append(this.A03);
        A0o.append(", messageSecretUseCase=");
        return C18260x0.A07(this.A02, A0o);
    }
}
