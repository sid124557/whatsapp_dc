package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass77T;
import X.AnonymousClass8VD;
import X.AnonymousClass8VE;
import X.AnonymousClass8VF;
import X.AnonymousClass8VG;
import X.C141496vf;
import X.C154517dI;
import X.C162457s7;
import X.C73153f1;
import X.C86604Kt;
import X.C86624Kv;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;

public final class AvatarProfilePhotoImageView extends CircleWaImageView {
    public float A00;
    public int A01;
    public final Paint A02;
    public final Paint A03;
    public final Paint A04;
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;
    public final AnonymousClass66R A07;
    public final AnonymousClass66R A08;

    public final void A0B(C141496vf r5, float f, int i) {
        float borderStrokeWidthSelected;
        float borderStrokeWidthSelected2;
        C162457s7.A0J(r5, 0);
        Paint paint = this.A03;
        int ordinal = r5.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = AnonymousClass0x2.A09(this.A05);
            } else {
                throw C73153f1.A00();
            }
        }
        paint.setColor(i);
        if (ordinal != 0) {
            borderStrokeWidthSelected = getBorderStrokeWidthIdle();
        } else {
            borderStrokeWidthSelected = getBorderStrokeWidthSelected();
        }
        paint.setStrokeWidth(borderStrokeWidthSelected);
        Paint paint2 = this.A04;
        if (ordinal != 0) {
            f = 0.0f;
        }
        paint2.setStrokeWidth(f);
        if (ordinal != 0) {
            borderStrokeWidthSelected2 = getBorderStrokeWidthIdle();
        } else {
            borderStrokeWidthSelected2 = getBorderStrokeWidthSelected();
        }
        this.A00 = borderStrokeWidthSelected2;
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        int A0B = C86664Kz.A0B(this);
        float f = (float) A0B;
        float A042 = (float) C86654Ky.A04(this);
        float min = (float) (Math.min(AnonymousClass000.A06(this, getWidth()), AnonymousClass000.A05(this, getHeight())) / 2);
        canvas.drawCircle(f, A042, min, this.A02);
        super.onDraw(canvas);
        Paint paint = this.A04;
        if (paint.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(f, A042, min - this.A00, paint);
        }
        canvas.drawCircle(f, A042, min, this.A03);
    }

    private final int getBorderColorIdle() {
        return AnonymousClass0x2.A09(this.A05);
    }

    private final float getBorderStrokeWidthIdle() {
        return AnonymousClass001.A05(this.A06.getValue());
    }

    private final float getBorderStrokeWidthSelected() {
        return AnonymousClass001.A05(this.A07.getValue());
    }

    private final int getColorNeutral() {
        return AnonymousClass0x2.A09(this.A08);
    }

    public static /* synthetic */ void setBorderStyle$default(AvatarProfilePhotoImageView avatarProfilePhotoImageView, C141496vf r2, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        avatarProfilePhotoImageView.A0B(r2, f, i);
    }

    public final void A09() {
        Paint paint = this.A03;
        paint.setColor(AnonymousClass0x2.A09(this.A05));
        paint.setStrokeWidth(getBorderStrokeWidthIdle());
        this.A04.setStrokeWidth(0.0f);
        this.A00 = getBorderStrokeWidthIdle();
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        int defaultSize;
        int i3 = this.A01;
        if (i3 == 0) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        } else if (i3 == 1) {
            defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        } else {
            throw AnonymousClass000.A0G("Illegal value: ", AnonymousClass001.A0o(), i3);
        }
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public final void setAvatarPoseBackgroundColor(int i) {
        this.A02.setColor(i);
        invalidate();
    }

    public AvatarProfilePhotoImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A07 = C154517dI.A00(r1, new AnonymousClass8VF(this));
        this.A06 = C154517dI.A00(r1, new AnonymousClass8VE(this));
        this.A05 = C154517dI.A00(r1, new AnonymousClass8VD(this));
        this.A08 = C154517dI.A00(r1, new AnonymousClass8VG(this));
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setColor(AnonymousClass0x2.A09(this.A05));
        A0Z.setStrokeWidth(getBorderStrokeWidthIdle());
        A0Z.setStyle(Paint.Style.STROKE);
        A0Z.setAntiAlias(true);
        A0Z.setDither(true);
        this.A03 = A0Z;
        Paint A0Z2 = C86664Kz.A0Z();
        C86604Kt.A0u(AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved), A0Z2);
        A0Z2.setAntiAlias(true);
        A0Z2.setDither(true);
        this.A02 = A0Z2;
        Paint A0Z3 = C86664Kz.A0Z();
        C86624Kv.A0e(AnonymousClass0x2.A09(this.A08), A0Z3);
        A0Z3.setAntiAlias(true);
        A0Z3.setDither(true);
        this.A04 = A0Z3;
        A0A(attributeSet);
    }

    public final void A0A(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass77T.A00);
        C162457s7.A0D(obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A01 = obtainStyledAttributes.getInt(0, this.A01);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setAvatarPoseBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public AvatarProfilePhotoImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A07 = C154517dI.A00(r1, new AnonymousClass8VF(this));
        this.A06 = C154517dI.A00(r1, new AnonymousClass8VE(this));
        this.A05 = C154517dI.A00(r1, new AnonymousClass8VD(this));
        this.A08 = C154517dI.A00(r1, new AnonymousClass8VG(this));
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setColor(AnonymousClass0x2.A09(this.A05));
        A0Z.setStrokeWidth(getBorderStrokeWidthIdle());
        A0Z.setStyle(Paint.Style.STROKE);
        A0Z.setAntiAlias(true);
        A0Z.setDither(true);
        this.A03 = A0Z;
        Paint A0Z2 = C86664Kz.A0Z();
        C86604Kt.A0u(AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved), A0Z2);
        A0Z2.setAntiAlias(true);
        A0Z2.setDither(true);
        this.A02 = A0Z2;
        Paint A0Z3 = C86664Kz.A0Z();
        C86624Kv.A0e(AnonymousClass0x2.A09(this.A08), A0Z3);
        A0Z3.setAntiAlias(true);
        A0Z3.setDither(true);
        this.A04 = A0Z3;
        A0A(attributeSet);
    }

    public AvatarProfilePhotoImageView(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A07 = C154517dI.A00(r1, new AnonymousClass8VF(this));
        this.A06 = C154517dI.A00(r1, new AnonymousClass8VE(this));
        this.A05 = C154517dI.A00(r1, new AnonymousClass8VD(this));
        this.A08 = C154517dI.A00(r1, new AnonymousClass8VG(this));
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setColor(AnonymousClass0x2.A09(this.A05));
        A0Z.setStrokeWidth(getBorderStrokeWidthIdle());
        A0Z.setStyle(Paint.Style.STROKE);
        A0Z.setAntiAlias(true);
        A0Z.setDither(true);
        this.A03 = A0Z;
        Paint A0Z2 = C86664Kz.A0Z();
        C86604Kt.A0u(AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved), A0Z2);
        A0Z2.setAntiAlias(true);
        A0Z2.setDither(true);
        this.A02 = A0Z2;
        Paint A0Z3 = C86664Kz.A0Z();
        C86624Kv.A0e(AnonymousClass0x2.A09(this.A08), A0Z3);
        A0Z3.setAntiAlias(true);
        A0Z3.setDither(true);
        this.A04 = A0Z3;
        A0A((AttributeSet) null);
    }
}
