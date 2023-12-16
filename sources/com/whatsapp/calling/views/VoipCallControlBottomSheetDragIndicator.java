package com.whatsapp.calling.views;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.C100855Cn;
import X.C105315Uk;
import X.C107295b4;
import X.C116855qy;
import X.C159677mH;
import X.C170968Ff;
import X.C179178ij;
import X.C18300x5;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.R;

public class VoipCallControlBottomSheetDragIndicator extends View implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public int A02;
    public C179178ij A03;
    public C116855qy A04;
    public boolean A05;
    public boolean A06;
    public final Paint A07;
    public final Path A08;

    public final boolean A02(int i) {
        C179178ij r0;
        if (i == 0) {
            this.A05 = true;
            return false;
        } else if (i != 1) {
            if (i != 2) {
                this.A05 = false;
            }
            return false;
        } else {
            if (this.A05 && (r0 = this.A03) != null) {
                float f = this.A01;
                C105315Uk r2 = ((C170968Ff) r0).A00.A0N;
                if (r2 != null) {
                    int i2 = 3;
                    if (f > 0.0f) {
                        i2 = 4;
                    }
                    r2.A03(i2);
                }
            }
            this.A05 = false;
            return true;
        }
    }

    public void A00() {
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100855Cn.A02);
            try {
                int color = obtainStyledAttributes.getColor(0, -1);
                obtainStyledAttributes.recycle();
                Paint paint = this.A07;
                C86634Kw.A17(paint);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(C86604Kt.A00(context) * 4.0f);
                paint.setColor(color);
                this.A00 = TypedValue.applyDimension(1, 2.5f, C86614Ku.A0E(this));
                C107295b4.A02(this);
                Context context2 = getContext();
                int i = (this.A01 > 0.0f ? 1 : (this.A01 == 0.0f ? 0 : -1));
                int i2 = R.string.f11nameremoved;
                if (i > 0) {
                    i2 = R.string.f11nameremoved;
                }
                C18300x5.A13(context2, this, i2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setOnClickListener(C179178ij r3) {
        this.A03 = r3;
        super.setOnTouchListener(new C159677mH(this, 4));
    }

    public void setSlideOffset(float f) {
        float f2;
        if (f > 1.0f) {
            f2 = 1.0f;
        } else if (f <= 0.0f) {
            f2 = -1.0f;
        } else {
            f2 = (f - 0.5f) * 2.0f;
        }
        this.A01 = f2;
        if (f2 == 1.0f || f2 == -1.0f) {
            Context context = getContext();
            int i = (this.A01 > 0.0f ? 1 : (this.A01 == 0.0f ? 0 : -1));
            int i2 = R.string.f11nameremoved;
            if (i > 0) {
                i2 = R.string.f11nameremoved;
            }
            C18300x5.A13(context, this, i2);
        }
        invalidate();
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A07 = C86604Kt.A0B();
        this.A08 = AnonymousClass002.A06();
        this.A01 = -1.0f;
        A01(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float A0I = (float) AnonymousClass001.A0I(this);
        float A0H = (float) AnonymousClass001.A0H(this);
        float f = (A0H + paddingTop) / 2.0f;
        float f2 = this.A01;
        float f3 = (((A0H - paddingTop) / 2.0f) * f2) + f;
        float f4 = f + (this.A00 * (-f2));
        Path path = this.A08;
        path.reset();
        path.moveTo(paddingLeft, f4);
        path.lineTo((paddingLeft + A0I) / 2.0f, f3);
        path.lineTo(A0I, f4);
        canvas.drawPath(path, this.A07);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A07 = C86604Kt.A0B();
        this.A08 = AnonymousClass002.A06();
        this.A01 = -1.0f;
        A01(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A07 = C86604Kt.A0B();
        this.A08 = AnonymousClass002.A06();
        this.A01 = -1.0f;
        A01(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context) {
        super(context);
        A00();
        this.A07 = C86604Kt.A0B();
        this.A08 = AnonymousClass002.A06();
        this.A01 = -1.0f;
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
