package X;

/* renamed from: X.7jo  reason: invalid class name and case insensitive filesystem */
public class C158337jo {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C158337jo) {
            C158337jo r4 = (C158337jo) obj;
            if (this.A00 == r4.A00 && this.A01 == r4.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        StringBuilder A0A = C18330xA.A0A("(");
        A0A.append(this.A00);
        A0A.append(',');
        A0A.append(this.A01);
        return AnonymousClass000.A0c(A0A);
    }

    public C158337jo(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
