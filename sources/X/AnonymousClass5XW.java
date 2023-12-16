package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5XW  reason: invalid class name */
public final class AnonymousClass5XW {
    public final C27991fJ A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final Map A04;

    public AnonymousClass5XW(C27991fJ r2, List list, Map map) {
        this.A00 = r2;
        this.A03 = list;
        this.A04 = map;
        this.A01 = null;
        this.A02 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5XW) {
                AnonymousClass5XW r5 = (AnonymousClass5XW) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A08(this.A04, AnonymousClass000.A08(this.A03, AnonymousClass000.A07(this.A00) * 31)) + C18270x1.A00(this.A01)) * 31) + AnonymousClass0x7.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RemoveCommunityParticipantsResponse(from=");
        A0o.append(this.A00);
        A0o.append(", successList=");
        A0o.append(this.A03);
        A0o.append(", failTable=");
        A0o.append(this.A04);
        A0o.append(", errorCode=");
        A0o.append(this.A01);
        A0o.append(", errorText=");
        return C18260x0.A07(this.A02, A0o);
    }

    public AnonymousClass5XW(String str, String str2) {
        C72023d3 r1 = C72023d3.A00;
        Map A0A = C73813g7.A0A();
        this.A00 = null;
        this.A03 = r1;
        this.A04 = A0A;
        this.A01 = str;
        this.A02 = str2;
    }
}
