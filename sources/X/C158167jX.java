package X;

/* renamed from: X.7jX  reason: invalid class name and case insensitive filesystem */
public final class C158167jX {
    public static final C158167jX A05 = new C158167jX(1.0f, 1.0f, false, false);
    public final float A00;
    public final float A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C158167jX.class != obj.getClass()) {
                return false;
            }
            C158167jX r5 = (C158167jX) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A03 == r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass6C8.A04(Float.floatToRawIntBits(this.A01)) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0);
    }

    public C158167jX(float f, float f2, boolean z, boolean z2) {
        boolean z3 = true;
        C159197lM.A01(AnonymousClass001.A1W((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        C159197lM.A01(f2 <= 0.0f ? false : z3);
        this.A01 = f;
        this.A00 = f2;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = AnonymousClass001.A07(f, 1000.0f);
    }
}
