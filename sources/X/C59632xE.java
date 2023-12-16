package X;

/* renamed from: X.2xE  reason: invalid class name and case insensitive filesystem */
public final class C59632xE {
    public static final C59632xE A05 = new C59632xE(false, false, false, false, false);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C59632xE(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = z;
        this.A00 = z2;
        this.A01 = z3;
        this.A02 = z4;
        this.A03 = z5;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WriteResult{wasSuccess=");
        A0o.append(this.A04);
        A0o.append(", chatAdded=");
        A0o.append(this.A00);
        A0o.append(", chatUnarchived=");
        A0o.append(this.A01);
        A0o.append(", isDuplicate=");
        A0o.append(this.A02);
        A0o.append(", isExpired=");
        A0o.append(this.A03);
        return AnonymousClass000.A0d(A0o);
    }
}
