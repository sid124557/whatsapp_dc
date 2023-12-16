package X;

/* renamed from: X.7iO  reason: invalid class name and case insensitive filesystem */
public final class C157497iO {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public C157497iO(boolean z, boolean z2, boolean z3) {
        this((Integer) null, z, z2, z3);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[interactive=");
        A0o.append(this.A03);
        A0o.append(", has_status=");
        A0o.append(this.A02);
        A0o.append(", has_nonstatus=");
        A0o.append(this.A01);
        A0o.append(", media_quality=");
        A0o.append(this.A00);
        return AnonymousClass000.A0f(A0o);
    }

    public C157497iO(Integer num, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = z3;
        this.A00 = num;
    }
}
