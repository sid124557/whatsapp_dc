package X;

import android.os.Bundle;
import com.whatsapp.shops.ShopsProductPreviewFragment;

/* renamed from: X.9eL  reason: invalid class name and case insensitive filesystem */
public class C198079eL implements C84204Bl {
    public C08310eF B14(String str) {
        ShopsProductPreviewFragment shopsProductPreviewFragment = new ShopsProductPreviewFragment();
        Bundle A0H = shopsProductPreviewFragment.A0H();
        A0H.putString("screen_name", "com.bloks.www.minishops.whatsapp.products_preview_h_scroll");
        A0H.putString("shopUrl", str);
        return shopsProductPreviewFragment;
    }
}
