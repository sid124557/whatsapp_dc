package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4Sm  reason: invalid class name */
public final class AnonymousClass4Sm extends Toolbar {
    public AnonymousClass5N0 A00;

    private final AnonymousClass5N0 getMarqueeEffectDelegate() {
        AnonymousClass5N0 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass5N0 r02 = new AnonymousClass5N0();
        this.A00 = r02;
        return r02;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass5N0 marqueeEffectDelegate = getMarqueeEffectDelegate();
        Runnable runnable = marqueeEffectDelegate.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
            marqueeEffectDelegate.A00 = null;
        }
    }

    public void setTitle(int i) {
        super.setTitle(i);
        getMarqueeEffectDelegate().A00(this);
    }

    public AnonymousClass4Sm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getMarqueeEffectDelegate().A00(this);
    }
}
