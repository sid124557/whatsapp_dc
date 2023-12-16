package com.whatsapp.expressionstray.emoji.handler;

import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass4GJ;
import X.AnonymousClass5JK;
import X.AnonymousClass5MY;
import X.C104185Pz;
import X.C107695bk;
import X.C116855qy;
import X.C162457s7;
import X.C18270x1;
import X.C378924l;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C88864av;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public final class EmojiHandlerImageView extends View implements AnonymousClass4GJ {
    public long A00;
    public Paint A01;
    public Path A02;
    public Drawable A03;
    public AnonymousClass5MY A04;
    public AnonymousClass5JK A05;
    public C104185Pz A06;
    public C116855qy A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;
    public final int A0B;
    public final int A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiHandlerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        if (!this.A08) {
            this.A08 = true;
            C107695bk r1 = C88864av.A00(generatedComponent()).A00;
            this.A04 = (AnonymousClass5MY) r1.A3x.get();
            this.A05 = (AnonymousClass5JK) r1.A3z.get();
            this.A06 = (C104185Pz) r1.A4G.get();
        }
        this.A00 = -1;
        this.A0C = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        this.A0B = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (X.C107425bI.A02(r12) != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.Integer r11, int[] r12) {
        /*
            r10 = this;
            r5 = 0
            r2 = 0
            r6 = r10
            if (r12 != 0) goto L_0x0013
            r10.A0A = r5
            r0 = -1
            r10.A00 = r0
            r10.A03 = r5
            r10.A09 = r2
            r10.setContentDescription(r5)
        L_0x0012:
            return
        L_0x0013:
            X.4qr r0 = new X.4qr
            r0.<init>(r12)
            long r8 = com.whatsapp.emoji.EmojiDescriptor.A00(r0, r2)
            long r3 = r10.A00
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            r7 = r11
            if (r11 == 0) goto L_0x0032
            X.5Pz r3 = r10.getExpressionsTrayPerformanceLogger()
            int r1 = r11.intValue()
            java.lang.String r0 = "emoji_handler_image_view_setemoji_start"
            r3.A00(r1, r0, r5)
        L_0x0032:
            r10.A0A = r12
            r10.A00 = r8
            boolean r0 = X.C107425bI.A03(r12)
            if (r0 != 0) goto L_0x0043
            boolean r1 = X.C107425bI.A02(r12)
            r0 = 0
            if (r1 == 0) goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            r10.A09 = r0
            r10.A03 = r5
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
            X.5MY r0 = r10.getEmojiHandlerDrawableCacheProvider()
            java.util.HashMap r1 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.Object r0 = r1.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
        L_0x0066:
            r10.A03 = r0
            if (r0 != 0) goto L_0x0099
            X.4qr r5 = new X.4qr
            r5.<init>(r12)
            X.5SW r4 = new X.5SW
            r4.<init>(r5, r6, r7, r8)
            X.5JK r0 = r10.getEmojiLoadingHandlerProvider()
            X.4Mb r0 = r0.A02
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r2, r2, r4)
            r0.sendToTarget()
        L_0x0081:
            java.lang.String r0 = X.C106655Zv.A01(r12)
            r10.setContentDescription(r0)
            if (r11 == 0) goto L_0x0012
            X.5Pz r3 = r10.getExpressionsTrayPerformanceLogger()
            int r2 = r11.intValue()
            java.lang.String r1 = "emoji_handler_image_view_setemoji_end"
            r0 = 0
            r3.A00(r2, r1, r0)
            return
        L_0x0099:
            r10.invalidate()
            goto L_0x0081
        L_0x009d:
            r0 = 0
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.emoji.handler.EmojiHandlerImageView.A00(java.lang.Integer, int[]):void");
    }

    public void onDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        super.onDraw(canvas);
        if (this.A09) {
            if (this.A02 == null) {
                this.A02 = AnonymousClass002.A06();
            }
            getPaint().setColor(this.A0C);
            Path path = this.A02;
            C162457s7.A0H(path);
            path.reset();
            Path path2 = this.A02;
            C162457s7.A0H(path2);
            C86614Ku.A19(path2, this);
            Path path3 = this.A02;
            C162457s7.A0H(path3);
            C86614Ku.A18(path3, this);
            Path path4 = this.A02;
            C162457s7.A0H(path4);
            C86604Kt.A17(path4, this, (getWidth() * 3) / 4);
            Path path5 = this.A02;
            C162457s7.A0H(path5);
            C86604Kt.A17(path5, this, (getWidth() * 9) / 10);
            Path path6 = this.A02;
            C162457s7.A0H(path6);
            path6.setFillType(Path.FillType.WINDING);
            Path path7 = this.A02;
            C162457s7.A0H(path7);
            canvas.drawPath(path7, getPaint());
        }
        Drawable drawable = this.A03;
        if (drawable != null) {
            C86654Ky.A10(drawable, this, this.A0B);
            drawable.draw(canvas);
        }
    }

    public final void setEmojiHandlerDrawableCacheProvider(AnonymousClass5MY r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setEmojiLoadingHandlerProvider(AnonymousClass5JK r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public final void setExpressionsTrayPerformanceLogger(C104185Pz r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setPaint(Paint paint) {
        C162457s7.A0J(paint, 0);
        this.A01 = paint;
    }

    public static /* synthetic */ void setEmoji$default(EmojiHandlerImageView emojiHandlerImageView, int[] iArr, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        emojiHandlerImageView.A00(num, iArr);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A07;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass5MY getEmojiHandlerDrawableCacheProvider() {
        AnonymousClass5MY r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emojiHandlerDrawableCacheProvider");
    }

    public final AnonymousClass5JK getEmojiLoadingHandlerProvider() {
        AnonymousClass5JK r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emojiLoadingHandlerProvider");
    }

    public final C104185Pz getExpressionsTrayPerformanceLogger() {
        C104185Pz r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("expressionsTrayPerformanceLogger");
    }

    public final Paint getPaint() {
        Paint paint = this.A01;
        if (paint != null) {
            return paint;
        }
        throw C18270x1.A0S("paint");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiHandlerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ EmojiHandlerImageView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiHandlerImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
