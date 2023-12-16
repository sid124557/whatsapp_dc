package X;

import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.0EB  reason: invalid class name */
public class AnonymousClass0EB extends C10210hZ {
    public final /* synthetic */ SettingsGoogleDrive A00;

    public AnonymousClass0EB(SettingsGoogleDrive settingsGoogleDrive) {
        this.A00 = settingsGoogleDrive;
    }

    public void BLu(boolean z) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("settings-gdrive/gdrive-backup-deletion-finished/");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        Log.i(AnonymousClass000.A0X(str, A0o));
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        ((C06310Xb) settingsGoogleDrive.A0m.get()).A0B("com.whatsapp.backup.google.google-encrypted-re-upload-worker");
        C06550Ye.A0J(settingsGoogleDrive.A05);
        settingsGoogleDrive.A7D();
    }
}
