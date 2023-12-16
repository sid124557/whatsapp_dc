package X;

import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.4fh  reason: invalid class name and case insensitive filesystem */
public class C90024fh extends C90034fi {
    public final /* synthetic */ AppAuthSettingsActivity A00;

    public C90024fh(AppAuthSettingsActivity appAuthSettingsActivity) {
        this.A00 = appAuthSettingsActivity;
    }

    public void A00() {
        Log.i("AppAuthSettingsActivity/fingerprint-success-animation-end");
        AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
        FingerprintBottomSheet fingerprintBottomSheet = appAuthSettingsActivity.A0A;
        if (fingerprintBottomSheet != null && fingerprintBottomSheet.A19()) {
            appAuthSettingsActivity.A0A.A1L();
        }
        appAuthSettingsActivity.A05.setChecked(true);
        appAuthSettingsActivity.A75(true);
    }
}
