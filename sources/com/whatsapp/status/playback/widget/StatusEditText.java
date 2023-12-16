package com.whatsapp.status.playback.widget;

import X.AnonymousClass000;
import X.C107415bH;
import X.C162457s7;
import X.C70273aE;
import X.C86614Ku;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.whatsapp.mentions.MentionableEntry;

public final class StatusEditText extends MentionableEntry {
    public boolean A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A04();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C162457s7.A0J(charSequence, 0);
        super.onTextChanged(charSequence, i, i2, i3);
        A0L();
    }

    public final void A0L() {
        int A06 = AnonymousClass000.A06(this, getMeasuredWidth());
        int A05 = AnonymousClass000.A05(this, getMeasuredHeight());
        if (A06 > 0 && A05 > 0) {
            if (getText() == null) {
                super.setTextSize(2, 32.0f);
                return;
            }
            Editable text = getText();
            if (text != null) {
                DisplayMetrics A0E = C86614Ku.A0E(this);
                float f = ((float) A0E.heightPixels) / A0E.density;
                int A03 = C107415bH.A03(text, 0, text.length());
                super.setTextSize(2, (float) C107415bH.A01(A03, (int) f, this.A01));
                if (A03 < 150) {
                    setGravity(17);
                    setTextAlignment(4);
                    return;
                }
                setGravity(16);
                setTextAlignment(5);
                setTextDirection(5);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0L();
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart >= 0 && selectionEnd >= 0) {
                post(new C70273aE(this, selectionStart, selectionEnd, 6));
            }
        }
    }

    public final void setCursorPosition(int i) {
        super.setCursorPosition_internal(i, i);
    }

    public final void setLinkPreviewPresent(boolean z) {
        this.A01 = z;
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        A0L();
    }

    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        A0L();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A04();
    }

    public StatusEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A04();
    }
}
