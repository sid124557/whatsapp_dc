package com.whatsapp.privacy.usernotice;

import X.AnonymousClass0Xq;
import X.AnonymousClass33K;
import X.AnonymousClass3PZ;
import X.AnonymousClass4GL;
import X.C01390An;
import X.C01400Ao;
import X.C01410Ap;
import X.C03070Is;
import X.C18290x4;
import X.C18310x6;
import X.C389229y;
import X.C51922kb;
import X.C55132pq;
import X.C56492s4;
import X.C623034m;
import X.C64333Db;
import android.content.Context;
import android.net.TrafficStats;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Map;

public class UserNoticeIconWorker extends Worker {
    public final C56492s4 A00;
    public final AnonymousClass33K A01;
    public final C623034m A02;
    public final C51922kb A03;
    public final C55132pq A04;

    public C03070Is A0C() {
        String[] strArr;
        String[] strArr2;
        C03070Is r0;
        AnonymousClass4GL A012;
        WorkerParameters workerParameters = this.A01;
        AnonymousClass0Xq r1 = workerParameters.A01;
        int A022 = r1.A02("notice_id", -1);
        Map map = r1.A00;
        Object obj = map.get("file_name_list");
        if (obj instanceof String[]) {
            strArr = (String[]) obj;
        } else {
            strArr = null;
        }
        Object obj2 = map.get("url_list");
        if (obj2 instanceof String[]) {
            strArr2 = (String[]) obj2;
        } else {
            strArr2 = null;
        }
        if (A022 == -1 || strArr == null || strArr2 == null || workerParameters.A00 > 4) {
            this.A03.A02(C18290x4.A0b());
            return new C01400Ao();
        }
        TrafficStats.setThreadStatsTag(16);
        int i = 0;
        while (i < strArr2.length) {
            try {
                A012 = this.A01.A01(this.A04, strArr2[i], (String) null);
                if (((AnonymousClass3PZ) A012).A01.getResponseCode() != 200) {
                    this.A03.A02(C18290x4.A0b());
                    r0 = new C01400Ao();
                } else {
                    if (!this.A02.A08(C18310x6.A0b(this.A00, A012, (Integer) null, 27), strArr[i], A022)) {
                        r0 = new C01390An();
                    } else {
                        A012.close();
                        TrafficStats.clearThreadStatsTag();
                        i++;
                    }
                }
                A012.close();
            } catch (IOException e) {
                try {
                    Log.e("UserNoticeContentWorker/doWork/fetch failed ", e);
                    this.A03.A02(C18290x4.A0b());
                    r0 = new C01400Ao();
                } catch (Throwable th) {
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            TrafficStats.clearThreadStatsTag();
            return r0;
        }
        return new C01410Ap();
        throw th;
    }

    public UserNoticeIconWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("usernoticeicon/hilt");
        C64333Db A002 = C389229y.A00(context);
        this.A00 = A002.Bq6();
        this.A03 = (C51922kb) A002.AZZ.get();
        this.A04 = (C55132pq) A002.AU8.get();
        this.A01 = (AnonymousClass33K) A002.AaW.get();
        this.A02 = (C623034m) A002.AZX.get();
    }
}
