package com.whatsapp.conversation.conversationrow.dynamicview;

import X.C162457s7;
import X.C18270x1;
import X.C54292oU;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.WaLinearLayout;
import java.util.List;

public final class DynamicMessageView extends WaLinearLayout {
    public C621033m A00;
    public C54292oU A01;
    public C620733j A02;
    public C624134x A03;
    public List A04;
    public boolean A05;
    public boolean A06;

    public final void setUserAction(C621033m r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContext(C54292oU r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final boolean getChildCanCaptureTouchEvent() {
        return this.A05;
    }

    public final C621033m getUserAction() {
        C621033m r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("userAction");
    }

    public final C54292oU getWaContext() {
        C54292oU r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContext");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A05) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public DynamicMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }

    public final void setChildCanCaptureTouchEvent(boolean z) {
        this.A05 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18270x1.A10(context, 1, attributeSet);
        A01();
        setOrientation(1);
        this.A05 = true;
    }
}
