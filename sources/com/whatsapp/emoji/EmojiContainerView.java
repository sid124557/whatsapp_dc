package com.whatsapp.emoji;

import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiContainerView extends FrameLayout implements AnonymousClass4GJ {
    public Paint A00;
    public Path A01;
    public C116855qy A02;
    public boolean A03;
    public boolean A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A04) {
            if (this.A01 == null) {
                this.A01 = AnonymousClass002.A06();
            }
            Paint paint = this.A00;
            if (paint == null) {
                paint = C86664Kz.A0Z();
                this.A00 = paint;
            }
            paint.setColor(285212672);
            this.A01.reset();
            C86614Ku.A19(this.A01, this);
            C86614Ku.A18(this.A01, this);
            C86604Kt.A17(this.A01, this, (getWidth() * 3) / 4);
            C86604Kt.A17(this.A01, this, (getWidth() * 9) / 10);
            this.A01.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A01, this.A00);
        }
    }

    public void setIsSkinTone(boolean z) {
        this.A04 = z;
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public EmojiContainerView(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }
}
