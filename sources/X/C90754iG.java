package X;

/* renamed from: X.4iG  reason: invalid class name and case insensitive filesystem */
public final class C90754iG extends C96414wK {
    public final int A00;
    public final C184248rU A01;
    public final C182048nm A02;
    public final C186368vB A03;
    public final C109065e1 A04;
    public final boolean A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90754iG(X.C184248rU r12, X.C182048nm r13, X.C186368vB r14, X.C109065e1 r15, int r16, boolean r17) {
        /*
            r11 = this;
            r9 = 0
            r2 = 0
            r7 = 56
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            r10 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r8
            r11.A04 = r15
            r11.A01 = r12
            r11.A02 = r13
            r11.A03 = r14
            r0 = r17
            r11.A05 = r0
            r11.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90754iG.<init>(X.8rU, X.8nm, X.8vB, X.5e1, int, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90754iG) {
                C90754iG r5 = (C90754iG) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A01, AnonymousClass000.A08(this.A04, ((((this.A00 * 31) + 1237) * 31 * 31) + 1237) * 31)))), this.A05);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TypeaheadBusinessProfileListItemData(wamLocationType=");
        A0o.append(this.A00);
        A0o.append(", shouldShowDistance=");
        A0o.append(false);
        A0o.append(", userLocation=");
        A0o.append((Object) null);
        A0o.append(", shouldShowProductImages=");
        A0o.append(false);
        A0o.append(", businessProfile=");
        A0o.append(this.A04);
        A0o.append(", onClickProfileListener=");
        A0o.append(this.A01);
        A0o.append(", businessProfileSyncListener=");
        A0o.append(this.A02);
        A0o.append(", rankingAnalyticsFieldProvider=");
        A0o.append(this.A03);
        A0o.append(", isRecentSearchBusiness=");
        return C18260x0.A0A(A0o, this.A05);
    }
}
