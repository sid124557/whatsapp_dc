package X;

/* renamed from: X.2mc  reason: invalid class name and case insensitive filesystem */
public final class C53142mc {
    public final int A00;
    public final long A01;
    public final C108895dj A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53142mc) {
                C53142mc r8 = (C53142mc) obj;
                if (this.A01 != r8.A01 || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02) || this.A00 != r8.A00 || !C162457s7.A0P(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass0x2.A02(this.A01) + C18270x1.A00(this.A03)) * 31) + AnonymousClass000.A07(this.A02)) * 31) + this.A00) * 31) + AnonymousClass0x7.A07(this.A04);
    }

    public C53142mc(C108895dj r1, String str, String str2, int i, long j) {
        this.A01 = j;
        this.A03 = str;
        this.A02 = r1;
        this.A00 = i;
        this.A04 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyStatusCrosspostingInfo(messageRowId=");
        A0o.append(this.A01);
        A0o.append(", crosspostingSessionId=");
        A0o.append(this.A03);
        A0o.append(", crosspostingStatusEnforcedEncryptedUniqueId=");
        A0o.append(this.A02);
        A0o.append(", state=");
        A0o.append(this.A00);
        A0o.append(", mediaPath=");
        return C18260x0.A07(this.A04, A0o);
    }
}
