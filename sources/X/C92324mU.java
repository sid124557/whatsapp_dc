package X;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* renamed from: X.4mU  reason: invalid class name and case insensitive filesystem */
public class C92324mU extends C89194c2 {
    public static final Editable.Factory A05 = new C86934Ml();
    public C56972sr A00;
    public AnonymousClass650 A01;
    public AnonymousClass33p A02;
    public C105895Wv A03;
    public Runnable A04;

    public void setInputEnterDone(boolean z) {
        int i = 0;
        if (z) {
            i = 6;
        }
        setInputEnterAction(i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass650 r0 = this.A01;
        if (r0 != null) {
            r0.BUx(keyEvent, i);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT >= 23 && i == 16908322) {
            i = 16908337;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setupEnterIsSend(Runnable runnable) {
        this.A04 = runnable;
        boolean A1T = C86654Ky.A1T(AnonymousClass0x2.A0F(this.A02), "input_enter_send");
        if (C86664Kz.A1W(this.A00)) {
            setInputEnterAction(AnonymousClass0x9.A00(A1T ? 1 : 0));
        }
        setOnKeyListener(new AnonymousClass6BD(this, 0));
    }

    public C92324mU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setEditableFactory(A05);
        setCustomSelectionActionModeCallback(new C109215eG(this));
    }

    public void setOnKeyPreImeListener(AnonymousClass650 r1) {
        this.A01 = r1;
    }

    public C92324mU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEditableFactory(A05);
        setCustomSelectionActionModeCallback(new C109215eG(this));
    }

    public C92324mU(Context context) {
        super(context);
        setEditableFactory(A05);
        setCustomSelectionActionModeCallback(new C109215eG(this));
    }
}
