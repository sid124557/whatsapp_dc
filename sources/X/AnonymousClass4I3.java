package X;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.4I3  reason: invalid class name */
public class AnonymousClass4I3 implements C181198mM {
    public Object A00;
    public final int A01;

    public AnonymousClass4I3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BNx(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        ExpressionsSearchViewModel A0L;
        C41552Kr r0;
        if (this.A01 != 0) {
            ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = (ExpressionsKeyboardSearchBottomSheet) this.A00;
            if (z) {
                if (i == R.id.gifs) {
                    A0L = C18320x8.A0L(expressionsKeyboardSearchBottomSheet);
                    r0 = AnonymousClass1Ta.A00;
                } else if (i == R.id.avatar_stickers) {
                    A0L = C18320x8.A0L(expressionsKeyboardSearchBottomSheet);
                    r0 = AnonymousClass1TY.A00;
                } else if (i == R.id.stickers) {
                    A0L = C18320x8.A0L(expressionsKeyboardSearchBottomSheet);
                    r0 = AnonymousClass1Tb.A00;
                } else {
                    return;
                }
                A0L.A0D(r0);
                return;
            }
            return;
        }
        ExpressionsBottomSheetView.A02((ExpressionsBottomSheetView) this.A00, i, z);
    }
}
