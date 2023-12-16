package X;

import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.0lW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12420lW implements Runnable {
    public final /* synthetic */ UserRecoverableAuthException A00;
    public final /* synthetic */ SettingsGoogleDrive A01;

    public final void run() {
        this.A01.A0n(this.A00);
    }

    public /* synthetic */ C12420lW(UserRecoverableAuthException userRecoverableAuthException, SettingsGoogleDrive settingsGoogleDrive) {
        this.A01 = settingsGoogleDrive;
        this.A00 = userRecoverableAuthException;
    }
}
