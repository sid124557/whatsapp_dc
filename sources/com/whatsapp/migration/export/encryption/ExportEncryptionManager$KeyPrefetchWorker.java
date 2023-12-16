package com.whatsapp.migration.export.encryption;

import X.C01390An;
import X.C01410Ap;
import X.C03070Is;
import X.C389229y;
import X.C55462qO;
import X.C55682qk;
import X.C64333Db;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class ExportEncryptionManager$KeyPrefetchWorker extends Worker {
    public final C55682qk A00;
    public final C55462qO A01;

    public C03070Is A0C() {
        try {
            this.A01.A02(new CancellationSignal());
            return new C01410Ap();
        } catch (Exception e) {
            this.A00.A09("xpm-export-prefetch-key", e.toString(), e);
            return new C01390An();
        }
    }

    public ExportEncryptionManager$KeyPrefetchWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C64333Db A002 = C389229y.A00(context);
        this.A00 = A002.Azq();
        this.A01 = (C55462qO) A002.A9Q.get();
    }
}
