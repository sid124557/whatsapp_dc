package X;

/* renamed from: X.7Yj  reason: invalid class name and case insensitive filesystem */
public final class C152307Yj {
    public final int A00;
    public final AnonymousClass7UM A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152307Yj) {
                C152307Yj r5 = (C152307Yj) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((C18300x5.A04(this.A01) + this.A00) * 31, this.A02);
    }

    public C152307Yj(AnonymousClass7UM r1, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapViewAction(cameraUpdate=");
        A0o.append(this.A01);
        A0o.append(", animationTime=");
        A0o.append(this.A00);
        A0o.append(", isGPSLocation=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
