package X;

/* renamed from: X.2ko  reason: invalid class name and case insensitive filesystem */
public final class C52052ko {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52052ko) {
                C52052ko r5 = (C52052ko) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C52052ko(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(674642223, this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FacebookAppInfo(packageName=");
        A0o.append("com.facebook.katana");
        A0o.append(", isInstalled=");
        A0o.append(this.A01);
        A0o.append(", versionCode=");
        return C18260x0.A09(A0o, this.A00);
    }
}
