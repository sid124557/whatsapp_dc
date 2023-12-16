package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4cs  reason: invalid class name and case insensitive filesystem */
public final class C89404cs extends TextEmojiLabel implements C182238o5 {
    public C625735q A00;
    public boolean A01;

    public C89404cs(Context context) {
        super(context, (AttributeSet) null);
        A08();
        AnonymousClass0Y9.A06(this, R.style.f12nameremoved);
        setGravity(17);
        C86664Kz.A1S(this);
        setMaxLines(3);
    }

    public LinearLayout.LayoutParams getTitleViewLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, layoutParams.bottomMargin);
        return layoutParams;
    }

    public final void setSystemMessageTextResolver(C625735q r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C625735q getSystemMessageTextResolver() {
        C625735q r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemMessageTextResolver");
    }

    public View getTitleView() {
        return this;
    }

    public final void A0L(C624134x r3) {
        A0K((List) null, getSystemMessageTextResolver().A0P((C31871oz) r3));
    }
}
