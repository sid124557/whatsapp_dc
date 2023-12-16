package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Lt  reason: invalid class name and case insensitive filesystem */
public class C66523Lt implements AnonymousClass485 {
    public static CountDownLatch A13 = C18290x4.A14();
    public static final long A14 = TimeUnit.MINUTES.toMillis(15);
    public static final AtomicBoolean A15 = new AtomicBoolean();
    public int A00;
    public long A01 = -1;
    public long A02 = 0;
    public long A03;
    public HandlerThread A04;
    public UserJid A05;
    public AnonymousClass2OU A06;
    public C18980yZ A07;
    public AnonymousClass4EW A08;
    public AnonymousClass30H A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public final BroadcastReceiver A0D = new AnonymousClass4HB(this, 0);
    public final Handler A0E;
    public final Handler A0F = new Handler(Looper.getMainLooper(), new AnonymousClass4IL(this, 0));
    public final C29171iO A0G;
    public final AnonymousClass31B A0H;
    public final AnonymousClass2V4 A0I;
    public final C56972sr A0J;
    public final C29411im A0K;
    public final AnonymousClass5TW A0L;
    public final C51462jr A0M;
    public final C29441ip A0N;
    public final C54392oe A0O;
    public final C50862it A0P;
    public final C620633i A0Q;
    public final C47912e2 A0R;
    public final C56612sH A0S;
    public final C54292oU A0T;
    public final AnonymousClass33T A0U;
    public final AnonymousClass1VX A0V;
    public final C56142rU A0W;
    public final C64723Er A0X;
    public final C56732sT A0Y;
    public final C48692fJ A0Z = new C48692fJ("message_handler/logged_flag/disconnected", true);
    public final C48692fJ A0a = new C48692fJ("message_handler/logged_flag/must_ignore_network_once", false);
    public final C48692fJ A0b = new C48692fJ("message_handler/logged_flag/must_reconnect", true);
    public final C50122hf A0c;
    public final AnonymousClass31C A0d;
    public final C18920yT A0e = new C18920yT(Looper.getMainLooper(), this);
    public final C18790yG A0f;
    public final AnonymousClass4F9 A0g;
    public final C52992mN A0h;
    public final C46742c8 A0i;
    public final C613430h A0j;
    public final C55892r5 A0k;
    public final C48202eW A0l;
    public final AnonymousClass2QU A0m;
    public final C54622p1 A0n;
    public final C45502a7 A0o;
    public final C54832pM A0p;
    public final AnonymousClass4FS A0q;
    public final C67823Qu A0r;
    public final C61032zb A0s;
    public final C183538qC A0t;
    public final Object A0u = AnonymousClass002.A0D();
    public final Random A0v = AnonymousClass0x9.A1C();
    public final AtomicBoolean A0w = new AtomicBoolean();
    public final AtomicBoolean A0x = new AtomicBoolean();
    public final AnonymousClass4C1 A0y;
    public volatile boolean A0z = false;
    public volatile boolean A10;
    public volatile boolean A11;
    public volatile boolean A12;

