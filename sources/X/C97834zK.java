package X;

/* renamed from: X.4zK  reason: invalid class name and case insensitive filesystem */
public final class C97834zK extends C156137g5 {
    public final AnonymousClass5ZO A00;
    public final AnonymousClass5T8 A01;
    public final AnonymousClass4GQ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97834zK(AnonymousClass5ZO r2, AnonymousClass5T8 r3, AnonymousClass4GQ r4) {
        super(r3, 28);
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97834zK) {
                C97834zK r5 = (C97834zK) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessProfileListItem(data=");
        A0o.append(this.A01);
        A0o.append(", searchLocation=");
        A0o.append(this.A00);
        A0o.append(", onProfileClicked=");
        return C18260x0.A04(this.A02, A0o);
    }
}
