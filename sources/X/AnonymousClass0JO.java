package X;

import android.os.Build;
import com.whatsapp.backup.google.workers.BackupGpbSignalWorker;
import com.whatsapp.util.Log;

/* renamed from: X.0JO  reason: invalid class name */
public final class AnonymousClass0JO {
    public static final void A00(AnonymousClass0U8 r6, AnonymousClass33p r7, AnonymousClass1VX r8, C34171uL r9) {
        C162457s7.A0J(r8, 0);
        C162457s7.A0J(r9, 1);
        C162457s7.A0J(r7, 2);
        C162457s7.A0J(r6, 3);
        boolean A0E = C06520Ya.A0E(r7);
        boolean z = r6.A01().getBoolean("send_gpb_signal", false);
        boolean z2 = true;
        boolean z3 = !C06520Ya.A09(r6, r8);
        switch (r7.A07()) {
            case 11:
            case 12:
            case 20:
            case 21:
            case 25:
            case 28:
            case 29:
            case 30:
            case 31:
                z2 = false;
                break;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupGpbSignalWorker/enqueueUniqueWork shouldRun = ");
        A0o.append(A0E);
        A0o.append(" & ");
        A0o.append(z);
        A0o.append(" & ");
        A0o.append(z3);
        Log.i(AnonymousClass000.A0b(" & ", A0o, z2));
        if (A0E && z && z3 && z2) {
            AnonymousClass0Aw r3 = new AnonymousClass0Aw(BackupGpbSignalWorker.class);
            r3.A04(new AnonymousClass0XS(C02380Fy.CONNECTED, 254));
            if (Build.VERSION.SDK_INT >= 31) {
                r3.A05(AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            }
            ((C06310Xb) r9.get()).A07(C02320Fs.KEEP, (C01460Ay) r3.A00(), "BackupGpbSignalWorker");
        }
    }
}
