package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass0H7;
import X.AnonymousClass0QH;
import X.AnonymousClass31C;
import X.C188268yc;
import X.C389229y;
import X.C56372rs;
import X.C64333Db;
import X.C86544Kn;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class DisclosureResultSendWorker extends AnonymousClass0QH {
    public final AnonymousClass31C A00;
    public final C56372rs A01;

    public C188268yc A09() {
        return AnonymousClass0H7.A00(new C86544Kn(this, 3));
    }

    public DisclosureResultSendWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("disclosureresultsendworker/hilt");
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.BLC();
        this.A01 = (C56372rs) A012.ARP.get();
    }
}
