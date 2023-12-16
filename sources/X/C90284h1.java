package X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4h1  reason: invalid class name and case insensitive filesystem */
public class C90284h1 extends C125626It {
    public final WaTextView A00;
    public final WaTextView A01;
    public final WDSButton A02;

    public void A07(C146937Ce r7) {
        C132166eo r72 = (C132166eo) r7;
        WaTextView waTextView = this.A01;
        Resources A0G = C18290x4.A0G(this.A0H);
        int i = r72.A00;
        Object[] A0L = AnonymousClass002.A0L();
        boolean A1Y = C18300x5.A1Y(A0L, i);
        C86614Ku.A16(A0G, waTextView, A0L, R.plurals.f9nameremoved, i);
        boolean isEmpty = TextUtils.isEmpty(r72.A01);
        WaTextView waTextView2 = this.A00;
        if (isEmpty) {
            waTextView2.setVisibility(8);
        } else {
            waTextView2.setVisibility(A1Y ? 1 : 0);
            waTextView2.setText(r72.A01);
        }
        C86624Kv.A11(this.A02, r72.A02 ? 1 : 0, A1Y, 8);
    }

    public C90284h1(View view, CartFragment cartFragment) {
        super(view);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.total_quantity_textview);
        this.A00 = AnonymousClass0x7.A0L(view, R.id.estimated_value_textview);
        WDSButton A0f = C86654Ky.A0f(view, R.id.add_more_btn);
        this.A02 = A0f;
        if (cartFragment != null) {
            C18320x8.A16(A0f, cartFragment, this, 10);
        }
    }
}
