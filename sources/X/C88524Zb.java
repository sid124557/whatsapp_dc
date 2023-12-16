package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.4Zb  reason: invalid class name and case insensitive filesystem */
public class C88524Zb extends AnonymousClass6KS {
    public View.OnClickListener A00;
    public final Rect A01 = AnonymousClass001.A0N();
    public final RectF A02;
    public final C86804Lx A03;
    public final C166297yS A04;

    public int A01(float f, float f2) {
        return this.A02.contains(f, f2) ? 1 : 0;
    }

    public boolean A0A(float f, float f2) {
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener == null) {
            return true;
        }
        onClickListener.onClick((View) null);
        return true;
    }

    public void A0B(Canvas canvas) {
        C106725a3 r13 = this.A0A;
        double d = this.A00;
        double d2 = this.A01;
        float[] fArr = this.A0C;
        r13.A08(fArr, d, d2);
        float f = fArr[0];
        float f2 = fArr[1];
        C86804Lx r6 = this.A03;
        Rect bounds = r6.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        Rect rect = this.A01;
        RectF rectF = r6.A0T;
        float width2 = rectF.width();
        float f3 = r6.A0E * 2.0f;
        rect.set(Math.round(f - ((width2 + f3) / 2.0f)), Math.round(f2 - ((float) height)), Math.round(f + (((float) width) - ((rectF.width() + f3) / 2.0f))), Math.round(f2));
        r13.A08(fArr, this.A00, this.A01);
        float width3 = (float) rect.width();
        float height2 = (float) rect.height();
        float f4 = (float) rect.left;
        float f5 = (float) rect.top;
        this.A02.set(f4, f5, (width3 + f4) - r6.A00(), height2 + f5);
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(f4, f5);
        r6.draw(canvas2);
        canvas2.restore();
    }

    public void A0C() {
        C109065e1 r0 = this.A04.A03;
        if (r0 != null) {
            this.A03.A09 = r0.A0I;
        }
        C86804Lx r2 = this.A03;
        r2.A0A = true;
        Context context = this.A09.A0P;
        C162457s7.A0J(context, 0);
        r2.A04 = AnonymousClass5YI.A04(context, 54.0f);
        r2.A01();
        A02();
    }

    public C88524Zb(Bitmap bitmap, C110885hC r6, C166297yS r7) {
        super(r6);
        float f;
        Context context = r6.A0P;
        this.A02 = AnonymousClass002.A07();
        this.A04 = r7;
        C109065e1 r3 = r7.A03;
        if (r3 != null) {
            this.A00 = C106725a3.A01(r3.A0C.doubleValue());
            this.A01 = C106725a3.A00(r3.A0B.doubleValue());
        }
        if (r7.A01) {
            C162457s7.A0J(context, 0);
            f = 120.0f;
        } else {
            C162457s7.A0J(context, 0);
            f = 54.0f;
        }
        C86804Lx r1 = new C86804Lx(context, bitmap, AnonymousClass5YI.A04(context, f));
        this.A03 = r1;
        r1.A0A = !r7.A01;
        r1.A02(r1.A0G);
    }
}
