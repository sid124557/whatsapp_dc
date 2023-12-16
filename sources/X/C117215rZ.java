package X;

import android.util.SparseIntArray;
import com.whatsapp.util.Log;

/* renamed from: X.5rZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117215rZ implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C106125Xs A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        C106125Xs r7 = this.A01;
        long j = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        AnonymousClass33p r4 = r7.A09;
        r4.A13(5);
        C18270x1.A03(r4).putLong("ext_dir_migration_rescan_time", AnonymousClass0x7.A0E(j)).commit();
        r7.A03((SparseIntArray) null, 1);
        r4.A1n(z);
        Log.d("externaldirmigration/external dir rescanned");
        if (z2) {
            r7.A0A.A03("ExternalDirMigration");
        }
    }

    public /* synthetic */ C117215rZ(C106125Xs r1, long j, boolean z, boolean z2) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = z;
        this.A03 = z2;
    }
}
