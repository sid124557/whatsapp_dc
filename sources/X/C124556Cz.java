package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.6Cz  reason: invalid class name and case insensitive filesystem */
public final class C124556Cz extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public C150647Rq A05;
    public C156257gJ A06;
    public boolean A07;
    public final Context A08;
    public final Path A09 = AnonymousClass002.A06();
    public final Path A0A = AnonymousClass002.A06();
    public final RectF A0B = AnonymousClass002.A07();
    public final AnonymousClass66R A0C;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C124556Cz(android.content.Context r5, X.C150647Rq r6, X.C156257gJ r7) {
        /*
            r4 = this;
            r1 = 2
            r4.<init>()
            r4.A08 = r5
            r0 = 2131102844(0x7f060c7c, float:1.7818137E38)
            int r0 = X.AnonymousClass0Y8.A04(r5, r0)
            r4.A03 = r0
            android.graphics.Path r0 = X.AnonymousClass002.A06()
            r4.A09 = r0
            android.graphics.Path r0 = X.AnonymousClass002.A06()
            r4.A0A = r0
            android.graphics.RectF r0 = X.AnonymousClass002.A07()
            r4.A0B = r0
            boolean r0 = r7 instanceof X.C139996sz
            if (r0 == 0) goto L_0x00b5
            r0 = 2131231702(0x7f0803d6, float:1.8079492E38)
        L_0x0028:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r5, r0)
        L_0x002c:
            if (r0 == 0) goto L_0x00b3
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r0 == 0) goto L_0x00b3
            android.graphics.drawable.Drawable r3 = X.C06130Wj.A01(r0)
            X.C162457s7.A0D(r3)
            boolean r0 = r7 instanceof X.C140016t1
            if (r0 != 0) goto L_0x0052
            X.7NH r0 = r7.A01
            int r2 = r0.A01
            int r0 = r0.A03
            if (r2 == 0) goto L_0x004b
            int r0 = X.AnonymousClass5Yj.A02(r5, r2, r0)
        L_0x004b:
            int r0 = X.AnonymousClass0Y8.A04(r5, r0)
            X.AnonymousClass0YG.A06(r3, r0)
        L_0x0052:
            r4.A04 = r3
            android.content.res.Resources r3 = r5.getResources()
            X.7ZR r2 = r7.A00
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            boolean r0 = r6 instanceof X.C139896sp
            if (r0 == 0) goto L_0x009e
            int r0 = r2.A00
        L_0x0064:
            float r0 = r3.getDimension(r0)
            float r2 = (float) r1
            float r0 = r0 / r2
            r4.A00 = r0
            X.7NH r0 = r7.A01
            int r1 = r0.A00
            int r0 = r0.A02
            if (r1 == 0) goto L_0x0078
            int r0 = X.AnonymousClass5Yj.A02(r5, r1, r0)
        L_0x0078:
            int r0 = X.AnonymousClass0Y8.A04(r5, r0)
            r4.A01 = r0
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r6.A00
            float r1 = r1.getDimension(r0)
            float r0 = r6.A00()
            float r0 = r0 * r2
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.A02 = r0
            X.8Xj r0 = X.C175178Xj.A00
            X.8P7 r0 = X.AnonymousClass8P7.A00(r0)
            r4.A0C = r0
            r4.A05 = r6
            r4.A06 = r7
            return
        L_0x009e:
            boolean r0 = r6 instanceof X.C139926ss
            if (r0 == 0) goto L_0x00a5
            int r0 = r2.A03
            goto L_0x0064
        L_0x00a5:
            boolean r0 = r6 instanceof X.C139916sr
            if (r0 == 0) goto L_0x00ac
            int r0 = r2.A02
            goto L_0x0064
        L_0x00ac:
            boolean r0 = r6 instanceof X.C139906sq
            if (r0 == 0) goto L_0x00f3
            int r0 = r2.A01
            goto L_0x0064
        L_0x00b3:
            r3 = 0
            goto L_0x0052
        L_0x00b5:
            boolean r0 = r7 instanceof X.C139966sw
            if (r0 == 0) goto L_0x00be
            r0 = 2131232060(0x7f08053c, float:1.8080219E38)
            goto L_0x0028
        L_0x00be:
            boolean r0 = r7 instanceof X.C140026t2
            if (r0 == 0) goto L_0x00cb
            r0 = r7
            X.6t2 r0 = (X.C140026t2) r0
            X.592 r0 = r0.A00
            int r0 = r0.drawableRes
            goto L_0x0028
        L_0x00cb:
            boolean r0 = r7 instanceof X.C139986sy
            if (r0 == 0) goto L_0x00d4
            r0 = 2131232283(0x7f08061b, float:1.808067E38)
            goto L_0x0028
        L_0x00d4:
            boolean r0 = r7 instanceof X.C139976sx
            if (r0 == 0) goto L_0x00dd
            r0 = 2131232104(0x7f080568, float:1.8080308E38)
            goto L_0x0028
        L_0x00dd:
            boolean r0 = r7 instanceof X.C140006t0
            if (r0 == 0) goto L_0x00e8
            r0 = r7
            X.6t0 r0 = (X.C140006t0) r0
            int r0 = r0.A00
            goto L_0x0028
        L_0x00e8:
            boolean r0 = r7 instanceof X.C140016t1
            if (r0 == 0) goto L_0x00f8
            r0 = r7
            X.6t1 r0 = (X.C140016t1) r0
            android.graphics.drawable.Drawable r0 = r0.A00
            goto L_0x002c
        L_0x00f3:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00f8:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124556Cz.<init>(android.content.Context, X.7Rq, X.7gJ):void");
    }

    public void draw(Canvas canvas) {
        int i;
        C162457s7.A0J(canvas, 0);
        Drawable drawable = this.A04;
        if (drawable != null) {
            boolean z = this.A07;
            AnonymousClass66R r4 = this.A0C;
            Paint paint = (Paint) r4.getValue();
            if (z) {
                Context context = this.A08;
                i = AnonymousClass0Y8.A04(context, AnonymousClass34K.A01(context, R.attr.f3nameremoved));
            } else {
                i = this.A03;
            }
            paint.setColor(i);
            AnonymousClass6C9.A0s(canvas, this.A0A, r4);
        }
        AnonymousClass66R r2 = this.A0C;
        ((Paint) r2.getValue()).setColor(this.A01);
        AnonymousClass7NH r1 = this.A06.A01;
        if ((r1 instanceof C139936st) || (r1 instanceof C139956sv)) {
            AnonymousClass6C9.A0s(canvas, this.A09, r2);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void onBoundsChange(Rect rect) {
        C162457s7.A0J(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0B;
        rectF.set(rect);
        Path path = this.A0A;
        path.reset();
        float f = (float) 2;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / f, direction);
        float A002 = this.A05.A00();
        rectF.inset(A002, A002);
        Path path2 = this.A09;
        path2.reset();
        path2.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / f, direction);
        Drawable drawable = this.A04;
        if (drawable != null) {
            float centerX = rectF.centerX();
            float f2 = this.A00;
            RectF rectF2 = new RectF(centerX - f2, rectF.centerY() - f2, rectF.centerX() + f2, rectF.centerY() + f2);
            Rect A0N = AnonymousClass001.A0N();
            rectF2.roundOut(A0N);
            drawable.setBounds(A0N);
        }
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.A02;
    }

    public int getIntrinsicWidth() {
        return this.A02;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        ((Paint) this.A0C.getValue()).setAlpha(i);
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
