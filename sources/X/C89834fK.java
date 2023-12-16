package X;

import com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet;

/* renamed from: X.4fK  reason: invalid class name and case insensitive filesystem */
public final class C89834fK extends C103045Lg {
    public final /* synthetic */ AnonymousClass4OL A00;
    public final /* synthetic */ AccountSwitchingBottomSheet A01;

    public C89834fK(AnonymousClass4OL r1, AccountSwitchingBottomSheet accountSwitchingBottomSheet) {
        this.A01 = accountSwitchingBottomSheet;
        this.A00 = r1;
    }

    public void A00() {
        AccountSwitchingBottomSheet accountSwitchingBottomSheet = this.A01;
        AnonymousClass4FS r2 = accountSwitchingBottomSheet.A0I;
        if (r2 != null) {
            C117165rU.A00(r2, accountSwitchingBottomSheet, this.A00, 12);
            return;
        }
        throw C18270x1.A0S("waWorkers");
    }
}
