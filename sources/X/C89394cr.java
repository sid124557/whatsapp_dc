package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4cr  reason: invalid class name and case insensitive filesystem */
public final class C89394cr extends TextEmojiLabel implements C182208o2 {
    public C625735q A00;
    public boolean A01;

    public C89394cr(Context context) {
        super(context, (AttributeSet) null);
        A08();
        AnonymousClass0Y9.A06(this, R.style.f12nameremoved);
        setGravity(17);
    }

    public LinearLayout.LayoutParams getBodyViewLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 3;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        layoutParams.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), dimensionPixelSize, layoutParams.bottomMargin);
        return layoutParams;
    }

    public final void setSystemMessageTextResolver(C625735q r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public View getBodyView() {
        return this;
    }

    public final C625735q getSystemMessageTextResolver() {
        C625735q r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemMessageTextResolver");
    }
}
