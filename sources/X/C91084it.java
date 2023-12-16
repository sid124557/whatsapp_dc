package X;

/* renamed from: X.4it  reason: invalid class name and case insensitive filesystem */
public final class C91084it extends AnonymousClass5AF {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91084it) && this.A00 == ((C91084it) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C91084it(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScreenSharing(wasUsingBackCamera=");
        return C18260x0.A0A(A0o, this.A00);
    }

    public C91084it() {
        this(false);
    }
}
