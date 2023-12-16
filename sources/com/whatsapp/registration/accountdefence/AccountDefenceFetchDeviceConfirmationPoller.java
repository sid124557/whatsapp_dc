package com.whatsapp.registration.accountdefence;

import X.AnonymousClass001;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.AnonymousClass7LJ;
import X.C104955Sz;
import X.C15110qn;
import X.C18260x0;
import X.C54292oU;
import X.C56612sH;
import X.C56912sl;
import X.C620633i;
import X.C626936e;
import X.C70143a1;
import X.C72173dI;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class AccountDefenceFetchDeviceConfirmationPoller implements C15110qn {
    public long A00;
    public C72173dI A01;
    public final C620633i A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final AnonymousClass33p A05;
    public final C56912sl A06;
    public final AnonymousClass4FS A07;
    public final AtomicBoolean A08 = new AtomicBoolean(true);

    public synchronized void A00() {
        Log.i("FetchDeviceConfirmationPoller/onRequestComplete/stopPolling");
        this.A08.set(true);
        C72173dI r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
    }

    public final synchronized void A01(C104955Sz r7, AnonymousClass7LJ r8) {
        int i;
        if (this.A08.get()) {
            Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of app lifecycle");
        } else if (r7 == null || (i = r7.A00) == 1 || i == 13 || i == 11) {
            Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of terminal result");
        } else if (System.currentTimeMillis() - this.A00 > 900000) {
            Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of timeout");
        } else {
            C626936e.A06(r7);
            int i2 = 5000;
            if (i == 12) {
                i2 = 8000;
            }
            double d = (double) i2;
            double d2 = 0.8d * d;
            long random = (long) ((Math.random() * ((d * 1.2d) - d2)) + d2);
            C18260x0.A12("FetchDeviceConfirmationPoller/onRequestComplete/scheduleNextRequest nextDelay: ", AnonymousClass001.A0o(), random);
            this.A01.A02();
            this.A01.A04(new C70143a1(this, 14, r8), random);
        }
        A00();
    }

    public AccountDefenceFetchDeviceConfirmationPoller(C620633i r3, C56612sH r4, C54292oU r5, AnonymousClass33p r6, C56912sl r7, AnonymousClass4FS r8) {
        this.A03 = r4;
        this.A04 = r5;
        this.A07 = r8;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
    }
}
