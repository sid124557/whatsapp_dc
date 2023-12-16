package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass4SQ;
import X.AnonymousClass79W;
import X.C105245Ud;
import X.C106675Zy;
import X.C107575bX;
import X.C124156Be;
import X.C181658n7;
import X.C620633i;
import X.C620733j;
import X.C70043Zq;
import X.C86624Kv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Selection;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.components.PhoneNumberEntry;

public class WaEditText extends AnonymousClass4SQ {
    public Rect A00;
    public C181658n7 A01;
    public C620633i A02;
    public C620733j A03;
    public boolean A04;
    public final Runnable A05 = new C70043Zq(this, 19);

    public void A06() {
        A07(false);
    }

    private void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79W.A01);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(this.A03.A0B(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(this.A03.A0B(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(this.A03.A0B(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void A05() {
        InputMethodManager A0Q = this.A02.A0Q();
        this.A04 = false;
        removeCallbacks(this.A05);
        if (A0Q != null) {
            A0Q.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void A07(boolean z) {
        InputMethodManager A0Q = this.A02.A0Q();
        if (A0Q == null) {
            return;
        }
        if (A0Q.isFullscreenMode() && !z) {
            return;
        }
        if (A0Q.isActive(this)) {
            this.A04 = false;
            removeCallbacks(this.A05);
            A0Q.showSoftInput(this, 0);
            return;
        }
        requestFocus();
        this.A04 = true;
    }

    public boolean A08(Point point) {
        int i;
        Rect rect = this.A00;
        if (rect == null) {
            return true;
        }
        int i2 = point.x;
        if (i2 < rect.left || i2 > rect.right || (i = point.y) < rect.top || i > rect.bottom) {
            return false;
        }
        return true;
    }

    public boolean onTextContextMenuItem(int i) {
        C181658n7 r1 = this.A01;
        if (r1 != null) {
            C124156Be r12 = (C124156Be) r1;
            if (r12.A01 != 0) {
                C105245Ud r5 = (C105245Ud) r12.A00;
                String[] A002 = PhoneNumberEntry.A00(r5.A06, r5.A0D, i, true);
                if (A002 != null) {
                    String str = A002[0];
                    String A003 = C106675Zy.A00(str);
                    if (!TextUtils.isEmpty(A003)) {
                        r5.A05(A003);
                        r5.A03.setText(AnonymousClass000.A0V(" +", str, AnonymousClass000.A0l(A003)));
                    }
                    WaEditText waEditText = r5.A08;
                    waEditText.setText(A002[1]);
                    waEditText.setSelection(waEditText.length());
                    return true;
                }
            } else {
                PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) r12.A00;
                String[] A004 = PhoneNumberEntry.A00(phoneNumberEntry.A01, phoneNumberEntry.A05, i, false);
                if (A004 != null) {
                    phoneNumberEntry.A02.setText(A004[0]);
                    phoneNumberEntry.A03.setText(A004[1]);
                    return true;
                }
            }
        }
        if (super.onTextContextMenuItem(i)) {
            return true;
        }
        return false;
    }

    public void setKeyFilter(String str) {
        if (str != null) {
            setKeyListener(DigitsKeyListener.getInstance(str));
        }
    }

    public WaEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A04) {
            Runnable runnable = this.A05;
            removeCallbacks(runnable);
            post(runnable);
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(C107575bX.A03(getText()));
        }
    }

    public void setCursorPosition_internal(int i, int i2) {
        int A032 = C86624Kv.A03(this);
        Selection.setSelection(getText(), Math.min(i, A032), Math.min(i2, A032));
    }

    public void setOnContextMenuListener(C181658n7 r1) {
        this.A01 = r1;
    }

    public void setSpan_internal(Object obj, int i, int i2, int i3) {
        getText().setSpan(obj, i, Math.min(i2, C86624Kv.A03(this)), i3);
    }

    public void setVisibleBounds(Rect rect) {
        this.A00 = rect;
    }

    public WaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public WaEditText(Context context) {
        super(context);
    }
}
