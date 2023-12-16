package X;

import com.google.android.gms.common.api.ApiException;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.7kf  reason: invalid class name and case insensitive filesystem */
public final class C158857kf {
    public C178938iL A00;
    public final C29441ip A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final AnonymousClass33p A04;
    public final C47922e3 A05;
    public final AnonymousClass1VW A06;
    public final C49572gk A07;

    public C158857kf(C29441ip r2, C56612sH r3, C54292oU r4, AnonymousClass33p r5, C47922e3 r6, AnonymousClass1VW r7, C49572gk r8) {
        C18260x0.A0a(r3, r7, r5, 1);
        C162457s7.A0J(r2, 5);
        C162457s7.A0J(r4, 6);
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r8;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void A02(X.C184428ro r15, java.lang.String r16) {
        /*
            r14 = this;
            r13 = r14
            monitor-enter(r13)
            r0 = 1
            r2 = r16
            X.C162457s7.A0J(r2, r0)     // Catch:{ all -> 0x0181 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "GPIA_PREPARE_CALL_"
            r1.append(r0)     // Catch:{ all -> 0x0181 }
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = r2.toUpperCase(r0)     // Catch:{ all -> 0x0181 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0181 }
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0181 }
            X.2gk r4 = r14.A07     // Catch:{ all -> 0x0181 }
            r4.A00(r5)     // Catch:{ all -> 0x0181 }
            boolean r0 = r14.A04()     // Catch:{ Exception -> 0x016b }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "GPIA prepare() not called because it's already prepared"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = "_PREPARED"
            r4.A01(r5, r0)     // Catch:{ Exception -> 0x016b }
            if (r15 == 0) goto L_0x017f
            r15.onSuccess()     // Catch:{ Exception -> 0x016b }
            goto L_0x017f
        L_0x003a:
            X.1ip r0 = r14.A01     // Catch:{ Exception -> 0x016b }
            boolean r0 = r0.A0F()     // Catch:{ Exception -> 0x016b }
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "GPIA prepare() not called because of no internet access"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = "_NONETWORK"
            r4.A01(r5, r0)     // Catch:{ Exception -> 0x016b }
            if (r15 == 0) goto L_0x017f
            goto L_0x0091
        L_0x004f:
            X.2sH r2 = r14.A02     // Catch:{ Exception -> 0x016b }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016b }
            long r0 = r2.A03     // Catch:{ Exception -> 0x016b }
            long r11 = r11 - r0
            X.33p r7 = r14.A04     // Catch:{ Exception -> 0x016b }
            X.8qC r10 = r7.A01     // Catch:{ Exception -> 0x016b }
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r10)     // Catch:{ Exception -> 0x016b }
            java.lang.String r6 = "pref_last_gpia_prepare_call_timestamp"
            long r0 = X.AnonymousClass0x2.A0B(r0, r6)     // Catch:{ Exception -> 0x016b }
            long r11 = r11 - r0
            r8 = 60000(0xea60, double:2.9644E-319)
            r3 = 1
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r10)     // Catch:{ Exception -> 0x016b }
            java.lang.String r3 = "pref_gpia_prepare_call_count_in_last_interval"
            r0 = 0
            int r1 = r1.getInt(r3, r0)     // Catch:{ Exception -> 0x016b }
            r0 = 5
            if (r1 < r0) goto L_0x009d
            java.lang.String r0 = "GPIA prepare() not called because of too many attempts in the last minute"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = "_TOOMANY"
            r4.A01(r5, r0)     // Catch:{ Exception -> 0x016b }
            if (r15 == 0) goto L_0x017f
            r0 = 1002(0x3ea, float:1.404E-42)
            X.24J r1 = new X.24J     // Catch:{ Exception -> 0x016b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x016b }
            goto L_0x0098
        L_0x0091:
            r0 = 1001(0x3e9, float:1.403E-42)
            X.24J r1 = new X.24J     // Catch:{ Exception -> 0x016b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x016b }
        L_0x0098:
            r15.onFailure(r1)     // Catch:{ Exception -> 0x016b }
            goto L_0x017f
        L_0x009d:
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r7)     // Catch:{ Exception -> 0x016b }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)     // Catch:{ Exception -> 0x016b }
            goto L_0x00b2
        L_0x00a8:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r7)     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = "pref_gpia_prepare_call_count_in_last_interval"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r3)     // Catch:{ Exception -> 0x016b }
        L_0x00b2:
            r0.apply()     // Catch:{ Exception -> 0x016b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016b }
            long r2 = r2.A03     // Catch:{ Exception -> 0x016b }
            long r0 = r0 - r2
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r7)     // Catch:{ Exception -> 0x016b }
            X.C18270x1.A0i(r2, r6, r0)     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = "Calling GPIA prepare() now"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ Exception -> 0x016b }
            X.2oU r0 = r14.A03     // Catch:{ Exception -> 0x016b }
            android.content.Context r2 = r0.A00     // Catch:{ Exception -> 0x016b }
            java.lang.Class<X.70e> r1 = X.C1441370e.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x016b }
            X.7OV r0 = X.C1441370e.A00     // Catch:{ all -> 0x0168 }
            if (r0 != 0) goto L_0x00e1
            android.content.Context r0 = r2.getApplicationContext()     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x00da
            r2 = r0
        L_0x00da:
            X.7OV r0 = new X.7OV     // Catch:{ all -> 0x0168 }
            r0.<init>(r2)     // Catch:{ all -> 0x0168 }
            X.C1441370e.A00 = r0     // Catch:{ all -> 0x0168 }
        L_0x00e1:
            monitor-exit(r1)     // Catch:{ Exception -> 0x016b }
            X.8mV r0 = r0.A05     // Catch:{ Exception -> 0x016b }
            java.lang.Object r7 = r0.Avs()     // Catch:{ Exception -> 0x016b }
            X.8iM r7 = (X.C178948iM) r7     // Catch:{ Exception -> 0x016b }
            X.C162457s7.A0D(r7)     // Catch:{ Exception -> 0x016b }
            r0 = 293955441834(0x44711c14aa, double:1.452332852183E-312)
            r3 = 1
            r2 = 0
            X.6Za r6 = new X.6Za     // Catch:{ Exception -> 0x016b }
            r6.<init>()     // Catch:{ Exception -> 0x016b }
            X.8C7 r7 = (X.AnonymousClass8C7) r7     // Catch:{ Exception -> 0x016b }
            X.7K2 r10 = r7.A00     // Catch:{ Exception -> 0x016b }
            X.7ki r8 = r10.A00     // Catch:{ Exception -> 0x016b }
            if (r8 != 0) goto L_0x0140
            r1 = -2
            X.6QX r0 = new X.6QX     // Catch:{ Exception -> 0x016b }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x016b }
            X.6YV r9 = new X.6YV     // Catch:{ Exception -> 0x016b }
            r9.<init>()     // Catch:{ Exception -> 0x016b }
            r9.A03(r0)     // Catch:{ Exception -> 0x016b }
        L_0x010f:
            X.8BV r8 = new X.8BV     // Catch:{ Exception -> 0x016b }
            r8.<init>(r6, r7)     // Catch:{ Exception -> 0x016b }
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD     // Catch:{ Exception -> 0x016b }
            X.6YV r3 = new X.6YV     // Catch:{ Exception -> 0x016b }
            r3.<init>()     // Catch:{ Exception -> 0x016b }
            X.7WE r1 = r9.A03     // Catch:{ Exception -> 0x016b }
            X.8BK r0 = new X.8BK     // Catch:{ Exception -> 0x016b }
            r0.<init>(r8, r3, r2)     // Catch:{ Exception -> 0x016b }
            r1.A01(r0)     // Catch:{ Exception -> 0x016b }
            r9.A02()     // Catch:{ Exception -> 0x016b }
            X.8Yt r2 = new X.8Yt     // Catch:{ Exception -> 0x016b }
            r2.<init>(r15, r14, r5)     // Catch:{ Exception -> 0x016b }
            r1 = 2
            X.93X r0 = new X.93X     // Catch:{ Exception -> 0x016b }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x016b }
            r3.addOnSuccessListener(r0)     // Catch:{ Exception -> 0x016b }
            r1 = 1
            X.91x r0 = new X.91x     // Catch:{ Exception -> 0x016b }
            r0.<init>(r15, r14, r5, r1)     // Catch:{ Exception -> 0x016b }
            r3.addOnFailureListener(r0)     // Catch:{ Exception -> 0x016b }
            goto L_0x017f
        L_0x0140:
            X.7j6 r9 = r10.A01     // Catch:{ Exception -> 0x016b }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x016b }
            r2 = 0
            X.AnonymousClass000.A1Q(r3, r2, r0)     // Catch:{ Exception -> 0x016b }
            java.lang.String r0 = "warmUpIntegrityToken(%s)"
            r9.A02(r0, r3)     // Catch:{ Exception -> 0x016b }
            X.7Xf r3 = new X.7Xf     // Catch:{ Exception -> 0x016b }
            r3.<init>()     // Catch:{ Exception -> 0x016b }
            X.6Zn r2 = new X.6Zn     // Catch:{ Exception -> 0x016b }
            r2.<init>(r3, r3, r10)     // Catch:{ Exception -> 0x016b }
            X.7Xf r0 = r2.A00     // Catch:{ Exception -> 0x016b }
            X.6Zm r1 = new X.6Zm     // Catch:{ Exception -> 0x016b }
            r1.<init>(r0, r3, r8, r2)     // Catch:{ Exception -> 0x016b }
            android.os.Handler r0 = r8.A00()     // Catch:{ Exception -> 0x016b }
            r0.post(r1)     // Catch:{ Exception -> 0x016b }
            X.6YV r9 = r3.A00     // Catch:{ Exception -> 0x016b }
            goto L_0x010f
        L_0x0168:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x016b }
            throw r0     // Catch:{ Exception -> 0x016b }
        L_0x016b:
            r3 = move-exception
            X.2e3 r2 = r14.A05     // Catch:{ all -> 0x0181 }
            X.22M r1 = X.AnonymousClass22M.A06     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "exception_thrown"
            r2.A00(r1, r3, r0)     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "_EXCEPTION"
            r4.A01(r5, r0)     // Catch:{ all -> 0x0181 }
            if (r15 == 0) goto L_0x017f
            r15.onFailure(r3)     // Catch:{ all -> 0x0181 }
        L_0x017f:
            monitor-exit(r13)
            return
        L_0x0181:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158857kf.A02(X.8ro, java.lang.String):void");
    }

    public final synchronized void A03(C184438rp r15, String str, String str2) {
        AnonymousClass6YV r5;
        synchronized (this) {
            String str3 = str;
            String str4 = str2;
            C18260x0.A0P(str3, str4);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GPIA_TRIGGER_CALL_");
            String upperCase = str4.toUpperCase(Locale.ROOT);
            C162457s7.A0D(upperCase);
            String A0X = AnonymousClass000.A0X(upperCase, A0o);
            C49572gk r3 = this.A07;
            r3.A00(A0X);
            if (!A04()) {
                this.A05.A01(AnonymousClass22M.A07, "NULL integrityTokenProvider");
                r3.A01(A0X, "_NOTPREPARED");
                e = new AnonymousClass24J(1003);
            } else {
                try {
                    Log.d("Calling GPIA trigger() now");
                    C129076Zc r2 = new C129076Zc(str3);
                    C178938iL r1 = this.A00;
                    C162457s7.A0H(r1);
                    AnonymousClass8C6 r12 = (AnonymousClass8C6) r1;
                    C146637Ba r0 = r12.A01;
                    long j = r12.A00;
                    AnonymousClass7K2 r10 = r0.A00;
                    String str5 = r2.A00;
                    C158887ki r22 = r10.A00;
                    if (r22 == null) {
                        AnonymousClass6QX r02 = new AnonymousClass6QX((Throwable) null, -2);
                        r5 = new AnonymousClass6YV();
                        r5.A03(r02);
                    } else {
                        C157897j6 r52 = r10.A01;
                        Object[] A0L = AnonymousClass002.A0L();
                        AnonymousClass000.A1Q(A0L, 0, j);
                        r52.A02("requestExpressIntegrityToken(%s)", A0L);
                        C152017Xf r8 = new C152017Xf();
                        C129186Zo r7 = new C129186Zo(r8, r8, r10, str5, j);
                        r22.A00().post(new C129166Zm(r7.A00, r8, r22, r7));
                        r5 = r8.A00;
                    }
                    r5.addOnSuccessListener(new AnonymousClass93X(new C175548Yu(r15, this, A0X), 1));
                    r5.addOnFailureListener(new C1895991x(r15, this, A0X, 0));
                } catch (Exception e) {
                    e = e;
                    this.A05.A00(AnonymousClass22M.A07, e, "exception_thrown");
                    r3.A01(A0X, "_EXCEPTION");
                }
            }
            r15.onFailure(e);
        }
        return;
    }

    public final synchronized boolean A04() {
        return AnonymousClass000.A1W(this.A00);
    }

    public static final String A00(Exception exc) {
        ApiException apiException;
        Integer valueOf;
        if (!(exc instanceof ApiException) || (apiException = (ApiException) exc) == null || (valueOf = Integer.valueOf(apiException.mStatus.A01)) == null) {
            return "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('/');
        return AnonymousClass000.A0R(valueOf, A0o);
    }

    public final Object A01(String str, C84814Du r4) {
        AnonymousClass46G A032 = C57702u4.A03(r4);
        A02(new AnonymousClass8HJ(A032), str);
        Object A062 = A032.A06();
        if (A062 != AnonymousClass218.COROUTINE_SUSPENDED) {
            return C59022wD.A00;
        }
        return A062;
    }
}
