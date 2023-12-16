package X;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Qu  reason: invalid class name and case insensitive filesystem */
public final class C67823Qu implements AnonymousClass4FA, AnonymousClass4CD {
    public long A00 = -1;
    public long A01;
    public long A02;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public Integer A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public final C55682qk A0A;
    public final C56612sH A0B;
    public final AnonymousClass33p A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass4FV A0E;
    public final XmppConnectionMetricsWorkManager A0F;
    public final AnonymousClass2X6 A0G;
    public final AtomicBoolean A0H = new AtomicBoolean();
    public final AtomicInteger A0I = new AtomicInteger();
    public final AtomicInteger A0J = new AtomicInteger();
    public final AtomicInteger A0K = new AtomicInteger();
    public final AtomicInteger A0L = new AtomicInteger();
    public final AnonymousClass66R A0M = C154517dI.A01(new C79863xJ(this));
    public final AnonymousClass66R A0N = C154517dI.A01(new C79873xK(this));
    public final AnonymousClass66R A0O = C154517dI.A01(new C79883xL(this));

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r0 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BRj(X.C56202rb r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.Integer r0 = r5.A0A
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0J
            int r0 = r1.decrementAndGet()
            if (r0 >= 0) goto L_0x0010
            r1.set(r3)
        L_0x0010:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A0I
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x0040
            r2.set(r3)
        L_0x001b:
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A01 = r0
        L_0x0021:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppConnectionMetrics/onDuplicateStanzaRemoved incoming stanza duplicate incoming:"
            r1.append(r0)
            int r0 = r2.get()
            r1.append(r0)
            java.lang.String r0 = " unacked_offline:"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0J
            int r0 = r0.get()
            X.C18260x0.A1G(r1, r0)
            return
        L_0x0040:
            if (r0 > 0) goto L_0x0021
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67823Qu.BRj(X.2rb):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r0 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bc2(X.C56202rb r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.Integer r0 = r5.A0A
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0J
            int r0 = r1.decrementAndGet()
            if (r0 >= 0) goto L_0x0010
            r1.set(r3)
        L_0x0010:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A0I
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x0040
            r2.set(r3)
        L_0x001b:
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A01 = r0
        L_0x0021:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppConnectionMetrics/onStanzaAcked incoming stanza processing finished incoming=:"
            r1.append(r0)
            int r0 = r2.get()
            r1.append(r0)
            java.lang.String r0 = " unacked_offline=:"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0J
            int r0 = r0.get()
            X.C18260x0.A1G(r1, r0)
            return
        L_0x0040:
            if (r0 > 0) goto L_0x0021
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67823Qu.Bc2(X.2rb):void");
    }

    public final long A00(String str, long j) {
        if (j == -1) {
            return 0;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - j);
        AnonymousClass4FV r3 = this.A0E;
        C24591Xz r2 = new C24591Xz();
        r2.A02 = str;
        r2.A00 = Long.valueOf(seconds);
        r3.Bh7(r2, (AnonymousClass5ZC) null, false);
        return seconds;
    }

    public final void A02() {
        long A002 = A00("xmpp-combined-worker-time", this.A03);
        this.A03 = -1;
        AnonymousClass33p r5 = this.A0C;
        C18260x0.A0M(r5, "xmpp:combined_worker_runtime_seconds", A002 + AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r5), "xmpp:combined_worker_runtime_seconds"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r0 <= 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r2 = r3.A0K
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x0023
            r0 = 0
            r2.set(r0)
        L_0x000c:
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.A02 = r0
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppConnectionMetrics outgoing stanza processing finished counter:"
            r1.append(r0)
            int r0 = r2.get()
            X.C18260x0.A1G(r1, r0)
            return
        L_0x0023:
            if (r0 > 0) goto L_0x0012
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67823Qu.A03():void");
    }

    public final void A04() {
        if (this.A0D.A0Y(C58422vE.A02, 3206)) {
            this.A0F.A01();
        }
    }

    public final void A06(Integer num) {
        AnonymousClass1VX r6 = this.A0D;
        C58422vE r5 = C58422vE.A02;
        if (r6.A0Y(r5, 3206) && Build.VERSION.SDK_INT >= 29) {
            if ((num != null && num.intValue() == 1) || !r6.A0Y(r5, 4966)) {
                AtomicInteger atomicInteger = this.A0L;
                if (atomicInteger.incrementAndGet() == 1 || this.A06 != null) {
                    A04();
                }
                AnonymousClass66R r3 = this.A0N;
                Handler A0A2 = AnonymousClass0x9.A0A(r3);
                AnonymousClass66R r1 = this.A0O;
                A0A2.removeCallbacks((Runnable) r1.getValue());
                AnonymousClass0x9.A0A(r3).postDelayed((Runnable) r1.getValue(), AnonymousClass3ZP.A00(AnonymousClass2AC.A00(C373321v.SECONDS, r6.A0O(r5, 4965))));
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("XmppConnectionMetrics push processing started counter:");
                C18260x0.A1G(A0o, atomicInteger.get());
            }
        }
    }

    public final boolean A07() {
        if (this.A0I.get() > 0 || this.A0K.get() > 0 || this.A0L.get() > 0 || this.A0H.get()) {
            return true;
        }
        return false;
    }

    public final boolean A08(long j) {
        if (!this.A0H.get()) {
            if (this.A0I.get() > 0 && SystemClock.uptimeMillis() - this.A01 >= j) {
                return true;
            }
            if (this.A0K.get() <= 0 || SystemClock.uptimeMillis() - this.A02 < j) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A09(String str) {
        if (this.A00 == -1) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass4FV r6 = this.A0E;
        C24591Xz r5 = new C24591Xz();
        r5.A02 = str;
        r5.A00 = C18320x8.A0Y(TimeUnit.MILLISECONDS, elapsedRealtime - this.A00);
        r6.Bh7(r5, (AnonymousClass5ZC) null, false);
        return true;
    }

    public void BMV() {
        this.A00 = -1;
    }

    public void BRG() {
        int i;
        if (C18270x1.A1V(this.A0M) && (i = this.A0J.get()) > 0) {
            C18270x1.A0h(C18270x1.A03(this.A0C), "unacked_offline_stanzas_count_while_disconnected", i);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XmppConnectionMetrics/onDisconnect all incoming stanza processing finished incoming:");
        AtomicInteger atomicInteger = this.A0I;
        A0o.append(atomicInteger.get());
        A0o.append(" unacked_offline:");
        AtomicInteger atomicInteger2 = this.A0J;
        A0o.append(atomicInteger2.get());
        A0o.append(" offlineResume: {");
        AtomicBoolean atomicBoolean = this.A0H;
        A0o.append(atomicBoolean.get());
        C18260x0.A1L(A0o, "}; ");
        atomicInteger.set(0);
        atomicInteger2.set(0);
        atomicBoolean.set(false);
    }

    public /* synthetic */ void Bc3(C56202rb r1) {
    }

    public void Bc4(C56202rb r4) {
        if (r4.A0A != null) {
            this.A0J.incrementAndGet();
        }
        AtomicInteger atomicInteger = this.A0I;
        if (atomicInteger.incrementAndGet() == 1 || this.A06 != null) {
            A04();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XmppConnectionMetrics/onStanzaReceived incoming stanza processing started incoming=:");
        A0o.append(atomicInteger.get());
        A0o.append(" unacked_offline=:");
        C18260x0.A1G(A0o, this.A0J.get());
    }

    public C67823Qu(C55682qk r3, C56612sH r4, AnonymousClass33p r5, AnonymousClass1VX r6, AnonymousClass4FV r7, XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager, AnonymousClass2X6 r9) {
        C18260x0.A0f(r4, r7, xmppConnectionMetricsWorkManager, r6, r3);
        C18260x0.A0U(r9, r5);
        this.A0B = r4;
        this.A0E = r7;
        this.A0F = xmppConnectionMetricsWorkManager;
        this.A0D = r6;
        this.A0A = r3;
        this.A0G = r9;
        this.A0C = r5;
    }

    public final String A01() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("incoming count: ");
        A0o.append(this.A0I.get());
        A0o.append("; outgoing count: ");
        A0o.append(this.A0K.get());
        A0o.append("; pushes count: ");
        A0o.append(this.A0L.get());
        A0o.append("; offlineResume: {");
        A0o.append(this.A0H.get());
        A0o.append("}; ");
        Integer num = this.A06;
        if (num != null) {
            str = AnonymousClass000.A0Y("Failed with reason: ", AnonymousClass001.A0o(), num.intValue());
        } else {
            str = null;
        }
        return AnonymousClass000.A0X(str, A0o);
    }

    public final void A05(int i) {
        this.A06 = Integer.valueOf(i);
        if (i == 3) {
            this.A0K.set(0);
            this.A0I.set(0);
        }
        C18260x0.A0y("XmppConnectionMetrics/reportLastWorkerFailed with reason: ", AnonymousClass001.A0o(), i);
    }

    public void onAppBackgrounded() {
        this.A00 = SystemClock.elapsedRealtime();
        this.A08 = false;
        this.A09 = false;
        AnonymousClass1VX r2 = this.A0D;
        C58422vE r1 = C58422vE.A02;
        if (!r2.A0Y(r1, 4027) && r2.A0Y(r1, 3206)) {
            this.A0F.A03(true);
        }
    }
}
