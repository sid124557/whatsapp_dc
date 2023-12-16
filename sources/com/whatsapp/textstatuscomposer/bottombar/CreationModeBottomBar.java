package com.whatsapp.textstatuscomposer.bottombar;

import X.AnonymousClass001;
import X.AnonymousClass0XC;
import X.AnonymousClass0Y9;
import X.AnonymousClass0x7;
import X.AnonymousClass29U;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass52U;
import X.AnonymousClass5M0;
import X.AnonymousClass5VQ;
import X.AnonymousClass5YI;
import X.AnonymousClass5Yj;
import X.C06560Yg;
import X.C102805Ki;
import X.C103215Lz;
import X.C103505Nf;
import X.C107335b8;
import X.C109855fI;
import X.C111685iW;
import X.C116855qy;
import X.C153317b2;
import X.C156197gC;
import X.C158147jV;
import X.C179708ja;
import X.C182608oh;
import X.C18280x3;
import X.C18300x5;
import X.C185948uV;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C88834as;
import X.C88864av;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView;

public class CreationModeBottomBar extends FrameLayout implements C185948uV, AnonymousClass4GJ {
    public float A00;
    public float A01;
    public LayerDrawable A02;
    public View A03;
    public ImageButton A04;
    public ImageButton A05;
    public TextView A06;
    public C153317b2 A07;
    public C103215Lz A08;
    public AnonymousClass5M0 A09;
    public WaTextView A0A;
    public C620633i A0B;
    public C620733j A0C;
    public RecipientsView A0D;
    public C179708ja A0E;
    public C103505Nf A0F;
    public C116855qy A0G;
    public boolean A0H;
    public boolean A0I;

    public void A00() {
        if (!this.A0H) {
            this.A0H = true;
            C88864av r2 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r1 = r2.A0K;
            this.A0B = C64333Db.A2o(r1);
            this.A0C = C64333Db.A2t(r1);
            C88834as r12 = r2.A0I;
            this.A08 = (C103215Lz) r12.A11.get();
            this.A09 = (AnonymousClass5M0) r12.A14.get();
        }
    }

    public final void A01() {
        this.A07.A04.clear();
        this.A07.A02(0.0d);
        this.A04.setScaleX(1.0f);
        this.A04.setScaleY(1.0f);
    }

    public final void A02(float f) {
        this.A04.setTranslationX(f);
        this.A0A.setTranslationX(f);
        boolean A042 = C620733j.A04(this.A0C);
        boolean z = true;
        float f2 = this.A00;
        if (!A042 ? f <= f2 : f >= f2) {
            z = false;
        }
        int i = 153;
        if (!z) {
            if (!C620733j.A04(this.A0C) ? f >= 0.0f : f <= 0.0f) {
                i = 153 + AnonymousClass001.A07(Math.abs(f) / Math.abs(this.A00), 102.0f);
            } else {
                i = 255;
            }
        }
        int argb = Color.argb(i, 255, 255, 255);
        this.A0A.setTextColor(argb);
        AnonymousClass0Y9.A01(ColorStateList.valueOf(argb), this.A0A);
    }

    public final void A03(int i) {
        this.A02.getDrawable(1).setAlpha(i);
        this.A04.setBackground(this.A02);
    }

    public void Awy() {
        AnonymousClass29U.A00(this.A0B);
        this.A05.setVisibility(0);
        this.A05.setEnabled(true);
        this.A07.A04.clear();
        this.A07.A02(0.0d);
        this.A07.A03(new AnonymousClass52U(this));
    }

