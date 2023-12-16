package X;

import java.util.Arrays;

/* renamed from: X.2nk  reason: invalid class name and case insensitive filesystem */
public final class C53832nk {
    public String A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String[] A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53832nk) {
                C53832nk r5 = (C53832nk) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A07, r5.A07) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A09 = (((((((((C18310x6.A09(this.A03) + C18270x1.A00(this.A02)) * 31) + C18270x1.A00(this.A00)) * 31) + C18270x1.A00(this.A04)) * 31) + C18270x1.A00(this.A05)) * 31) + C18270x1.A00(this.A06)) * 31;
        String[] strArr = this.A07;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        }
        return ((A09 + i) * 31) + this.A01;
    }

    public C53832nk(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, int i) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = strArr;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionIdLinks(flowId=");
        A0o.append(this.A03);
        A0o.append(", dataApiVersion=");
        A0o.append(this.A02);
        A0o.append(", state=");
        A0o.append(this.A00);
        A0o.append(", flowVersionIds=");
        A0o.append(this.A04);
        A0o.append(", pslCdnUrl=");
        A0o.append(this.A05);
        A0o.append(", pslSignature=");
        A0o.append(this.A06);
        A0o.append(", categories=");
        C18320x8.A1P(A0o, this.A07);
        A0o.append(", flowJsonVersion=");
        return C18260x0.A09(A0o, this.A01);
    }
}
