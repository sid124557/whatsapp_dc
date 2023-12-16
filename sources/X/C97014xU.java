package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;

/* renamed from: X.4xU  reason: invalid class name and case insensitive filesystem */
public abstract class C97014xU extends C89204c5 implements TextWatcher {
    public float A00;
    public int A01;
    public int A02;
    public Handler A03 = AnonymousClass000.A0A();
    public Runnable A04 = new C71263bp((Object) this, 7);
    public boolean A05 = false;
    public boolean A06;
    public boolean A07;
    public final Paint A08 = C86604Kt.A0B();
    public final RectF A09 = AnonymousClass002.A07();

    public abstract float A09(String str);

    public abstract void A0B(boolean z);

    public abstract void afterTextChanged(Editable editable);

    public abstract void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

    public abstract int getCursorColor();

    public abstract int getCursorVerticalPadding();

    public abstract int getCursorWidth();

    public boolean hasFocus() {
        return this.A06;
    }

    public void setCustomCursorEnabled(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            Handler handler = this.A03;
            Runnable runnable = this.A04;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            boolean z2 = !z;
            setFocusable(z2);
            setCursorVisible(z2);
            if (z) {
                addTextChangedListener(this);
            } else {
                removeTextChangedListener(this);
            }
        }
    }

    public void setHasFocus(boolean z) {
        if (z != this.A06) {
            this.A06 = z;
            Handler handler = this.A03;
            Runnable runnable = this.A04;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            A0B(z);
        }
    }

    public C97014xU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0A();
    }

    public final void A0A() {
        this.A02 = getCursorWidth();
        this.A01 = getCursorVerticalPadding();
        Paint paint = this.A08;
        AnonymousClass001.A10(paint);
        paint.setColor(getCursorColor());
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A05 && this.A07) {
            RectF rectF = this.A09;
            float f = this.A00;
            rectF.set(f, (float) this.A01, ((float) this.A02) + f, (float) (getHeight() - this.A01));
            canvas.drawRect(rectF, this.A08);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (getText() == null || TextUtils.isEmpty(C18290x4.A0m(this))) {
            this.A00 = 0.0f;
        } else {
            float A092 = A09(C18290x4.A0m(this));
            this.A00 = A092;
            if (this.A05) {
                i3 = this.A02;
            } else {
                i3 = 0;
            }
            i = C86664Kz.A05((int) (A092 + ((float) i3) + ((float) getPaddingLeft()) + ((float) getPaddingRight())));
        }
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C97014xU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
    }

    public C97014xU(Context context) {
        super(context);
        A0A();
    }
}
