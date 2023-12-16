package X;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: X.7hc  reason: invalid class name and case insensitive filesystem */
public final class C157037hc {
    public static final C157037hc A0G;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Bitmap A0C;
    public final Layout.Alignment A0D;
    public final CharSequence A0E;
    public final boolean A0F;

    static {
        C157757ip r1 = new C157757ip();
        r1.A0E = "";
        A0G = r1.A00();
    }

    public C157037hc(Bitmap bitmap, Layout.Alignment alignment, CharSequence charSequence, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            C161487pm.A03(AnonymousClass000.A1X(bitmap));
        }
        this.A0E = charSequence;
        this.A0D = alignment;
        this.A0C = bitmap;
        this.A01 = f;
        this.A07 = i;
        this.A06 = i2;
        this.A02 = f2;
        this.A08 = i3;
        this.A04 = f4;
        this.A00 = f5;
        this.A0F = z;
        this.A0B = i5;
        this.A09 = i4;
        this.A05 = f3;
        this.A0A = i6;
        this.A03 = f6;
    }
}
