package com.whatsapp.components;

import X.AnonymousClass0x7;
import X.AnonymousClass4GJ;
import X.C06560Yg;
import X.C100905Cs;
import X.C107235av;
import X.C116855qy;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class WaSwitchView extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final SwitchCompat A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setChecked(boolean z) {
        this.A02.setChecked(z);
    }

    public void setDescription(CharSequence charSequence) {
        this.A03.setText(charSequence);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A02.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setSwitchClickable(boolean z) {
        this.A02.setClickable(z);
    }

    public void setTitle(CharSequence charSequence) {
        this.A04.setText(charSequence);
    }

    /* JADX INFO: finally extract failed */
    public WaSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        int i5 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C100905Cs.A0W, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                i3 = obtainStyledAttributes.getResourceId(0, 0);
                i2 = obtainStyledAttributes.getResourceId(3, R.style.f12nameremoved);
                i4 = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                i5 = resourceId;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        C107235av.A02(this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        if (getPaddingLeft() == 0) {
            paddingLeft = dimensionPixelOffset;
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (getPaddingTop() == 0) {
            paddingTop = dimensionPixelOffset;
        } else {
            paddingTop = getPaddingTop();
        }
        if (getPaddingRight() == 0) {
            paddingRight = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        } else {
            paddingRight = getPaddingRight();
        }
        setPadding(paddingLeft, paddingTop, paddingRight, getPaddingBottom() != 0 ? getPaddingBottom() : dimensionPixelOffset);
        setMinimumHeight(getResources().getDimensionPixelOffset(R.dimen.f6nameremoved));
        WaTextView A0L = AnonymousClass0x7.A0L(this, R.id.switch_view_title);
        this.A04 = A0L;
        if (i5 != 0) {
            A0L.setText(i5);
        }
        if (i2 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                A0L.setTextAppearance(i2);
            } else {
                A0L.setTextAppearance(context, i2);
            }
        }
        WaTextView A0L2 = AnonymousClass0x7.A0L(this, R.id.switch_view_description);
        this.A03 = A0L2;
        if (i3 != 0) {
            A0L2.setText(i3);
        }
        if (i4 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                A0L2.setTextAppearance(i4);
            } else {
                A0L2.setTextAppearance(getContext(), i4);
            }
        }
        this.A02 = (SwitchCompat) C06560Yg.A02(this, R.id.switch_view_toggle);
    }

    public WaSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaSwitchView(Context context) {
        this(context, (AttributeSet) null);
    }
}
