package com.whatsapp.stickers.stickerpack;

import X.C01410Ap;
import X.C03070Is;
import X.C18260x0;
import X.C389229y;
import X.C47262cy;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class FetchDownloadableStickerPackWorker extends Worker {
    public final C47262cy A00;

    public C03070Is A0C() {
        Log.d("fetchdownloadablestickerpackworker/dowork Start to check sticker store data");
        this.A00.A00();
        return new C01410Ap();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchDownloadableStickerPackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        this.A00 = C389229y.A01(context).Ar5();
    }
}
