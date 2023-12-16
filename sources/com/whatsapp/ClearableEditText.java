package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass4TI;
import X.C02680He;
import X.C06560Yg;
import X.C100905Cs;
import X.C102805Ki;
import X.C111685iW;
import X.C116855qy;
import X.C620733j;
import X.C86634Kw;
import X.C88864av;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;

public class ClearableEditText extends TextInputEditText implements View.OnTouchListener, TextWatcher, AnonymousClass4GJ {
    public Drawable A00;
    public View.OnClickListener A01;
    public C620733j A02;
    public C116855qy A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;

    public void A01() {
        if (!this.A06) {
            this.A06 = true;
            this.A02 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final void A03(Editable editable) {
        if (this.A04 || (!TextUtils.isEmpty(editable) && isFocusable() && isEnabled())) {
            if (this.A00 != null) {
                boolean A002 = C102805Ki.A00(this.A02);
                Drawable drawable = this.A00;
                if (A002) {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        } else if (getClearIconDrawable() != null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public Drawable getClearIconDrawable() {
        boolean A002 = C102805Ki.A00(this.A02);
        Drawable[] compoundDrawables = getCompoundDrawables();
        char c = 2;
        if (A002) {
            c = 0;
        }
        return compoundDrawables[c];
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.A05 && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setAlwaysShowClearIcon(boolean z) {
        if (z != this.A04) {
            this.A04 = z;
            invalidate();
        }
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A07 = true;
        this.A08 = AnonymousClass001.A0N();
        A02(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public Rect getClearBounds() {
        int A0I;
        int width;
        Drawable clearIconDrawable = getClearIconDrawable();
        if (clearIconDrawable == null) {
            return AnonymousClass001.A0N();
        }
        if (C102805Ki.A00(this.A02)) {
            A0I = 0;
        } else {
            A0I = AnonymousClass001.A0I(this) - clearIconDrawable.getIntrinsicWidth();
        }
        if (C102805Ki.A00(this.A02)) {
            width = getPaddingLeft() + clearIconDrawable.getIntrinsicWidth();
        } else {
            width = getWidth();
        }
        int bottom = ((getBottom() - getTop()) / 2) - (clearIconDrawable.getIntrinsicHeight() / 2);
        int bottom2 = ((getBottom() - getTop()) / 2) + (clearIconDrawable.getIntrinsicHeight() / 2);
        Rect rect = this.A08;
        rect.left = A0I;
        rect.right = width;
        rect.top = bottom;
        rect.bottom = bottom2;
        return rect;
    }

    public final void A02(Context context, AttributeSet attributeSet) {
        int i = R.drawable.ic_backup_cancel;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A06);
            this.A05 = obtainStyledAttributes.getBoolean(1, false);
            this.A07 = obtainStyledAttributes.getBoolean(3, true);
            this.A04 = obtainStyledAttributes.getBoolean(0, false);
            i = obtainStyledAttributes.getResourceId(2, R.drawable.ic_backup_cancel);
            obtainStyledAttributes.recycle();
        }
        this.A00 = C02680He.A00((Resources.Theme) null, getResources(), i);
        setOnTouchListener(this);
        addTextChangedListener(this);
        C06560Yg.A0O(this, new AnonymousClass4TI(this, this));
    }

    public final boolean A04(int i, int i2) {
        Rect clearBounds = getClearBounds();
        if (i < clearBounds.left || i > clearBounds.right || i2 < clearBounds.top || i2 > clearBounds.bottom) {
            return false;
        }
        return true;
    }

    public void afterTextChanged(Editable editable) {
        A03(editable);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getClearIconDrawable() == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() != 1 || !A04(x, y)) {
            return false;
        }
        View.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        C86634Kw.A1I(this);
        requestFocus();
        return this.A07;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        A03(getText());
    }

    public void setOnClearIconClickedListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A07 = true;
        this.A08 = AnonymousClass001.A0N();
        A02(context, attributeSet);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public ClearableEditText(Context context) {
        super(context, (AttributeSet) null);
        A01();
        this.A07 = true;
        this.A08 = AnonymousClass001.A0N();
        A02(context, (AttributeSet) null);
    }
}
