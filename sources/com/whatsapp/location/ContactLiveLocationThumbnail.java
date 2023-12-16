package com.whatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4L0;
import X.C1458377m;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

public class ContactLiveLocationThumbnail extends ThumbnailButton {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public final RectF A05;

    private void A03(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1458377m.A00);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            this.A02 = obtainStyledAttributes.getInteger(2, this.A02);
            obtainStyledAttributes.recycle();
        }
    }

    public void A07(Canvas canvas) {
        RectF rectF = this.A05;
        rectF.set(0.0f, 0.0f, AnonymousClass4L0.A00(this), C86664Kz.A02(this));
        float f = this.A00;
        if (f > 0.0f && this.A01 != 0) {
            float f2 = f / 2.0f;
            rectF.inset(f2, f2);
            this.A05.setColor(this.A01);
            this.A05.setStrokeWidth(this.A00);
            C86634Kw.A17(this.A05);
            float f3 = this.A02;
            int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            Paint paint = this.A05;
            if (i >= 0) {
                canvas.drawRoundRect(rectF, f3, f3, paint);
            } else {
                canvas.drawOval(rectF, paint);
            }
            float f4 = this.A00 / 2.0f;
            rectF.inset(f4, f4);
        }
        float f5 = this.A01;
        if (f5 > 0.0f && this.A03 != 0) {
            float f6 = f5 / 2.0f;
            rectF.inset(f6, f6);
            this.A05.setColor(this.A03);
            this.A05.setStrokeWidth(this.A01);
            C86634Kw.A17(this.A05);
            float f7 = this.A02;
            int i2 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            Paint paint2 = this.A05;
            if (i2 >= 0) {
                canvas.drawRoundRect(rectF, f7, f7, paint2);
            } else {
                canvas.drawOval(rectF, paint2);
            }
            float f8 = this.A01 / 2.0f;
            rectF.inset(f8, f8);
        }
        if (this.A03) {
            C86624Kv.A0k(getResources(), this.A05, R.color.f5nameremoved);
            AnonymousClass001.A10(this.A05);
            float f9 = this.A02;
            int i3 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            Paint paint3 = this.A05;
            if (i3 >= 0) {
                canvas.drawRoundRect(rectF, f9, f9, paint3);
            } else {
                canvas.drawOval(rectF, paint3);
            }
        }
        if (this.A02 > 1) {
            this.A05.setColor(1107296256);
            AnonymousClass001.A10(this.A05);
            float f10 = this.A02;
            int i4 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            Paint paint4 = this.A05;
            if (i4 >= 0) {
                canvas.drawRoundRect(rectF, f10, f10, paint4);
            } else {
                canvas.drawOval(rectF, paint4);
            }
            this.A05.setTextAlign(Paint.Align.CENTER);
            this.A05.setColor(-1);
            this.A05.setTextSize(C86664Kz.A01(getResources(), R.dimen.f6nameremoved));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(this.A02);
            canvas.drawText(AnonymousClass000.A0X("", A0o), rectF.centerX(), rectF.centerY() - ((this.A05.ascent() + this.A05.descent()) / 2.0f), this.A05);
        }
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A05 = AnonymousClass002.A07();
        A03(context, attributeSet);
    }

    public void setGlowColor(int i) {
        this.A01 = i;
    }

    public void setGlowSize(float f) {
        this.A00 = f;
    }

    public void setGreyOverlay(boolean z) {
        this.A03 = z;
    }

    public void setStackSize(int i) {
        this.A02 = i;
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A05 = AnonymousClass002.A07();
        A03(context, attributeSet);
    }

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public ContactLiveLocationThumbnail(Context context) {
        super(context);
        A05();
        this.A05 = AnonymousClass002.A07();
    }
}
