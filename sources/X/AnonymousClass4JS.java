package X;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;

/* renamed from: X.4JS  reason: invalid class name */
public class AnonymousClass4JS implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public boolean A01;
    public final int A02 = 0;

    public AnonymousClass4JS(ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment) {
        this.A00 = confirmLegalNameBottomSheetFragment;
    }

    public void onGlobalLayout() {
        KeyboardPopupLayout keyboardPopupLayout;
        ViewTreeObserver viewTreeObserver;
        if (this.A02 != 0) {
            ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment = (ConfirmLegalNameBottomSheetFragment) this.A00;
            if (confirmLegalNameBottomSheetFragment.A0B != null) {
                boolean A002 = C105895Wv.A00(confirmLegalNameBottomSheetFragment.A1I());
                if (A002 != this.A01) {
                    this.A01 = A002;
                    ScrollView scrollView = confirmLegalNameBottomSheetFragment.A03;
                    if (scrollView != null) {
                        scrollView.fullScroll(130);
                        return;
                    }
                    throw C18270x1.A0S("scrollView");
                }
                return;
            }
            throw C18270x1.A0S("imeUtils");
        }
        AnonymousClass5YE r1 = (AnonymousClass5YE) this.A00;
        ExpressionsBottomSheetView expressionsBottomSheetView = r1.A0F;
        if (!(expressionsBottomSheetView == null || (viewTreeObserver = expressionsBottomSheetView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        r1.A0H = false;
        if (!r1.A0L) {
            r1.A08();
        }
        if (this.A01 && (keyboardPopupLayout = r1.A09) != null) {
            keyboardPopupLayout.A07 = false;
            keyboardPopupLayout.requestLayout();
        }
    }

    public AnonymousClass4JS(AnonymousClass5YE r2, boolean z) {
        this.A00 = r2;
        this.A01 = z;
    }
}
