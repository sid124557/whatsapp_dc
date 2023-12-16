package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.whatsapp.R;

/* renamed from: X.4Ro  reason: invalid class name */
public class AnonymousClass4Ro extends PopupWindow {
    public int A00 = -1;
    public int A01 = -1;
    public final Context A02;
    public final Resources A03;
    public final Drawable A04;
    public final Drawable A05;
    public final Drawable A06;
    public final LinearLayout A07;
    public final AnonymousClass5XR A08;
    public final AnonymousClass4A4 A09;
    public final AnonymousClass5Y0 A0A;
    public final int[] A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r9 == -1) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r6, int[] r7, int r8, int r9) {
        /*
            r5 = 0
            r4 = 1
            r1 = -1
            if (r8 == r1) goto L_0x0008
            r0 = 0
            if (r9 != r1) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C626936e.A0C(r0)
            java.lang.String r3 = X.C106655Zv.A01(r7)
            r0 = 2
            if (r8 == r1) goto L_0x0027
            r2 = 2131888887(0x7f120af7, float:1.9412422E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            int r0 = A00(r8)
        L_0x001e:
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r6, r0, r1, r4, r2)
            return r0
        L_0x0027:
            if (r9 == r1) goto L_0x0035
            r2 = 2131888888(0x7f120af8, float:1.9412424E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            int r0 = A00(r9)
            goto L_0x001e
        L_0x0035:
            r0 = 2131888889(0x7f120af9, float:1.9412426E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Ro.A01(android.content.Context, int[], int, int):java.lang.String");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4Ro(android.view.View r22, X.AnonymousClass4A4 r23, X.AnonymousClass5Y0 r24, int[] r25, boolean r26) {
        /*
            r21 = this;
            r20 = r22
            android.content.Context r0 = r20.getContext()
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r0 = -2
            r2 = r21
            r2.<init>(r1, r0, r0)
            r0 = -1
            r2.A00 = r0
            r2.A01 = r0
            android.view.View r5 = r2.getContentView()
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r2.A07 = r5
            android.content.Context r6 = r20.getContext()
            r2.A02 = r6
            r4 = r24
            r2.A0A = r4
            android.content.res.Resources r0 = r6.getResources()
            r2.A03 = r0
            java.lang.Object r1 = r25.clone()
            int[] r1 = (int[]) r1
            int[] r3 = X.C107425bI.A05(r25)
            X.5XR r0 = new X.5XR
            r0.<init>(r3)
            java.util.List r7 = r0.A01
            java.util.ArrayList r8 = X.AnonymousClass000.A0p(r7)
            java.util.Iterator r3 = r7.iterator()
        L_0x0047:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C18290x4.A03(r0)
            if (r0 <= 0) goto L_0x0047
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r8.add(r0)
            goto L_0x0047
        L_0x0061:
            int r0 = r8.size()
            r9 = 0
            r3 = 1
            r13 = 2
            if (r0 != r13) goto L_0x008e
            int r0 = r7.size()
            if (r9 >= r0) goto L_0x0197
            java.lang.Object r0 = r7.get(r9)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C18290x4.A03(r0)
        L_0x007a:
            r2.A00 = r0
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x0194
            java.lang.Object r0 = r7.get(r3)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C18290x4.A03(r0)
        L_0x008c:
            r2.A01 = r0
        L_0x008e:
            int[] r0 = X.C107425bI.A07(r1)
            r2.A0B = r0
            int[] r1 = X.C107425bI.A05(r0)
            X.5XR r0 = new X.5XR
            r0.<init>(r1)
            r2.A08 = r0
            r0 = r23
            r2.A09 = r0
            android.view.LayoutInflater r8 = X.C620633i.A00(r6)
            X.C626936e.A06(r8)
            r0 = 2131625485(0x7f0e060d, float:1.887818E38)
            r8.inflate(r0, r5, r3)
            r5.setOrientation(r3)
            r0 = 2131433766(0x7f0b1926, float:1.8489327E38)
            android.view.ViewGroup r7 = X.C86644Kx.A0J(r5, r0)
            X.C626936e.A04(r7)
            int[] r6 = X.C107425bI.A05
            r0 = r6[r9]
            android.graphics.drawable.Drawable r5 = r2.A02(r0)
            if (r5 != 0) goto L_0x0185
            r10 = 0
        L_0x00c8:
            r2.A05 = r10
            r0 = r6[r9]
            android.graphics.drawable.Drawable r5 = r2.A03(r0)
            if (r5 != 0) goto L_0x0176
            r0 = 0
        L_0x00d3:
            r2.A06 = r0
            X.C626936e.A06(r10)
            X.C626936e.A06(r0)
            X.5XR r0 = r2.A08
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r9)
            java.util.Collection r0 = (java.util.Collection) r0
            int[] r0 = X.C159357lh.A02(r0)
            X.4qr r11 = new X.4qr
            r11.<init>(r0)
            long r0 = com.whatsapp.emoji.EmojiDescriptor.A00(r11, r9)
            X.5Y0 r10 = r2.A0A
            android.content.res.Resources r5 = r2.A03
            android.graphics.drawable.Drawable r0 = r10.A05(r5, r11, r0)
            r2.A04 = r0
            int r11 = r6.length
            java.util.ArrayList r12 = X.AnonymousClass002.A0I(r11)
            r10 = 0
        L_0x0102:
            r0 = 3
            if (r10 >= r11) goto L_0x019a
            r5 = r6[r10]
            r1 = 2131625486(0x7f0e060e, float:1.8878181E38)
            android.view.View r1 = r8.inflate(r1, r7, r9)
            com.whatsapp.WaImageButton r1 = (com.whatsapp.WaImageButton) r1
            android.graphics.drawable.Drawable r16 = r2.A02(r5)
            X.C626936e.A06(r16)
            android.graphics.drawable.Drawable r14 = r2.A04
            if (r14 != 0) goto L_0x016b
            android.graphics.drawable.Drawable[] r15 = new android.graphics.drawable.Drawable[r13]
            r15[r9] = r16
            android.graphics.drawable.Drawable r0 = r2.A06
            r15[r3] = r0
        L_0x0123:
            android.content.Context r14 = r2.A02
            int[] r3 = r2.A0B
            r0 = -1
            java.lang.String r3 = A01(r14, r3, r5, r0)
            android.content.res.Resources r14 = r2.A03
            android.graphics.Bitmap r15 = X.C100415Av.A00(r15)
            if (r15 == 0) goto L_0x0169
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r14, r15)
        L_0x0139:
            r1.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            r1.setContentDescription(r3)
            int r0 = r2.A00
            boolean r0 = X.AnonymousClass000.A1U(r5, r0)
            r1.setSelected(r0)
            X.548 r0 = new X.548
            r16 = r1
            r17 = r12
            r18 = r5
            r19 = r9
            r14 = r0
            r15 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r1.setOnClickListener(r0)
            r7.addView(r1)
            r12.add(r1)
            int r10 = r10 + 1
            r3 = 1
            goto L_0x0102
        L_0x0169:
            r0 = 0
            goto L_0x0139
        L_0x016b:
            android.graphics.drawable.Drawable[] r15 = new android.graphics.drawable.Drawable[r0]
            r15[r9] = r16
            android.graphics.drawable.Drawable r0 = r2.A06
            r15[r3] = r0
            r15[r13] = r14
            goto L_0x0123
        L_0x0176:
            android.widget.LinearLayout r0 = r2.A07
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131100336(0x7f0602b0, float:1.781305E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A09(r1, r5, r0)
            goto L_0x00d3
        L_0x0185:
            android.widget.LinearLayout r0 = r2.A07
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131100336(0x7f0602b0, float:1.781305E38)
            android.graphics.drawable.Drawable r10 = X.C107335b8.A09(r1, r5, r0)
            goto L_0x00c8
        L_0x0194:
            r0 = -1
            goto L_0x008c
        L_0x0197:
            r0 = -1
            goto L_0x007a
        L_0x019a:
            java.util.ArrayList r10 = X.AnonymousClass002.A0I(r11)
            r5 = 0
        L_0x019f:
            if (r5 >= r11) goto L_0x0214
            r3 = r6[r5]
            r1 = 2131625486(0x7f0e060e, float:1.8878181E38)
            android.view.View r1 = r8.inflate(r1, r7, r9)
            com.whatsapp.WaImageButton r1 = (com.whatsapp.WaImageButton) r1
            android.graphics.drawable.Drawable r14 = r2.A03(r3)
            X.C626936e.A06(r14)
            android.graphics.drawable.Drawable r12 = r2.A04
            if (r12 != 0) goto L_0x0206
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[r13]
            android.graphics.drawable.Drawable r0 = r2.A05
            r13[r9] = r0
            r17 = 1
            r13[r17] = r14
        L_0x01c1:
            android.content.Context r14 = r2.A02
            int[] r12 = r2.A0B
            r0 = -1
            java.lang.String r12 = A01(r14, r12, r0, r3)
            android.content.res.Resources r14 = r2.A03
            android.graphics.Bitmap r13 = X.C100415Av.A00(r13)
            if (r13 == 0) goto L_0x0204
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r14, r13)
        L_0x01d7:
            r1.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            r1.setContentDescription(r12)
            int r0 = r2.A01
            boolean r0 = X.AnonymousClass000.A1U(r3, r0)
            r1.setSelected(r0)
            X.548 r0 = new X.548
            r12 = r0
            r13 = r2
            r14 = r1
            r15 = r10
            r16 = r3
            r12.<init>(r13, r14, r15, r16, r17)
            r1.setOnClickListener(r0)
            r7.addView(r1)
            r10.add(r1)
            int r5 = r5 + 1
            r0 = 3
            r13 = 2
            goto L_0x019f
        L_0x0204:
            r0 = 0
            goto L_0x01d7
        L_0x0206:
            r17 = 1
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[r0]
            android.graphics.drawable.Drawable r0 = r2.A05
            r13[r9] = r0
            r13[r17] = r14
            r0 = 2
            r13[r0] = r12
            goto L_0x01c1
        L_0x0214:
            android.widget.LinearLayout r1 = r2.A07
            r0 = 2131429331(0x7f0b07d3, float:1.8480332E38)
            android.widget.ImageView r3 = X.AnonymousClass0x9.A0F(r1, r0)
            X.C626936e.A04(r3)
            android.content.res.Resources r5 = r20.getResources()
            r8 = -1
            int[] r1 = r2.A0B
            X.4qr r0 = new X.4qr
            r0.<init>(r1)
            r7 = 1065353216(0x3f800000, float:1.0)
            r6 = r0
            android.graphics.drawable.Drawable r0 = r4.A04(r5, r6, r7, r8)
            r3.setImageDrawable(r0)
            int[] r0 = r2.A0B
            java.lang.String r0 = X.C106655Zv.A01(r0)
            r3.setContentDescription(r0)
            r1 = 1
            X.C989453v.A00(r3, r2, r1)
            r2.A04()
            android.widget.LinearLayout r0 = r2.A07
            r0.setFocusableInTouchMode(r1)
            android.widget.LinearLayout r0 = r2.A07
            r0.setFocusable(r1)
            android.widget.LinearLayout r0 = r2.A07
            X.C86604Kt.A19(r0)
            r3 = r26
            r0 = r20
            android.graphics.drawable.Drawable r0 = X.C86644Kx.A0D(r0, r2, r3)
            r2.setBackgroundDrawable(r0)
            android.widget.LinearLayout r0 = r2.A07
            r0.requestFocus()
            android.view.ViewParent r0 = r20.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Ro.<init>(android.view.View, X.4A4, X.5Y0, int[], boolean):void");
    }

    public final Drawable A02(int i) {
        C94274qr r4 = new C94274qr(this.A08.A00(1, i).A01());
        return this.A0A.A05(this.A03, r4, C86664Kz.A0N(r4));
    }

    public final Drawable A03(int i) {
        C94274qr r4 = new C94274qr(this.A08.A00(2, i).A01());
        return this.A0A.A05(this.A03, r4, C86664Kz.A0N(r4));
    }

    public final void A04() {
        Drawable A022;
        Drawable A032;
        BitmapDrawable bitmapDrawable;
        String A012;
        int i;
        ImageView A0F = AnonymousClass0x9.A0F(this.A07, R.id.selected_emoji);
        C626936e.A04(A0F);
        Drawable drawable = this.A04;
        int i2 = 2;
        if (drawable != null) {
            i2 = 3;
        }
        Drawable[] drawableArr = new Drawable[i2];
        int i3 = this.A00;
        if (i3 == -1) {
            A022 = this.A05;
        } else {
            A022 = A02(i3);
        }
        drawableArr[0] = A022;
        int i4 = this.A01;
        if (i4 == -1) {
            A032 = this.A06;
        } else {
            A032 = A03(i4);
        }
        drawableArr[1] = A032;
        if (drawable != null) {
            drawableArr[2] = drawable;
        }
        Resources resources = this.A03;
        Bitmap A002 = C100415Av.A00(drawableArr);
        if (A002 != null) {
            bitmapDrawable = new BitmapDrawable(resources, A002);
        } else {
            bitmapDrawable = null;
        }
        A0F.setImageDrawable(bitmapDrawable);
        A0F.setBackgroundResource(R.drawable.multi_skin_tone_emoji_selector);
        int i5 = this.A00;
        if (i5 == -1 || (i = this.A01) == -1) {
            A0F.setOnClickListener((View.OnClickListener) null);
            A012 = A01(this.A02, this.A0B, this.A00, this.A01);
        } else {
            int[] A013 = this.A08.A00(1, i5).A00(2, i).A01();
            A0F.setOnClickListener(new AnonymousClass547(A0F, this, A013, 0));
            A012 = C106655Zv.A01(A013);
        }
        A0F.setContentDescription(A012);
    }

    public static int A00(int i) {
        switch (i) {
            case 127995:
                return R.string.f11nameremoved;
            case 127996:
                return R.string.f11nameremoved;
            case 127997:
                return R.string.f11nameremoved;
            case 127998:
                return R.string.f11nameremoved;
            case 127999:
                return R.string.f11nameremoved;
            default:
                throw AnonymousClass000.A0G("Invalid skin tone: ", AnonymousClass001.A0o(), i);
        }
    }
}
