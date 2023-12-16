package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.0ED  reason: invalid class name */
public class AnonymousClass0ED extends C10210hZ {
    public int A00 = -1;
    public final /* synthetic */ RestoreFromBackupActivity A01;

    public void BWc(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        int A0F = AnonymousClass001.A0F(j, j2);
        if (A0F - this.A00 > 0) {
            this.A00 = A0F;
            if (A0F % 10 == 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("restore>RestoreFromBackupActivity/observer/msgstore download progress:");
                A0o.append(j);
                A0o.append("/");
                A0o.append(j2);
                AnonymousClass001.A1L(A0o);
                A0o.append(A0F);
                Log.i(AnonymousClass000.A0X("%", A0o));
            }
            this.A01.A05.A0S(new C13030mW(this, A0F, j3, j4));
        }
    }

    public AnonymousClass0ED(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A01 = restoreFromBackupActivity;
    }

    public static /* synthetic */ void A01(AnonymousClass0ED r1) {
        r1.A01.A05.setIndeterminate(false);
        Log.i("restore>RestoreFromBackupActivity/observer/msgstore download started");
    }

    public static /* synthetic */ void A02(AnonymousClass0ED r5, int i, long j, long j2) {
        RestoreFromBackupActivity restoreFromBackupActivity = r5.A01;
        if (!restoreFromBackupActivity.A80()) {
            restoreFromBackupActivity.A05.setIndeterminate(false);
            restoreFromBackupActivity.A05.setProgress(i);
            AnonymousClass001.A0y(restoreFromBackupActivity, restoreFromBackupActivity.A08, new Object[]{AnonymousClass35V.A04(restoreFromBackupActivity.A00, j), AnonymousClass35V.A04(restoreFromBackupActivity.A00, j2), AnonymousClass001.A0l(restoreFromBackupActivity.A00.A0N(), i)}, R.string.f11nameremoved);
            return;
        }
        Log.i("restore>RestoreFromBackupActivity/observer/activity exited during msgstore download progress");
    }

    public static /* synthetic */ void A03(AnonymousClass0ED r2, boolean z) {
        RestoreFromBackupActivity restoreFromBackupActivity = r2.A01;
        if (!restoreFromBackupActivity.A80()) {
            restoreFromBackupActivity.A05.setProgress(100);
            restoreFromBackupActivity.A05.setIndeterminate(true);
            restoreFromBackupActivity.A08.setText(R.string.f11nameremoved);
            restoreFromBackupActivity.A7s(z);
            return;
        }
        Log.i("restore>RestoreFromBackupActivity/observer/activity exited during finishing msgstore download");
    }

    public void BSS(int i, Bundle bundle) {
        if (i != 10) {
            Log.i(AnonymousClass0YV.A0C("restore>RestoreFromBackupActivity/observer/error during msgstore download: ", AnonymousClass001.A0o(), i));
        }
        this.A01.A05.A0S(new C12830mC(bundle, this, i));
    }

    public void BWb(boolean z) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A01;
        int A07 = restoreFromBackupActivity.A09.A07();
        if (z) {
            Log.i("restore>RestoreFromBackupActivity/observer/msgstore download successful");
        } else {
            Log.e(AnonymousClass0YV.A0C("restore>RestoreFromBackupActivity/observer/msgstore download failed with ", AnonymousClass001.A0o(), A07));
        }
        if (A07 == 10) {
            restoreFromBackupActivity.A05.A0S(new C12350lP(this, z));
        }
    }

    public void BWd() {
        this.A01.A05.A0S(new C11630jx(this));
    }
}
