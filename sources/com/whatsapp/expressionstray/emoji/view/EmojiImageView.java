package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C121045za;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C86604Kt;
import X.C86614Ku;
import X.C86654Ky;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public final class EmojiImageView extends View {
    public int A00 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    public Paint A01;
    public Drawable A02;
    public boolean A03;
    public int[] A04;
    public final AnonymousClass66R A05 = C154517dI.A00(AnonymousClass58H.NONE, C121045za.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
    }

    public void onDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        super.onDraw(canvas);
        if (this.A03) {
            getOutlinePath().reset();
            C86614Ku.A19(getOutlinePath(), this);
            C86614Ku.A18(getOutlinePath(), this);
            C86604Kt.A17(getOutlinePath(), this, (getWidth() * 3) / 4);
            C86604Kt.A17(getOutlinePath(), this, (getWidth() * 9) / 10);
            getOutlinePath().setFillType(Path.FillType.WINDING);
            canvas.drawPath(getOutlinePath(), getPaint());
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            C86654Ky.A10(drawable, this, this.A00);
            drawable.draw(canvas);
        }
    }

    public final void setPaint(Paint paint) {
        C162457s7.A0J(paint, 0);
        this.A01 = paint;
    }

    private final Path getOutlinePath() {
        return (Path) this.A05.getValue();
    }

    public final int[] getEmoji() {
        return this.A04;
    }

    public final Paint getPaint() {
        Paint paint = this.A01;
        if (paint != null) {
            return paint;
        }
        throw C18270x1.A0S("paint");
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public final void setEmoji(int[] iArr) {
        this.A04 = iArr;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
    }
}
