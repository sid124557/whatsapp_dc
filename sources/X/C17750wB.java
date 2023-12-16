package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.biometric.FingerprintDialogFragment;
import androidx.preference.ListPreferenceDialogFragmentCompat;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;

/* renamed from: X.0wB  reason: invalid class name and case insensitive filesystem */
public class C17750wB implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public C17750wB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A01) {
            case 0:
                ((FingerprintDialogFragment) this.A00).A04.A0G(true);
                return;
            case 1:
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = (ListPreferenceDialogFragmentCompat) this.A00;
                listPreferenceDialogFragmentCompat.A00 = i;
                listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
                return;
            case 2:
                ((Context) this.A00).startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
                return;
            case 3:
                ((EncBackupViewModel) this.A00).A0I();
                return;
            case 4:
                C06270Wx.A03(((PasswordInputFragment) this.A00).A07.A07, 0);
                return;
            default:
                ((DialogInterface.OnCancelListener) this.A00).onCancel(dialogInterface);
                return;
        }
    }
}
