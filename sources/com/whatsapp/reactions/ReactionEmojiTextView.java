package com.whatsapp.reactions;

import X.AnonymousClass66Z;
import X.C86614Ku;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class ReactionEmojiTextView extends TextEmojiLabel implements AnonymousClass66Z {
    public float A00 = 1.0f;
    public float A01;
    public float A02 = 1.0f;
    public int A03;
    public Paint A04;

    public void setBackgroundAlpha(float f) {
        this.A04.setAlpha((int) (f * ((float) this.A03)));
        invalidate();
    }

    public void setBackgroundScale(float f) {
        this.A02 = f;
        invalidate();
    }

    public void setForegroundScale(float f) {
        this.A00 = f;
        invalidate();
    }

    public ReactionEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A07();
    }

    private void A07() {
        Paint A0Z = C86664Kz.A0Z();
        this.A04 = A0Z;
        C86614Ku.A10(getContext(), A0Z, R.color.f5nameremoved);
        this.A03 = this.A04.getAlpha();
        A0L();
    }

    public void A0L() {
        this.A01 = C86664Kz.A01(getResources(), R.dimen.f6nameremoved) / 2.0f;
    }

    public void onDraw(Canvas canvas) {
        if (isSelected()) {
            canvas.save();
            float pivotX = getPivotX();
            float pivotY = getPivotY();
            float f = this.A02;
            canvas.scale(f, f, pivotX, pivotY);
            canvas.drawCircle(pivotX, pivotY, this.A01, this.A04);
            canvas.restore();
        }
        canvas.save();
        float f2 = this.A00;
        canvas.scale(f2, f2, getPivotX(), getPivotY());
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setForegroundAlpha(float f) {
        getPaint().setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public ReactionEmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A07();
    }

    public ReactionEmojiTextView(Context context) {
        super(context);
        A07();
    }
}
