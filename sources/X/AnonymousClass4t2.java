package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.R;
import java.io.File;

/* renamed from: X.4t2  reason: invalid class name */
public class AnonymousClass4t2 extends C95284tF implements C179338iz {
    public int A00 = 1;
    public Paint A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public Drawable A07;
    public TextPaint A08;
    public C620733j A09;
    public C106065Xm A0A;
    public boolean A0B;

    public final TextPaint A02() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize(C86664Kz.A01(C18290x4.A0G(this), R.dimen.f6nameremoved));
        return textPaint;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r1 == 3) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r4 == false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r3 != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r4 != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r5 == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r1 == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r12.A08 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r12.A08 = A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r3 = X.C107565bW.A0A(r12.A09, r1);
        r4 = ((float) r0) + (r12.A08.getTextSize() / 3.0f);
        r2 = X.C86664Kz.A02(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (X.C1001059l.A04 == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = X.C86664Kz.A01(X.C18290x4.A0G(r12), com.whatsapp.R.dimen.f6nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r13.drawText(r3, r4, r2 - r0, r12.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c4, code lost:
        r0 = r12.A08.getTextSize() / 3.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cd, code lost:
        r6 = r12.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cf, code lost:
        if (r6 != null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d1, code lost:
        r6 = X.AnonymousClass0RP.A00(getContext(), com.whatsapp.R.drawable.mark_video);
        r12.A07 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01df, code lost:
        r6 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e1, code lost:
        if (r6 != null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e3, code lost:
        r6 = X.AnonymousClass0RP.A00(getContext(), com.whatsapp.R.drawable.mark_gif);
        r12.A02 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f0, code lost:
        if (r6 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        r9 = r12.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f4, code lost:
        if (r9 != null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f6, code lost:
        r9 = X.AnonymousClass0RP.A00(getContext(), com.whatsapp.R.drawable.gallery_album_overlay);
        r12.A06 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0203, code lost:
        r9.setBounds(0, getHeight() - (r6.getIntrinsicHeight() * 2), getWidth(), getHeight());
        r12.A06.draw(r13);
        r5 = r6.getIntrinsicHeight() / 4;
        r6.setBounds(r5, X.AnonymousClass4L0.A02(r6, getHeight()) - r5, r6.getIntrinsicWidth() + r5, getHeight() - r5);
        r6.draw(r13);
        r0 = r6.getIntrinsicWidth() + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0244, code lost:
        r1 = r2.B7A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024a, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != 1) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.graphics.Canvas r13) {
        /*
            r12 = this;
            X.8ug r0 = r12.A0A
            if (r0 == 0) goto L_0x01b7
            android.graphics.drawable.Drawable r0 = r12.getDrawable()
            if (r0 == 0) goto L_0x01b7
            int r0 = r12.A00
            r8 = 2
            r7 = 3
            if (r0 == r7) goto L_0x0066
            X.8ug r2 = r12.A0A
            int r1 = r2.getType()
            r5 = 1
            r0 = 0
            r4 = 1
            if (r1 == r8) goto L_0x001f
            r4 = 0
            r3 = 1
            if (r1 == r5) goto L_0x024a
        L_0x001f:
            r3 = 0
            if (r1 != r7) goto L_0x024a
        L_0x0022:
            r10 = 0
            if (r4 == 0) goto L_0x0244
            r1 = 0
        L_0x0028:
            if (r3 != 0) goto L_0x01cd
            if (r4 != 0) goto L_0x01df
            if (r5 == 0) goto L_0x0066
        L_0x002e:
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0066
            android.text.TextPaint r3 = r12.A08
            if (r3 != 0) goto L_0x003c
            android.text.TextPaint r3 = r12.A02()
            r12.A08 = r3
        L_0x003c:
            X.33j r3 = r12.A09
            java.lang.String r3 = X.C107565bW.A0A(r3, r1)
            float r4 = (float) r0
            android.text.TextPaint r0 = r12.A08
            float r0 = r0.getTextSize()
            r1 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 / r1
            float r4 = r4 + r0
            float r2 = X.C86664Kz.A02(r12)
            boolean r0 = X.C1001059l.A04
            if (r0 == 0) goto L_0x01c4
            android.content.res.Resources r1 = X.C18290x4.A0G(r12)
            r0 = 2131166353(0x7f070491, float:1.7946949E38)
            float r0 = X.C86664Kz.A01(r1, r0)
        L_0x0060:
            float r2 = r2 - r0
            android.text.TextPaint r0 = r12.A08
            r13.drawText(r3, r4, r2, r0)
        L_0x0066:
            X.8ug r4 = r12.A0A
            boolean r0 = r4 instanceof X.AnonymousClass8GZ
            if (r0 == 0) goto L_0x01b7
            X.8GZ r4 = (X.AnonymousClass8GZ) r4
            int r0 = r12.A00
            if (r0 == r8) goto L_0x00ff
            X.1mV r0 = r4.A03
            if (r0 == 0) goto L_0x00ff
            X.33j r0 = r12.A09
            if (r0 == 0) goto L_0x00ff
            android.text.TextPaint r0 = r12.A08
            if (r0 != 0) goto L_0x0084
            android.text.TextPaint r0 = r12.A02()
            r12.A08 = r0
        L_0x0084:
            int r0 = r4.getType()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r0 == r7) goto L_0x00b2
            android.graphics.drawable.Drawable r3 = r12.A05
            if (r3 != 0) goto L_0x009d
            android.content.Context r1 = r12.getContext()
            r0 = 2131231628(0x7f08038c, float:1.8079342E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass0RP.A00(r1, r0)
            r12.A05 = r3
        L_0x009d:
            int r2 = r12.getWidth()
            android.text.TextPaint r0 = r12.A08
            float r0 = r0.getTextSize()
            float r0 = r0 * r9
            int r1 = (int) r0
            r0 = 0
            r3.setBounds(r0, r0, r2, r1)
            android.graphics.drawable.Drawable r0 = r12.A05
            r0.draw(r13)
        L_0x00b2:
            X.33j r3 = r12.A09
            X.1mV r2 = r4.A03
            long r0 = r2.A00
            java.lang.String r8 = X.AnonymousClass35V.A03(r3, r0)
            android.text.TextPaint r0 = r12.A08
            float r3 = r0.getTextSize()
            r6 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r6
            android.text.TextPaint r0 = r12.A08
            float r0 = r0.getTextSize()
            r5 = 1068149419(0x3faaaaab, float:1.3333334)
            float r0 = r0 * r5
            int r0 = (int) r0
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A08
            r13.drawText(r8, r3, r1, r0)
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x00ff
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "fw score: "
            r1.append(r0)
            int r0 = r2.A06
            java.lang.String r3 = X.AnonymousClass000.A0h(r1, r0)
            android.text.TextPaint r0 = r12.A08
            float r2 = r0.getTextSize()
            float r2 = r2 / r6
            android.text.TextPaint r0 = r12.A08
            float r0 = r0.getTextSize()
            float r0 = r0 * r5
            float r0 = r0 * r9
            int r0 = (int) r0
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A08
            r13.drawText(r3, r2, r1, r0)
        L_0x00ff:
            int r0 = r12.A00
            if (r0 == r7) goto L_0x01b7
            X.1mV r5 = r4.A03
            if (r5 == 0) goto L_0x01bc
            boolean r0 = X.C106215Yb.A02(r5)
            if (r0 == 0) goto L_0x01b8
            android.graphics.drawable.Drawable r0 = r12.A03
            if (r0 != 0) goto L_0x011e
            android.content.Context r1 = r12.getContext()
            r0 = 2131233128(0x7f080968, float:1.8082385E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r1, r0)
            r12.A03 = r0
        L_0x011e:
            int r6 = r12.getWidth()
            android.graphics.drawable.Drawable r0 = r12.A03
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r1 = r12.getHeight()
            android.graphics.drawable.Drawable r0 = r12.A03
            int r3 = X.AnonymousClass4L0.A02(r0, r1)
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            android.graphics.drawable.Drawable r2 = r12.A03
            r2.setBounds(r6, r3, r1, r0)
            int r1 = r12.getWidth()
            int r0 = r2.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r12.A03(r13, r4, r0)
            r2.draw(r13)
            r2 = 1
        L_0x0151:
            boolean r0 = r5.A1F
            if (r0 == 0) goto L_0x01ba
            android.graphics.drawable.Drawable r0 = r12.A04
            if (r0 != 0) goto L_0x0166
            android.content.Context r1 = r12.getContext()
            r0 = 2131233139(0x7f080973, float:1.8082407E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r1, r0)
            r12.A04 = r0
        L_0x0166:
            int r6 = r12.getWidth()
            android.graphics.drawable.Drawable r0 = r12.A04
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r1 = r12.getHeight()
            android.graphics.drawable.Drawable r0 = r12.A04
            int r5 = X.AnonymousClass4L0.A02(r0, r1)
            int r3 = r12.getWidth()
            int r1 = r12.getHeight()
            if (r2 == 0) goto L_0x01a2
            android.graphics.drawable.Drawable r0 = r12.A03
            if (r0 == 0) goto L_0x01a2
            android.graphics.Rect r2 = r0.getBounds()
            int r6 = r2.left
            android.graphics.drawable.Drawable r0 = r12.A04
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r1 = r2.bottom
            android.graphics.drawable.Drawable r0 = r12.A04
            int r5 = X.AnonymousClass4L0.A02(r0, r1)
            int r3 = r2.left
            int r1 = r2.bottom
        L_0x01a2:
            android.graphics.drawable.Drawable r2 = r12.A04
            r2.setBounds(r6, r5, r3, r1)
            int r1 = r12.getWidth()
            int r0 = r2.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r12.A03(r13, r4, r0)
            r2.draw(r13)
        L_0x01b7:
            return
        L_0x01b8:
            r2 = 0
            goto L_0x0151
        L_0x01ba:
            if (r2 != 0) goto L_0x01b7
        L_0x01bc:
            float r0 = X.AnonymousClass4L0.A00(r12)
            r12.A03(r13, r4, r0)
            return
        L_0x01c4:
            android.text.TextPaint r0 = r12.A08
            float r0 = r0.getTextSize()
            float r0 = r0 / r1
            goto L_0x0060
        L_0x01cd:
            android.graphics.drawable.Drawable r6 = r12.A07
            if (r6 != 0) goto L_0x01f2
            android.content.Context r4 = r12.getContext()
            r3 = 2131233079(0x7f080937, float:1.8082285E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass0RP.A00(r4, r3)
            r12.A07 = r6
            goto L_0x01f0
        L_0x01df:
            android.graphics.drawable.Drawable r6 = r12.A02
            if (r6 != 0) goto L_0x01f2
            android.content.Context r4 = r12.getContext()
            r3 = 2131233077(0x7f080935, float:1.8082281E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass0RP.A00(r4, r3)
            r12.A02 = r6
        L_0x01f0:
            if (r6 == 0) goto L_0x002e
        L_0x01f2:
            android.graphics.drawable.Drawable r9 = r12.A06
            if (r9 != 0) goto L_0x0203
            android.content.Context r4 = r12.getContext()
            r3 = 2131231627(0x7f08038b, float:1.807934E38)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass0RP.A00(r4, r3)
            r12.A06 = r9
        L_0x0203:
            int r5 = r12.getHeight()
            int r3 = r6.getIntrinsicHeight()
            int r3 = r3 * 2
            int r5 = r5 - r3
            int r4 = r12.getWidth()
            int r3 = r12.getHeight()
            r9.setBounds(r0, r5, r4, r3)
            android.graphics.drawable.Drawable r0 = r12.A06
            r0.draw(r13)
            int r0 = r6.getIntrinsicHeight()
            int r5 = r0 / 4
            int r0 = r12.getHeight()
            int r4 = X.AnonymousClass4L0.A02(r6, r0)
            int r4 = r4 - r5
            int r3 = r6.getIntrinsicWidth()
            int r3 = r3 + r5
            int r0 = r12.getHeight()
            int r0 = r0 - r5
            r6.setBounds(r5, r4, r3, r0)
            r6.draw(r13)
            int r0 = r6.getIntrinsicWidth()
            int r0 = r0 + r5
            goto L_0x002e
        L_0x0244:
            long r1 = r2.B7A()
            goto L_0x0028
        L_0x024a:
            r5 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4t2.A01(android.graphics.Canvas):void");
    }

    public final void A03(Canvas canvas, AnonymousClass8GZ r9, float f) {
        String str;
        File file = r9.A04;
        if (file != null) {
            str = file.getName();
        } else {
            str = null;
        }
        if (r9.getType() == 4 && !TextUtils.isEmpty(str)) {
            if (this.A08 == null) {
                this.A08 = A02();
            }
            Drawable drawable = this.A06;
            if (drawable == null) {
                drawable = C18310x6.A0G(getContext(), R.drawable.gallery_album_overlay);
                this.A06 = drawable;
            }
            drawable.setBounds(0, getHeight() - ((int) (this.A08.getTextSize() * 2.0f)), getWidth(), getHeight());
            this.A06.draw(canvas);
            TextPaint textPaint = this.A08;
            canvas.drawText(C86654Ky.A0l(textPaint, str, f - ((textPaint.getTextSize() / 3.0f) * 2.0f)), this.A08.getTextSize() / 3.0f, C86664Kz.A02(this) - (this.A08.getTextSize() / 3.0f), this.A08);
        }
    }

    public void onDraw(Canvas canvas) {
        C186058ug r0 = this.A0A;
        Canvas canvas2 = canvas;
        if (r0 != null && r0.getType() == 3) {
            if (this.A01 == null) {
                Paint A0B2 = C86604Kt.A0B();
                A0B2.setColor(-16777216);
                A0B2.setAlpha(51);
                AnonymousClass001.A10(A0B2);
                this.A01 = A0B2;
            }
            canvas2.drawRect(0.0f, 0.0f, AnonymousClass4L0.A00(this), C86664Kz.A02(this), this.A01);
        }
        super.onDraw(canvas);
    }

    public AnonymousClass4t2(Context context) {
        super(context);
    }

    public void setDetailsLevel(int i) {
        this.A00 = i;
    }

    public void setMediaItem(C186058ug r3) {
        super.setMediaItem(r3);
        C186058ug r1 = this.A0A;
        if (r1 instanceof AnonymousClass8GZ) {
            C107315b6.A08(this, ((AnonymousClass8GZ) r1).A03.A1J);
        }
    }

    public void setShowForwardScore(boolean z) {
        this.A0B = z;
    }
}
