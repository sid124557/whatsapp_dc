package X;

/* renamed from: X.7iQ  reason: invalid class name and case insensitive filesystem */
public final class C157507iQ {
    public static final C157507iQ A04 = new C157507iQ(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C157507iQ(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (C162387ry.A0C(i3)) {
            i4 = C162387ry.A02(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioFormat[sampleRate=");
        A0o.append(this.A03);
        A0o.append(", channelCount=");
        A0o.append(this.A01);
        A0o.append(", encoding=");
        A0o.append(this.A02);
        return AnonymousClass0x2.A0f(A0o);
    }
}
