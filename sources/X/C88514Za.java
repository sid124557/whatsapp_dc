package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4Za  reason: invalid class name and case insensitive filesystem */
public class C88514Za extends AnonymousClass6KS {
    public static Bitmap A0F;
    public static Bitmap A0G;
    public Bitmap A00;
    public Bitmap A01;
    public View.OnClickListener A02;
    public C184228rS A03 = new AnonymousClass92J(this, 3);
    public boolean A04;
    public final Context A05;
    public final Paint A06;
    public final Paint A07;
    public final Paint A08;
    public final Rect A09 = AnonymousClass001.A0N();
    public final RectF A0A;
    public final C151167Tr A0B;
    public final C86804Lx A0C;
    public final C166297yS A0D;
    public final C109065e1 A0E;

    public C88514Za(C110885hC r8, C151167Tr r9, C166297yS r10, C109065e1 r11) {
        super(r8);
        String str;
        this.A0D = r10;
        this.A0A = AnonymousClass002.A07();
        this.A08 = C86664Kz.A0Z();
        this.A0E = r11;
        Context context = r8.A0P;
        this.A05 = context;
        this.A04 = true;
        this.A0B = r9;
        this.A07 = C86664Kz.A0a(1);
        this.A06 = C86664Kz.A0a(1);
        this.A01 = C106725a3.A00(r11.A0B.doubleValue());
        this.A00 = C106725a3.A01(r11.A0C.doubleValue());
        C162457s7.A0J(context, 0);
        int A022 = AnonymousClass5YI.A02(context);
        Bitmap bitmap = A0F;
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_contact);
            A0F = bitmap;
        }
        C86804Lx r1 = new C86804Lx(context, bitmap, A022);
        this.A0C = r1;
        r1.A0A = false;
        r1.A02(r1.A0G);
        r1.A01();
        Paint paint = this.A07;
        AnonymousClass001.A10(paint);
        Paint paint2 = this.A06;
        C86634Kw.A17(paint2);
        Context context2 = this.A05;
        C86624Kv.A0k(context2.getResources(), paint2, R.color.f5nameremoved);
        paint2.setStrokeWidth(AnonymousClass5YI.A01(context2, 1.0f));
        this.A08.setStyle(Paint.Style.FILL_AND_STROKE);
        List list = this.A0E.A0M;
        if (list.isEmpty()) {
            str = "";
        } else {
            str = ((C166067y5) list.get(0)).A02;
        }
        C86624Kv.A0k(context2.getResources(), paint, C154257cs.A00(str));
        this.A0B.A00(new AnonymousClass92J(this, 2), this.A0E.A04(), AnonymousClass5YI.A04(this.A05, 24.0f));
    }

    public int A01(float f, float f2) {
        return this.A0A.contains(f, f2) ? 1 : 0;
    }

    public boolean A0A(float f, float f2) {
        View.OnClickListener onClickListener;
        boolean z = this.A04;
        if (z && (onClickListener = this.A02) != null) {
            onClickListener.onClick((View) null);
        }
        return z;
    }

    public void A0B(Canvas canvas) {
        Rect rect;
        int round;
        int round2;
        int round3;
        String str;
        C106725a3 r13 = this.A0A;
        double d = this.A00;
        double d2 = this.A01;
        float[] fArr = this.A0C;
        r13.A08(fArr, d, d2);
        float f = fArr[0];
        float f2 = fArr[1];
        C166297yS r2 = this.A0D;
        if (r2.A01) {
            C86804Lx r5 = this.A0C;
            Rect bounds = r5.getBounds();
            int width = bounds.width();
            int height = bounds.height();
            rect = this.A09;
            RectF rectF = r5.A0T;
            float width2 = rectF.width();
            float f3 = r5.A0E * 2.0f;
            round = Math.round(f - ((width2 + f3) / 2.0f));
            round2 = Math.round(f2 - ((float) height));
            round3 = Math.round(f + (((float) width) - ((rectF.width() + f3) / 2.0f)));
        } else {
            rect = this.A09;
            float A042 = (float) (AnonymousClass5YI.A04(this.A05, 24.0f) / 2);
            round = Math.round(f - A042);
            round2 = Math.round(f2 - A042);
            round3 = Math.round(f + A042);
            f2 += A042;
        }
        rect.set(round, round2, round3, Math.round(f2));
        r13.A08(fArr, this.A00, this.A01);
        Canvas canvas2 = canvas;
        if (r2.A01) {
            int i = rect.left;
            int i2 = rect.top;
            float width3 = (float) rect.width();
            float height2 = (float) rect.height();
            RectF rectF2 = this.A0A;
            float f4 = (float) i;
            float f5 = (float) i2;
            C86804Lx r6 = this.A0C;
            rectF2.set(f4, f5, (width3 + f4) - r6.A00(), height2 + f5);
            canvas2.save();
            canvas2.translate(f4, f5);
            if (this.A00 == null && (str = this.A0E.A0G) != null) {
                this.A00 = AnonymousClass30R.A07;
                C151167Tr r22 = this.A0B;
                Context context = this.A05;
                C162457s7.A0J(context, 0);
                r22.A00(this.A03, str, AnonymousClass5YI.A02(context));
            }
            r6.draw(canvas2);
        } else {
            int centerX = rect.centerX();
            int centerY = rect.centerY();
            float width4 = (float) rect.width();
            float f6 = (float) centerX;
            float f7 = width4 / 2.0f;
            float f8 = (float) centerY;
            float height3 = ((float) rect.height()) / 2.0f;
            this.A0A.set(f6 - f7, f8 - height3, f7 + f6, height3 + f8);
            canvas2.save();
            canvas2.translate(f6, f8);
            Context context2 = this.A05;
            int A043 = AnonymousClass5YI.A04(context2, 24.0f) / 2;
            int A044 = AnonymousClass5YI.A04(context2, 6.0f);
            int A045 = AnonymousClass5YI.A04(context2, 1.0f);
            canvas2.drawCircle(0.0f, 0.0f, (float) A043, this.A07);
            canvas2.drawCircle(0.0f, 0.0f, (float) (A043 - A045), this.A06);
            if (this.A01 != null) {
                RectF A072 = AnonymousClass002.A07();
                float f9 = (float) (A043 - A044);
                A072.left -= f9;
                A072.right = f9;
                A072.top -= f9;
                A072.bottom = f9;
                canvas2.drawBitmap(this.A01, (Rect) null, A072, this.A08);
            }
        }
        canvas2.restore();
    }
}
