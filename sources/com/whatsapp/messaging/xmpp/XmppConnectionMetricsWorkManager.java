package com.whatsapp.messaging.xmpp;

import X.AnonymousClass0Aw;
import X.AnonymousClass0FO;
import X.AnonymousClass0Q9;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass485;
import X.AnonymousClass4C6;
import X.AnonymousClass4GP;
import X.AnonymousClass66R;
import X.C02320Fs;
import X.C119795xY;
import X.C119805xZ;
import X.C154517dI;
import X.C18260x0;
import X.C18270x1;
import X.C18320x8;
import X.C34171uL;
import X.C58422vE;
import X.C616131n;
import X.C72333dY;
import X.C73853gB;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import android.os.Build;

public final class XmppConnectionMetricsWorkManager implements AnonymousClass485 {
    public AnonymousClass4GP A00;
    public final AnonymousClass1VX A01;
    public final C34171uL A02;
    public final AnonymousClass66R A03 = C154517dI.A01(new C119795xY(this));
    public final AnonymousClass66R A04 = C154517dI.A01(new C119805xZ(this));
    public final C73853gB A05;
    public volatile C85474Gj A06;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C06310Xb r7, java.lang.String r8, X.C84814Du r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C73943gK
            if (r0 == 0) goto L_0x0069
            r5 = r9
            X.3gK r5 = (X.C73943gK) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r5.label
            r0 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 != r0) goto L_0x006f
            X.C57682u2.A01(r2)
        L_0x0020:
            X.C162457s7.A0G(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = X.C73723fy.A04(r2)
            return r0
        L_0x002a:
            X.C57682u2.A01(r2)
            X.8yc r3 = r7.A04(r8)
            X.C162457s7.A0D(r3)
            r5.label = r0
            boolean r0 = r3.isDone()     // Catch:{ ExecutionException -> 0x007b }
            if (r0 == 0) goto L_0x004a
            r1 = 0
        L_0x003d:
            java.lang.Object r2 = r3.get()     // Catch:{ InterruptedException -> 0x0042, all -> 0x0074 }
            goto L_0x0044
        L_0x0042:
            r1 = 1
            goto L_0x003d
        L_0x0044:
            if (r1 == 0) goto L_0x0066
            X.C18300x5.A11()     // Catch:{ ExecutionException -> 0x007b }
            goto L_0x0066
        L_0x004a:
            X.46G r2 = X.C57702u4.A04(r5)
            r0 = 11
            X.3a3 r1 = new X.3a3
            r1.<init>(r3, r0, r2)
            X.59V r0 = X.AnonymousClass59V.A01
            r3.AwV(r1, r0)
            X.8Yb r0 = new X.8Yb
            r0.<init>(r3)
            r2.BGs(r0)
            java.lang.Object r2 = r2.A06()
        L_0x0066:
            if (r2 != r4) goto L_0x0020
            return r4
        L_0x0069:
            X.3gK r5 = new X.3gK
            r5.<init>(r6, r9)
            goto L_0x0012
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0074:
            r0 = move-exception
            if (r1 == 0) goto L_0x007a
            X.C18300x5.A11()     // Catch:{ ExecutionException -> 0x007b }
        L_0x007a:
            throw r0     // Catch:{ ExecutionException -> 0x007b }
        L_0x007b:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            X.C162457s7.A0H(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager.A00(X.0Xb, java.lang.String, X.4Du):java.lang.Object");
    }

    public void A01() {
        Class cls;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (C18270x1.A1V(this.A04)) {
                AnonymousClass4GP r0 = this.A00;
                if (r0 != null) {
                    r0.invoke();
                }
                cls = XmppProcessingAndLogoutWorker.class;
            } else {
                cls = XmppLifecycleWorker.class;
            }
            AnonymousClass0Aw r1 = new AnonymousClass0Aw(cls);
            if (i >= 31) {
                r1.A05(AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            }
            r1.A04(C18270x1.A07());
            C72333dY.A01(this.A02).A07(C02320Fs.KEEP, AnonymousClass0x9.A0I(r1), "xmpp-lifecycle-worker");
        }
    }

    public final void A02() {
        AnonymousClass0Aw r2 = new AnonymousClass0Aw(XmppLogoutWorker.class);
        if (Build.VERSION.SDK_INT >= 31) {
            r2.A05(AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        }
        r2.A04(C18270x1.A07());
        C72333dY.A01(this.A02).A07(C02320Fs.REPLACE, AnonymousClass0x9.A0I(r2), "xmpp-logout-worker");
    }

    public void A03(boolean z) {
        if (Build.VERSION.SDK_INT >= 29 && this.A01.A0Y(C58422vE.A01, 3531)) {
            if (C18270x1.A1V(this.A04)) {
                AnonymousClass0Aw r4 = new AnonymousClass0Aw(XmppProcessingAndLogoutWorker.class);
                if (Build.VERSION.SDK_INT >= 31) {
                    r4.A05(AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
                }
                r4.A04(C18270x1.A07());
                AnonymousClass0Q9 r3 = new AnonymousClass0Q9();
                r3.A00.put("SKIP_PROCESSING", true);
                C18320x8.A1A(r3, r4);
                C72333dY.A01(this.A02).A07(C02320Fs.KEEP, AnonymousClass0x9.A0I(r4), "xmpp-lifecycle-worker");
            } else if (!z) {
                A02();
            } else if (this.A06 == null) {
                this.A06 = C616131n.A02((C85494Gl) null, new XmppConnectionMetricsWorkManager$startLogoutWork$1(this, (C84814Du) null), (AnonymousClass4C6) this.A03.getValue(), (AnonymousClass20D) null, 3);
            }
        }
    }

    public XmppConnectionMetricsWorkManager(AnonymousClass1VX r2, C34171uL r3, C73853gB r4) {
        C18260x0.A0Q(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r4;
    }
}
