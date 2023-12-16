package X;

import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

/* renamed from: X.0mB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12820mB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserRecoverableAuthException A01;
    public final /* synthetic */ RestoreFromBackupActivity A02;

    public final void run() {
        this.A02.A0x(this.A01, this.A00);
    }

    public /* synthetic */ C12820mB(UserRecoverableAuthException userRecoverableAuthException, RestoreFromBackupActivity restoreFromBackupActivity, int i) {
        this.A02 = restoreFromBackupActivity;
        this.A01 = userRecoverableAuthException;
        this.A00 = i;
    }
}
