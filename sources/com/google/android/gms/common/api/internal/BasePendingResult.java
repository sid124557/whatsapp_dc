package com.google.android.gms.common.api.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass3B2;
import X.AnonymousClass6Qy;
import X.AnonymousClass6SN;
import X.AnonymousClass6VW;
import X.AnonymousClass6XJ;
import X.AnonymousClass6XK;
import X.AnonymousClass6YQ;
import X.AnonymousClass7BO;
import X.AnonymousClass89E;
import X.AnonymousClass8B9;
import X.AnonymousClass8BA;
import X.C127076Qn;
import X.C127086Qo;
import X.C127176Qx;
import X.C127236Re;
import X.C128976Ye;
import X.C128986Yf;
import X.C150317Qd;
import X.C159087l6;
import X.C162177rO;
import X.C169918Bd;
import X.C173848Rx;
import X.C180818lg;
import X.C180828lh;
import X.C18290x4;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult extends C150317Qd {
    public static final ThreadLocal A0D = new C173848Rx();
    public C180828lh A00;
    public Status A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass6VW A05;
    public final Object A06;
    public final WeakReference A07;
    public final ArrayList A08;
    public final CountDownLatch A09;
    public final AtomicReference A0A;
    public volatile AnonymousClass89E A0B;
    public volatile boolean A0C;

    public final C180828lh A01() {
        C180828lh r2;
        synchronized (this.A06) {
            C162177rO.A04("Result has already been consumed.", !this.A0C);
            C162177rO.A04("Result is not ready.", AnonymousClass000.A1T((this.A09.getCount() > 0 ? 1 : (this.A09.getCount() == 0 ? 0 : -1))));
            r2 = this.A00;
            this.A00 = null;
            this.A0C = true;
        }
        AnonymousClass7BO r0 = (AnonymousClass7BO) this.A0A.getAndSet((Object) null);
        if (r0 != null) {
            r0.A00.A01.remove(this);
        }
        C162177rO.A02(r2);
        return r2;
    }

    public C180828lh A02(Status status) {
        if (this instanceof AnonymousClass6Qy) {
            return ((AnonymousClass6Qy) this).A00;
        }
        if (!(this instanceof C127176Qx)) {
            if (this instanceof C128976Ye) {
                return new AnonymousClass3B2(status, AnonymousClass001.A0s());
            }
            if (this instanceof C128986Yf) {
                return new C169918Bd(status, -1);
            }
            if (this instanceof AnonymousClass6XJ) {
                return new AnonymousClass8BA(status, (AnonymousClass6SN) null);
            }
            if (this instanceof AnonymousClass6XK) {
                return new AnonymousClass8B9(status, (C127236Re) null);
            }
            boolean z = this instanceof AnonymousClass6YQ;
        }
        return status;
    }

    public void A03() {
        synchronized (this.A06) {
            if (!this.A02 && !this.A0C) {
                this.A02 = true;
                A06(A02(Status.A05));
            }
        }
    }

    public final void A04() {
        boolean z = true;
        if (!this.A04 && !AnonymousClass001.A1Z(A0D.get())) {
            z = false;
        }
        this.A04 = z;
    }

    public final void A05(C180828lh r7) {
        synchronized (this.A06) {
            if (!this.A03 && !this.A02) {
                CountDownLatch countDownLatch = this.A09;
                countDownLatch.getCount();
                C162177rO.A04("Results have already been set", !AnonymousClass000.A1T((countDownLatch.getCount() > 0 ? 1 : (countDownLatch.getCount() == 0 ? 0 : -1))));
                C162177rO.A04("Result has already been consumed", !this.A0C);
                A06(r7);
            }
        }
    }

    public final void A06(C180828lh r6) {
        this.A00 = r6;
        this.A01 = r6.BDK();
        this.A09.countDown();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C180818lg) arrayList.get(i)).BPP(this.A01);
        }
        arrayList.clear();
    }

    @Deprecated
    public final void A07(Status status) {
        synchronized (this.A06) {
            if (!AnonymousClass000.A1T((this.A09.getCount() > 0 ? 1 : (this.A09.getCount() == 0 ? 0 : -1)))) {
                A05(A02(status));
                this.A03 = true;
            }
        }
    }

    public BasePendingResult(C159087l6 r3) {
        Looper mainLooper;
        this.A06 = AnonymousClass002.A0D();
        this.A09 = C18290x4.A14();
        this.A08 = AnonymousClass001.A0s();
        this.A0A = new AtomicReference();
        this.A04 = false;
        if (r3 == null) {
            mainLooper = Looper.getMainLooper();
        } else if (r3 instanceof C127076Qn) {
            mainLooper = ((C127076Qn) r3).A00.A02;
        } else {
            mainLooper = ((C127086Qo) r3).A06;
        }
        this.A05 = new AnonymousClass6VW(mainLooper);
        this.A07 = AnonymousClass0x9.A14(r3);
    }

    @Deprecated
    public BasePendingResult() {
        this.A06 = AnonymousClass002.A0D();
        this.A09 = C18290x4.A14();
        this.A08 = AnonymousClass001.A0s();
        this.A0A = new AtomicReference();
        this.A04 = false;
        this.A05 = new AnonymousClass6VW(Looper.getMainLooper());
        this.A07 = AnonymousClass0x9.A14((Object) null);
    }
}
