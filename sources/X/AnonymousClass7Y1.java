package X;

/* renamed from: X.7Y1  reason: invalid class name */
public final class AnonymousClass7Y1 {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y1) {
                AnonymousClass7Y1 r5 = (AnonymousClass7Y1) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(C18310x6.A09(this.A00), this.A01);
    }

    public AnonymousClass7Y1(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductBottomSheetErrorState(message=");
        A0o.append(this.A00);
        A0o.append(", showAsDialog=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
