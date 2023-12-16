package com.whatsapp.reactions;

import X.AnonymousClass0YG;
import X.AnonymousClass5Yj;
import X.AnonymousClass66Z;
import X.C02680He;
import X.C06130Wj;
import X.C107295b4;
import X.C18300x5;
import X.C626936e;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class ReactionPlusView extends View implements AnonymousClass66Z {
    public float A00;
    public float A01 = 0.625f;
    public float A02 = 1.0f;
    public int A03;
    public int A04;
    public Drawable A05;
    public final Paint A06 = C86604Kt.A0B();

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float pivotX = getPivotX();
        float pivotY = getPivotY();
        float f = this.A01;
        canvas.scale(f, f, pivotX, pivotY);
        float A012 = C86664Kz.A01(getResources(), R.dimen.f6nameremoved);
        float A013 = C86664Kz.A01(getResources(), R.dimen.f6nameremoved);
        float f2 = this.A00;
        canvas.drawRoundRect(0.0f, 0.0f, A013, A012, f2, f2, this.A06);
        canvas.restore();
        canvas.save();
        float f3 = this.A02;
        canvas.scale(f3, f3, pivotX, pivotY);
        this.A05.draw(canvas);
        canvas.restore();
    }

    public void setBackgroundAlpha(float f) {
        this.A06.setAlpha((int) (((float) this.A03) * f));
        invalidate();
    }

    public void setBackgroundScale(float f) {
        this.A01 = f * 0.625f;
        invalidate();
    }

    public void setForegroundAlpha(float f) {
        this.A05.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public void setForegroundScale(float f) {
        this.A02 = f;
        invalidate();
    }

    public ReactionPlusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public final void A00() {
        this.A04 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00 = C86664Kz.A01(getResources(), R.dimen.f6nameremoved) / 2.0f;
        Drawable A002 = C02680He.A00(C86614Ku.A0C(this), getResources(), R.drawable.ic_reactions_plus);
        C626936e.A06(A002);
        this.A05 = A002;
        Drawable A012 = C06130Wj.A01(A002);
        this.A05 = A012;
        AnonymousClass0YG.A06(A012, AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        Paint paint = this.A06;
        C86614Ku.A10(getContext(), paint, R.color.f5nameremoved);
        this.A03 = paint.getAlpha();
        C107295b4.A02(this);
        C18300x5.A13(getContext(), this, R.string.f11nameremoved);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i / 2;
        int i6 = i2 / 2;
        int i7 = this.A04 / 2;
        this.A05.setBounds(i5 - i7, i6 - i7, i5 + i7, i6 + i7);
    }

    public ReactionPlusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ReactionPlusView(Context context) {
        super(context);
        A00();
    }
}
