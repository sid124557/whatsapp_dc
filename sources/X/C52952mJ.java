package X;

/* renamed from: X.2mJ  reason: invalid class name and case insensitive filesystem */
public final class C52952mJ {
    public final int A00;
    public final C371120z A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52952mJ) {
                C52952mJ r5 = (C52952mJ) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(AnonymousClass0x2.A01((((C18300x5.A04(this.A01) + 1237) * 31) + 1231) * 31, this.A03), this.A02) + this.A00;
    }

    public C52952mJ(C371120z r1, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BuildHistorySyncParams(historySyncUsage=");
        A0o.append(this.A01);
        A0o.append(", strictMode=");
        A0o.append(false);
        A0o.append(", ignoreThumbnail=");
        A0o.append(true);
        A0o.append(", supportCagReactionsAndPolls=");
        A0o.append(this.A03);
        A0o.append(", shouldIncludeBotUserAgentChat=");
        A0o.append(this.A02);
        A0o.append(", maxCommentsToAdd=");
        return C18260x0.A09(A0o, this.A00);
    }
}
