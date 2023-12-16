package X;

/* renamed from: X.534  reason: invalid class name */
public final class AnonymousClass534 extends AnonymousClass5C8 {
    public AnonymousClass3ZH A00;
    public boolean A01;
    public final AnonymousClass1RL A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass534) {
                AnonymousClass534 r5 = (AnonymousClass534) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A00, C18300x5.A04(this.A02)), this.A01);
    }

    public AnonymousClass534(AnonymousClass1RL r1, AnonymousClass3ZH r2, boolean z) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterRemoteDataItem(newsletter=");
        A0o.append(this.A02);
        A0o.append(", contact=");
        A0o.append(this.A00);
        A0o.append(", isLoading=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
