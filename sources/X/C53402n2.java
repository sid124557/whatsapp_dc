package X;

/* renamed from: X.2n2  reason: invalid class name and case insensitive filesystem */
public final class C53402n2 {
    public int A00;
    public final AnonymousClass20T A01;
    public final C53782nf A02;
    public final AnonymousClass3ZH A03;
    public final AnonymousClass3ZH A04;
    public final AnonymousClass4GR A05;

    public C53402n2(AnonymousClass20T r2, C53782nf r3, AnonymousClass3ZH r4, AnonymousClass3ZH r5, AnonymousClass4GR r6, int i) {
        C162457s7.A0J(r2, 4);
        this.A02 = r3;
        this.A00 = i;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r4;
        this.A03 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53402n2) {
                C53402n2 r5 = (C53402n2) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A05, r5.A05) || this.A01 != r5.A01 || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, AnonymousClass000.A08(this.A04, AnonymousClass000.A08(this.A01, AnonymousClass000.A08(this.A05, (C18300x5.A04(this.A02) + this.A00) * 31))));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState(suggestion=");
        A0o.append(this.A02);
        A0o.append(", subgroupApprovalState=");
        A0o.append(this.A00);
        A0o.append(", onAction=");
        A0o.append(this.A05);
        A0o.append(", userView=");
        A0o.append(this.A01);
        A0o.append(", groupContact=");
        A0o.append(this.A04);
        A0o.append(", creatorContact=");
        return C18260x0.A04(this.A03, A0o);
    }
}
