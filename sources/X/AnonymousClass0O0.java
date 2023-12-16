package X;

/* renamed from: X.0O0  reason: invalid class name */
public class AnonymousClass0O0 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass0FL A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.A09.hashCode() * 31) + this.A08.hashCode()) * 31)) + this.A02)) * 31) + this.A07.ordinal()) * 31) + this.A06;
        return AnonymousClass000.A00(hashCode * 31, (long) Float.floatToRawIntBits(this.A01)) + this.A04;
    }

    public AnonymousClass0O0(AnonymousClass0FL r1, String str, String str2, float f, float f2, float f3, float f4, int i, int i2, int i3, boolean z) {
        this.A09 = str;
        this.A08 = str2;
        this.A02 = f;
        this.A07 = r1;
        this.A06 = i;
        this.A01 = f2;
        this.A00 = f3;
        this.A04 = i2;
        this.A05 = i3;
        this.A03 = f4;
        this.A0A = z;
    }
}
