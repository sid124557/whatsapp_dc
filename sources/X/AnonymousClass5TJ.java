package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.5TJ  reason: invalid class name */
public final class AnonymousClass5TJ {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5TJ) {
                AnonymousClass5TJ r5 = (AnonymousClass5TJ) obj;
                if (!C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A09, r5.A09) || this.A00 != r5.A00 || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((C18270x1.A00(this.A07) * 31) + C18270x1.A00(this.A05)) * 31) + C18270x1.A00(this.A02)) * 31) + C18270x1.A00(this.A08)) * 31) + C18270x1.A00(this.A06)) * 31) + C18270x1.A00(this.A01)) * 31) + C18270x1.A00(this.A04)) * 31) + C18270x1.A00(this.A09)) * 31) + this.A00) * 31) + AnonymousClass0x7.A07(this.A03);
    }

    public AnonymousClass5TJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        this.A07 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A08 = str4;
        this.A06 = str5;
        this.A01 = str6;
        this.A04 = str7;
        this.A09 = str8;
        this.A00 = i;
        this.A03 = str9;
    }

    public String toString() {
        return C86654Ky.A0n(Locale.getDefault(), "ModelAsset: name=%s id=%s cacheKey=%s sourceContentHash=%s md5Hash=%s assetHandle=%s creationTime=%s url=%s fileSizeBytes=%s compressionType=%s", Arrays.copyOf(new Object[]{this.A07, this.A05, this.A02, this.A08, this.A06, this.A01, this.A04, this.A09, Integer.valueOf(this.A00), this.A03}, 10));
    }
}
