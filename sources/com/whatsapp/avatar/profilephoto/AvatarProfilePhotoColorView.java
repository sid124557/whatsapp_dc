package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.AnonymousClass8VB;
import X.AnonymousClass8VC;
import X.C141496vf;
import X.C154517dI;
import X.C162457s7;
import X.C378924l;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public final class AvatarProfilePhotoColorView extends View {
    public C141496vf A00;
    public final Paint A01;
    public final Paint A02;
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoColorView(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }

    public void onDraw(Canvas canvas) {
        float f;
        C162457s7.A0J(canvas, 0);
        int A0B = C86664Kz.A0B(this);
        int A042 = C86654Ky.A04(this);
        float min = ((float) Math.min(AnonymousClass000.A06(this, getWidth()), AnonymousClass000.A05(this, getHeight()))) / 2.0f;
        C141496vf r0 = this.A00;
        C141496vf r4 = C141496vf.SELECTED;
        if (r0 == r4) {
            f = min - getSelectedBorderMargin();
        } else {
            f = min;
        }
        float f2 = (float) A0B;
        float f3 = (float) A042;
        canvas.drawCircle(f2, f3, f, this.A01);
        if (this.A00 == r4) {
            canvas.drawCircle(f2, f3, min, this.A02);
        }
    }

    private final float getBorderStrokeWidthSelected() {
        return AnonymousClass001.A05(this.A03.getValue());
    }

    private final float getSelectedBorderMargin() {
        return AnonymousClass001.A05(this.A04.getValue());
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A03 = C154517dI.A00(r1, new AnonymousClass8VB(this));
        this.A04 = C154517dI.A00(r1, new AnonymousClass8VC(this));
        this.A00 = C141496vf.IDLE;
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setStrokeWidth(getBorderStrokeWidthSelected());
        C86634Kw.A17(A0Z);
        A0Z.setAntiAlias(true);
        A0Z.setDither(true);
        this.A02 = A0Z;
        Paint A0Z2 = C86664Kz.A0Z();
        C86604Kt.A0u(AnonymousClass0Y8.A04(context, R.color.f5nameremoved), A0Z2);
        A0Z2.setAntiAlias(true);
        A0Z2.setDither(true);
        this.A01 = A0Z2;
    }

    public /* synthetic */ AvatarProfilePhotoColorView(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }
}
