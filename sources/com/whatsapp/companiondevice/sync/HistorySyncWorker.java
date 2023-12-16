package com.whatsapp.companiondevice.sync;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0PW;
import X.AnonymousClass0QH;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2FQ;
import X.AnonymousClass33G;
import X.AnonymousClass33T;
import X.AnonymousClass4FS;
import X.C05610Ue;
import X.C107385bE;
import X.C130066bK;
import X.C18260x0;
import X.C18290x4;
import X.C188268yc;
import X.C29441ip;
import X.C389229y;
import X.C46382bX;
import X.C54292oU;
import X.C55802qw;
import X.C57112t6;
import X.C614330s;
import X.C624735e;
import X.C64333Db;
import X.C66553Lw;
import X.C69963Zi;
import X.C70193a6;
import X.C70343aL;
import X.C71723cZ;
import X.C84134Bd;
import X.C86044Ip;
import X.C86234Ji;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class HistorySyncWorker extends AnonymousClass0QH {
    public C71723cZ A00;
    public C84134Bd A01;
    public Map A02 = Collections.emptyMap();
    public boolean A03 = false;
    public final C130066bK A04 = new C130066bK();
    public final C46382bX A05;
    public final C29441ip A06;
    public final C55802qw A07;
    public final AnonymousClass1VX A08;
    public final C614330s A09;
    public final AnonymousClass4FS A0A;

    public C188268yc A08() {
        Log.i("HistorySyncWorker/getForegroundInfoAsync");
        C130066bK r2 = new C130066bK();
        C70193a6.A01(this.A0A, this, r2, 31);
        return r2;
    }

    public C188268yc A09() {
        Log.i("HistorySyncWorker/startWork");
        if (Build.VERSION.SDK_INT < 31 && this.A01 == null) {
            C86234Ji r5 = new C86234Ji(this, 8);
            this.A01 = r5;
            C55802qw r4 = this.A07;
            AnonymousClass4FS r1 = this.A0A;
            Objects.requireNonNull(r1);
            r4.A03.execute(new C70343aL(r4, r5, new C86044Ip(r1, 1), 16));
        }
        AnonymousClass1VX r42 = this.A08;
        C614330s r52 = this.A09;
        C55802qw r3 = this.A07;
        this.A00 = new C71723cZ(new AnonymousClass2FQ(this), this.A06, r3, r42, r52);
        C69963Zi.A01(this.A0A, this, 9);
        return this.A04;
    }

    public void A0A() {
        Log.i("HistorySyncWorker/onStopped");
        C84134Bd r1 = this.A01;
        if (r1 != null) {
            this.A07.A00.A03(r1);
        }
        C71723cZ r0 = this.A00;
        if (r0 != null) {
            ((AtomicBoolean) r0.A03).set(true);
        }
    }

    public final AnonymousClass0PW A0B() {
        C54292oU r6;
        String string;
        C46382bX r5 = this.A05;
        Iterator A0q = AnonymousClass000.A0q(this.A02);
        while (true) {
            if (!A0q.hasNext()) {
                r6 = r5.A01;
                string = C54292oU.A00(r6).getString(R.string.f11nameremoved);
                break;
            }
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (A0w.getValue() == Boolean.TRUE) {
                AnonymousClass33G A092 = r5.A02.A09(AnonymousClass0x9.A0R(A0w).getDevice());
                if (A092 != null) {
                    r6 = r5.A01;
                    Context context = r6.A00;
                    string = AnonymousClass002.A0F(context, AnonymousClass33G.A01(context, A092, r5.A04), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
                    break;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("HistorySyncNotificationHelper/getNotificationText companionDeviceInfo missing for ");
                C18260x0.A0n(A0w.getKey(), A0o);
            }
        }
        if (string == null) {
            string = C54292oU.A00(r6).getString(R.string.f11nameremoved);
        }
        Context context2 = r6.A00;
        C05610Ue A002 = C66553Lw.A00(context2);
        A002.A09 = C624735e.A00(context2, 0, C57112t6.A01(context2, 3), 0);
        A002.A03 = C18290x4.A17();
        A002.A0C(string);
        A002.A0A(string);
        AnonymousClass33T.A02(A002, R.drawable.notify_web_client_connected);
        return new AnonymousClass0PW(232614029, A002.A01(), C107385bE.A07() ? 1 : 0);
    }

    public final void A0C() {
        if (Build.VERSION.SDK_INT < 31 && !this.A03) {
            Log.d("HistorySyncWorker/publishNotification");
            synchronized (this) {
                if (this.A03) {
                    Log.w("HistorySyncWorker/publishNotification skip setForegroundAsync");
                } else {
                    try {
                        A07(A0B());
                    } catch (IllegalStateException unused) {
                        Log.w("HistorySyncWorker/publishNotification cannot start foreground notification in background");
                    }
                }
            }
        }
    }

    public HistorySyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A08 = C64333Db.A4B(A012);
        this.A0A = A012.BsP();
        this.A09 = (C614330s) A012.AH8.get();
        this.A07 = (C55802qw) A012.ALH.get();
        this.A06 = A012.AzX();
        this.A05 = (C46382bX) A012.AcK.A00.A61.get();
    }
}
