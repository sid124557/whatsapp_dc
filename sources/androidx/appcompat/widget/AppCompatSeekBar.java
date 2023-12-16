package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass04S;
import X.AnonymousClass0XB;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.whatsapp.R;

public class AppCompatSeekBar extends SeekBar {
    public final AnonymousClass04S A00;

    public synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        AnonymousClass04S r5 = this.A00;
        if (r5.A02 != null) {
            SeekBar seekBar = r5.A05;
            int max = seekBar.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = r5.A02.getIntrinsicWidth();
                int intrinsicHeight = r5.A02.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                r5.A02.setBounds(-i, -i2, i, i2);
                float A06 = ((float) AnonymousClass000.A06(seekBar, seekBar.getWidth())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() / 2));
                int i3 = 0;
                do {
                    r5.A02.draw(canvas);
                    canvas.translate(A06, 0.0f);
                    i3++;
                } while (i3 <= max);
                canvas.restoreToCount(save);
            }
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass0XB.A04(this);
        AnonymousClass04S r0 = new AnonymousClass04S(this);
        this.A00 = r0;
        r0.A01(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass04S r1 = this.A00;
        Drawable drawable = r1.A02;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = r1.A05;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00.A02;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public AppCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
