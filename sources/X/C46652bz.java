package X;

/* renamed from: X.2bz  reason: invalid class name and case insensitive filesystem */
public class C46652bz {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C05570Ua A04;
    public C05570Ua A05;

    public C46652bz(C05570Ua r1, C05570Ua r2, int i, int i2, int i3, int i4) {
        this.A05 = r1;
        this.A04 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ChangeInfo{oldHolder=");
        A0o.append(this.A05);
        A0o.append(", newHolder=");
        A0o.append(this.A04);
        A0o.append(", fromX=");
        A0o.append(this.A00);
        A0o.append(", fromY=");
        A0o.append(this.A01);
        A0o.append(", toX=");
        A0o.append(this.A02);
        A0o.append(", toY=");
        A0o.append(this.A03);
        return AnonymousClass000.A0d(A0o);
    }
}
