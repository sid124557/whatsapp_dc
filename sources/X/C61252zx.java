package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2zx  reason: invalid class name and case insensitive filesystem */
public final class C61252zx {
    public String A00;
    public final long A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61252zx) {
                C61252zx r8 = (C61252zx) obj;
                if (!C162457s7.A0P(this.A0A, r8.A0A) || !C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A03, r8.A03) || this.A01 != r8.A01 || !C162457s7.A0P(this.A00, r8.A00) || !C162457s7.A0P(this.A08, r8.A08) || !C162457s7.A0P(this.A04, r8.A04) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A09, r8.A09) || !C162457s7.A0P(this.A07, r8.A07) || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A0B, r8.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C61252zx A01() {
        List A0L;
        Object obj;
        C60162y6 A002 = A00("2.23.26.14");
        List list = this.A0B;
        if (!(list == null || (A0L = C73723fy.A0L(list, new AnonymousClass4IS((Object) new AnonymousClass45L(this), 0))) == null)) {
            Iterator it = A0L.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (A00(((C61252zx) obj).A07).A01(A002) <= 0) {
                    break;
                }
            }
            C61252zx r1 = (C61252zx) obj;
            if (r1 != null) {
                return r1;
            }
        }
        return this;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A06, C18310x6.A09(this.A0A));
        return ((((((((((AnonymousClass0x2.A07(this.A08, (AnonymousClass000.A00(AnonymousClass0x2.A07(this.A03, A072), this.A01) + C18270x1.A00(this.A00)) * 31) + C18270x1.A00(this.A04)) * 31) + AnonymousClass000.A07(this.A02)) * 31) + C18270x1.A00(this.A09)) * 31) + C18270x1.A00(this.A07)) * 31) + C18270x1.A00(this.A05)) * 31) + C18310x6.A07(this.A0B);
    }

    public C61252zx(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, long j) {
        C18260x0.A0V(str, str2, str3);
        C162457s7.A0J(str5, 6);
        this.A0A = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A01 = j;
        this.A00 = str4;
        this.A08 = str5;
        this.A04 = str6;
        this.A02 = l;
        this.A09 = str7;
        this.A07 = str8;
        this.A05 = str9;
        this.A0B = list;
    }

    public static final C60162y6 A00(String str) {
        C60162y6 A002 = C60162y6.A00(str);
        if (A002 == null) {
            return new C60162y6(1, 0, 0, 0, 0);
        }
        return A002;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BloksLinks(url=");
        A0o.append(this.A0A);
        A0o.append(", locale=");
        A0o.append(this.A06);
        A0o.append(", appId=");
        A0o.append(this.A03);
        A0o.append(", expiresData=");
        A0o.append(this.A01);
        A0o.append(", version=");
        A0o.append(this.A00);
        A0o.append(", platform=");
        A0o.append(this.A08);
        A0o.append(", bizJid=");
        A0o.append(this.A04);
        A0o.append(", flowVersionId=");
        A0o.append(this.A02);
        A0o.append(", signature=");
        A0o.append(this.A09);
        A0o.append(", minAppVersion=");
        A0o.append(this.A07);
        A0o.append(", bloksVersionId=");
        A0o.append(this.A05);
        A0o.append(", extraVersions=");
        return C18260x0.A04(this.A0B, A0o);
    }
}
