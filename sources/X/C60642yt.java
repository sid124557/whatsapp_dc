package X;

import java.util.Arrays;

/* renamed from: X.2yt  reason: invalid class name and case insensitive filesystem */
public class C60642yt {
    public static final C60642yt A02 = new C60642yt(AnonymousClass22c.REMOVE, new byte[]{2});
    public static final C60642yt A03 = new C60642yt(AnonymousClass22c.SET, new byte[]{1});
    public final AnonymousClass22c A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60642yt)) {
            return false;
        }
        C60642yt r4 = (C60642yt) obj;
        return Arrays.equals(this.A01, r4.A01) && this.A00 == r4.A00;
    }

    public C60642yt(AnonymousClass22c r1, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = r1;
    }

    public int hashCode() {
        return (C18310x6.A08(this.A00, AnonymousClass002.A0L(), 0) * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncdOperation{bytes=");
        C18280x3.A1J(A0o, this.A01);
        A0o.append(", syncdOperation=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
