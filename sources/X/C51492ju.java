package X;

/* renamed from: X.2ju  reason: invalid class name and case insensitive filesystem */
public final class C51492ju {
    public C833748d A00;
    public final C53212mj A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51492ju) {
                C51492ju r5 = (C51492ju) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.A00) * 31) + C18310x6.A07(this.A01);
    }

    public C51492ju(C53212mj r1, C833748d r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QuickPromotionInfo(qp=");
        A0o.append(this.A00);
        A0o.append(", surveyInfo=");
        return C18260x0.A04(this.A01, A0o);
    }
}
