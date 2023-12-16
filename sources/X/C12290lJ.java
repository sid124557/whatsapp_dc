package X;

import android.accounts.AccountManagerFuture;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

/* renamed from: X.0lJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12290lJ implements Runnable {
    public final /* synthetic */ AccountManagerFuture A00;
    public final /* synthetic */ RestoreFromBackupActivity A01;

    public final void run() {
        this.A01.A0t(this.A00);
    }

    public /* synthetic */ C12290lJ(AccountManagerFuture accountManagerFuture, RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A01 = restoreFromBackupActivity;
        this.A00 = accountManagerFuture;
    }
}
