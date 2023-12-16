package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.R;
import java.util.HashSet;

/* renamed from: X.4sy  reason: invalid class name and case insensitive filesystem */
public class C95274sy extends AnonymousClass4t2 {
    public int A00;
    public int A01;
    public ValueAnimator A02;
    public Drawable A03;
    public Drawable A04;
    public AnonymousClass5YF A05;
    public AnonymousClass5LQ A06;
    public AnonymousClass6I4 A07;
    public HashSet A08;
    public boolean A09;
    public final Matrix A0A = AnonymousClass002.A05();
    public final Paint A0B;

    public Uri getUri() {
        return this.A05.A0G;
    }

    public AnonymousClass6I4 getViewHolder() {
        return this.A07;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            X.5LQ r0 = r11.A06
            android.view.View r0 = r0.A06
            if (r0 == r11) goto L_0x00b4
            java.util.HashSet r1 = r11.A08
            X.5YF r0 = r11.A05
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00b4
            r5 = r12
            r12.save()
            X.5YF r0 = r11.A05
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x0035
            X.5YF r0 = r11.A05
            int r0 = r0.A01()
            android.graphics.Matrix r3 = r11.A0A
            float r2 = (float) r0
            int r0 = X.C86664Kz.A0B(r11)
            float r1 = (float) r0
            int r0 = X.C86654Ky.A04(r11)
            float r0 = (float) r0
            r3.setRotate(r2, r1, r0)
            r12.concat(r3)
        L_0x0035:
            super.onDraw(r12)
            r12.restore()
            android.graphics.drawable.Drawable r0 = r11.A04
            if (r0 == 0) goto L_0x00b5
            android.animation.ValueAnimator r0 = r11.A02
            if (r0 != 0) goto L_0x0061
            int[] r0 = X.C86664Kz.A1Z()
            r0 = {0, 255} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r11.A02 = r2
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r11.A02
            r0 = 20
            X.C86604Kt.A0w(r1, r11, r0)
            android.animation.ValueAnimator r0 = r11.A02
            r0.start()
        L_0x0061:
            android.graphics.drawable.Drawable r0 = r11.A04
            if (r0 == 0) goto L_0x0099
            int r1 = r11.getHeight()
            android.graphics.drawable.Drawable r0 = r11.A04
            int r0 = X.AnonymousClass4L0.A02(r0, r1)
            int r4 = r0 / 2
            int r1 = r11.getWidth()
            android.graphics.drawable.Drawable r0 = r11.A04
            int r0 = r0.getIntrinsicWidth()
            int r1 = r1 - r0
            int r3 = r1 / 2
            int r0 = r11.A00
            r12.drawColor(r0)
            android.graphics.drawable.Drawable r2 = r11.A04
            int r1 = r2.getIntrinsicWidth()
            int r1 = r1 + r3
            android.graphics.drawable.Drawable r0 = r11.A04
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 + r4
            r2.setBounds(r3, r4, r1, r0)
            android.graphics.drawable.Drawable r0 = r11.A04
        L_0x0096:
            r0.draw(r12)
        L_0x0099:
            boolean r0 = r11.isPressed()
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r11.isSelected()
            if (r0 == 0) goto L_0x00b4
        L_0x00a5:
            r6 = 0
            float r8 = X.AnonymousClass4L0.A00(r11)
            float r9 = X.C86664Kz.A02(r11)
            android.graphics.Paint r10 = r11.A0B
            r7 = r6
            r5.drawRect(r6, r7, r8, r9, r10)
        L_0x00b4:
            return
        L_0x00b5:
            android.graphics.drawable.Drawable r0 = r11.A03
            if (r0 == 0) goto L_0x0099
            int r0 = r0.getIntrinsicHeight()
            int r4 = r0 / 4
            android.graphics.drawable.Drawable r3 = r11.A03
            int r1 = r11.getHeight()
            android.graphics.drawable.Drawable r0 = r11.A03
            int r2 = X.AnonymousClass4L0.A02(r0, r1)
            int r2 = r2 - r4
            android.graphics.drawable.Drawable r0 = r11.A03
            int r1 = r0.getIntrinsicWidth()
            int r1 = r1 + r4
            int r0 = r11.getHeight()
            int r0 = r0 - r4
            r3.setBounds(r4, r2, r1, r0)
            int r0 = r11.A00
            r12.drawColor(r0)
            android.graphics.drawable.Drawable r0 = r11.A03
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95274sy.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.A01;
        setMeasuredDimension(i3, i3);
    }

    public void setCustomId(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = R.id.thumb;
        }
        setId(i);
    }

    public void setOverlayIcon(Drawable drawable) {
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.A02 = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        this.A04 = drawable;
    }

    public C95274sy(Context context, AnonymousClass5LQ r5, HashSet hashSet, int i) {
        super(context);
        A00();
        Paint A0Z = C86664Kz.A0Z();
        this.A0B = A0Z;
        this.A06 = r5;
        this.A08 = hashSet;
        this.A01 = i;
        A0Z.setColor(C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        A0Z.setStrokeWidth(C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved));
        C86634Kw.A17(A0Z);
        A0Z.setAntiAlias(true);
        setId(R.id.thumb);
        C86644Kx.A1A(this);
        this.A00 = getResources().getColor(R.color.f5nameremoved);
    }

    public void setIcon(Drawable drawable) {
        this.A03 = drawable;
    }

    public void setItem(AnonymousClass5YF r1) {
        this.A05 = r1;
    }

    public void setViewHolder(AnonymousClass6I4 r1) {
        this.A07 = r1;
    }
}
