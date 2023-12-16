package com.whatsapp.privacy.protocol.xmpp;

import X.AnonymousClass0H7;
import X.AnonymousClass0PW;
import X.AnonymousClass0QH;
import X.AnonymousClass28C;
import X.AnonymousClass31C;
import X.C107385bE;
import X.C130066bK;
import X.C188268yc;
import X.C389229y;
import X.C44592Wq;
import X.C56612sH;
import X.C64333Db;
import X.C86544Kn;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class DisclosureMetadataGetWorker extends AnonymousClass0QH {
    public final Context A00;
    public final C56612sH A01;
    public final AnonymousClass31C A02;
    public final C44592Wq A03;

    public C188268yc A09() {
        return AnonymousClass0H7.A00(new C86544Kn(this, 1));
    }

    public C188268yc A08() {
        Notification A002;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || i < 23 || (A002 = AnonymousClass28C.A00(this.A00)) == null) {
            return super.A08();
        }
        C130066bK r3 = new C130066bK();
        r3.A05(new AnonymousClass0PW(59, A002, C107385bE.A07() ? 1 : 0));
        return r3;
    }

    public DisclosureMetadataGetWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("disclosureremetadatagetworker/hilt");
        this.A00 = context;
        C64333Db A012 = C389229y.A01(context);
        this.A01 = A012.Bqh();
        this.A02 = A012.BLC();
        this.A03 = (C44592Wq) A012.A8U.get();
    }
}
