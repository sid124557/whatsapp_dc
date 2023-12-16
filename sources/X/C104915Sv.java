package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.5Sv  reason: invalid class name and case insensitive filesystem */
public final class C104915Sv {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final ArrayList A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104915Sv) {
                C104915Sv r5 = (C104915Sv) obj;
                if (!C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || this.A01 != r5.A01 || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((C18300x5.A04(this.A05) + C18270x1.A00(this.A02)) * 31) + this.A00) * 31) + this.A01) * 31) + C18270x1.A00(this.A03)) * 31) + AnonymousClass0x7.A07(this.A04);
    }

    public C104915Sv(String str, String str2, String str3, ArrayList arrayList, int i, int i2) {
        this.A05 = arrayList;
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str2;
        this.A04 = str3;
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A02;
        AnonymousClass000.A1N(objArr, this.A00);
        AnonymousClass000.A1O(objArr, this.A01);
        objArr[4] = this.A03;
        objArr[5] = this.A04;
        return C86654Ky.A0n(locale, "MLModelMetadataGraphqlResponse: models=%s entryPoint=%s assetCount=%d modelCount=%d status=%s statusDetails=%s", Arrays.copyOf(objArr, 6));
    }
}
