package X;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.4h2  reason: invalid class name and case insensitive filesystem */
public final class C90294h2 extends C125626It {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CartFragment A03;

    public void A07(C146937Ce r7) {
        TextView textView;
        Spanned spanned;
        C162457s7.A0J(r7, 0);
        if (r7 instanceof C132176ep) {
            AnonymousClass5TF r2 = ((C132176ep) r7).A00;
            View view = this.A00;
            if (r2 != null) {
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.A01;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                textView = this.A02;
                if (textView != null) {
                    spanned = C02890Hz.A00(C18300x5.A0e(C86664Kz.A0T(this), r2.A06, AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
                    C162457s7.A0D(spanned);
                } else {
                    return;
                }
            } else {
                if (view != null) {
                    view.setVisibility(0);
                }
                View view3 = this.A01;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                textView = this.A02;
                if (textView != null) {
                    spanned = null;
                } else {
                    return;
                }
            }
            textView.setText(spanned);
        }
    }

    public C90294h2(View view, CartFragment cartFragment) {
        super(view);
        this.A03 = cartFragment;
        View findViewById = view.findViewById(R.id.add_promotion_cta);
        this.A00 = findViewById;
        this.A01 = view.findViewById(R.id.applied_promotion_info);
        this.A02 = AnonymousClass002.A09(view, R.id.applied_promotion_name);
        if (findViewById != null) {
            C18320x8.A15(findViewById, this, 28);
        }
        View findViewById2 = view.findViewById(R.id.remove_promotion_cta);
        if (findViewById2 != null) {
            C18320x8.A15(findViewById2, this, 29);
        }
    }
}
