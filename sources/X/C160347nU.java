package X;

/* renamed from: X.7nU  reason: invalid class name and case insensitive filesystem */
public final class C160347nU {
    public static final C160347nU A02 = new C160347nU();
    public byte A00;
    public boolean A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C160347nU)) {
                return false;
            }
            C160347nU r4 = (C160347nU) obj;
            if (!(this.A00 == r4.A00 && this.A01 == r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(new Boolean(this.A01), new Byte(this.A00).hashCode());
    }

    public C160347nU(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }

    public C160347nU() {
        this.A00 = 3;
        this.A01 = true;
    }
}
