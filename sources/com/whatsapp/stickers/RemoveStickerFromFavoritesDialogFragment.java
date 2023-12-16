package com.whatsapp.stickers;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass39M;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C19340zH;
import X.C56932sn;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class RemoveStickerFromFavoritesDialogFragment extends Hilt_RemoveStickerFromFavoritesDialogFragment {
    public AnonymousClass39M A00;
    public C56932sn A01;

    public static RemoveStickerFromFavoritesDialogFragment A00(AnonymousClass39M r3) {
        RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment = new RemoveStickerFromFavoritesDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("sticker", r3);
        removeStickerFromFavoritesDialogFragment.A0u(A08);
        return removeStickerFromFavoritesDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        this.A00 = (AnonymousClass39M) A0H().getParcelable("sticker");
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        A002.A0A(R.string.f11nameremoved);
        AnonymousClass0x2.A0t(new C85804Hr(this, 98), A002, R.string.f11nameremoved);
        return A002.create();
    }
}
