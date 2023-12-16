package X;

import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.util.TimerTask;

/* renamed from: X.0o1  reason: invalid class name and case insensitive filesystem */
public class C13960o1 extends TimerTask {
    public final /* synthetic */ AnonymousClass0F4 A00;

    public C13960o1(AnonymousClass0F4 r1) {
        this.A00 = r1;
    }

    public static /* synthetic */ void A00(C13960o1 r1) {
        Log.i("restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/taking-too-long");
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r1.A00.A09.get();
        if (restoreFromBackupActivity != null) {
            restoreFromBackupActivity.A7J();
        }
    }

    public void run() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/not-finished-in-");
        AnonymousClass0F4 r4 = this.A00;
        A0o.append(r4.A08.A06() / 1000);
        Log.i(AnonymousClass000.A0X("-seconds", A0o));
        r4.A00.A0S(new C11380jY(this));
    }
}
