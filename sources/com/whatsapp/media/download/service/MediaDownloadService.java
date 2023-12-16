package com.whatsapp.media.download.service;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass33T;
import X.AnonymousClass4FS;
import X.AnonymousClass5VI;
import X.AnonymousClass5ZU;
import X.C05610Ue;
import X.C117995sp;
import X.C18260x0;
import X.C18280x3;
import X.C18320x8;
import X.C183538qC;
import X.C18400xH;
import X.C30471mV;
import X.C32451qQ;
import X.C54292oU;
import X.C620133d;
import X.C624735e;
import X.C627736r;
import X.C64333Db;
import X.C64773Ex;
import X.C66553Lw;
import X.C72173dI;
import X.C72333dY;
import X.C84134Bd;
import X.C86274Jm;
import X.C95814uZ;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class MediaDownloadService extends C32451qQ {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;
    public C54292oU A02;
    public C620133d A03;
    public C72173dI A04;
    public AnonymousClass4FS A05;
    public C84134Bd A06;
    public boolean A07 = false;
    public boolean A08;
    public final C183538qC A09 = C72333dY.A06(new C117995sp());

    public MediaDownloadService() {
        super("media-download-service", true);
    }

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = C18400xH.A00(this);
            this.A02 = C64333Db.A2q(A002);
            this.A05 = C64333Db.A8y(A002);
            this.A00 = C64333Db.A26(A002);
            this.A01 = C64333Db.A28(A002);
            this.A03 = (C620133d) A002.AJf.get();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.i("media-download-service/onCreate");
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("media-download-service/onDestroy");
        C84134Bd r1 = this.A06;
        if (r1 != null) {
            this.A03.A0B.A03(r1);
            this.A06 = null;
        }
        stopForeground(true);
        super.onDestroy();
    }

    public final void A03(String str, String str2, ArrayList arrayList, int i) {
        C30471mV r5;
        C95814uZ r1;
        C05610Ue A012 = C66553Lw.A01(this);
        A012.A0K = "sending_media@1";
        A012.A0J = "progress";
        A012.A05(System.currentTimeMillis());
        A012.A0C(str);
        A012.A0B(str);
        A012.A0A(str2);
        boolean z = false;
        if (!(arrayList == null || (r5 = (C30471mV) arrayList.get(0)) == null || (r1 = r5.A1J.A00) == null)) {
            Intent A0N = C627736r.A0N(this, this.A00.A0A(r1));
            AnonymousClass5VI.A01(A0N, "MediaDownloadService");
            A012.A09 = C624735e.A00(this, 5, A0N, 134217728);
            int i2 = (int) C30471mV.A00(r5).A0C;
            if (i2 >= 0) {
                if (arrayList.size() > 1) {
                    z = true;
                }
                A012.A03(100, i2, z);
            }
        }
        AnonymousClass33T.A02(A012, 17301633);
        A02(A012.A01(), (Integer) null, i, 232614008);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("media-download-service/onStartCommand:");
        A0o.append(intent);
        A0o.append("; startId: ");
        A0o.append(i2);
        A0o.append(" largeMediaDownloadsInProgress=");
        C18260x0.A1V(A0o, this.A08);
        if (intent != null) {
            if (C18280x3.A1V(intent, "com.whatsapp.media.download.service.MediaDownloadService.DOWNLOAD_STARTED")) {
                this.A08 = true;
            } else if (C18280x3.A1V(intent, "com.whatsapp.media.download.service.MediaDownloadService.DOWNLOADS_COMPLETED")) {
                this.A08 = false;
            }
        }
        String A0a = C18320x8.A0a(this);
        Resources resources = getResources();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, 1, 0);
        A03(A0a, resources.getQuantityString(R.plurals.f9nameremoved, 1, objArr), (ArrayList) null, i2);
        if (!this.A08) {
            this.A01.A01(this.A02.A00, MediaDownloadService.class);
            return 2;
        } else if (this.A06 != null) {
            return 2;
        } else {
            this.A06 = new C86274Jm(this, i2, 1);
            C72173dI r2 = this.A04;
            if (r2 == null) {
                r2 = new C72173dI(this.A05, false);
                this.A04 = r2;
            }
            C620133d r0 = this.A03;
            r0.A0B.A04(this.A06, r2);
            return 2;
        }
    }
}
