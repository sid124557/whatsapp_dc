package X;

/* renamed from: X.2jo  reason: invalid class name and case insensitive filesystem */
public final class C51432jo {
    public final AnonymousClass1AT A00;
    public final AnonymousClass23E A01;

    public C51432jo(AnonymousClass1AT r2, AnonymousClass23E r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51432jo) {
                C51432jo r5 = (C51432jo) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PlaceholderMessageResendResponseResult(resultType=");
        A0o.append(this.A01);
        A0o.append(", placeholderMessageResendResponse=");
        return C18260x0.A04(this.A00, A0o);
    }
}