    public void BnN(int i, String str) {
        this.A05.setScaleX(1.0f);
        this.A05.setScaleY(1.0f);
        this.A05.setEnabled(true);
        C86614Ku.A1B(C107335b8.A04(getContext(), i, AnonymousClass5Yj.A06(this)), this.A05, this.A0C);
        this.A05.setContentDescription(str);
        AnonymousClass5VQ.A01(this.A05, true, false);
        AnonymousClass5VQ.A01(this.A04, false, false);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0G;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0G = r0;
        }
        return r0.generatedComponent();
    }

    public void setNewRecipientsVisibility(boolean z) {
        this.A0I = z;
        int i = 8;
        this.A03.setVisibility(C86614Ku.A01(z ? 1 : 0));
        RecipientsView recipientsView = this.A0D;
        if (this.A0I) {
            i = 0;
        }
        recipientsView.setVisibility(i);
        Resources resources = getResources();
        int i2 = R.color.f5nameremoved;
        if (z) {
            i2 = R.color.f5nameremoved;
        }
        C86624Kv.A0l(resources, this, i2);
    }

    public void setRecipientsListener(C182608oh r2) {
        this.A0D.setRecipientsListener(r2);
    }

    public void setRecordingState(float f) {
        float f2;
        float A002 = AnonymousClass4L0.A00(this.A04) / 5.5f;
        boolean A003 = C102805Ki.A00(this.A0C);
        float f3 = this.A01;
        if (A003) {
            f2 = f3 - A002;
        } else {
            f2 = (-f3) + A002;
        }
        float f4 = f + f2;
        if (!C620733j.A04(this.A0C) ? f4 < 0.0f : f4 > 0.0f) {
            f4 = 0.0f;
        }
        boolean A042 = C620733j.A04(this.A0C);
        float f5 = this.A00;
        if (!A042 ? f4 > f5 : f4 < f5) {
            f4 = f5;
        }
        A02(f4);
    }

    public void setStatusPrivacyText(CharSequence charSequence) {
        this.A06.setText(charSequence);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C86634Kw.A16(context, this);
    }

    public final void A04(Context context) {
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A0D = (RecipientsView) C06560Yg.A02(this, R.id.media_recipients);
        this.A03 = C06560Yg.A02(this, R.id.old_recipients_container);
        this.A06 = C18300x5.A0G(this, R.id.privacy_text);
        this.A05 = C86664Kz.A0t(this, R.id.send);
        this.A04 = C86664Kz.A0t(this, R.id.mic_button);
        this.A0A = AnonymousClass0x7.A0L(this, R.id.mic_slide_to_cancel);
        C18280x3.A0o(this.A05, this, 36);
        setClipChildren(false);
        C153317b2 A012 = C158147jV.A00().A01();
        this.A07 = A012;
        A012.A03 = new C156197gC(440.0d, 21.0d);
        this.A04.setOnTouchListener(new C109855fI(this));
        C86614Ku.A1H(this.A04, this, 15);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new OvalShape());
        C86624Kv.A0k(getResources(), shapeDrawable.getPaint(), R.color.f5nameremoved);
        C86634Kw.A17(shapeDrawable.getPaint());
        float f = (float) dimensionPixelSize;
        shapeDrawable.getPaint().setStrokeWidth(f);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new OvalShape());
        shapeDrawable2.getPaint().setStrokeWidth(f);
        shapeDrawable2.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        C86624Kv.A0k(getResources(), shapeDrawable2.getPaint(), AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        Drawable[] drawableArr = new Drawable[2];
        C18280x3.A19(shapeDrawable2, shapeDrawable, drawableArr);
        this.A02 = new LayerDrawable(drawableArr);
        A03(0);
        this.A01 = ((float) ViewConfiguration.get(context).getScaledTouchSlop()) * 1.5f;
    }

    public void Awz(int i) {
        A01();
        A03(0);
        this.A05.setEnabled(true);
        this.A04.setAlpha(1.0f);
        this.A04.setTranslationX(0.0f);
        AnonymousClass5VQ.A00(this.A04, i, true, true);
        AnonymousClass5VQ.A00(this.A05, i, false, true);
    }

    public void BFf() {
        AnonymousClass0XC.A02(this, C86664Kz.A0x(this));
        this.A0A.setVisibility(8);
        int i = 8;
        this.A03.setVisibility(C86614Ku.A01(this.A0I ? 1 : 0));
        RecipientsView recipientsView = this.A0D;
        if (this.A0I) {
            i = 0;
        }
        recipientsView.setVisibility(i);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0E = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A00 == -1.0f) {
            this.A00 = (float) (AnonymousClass5YI.A04(getContext(), 16.0f) - this.A0A.getLeft());
            if (C102805Ki.A00(this.A0C)) {
                this.A00 = -this.A00;
            }
        }
    }

    public void setUiCallbacks(C179708ja r1) {
        this.A0E = r1;
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C86634Kw.A16(context, this);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C86634Kw.A16(context, this);
    }

    public CreationModeBottomBar(Context context) {
        super(context);
        C86634Kw.A16(context, this);
    }

    public CreationModeBottomBar(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
