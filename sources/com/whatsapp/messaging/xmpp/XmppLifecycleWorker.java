package com.whatsapp.messaging.xmpp;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass2C4;
import X.AnonymousClass46Q;
import X.C18260x0;
import X.C29171iO;
import X.C389229y;
import X.C55682qk;
import X.C56612sH;
import X.C615931l;
import X.C64333Db;
import X.C67823Qu;
import X.C73853gB;
import X.C84814Du;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class XmppLifecycleWorker extends CoroutineWorker {
    public final C29171iO A00;
    public final C55682qk A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final XmppConnectionMetricsWorkManager A04;
    public final C67823Qu A05;
    public final C73853gB A06;

    public Object A0C(C84814Du r2) {
        throw AnonymousClass001.A0e("XmppLifecycleWorker is not supposed to run in foreground");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0D(X.C84814Du r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C74233gn
            if (r0 == 0) goto L_0x0022
            r5 = r8
            X.3gn r5 = (X.C74233gn) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r6 = r5.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r4) goto L_0x0028
            java.lang.Object r3 = r5.L$0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r3 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r3
            goto L_0x004d
        L_0x0022:
            X.3gn r5 = new X.3gn
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r6 = X.AnonymousClass001.A0d()
            throw r6
        L_0x002d:
            X.C57682u2.A01(r6)
            X.3Qu r2 = r7.A05     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            r2.A04 = r0     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            X.3gB r2 = r7.A06     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            r1 = 0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker$doWork$2 r0 = new com.whatsapp.messaging.xmpp.XmppLifecycleWorker$doWork$2     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            r0.<init>(r7, r1)     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            r5.L$0 = r7     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            r5.label = r4     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            java.lang.Object r6 = X.C616131n.A00(r5, r2, r0)     // Catch:{ CancellationException -> 0x0094, Exception -> 0x008b, all -> 0x0088 }
            if (r6 != r3) goto L_0x004b
            return r3
        L_0x004b:
            r3 = r7
            goto L_0x0050
        L_0x004d:
            X.C57682u2.A01(r6)     // Catch:{ CancellationException -> 0x0086, Exception -> 0x0084 }
        L_0x0050:
            X.0Is r6 = (X.C03070Is) r6     // Catch:{ CancellationException -> 0x0086, Exception -> 0x0084 }
            X.1iO r0 = r3.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "XmppLifecycleWorker/schedule logout timer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r1 = r3.A04
            r0 = 0
            r1.A03(r0)
        L_0x0063:
            X.3Qu r5 = r3.A05
            long r1 = r5.A04
            java.lang.String r0 = "xmpp-lifecycle-time"
            long r3 = r5.A00(r0, r1)
            r0 = -1
            r5.A05 = r0
            X.33p r5 = r5.A0C
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)
            java.lang.String r2 = "xmpp:lifecycle_worker_runtime_seconds"
            long r0 = X.AnonymousClass0x2.A0B(r0, r2)
            long r3 = r3 + r0
            X.C18260x0.A0M(r5, r2, r3)
            return r6
        L_0x0084:
            r2 = move-exception
            goto L_0x008d
        L_0x0086:
            r1 = move-exception
            goto L_0x0096
        L_0x0088:
            r6 = move-exception
            r3 = r7
            goto L_0x009d
        L_0x008b:
            r2 = move-exception
            r3 = r7
        L_0x008d:
            r1 = 2
            X.3Qu r0 = r3.A05     // Catch:{ all -> 0x009c }
            r0.A05(r1)     // Catch:{ all -> 0x009c }
            throw r2     // Catch:{ all -> 0x009c }
        L_0x0094:
            r1 = move-exception
            r3 = r7
        L_0x0096:
            X.3Qu r0 = r3.A05     // Catch:{ all -> 0x009c }
            r0.A05(r4)     // Catch:{ all -> 0x009c }
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r6 = move-exception
        L_0x009d:
            X.1iO r0 = r3.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "XmppLifecycleWorker/schedule logout timer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r1 = r3.A04
            r0 = 0
            r1.A03(r0)
        L_0x00ae:
            X.3Qu r5 = r3.A05
            long r1 = r5.A04
            java.lang.String r0 = "xmpp-lifecycle-time"
            long r3 = r5.A00(r0, r1)
            r0 = -1
            r5.A05 = r0
            X.33p r5 = r5.A0C
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r5)
            java.lang.String r2 = "xmpp:lifecycle_worker_runtime_seconds"
            long r0 = X.AnonymousClass0x2.A0B(r0, r2)
            long r3 = r3 + r0
            X.C18260x0.A0M(r5, r2, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppLifecycleWorker.A0D(X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(X.C84814Du r29) {
        /*
            r28 = this;
            r3 = r29
            boolean r0 = r3 instanceof X.C74673hV
            r6 = r28
            if (r0 == 0) goto L_0x0217
            r8 = r3
            X.3hV r8 = (X.C74673hV) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0217
            int r2 = r2 - r1
            r8.label = r2
        L_0x0016:
            java.lang.Object r1 = r8.result
            X.218 r20 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L_0x0170
            if (r0 != r7) goto L_0x021e
            int r0 = r8.I$0
            r19 = r0
            long r14 = r8.J$1
            long r2 = r8.J$0
            boolean r0 = r8.Z$0
            r18 = r0
            java.lang.Object r6 = r8.L$0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r6 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r6
            X.C57682u2.A01(r1)
        L_0x0034:
            r21 = r2
            X.3Qu r0 = r6.A05
            r27 = r0
            boolean r0 = r27.A07()
            if (r0 == 0) goto L_0x0154
            if (r18 != 0) goto L_0x008c
            r0 = r19
            if (r0 != r7) goto L_0x008c
            X.21v r0 = X.C373321v.SECONDS
            long r4 = X.AnonymousClass2AC.A00(r0, r7)
            long r11 = X.AnonymousClass3ZP.A00
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x013c
            long r9 = X.AnonymousClass3ZP.A01
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x013c
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            int r0 = (int) r2
            r1 = r0 & 1
            int r0 = (int) r4
            r0 = r0 & 1
            if (r1 != r0) goto L_0x00eb
            long r21 = r2 >> r7
            long r4 = r4 >> r7
            long r21 = r21 + r4
            if (r1 != 0) goto L_0x00c9
            r4 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r0 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            X.45l r9 = new X.45l
            r9.<init>(r4, r0)
            long r0 = r9.A00
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 > 0) goto L_0x00c2
            long r0 = r9.A01
            int r4 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x00c2
        L_0x008a:
            long r21 = r21 << r7
        L_0x008c:
            long r0 = X.AnonymousClass3ZP.A00(r21)
            r4 = r27
            boolean r0 = r4.A08(r0)
            if (r0 == 0) goto L_0x0154
            X.1VX r4 = r6.A03
            r1 = 5409(0x1521, float:7.58E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = "XmppLifecycleWorker/doWork seems like stanzas stuck"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2qk r3 = r6.A01
            java.lang.String r2 = r27.A01()
            java.lang.String r1 = "xmpp-lifecycle-worker-stuck-stanza"
            r0 = 0
            r3.A0A(r1, r0, r2)
            r1 = 3
            r0 = r27
            r0.A05(r1)
        L_0x00bc:
            X.0Ao r0 = new X.0Ao
            r0.<init>()
            return r0
        L_0x00c2:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r21 = r21 / r0
            goto L_0x0130
        L_0x00c9:
            r4 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r0 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            X.45l r9 = new X.45l
            r9.<init>(r4, r0)
            long r0 = r9.A00
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 > 0) goto L_0x0122
            long r0 = r9.A01
            int r4 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0122
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r21 = r21 * r0
            goto L_0x008a
        L_0x00eb:
            if (r1 != r7) goto L_0x011d
            long r21 = r2 >> r7
            long r4 = r4 >> r7
        L_0x00f0:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r16 = r4 / r0
            long r21 = r21 + r16
            r12 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r9 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            X.45l r11 = new X.45l
            r11.<init>(r12, r9)
            long r9 = r11.A00
            int r12 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r12 > 0) goto L_0x0122
            long r9 = r11.A01
            int r11 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0122
            long r16 = r16 * r0
            long r4 = r4 - r16
            long r21 = r21 * r0
            long r21 = r21 + r4
            goto L_0x008a
        L_0x011d:
            long r21 = r4 >> r7
            long r4 = r2 >> r7
            goto L_0x00f0
        L_0x0122:
            r23 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r25 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r21 = X.C175708Zk.A01(r21, r23, r25)
        L_0x0130:
            long r21 = r21 << r7
            r0 = 1
            long r21 = r21 + r0
            goto L_0x008c
        L_0x0138:
            r21 = r4
            goto L_0x008c
        L_0x013c:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0146
            long r9 = X.AnonymousClass3ZP.A01
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
        L_0x0146:
            long r4 = r4 ^ r2
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            java.lang.String r0 = "Summing infinite durations of different signs yields an undefined result."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0154:
            boolean r0 = r27.A07()
            if (r0 != 0) goto L_0x01ab
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppLifecycleWorker/work is done; is processing: "
            r1.append(r0)
            boolean r0 = r27.A07()
            X.C18260x0.A1V(r1, r0)
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            return r0
        L_0x0170:
            X.C57682u2.A01(r1)
            X.3Qu r3 = r6.A05
            boolean r18 = r3.A07()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "XmppLifecycleWorker/work started; is processing: "
            r0 = r18
            X.C18260x0.A1E(r1, r2, r0)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r0 = r6.A04
            X.1uL r0 = r0.A02
            X.0Xb r1 = X.C72333dY.A01(r0)
            java.lang.String r0 = "xmpp-logout-worker"
            r1.A0B(r0)
            r0 = 0
            r3.A06 = r0
            X.1VX r2 = r6.A03
            r1 = 3320(0xcf8, float:4.652E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r2.A0O(r0, r1)
            X.21v r0 = X.C373321v.SECONDS
            long r2 = X.AnonymousClass2AC.A00(r0, r1)
            long r14 = android.os.SystemClock.elapsedRealtime()
            r19 = 0
        L_0x01ab:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppLifecycleWorker/cycle: "
            r1.append(r0)
            int r9 = r19 + 1
            r0 = r19
            r1.append(r0)
            java.lang.String r0 = " started: "
            r1.append(r0)
            X.3Qu r5 = r6.A05
            java.lang.String r0 = r5.A01()
            X.C18260x0.A1L(r1, r0)
            long r12 = X.AnonymousClass0x7.A0E(r14)
            r10 = 300000(0x493e0, double:1.482197E-318)
            r4 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x01fc
            X.1iO r0 = r6.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01e7
            X.2qk r2 = r6.A01
            java.lang.String r1 = r5.A01()
            java.lang.String r0 = "xmpp-tracking-work"
            r2.A0A(r0, r4, r1)
        L_0x01e7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XmppLifecycleWorker/300000 milliseconds time out reached; stop the job; is processing: "
            r1.append(r0)
            boolean r0 = r5.A07()
            X.C18260x0.A1V(r1, r0)
            r5.A05(r4)
            goto L_0x00bc
        L_0x01fc:
            r8.L$0 = r6
            r0 = r18
            r8.Z$0 = r0
            r8.J$0 = r2
            r8.J$1 = r14
            r8.I$0 = r9
            r8.label = r7
            java.lang.Object r1 = X.C616231o.A01(r8, r2)
            r0 = r20
            if (r1 != r0) goto L_0x0213
            return r20
        L_0x0213:
            r19 = r9
            goto L_0x0034
        L_0x0217:
            X.3hV r8 = new X.3hV
            r8.<init>(r6, r3)
            goto L_0x0016
        L_0x021e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppLifecycleWorker.A0F(X.4Du):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLifecycleWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A05 = (C67823Qu) A012.Ac6.get();
        this.A00 = (C29171iO) A012.A0s.get();
        this.A01 = A012.Azq();
        this.A02 = A012.Bqh();
        AnonymousClass46Q r0 = AnonymousClass2C4.A00;
        C615931l.A00(r0);
        this.A06 = r0;
        this.A03 = A012.Avy();
        this.A04 = (XmppConnectionMetricsWorkManager) A012.Ac7.get();
    }
}
