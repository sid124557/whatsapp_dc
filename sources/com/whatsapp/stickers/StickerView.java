package com.whatsapp.stickers;

import X.AnonymousClass01G;
import X.AnonymousClass0P5;
import X.AnonymousClass6D5;
import X.C188868zc;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

public class StickerView extends WaImageView {
    public int A00;
    public AnonymousClass0P5 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass0P5 A05;

    public boolean getLoopIndefinitely() {
        return this.A03;
    }

    public void setImageDrawable(Drawable drawable) {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        Drawable drawable2 = getDrawable();
        if (drawable2 != drawable && (drawable2 instanceof AnonymousClass6D5)) {
            AnonymousClass6D5 r2 = (AnonymousClass6D5) drawable2;
            r2.A08.remove(this.A05);
            r2.stop();
        }
        super.setImageDrawable(drawable);
        if (drawable instanceof AnonymousClass6D5) {
            ((AnonymousClass6D5) drawable).A08.add(this.A05);
        }
    }

    public StickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A05 = new C188868zc(this, 2);
    }

    public void A07() {
        int i;
        Drawable drawable = getDrawable();
        if (drawable instanceof AnonymousClass6D5) {
            AnonymousClass6D5 r2 = (AnonymousClass6D5) drawable;
            r2.A03 = this.A03;
            int i2 = this.A00;
            if (!r2.A04) {
                r2.A01 = i2;
            } else if (r2.A01 < i2) {
                r2.A01 = i2;
                r2.A00 = 0;
            }
        }
        if (drawable instanceof AnonymousClass01G) {
            AnonymousClass01G r22 = (AnonymousClass01G) drawable;
            if (this.A03) {
                i = -1;
            } else {
                i = this.A00;
            }
            r22.A0K.setRepeatCount(i);
        }
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public void A08() {
        Drawable drawable = getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A04 && this.A03) {
            A07();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A08();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            A08();
        } else if (this.A04 && this.A03) {
            A07();
        }
    }

    public void setAnimationCallback(AnonymousClass0P5 r1) {
        this.A01 = r1;
    }

    public void setLoopIndefinitely(boolean z) {
        this.A03 = z;
    }

    public void setMaxLoops(int i) {
        this.A00 = i;
    }

    public void setUserVisibleForIndefiniteLoop(boolean z) {
        this.A04 = z;
    }

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A05 = new C188868zc(this, 2);
    }

    public StickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public StickerView(Context context) {
        super(context);
        A05();
        this.A05 = new C188868zc(this, 2);
    }
}
