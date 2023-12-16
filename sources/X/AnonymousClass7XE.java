package X;

import android.view.View;

/* renamed from: X.7XE  reason: invalid class name */
public class AnonymousClass7XE {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7XE)) {
            return false;
        }
        AnonymousClass7XE r4 = (AnonymousClass7XE) obj;
        if (r4.A02 == this.A02 && r4.A03 == this.A03 && r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A07 == this.A07 && r4.A04 == this.A04 && r4.A08 == this.A08 && r4.A09 == this.A09 && r4.A06 == this.A06 && r4.A05 == this.A05) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = Float.valueOf(this.A02);
        objArr[1] = Float.valueOf(this.A03);
        objArr[2] = Float.valueOf(this.A00);
        objArr[3] = Float.valueOf(this.A01);
        C18280x3.A1P(objArr, this.A07);
        C18310x6.A1U(objArr, this.A04);
        C18290x4.A1U(objArr, this.A08);
        return C18310x6.A08(Integer.valueOf(this.A09), objArr, 7);
    }

    public AnonymousClass7XE(View view) {
        int[] A1Z = C86664Kz.A1Z();
        view.getLocationInWindow(A1Z);
        this.A08 = A1Z[0];
        this.A09 = A1Z[1];
        this.A02 = view.getTranslationX();
        this.A03 = view.getTranslationY();
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
        this.A07 = view.getWidth();
        this.A04 = view.getHeight();
        this.A06 = view.getMeasuredWidth();
        this.A05 = view.getMeasuredHeight();
    }
}
