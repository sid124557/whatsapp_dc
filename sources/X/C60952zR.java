package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2zR  reason: invalid class name and case insensitive filesystem */
public final class C60952zR {
    public final C624034w A00;
    public final UserJid A01;
    public final AnonymousClass39I A02;
    public final AnonymousClass213 A03;
    public final C30791n7 A04;
    public final Boolean A05;
    public final List A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60952zR) {
                C60952zR r5 = (C60952zR) obj;
                if (!C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A03 != r5.A03 || !C162457s7.A0P(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass000.A07(this.A05) * 31) + AnonymousClass000.A07(this.A02)) * 31) + AnonymousClass000.A07(this.A04)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + AnonymousClass000.A07(this.A03)) * 31) + C18310x6.A07(this.A06);
    }

    public C60952zR(C624034w r1, UserJid userJid, AnonymousClass39I r3, AnonymousClass213 r4, C30791n7 r5, Boolean bool, List list) {
        this.A05 = bool;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = userJid;
        this.A03 = r4;
        this.A06 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CheckoutData(shouldShowShimmer=");
        A0o.append(this.A05);
        A0o.append(", error=");
        A0o.append(this.A02);
        A0o.append(", orderMessage=");
        A0o.append(this.A04);
        A0o.append(", paymentTransactionInfo=");
        A0o.append(this.A00);
        A0o.append(", merchantJid=");
        A0o.append(this.A01);
        A0o.append(", merchantPaymentAccountStatus=");
        A0o.append(this.A03);
        A0o.append(", installmentOptions=");
        return C18260x0.A04(this.A06, A0o);
    }

    public C60952zR() {
        this((C624034w) null, (UserJid) null, (AnonymousClass39I) null, AnonymousClass213.NONE, (C30791n7) null, (Boolean) null, (List) null);
    }
}
