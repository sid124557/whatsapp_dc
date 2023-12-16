package X;

import android.accounts.AccountManagerFuture;
import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.0mG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12870mG implements Runnable {
    public final /* synthetic */ AccountManagerFuture A00;
    public final /* synthetic */ SettingsGoogleDrive.AuthRequestDialogFragment A01;
    public final /* synthetic */ SettingsGoogleDrive A02;

    public final void run() {
        this.A02.A0h(this.A00, this.A01);
    }

    public /* synthetic */ C12870mG(AccountManagerFuture accountManagerFuture, SettingsGoogleDrive.AuthRequestDialogFragment authRequestDialogFragment, SettingsGoogleDrive settingsGoogleDrive) {
        this.A02 = settingsGoogleDrive;
        this.A00 = accountManagerFuture;
        this.A01 = authRequestDialogFragment;
    }
}
