package X;

import android.app.Dialog;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.languageselector.LanguageSelectorBottomSheet;

/* renamed from: X.15T  reason: invalid class name */
public class AnonymousClass15T extends AnonymousClass7XV {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ LanguageSelectorBottomSheet A01;

    public AnonymousClass15T(BottomSheetBehavior bottomSheetBehavior, LanguageSelectorBottomSheet languageSelectorBottomSheet) {
        this.A01 = languageSelectorBottomSheet;
        this.A00 = bottomSheetBehavior;
    }

    public void A03(View view, int i) {
        LanguageSelectorBottomSheet languageSelectorBottomSheet = this.A01;
        Dialog dialog = languageSelectorBottomSheet.A03;
        View A02 = C06560Yg.A02(view, R.id.topHandle);
        if (i == 3) {
            this.A00.A0p = true;
            if (dialog != null) {
                C107405bG.A02(AnonymousClass5Yj.A02(dialog.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved), dialog);
            }
            view.setBackgroundColor(C08310eF.A09(languageSelectorBottomSheet).getColor(AnonymousClass5Yj.A02(dialog.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            A02.setVisibility(8);
            return;
        }
        if (dialog != null) {
            C107405bG.A02(R.color.f5nameremoved, dialog);
        }
        view.setBackground(C18310x6.A0G(view.getContext(), R.drawable.language_selector_bottomsheet_background));
        if (i != 4) {
            A02.setVisibility(0);
            if (i == 5) {
                languageSelectorBottomSheet.A1K();
            }
        }
    }

    public void A02(View view, float f) {
        View A02 = C06560Yg.A02(view, R.id.topHandle);
        if (((double) f) > 0.7d && f < 1.0f) {
            A02.setAlpha(1.0f - f);
        } else if (f == 1.0f) {
            A02.setAlpha(0.0f);
            A02.setVisibility(8);
        }
    }
}
