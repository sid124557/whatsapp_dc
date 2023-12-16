package com.google.android.material.textfield;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03A;
import X.C105515Vh;
import X.C1463179t;
import X.C161837qd;
import X.C18290x4;
import X.C18320x8;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.R;
import java.util.Locale;

public class TextInputEditText extends AnonymousClass03A {
    public boolean A00;
    public final Rect A01;

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(context, attributeSet, i, 0), attributeSet, i);
        this.A01 = AnonymousClass001.A0N();
        TypedArray A002 = C161837qd.A00(context, attributeSet, C1463179t.A0e, new int[0], i, R.style.f12nameremoved);
        this.A00 = A002.getBoolean(0, false);
        A002.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.A00 && rect != null) {
            Rect rect2 = this.A01;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.A00) {
            return super.getGlobalVisibleRect(rect, point);
        }
        return textInputLayout.getGlobalVisibleRect(rect, point);
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.A0y) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.A0y && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            boolean A1U = C18320x8.A1U(text);
            String str2 = "";
            if (C18320x8.A1U(hint)) {
                str = hint.toString();
            } else {
                str = str2;
            }
            if (A1U) {
                StringBuilder A0v = C18290x4.A0v(text);
                if (!TextUtils.isEmpty(str)) {
                    str2 = AnonymousClass000.A0V(", ", str, AnonymousClass001.A0o());
                }
                str = AnonymousClass000.A0X(str2, A0v);
            } else if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            accessibilityNodeInfo.setText(str);
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.A00 || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int A0D = C86664Kz.A0D(this, textInputLayout.getHeight());
        Rect rect2 = this.A01;
        rect2.set(rect.left, rect.top, rect.right, rect.bottom + A0D);
        return super.requestRectangleOnScreen(rect2);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.A00 = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }
}
