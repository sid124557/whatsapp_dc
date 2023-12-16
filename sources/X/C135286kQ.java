package X;

/* renamed from: X.6kQ  reason: invalid class name and case insensitive filesystem */
public final class C135286kQ extends C1451374h {
    public final int A00;
    public final int A01;
    public final String A02;

    public C135286kQ(String str, int i, int i2) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135286kQ) {
                C135286kQ r5 = (C135286kQ) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A02) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InlineVideoInfo(videoUrl=");
        A0o.append(this.A02);
        A0o.append(", videoWidth=");
        A0o.append(this.A01);
        A0o.append(", videoHeight=");
        return C18260x0.A09(A0o, this.A00);
    }
}
