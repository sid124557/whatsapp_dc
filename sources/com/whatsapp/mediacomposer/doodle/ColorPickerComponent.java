package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass001;
import X.AnonymousClass0YY;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5UO;
import X.AnonymousClass5VG;
import X.AnonymousClass68B;
import X.AnonymousClass8HY;
import X.C05030Rp;
import X.C06560Yg;
import X.C116855qy;
import X.C182658om;
import X.C18280x3;
import X.C184468rs;
import X.C86634Kw;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.ImageComposerFragment;

public class ColorPickerComponent extends LinearLayout implements AnonymousClass4GJ {
    public AnonymousClass5UO A00;
    public C116855qy A01;
    public boolean A02;
    public final View A03;
    public final ViewGroup A04;
    public final ColorPickerView A05;

    public final void A02(int i) {
        int i2;
        View view = this.A03;
        int paddingLeft = view.getPaddingLeft();
        int A012 = AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved);
        int paddingRight = view.getPaddingRight();
        if (i == 2) {
            i2 = AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved);
        } else {
            i2 = 0;
        }
        view.setPadding(paddingLeft, A012, paddingRight, i2);
    }

    public void A00() {
        ColorPickerView colorPickerView = this.A05;
        if (colorPickerView.getVisibility() != 0) {
            colorPickerView.setVisibility(0);
            A01(R.anim.f0nameremoved);
        }
        AnonymousClass5UO r1 = this.A00;
        if (r1 != null && (r1 instanceof AnonymousClass68B)) {
            AnonymousClass68B r12 = (AnonymousClass68B) r1;
            if (r12.A01 == 0) {
                ((ImageComposerFragment) r12.A00).A1X(false, true);
            }
        }
    }

    public final void A01(int i) {
        ColorPickerView colorPickerView = this.A05;
        colorPickerView.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        loadAnimation.setInterpolator(C05030Rp.A00(0.5f, 1.35f, 0.4f, 1.0f));
        colorPickerView.startAnimation(loadAnimation);
    }

    public void A03(AnonymousClass5UO r4, C184468rs r5, C182658om r6) {
        this.A00 = r4;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved);
        setLayoutParams(layoutParams);
        if (r6 != null) {
            ColorPickerView colorPickerView = this.A05;
            r6.BnS(colorPickerView.A00, colorPickerView.A02);
        }
        this.A05.A09 = new AnonymousClass8HY(r5, this, r6);
    }

    public void A04(boolean z) {
        ColorPickerView colorPickerView = this.A05;
        if (colorPickerView.getVisibility() == 0) {
            if (z) {
                A01(R.anim.f0nameremoved);
            }
            colorPickerView.setVisibility(4);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public int getColorPickerHeight() {
        return this.A05.getHeight();
    }

    public float getMinSize() {
        return (float) this.A05.A06;
    }

    public int getSelectedColor() {
        return this.A05.A02;
    }

    public float getSelectedStrokeSize() {
        return this.A05.A00;
    }

    public void setColorAndInvalidate(int i) {
        this.A05.setColorAndInvalidate(i);
    }

    public void setInsets(Rect rect) {
        ViewGroup viewGroup = this.A04;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(viewGroup);
        A0T.leftMargin = rect.left;
        A0T.topMargin = rect.top;
        A0T.rightMargin = rect.right;
        A0T.bottomMargin = rect.bottom;
        viewGroup.setLayoutParams(A0T);
    }

    public void setMaxHeight(int i) {
        this.A05.A03 = i;
    }

    public void setSizeAndInvalidate(float f) {
        this.A05.setSizeAndInvalidate(f);
    }

    public ColorPickerComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ViewGroup viewGroup = (ViewGroup) C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        this.A04 = viewGroup;
        ColorPickerView colorPickerView = (ColorPickerView) C06560Yg.A02(viewGroup, R.id.color_picker);
        this.A05 = colorPickerView;
        this.A03 = C06560Yg.A02(viewGroup, R.id.color_picker_container);
        AnonymousClass0YY.A06(colorPickerView, 1);
        AnonymousClass5VG.A00(colorPickerView, colorPickerView.A02);
        A02(C86634Kw.A0E(this).orientation);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A02(configuration.orientation);
    }

    public ColorPickerComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerComponent(Context context) {
        this(context, (AttributeSet) null);
    }
}
