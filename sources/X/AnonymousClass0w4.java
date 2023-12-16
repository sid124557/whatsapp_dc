package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.backup.encryptedbackup.EncBackupMainActivity;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyInputFragment;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;
import com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment;
import com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.deviceauth.BiometricAuthPlugin;
import com.whatsapp.util.Log;

/* renamed from: X.0w4  reason: invalid class name */
public class AnonymousClass0w4 extends C109665ez {
    public Object A00;
    public final int A01;

    public AnonymousClass0w4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, AnonymousClass0w4 r3) {
        AnonymousClass0E2 r32 = (AnonymousClass0E2) r3.A00;
        if (C06540Yd.A0K(r32.A09)) {
            Log.w("settings-gdrive/change-backup-encryption/media restore is running");
            r32.Bot(R.string.f11nameremoved);
            return;
        }
        Context context = view.getContext();
        int i = 3;
        if (!r32.A0E.A0G()) {
            i = 1;
        }
        r32.startActivityForResult(C627736r.A09(context, i), 0);
    }

    public static void A01(View view, AnonymousClass0w4 r3) {
        SettingsGoogleDrive settingsGoogleDrive = (SettingsGoogleDrive) r3.A00;
        if (C06540Yd.A0K(settingsGoogleDrive.A09)) {
            Log.w("settings-gdrive/change-backup-encryption/media restore is running");
            settingsGoogleDrive.Bot(R.string.f11nameremoved);
            return;
        }
        Context context = view.getContext();
        int i = 3;
        if (!settingsGoogleDrive.A0W.A0G()) {
            i = 1;
        }
        settingsGoogleDrive.startActivityForResult(C627736r.A09(context, i), 0);
    }

    public static void A02(AnonymousClass0w4 r2) {
        EncryptionKeyInputFragment encryptionKeyInputFragment = (EncryptionKeyInputFragment) r2.A00;
        encryptionKeyInputFragment.A06.A0S(5);
        BiometricAuthPlugin A012 = encryptionKeyInputFragment.A09;
        if (A012 == null || !A012.A01()) {
            encryptionKeyInputFragment.A06.A0Z(true);
        } else {
            encryptionKeyInputFragment.A09.A02();
        }
    }

    public static void A03(AnonymousClass0w4 r3) {
        EncryptionKeyInputFragment encryptionKeyInputFragment = (EncryptionKeyInputFragment) r3.A00;
        encryptionKeyInputFragment.A06.A0T(3);
        encryptionKeyInputFragment.A02.A0A(encryptionKeyInputFragment.A0R(), new Intent("android.intent.action.VIEW", encryptionKeyInputFragment.A05.A00("https://faq.whatsapp.com/general/chats/cant-remember-password-for-encrypted-backup")));
    }

    public static void A04(AnonymousClass0w4 r3) {
        RestorePasswordInputFragment restorePasswordInputFragment = (RestorePasswordInputFragment) r3.A00;
        restorePasswordInputFragment.A07.A0T(3);
        restorePasswordInputFragment.A00.A0A(restorePasswordInputFragment.A0R(), new Intent("android.intent.action.VIEW", restorePasswordInputFragment.A01.A00("https://faq.whatsapp.com/general/chats/cant-remember-password-for-encrypted-backup")));
    }

    public static void A05(AnonymousClass0w4 r2) {
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) r2.A00;
        verifyPasswordFragment.A07.A0S(5);
        if (verifyPasswordFragment.A02.A01()) {
            verifyPasswordFragment.A02.A02();
        } else {
            verifyPasswordFragment.A1S(-1);
        }
    }

    public void A07(View view) {
        int i;
        EncBackupViewModel encBackupViewModel;
        switch (this.A01) {
            case 0:
                EncryptionKeyDisplayFragment encryptionKeyDisplayFragment = (EncryptionKeyDisplayFragment) this.A00;
                encryptionKeyDisplayFragment.A01.A01.A0H(true);
                encBackupViewModel = encryptionKeyDisplayFragment.A01;
                i = 500;
                break;
            case 1:
                C06270Wx.A03(((EncryptionKeyDisplayFragment) this.A00).A01.A07, 0);
                return;
            case 2:
                ((EncBackupMainActivity) this.A00).A74();
                return;
            case 5:
                encBackupViewModel = ((EncryptionKeyDisplayFragment) this.A00).A01;
                i = 401;
                break;
            case 6:
                A02(this);
                return;
            case 7:
                A03(this);
                return;
            case 8:
                ((EncryptionKeyInputFragment) this.A00).A06.A0N();
                return;
            case 9:
                ((PasswordInputFragment) this.A00).A1K();
                return;
            case 10:
                A04(this);
                return;
            case 11:
                encBackupViewModel = ((PasswordInputFragment) this.A00).A07;
                i = 203;
                break;
            case 12:
                A05(this);
                return;
            case 13:
                A00(view, this);
                return;
            case 14:
                SettingsGoogleDrive settingsGoogleDrive = (SettingsGoogleDrive) this.A00;
                settingsGoogleDrive.A7C();
                settingsGoogleDrive.A7A();
                return;
            case 15:
                A01(view, this);
                return;
            default:
                EncryptionKeyInfoFragment.A00((EncryptionKeyInfoFragment) this.A00);
                return;
        }
        C06270Wx.A03(encBackupViewModel.A03, i);
    }
}