    public void A09(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        A0D((String) null, (String) null, i, z, z2, z3, z4, false, false);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8 A[Catch:{ NumberFormatException -> 0x003e }] */
    public final void A0C(X.AnonymousClass2OU r14, java.lang.String r15, java.lang.String r16, int r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22) {
        /*
            r13 = this;
            r4 = 1
            r3 = 0
            if (r19 == 0) goto L_0x0014
            long r1 = r13.A03
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            long r5 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
        L_0x0014:
            r11 = 0
        L_0x0015:
            X.2oU r0 = r13.A0T
            android.content.Context r5 = r0.A00
            java.lang.Object r2 = r13.A0u
            monitor-enter(r2)
            goto L_0x001f
        L_0x001d:
            r11 = 1
            goto L_0x0015
        L_0x001f:
            X.2fJ r0 = r13.A0Z     // Catch:{ all -> 0x018d }
            boolean r0 = r0.A00     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x005f
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x0048
            int r1 = java.lang.Integer.parseInt(r15)     // Catch:{ NumberFormatException -> 0x003e }
            int r0 = r13.A00     // Catch:{ NumberFormatException -> 0x003e }
            if (r1 != r0) goto L_0x0048
            X.4EW r1 = r13.A08     // Catch:{ NumberFormatException -> 0x003e }
            X.C626936e.A06(r1)     // Catch:{ NumberFormatException -> 0x003e }
            r0 = 6
            r1.BlM(r4, r0)     // Catch:{ NumberFormatException -> 0x003e }
            goto L_0x0188
        L_0x003e:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x018d }
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary invalid sessionId="
            X.C18260x0.A0v(r0, r15, r1, r3)     // Catch:{ all -> 0x018d }
        L_0x0048:
            if (r20 == 0) goto L_0x0175
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/not_disconnected/check_connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x018d }
            X.2sT r3 = r13.A0Y     // Catch:{ all -> 0x018d }
            java.lang.String r0 = "ClientPingManager/on-demand-ping"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x018d }
            android.os.Handler r1 = r3.A07     // Catch:{ all -> 0x018d }
            r0 = 25
            X.C70013Zn.A00(r1, r3, r0)     // Catch:{ all -> 0x018d }
            goto L_0x017a
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x018d }
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary force:"
            r1.append(r0)     // Catch:{ all -> 0x018d }
            r10 = r18
            r1.append(r10)     // Catch:{ all -> 0x018d }
            java.lang.String r0 = " connectReason:"
            r1.append(r0)     // Catch:{ all -> 0x018d }
            r12 = r17
            r1.append(r12)     // Catch:{ all -> 0x018d }
            java.lang.String r0 = " notify:"
            r1.append(r0)     // Catch:{ all -> 0x018d }
            r7 = r21
            r1.append(r7)     // Catch:{ all -> 0x018d }
            java.lang.String r0 = " fgService:"
            r6 = r22
            X.C18260x0.A1D(r0, r1, r6)     // Catch:{ all -> 0x018d }
            X.2mN r9 = r13.A0h     // Catch:{ all -> 0x018d }
            monitor-enter(r9)     // Catch:{ all -> 0x018d }
            X.32E r8 = r9.A03     // Catch:{ all -> 0x018a }
            int r0 = r8.A00     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x009d
            if (r17 == 0) goto L_0x009d
            r8.A00 = r12     // Catch:{ all -> 0x018a }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x018a }
            r8.A02 = r0     // Catch:{ all -> 0x018a }
            r8.A01 = r3     // Catch:{ all -> 0x018a }
        L_0x009d:
            monitor-exit(r9)     // Catch:{ all -> 0x018d }
            if (r18 != 0) goto L_0x00b0
            if (r11 == 0) goto L_0x00a3
            goto L_0x00b3
        L_0x00a3:
            X.2fJ r11 = r13.A0b     // Catch:{ all -> 0x018d }
            boolean r0 = r11.A00     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x00c8
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/unnecessary"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x018d }
            goto L_0x0188
        L_0x00b0:
            java.lang.String r8 = "force"
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r8 = "isStable"
        L_0x00b5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x018d }
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/"
            X.C18260x0.A0q(r0, r8, r1)     // Catch:{ all -> 0x018d }
            X.2fJ r11 = r13.A0b     // Catch:{ all -> 0x018d }
            r11.A00(r4)     // Catch:{ all -> 0x018d }
            X.2fJ r0 = r13.A0a     // Catch:{ all -> 0x018d }
            r0.A00(r4)     // Catch:{ all -> 0x018d }
        L_0x00c8:
            boolean r0 = r13.A0A     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x00d4
            long r0 = r13.A01     // Catch:{ all -> 0x018d }
            r9 = -1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x00fd
        L_0x00d4:
            boolean r0 = r11.A00     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x016f
            X.2fJ r1 = r13.A0a     // Catch:{ all -> 0x018d }
            boolean r0 = r1.A00     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x016f
            r1.A00(r3)     // Catch:{ all -> 0x018d }
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x018d }
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/network/ignore ("
            r8.append(r0)     // Catch:{ all -> 0x018d }
            boolean r0 = r13.A0A     // Catch:{ all -> 0x018d }
            r8.append(r0)     // Catch:{ all -> 0x018d }
            r0 = 44
            r8.append(r0)     // Catch:{ all -> 0x018d }
            long r0 = r13.A01     // Catch:{ all -> 0x018d }
            java.lang.String r0 = X.C18270x1.A0U(r8, r0)     // Catch:{ all -> 0x018d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x018d }
        L_0x00fd:
            boolean r0 = r13.A12     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/handler_stopped"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x018d }
            goto L_0x0188
        L_0x0108:
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A0w     // Catch:{ all -> 0x018d }
            r0.compareAndSet(r3, r7)     // Catch:{ all -> 0x018d }
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.A0x     // Catch:{ all -> 0x018d }
            r1.compareAndSet(r3, r6)     // Catch:{ all -> 0x018d }
            X.30H r0 = r13.A09     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x0169
            X.4EW r0 = r13.A08     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x0169
            boolean r0 = r13.A0B     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x0169
            boolean r0 = r1.getAndSet(r3)     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x0143
            X.33T r3 = r13.A0U     // Catch:{ all -> 0x018d }
            java.lang.String r1 = "MessageHandler3"
            r0 = 10
            r3.A05(r0, r1)     // Catch:{ all -> 0x018d }
            X.1iO r0 = r13.A0G     // Catch:{ all -> 0x018d }
            boolean r0 = r0.A00     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/fgservice-start"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x018d }
            X.2p1 r3 = r13.A0n     // Catch:{ all -> 0x018d }
            java.lang.Class<com.whatsapp.service.GcmFGService> r1 = com.whatsapp.service.GcmFGService.class
            android.content.Intent r0 = X.C18320x8.A07()     // Catch:{ all -> 0x018d }
            r3.A03(r5, r0, r1)     // Catch:{ all -> 0x018d }
        L_0x0143:
            X.2eW r0 = r13.A0l     // Catch:{ all -> 0x018d }
            int r1 = r0.A00     // Catch:{ all -> 0x018d }
            r0 = 3
            r7 = 1
            if (r1 != r0) goto L_0x014c
            r7 = 0
        L_0x014c:
            com.whatsapp.jid.UserJid r0 = r13.A05     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x0159
            X.2jr r0 = r13.A0M     // Catch:{ all -> 0x018d }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x0159
            r4 = 0
        L_0x0159:
            X.C626936e.A0B(r4)     // Catch:{ all -> 0x018d }
            X.4EW r3 = r13.A08     // Catch:{ all -> 0x018d }
            com.whatsapp.jid.UserJid r4 = r13.A05     // Catch:{ all -> 0x018d }
            boolean r8 = r13.A0z     // Catch:{ all -> 0x018d }
            r5 = r14
            r6 = r16
            r3.BlI(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x018d }
            goto L_0x0188
        L_0x0169:
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/not_ready"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x018d }
            goto L_0x0188
        L_0x016f:
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x018d }
            goto L_0x0188
        L_0x0175:
            java.lang.String r0 = "MessageHandler/reconnectIfNecessary/not_disconnected"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x018d }
        L_0x017a:
            X.2mN r0 = r13.A0h     // Catch:{ all -> 0x018d }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x0188
            X.2zb r1 = r13.A0s     // Catch:{ all -> 0x018d }
            r0 = 2
            X.C61032zb.A00(r1, r0)     // Catch:{ all -> 0x018d }
        L_0x0188:
            monitor-exit(r2)     // Catch:{ all -> 0x018d }
            return
        L_0x018a:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x018d }
            throw r0     // Catch:{ all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66523Lt.A0C(X.2OU, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void A0H(boolean z, boolean z2, boolean z3) {
        AnonymousClass2OU r2;
        if (this.A0M.A02()) {
            r2 = this.A06;
        } else {
            r2 = null;
        }
        A0C(r2, (String) null, (String) null, 0, z, z2, z3, false, false);
    }

    public static /* synthetic */ void A01(C66523Lt r130) {
        C66523Lt r6 = r130;
        if (!r6.A12) {
            Log.i("MessageHandler/start");
            r6.A12 = true;
            AnonymousClass2V4 r1 = r6.A0I;
            C18920yT r75 = r6.A0e;
            C64333Db r5 = r1.A00.A01;
            C54292oU r64 = (C54292oU) r5.AaB.get();
            C56612sH r63 = (C56612sH) r5.ASO.get();
            AnonymousClass1VX r62 = (AnonymousClass1VX) r5.A07.get();
            C64733Es r61 = (C64733Es) r5.A8Y.get();
            C55682qk r60 = (C55682qk) r5.A75.get();
            C56972sr r59 = (C56972sr) r5.AJW.get();
            AnonymousClass4FS r58 = (AnonymousClass4FS) r5.AbX.get();
            AnonymousClass5XU r57 = (AnonymousClass5XU) r5.AU0.get();
            C56492s4 r56 = (C56492s4) r5.AWW.get();
            C56982ss r55 = (C56982ss) r5.A5B.get();
            AnonymousClass4FV r54 = (AnonymousClass4FV) r5.ASY.get();
            C66663Mh r53 = (C66663Mh) r5.AUd.get();
            AnonymousClass31B r52 = (AnonymousClass31B) r5.A1A.get();
            C28861ht r51 = (C28861ht) r5.AJH.get();
            C64173Cl r50 = (C64173Cl) r5.AR5.get();
            AnonymousClass31C r49 = (AnonymousClass31C) r5.AKw.get();
            AnonymousClass5TW r48 = (AnonymousClass5TW) r5.ASQ.get();
            C383727h r47 = (C383727h) r5.A3N.get();
            AnonymousClass36E r46 = (AnonymousClass36E) r5.ALM.get();
            C52542le r45 = (C52542le) r5.AEt.get();
            C153707bo r44 = (C153707bo) r5.AcC.get();
            C183538qC A002 = C72343dZ.A00(r5.AcD);
            C183538qC A003 = C72343dZ.A00(r5.AcI);
            C67823Qu r43 = (C67823Qu) r5.Ac6.get();
            AnonymousClass9U4 r42 = (AnonymousClass9U4) r5.AQC.get();
            C88744aj r65 = C88744aj.A00;
            C55832qz r41 = (C55832qz) r5.AAY.get();
            C66493Lq r40 = (C66493Lq) r5.AGL.get();
            C29021i9 r39 = (C29021i9) r5.ANA.get();
            C55882r4 r38 = (C55882r4) r5.ATI.get();
            C69213Wd Ajp = r5.Ajp();
            C60442yZ r37 = (C60442yZ) r5.AZc.get();
            C44662Wz r36 = (C44662Wz) r5.AU3.get();
            C53322mu r35 = (C53322mu) r5.Aat.get();
            AnonymousClass4AF r34 = (AnonymousClass4AF) r5.ASX.get();
            C55352qD r33 = (C55352qD) r5.AQU.get();
            AnonymousClass27P r32 = (AnonymousClass27P) r5.Ac8.get();
            C53962nx r31 = (C53962nx) r5.A4i.get();
            C55892r5 r30 = (C55892r5) r5.AJE.get();
            C52992mN r29 = (C52992mN) r5.ALG.get();
            C72303dV r28 = (C72303dV) r5.AMC.get();
            C194639Tx r27 = (C194639Tx) r5.AQG.get();
            AnonymousClass33p r26 = (AnonymousClass33p) r5.Aaj.get();
            AnonymousClass28Y r25 = (AnonymousClass28Y) r5.AcG.get();
            C50582iP r24 = (C50582iP) r5.A5D.get();
            C45332Zp r23 = (C45332Zp) r5.AcH.get();
            AnonymousClass2RV r22 = (AnonymousClass2RV) r5.AJF.get();
            AnonymousClass9U5 r21 = (AnonymousClass9U5) r5.AQ5.get();
            AnonymousClass2ZJ r20 = (AnonymousClass2ZJ) r5.A1B.get();
            C64163Ck r19 = (C64163Ck) r5.A5C.get();
            C129496aP builderWithExpectedSize = C129526aS.builderWithExpectedSize(2);
            builderWithExpectedSize.addAll(r5.AuJ());
            builderWithExpectedSize.addAll(r5.Auj());
            C129526aS build = builderWithExpectedSize.build();
            C617732e r18 = (C617732e) r5.A67.get();
            AnonymousClass2FU r17 = (AnonymousClass2FU) r5.A60.get();
            C51072jE r16 = (C51072jE) r5.ATh.get();
            C56402rv Ari = r5.Ari();
            AnonymousClass363 r66 = new AnonymousClass363(C116985rC.A02((C56722sS) r5.A3B.get()), (C116985rC) r5.AOj.get(), (C55682qk) r5.A75.get(), (C56492s4) r5.AWW.get(), r5.Aip(), (C28951i2) r5.A4x.get(), (AnonymousClass9U4) r5.AQC.get(), Ari);
            C18980yZ r642 = new C18980yZ(r65, (C29171iO) r5.A0s.get(), r52, r31, r60, (AnonymousClass2V6) r5.A64.get(), r59, r46, r39, r57, r53, r56, r20, r48, (C46642by) r5.A5u.get(), (C51462jr) r5.A5x.get(), r17, r63, r64, (C57162tC) r5.AaV.get(), r26, (C54412og) r5.Aam.get(), r55, r28, r61, r62, r34, r54, r40, r32, r47, r24, r18, r75, r45, (C67813Qt) r5.AHU.get(), r49, r29, r33, r50, r38, (C613430h) r5.Ac9.get(), r44, r23, r30, r22, r21, r42, (C53022mQ) r5.ARQ.get(), (AnonymousClass28T) r5.AFc.get(), r27, r25, r66, r37, r51, r16, r36, r19, r41, Ajp, r58, r35, r43, A002, A003, build);
            r6.A07 = r642;
            r642.start();
        }
    }

    public static /* synthetic */ void A02(C66523Lt r18, Integer num, int i, boolean z, boolean z2) {
        C95814uZ A012;
        boolean containsKey;
        C66523Lt r6 = r18;
        Context context = r6.A0T.A00;
        synchronized (r6.A0u) {
            r6.A0Z.A00(false);
            r6.A0q.BkP(new C70113Zy(r6, 4, num));
            AnonymousClass2QU r3 = r6.A0m;
            r3.A03.BkN(C70133a0.A00(r3, r6.A0H.A0K(), 20), "sendKeystoreAttestation");
            if (!r6.A0A && Build.VERSION.SDK_INT < 29) {
                r6.A0A = r6.A0g.isConnected();
                Log.i("MessageHandler/handleConnected setting isNetworkUp to true");
            }
            int i2 = i;
            r6.A00 = i2;
            r6.A0r.A07 = Integer.valueOf(i2);
            boolean z3 = z;
            if (!r6.A0M.A02()) {
                AnonymousClass30H r7 = r6.A09;
                C626936e.A01();
                r7.A0w.A09();
                r7.A0C.A09(z3);
                C65193Go r1 = r7.A06;
                r1.A00 = false;
                r7.A0n.A02 = false;
                r1.A01 = false;
                C52552lf r9 = r7.A0a;
                Map map = r9.A01;
                synchronized (map) {
                    try {
                        map.clear();
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                C55492qR r10 = r7.A0A;
                synchronized (r10) {
                    try {
                        r10.A08.clear();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C29021i9 r2 = r7.A09;
                synchronized (r2) {
                    try {
                        r2.A02 = false;
                        r2.A00 = 0;
                        r2.A0E(0);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                Log.i("server connected");
                AnonymousClass33p r32 = r7.A0N;
                C18270x1.A0l(C18270x1.A03(r32), "spam_banned", false);
                C18260x0.A0M(r32, "spam_banned_expiry_timestamp", 0);
                C18260x0.A1D("wa-shared-prefs/setspambanned ", AnonymousClass001.A0o(), false);
                C18270x1.A0l(C18270x1.A03(r32), "underage_account_banned", false);
                C18260x0.A1D("wa-shared-prefs/setUnderageAccountBanned ", AnonymousClass001.A0o(), false);
                C29011i8 r12 = r7.A0q;
                r12.A02 = true;
                r12.A0H();
                C56972sr r13 = r7.A07;
                if (!r13.A0Y() && C56972sr.A04(r13) != null) {
                    C70013Zn.A01(r7.A0x, r7, 33);
                }
                AnonymousClass4FS r14 = r7.A0x;
                C70013Zn.A01(r14, r7, 34);
                if (r7.A0V.A0Y(C58422vE.A02, 877)) {
                    C69183Wa r22 = r7.A0t;
                    Objects.requireNonNull(r22);
                    C70013Zn.A01(r14, r22, 35);
                }
                C116985rC r23 = r7.A02;
                if (r23.A07()) {
                    r23.A04();
                    th = AnonymousClass001.A0g("isPremiumOrMetaVerifiedFeatureEnabled");
                    throw th;
                }
                AnonymousClass3H2 r24 = r7.A0F;
                Objects.requireNonNull(r24);
                C70013Zn.A01(r14, r24, 36);
                C72303dV r25 = r7.A0R;
                if (r25.A08) {
                    C56232re r142 = r7.A0Y;
                    C70013Zn r132 = new C70013Zn(r7, 37);
                    C54462ol r102 = r142.A0M;
                    synchronized (r102) {
                        r102.A01.clear();
                    }
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    synchronized (r142.A0T) {
                        try {
                            Iterator A0u2 = AnonymousClass001.A0u(r142.A0U);
                            while (A0u2.hasNext()) {
                                Map.Entry A0w2 = AnonymousClass001.A0w(A0u2);
                                C28121fj r11 = r142.A0K;
                                AnonymousClass65N r15 = (AnonymousClass65N) A0w2.getValue();
                                synchronized (r11) {
                                    containsKey = r11.A01.containsKey(r15);
                                }
                                if (containsKey) {
                                    A0s2.addAll(Collections.unmodifiableList(((AnonymousClass30M) A0w2.getKey()).A02));
                                }
                            }
                        } catch (Throwable th4) {
                            while (true) {
                                th = th4;
                                break;
                            }
                        }
                    }
                    AnonymousClass1I4 r112 = new AnonymousClass1I4(r142, A0s2, true);
                    r142.A0R.BkM(r112);
                    r112.A04(new C86224Jh(A0s2, r142, r132, 4), r142.A0V);
                }
                AnonymousClass31C r122 = r7.A0b;
                C48142eQ r0 = r122.A07;
                LinkedHashMap A0r2 = C18320x8.A0r();
                LinkedHashMap linkedHashMap = r0.A00;
                synchronized (linkedHashMap) {
                    try {
                        Iterator A0u3 = AnonymousClass001.A0u(linkedHashMap);
                        while (A0u3.hasNext()) {
                            Map.Entry A0w3 = AnonymousClass001.A0w(A0u3);
                            if (AnonymousClass0x7.A05(((Pair) A0w3.getValue()).second) < 3) {
                                A0r2.put(C18310x6.A0q(A0w3), (Message) ((Pair) A0w3.getValue()).first);
                            } else {
                                A0u3.remove();
                            }
                        }
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        C18260x0.A1G(A0o2, AnonymousClass0x7.A0A("unacked-messages/getUnackedMessages: ", A0o2, A0r2));
                    } catch (Throwable th5) {
                        while (true) {
                            th = th5;
                            break;
                        }
                    }
                }
                C162457s7.A0H(A0r2);
                Iterator A0q2 = AnonymousClass000.A0q(A0r2);
                while (A0q2.hasNext()) {
                    Map.Entry A0w4 = AnonymousClass001.A0w(A0q2);
                    String A0q3 = C18310x6.A0q(A0w4);
                    Message message = (Message) A0w4.getValue();
                    C162457s7.A0H(message);
                    C162457s7.A0H(A0q3);
                    C162457s7.A0J(message, 0);
                    C162457s7.A0J(A0q3, 1);
                    r122.A0A(message, A0q3, true);
                }
                AnonymousClass3S3 r123 = r7.A0j;
                Set set = r123.A07;
                HashSet A152 = AnonymousClass0x9.A15(set);
                set.clear();
                Iterator it = A152.iterator();
                while (it.hasNext()) {
                    r123.A06(C18300x5.A0P(it));
                }
                AnonymousClass2HA r143 = new AnonymousClass2HA(r7);
                List<AnonymousClass2OW> list = r9.A00;
                synchronized (list) {
                    try {
                        C18260x0.A1C("in-flight-messages/for-each/send-pending-requests: ", AnonymousClass001.A0o(), list);
                        for (AnonymousClass2OW r02 : list) {
                            String str = r02.A01;
                            Message message2 = r02.A00;
                            boolean z4 = r02.A02;
                            AnonymousClass31C r03 = r143.A00.A0b;
                            if (z4) {
                                C162457s7.A0J(str, 1);
                                r03.A0A(message2, str, true);
                            } else {
                                r03.A09(message2, str);
                            }
                        }
                        list.clear();
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                C48202eW r113 = r7.A0i;
                if (r113.A00 != 3) {
                    C48962fl A002 = r7.A0J.A00();
                    if (A002.A02 && (A012 = AnonymousClass3ZH.A01(A002.A00().getContact())) != null) {
                        r123.A06(A012);
                    }
                }
                boolean A1U = AnonymousClass000.A1U(r113.A00, 3);
                if (z2 == A1U) {
                    if (!A1U) {
                        r7.A0k.A00();
                    } else {
                        r7.A0k.A01();
                    }
                }
                if (r7.A0O.A04()) {
                    r32.A1o(true);
                    Log.d("MessageHandlerCallback/processConnectTasksForVersionChange");
                    C70013Zn.A01(r14, r7, 29);
                }
                if (AnonymousClass0x2.A0F(r32).getBoolean("future_proof_processing_needed", false) && C72303dV.A00(r25)) {
                    AnonymousClass2UH r33 = r7.A0Z;
                    r33.A0H.BkN(new C70013Zn(r33, 27), "FutureProofMessageHandler/processFutureMessages");
                }
                r7.A0W.BlF(false);
            } else {
                r6.A0K.A09(z3);
            }
            MessageService.A02(context);
            C52992mN r4 = r6.A0h;
            if (r4.A02()) {
                C61032zb.A00(r6.A0s, 1);
            }
            r6.A0p.A02();
            r6.A07();
            C56732sT r34 = r6.A0Y;
            AnonymousClass4EW r26 = r6.A08;
            r34.A04 = r4.A02();
            C71353by.A00(r34.A07, r34, r26, 49);
            r6.A0i.A00();
            r6.A0U.A05(10, "MessageHandler1");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        if (r1 == false) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A03(X.C66523Lt r8, boolean r9) {
        /*
            X.2sT r7 = r8.A0Y
            long r3 = r7.A0G
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "MessageHandler/handleDisconnected/pending_ping"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r9 = 1
        L_0x0015:
            X.2r5 r5 = r8.A0k
            monitor-enter(r5)
            X.1VX r2 = r5.A01     // Catch:{ all -> 0x0194 }
            X.2vE r1 = X.C58422vE.A01     // Catch:{ all -> 0x0194 }
            r0 = 5452(0x154c, float:7.64E-42)
            boolean r0 = r2.A0Y(r1, r0)     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x005b
            r0 = 4923(0x133b, float:6.899E-42)
            boolean r0 = r2.A0Y(r1, r0)     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "LoggableStanzaCache/onDisconnect not clearing loggable message stanzas"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = "LoggableStanzaCache/clearNonMessageStanzas"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0194 }
            java.util.Map r0 = r5.A06     // Catch:{ all -> 0x0194 }
            r0.clear()     // Catch:{ all -> 0x0194 }
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0194 }
            r0.clear()     // Catch:{ all -> 0x0194 }
            java.util.Map r0 = r5.A05     // Catch:{ all -> 0x0194 }
            r0.clear()     // Catch:{ all -> 0x0194 }
        L_0x0045:
            X.1hc r0 = r5.A02     // Catch:{ all -> 0x0194 }
            java.util.Iterator r1 = X.C61102zi.A03(r0)     // Catch:{ all -> 0x0194 }
        L_0x004b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0194 }
            X.4FA r0 = (X.AnonymousClass4FA) r0     // Catch:{ all -> 0x0194 }
            r0.BRG()     // Catch:{ all -> 0x0194 }
            goto L_0x004b
        L_0x005b:
            r1 = 4430(0x114e, float:6.208E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x0194 }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = "LoggableStanzaCache/clearOnlineStanzas"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0194 }
            int[] r6 = r5.A07     // Catch:{ all -> 0x0194 }
            int r3 = r6.length     // Catch:{ all -> 0x0194 }
            r2 = 0
        L_0x006e:
            if (r2 >= r3) goto L_0x0045
            r0 = r6[r2]     // Catch:{ all -> 0x0194 }
            java.util.Map r0 = r5.A03(r0)     // Catch:{ all -> 0x0194 }
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x0194 }
        L_0x007a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0194 }
            X.2rb r0 = (X.C56202rb) r0     // Catch:{ all -> 0x0194 }
            java.lang.Integer r0 = r0.A0A     // Catch:{ all -> 0x0194 }
            if (r0 != 0) goto L_0x007a
            r1.remove()     // Catch:{ all -> 0x0194 }
            goto L_0x007a
        L_0x008e:
            int r2 = r2 + 1
            goto L_0x006e
        L_0x0091:
            java.lang.String r0 = "LoggableStanzaCache/clear"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0194 }
            int[] r3 = r5.A07     // Catch:{ all -> 0x0194 }
            int r2 = r3.length     // Catch:{ all -> 0x0194 }
            r1 = 0
        L_0x009a:
            if (r1 >= r2) goto L_0x0045
            r0 = r3[r1]     // Catch:{ all -> 0x0194 }
            java.util.Map r0 = r5.A03(r0)     // Catch:{ all -> 0x0194 }
            r0.clear()     // Catch:{ all -> 0x0194 }
            int r1 = r1 + 1
            goto L_0x009a
        L_0x00a8:
            monitor-exit(r5)
            X.2oU r0 = r8.A0T
            android.content.Context r2 = r0.A00
            java.lang.Object r3 = r8.A0u
            monitor-enter(r3)
            X.2fJ r0 = r8.A0Z     // Catch:{ all -> 0x0191 }
            r0.A00(r4)     // Catch:{ all -> 0x0191 }
            X.30H r0 = r8.A09     // Catch:{ all -> 0x0191 }
            r0.A00()     // Catch:{ all -> 0x0191 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
            r0 = 26
            if (r1 < r0) goto L_0x00c2
            if (r9 != 0) goto L_0x00d1
        L_0x00c2:
            java.lang.String r0 = "messageservice/stopService"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            java.lang.Class<com.whatsapp.messaging.MessageService> r0 = com.whatsapp.messaging.MessageService.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r2, r0)     // Catch:{ all -> 0x0191 }
            r2.stopService(r0)     // Catch:{ all -> 0x0191 }
        L_0x00d1:
            X.2hf r1 = r8.A0c     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = "disconnected"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x0191 }
            r1.A01(r0)     // Catch:{ all -> 0x0191 }
            X.30h r6 = r8.A0j     // Catch:{ all -> 0x0191 }
            X.4EW r0 = r8.A08     // Catch:{ all -> 0x0191 }
            r5 = 0
            if (r0 == 0) goto L_0x00ea
            boolean r1 = r0.BFQ()     // Catch:{ all -> 0x0191 }
            r0 = 1
            if (r1 != 0) goto L_0x00eb
        L_0x00ea:
            r0 = 0
        L_0x00eb:
            r6.A06(r0)     // Catch:{ all -> 0x0191 }
            android.os.Handler r1 = r7.A07     // Catch:{ all -> 0x0191 }
            r0 = 24
            X.C70013Zn.A00(r1, r7, r0)     // Catch:{ all -> 0x0191 }
            X.2c8 r6 = r8.A0i     // Catch:{ all -> 0x0191 }
            X.66R r0 = r6.A04     // Catch:{ all -> 0x0191 }
            android.os.Handler r1 = X.AnonymousClass0x9.A0A(r0)     // Catch:{ all -> 0x0191 }
            X.66R r0 = r6.A05     // Catch:{ all -> 0x0191 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0191 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0191 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0191 }
            X.2zb r1 = r8.A0s     // Catch:{ all -> 0x0191 }
            r0 = 3
            X.C61032zb.A00(r1, r0)     // Catch:{ all -> 0x0191 }
            X.2p1 r1 = r8.A0n     // Catch:{ all -> 0x0191 }
            java.lang.Class<com.whatsapp.service.GcmFGService> r0 = com.whatsapp.service.GcmFGService.class
            r1.A01(r2, r0)     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = "MessageHandler/handleDisconnected notifyOnFailure:"
            r1.append(r0)     // Catch:{ all -> 0x0191 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A0w     // Catch:{ all -> 0x0191 }
            X.C18260x0.A0m(r0, r1)     // Catch:{ all -> 0x0191 }
            boolean r0 = r0.getAndSet(r5)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0176
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            java.lang.String r7 = r2.getString(r0)     // Catch:{ all -> 0x0191 }
            X.0Ue r6 = X.C66553Lw.A01(r2)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = "failure_notifications@1"
            r6.A0K = r0     // Catch:{ all -> 0x0191 }
            r0 = 2131891272(0x7f121448, float:1.941726E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r2, r7, r4, r0)     // Catch:{ all -> 0x0191 }
            r6.A0C(r0)     // Catch:{ all -> 0x0191 }
            X.2sH r0 = r8.A0S     // Catch:{ all -> 0x0191 }
            long r0 = r0.A0H()     // Catch:{ all -> 0x0191 }
            r6.A05(r0)     // Catch:{ all -> 0x0191 }
            r0 = 3
            r6.A02(r0)     // Catch:{ all -> 0x0191 }
            r6.A0E(r4)     // Catch:{ all -> 0x0191 }
            r6.A0B(r7)     // Catch:{ all -> 0x0191 }
            r0 = 2131891273(0x7f121449, float:1.9417261E38)
            X.C18320x8.A0z(r2, r6, r0)     // Catch:{ all -> 0x0191 }
            android.content.Intent r0 = X.C627736r.A03(r2)     // Catch:{ all -> 0x0191 }
            android.app.PendingIntent r0 = X.C624735e.A00(r2, r4, r0, r5)     // Catch:{ all -> 0x0191 }
            X.AnonymousClass33T.A01(r0, r6)     // Catch:{ all -> 0x0191 }
            X.33T r2 = r8.A0U     // Catch:{ all -> 0x0191 }
            android.app.Notification r1 = r6.A01()     // Catch:{ all -> 0x0191 }
            r0 = 10
            r2.A04(r0, r1)     // Catch:{ all -> 0x0191 }
            X.2a7 r0 = r8.A0o     // Catch:{ all -> 0x0191 }
            r0.A00()     // Catch:{ all -> 0x0191 }
        L_0x0176:
            if (r9 == 0) goto L_0x0183
            X.4F9 r0 = r8.A0g     // Catch:{ all -> 0x0191 }
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0185
            r8.A0E(r5)     // Catch:{ all -> 0x0191 }
        L_0x0183:
            monitor-exit(r3)     // Catch:{ all -> 0x0191 }
            goto L_0x0190
        L_0x0185:
            java.lang.String r0 = "MessageHandler/handleDisconnected/retry/network_unavailable"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            X.2fJ r0 = r8.A0b     // Catch:{ all -> 0x0191 }
            r0.A00(r4)     // Catch:{ all -> 0x0191 }
            goto L_0x0183
        L_0x0190:
            return
        L_0x0191:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0191 }
            throw r0
        L_0x0194:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66523Lt.A03(X.3Lt, boolean):void");
    }

    public void A04() {
        Log.d("MessageHandler/actionStart");
        Message obtain = Message.obtain((Handler) null, 0);
        obtain.getData().putBoolean("should_register", true);
        this.A0f.sendMessage(obtain);
    }

    public void A05() {
        Log.d("MessageHandler/actionStartDoNotRegister");
        Message obtain = Message.obtain((Handler) null, 0);
        obtain.getData().putBoolean("should_register", false);
        this.A0f.sendMessage(obtain);
    }

    public void A06() {
        Log.d("MessageHandler/mustbelong");
        Bundle A082 = AnonymousClass002.A08();
        A082.putBoolean("long_connect", true);
        this.A0f.sendMessage(Message.obtain((Handler) null, 3, A082));
        A09(0, true, false, false, false);
    }

    public final void A07() {
        synchronized (this.A0u) {
            this.A0b.A00(AnonymousClass000.A1T(this.A0h.A02() ? 1 : 0));
        }
    }

    public void A08(int i) {
        Log.d("MessageHandler/actionReconnect forced");
        Message obtain = Message.obtain((Handler) null, 2);
        obtain.getData().putBoolean("force", true);
        obtain.getData().putInt("connect_reason", i);
        this.A0f.sendMessage(obtain);
    }

    public void A0A(long j, boolean z, boolean z2) {
        Handler handler = this.A0F;
        Message obtain = Message.obtain(handler, 0, z ? 1 : 0, 0);
        Bundle data = obtain.getData();
        data.putLong("networkId", j);
        data.putBoolean("networkIsBlocked", z2);
        handler.sendMessage(obtain);
    }

    public void A0B(AnonymousClass2OU r5) {
        Log.d("MessageHandler/startcompanionreg");
        Message obtain = Message.obtain((Handler) null, 0, r5);
        obtain.getData().putBoolean("should_register", true);
        this.A0f.sendMessage(obtain);
    }

    public void A0G(boolean z, boolean z2) {
        String str;
        if (this.A0V.A0Y(C58422vE.A02, 6495)) {
            if (!z) {
                Handler handler = this.A0E;
                if (handler.hasMessages(2)) {
                    Log.i("MessageHandler/onCaptivePortalDetectionAndWaitDone retry message canceled");
                    handler.removeMessages(2);
                }
            } else if (!z2) {
                this.A0E.sendEmptyMessageDelayed(2, 60000);
                str = "MessageHandler/onCaptivePortalDetectionAndWaitDone retry message scheduled for handler with delay: 60000ms";
            }
            A15.set(z);
            A13.countDown();
            return;
        }
        Context context = this.A0T.A00;
        AlarmManager A072 = this.A0Q.A07();
        if (A072 != null) {
            Intent A0B2 = C18280x3.A0B("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION");
            if (!z) {
                PendingIntent A012 = C624735e.A01(context, 0, A0B2, 536870912);
                if (A012 != null) {
                    Log.i("MessageHandler/onCaptivePortalDetectionAndWaitDone retry alarm canceled");
                    A072.cancel(A012);
                    A012.cancel();
                }
            } else if (!z2) {
                this.A0P.A02(C624735e.A03(context, A0B2, 0), 2, SystemClock.elapsedRealtime() + 60000);
                str = "MessageHandler/onCaptivePortalDetectionAndWaitDone retry alarm set for 60000ms from now";
            }
        } else {
            Log.w("MessageHandler/onCaptivePortalDetectionAndWaitDone AlarmManager is null");
        }
        A15.set(z);
        A13.countDown();
        return;
        Log.i(str);
    }

    public static /* synthetic */ void A00(Message message, C66523Lt r11) {
        boolean z;
        AnonymousClass4EW r1;
        Bundle data = message.getData();
        boolean A1S = AnonymousClass000.A1S(message.arg1);
        long j = data.getLong("networkId");
        boolean z2 = data.getBoolean("networkIsBlocked");
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MessageHandler/handleNetworkChange handleNetworkChange isConnected:");
        A0o2.append(A1S);
        A0o2.append(" networkId:");
        A0o2.append(j);
        C18260x0.A1D(" is blocked:", A0o2, z2);
        synchronized (r11.A0u) {
            z = true;
            if (r11.A0A != A1S) {
                if (A1S) {
                    Log.i("MessageHandler/handleNetworkChange/up");
                    if (r11.A0V.A0Y(C58422vE.A02, 5940) && (r1 = r11.A08) != null) {
                        ((C18940yV) r1).removeMessages(9);
                    }
                    r11.A0H(false, true, false);
                } else {
                    Log.i("MessageHandler/handleNetworkChange/down");
                    AnonymousClass4EW r0 = r11.A08;
                    if (r0 != null) {
                        if (z2) {
                            Log.i("MessageHandler/handleNetworkChange/sendDisconnect");
                            if (r11.A0V.A0Y(C58422vE.A02, 5940)) {
                                ((C18940yV) r11.A08).sendEmptyMessageDelayed(9, 300);
                            } else {
                                r11.A08.BlM(true, 1);
                            }
                        } else {
                            r0.BlM(true, 11);
                        }
                    }
                }
                r11.A0A = A1S;
                r11.A01 = j;
            } else if (A1S) {
                long j2 = r11.A01;
                if (j != j2) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("MessageHandler/handleNetworkChange/switch old=");
                    A0o3.append(j2);
                    C18260x0.A12(" new=", A0o3, j);
                    AnonymousClass4EW r02 = r11.A08;
                    if (r02 != null) {
                        r02.BlM(true, 11);
                    }
                    r11.A01 = j;
                } else {
                    z = false;
                }
                r11.A0H(false, false, true);
            } else {
                z = false;
            }
        }
        if (z) {
            r11.A0X.A01(r11.A0N.A0A());
        }
    }

    public void A0D(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MessageHandler/actionReconnect force:");
        A0o2.append(z);
        C18260x0.A0w(" reason:", A0o2, i);
        Message obtain = Message.obtain((Handler) null, 2);
        obtain.getData().putBoolean("force", z);
        obtain.getData().putBoolean("force_no_ongoing_backoff", z2);
        obtain.getData().putBoolean("reset", z3);
        obtain.getData().putBoolean("check_connection", z4);
        obtain.getData().putBoolean("notify_on_failure", z5);
        obtain.getData().putString("ip_address", str);
        obtain.getData().putString("cl_sess", str2);
        obtain.getData().putBoolean("fgservice", z6);
        obtain.getData().putInt("connect_reason", i);
        this.A0f.sendMessage(obtain);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(boolean r12) {
        /*
            r11 = this;
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r11.A03
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
            java.lang.String r0 = "MessageHandler/scheduleReconnect/already-pending"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0016:
            X.2oU r0 = r11.A0T
            android.content.Context r10 = r0.A00
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0028
            X.2pM r0 = r11.A0p
            long r3 = r11.A02
            r0.A03(r3)
            r0 = 0
            r11.A0C = r0
        L_0x0028:
            X.2pM r0 = r11.A0p
            long r8 = r0.A01()
            long r3 = r0.A00()
            r11.A02 = r3
            r3 = 10000(0x2710, double:4.9407E-320)
            long r8 = r8 * r3
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "MessageHandler/scheduleReconnect/immediate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r11.A08(r0)
            return
        L_0x0045:
            java.util.Random r5 = r11.A0v
            long r6 = r5.nextLong()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r6 = r6 & r3
            r3 = 2
            long r3 = r8 / r3
            long r6 = r6 % r8
            long r3 = r3 + r6
            if (r12 == 0) goto L_0x00b9
            long r7 = A14
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b9
            r0 = 60
            int r0 = r5.nextInt(r0)
            int r0 = r0 + -30
            long r3 = (long) r0
            long r7 = r7 + r3
            java.lang.String r0 = "MessageHandler/scheduleReconnect/backoff clamped to ~15mins"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x006e:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageHandler/scheduleReconnect/backoff:"
            X.C18260x0.A12(r0, r3, r7)
            X.1VX r4 = r11.A0V
            r3 = 6495(0x195f, float:9.101E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r3)
            r3 = 0
            r9 = 3
            r6 = 0
            if (r0 == 0) goto L_0x009d
            android.os.Handler r5 = r11.A0E
            r0 = 1
            android.os.Message r0 = r5.obtainMessage(r0, r9, r6)
            boolean r0 = r5.sendMessageDelayed(r0, r7)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "MessageHandler/scheduleReconnect handler accepted message"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            long r1 = r1 + r7
        L_0x009a:
            r11.A03 = r1
            return
        L_0x009d:
            java.lang.String r0 = "com.whatsapp.MessageHandler.RECONNECT_ACTION"
            android.content.Intent r5 = X.C18280x3.A0B(r0)
            java.lang.String r0 = "connect_reason"
            r5.putExtra(r0, r9)
            android.app.PendingIntent r6 = X.C624735e.A01(r10, r6, r5, r6)
            long r1 = r1 + r7
            X.2it r5 = r11.A0P
            r0 = 2
            boolean r0 = r5.A02(r6, r0, r1)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "MessageHandler/scheduleReconnect AlarmManager is null"
            goto L_0x00bd
        L_0x00b9:
            r7 = r3
            goto L_0x006e
        L_0x00bb:
            java.lang.String r0 = "MessageHandler/scheduleReconnect handler is false"
        L_0x00bd:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r11.A03 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66523Lt.A0E(boolean):void");
    }

    public void A0F(boolean z, int i) {
        C18260x0.A1E("MessageHandler/service/stop/unregister:", AnonymousClass001.A0o(), z);
        C29411im r1 = this.A0K;
        r1.A06 = false;
        r1.A03 = i;
        Message obtain = Message.obtain((Handler) null, 1);
        Bundle data = obtain.getData();
        data.putBoolean("should_unregister", z);
        data.putInt("logoutReason", i);
        this.A0f.sendMessage(obtain);
    }

    public C66523Lt(C29171iO r9, AnonymousClass31B r10, AnonymousClass2V4 r11, C56972sr r12, C29411im r13, AnonymousClass5TW r14, C51462jr r15, C29441ip r16, C54392oe r17, C50862it r18, C620633i r19, C47912e2 r20, C56612sH r21, C54292oU r22, AnonymousClass33T r23, AnonymousClass1VX r24, C56142rU r25, C64723Er r26, C56732sT r27, C50122hf r28, AnonymousClass31C r29, C52992mN r30, C46742c8 r31, C613430h r32, C55892r5 r33, C48202eW r34, AnonymousClass2QU r35, C54622p1 r36, C45502a7 r37, AnonymousClass4FS r38, C67823Qu r39, C61032zb r40, C183538qC r41, AnonymousClass4C1 r42) {
        AnonymousClass4F9 r3;
        C54292oU r4 = r22;
        this.A0T = r4;
        this.A0S = r21;
        this.A0V = r24;
        this.A0P = r18;
        this.A0J = r12;
        this.A0q = r38;
        this.A0d = r29;
        this.A0L = r14;
        this.A0W = r25;
        this.A0Q = r19;
        this.A0l = r34;
        this.A0n = r36;
        this.A0K = r13;
        this.A0Y = r27;
        this.A0X = r26;
        this.A0R = r20;
        this.A0i = r31;
        this.A0k = r33;
        this.A0h = r30;
        this.A0O = r17;
        this.A0s = r40;
        this.A0r = r39;
        this.A0U = r23;
        this.A0c = r28;
        this.A0I = r11;
        this.A0G = r9;
        this.A0N = r16;
        this.A0j = r32;
        this.A0o = r37;
        this.A0M = r15;
        this.A0y = r42;
        this.A0H = r10;
        this.A0m = r35;
        this.A0t = r41;
        this.A0p = new C54832pM(1, 17280);
        this.A0f = new C18790yG(Looper.getMainLooper(), this);
        Context context = r4.A00;
        this.A0E = new Handler(Looper.getMainLooper(), new AnonymousClass37Y(this));
        C154317cy.A00(new AnonymousClass4HB(this, 1), context, new IntentFilter("com.whatsapp.MessageHandler.RECONNECT_ACTION"), (Handler) null, C58152un.A0C, false);
        if (Build.VERSION.SDK_INT >= 29) {
            r3 = new C67783Qq(this.A0Q, this.A0R, this, this.A0r);
        } else {
            C54292oU r7 = this.A0T;
            C47912e2 r6 = this.A0R;
            r3 = new C67773Qp(this.A0N, this.A0O, r6, r7, this);
        }
        this.A0g = r3;
    }
}
