package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.26Y  reason: invalid class name */
public final class AnonymousClass26Y {
    public static final StickerExpressionsFragment A00(C632338l r3, int i, boolean z, boolean z2) {
        StickerExpressionsFragment stickerExpressionsFragment = new StickerExpressionsFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("isExpressionsSearch", z);
        A08.putBoolean("isCollapsed", z2);
        A08.putInt("arg_search_opener", i);
        if (r3 != null) {
            A08.putParcelable("funStickerData", r3);
        }
        stickerExpressionsFragment.A0u(A08);
        return stickerExpressionsFragment;
    }
}
