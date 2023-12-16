package X;

import android.hardware.Camera;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.9T4  reason: invalid class name */
public class AnonymousClass9T4 {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9T4)) {
            return false;
        }
        AnonymousClass9T4 r4 = (AnonymousClass9T4) obj;
        return this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public static void A00(AnonymousClass9T4 r2, StringBuilder sb) {
        sb.append(r2.A02);
        sb.append('x');
        sb.append(r2.A01);
    }

    public int hashCode() {
        int i = this.A01;
        int i2 = this.A02;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public AnonymousClass9T4(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i * i2;
    }

    public static void A01(AbstractCollection abstractCollection, List list, int i) {
        Camera.Size size = (Camera.Size) list.get(i);
        abstractCollection.add(new AnonymousClass9T4(size.width, size.height));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A02);
        A0o.append("x");
        return AnonymousClass000.A0h(A0o, this.A01);
    }
}
