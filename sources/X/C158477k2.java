package X;

import java.util.Locale;

/* renamed from: X.7k2  reason: invalid class name and case insensitive filesystem */
public final class C158477k2 {
    public static final C158477k2 A03 = new C158477k2(1.0f, 1.0f);
    public final float A00;
    public final float A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C158477k2.class != obj.getClass()) {
                return false;
            }
            C158477k2 r5 = (C158477k2) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6C8.A04(Float.floatToRawIntBits(this.A01)) + Float.floatToRawIntBits(this.A00);
    }

    public C158477k2(float f, float f2) {
        boolean z = true;
        C161487pm.A03(AnonymousClass001.A1W((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        C161487pm.A03(f2 <= 0.0f ? false : z);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = AnonymousClass001.A07(f, 1000.0f);
    }

    public String toString() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = Float.valueOf(this.A01);
        A0M[1] = Float.valueOf(this.A00);
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", A0M);
    }
}
