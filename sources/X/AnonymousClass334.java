package X;

/* renamed from: X.334  reason: invalid class name */
public final class AnonymousClass334 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass334(String str, int i, String str2) {
        C162457s7.A0J(str2, 3);
        this.A01 = str;
        this.A00 = i;
        this.A04 = false;
        this.A03 = false;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass334) {
                AnonymousClass334 r5 = (AnonymousClass334) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A03 == r5.A03 && C162457s7.A0P(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(AnonymousClass0x2.A01(((C18270x1.A00(this.A01) * 31) + this.A00) * 31, this.A04), this.A03) + AnonymousClass0x7.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupInfoContextData(context=");
        A0o.append(this.A01);
        A0o.append(", deviceSyncType=");
        A0o.append(this.A00);
        A0o.append(", messageRevoked=");
        A0o.append(this.A04);
        A0o.append(", isLid=");
        A0o.append(this.A03);
        A0o.append(", phash=");
        return C18260x0.A07(this.A02, A0o);
    }

    public AnonymousClass334(boolean z, boolean z2) {
        this.A01 = "phash";
        this.A00 = 1;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = null;
    }

    public AnonymousClass334(String str, int i) {
        this.A01 = str;
        this.A00 = i;
        this.A04 = false;
        this.A03 = false;
        this.A02 = null;
    }
}
