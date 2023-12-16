package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;

/* renamed from: X.7cn  reason: invalid class name and case insensitive filesystem */
public final class C154207cn {
    public static final TextVariantsBottomSheet A00(C165977xw r3, C166107y9 r4, int i, boolean z) {
        TextVariantsBottomSheet textVariantsBottomSheet = new TextVariantsBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("START_WITH_SELECTION_ARG", i);
        A08.putParcelable("TEXT_OPTIONS_DATA", r4);
        A08.putParcelable("OTHER_OPTION_SELECTED_ARG", r3);
        A08.putBoolean("USE_BACK_ARROW_FOR_CLOSE_ARG", z);
        textVariantsBottomSheet.A0u(A08);
        return textVariantsBottomSheet;
    }
}
