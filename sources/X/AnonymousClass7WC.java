package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.7WC  reason: invalid class name */
public final class AnonymousClass7WC {
    public final int[] A00 = new int[0];
    public final long[] A01 = new long[0];
    public final Uri[] A02 = new Uri[0];

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass7WC.class != obj.getClass()) {
                return false;
            }
            AnonymousClass7WC r5 = (AnonymousClass7WC) obj;
            if (!Arrays.equals(this.A02, r5.A02) || !Arrays.equals(this.A00, r5.A00) || !Arrays.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((-31 + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A00)) * 31) + Arrays.hashCode(this.A01);
    }
}
