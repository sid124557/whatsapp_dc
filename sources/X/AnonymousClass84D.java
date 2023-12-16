package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.84D  reason: invalid class name */
public final class AnonymousClass84D implements C183778qd {
    public AnonymousClass57t A00 = AnonymousClass57t.NONE;
    public C142746xh A01;
    public C142556xO A02;
    public C124556Cz A03;
    public C124556Cz A04;
    public C150647Rq A05;
    public C156257gJ A06;
    public final Context A07;
    public final RectF A08 = AnonymousClass002.A07();
    public final C620733j A09;
    public final C183508q9 A0A;
    public final AnonymousClass66R A0B = AnonymousClass8P7.A00(C175128Xe.A00);
    public final AnonymousClass66R A0C = AnonymousClass8P7.A00(new C174918Wj(this));
    public final AnonymousClass66R A0D = AnonymousClass8P7.A00(C175138Xf.A00);

    public static void A00(Drawable drawable, AnonymousClass84D r7, float f) {
        AnonymousClass66R r4 = r7.A0D;
        ((RectF) r4.getValue()).set(r7.A08);
        float f2 = (float) 2;
        ((RectF) r4.getValue()).inset((((RectF) r4.getValue()).width() / f2) * f, (((RectF) r4.getValue()).height() / f2) * f);
        drawable.setBounds((int) ((RectF) r4.getValue()).left, (int) ((RectF) r4.getValue()).top, (int) ((RectF) r4.getValue()).right, (int) ((RectF) r4.getValue()).bottom);
    }

    public final void A01() {
        float f = (float) ((C153317b2) this.A0C.getValue()).A07.A00;
        C124556Cz r2 = this.A03;
        if (r2 != null) {
            A00(r2, this, f);
            r2.setAlpha((int) (((double) 255) * (1.0d - ((double) f))));
        }
        C124556Cz r22 = this.A04;
        if (r22 != null) {
            A00(r22, this, (float) (1.0d - ((double) f)));
            r22.setAlpha((int) (((float) 255) * f));
        }
    }

    public void A02(RectF rectF) {
        float f;
        float f2;
        C150647Rq r0 = this.A05;
        Context context = this.A07;
        float dimension = context.getResources().getDimension(r0.A00);
        PointF A002 = C159497lw.A00(context, this.A01, this.A02);
        RectF rectF2 = this.A08;
        float f3 = rectF.bottom - (dimension - A002.y);
        rectF2.top = f3;
        rectF2.bottom = f3 + dimension;
        if (this.A09.A0U()) {
            f = rectF.left;
            f2 = A002.x;
        } else {
            f = rectF.right;
            f2 = dimension - A002.x;
        }
        float f4 = f - f2;
        rectF2.left = f4;
        float f5 = f4 + dimension;
        rectF2.right = f5;
        float A003 = this.A05.A00();
        rectF2.left = f4 - A003;
        rectF2.top -= A003;
        rectF2.right = f5 + A003;
        rectF2.bottom += A003;
        A01();
    }

    public void Bbu(C153317b2 r6) {
        AnonymousClass57t r0;
        double d = r6.A07.A00;
        if (d == 0.0d) {
            r0 = AnonymousClass57t.NONE;
        } else if (d == 1.0d) {
            r0 = AnonymousClass57t.CHECKED;
        } else {
            return;
        }
        this.A00 = r0;
    }

    public AnonymousClass84D(Context context, C620733j r4, C183508q9 r5, C142746xh r6, C142556xO r7, C156257gJ r8) {
        C124556Cz r0;
        this.A07 = context;
        this.A09 = r4;
        this.A0A = r5;
        this.A01 = r6;
        C150647Rq A012 = C159497lw.A01(context, r7);
        this.A05 = A012;
        if (r8 != null) {
            r0 = new C124556Cz(context, A012, r8);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A02 = r7;
        this.A06 = r8;
    }

    public void Bbv(C153317b2 r2) {
        A01();
        this.A0A.invalidate();
    }
}
