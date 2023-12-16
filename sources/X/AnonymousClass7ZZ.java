package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.7ZZ  reason: invalid class name */
public final class AnonymousClass7ZZ {
    public final int A00;
    public final int A01;
    public final C52332lJ A02;
    public final UserJid A03;
    public final List A04;

    public AnonymousClass7ZZ(C52332lJ r2, UserJid userJid, List list, int i, int i2) {
        C162457s7.A0J(userJid, 1);
        this.A03 = userJid;
        this.A04 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZZ) {
                AnonymousClass7ZZ r5 = (AnonymousClass7ZZ) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A08(this.A04, C18300x5.A04(this.A03)) + this.A01) * 31) + this.A00) * 31) + AnonymousClass000.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RefreshCartRequest(bizJid=");
        A0o.append(this.A03);
        A0o.append(", productIds=");
        A0o.append(this.A04);
        A0o.append(", width=");
        A0o.append(this.A01);
        A0o.append(", height=");
        A0o.append(this.A00);
        A0o.append(", catalogVariantsRequestData=");
        return C18260x0.A04(this.A02, A0o);
    }
}
