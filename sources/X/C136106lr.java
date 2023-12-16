package X;

/* renamed from: X.6lr  reason: invalid class name and case insensitive filesystem */
public final class C136106lr extends C136186lz {
    public final C184258rV A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136106lr(C184258rV r2, String str) {
        super(50);
        C162457s7.A0J(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136106lr) {
                C136106lr r5 = (C136106lr) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18270x1.A00(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LocationPermissionRequestFooterViewData(categoryId=");
        A0o.append(this.A01);
        A0o.append(", locationRequestClickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
