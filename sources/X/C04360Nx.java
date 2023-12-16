package X;

/* renamed from: X.0Nx  reason: invalid class name and case insensitive filesystem */
public class C04360Nx {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = 0;
    public long A06 = Long.MIN_VALUE;
    public long A07 = -1;

    public final float A00(long j) {
        long j2 = this.A06;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.A07;
        if (j3 < 0 || j < j3) {
            float f = ((float) (j - j2)) / ((float) this.A04);
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            return f * 0.5f;
        }
        float f2 = this.A00;
        float f3 = 1.0f - f2;
        float f4 = ((float) (j - j3)) / ((float) this.A02);
        if (f4 > 1.0f) {
            f4 = 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        return f3 + (f2 * f4);
    }
}
