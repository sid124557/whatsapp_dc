package com.whatsapp.stickers.picker.pages;

import X.AnonymousClass002;
import X.C107575bX;
import X.C18280x3;
import X.C18310x6;
import X.C19340zH;
import X.C85804Hr;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import com.whatsapp.R;

public class ThirdPartyPackPage$StickerBlockedDialogFragment extends Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment {
    public Dialog A1J(Bundle bundle) {
        String A0k = C18310x6.A0k(A0H(), "sticker_pack_name");
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0B(R.string.f11nameremoved);
        Context A1D = A1D();
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = Html.escapeHtml(A0k);
        A0K.A0Q(C107575bX.A00(A1D, A0L, R.string.f11nameremoved));
        C85804Hr.A01(A0K, this, 100, R.string.f11nameremoved);
        C85804Hr.A00(A0K, this, 101, R.string.f11nameremoved);
        return A0K.create();
    }
}
