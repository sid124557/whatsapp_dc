package X;

/* renamed from: X.2nq  reason: invalid class name and case insensitive filesystem */
public final class C53892nq {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C53892nq(String str, String str2, String str3, int i, int i2, long j, long j2, boolean z, boolean z2) {
        C162457s7.A0J(str, 1);
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A00 = i;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = i2;
        this.A04 = j;
        this.A05 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53892nq) {
                C53892nq r8 = (C53892nq) obj;
                if (!(C162457s7.A0P(this.A07, r8.A07) && C162457s7.A0P(this.A06, r8.A06) && C162457s7.A0P(this.A08, r8.A08) && this.A00 == r8.A00 && this.A03 == r8.A03 && this.A02 == r8.A02 && this.A01 == r8.A01 && this.A04 == r8.A04 && this.A05 == r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(Object obj, Object obj2) {
        return C162457s7.A0P(((C53892nq) obj).A07, obj2);
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A00((AnonymousClass0x2.A01(AnonymousClass0x2.A01((AnonymousClass0x2.A07(this.A08, AnonymousClass0x2.A07(this.A06, C18310x6.A09(this.A07))) + this.A00) * 31, this.A03), this.A02) + this.A01) * 31, this.A04), this.A05);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitchingModel(lid=");
        A0o.append(this.A07);
        A0o.append(", jid=");
        A0o.append(this.A06);
        A0o.append(", name=");
        A0o.append(this.A08);
        A0o.append(", badgeCount=");
        A0o.append(this.A00);
        A0o.append(", isLoggedIn=");
        A0o.append(this.A03);
        A0o.append(", isCompanion=");
        A0o.append(this.A02);
        A0o.append(", unreadMessageCount=");
        A0o.append(this.A01);
        A0o.append(", lastActiveTimestampMs=");
        A0o.append(this.A04);
        A0o.append(", lastBuzzedTimestampMs=");
        return C18270x1.A0U(A0o, this.A05);
    }
}
