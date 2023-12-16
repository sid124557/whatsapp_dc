package X;

import java.util.Arrays;

/* renamed from: X.7WP  reason: invalid class name */
public class AnonymousClass7WP {
    public final int A00;
    public final byte[] A01;
    public final /* synthetic */ AnonymousClass8P4 A02;

    public AnonymousClass7WP(AnonymousClass8P4 r2, byte[] bArr) {
        this.A02 = r2;
        this.A01 = bArr;
        this.A00 = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7WP)) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass7WP) obj).A01);
    }

    public int hashCode() {
        return this.A00;
    }
}
