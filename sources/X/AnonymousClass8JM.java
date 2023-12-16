package X;

import android.content.Context;
import com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.8JM  reason: invalid class name */
public final class AnonymousClass8JM implements AnonymousClass4DX {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AccountSwitchingBottomSheet A01;

    public AnonymousClass8JM(Context context, AccountSwitchingBottomSheet accountSwitchingBottomSheet) {
        this.A01 = accountSwitchingBottomSheet;
        this.A00 = context;
    }

    public void BSk() {
        Log.e("AccountSwitchingBottomSheet/updatePushConfigForCurrentAccount/sendClientConfigCallback/failed");
        AccountSwitchingBottomSheet accountSwitchingBottomSheet = this.A01;
        accountSwitchingBottomSheet.A1Y().A0S(new C117165rU(accountSwitchingBottomSheet, 15, this.A00));
    }

    public void onSuccess() {
        Log.i("AccountSwitchingBottomSheet/updatePushConfigForCurrentAccount/sendClientConfigCallback/success");
        AccountSwitchingBottomSheet accountSwitchingBottomSheet = this.A01;
        accountSwitchingBottomSheet.A1Y().A0S(new C117165rU(accountSwitchingBottomSheet, 14, this.A00));
    }
}
