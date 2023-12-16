package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass0H7;
import X.AnonymousClass0QH;
import X.AnonymousClass31C;
import X.C188268yc;
import X.C389229y;
import X.C44592Wq;
import X.C56612sH;
import X.C64333Db;
import X.C86544Kn;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class DisclosureGetStageByIdsWorker extends AnonymousClass0QH {
    public final C56612sH A00;
    public final AnonymousClass31C A01;
    public final C44592Wq A02;

    public C188268yc A09() {
        return AnonymousClass0H7.A00(new C86544Kn(this, 0));
    }

    public DisclosureGetStageByIdsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("disclosurergetstagebyidsworker/hilt");
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Bqh();
        this.A01 = A012.BLC();
        this.A02 = (C44592Wq) A012.A8U.get();
    }
}
