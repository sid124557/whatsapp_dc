package com.google.android.material.internal;

import X.AnonymousClass03Q;
import X.AnonymousClass6GV;
import X.C06560Yg;
import X.C18330xA;
import X.C188778zT;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;

public class CheckableImageButton extends AnonymousClass03Q implements Checkable {
    public static final int[] A03;
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public boolean isChecked() {
        return this.A01;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.A01) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = A03;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass6GV)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass6GV r2 = (AnonymousClass6GV) parcelable;
        super.onRestoreInstanceState(r2.A00);
        setChecked(r2.A00);
    }

    public void setCheckable(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.A00 && this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            sendAccessibilityEvent(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void setPressable(boolean z) {
        this.A02 = z;
    }

    public void setPressed(boolean z) {
        if (this.A02) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.A01);
    }

    static {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 16842912;
        A03 = A0E;
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = true;
        this.A02 = true;
        C06560Yg.A0O(this, new C188778zT(this, 8));
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass6GV r1 = new AnonymousClass6GV(super.onSaveInstanceState());
        r1.A00 = this.A01;
        return r1;
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
