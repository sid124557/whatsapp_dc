package X;

import java.util.Map;

/* renamed from: X.2lv  reason: invalid class name and case insensitive filesystem */
public final class C52712lv {
    public final Integer A00;
    public final Map A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52712lv) {
                C52712lv r5 = (C52712lv) obj;
                if (this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (AnonymousClass0x9.A04(this.A02) + AnonymousClass000.A07(this.A00)) * 31);
    }

    public C52712lv(Integer num, Map map, boolean z) {
        this.A02 = z;
        this.A00 = num;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestResult(isAccountLinkingStatusValid=");
        A0o.append(this.A02);
        A0o.append(", tosId=");
        A0o.append(this.A00);
        A0o.append(", destinationResultMap=");
        return C18260x0.A04(this.A01, A0o);
    }
}
