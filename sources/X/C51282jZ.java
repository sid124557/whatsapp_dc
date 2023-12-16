package X;

/* renamed from: X.2jZ  reason: invalid class name and case insensitive filesystem */
public final class C51282jZ {
    public final AnonymousClass21M A00;
    public final Iterable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51282jZ) {
                C51282jZ r5 = (C51282jZ) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C51282jZ(AnonymousClass21M r1, Iterable iterable) {
        C18260x0.A0Q(r1, iterable);
        this.A00 = r1;
        this.A01 = iterable;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BucketResult(bucket=");
        A0o.append(this.A00);
        A0o.append(", jids=");
        return C18260x0.A04(this.A01, A0o);
    }
}
