package X;

/* renamed from: X.7Yw  reason: invalid class name and case insensitive filesystem */
public final class C152437Yw {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152437Yw) {
                C152437Yw r5 = (C152437Yw) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A01), this.A02), this.A00);
    }

    public C152437Yw(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = z3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoPlayState(isAutoPlayAllowed=");
        A0o.append(this.A01);
        A0o.append(", isVideoInView=");
        A0o.append(this.A02);
        A0o.append(", isActivityOn=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
