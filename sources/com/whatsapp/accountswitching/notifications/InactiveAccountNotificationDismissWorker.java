package com.whatsapp.accountswitching.notifications;

import X.AnonymousClass0Xq;
import X.AnonymousClass30A;
import X.C01410Ap;
import X.C03070Is;
import X.C107695bk;
import X.C162457s7;
import X.C175738Zn;
import X.C18260x0;
import X.C389229y;
import X.C47822ds;
import X.C53892nq;
import X.C56612sH;
import X.C620633i;
import X.C626936e;
import X.C64333Db;
import android.app.NotificationManager;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class InactiveAccountNotificationDismissWorker extends Worker {
    public final C64333Db A00;
    public final C47822ds A01;
    public final AnonymousClass30A A02;
    public final C620633i A03;
    public final C56612sH A04;

    public C03070Is A0C() {
        AnonymousClass0Xq r4 = this.A01.A01;
        int A022 = r4.A02("inactiveAccountNotificationId", -1);
        String A032 = r4.A03("inactiveAccountNotificationTag");
        if (!(A022 == -1 || A032 == null || C175738Zn.A0V(A032))) {
            NotificationManager A0A = this.A03.A0A();
            C626936e.A06(A0A);
            A0A.cancel(A032, A022);
            Log.i("InactiveAccountNotificationDismissWorker/doWork/call notification cancelled");
            String A033 = r4.A03("inactiveAccountNotificationLid");
            String A034 = r4.A03("inactiveAccountNotificationCallId");
            if (!(A033 == null || A033.length() == 0 || A034 == null || A034.length() == 0)) {
                this.A01.A01(A033, A034);
                AnonymousClass30A r42 = this.A02;
                Log.i("InactiveAccountNotificationManager/showCallNotifications");
                C53892nq A035 = r42.A01.A03(A033);
                if (A035 != null) {
                    Log.i("InactiveAccountNotificationManager/showCallNotifications");
                    r42.A03(A035, true, false);
                }
            }
        }
        return new C01410Ap();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InactiveAccountNotificationDismissWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        Context applicationContext = context.getApplicationContext();
        C162457s7.A0D(applicationContext);
        C64333Db A012 = C389229y.A01(applicationContext);
        this.A00 = A012;
        this.A04 = A012.Bqh();
        this.A03 = C64333Db.A2o(A012);
        C107695bk r1 = A012.AcK.A00;
        this.A01 = (C47822ds) r1.A6E.get();
        this.A02 = (AnonymousClass30A) r1.A6C.get();
    }
}
