package com.whatsapp.service;

import X.AnonymousClass000;
import X.AnonymousClass0BT;
import X.AnonymousClass0QH;
import X.C01410Ap;
import X.C188268yc;
import X.C1898893a;
import X.C29411im;
import X.C29441ip;
import X.C389229y;
import X.C625635p;
import X.C64333Db;
import X.C66523Lt;
import X.C69263Wi;
import X.C70143a1;
import X.C71283br;
import android.content.Context;
import android.os.Handler;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

public class RestoreChatConnectionWorker extends AnonymousClass0QH {
    public final Handler A00 = AnonymousClass000.A0A();
    public final AnonymousClass0BT A01 = new AnonymousClass0BT();
    public final C69263Wi A02;
    public final C29411im A03;
    public final C29441ip A04;
    public final C66523Lt A05;

    public C188268yc A09() {
        Log.d("RestoreChatConnectionWorker/doWork start");
        C29411im r3 = this.A03;
        if (AnonymousClass000.A1U(r3.A04, 2)) {
            Log.i("RestoreChatConnectionWorker/doWork nothing to do");
            AnonymousClass0BT r1 = this.A01;
            r1.A09(new C01410Ap());
            return r1;
        }
        C1898893a r2 = new C1898893a(this, 1);
        r3.A06(r2);
        AnonymousClass0BT r5 = this.A01;
        C70143a1 r12 = new C70143a1(this, 36, r2);
        Executor executor = this.A02.A08;
        r5.AwV(r12, executor);
        C71283br r32 = new C71283br((Object) this, 36);
        this.A00.postDelayed(r32, C625635p.A0L);
        r5.AwV(new C70143a1(this, 35, r32), executor);
        this.A05.A0D((String) null, (String) null, 0, false, true, false, false, false, this.A04.A0G());
        return r5;
    }

    public void A0A() {
        Log.d("RestoreChatConnectionWorker stopped");
        this.A01.cancel(true);
    }

    public RestoreChatConnectionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("restorechatconnection/hilt");
        C64333Db A012 = C389229y.A01(context);
        this.A02 = C64333Db.A04(A012);
        this.A05 = (C66523Lt) A012.ASB.get();
        this.A03 = A012.Bso();
        this.A04 = A012.AzX();
    }
}
