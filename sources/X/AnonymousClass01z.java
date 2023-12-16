package X;

import android.os.Handler;
import android.os.Message;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

/* renamed from: X.01z  reason: invalid class name */
public class AnonymousClass01z extends Handler {
    public final /* synthetic */ PreferenceFragmentCompat A00;

    public AnonymousClass01z(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A00 = preferenceFragmentCompat;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            PreferenceFragmentCompat preferenceFragmentCompat = this.A00;
            PreferenceScreen preferenceScreen = preferenceFragmentCompat.A02.A07;
            if (preferenceScreen != null) {
                preferenceFragmentCompat.A03.setAdapter(new AnonymousClass09H(preferenceScreen));
                preferenceScreen.A08();
            }
        }
    }
}
