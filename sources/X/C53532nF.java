package X;

/* renamed from: X.2nF  reason: invalid class name and case insensitive filesystem */
public final class C53532nF {
    public final C371821g A00;
    public final C371921h A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53532nF) {
                C53532nF r5 = (C53532nF) obj;
                if (this.A01 != r5.A01 || this.A00 != r5.A00 || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((AnonymousClass000.A07(this.A01) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18270x1.A00(this.A05)) * 31) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A04)) * 31) + C18310x6.A07(this.A02);
    }

    public C53532nF(C371821g r1, C371921h r2, Integer num, String str, String str2, String str3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BotPluginMetadata(provider=");
        A0o.append(this.A01);
        A0o.append(", pluginType=");
        A0o.append(this.A00);
        A0o.append(", thumbnailCdnUrl=");
        A0o.append(this.A05);
        A0o.append(", profilePhotoCdnUrl=");
        A0o.append(this.A03);
        A0o.append(", searchProviderUrl=");
        A0o.append(this.A04);
        A0o.append(", referenceIndex=");
        return C18260x0.A04(this.A02, A0o);
    }
}
