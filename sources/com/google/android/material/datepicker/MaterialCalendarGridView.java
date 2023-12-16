package com.google.android.material.datepicker;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06560Yg;
import X.C188778zT;
import X.C86664Kz;
import X.C87154Of;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.whatsapp.R;
import java.util.Calendar;

public final class MaterialCalendarGridView extends GridView {
    public final Calendar A00;
    public final boolean A01;

    public void onFocusChanged(boolean z, int i, Rect rect) {
        int A002;
        boolean z2 = false;
        if (z) {
            if (i == 33) {
                C87154Of r0 = (C87154Of) super.getAdapter();
                A002 = (r0.A00() + r0.A02.A01) - 1;
            } else if (i == 130) {
                A002 = ((C87154Of) super.getAdapter()).A00();
            } else {
                z2 = true;
            }
            setSelection(A002);
            return;
        }
        super.onFocusChanged(z2, i, rect);
    }

    public void onMeasure(int i, int i2) {
        if (this.A01) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C87154Of) {
            super.setAdapter(listAdapter);
            return;
        }
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = MaterialCalendarGridView.class.getCanonicalName();
        A0M[1] = C87154Of.class.getCanonicalName();
        throw AnonymousClass001.A0c(String.format("%1$s must have its Adapter set to a %2$s", A0M));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C86664Kz.A1O();
        if (MaterialDatePicker.A01(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.A01 = MaterialDatePicker.A01(getContext(), R.attr.f3nameremoved);
        C06560Yg.A0O(this, new C188778zT(this, 7));
    }

    public C87154Of A00() {
        return (C87154Of) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((BaseAdapter) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C87154Of r3 = (C87154Of) super.getAdapter();
        int max = Math.max(r3.A00(), getFirstVisiblePosition());
        int min = Math.min((r3.A00() + r3.A02.A01) - 1, getLastVisiblePosition());
        r3.getItem(max);
        r3.getItem(min);
        throw AnonymousClass001.A0g("getSelectedRanges");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() != -1 && getSelectedItemPosition() < ((C87154Of) super.getAdapter()).A00()) {
                if (19 == i) {
                    setSelection(((C87154Of) super.getAdapter()).A00());
                }
            }
            return true;
        }
        return false;
    }

    public void setSelection(int i) {
        if (i < ((C87154Of) super.getAdapter()).A00()) {
            i = ((C87154Of) super.getAdapter()).A00();
        }
        super.setSelection(i);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }
}
