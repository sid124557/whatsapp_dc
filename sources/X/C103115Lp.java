package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Lp  reason: invalid class name and case insensitive filesystem */
public final class C103115Lp {
    public /* bridge */ /* synthetic */ DialogFragment A00(UserJid userJid, String str, int i) {
        C162457s7.A0J(userJid, 0);
        CartFragment cartFragment = new CartFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("extra_business_id", userJid);
        A08.putInt("extra_entry_point", i);
        A08.putString("extra_product_id", str);
        cartFragment.A0u(A08);
        return cartFragment;
    }
}
