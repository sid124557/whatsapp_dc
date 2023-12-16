package com.whatsapp.networkresources;

import X.AnonymousClass0Xq;
import X.AnonymousClass2VT;
import X.C01400Ao;
import X.C01410Ap;
import X.C03070Is;
import X.C18260x0;
import X.C18290x4;
import X.C389229y;
import X.C626936e;
import X.C83974An;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.IOException;

public class NetworkResourceDownloadWorker extends Worker implements C83974An {
    public final AnonymousClass2VT A00;

    public C03070Is A0C() {
        AnonymousClass0Xq r1 = this.A01.A01;
        String A03 = r1.A03("resource_id");
        C626936e.A06(A03);
        String A032 = r1.A03("resource_filename");
        StringBuilder A0u = C18290x4.A0u(A032);
        A0u.append("NetworkResourceDownloadWorker/Downloading/");
        A0u.append(A03);
        C18260x0.A0q("/name/", A032, A0u);
        try {
            this.A00.A00(this, A03, A032).A00();
            return new C01410Ap();
        } catch (IOException unused) {
            return new C01400Ao();
        }
    }

    public NetworkResourceDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = (AnonymousClass2VT) C389229y.A00(context).AcK.A00.A4K.get();
    }

    public boolean BHR() {
        return this.A03;
    }
}
