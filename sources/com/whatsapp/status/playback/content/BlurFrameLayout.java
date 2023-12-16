package com.whatsapp.status.playback.content;

import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass55M;
import X.C116855qy;
import X.C162457s7;
import X.C18270x1;
import X.C54292oU;
import X.C64333Db;
import X.C86644Kx;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

public final class BlurFrameLayout extends FrameLayout implements AnonymousClass4GJ {
    public Bitmap A00;
    public Bitmap A01;
    public ViewPropertyAnimator A02;
    public C54292oU A03;
    public AnonymousClass55M A04;
    public AnonymousClass4FS A05;
    public C116855qy A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A00();
        this.A09 = true;
        this.A07 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x006b
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0046
            android.graphics.Bitmap r0 = r5.A00
            if (r0 != 0) goto L_0x005a
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            android.graphics.Bitmap r0 = X.C86664Kz.A0Y(r1, r0)
            r5.A00 = r0
            if (r0 != 0) goto L_0x005a
        L_0x0020:
            X.55M r0 = r5.A04
            if (r0 == 0) goto L_0x0029
            java.lang.ref.WeakReference r0 = r0.A00
            r0.clear()
        L_0x0029:
            X.55M r0 = r5.A04
            boolean r0 = X.C86644Kx.A1a(r0)
            X.55M r4 = new X.55M
            r4.<init>(r5)
            r5.A04 = r4
            X.4FS r3 = r5.getWaWorkers()
            android.graphics.Bitmap[] r2 = new android.graphics.Bitmap[r0]
            android.graphics.Bitmap r1 = r5.A00
            r0 = 0
            r2[r0] = r1
            r3.BkL(r4, r2)
            r5.A09 = r0
        L_0x0046:
            android.graphics.Bitmap r2 = r5.A01
            if (r2 == 0) goto L_0x0050
            r1 = 0
            r0 = 0
            r6.drawBitmap(r2, r0, r0, r1)
        L_0x004f:
            return
        L_0x0050:
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 == 0) goto L_0x004f
            r0.draw(r6)
            return
        L_0x005a:
            android.graphics.Canvas r1 = X.AnonymousClass4L0.A06(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 == 0) goto L_0x0067
            r0.draw(r1)
        L_0x0067:
            super.dispatchDraw(r1)
            goto L_0x0020
        L_0x006b:
            super.dispatchDraw(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.content.BlurFrameLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void setWaContext(C54292oU r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public void A00() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A05 = C64333Db.A8y(A002);
            this.A03 = C64333Db.A2q(A002);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final C54292oU getWaContext() {
        C54292oU r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContext");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }

    public final void setBlurEnabled(boolean z) {
        this.A07 = z;
        if (z) {
            this.A09 = true;
        }
        invalidate();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass55M r0 = this.A04;
        if (r0 != null) {
            r0.A00.clear();
        }
        boolean A1a = C86644Kx.A1a(this.A04);
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.A01 = null;
        this.A09 = A1a;
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.A00 = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A07) {
            this.A00 = C86664Kz.A0Y(getWidth(), getHeight());
            this.A09 = true;
            invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A00();
        this.A09 = true;
        this.A07 = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C162457s7.A0J(context, 1);
        A00();
        this.A09 = true;
        this.A07 = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurFrameLayout(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A00();
        this.A09 = true;
        this.A07 = true;
    }

    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
