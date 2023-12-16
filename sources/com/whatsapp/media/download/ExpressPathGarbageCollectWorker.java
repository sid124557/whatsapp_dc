package com.whatsapp.media.download;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Xq;
import X.AnonymousClass2YR;
import X.C01400Ao;
import X.C01410Ap;
import X.C03070Is;
import X.C18260x0;
import X.C389229y;
import X.C627536m;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class ExpressPathGarbageCollectWorker extends Worker {
    public final AnonymousClass2YR A00;

    public C03070Is A0C() {
        String str;
        AnonymousClass0Xq r3 = this.A01.A01;
        String A03 = r3.A03("file_path");
        if (A03 == null) {
            str = "expressPathGarbageCollectWorker/doWork file path is null";
        } else {
            C18260x0.A0q("expressPathGarbageCollectWorker/doWork start to clean up file ", A03, AnonymousClass001.A0o());
            if (C627536m.A0O(AnonymousClass002.A0B(A03))) {
                C18260x0.A0q("expressPathGarbageCollectWorker/doWork successfully remove file ", A03, AnonymousClass001.A0o());
            }
            String A032 = r3.A03("end_hash");
            if (A032 == null) {
                str = "expressPathGarbageCollectWorker/doWork encrypted file hash is null";
            } else {
                if (this.A00.A00(A032)) {
                    return new C01410Ap();
                }
                return new C01400Ao();
            }
        }
        Log.e(str);
        return new C01400Ao();
    }

    public ExpressPathGarbageCollectWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = C389229y.A01(context).AoB();
    }
}
