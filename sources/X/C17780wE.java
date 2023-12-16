package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.0wE  reason: invalid class name and case insensitive filesystem */
public class C17780wE implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public C17780wE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onCancel(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                Dialog dialog = dialogFragment.A03;
                if (dialog != null) {
                    dialogFragment.onCancel(dialog);
                    return;
                }
                return;
            case 1:
                ((AnonymousClass0E2) this.A00).A0g();
                return;
            case 2:
                ((BaseNewUserSetupActivity$AuthRequestDialogFragment) this.A00).A00();
                return;
            case 3:
                ((RestoreFromBackupActivity) this.A00).A0q();
                return;
            case 4:
                ((RestoreFromBackupActivity) this.A00).A0m();
                return;
            case 5:
                ((SettingsGoogleDrive) this.A00).A0Z();
                return;
            default:
                ((SettingsGoogleDrive.AuthRequestDialogFragment) this.A00).A00();
                return;
        }
    }
}
