package X;

import java.util.Map;

/* renamed from: X.2mw  reason: invalid class name and case insensitive filesystem */
public final class C53342mw {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53342mw) {
                C53342mw r8 = (C53342mw) obj;
                if (this.A00 != r8.A00 || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A04, (((((AnonymousClass0x2.A02(this.A00) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A02)) * 31) + AnonymousClass0x7.A07(this.A01)) * 31);
    }

    public C53342mw(String str, String str2, String str3, Map map, long j) {
        this.A00 = j;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MultiDestinationCrosspostingInfo(messageRowId=");
        A0o.append(this.A00);
        A0o.append(", uniqueId=");
        A0o.append(this.A03);
        A0o.append(", mediaFilePath=");
        A0o.append(this.A02);
        A0o.append(", directUrlPath=");
        A0o.append(this.A01);
        A0o.append(", destinationStateMap=");
        return C18260x0.A04(this.A04, A0o);
    }
}
