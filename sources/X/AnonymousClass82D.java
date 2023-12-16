package X;

/* renamed from: X.82D  reason: invalid class name */
public class AnonymousClass82D implements C183708qU {
    public final int A00;
    public final C183708qU A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass82D)) {
                return false;
            }
            AnonymousClass82D r4 = (AnonymousClass82D) obj;
            if (this.A00 != r4.A00 || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 1013) + this.A00;
    }

    public AnonymousClass82D(C183708qU r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        AnonymousClass7W7 r2 = new AnonymousClass7W7(C18310x6.A0n(this));
        r2.A00(this.A01, "imageCacheKey");
        r2.A00(String.valueOf(this.A00), "frameIndex");
        return r2.toString();
    }
}
