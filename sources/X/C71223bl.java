package X;

import android.os.Handler;

/* renamed from: X.3bl  reason: invalid class name and case insensitive filesystem */
public class C71223bl implements Runnable {
    public int A00 = 0;
    public long A01 = 0;
    public Handler A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C116985rC A05;
    public final C116985rC A06;
    public final C116985rC A07;
    public final C116985rC A08;
    public final C116985rC A09;
    public final C56972sr A0A;
    public final C55912r7 A0B;
    public final C49712gy A0C;
    public final C103365Mp A0D;
    public final AnonymousClass2NN A0E;
    public final C64773Ex A0F;
    public final AnonymousClass5ZU A0G;
    public final C64223Cq A0H;
    public final C56882si A0I;
    public final C64213Cp A0J;
    public final C622334f A0K;
    public final AnonymousClass33p A0L;
    public final C54412og A0M;
    public final C620733j A0N;
    public final C66473Lo A0O;
    public final AnonymousClass2W1 A0P;
    public final C620233e A0Q;
    public final C46982cW A0R;
    public final C49842hB A0S;
    public final AnonymousClass1VX A0T;
    public final AnonymousClass4FV A0U;
    public final C66493Lq A0V;
    public final C66423Lj A0W;
    public final C45342Zq A0X;
    public final C197769dq A0Y;
    public final C56452s0 A0Z;
    public final AnonymousClass48T A0a;
    public final AnonymousClass317 A0b;
    public final C45602aH A0c;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r18 = this;
            r7 = 0
            r6 = 1
            r5 = r18
            X.1Zu r4 = new X.1Zu     // Catch:{ all -> 0x03a6 }
            r4.<init>()     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "registername/initializer/run"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03a6 }
            long r0 = r5.A01     // Catch:{ all -> 0x03a6 }
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x001d
            r5.A01 = r8     // Catch:{ all -> 0x03a6 }
        L_0x001d:
            r10 = 3
            X.2si r0 = r5.A0I     // Catch:{ all -> 0x03a6 }
            r0.A03()     // Catch:{ all -> 0x03a6 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03a6 }
            X.227 r0 = X.AnonymousClass227.A0L     // Catch:{ all -> 0x03a6 }
            X.2zU r1 = new X.2zU     // Catch:{ all -> 0x03a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x03a6 }
            r1.A02 = r6     // Catch:{ all -> 0x03a6 }
            X.2xW r0 = X.C59812xW.A0C     // Catch:{ all -> 0x03a6 }
            r1.A00 = r0     // Catch:{ all -> 0x03a6 }
            r1.A01 = r6     // Catch:{ all -> 0x03a6 }
            X.2zz r11 = r1.A02()     // Catch:{ all -> 0x03a6 }
            android.os.Handler r1 = r5.A02     // Catch:{ all -> 0x03a6 }
            X.3Cq r0 = r5.A0H     // Catch:{ all -> 0x03a6 }
            if (r1 == 0) goto L_0x00a0
            X.304 r11 = r0.A01(r11)     // Catch:{ all -> 0x03a6 }
        L_0x0044:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03a6 }
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)     // Catch:{ all -> 0x03a6 }
            r4.A02 = r0     // Catch:{ all -> 0x03a6 }
            X.3Cp r1 = r5.A0J     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "DeviceSyncManager/syncAllNonContactUsersFromConversations"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            java.util.HashSet r2 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x03a6 }
            X.314 r0 = r1.A03     // Catch:{ all -> 0x03a6 }
            java.util.Set r12 = r0.A0B()     // Catch:{ all -> 0x03a6 }
            X.3Ex r0 = r1.A01     // Catch:{ all -> 0x03a6 }
            java.util.ArrayList r0 = r0.A0F()     // Catch:{ all -> 0x03a6 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x03a6 }
        L_0x0069:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x00ae
            X.3ZH r13 = X.C18310x6.A0R(r14)     // Catch:{ all -> 0x03a6 }
            X.4uZ r0 = r13.A0H     // Catch:{ all -> 0x03a6 }
            boolean r0 = X.C621733w.A02(r0)     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x0069
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r13.A0I(r3)     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x0069
            X.2k5 r0 = r13.A0F     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x03a6 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x0090
            goto L_0x0069
        L_0x0090:
            X.4uZ r0 = r13.A0H     // Catch:{ all -> 0x03a6 }
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x0069
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A05(r13, r3)     // Catch:{ all -> 0x03a6 }
            r2.add(r0)     // Catch:{ all -> 0x03a6 }
            goto L_0x0069
        L_0x00a0:
            X.3dJ r0 = r0.A03(r11, r6)     // Catch:{ all -> 0x03a6 }
            java.lang.Object r11 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x00ab }
            X.304 r11 = (X.AnonymousClass304) r11     // Catch:{ InterruptedException | ExecutionException -> 0x00ab }
            goto L_0x0044
        L_0x00ab:
            X.304 r11 = X.AnonymousClass304.A03     // Catch:{ all -> 0x03a6 }
            goto L_0x0044
        L_0x00ae:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x00bf
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r7]     // Catch:{ all -> 0x03a6 }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ all -> 0x03a6 }
            com.whatsapp.jid.UserJid[] r0 = (com.whatsapp.jid.UserJid[]) r0     // Catch:{ all -> 0x03a6 }
            r1.A01(r0, r10)     // Catch:{ all -> 0x03a6 }
        L_0x00bf:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "registername/initializer/sync/done result="
            X.C18260x0.A1R(r1, r0, r11)     // Catch:{ all -> 0x03a6 }
            if (r11 == 0) goto L_0x00dd
            int r1 = r11.A00     // Catch:{ all -> 0x03a6 }
            if (r1 != 0) goto L_0x00d3
            r5.A00 = r6     // Catch:{ all -> 0x03a6 }
            goto L_0x039c
        L_0x00d3:
            r0 = 4
            if (r1 == r0) goto L_0x00d9
            r0 = 6
            if (r1 != r0) goto L_0x00dd
        L_0x00d9:
            r5.A00 = r10     // Catch:{ all -> 0x03a6 }
            goto L_0x039c
        L_0x00dd:
            java.lang.String r0 = "registername/setconnection/active"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            X.3Lj r0 = r5.A0W     // Catch:{ all -> 0x03a6 }
            r0.A03(r6)     // Catch:{ all -> 0x03a6 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x03a6 }
            r4.A00 = r0     // Catch:{ all -> 0x03a6 }
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03a6 }
            long r0 = r5.A01     // Catch:{ all -> 0x03a6 }
            long r14 = r14 - r0
        L_0x00f3:
            X.3Lq r3 = r5.A0V     // Catch:{ all -> 0x03a6 }
            X.2OF r13 = r3.A0l     // Catch:{ all -> 0x03a6 }
            boolean r0 = r13.A01     // Catch:{ all -> 0x03a6 }
            r11 = 45000(0xafc8, double:2.2233E-319)
            r1 = 200(0xc8, double:9.9E-322)
            if (r0 == 0) goto L_0x0109
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0109
            long r14 = r14 + r1
            android.os.SystemClock.sleep(r1)     // Catch:{ all -> 0x03a6 }
            goto L_0x00f3
        L_0x0109:
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0118
            boolean r0 = r13.A01     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x0118
            r3.A0A(r10)     // Catch:{ all -> 0x03a6 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x03a6 }
            r4.A00 = r0     // Catch:{ all -> 0x03a6 }
        L_0x0118:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03a6 }
            long r0 = r5.A01     // Catch:{ all -> 0x03a6 }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x03a6 }
            r4.A03 = r0     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "registername/shouldrefreshlists"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            X.33p r10 = r5.A0L     // Catch:{ all -> 0x03a6 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r10)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "refresh_broadcast_lists"
            X.C18270x1.A0l(r1, r0, r6)     // Catch:{ all -> 0x03a6 }
            X.2Zq r0 = r5.A0X     // Catch:{ all -> 0x03a6 }
            r0.A00()     // Catch:{ all -> 0x03a6 }
            X.2r7 r1 = r5.A0B     // Catch:{ all -> 0x03a6 }
            r0 = 0
            r1.A02(r0)     // Catch:{ all -> 0x03a6 }
            X.5rC r1 = r5.A06     // Catch:{ all -> 0x03a6 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x0153
            r1.A04()     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "loadSettingToSharedPreferences"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x03a6 }
        L_0x0152:
            throw r0     // Catch:{ all -> 0x03a6 }
        L_0x0153:
            X.2cW r0 = r5.A0R     // Catch:{ all -> 0x03a6 }
            r0.A00()     // Catch:{ all -> 0x03a6 }
            X.2W1 r0 = r5.A0P     // Catch:{ all -> 0x03a6 }
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x03a6 }
            r0.A05()     // Catch:{ all -> 0x03a6 }
            java.io.File r0 = r0.A05     // Catch:{ all -> 0x03a6 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x017a
            X.33e r0 = r5.A0Q     // Catch:{ all -> 0x03a6 }
            boolean r0 = r0.A0F()     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x017a
            X.2gy r1 = r5.A0C     // Catch:{ all -> 0x03a6 }
            X.5rC r0 = r5.A08     // Catch:{ all -> 0x03a6 }
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = com.whatsapp.jobqueue.job.GetStatusPrivacyJob.A00(r0)     // Catch:{ all -> 0x03a6 }
            r1.A02(r0)     // Catch:{ all -> 0x03a6 }
        L_0x017a:
            X.9dq r0 = r5.A0Y     // Catch:{ all -> 0x03a6 }
            r0.A01(r6, r7)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "registername/reintialized payments"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            r3 = 0
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r10)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "registration_biz_registered_on_device"
            X.C18270x1.A0l(r1, r0, r7)     // Catch:{ all -> 0x03a6 }
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03a6 }
            java.util.HashMap r13 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x03a6 }
            X.3Lo r0 = r5.A0O     // Catch:{ all -> 0x03a6 }
            r14 = 50
            java.util.List r0 = r0.A03(r14)     // Catch:{ all -> 0x03a6 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x03a6 }
        L_0x01a4:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x03a6 }
            r12 = 2
            if (r0 == 0) goto L_0x01cb
            X.3ZH r11 = X.C18310x6.A0R(r15)     // Catch:{ all -> 0x03a6 }
            java.lang.Class<X.4uZ> r2 = X.C95814uZ.class
            com.whatsapp.jid.Jid r1 = r11.A0I(r2)     // Catch:{ all -> 0x03a6 }
            if (r1 == 0) goto L_0x01a4
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x01bf
            X.AnonymousClass0x2.A1I(r1, r13, r7)     // Catch:{ all -> 0x03a6 }
            goto L_0x01a4
        L_0x01bf:
            X.2s0 r1 = r5.A0Z     // Catch:{ all -> 0x03a6 }
            com.whatsapp.jid.Jid r0 = r11.A0I(r2)     // Catch:{ all -> 0x03a6 }
            X.4uZ r0 = (X.C95814uZ) r0     // Catch:{ all -> 0x03a6 }
            r1.A01(r0, r7, r12)     // Catch:{ all -> 0x03a6 }
            goto L_0x01a4
        L_0x01cb:
            X.3Ex r0 = r5.A0F     // Catch:{ all -> 0x03a6 }
            java.util.ArrayList r15 = r0.A0F()     // Catch:{ all -> 0x03a6 }
            X.1VX r1 = r5.A0T     // Catch:{ all -> 0x03a6 }
            r0 = 5819(0x16bb, float:8.154E-42)
            X.2vE r11 = X.C58422vE.A02     // Catch:{ all -> 0x03a6 }
            boolean r0 = r1.A0Y(r11, r0)     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x01fa
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x03a6 }
            java.util.Iterator r2 = r15.iterator()     // Catch:{ all -> 0x03a6 }
        L_0x01e5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x01f9
            X.3ZH r0 = X.C18310x6.A0R(r2)     // Catch:{ all -> 0x03a6 }
            X.3ZH r0 = r0.A0G()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x01e5
            r1.add(r0)     // Catch:{ all -> 0x03a6 }
            goto L_0x01e5
        L_0x01f9:
            r15 = r1
        L_0x01fa:
            X.5ZU r2 = r5.A0G     // Catch:{ Exception -> 0x025f }
            X.33j r1 = r5.A0N     // Catch:{ Exception -> 0x025f }
            X.5sc r0 = new X.5sc     // Catch:{ Exception -> 0x025f }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x025f }
            java.util.Collections.sort(r15, r0)     // Catch:{ Exception -> 0x025f }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Exception -> 0x025f }
            r2 = 0
        L_0x020b:
            boolean r0 = r15.hasNext()     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x022c
            X.3ZH r0 = X.C18310x6.A0R(r15)     // Catch:{ Exception -> 0x025f }
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3ZH.A07(r0)     // Catch:{ Exception -> 0x025f }
            boolean r0 = r0.A10     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x020b
            if (r1 == 0) goto L_0x020b
            boolean r0 = r13.containsKey(r1)     // Catch:{ Exception -> 0x025f }
            if (r0 != 0) goto L_0x020b
            int r2 = r2 + 1
            X.AnonymousClass0x2.A1I(r1, r13, r7)     // Catch:{ Exception -> 0x025f }
            if (r2 <= r14) goto L_0x020b
        L_0x022c:
            X.2s0 r2 = r5.A0Z     // Catch:{ Exception -> 0x025f }
            X.1VX r1 = r2.A09     // Catch:{ Exception -> 0x025f }
            r0 = 609(0x261, float:8.53E-43)
            int r0 = r1.A0O(r11, r0)     // Catch:{ Exception -> 0x025f }
            if (r0 < r6) goto L_0x0241
            java.util.Set r1 = r13.keySet()     // Catch:{ Exception -> 0x025f }
            r0 = 0
            r2.A06(r0, r1, r12)     // Catch:{ Exception -> 0x025f }
            goto L_0x0269
        L_0x0241:
            java.util.Iterator r13 = X.AnonymousClass001.A0u(r13)     // Catch:{ Exception -> 0x025f }
        L_0x0245:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x0269
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r13)     // Catch:{ Exception -> 0x025f }
            X.4uZ r1 = X.C18320x8.A0N(r0)     // Catch:{ Exception -> 0x025f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x025f }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception -> 0x025f }
            r2.A01(r1, r0, r12)     // Catch:{ Exception -> 0x025f }
            goto L_0x0245
        L_0x025f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "RegistrationInitializer/prefetchPhotos failed - "
            X.C18260x0.A16(r0, r1, r2)     // Catch:{ all -> 0x03a6 }
        L_0x0269:
            X.2sr r2 = r5.A0A     // Catch:{ all -> 0x03a6 }
            X.1RR r0 = X.C56972sr.A01(r2)     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x027e
            int r0 = r0.A05     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x027e
            X.2s0 r1 = r5.A0Z     // Catch:{ all -> 0x03a6 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r2)     // Catch:{ all -> 0x03a6 }
            r1.A01(r0, r7, r6)     // Catch:{ all -> 0x03a6 }
        L_0x027e:
            X.2aH r0 = r5.A0c     // Catch:{ all -> 0x03a6 }
            X.2jH r1 = r0.A02     // Catch:{ all -> 0x03a6 }
            monitor-enter(r1)     // Catch:{ all -> 0x03a6 }
            java.util.HashMap r0 = r1.A00     // Catch:{ all -> 0x0353 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0353 }
            monitor-exit(r1)     // Catch:{ all -> 0x03a6 }
            r12 = 10000(0x2710, double:4.9407E-320)
            if (r0 != 0) goto L_0x029b
            long r0 = (long) r3     // Catch:{ all -> 0x03a6 }
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x029b
            r0 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r0)     // Catch:{ all -> 0x03a6 }
            int r3 = r3 + 200
            goto L_0x027e
        L_0x029b:
            long r0 = (long) r3
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1U(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x03a6 }
            r4.A01 = r0     // Catch:{ all -> 0x03a6 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03a6 }
            r0 = r16
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x03a6 }
            r4.A04 = r0     // Catch:{ all -> 0x03a6 }
            r5.A04 = r6     // Catch:{ all -> 0x03a6 }
            X.2hB r2 = r5.A0S     // Catch:{ all -> 0x03a6 }
            X.2sr r0 = r2.A00     // Catch:{ all -> 0x03a6 }
            boolean r0 = r0.A0Y()     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x02dc
            X.1VW r1 = r2.A03     // Catch:{ all -> 0x03a6 }
            r0 = 5697(0x1641, float:7.983E-42)
            boolean r0 = r1.A0Y(r11, r0)     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x02dc
            r0 = 6114(0x17e2, float:8.568E-42)
            boolean r0 = r1.A0Y(r11, r0)     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x02dc
            X.5TX r1 = r2.A02     // Catch:{ all -> 0x03a6 }
            X.4Ij r0 = new X.4Ij     // Catch:{ all -> 0x03a6 }
            r0.<init>(r2, r6)     // Catch:{ all -> 0x03a6 }
            r1.A02(r0)     // Catch:{ all -> 0x03a6 }
        L_0x02dc:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03a6 }
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r10)     // Catch:{ all -> 0x03a6 }
            java.lang.String r2 = "registration_initialized_time"
            X.C18270x1.A0i(r3, r2, r0)     // Catch:{ all -> 0x03a6 }
            X.317 r1 = r5.A0b     // Catch:{ all -> 0x03a6 }
            r0 = 3
            r1.A0B(r0, r6)     // Catch:{ all -> 0x03a6 }
            X.5rC r1 = r5.A05     // Catch:{ all -> 0x03a6 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x0304
            r1.A04()     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "setReceivedCertRelatedNack"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x03a6 }
            goto L_0x0152
        L_0x0304:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03a6 }
            java.lang.Long r0 = X.C18310x6.A0f(r0, r8)     // Catch:{ all -> 0x03a6 }
            r4.A05 = r0     // Catch:{ all -> 0x03a6 }
            X.4FV r0 = r5.A0U     // Catch:{ all -> 0x03a6 }
            r0.BhD(r4)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "registername/setregverified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "registername/fin/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            boolean r0 = r10.A28()     // Catch:{ all -> 0x03a6 }
            if (r0 != 0) goto L_0x0333
            java.lang.String r0 = "RegistrationInitializer/Enabling archive2.0"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03a6 }
            X.34f r0 = r5.A0K     // Catch:{ all -> 0x03a6 }
            r0.A02()     // Catch:{ all -> 0x03a6 }
        L_0x0333:
            X.2NN r1 = r5.A0E     // Catch:{ all -> 0x03a6 }
            monitor-enter(r1)     // Catch:{ all -> 0x03a6 }
            X.3Mg r0 = r1.A02     // Catch:{ all -> 0x0353 }
            boolean r0 = X.C66653Mg.A00(r0)     // Catch:{ all -> 0x0353 }
            if (r0 != 0) goto L_0x0357
            java.lang.String r0 = "MDOptInInitializer/forceOptIn updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0353 }
            monitor-enter(r1)     // Catch:{ all -> 0x0353 }
            java.lang.String r0 = "MDOptInInitializer/Opting In"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0350 }
            X.2ZS r0 = r1.A00     // Catch:{ all -> 0x0350 }
            r0.A00()     // Catch:{ all -> 0x0350 }
            monitor-exit(r1)     // Catch:{ all -> 0x0353 }
            goto L_0x0357
        L_0x0350:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0353 }
            throw r0     // Catch:{ all -> 0x0353 }
        L_0x0353:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03a6 }
            goto L_0x0152
        L_0x0357:
            monitor-exit(r1)     // Catch:{ all -> 0x03a6 }
            X.5Mp r2 = r5.A0D     // Catch:{ all -> 0x03a6 }
            X.5J0 r0 = r2.A01()     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x039c
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r10)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "pref_wfs_user"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x039c
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r10)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "pref_wfs_pw"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x039c
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r10)     // Catch:{ all -> 0x03a6 }
            java.lang.String r0 = "pref_wfs_id_sign"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)     // Catch:{ all -> 0x03a6 }
            if (r0 == 0) goto L_0x039c
            X.5J0 r0 = r2.A01()     // Catch:{ all -> 0x03a6 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x03a6 }
            X.2Rs r3 = r0.A03     // Catch:{ all -> 0x03a6 }
            X.4FS r2 = r3.A02     // Catch:{ all -> 0x03a6 }
            r1 = 40
            X.5rO r0 = new X.5rO     // Catch:{ all -> 0x03a6 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x03a6 }
            r2.BkM(r0)     // Catch:{ all -> 0x03a6 }
        L_0x039c:
            r5.A03 = r6
            android.os.Handler r0 = r5.A02
            if (r0 == 0) goto L_0x03a5
            r0.sendEmptyMessage(r7)
        L_0x03a5:
            return
        L_0x03a6:
            r1 = move-exception
            r5.A03 = r6
            android.os.Handler r0 = r5.A02
            if (r0 == 0) goto L_0x03b0
            r0.sendEmptyMessage(r7)
        L_0x03b0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71223bl.run():void");
    }

    public C71223bl(Handler handler, C116985rC r4, C116985rC r5, C116985rC r6, C116985rC r7, C116985rC r8, C56972sr r9, C55912r7 r10, C49712gy r11, C103365Mp r12, AnonymousClass2NN r13, C64773Ex r14, AnonymousClass5ZU r15, C64223Cq r16, C56882si r17, C64213Cp r18, C622334f r19, AnonymousClass33p r20, C54412og r21, C620733j r22, C66473Lo r23, AnonymousClass2W1 r24, C620233e r25, C46982cW r26, C49842hB r27, AnonymousClass1VX r28, AnonymousClass4FV r29, C66493Lq r30, C66423Lj r31, C45342Zq r32, C197769dq r33, C56452s0 r34, AnonymousClass48T r35, AnonymousClass317 r36, C45602aH r37) {
        this.A0a = r35;
        this.A02 = handler;
        this.A0T = r28;
        this.A07 = r4;
        this.A0A = r9;
        this.A0U = r29;
        this.A0K = r19;
        this.A0Q = r25;
        this.A0C = r11;
        this.A0F = r14;
        this.A0G = r15;
        this.A0N = r22;
        this.A09 = r5;
        this.A0c = r37;
        this.A0V = r30;
        this.A0J = r18;
        this.A0H = r16;
        this.A0W = r31;
        this.A0Z = r34;
        this.A0b = r36;
        this.A0L = r20;
        this.A0X = r32;
        this.A0B = r10;
        this.A08 = r6;
        this.A0R = r26;
        this.A0S = r27;
        this.A0Y = r33;
        this.A05 = r7;
        this.A06 = r8;
        this.A0P = r24;
        this.A0O = r23;
        this.A0M = r21;
        this.A0E = r13;
        this.A0I = r17;
        this.A0D = r12;
    }
}
