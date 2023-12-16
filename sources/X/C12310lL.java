package X;

import android.os.Bundle;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

/* renamed from: X.0lL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12310lL implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ RestoreFromBackupActivity A01;

    public final void run() {
        this.A01.A7l(this.A00.getLong("total_download_size", -1), this.A00.getLong("media_download_size", -1));
    }

    public /* synthetic */ C12310lL(Bundle bundle, RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A01 = restoreFromBackupActivity;
        this.A00 = bundle;
    }
}
