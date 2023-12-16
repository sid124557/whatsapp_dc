package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

/* renamed from: X.0Z4  reason: invalid class name */
public class AnonymousClass0Z4 implements ServiceConnection {
    public final /* synthetic */ RestoreFromBackupActivity A00;

    public AnonymousClass0Z4(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A00 = restoreFromBackupActivity;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A00;
        restoreFromBackupActivity.A0w.set(true);
        restoreFromBackupActivity.A0n.open();
        restoreFromBackupActivity.A0J.A01(restoreFromBackupActivity.A0q);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A00;
        restoreFromBackupActivity.A0k = false;
        if (!restoreFromBackupActivity.A0w.compareAndSet(true, false)) {
            restoreFromBackupActivity.A0J.A02(restoreFromBackupActivity.A0q);
            restoreFromBackupActivity.A0n.close();
        }
    }
}
