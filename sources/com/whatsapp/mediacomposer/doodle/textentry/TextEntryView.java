package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass4Lt;
import X.AnonymousClass4vO;
import X.AnonymousClass5UO;
import X.AnonymousClass5X6;
import X.C06560Yg;
import X.C109725f5;
import X.C114785nb;
import X.C114835ng;
import X.C149797Nx;
import X.C166917zT;
import X.C182658om;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;

public class TextEntryView extends AnonymousClass4vO {
    public int A00;
    public View A01;
    public WaImageView A02;
    public WaTextView A03;
    public ColorPickerComponent A04;
    public AnonymousClass4Lt A05;
    public boolean A06;

    public final void A03(C149797Nx r4) {
        if (r4.A02 == 2) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            this.A03.setPadding(0, dimensionPixelSize, dimensionPixelSize, 0);
            return;
        }
        this.A03.setPadding(0, 0, 0, 0);
    }

    public void A02(C114835ng r6, C149797Nx r7, int[] iArr) {
        super.A02(r6, r7, iArr);
        this.A05 = new AnonymousClass4Lt(getContext(), 0);
        this.A03 = AnonymousClass0x7.A0L(this, R.id.font_picker_preview);
        View A022 = C06560Yg.A02(this, R.id.picker_button_container);
        this.A01 = A022;
        A022.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        AnonymousClass4Lt r1 = this.A05;
        AnonymousClass5X6 r2 = r7.A03;
        r1.A01(r2.A03);
        this.A03.setTypeface(this.A01.getTypeface());
        WaImageView A0L = AnonymousClass0x9.A0L(this, R.id.font_picker_btn);
        this.A02 = A0L;
        C109725f5.A00(A0L, this, r6, r7, 48);
        this.A02.setOnLongClickListener(new C166917zT(r6, r7, this));
        this.A02.setImageDrawable(this.A05);
        A03(r7);
        ColorPickerComponent colorPickerComponent = (ColorPickerComponent) C06560Yg.A02(this, R.id.color_picker_component);
        this.A04 = colorPickerComponent;
        int i = this.A00;
        if (i > 0) {
            colorPickerComponent.setMaxHeight(i);
        }
        if (this.A06) {
            colorPickerComponent.A00();
        }
        this.A04.setColorAndInvalidate(r2.A03);
        this.A04.A03((AnonymousClass5UO) null, new C114785nb(r7, this), (C182658om) null);
    }

    public void setDelayShowColorPicker(boolean z) {
        this.A06 = z;
    }

    public void setMaxColorPickerHeight(int i) {
        this.A00 = i;
    }

    public TextEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TextEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextEntryView(Context context) {
        this(context, (AttributeSet) null);
    }
}
