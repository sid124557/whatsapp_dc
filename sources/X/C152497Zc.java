package X;

/* renamed from: X.7Zc  reason: invalid class name and case insensitive filesystem */
public final class C152497Zc {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152497Zc) {
                C152497Zc r5 = (C152497Zc) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A00 * 31) + C18270x1.A00(this.A04)) * 31) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A02)) * 31) + C18310x6.A07(this.A01);
    }

    public C152497Zc(Integer num, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScreenshotUploadResult(result=");
        A0o.append(this.A00);
        A0o.append(", uploadUrl=");
        A0o.append(this.A04);
        A0o.append(", iv=");
        A0o.append(this.A03);
        A0o.append(", cipherKey=");
        A0o.append(this.A02);
        A0o.append(", mediaType=");
        return C18260x0.A04(this.A01, A0o);
    }
}
