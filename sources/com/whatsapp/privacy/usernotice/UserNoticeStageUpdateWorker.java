package com.whatsapp.privacy.usernotice;

import X.AnonymousClass0H7;
import X.AnonymousClass0QH;
import X.AnonymousClass31C;
import X.AnonymousClass33X;
import X.C188268yc;
import X.C389229y;
import X.C51922kb;
import X.C64333Db;
import X.C86544Kn;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class UserNoticeStageUpdateWorker extends AnonymousClass0QH {
    public final AnonymousClass31C A00;
    public final C51922kb A01;
    public final AnonymousClass33X A02;

    public C188268yc A09() {
        return AnonymousClass0H7.A00(new C86544Kn(this, 4));
    }

    public UserNoticeStageUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("usernoticestageupdate/hilt");
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.BLC();
        this.A01 = (C51922kb) A012.AZZ.get();
        this.A02 = (AnonymousClass33X) A012.AZa.get();
    }
}
