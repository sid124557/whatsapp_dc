package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.2zB  reason: invalid class name and case insensitive filesystem */
public final class C60802zB {
    public final String A00;
    public final String A01;
    public final List A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60802zB) {
                C60802zB r5 = (C60802zB) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C60802zB(String str, String str2) {
        C72023d3 r1 = C72023d3.A00;
        C72043d5 A002 = C72043d5.A00();
        this.A02 = r1;
        this.A03 = A002;
        this.A00 = str;
        this.A01 = str2;
    }

    public int hashCode() {
        return ((AnonymousClass000.A08(this.A03, C18300x5.A04(this.A02)) + C18270x1.A00(this.A00)) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BatchGetGroupInfoResponse(groupInfoList=");
        A0o.append(this.A02);
        A0o.append(", failTable=");
        A0o.append(this.A03);
        A0o.append(", errorCode=");
        A0o.append(this.A00);
        A0o.append(", errorText=");
        return C18260x0.A07(this.A01, A0o);
    }

    public C60802zB(List list, Map map) {
        this.A02 = list;
        this.A03 = map;
        this.A00 = null;
        this.A01 = null;
    }
}
