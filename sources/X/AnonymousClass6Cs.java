package X;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.6Cs  reason: invalid class name */
public final class AnonymousClass6Cs extends Drawable.ConstantState {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public ColorStateList A0B = null;
    public ColorStateList A0C = null;
    public ColorStateList A0D = null;
    public ColorStateList A0E = null;
    public ColorFilter A0F;
    public Paint.Style A0G;
    public PorterDuff.Mode A0H;
    public Rect A0I;
    public C157567iW A0J;
    public C161877ql A0K;
    public boolean A0L;

    public static void A00(AnonymousClass6Cs r2) {
        r2.A0H = PorterDuff.Mode.SRC_IN;
        r2.A0I = null;
        r2.A03 = 1.0f;
        r2.A01 = 1.0f;
        r2.A06 = 255;
        r2.A02 = 0.0f;
        r2.A00 = 0.0f;
        r2.A05 = 0.0f;
        r2.A07 = 0;
        r2.A09 = 0;
        r2.A08 = 0;
        r2.A0A = 0;
        r2.A0L = false;
        r2.A0G = Paint.Style.FILL_AND_STROKE;
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        AnonymousClass6D7 r1 = new AnonymousClass6D7(this);
        r1.A05 = true;
        return r1;
    }

    public AnonymousClass6Cs(AnonymousClass6Cs r3) {
        A00(this);
        this.A0K = r3.A0K;
        this.A0J = r3.A0J;
        this.A04 = r3.A04;
        this.A0F = r3.A0F;
        this.A0B = r3.A0B;
        this.A0C = r3.A0C;
        this.A0H = r3.A0H;
        this.A0E = r3.A0E;
        this.A06 = r3.A06;
        this.A03 = r3.A03;
        this.A08 = r3.A08;
        this.A07 = r3.A07;
        this.A0L = r3.A0L;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A00 = r3.A00;
        this.A05 = r3.A05;
        this.A09 = r3.A09;
        this.A0A = r3.A0A;
        this.A0D = r3.A0D;
        this.A0G = r3.A0G;
        Rect rect = r3.A0I;
        if (rect != null) {
            this.A0I = new Rect(rect);
        }
    }

    public AnonymousClass6Cs(C161877ql r2) {
        A00(this);
        this.A0K = r2;
        this.A0J = null;
    }
}
