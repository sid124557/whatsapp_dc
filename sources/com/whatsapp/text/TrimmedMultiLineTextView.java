package com.whatsapp.text;

import X.C162457s7;
import X.C175708Zk;
import X.C378924l;
import X.C72013d2;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;
import java.util.Iterator;

public final class TrimmedMultiLineTextView extends WaTextView {
    public Integer A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A08();
    }

    public void onDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        if (getLayout() != null && getLayout().getLineCount() >= 2) {
            int width = getLayout().getWidth();
            Layout layout = getLayout();
            C162457s7.A0D(layout);
            int ceil = (int) ((float) Math.ceil((double) A07(layout)));
            if (width != ceil) {
                int i = (-(width - ceil)) / 2;
                this.A00 = Integer.valueOf(i);
                canvas.save();
                canvas.translate((float) i, 0.0f);
                super.onDraw(canvas);
                this.A00 = null;
                canvas.restore();
                return;
            }
        }
        super.onDraw(canvas);
    }

    public int getCompoundPaddingRight() {
        Integer num = this.A00;
        if (num != null) {
            return num.intValue();
        }
        return super.getCompoundPaddingRight();
    }

    public static final float A07(Layout layout) {
        Iterator it = C175708Zk.A02(0, layout.getLineCount()).iterator();
        if (!it.hasNext()) {
            return 0.0f;
        }
        C72013d2 r2 = (C72013d2) it;
        float lineWidth = layout.getLineWidth(r2.A00());
        while (it.hasNext()) {
            lineWidth = Math.max(lineWidth, layout.getLineWidth(r2.A00()));
        }
        Float valueOf = Float.valueOf(lineWidth);
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 0.0f;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayout() != null && getLayout().getLineCount() >= 2) {
            Layout layout = getLayout();
            C162457s7.A0D(layout);
            setMeasuredDimension(getMeasuredWidth() - (getLayout().getWidth() - ((int) ((float) Math.ceil((double) A07(layout))))), getMeasuredHeight());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ TrimmedMultiLineTextView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
