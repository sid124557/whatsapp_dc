package X;

/* renamed from: X.2ye  reason: invalid class name and case insensitive filesystem */
public final class C60492ye {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60492ye) {
                C60492ye r5 = (C60492ye) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x9.A04(this.A00), this.A01);
    }

    public C60492ye(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MultiDestinationAutoCrosspostingSetting(isFBAutoCrosspostOn=");
        A0o.append(this.A00);
        A0o.append(", isIGAutoCrosspostOn=");
        return C18260x0.A0A(A0o, this.A01);
    }

    public C60492ye() {
        this(false, false);
    }
}
