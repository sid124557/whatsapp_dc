package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.4bU  reason: invalid class name and case insensitive filesystem */
public abstract class C89094bU extends AnonymousClass4So {
    public AnonymousClass5GB A00;
    public AnonymousClass5N0 A01;

    public final void A0L() {
        AnonymousClass5GB r1 = this.A00;
        if (!isInEditMode()) {
            AnonymousClass0YH.A06(this, C102805Ki.A00(r1.A00) ? 1 : 0);
        }
    }

    public C89094bU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0L();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass5N0 r1 = this.A01;
        if (r1 == null) {
            r1 = new AnonymousClass5N0();
            this.A01 = r1;
        }
        Runnable runnable = r1.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
            r1.A00 = null;
        }
    }

    public void setTitle(int i) {
        super.setTitle(i);
        AnonymousClass5N0 r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass5N0();
            this.A01 = r0;
        }
        r0.A00(this);
    }

    public C89094bU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0L();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AnonymousClass5N0 r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass5N0();
            this.A01 = r0;
        }
        r0.A00(this);
    }

    public C89094bU(Context context) {
        super(context);
        A0L();
    }
}
