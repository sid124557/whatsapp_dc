package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.012  reason: invalid class name */
public class AnonymousClass012 extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public Bitmap A04;
    public Paint A05;
    public PorterDuff.Mode A06;
    public PorterDuff.Mode A07;
    public AnonymousClass0WC A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public void A00(int i, int i2) {
        this.A04.eraseColor(0);
        Canvas canvas = new Canvas(this.A04);
        AnonymousClass0WC r0 = this.A08;
        r0.A00(canvas, AnonymousClass0WC.A0G, r0.A0F, i, i2);
    }

    public int getChangingConfigurations() {
        return this.A01;
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass0AQ(this);
    }

    public AnonymousClass012(AnonymousClass012 r4) {
        this.A03 = null;
        this.A07 = AnonymousClass0AQ.A09;
        if (r4 != null) {
            this.A01 = r4.A01;
            AnonymousClass0WC r2 = new AnonymousClass0WC(r4.A08);
            this.A08 = r2;
            Paint paint = r4.A08.A06;
            if (paint != null) {
                r2.A06 = new Paint(paint);
            }
            Paint paint2 = r4.A08.A07;
            if (paint2 != null) {
                this.A08.A07 = new Paint(paint2);
            }
            this.A03 = r4.A03;
            this.A07 = r4.A07;
            this.A09 = r4.A09;
        }
    }

    public AnonymousClass012() {
        this.A03 = null;
        this.A07 = AnonymousClass0AQ.A09;
        this.A08 = new AnonymousClass0WC();
    }

    public Drawable newDrawable() {
        return new AnonymousClass0AQ(this);
    }
}
