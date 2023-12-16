package X;

import android.content.Context;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.FileManager;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.Proxies;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2pr  reason: invalid class name and case insensitive filesystem */
public class C55142pr {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass31B A04;
    public final C55682qk A05;
    public final C620633i A06;
    public final C56612sH A07;
    public final C56102rQ A08;
    public final AnonymousClass1VW A09;
    public final AnonymousClass4FV A0A;
    public final AnonymousClass33K A0B;
    public final AnonymousClass4FS A0C;
    public final AnonymousClass2BY A0D;
    public final JniBridge A0E;
    public final AnonymousClass2XE A0F;
    public final C41002Io A0G;

    public synchronized void A00() {
        if (this.A02) {
            JniBridge jniBridge = this.A0E;
            JniBridge.jvidispatchI();
            Log.d("wamsys/JniBridge java -> wamsys crossing for WAJContextDeinit");
            JniBridge.jvidispatchIO(0, C18300x5.A0I(jniBridge));
            this.A02 = false;
        }
    }

    public synchronized void A01(Context context) {
        if (!this.A00) {
            Log.i("WaMsysSetup/bootstrap");
            synchronized (com.facebook.msys.mci.Log.class) {
                AnonymousClass0RZ.A01("registerLogger");
                try {
                    if (!com.facebook.msys.mci.Log.sRegistered) {
                        com.facebook.msys.mci.Log.registerLoggerNative(823, 5, false);
                        com.facebook.msys.mci.Log.setLogLevel(3);
                        com.facebook.msys.mci.Log.sRegistered = true;
                    }
                } finally {
                    AnonymousClass0RZ.A00();
                }
            }
            Proxies.configure(new ProxyProvider(new AnonymousClass2JC(new AnonymousClass4KJ(this, 0), new AnonymousClass4KJ(this, 1))));
            Execution.initialize();
            FileManager.initialize(context.getCacheDir());
            AtomicReference atomicReference = this.A0E.wajContext;
            Log.d("wamsys/JniBridge java -> wamsys crossing for WAJContextInit");
            NativeHolder nativeHolder = (NativeHolder) atomicReference.getAndSet(JniBridge.jvidispatchO(0));
            if (nativeHolder != null) {
                nativeHolder.release();
            }
            this.A00 = true;
        }
    }

    public final synchronized void A02(Context context, C56492s4 r13, C55132pq r14, AnonymousClass3FI r15, AnonymousClass4FS r16) {
        NotificationCenter notificationCenter;
        if (!this.A03) {
            C41002Io r3 = this.A0G;
            NotificationCenter notificationCenter2 = new NotificationCenter();
            synchronized (r3) {
                try {
                    C626936e.A06(notificationCenter2);
                    r3.A00 = notificationCenter2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            AnonymousClass3FI r8 = r15;
            String A002 = r15.A00();
            synchronized (r3) {
                C626936e.A06(r3.A00);
                notificationCenter = r3.A00;
            }
            C56492s4 r4 = r13;
            NetworkSession networkSession = new NetworkSession(A002, notificationCenter, new C63773Ap(r4, this.A09, this.A0B, r14, r8, r16, context.getCacheDir()));
            AnonymousClass2XE r1 = this.A0F;
            synchronized (r1) {
                try {
                    C626936e.A06(networkSession);
                    r1.A00 = networkSession;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            this.A03 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0085, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03(X.C56492s4 r18, X.C54292oU r19, X.AnonymousClass33p r20, X.C620733j r21, X.C55132pq r22, X.AnonymousClass3FI r23, X.AnonymousClass4FS r24, java.lang.String r25) {
        /*
            r17 = this;
            r8 = r17
            monitor-enter(r8)
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
            boolean r0 = r8.A02     // Catch:{ all -> 0x0091 }
            r3 = 1
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/already bootstrapped, skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
            goto L_0x0084
        L_0x0013:
            r0 = r19
            android.content.Context r9 = r0.A00     // Catch:{ all -> 0x0091 }
            r8.A01(r9)     // Catch:{ all -> 0x0091 }
            r10 = r18
            r11 = r22
            r12 = r23
            r13 = r24
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0091 }
            com.whatsapp.wamsys.JniBridge r6 = r8.A0E     // Catch:{ all -> 0x0091 }
            X.2XE r0 = r8.A0F     // Catch:{ all -> 0x0091 }
            com.facebook.msys.mci.NetworkSession r1 = r0.A00()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "wamsys/JniBridge java -> wamsys crossing for WAJContextInitWCRManager"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
            com.facebook.simplejni.NativeHolder r0 = X.C18300x5.A0I(r6)     // Catch:{ all -> 0x0091 }
            r7 = 0
            long r4 = com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r7, r1, r0)     // Catch:{ all -> 0x0091 }
            r1 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0086
            java.lang.String r12 = r21.A07()     // Catch:{ all -> 0x0091 }
            java.lang.String r13 = r21.A06()     // Catch:{ all -> 0x0091 }
            java.lang.String r15 = r20.A0Y()     // Catch:{ all -> 0x0091 }
            long r10 = (long) r3     // Catch:{ all -> 0x0091 }
            com.facebook.simplejni.NativeHolder r16 = X.C18300x5.A0I(r6)     // Catch:{ all -> 0x0091 }
            r14 = r25
            com.whatsapp.wamsys.JniBridge.jvidispatchIIOOOOO(r10, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0091 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0091 }
            r1 = 6
            com.facebook.simplejni.NativeHolder r0 = X.C18300x5.A0I(r6)     // Catch:{ all -> 0x0091 }
            com.whatsapp.wamsys.JniBridge.jvidispatchIOO(r1, r9, r0)     // Catch:{ all -> 0x0091 }
            X.1Xz r2 = new X.1Xz     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0091 }
            X.C24591Xz.A00(r2, r0, r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "sha-prepare-dispatch"
            r2.A02 = r0     // Catch:{ all -> 0x0091 }
            X.4FV r0 = r8.A0A     // Catch:{ all -> 0x0091 }
            r0.BhD(r2)     // Catch:{ all -> 0x0091 }
            com.facebook.msys.mci.JsonSerialization.initialize()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
            r8.A02 = r3     // Catch:{ all -> 0x0091 }
        L_0x0084:
            monitor-exit(r8)
            return r3
        L_0x0086:
            X.2qk r2 = r8.A05     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "WCRManager init failure"
            java.lang.String r0 = "WaMsysSetup/bootstrapForReg/failed to initialize WCRManager"
            r2.A0A(r1, r3, r0)     // Catch:{ all -> 0x0091 }
            monitor-exit(r8)
            return r7
        L_0x0091:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55142pr.A03(X.2s4, X.2oU, X.33p, X.33j, X.2pq, X.3FI, X.4FS, java.lang.String):boolean");
    }

    public C55142pr(AnonymousClass31B r1, C55682qk r2, C620633i r3, C56612sH r4, C56102rQ r5, AnonymousClass1VW r6, AnonymousClass4FV r7, AnonymousClass33K r8, AnonymousClass4FS r9, AnonymousClass2BY r10, JniBridge jniBridge, AnonymousClass2XE r12, C41002Io r13) {
        this.A07 = r4;
        this.A05 = r2;
        this.A0C = r9;
        this.A0E = jniBridge;
        this.A0A = r7;
        this.A04 = r1;
        this.A0B = r8;
        this.A06 = r3;
        this.A0D = r10;
        this.A09 = r6;
        this.A08 = r5;
        this.A0F = r12;
        this.A0G = r13;
    }
}
