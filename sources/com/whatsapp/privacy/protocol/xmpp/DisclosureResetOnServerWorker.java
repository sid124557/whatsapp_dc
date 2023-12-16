package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass0H7;
import X.AnonymousClass0QH;
import X.AnonymousClass31C;
import X.C188268yc;
import X.C389229y;
import X.C86544Kn;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class DisclosureResetOnServerWorker extends AnonymousClass0QH {
    public final AnonymousClass31C A00;

    public C188268yc A09() {
        return AnonymousClass0H7.A00(new C86544Kn(this, 2));
    }

    public DisclosureResetOnServerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("DisclosureResetOnServerWorker/hilt");
        this.A00 = C389229y.A01(context).BLC();
    }
}
