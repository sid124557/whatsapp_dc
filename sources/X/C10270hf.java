package X;

import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.0hf  reason: invalid class name and case insensitive filesystem */
public class C10270hf implements C85014Ep {
    public final /* synthetic */ SettingsGoogleDrive A00;

    public C10270hf(SettingsGoogleDrive settingsGoogleDrive) {
        this.A00 = settingsGoogleDrive;
    }

    public final void A00() {
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f11nameremoved;
        if (i >= 30) {
            i2 = R.string.f11nameremoved;
            if (i < 33) {
                i2 = R.string.f11nameremoved;
            }
        }
        RequestPermissionActivity.A0b(settingsGoogleDrive, R.string.f11nameremoved, i2);
    }

    public void BZP(String str) {
        Log.i("settings-gdrive/readonly-external-storage-readonly");
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        boolean A01 = C61072zf.A01();
        int i = R.string.f11nameremoved;
        if (A01) {
            i = R.string.f11nameremoved;
        }
        settingsGoogleDrive.Box(new Object[0], R.string.f11nameremoved, i);
    }

    public void BZQ() {
        Log.i("settings-gdrive/readonly-external-storage-readonly-permission");
        A00();
    }

    public void Beo(String str) {
        Log.i("settings-gdrive/external-storage-unavailable");
        C621433s.A01(this.A00, 602);
    }

    public void Bep() {
        Log.i("settings-gdrive/external-storage-unavailable-permission");
        A00();
    }
}
