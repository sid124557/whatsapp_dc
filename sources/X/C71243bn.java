package X;

import android.content.ContentProviderOperation;
import android.net.Uri;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3bn  reason: invalid class name and case insensitive filesystem */
public class C71243bn implements Runnable {
    public final C61272zz A00;
    public final /* synthetic */ C64193Cn A01;

    public C71243bn(C64193Cn r1, C61272zz r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static ContentProviderOperation.Builder A00(ContentProviderOperation.Builder builder, Jid jid, Object obj) {
        return builder.withValue("data1", jid.getRawString()).withValue("data2", obj);
    }

    public final void A02(AnonymousClass304 r7) {
        boolean isEmpty;
        C61272zz r5 = this.A00;
        List<C33161sX> list = r5.A03;
        synchronized (list) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (C33161sX r1 : list) {
                if (!r1.A00) {
                    A0s.add(r1);
                    r1.BQt(r7);
                }
            }
            list.removeAll(A0s);
            isEmpty = list.isEmpty();
        }
        if (!isEmpty) {
            r5.A01 = false;
            this.A01.A02(r5);
        }
    }

    public final void A03(AnonymousClass304 r4) {
        List<C33161sX> list = this.A00.A03;
        synchronized (list) {
            for (C33161sX BQt : list) {
                BQt.BQt(r4);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:1041:0x1057 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:629:0x0fe6  */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x0fec A[Catch:{ all -> 0x101c, all -> 0x1023, Exception -> 0x1037, OutOfMemoryError -> 0x1028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:656:0x105d A[Catch:{ Exception -> 0x0e5f }] */
    /* JADX WARNING: Removed duplicated region for block: B:680:0x10f5 A[Catch:{ Exception -> 0x0e5f }] */
    /* JADX WARNING: Removed duplicated region for block: B:755:0x1326 A[Catch:{ Exception -> 0x0e5f }] */
    /* JADX WARNING: Removed duplicated region for block: B:758:0x133e A[Catch:{ Exception -> 0x0e5f }] */
    /* JADX WARNING: Removed duplicated region for block: B:762:0x1367 A[Catch:{ Exception -> 0x0e5f }] */
    /* JADX WARNING: Removed duplicated region for block: B:786:0x153e A[Catch:{ Exception -> 0x0e5f }] */
    /* JADX WARNING: Removed duplicated region for block: B:789:0x157c A[Catch:{ Exception -> 0x0e5f }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:869:0x16e5  */
    /* JADX WARNING: Removed duplicated region for block: B:873:0x1700  */
    /* JADX WARNING: Removed duplicated region for block: B:874:0x1715  */
    /* JADX WARNING: Removed duplicated region for block: B:883:0x1742 A[SYNTHETIC, Splitter:B:883:0x1742] */
    /* JADX WARNING: Removed duplicated region for block: B:890:0x1775 A[Catch:{ all -> 0x17a1, all -> 0x17a6, all -> 0x17ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02fe  */
    public void run() {
        /*
            r90 = this;
            r89 = r90
            r0 = r89
            X.3Cn r5 = r0.A01
            X.2zz r2 = r0.A00
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x002d
            X.1VX r3 = r5.A0P
            r1 = 560(0x230, float:7.85E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x002d
            X.1im r0 = r5.A05
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "ContactSyncRequestExecutor/onStartRun exiting early for non-urgent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.304 r1 = X.AnonymousClass304.A05
            r0 = r89
            r0.A03(r1)
            return
        L_0x002d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0X
            r27 = r0
            monitor-enter(r27)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1857 }
            java.lang.String r0 = "ContactSyncRequestExecutor/onStart "
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x1857 }
            r1 = 1
            r0 = r27
            r0.set(r1)     // Catch:{ all -> 0x1857 }
            X.2p3 r0 = r5.A0H     // Catch:{ all -> 0x1857 }
            r25 = r0
            r0.A00(r2)     // Catch:{ all -> 0x1857 }
            monitor-enter(r25)     // Catch:{ all -> 0x1857 }
            r0.A00 = r2     // Catch:{ all -> 0x1854 }
            r25.A01()     // Catch:{ all -> 0x1854 }
            monitor-exit(r25)     // Catch:{ all -> 0x1857 }
            monitor-exit(r27)     // Catch:{ all -> 0x1857 }
            X.3Wi r0 = r5.A03
            r88 = r0
            X.8qC r0 = r5.A0U
            java.lang.Object r3 = r0.get()
            java.util.Objects.requireNonNull(r3)
            r1 = 32
            r0 = r88
            X.C69263Wi.A02(r0, r3, r1)
            boolean r0 = r2.A0B
            r18 = r0
            boolean r0 = r2.A0H
            r17 = r0
            boolean r0 = r2.A0I
            r21 = r0
            boolean r6 = r2.A0G
            boolean r0 = r2.A0A
            r23 = r0
            boolean r0 = r2.A0C
            r19 = r0
            boolean r7 = r2.A0F
            boolean r0 = r2.A0D
            r22 = r0
            boolean r0 = r2.A0E
            r24 = r0
            boolean r0 = r2.A09
            r20 = r0
            boolean r0 = r2.A0K
            r26 = r0
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x009a
            X.1VX r0 = r5.A0P
            boolean r0 = X.C56952sp.A0F(r0)
            r59 = 1
            if (r0 != 0) goto L_0x009c
        L_0x009a:
            r59 = 0
        L_0x009c:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x00bf
            X.2sr r0 = r5.A04
            com.whatsapp.Me r0 = X.C56972sr.A00(r0)
            if (r0 == 0) goto L_0x00b0
            X.2jE r0 = r5.A0S
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x00bf
        L_0x00b0:
            java.lang.String r0 = "ContactSyncRequestExecutor/registration not complete"
        L_0x00b2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00b5:
            X.304 r3 = X.AnonymousClass304.A03
        L_0x00b7:
            r0 = r89
            r0.A03(r3)
        L_0x00bc:
            monitor-enter(r27)
            goto L_0x17d5
        L_0x00bf:
            X.1ip r0 = r5.A09
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "ContactSyncRequestExecutor/no-network"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.304 r3 = X.AnonymousClass304.A04
            r0 = r89
            r0.A02(r3)
            goto L_0x00bc
        L_0x00d4:
            X.2sH r0 = r5.A0K
            long r0 = r0.A0H()
            X.2si r3 = r5.A0C
            r87 = r3
            android.content.SharedPreferences r8 = r87.A02()
            java.lang.String r11 = "global_backoff_time"
            r3 = -1
            long r9 = r8.getLong(r11, r3)
            java.lang.String r42 = "ms"
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x011a
            X.1VX r10 = r5.A0P
            r9 = 1297(0x511, float:1.817E-42)
            X.2vE r8 = X.C58422vE.A02
            boolean r8 = r10.A0Y(r8, r9)
            if (r8 == 0) goto L_0x011a
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ContactSyncRequestExecutor/global backoff for another "
            r6.append(r2)
            r2 = r87
            long r2 = X.C56882si.A00(r2, r11, r3)
            long r2 = r2 - r0
            r6.append(r2)
            r0 = r42
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r6)
        L_0x0116:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00b5
        L_0x011a:
            X.227 r9 = r2.A02
            X.21Z r4 = r9.mode
            X.21Z r31 = X.AnonymousClass21Z.FULL
            r3 = r31
            if (r4 != r3) goto L_0x0376
            if (r18 == 0) goto L_0x0150
            android.content.SharedPreferences r8 = r87.A02()
            java.lang.String r11 = "contact_sync_backoff"
            r3 = -1
            long r12 = r8.getLong(r11, r3)
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0150
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r8 = "ContactSyncRequestExecutor/contact backoff for another "
            r10.append(r8)
            r8 = r87
            long r3 = X.C56882si.A00(r8, r11, r3)
            long r3 = r3 - r0
            r10.append(r3)
            r3 = r42
            X.C18260x0.A1L(r10, r3)
            r18 = 0
        L_0x0150:
            if (r17 == 0) goto L_0x017d
            android.content.SharedPreferences r8 = r87.A02()
            java.lang.String r11 = "sidelist_sync_backoff"
            r3 = -1
            long r12 = r8.getLong(r11, r3)
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x017d
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r8 = "ContactSyncRequestExecutor/sidelist backoff for another "
            r10.append(r8)
            r8 = r87
            long r3 = X.C56882si.A00(r8, r11, r3)
            long r3 = r3 - r0
            r10.append(r3)
            r3 = r42
            X.C18260x0.A1L(r10, r3)
            r17 = 0
        L_0x017d:
            if (r21 == 0) goto L_0x01aa
            android.content.SharedPreferences r8 = r87.A02()
            java.lang.String r11 = "status_sync_backoff"
            r3 = -1
            long r12 = r8.getLong(r11, r3)
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x01aa
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r8 = "ContactSyncRequestExecutor/status backoff for another "
            r10.append(r8)
            r8 = r87
            long r3 = X.C56882si.A00(r8, r11, r3)
            long r3 = r3 - r0
            r10.append(r3)
            r3 = r42
            X.C18260x0.A1L(r10, r3)
            r21 = 0
        L_0x01aa:
            if (r59 == 0) goto L_0x01d7
            android.content.SharedPreferences r8 = r87.A02()
            java.lang.String r11 = "text_status_sync_backoff"
            r3 = -1
            long r12 = r8.getLong(r11, r3)
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x01d7
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r8 = "ContactSyncRequestExecutor/text status backoff for another "
            r10.append(r8)
            r8 = r87
            long r3 = X.C56882si.A00(r8, r11, r3)
            long r3 = r3 - r0
            r10.append(r3)
            r3 = r42
            X.C18260x0.A1L(r10, r3)
            r59 = 0
        L_0x01d7:
            if (r6 == 0) goto L_0x0202
            android.content.SharedPreferences r6 = r87.A02()
            java.lang.String r10 = "picture_sync_backoff"
            r3 = -1
            long r11 = r6.getLong(r10, r3)
            int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x035c
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "ContactSyncRequestExecutor/picture backoff for another "
            r8.append(r6)
            r6 = r87
            long r3 = X.C56882si.A00(r6, r10, r3)
            long r3 = r3 - r0
            r8.append(r3)
            r3 = r42
            X.C18260x0.A1L(r8, r3)
        L_0x0202:
            r51 = 0
        L_0x0204:
            if (r23 == 0) goto L_0x0230
            android.content.SharedPreferences r6 = r87.A02()
            java.lang.String r10 = "business_sync_backoff"
            r3 = -1
            long r11 = r6.getLong(r10, r3)
            int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0230
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "ContactSyncRequestExecutor/business backoff for another "
            r8.append(r6)
            r6 = r87
            long r3 = X.C56882si.A00(r6, r10, r3)
            long r3 = r3 - r0
            r8.append(r3)
            r3 = r42
            X.C18260x0.A1L(r8, r3)
            r23 = 0
        L_0x0230:
            if (r19 == 0) goto L_0x0266
            android.content.SharedPreferences r3 = r87.A02()
            java.lang.String r4 = "devices_sync_backoff"
            long r10 = X.AnonymousClass0x2.A0A(r3, r4)
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0266
            X.21x r6 = r9.context
            X.21x r3 = X.C373521x.MESSAGE
            if (r6 == r3) goto L_0x0266
            X.21x r3 = X.C373521x.VOIP
            if (r6 == r3) goto L_0x0266
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "ContactSyncRequestExecutor/devices backoff for another "
            r6.append(r3)
            android.content.SharedPreferences r3 = r87.A02()
            long r3 = X.AnonymousClass0x2.A0A(r3, r4)
            long r3 = r3 - r0
            r6.append(r3)
            r3 = r42
            X.C18260x0.A1L(r6, r3)
            r19 = 0
        L_0x0266:
            if (r7 == 0) goto L_0x0291
            android.content.SharedPreferences r6 = r87.A02()
            java.lang.String r8 = "payment_sync_backoff"
            r3 = -1
            long r10 = r6.getLong(r8, r3)
            int r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0350
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "ContactSyncRequestExecutor/payment backoff for another "
            r7.append(r6)
            r6 = r87
            long r3 = X.C56882si.A00(r6, r8, r3)
            long r3 = r3 - r0
            r7.append(r3)
            r3 = r42
            X.C18260x0.A1L(r7, r3)
        L_0x0291:
            r54 = 0
        L_0x0293:
            if (r22 == 0) goto L_0x02bf
            android.content.SharedPreferences r6 = r87.A02()
            java.lang.String r8 = "disappearing_mode_sync_backoff"
            r3 = -1
            long r10 = r6.getLong(r8, r3)
            int r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x02bf
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "ContactSyncRequestExecutor/disappearing_mode backoff for another "
            r7.append(r6)
            r6 = r87
            long r3 = X.C56882si.A00(r6, r8, r3)
            long r3 = r3 - r0
            r7.append(r3)
            r3 = r42
            X.C18260x0.A1L(r7, r3)
            r22 = 0
        L_0x02bf:
            android.content.SharedPreferences r4 = r87.A02()
            java.lang.String r3 = "lid_sync_backoff"
            r6 = -1
            long r3 = r4.getLong(r3, r6)
            if (r24 == 0) goto L_0x02e5
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x02e5
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r10 = "ContactSyncRequestExecutor/lid backoff for another "
            r8.append(r10)
            long r3 = r3 - r0
            r8.append(r3)
            r3 = r42
            X.C18260x0.A1L(r8, r3)
            r24 = 0
        L_0x02e5:
            X.1VX r3 = r5.A0P
            r86 = r3
            r8 = 5290(0x14aa, float:7.413E-42)
            X.2vE r32 = X.C58422vE.A02
            r4 = r3
            r3 = r32
            boolean r3 = r4.A0Y(r3, r8)
            r26 = r26 & r3
            X.5rC r3 = r5.A01
            boolean r4 = r3.A07()
            if (r4 == 0) goto L_0x030d
            java.lang.Object r3 = r3.A04()
            X.2sS r3 = (X.C56722sS) r3
            X.2m4 r3 = r3.A01
            boolean r4 = r3.A00()
            r3 = 1
            if (r4 != 0) goto L_0x030e
        L_0x030d:
            r3 = 0
        L_0x030e:
            r20 = r20 & r3
            android.content.SharedPreferences r4 = r87.A02()
            java.lang.String r3 = "bot_sync_backoff"
            long r3 = r4.getLong(r3, r6)
            if (r20 == 0) goto L_0x0334
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0334
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "ContactSyncRequestExecutor/bot backoff for another "
            r7.append(r6)
            long r3 = r3 - r0
            r7.append(r3)
            r3 = r42
            X.C18260x0.A1L(r7, r3)
            r20 = 0
        L_0x0334:
            if (r18 != 0) goto L_0x0398
            if (r17 != 0) goto L_0x0398
            if (r51 != 0) goto L_0x0398
            if (r21 != 0) goto L_0x0398
            if (r23 != 0) goto L_0x0398
            if (r19 != 0) goto L_0x0398
            if (r54 != 0) goto L_0x0398
            if (r22 != 0) goto L_0x0398
            if (r24 != 0) goto L_0x0398
            if (r20 != 0) goto L_0x0398
            if (r26 != 0) goto L_0x0398
            if (r59 != 0) goto L_0x0398
            java.lang.String r0 = "ContactSyncRequestExecutor/no syncing protocol should be requested at this moment due to error backoff"
            goto L_0x00b2
        L_0x0350:
            X.99n r3 = r5.A0Q
            boolean r3 = r3.A0E()
            r54 = 1
            if (r3 != 0) goto L_0x0293
            goto L_0x0291
        L_0x035c:
            X.2s0 r3 = r5.A0R
            boolean r3 = r3.A07()
            if (r3 != 0) goto L_0x0372
            X.227 r3 = X.AnonymousClass227.A0J
            if (r9 == r3) goto L_0x0372
            X.227 r3 = X.AnonymousClass227.A06
            if (r9 == r3) goto L_0x0372
            X.227 r3 = X.AnonymousClass227.A07
            if (r9 == r3) goto L_0x0372
            if (r20 == 0) goto L_0x0202
        L_0x0372:
            r51 = 1
            goto L_0x0204
        L_0x0376:
            X.21Z r3 = X.AnonymousClass21Z.DELTA
            if (r4 != r3) goto L_0x017d
            X.1VX r8 = r5.A0P
            r4 = 949(0x3b5, float:1.33E-42)
            X.2vE r3 = X.C58422vE.A02
            boolean r3 = r8.A0Y(r3, r4)
            if (r3 == 0) goto L_0x017d
            android.content.SharedPreferences r4 = r87.A02()
            java.lang.String r3 = "delta_sync_backoff"
            long r10 = X.AnonymousClass0x2.A0A(r4, r3)
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x017d
            java.lang.String r0 = "ContactSyncRequestExecutor/delta sync backoff"
            goto L_0x0116
        L_0x0398:
            X.2xs r3 = r5.A0D
            r85 = r3
            X.1bJ r6 = new X.1bJ
            r6.<init>()
            java.lang.String r3 = r9.toString()
            r6.A0I = r3
            boolean r3 = r2.A01
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6.A02 = r3
            boolean r3 = r2.A06
            r33 = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r33)
            r6.A01 = r3
            int r3 = r2.A00
            java.lang.Long r3 = X.AnonymousClass0x9.A0m(r3)
            r6.A0E = r3
            boolean r3 = r2.A03()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6.A03 = r3
            r3 = r85
            java.util.HashMap r7 = r3.A02
            X.2sH r3 = r3.A00
            long r3 = r3.A0H()
            X.AnonymousClass0x2.A1J(r6, r7, r3)
            X.2zf r3 = r5.A0N
            r84 = r3
            long r28 = r84.A03()
            X.2yu r35 = new X.2yu
            r35.<init>()
            X.2yv r8 = new X.2yv
            r8.<init>()
            X.20t r4 = r9.scope
            X.20t r40 = X.C370520t.PHONEBOOK
            r3 = r40
            if (r4 == r3) goto L_0x03f8
            X.20t r3 = X.C370520t.PHONEBOOK_AND_SIDELIST
            r30 = 0
            if (r4 != r3) goto L_0x03fa
        L_0x03f8:
            r30 = 1
        L_0x03fa:
            X.20t r39 = X.C370520t.SIDELIST
            r3 = r39
            if (r4 == r3) goto L_0x0406
            X.20t r3 = X.C370520t.PHONEBOOK_AND_SIDELIST
            r34 = 0
            if (r4 != r3) goto L_0x0408
        L_0x0406:
            r34 = 1
        L_0x0408:
            if (r30 == 0) goto L_0x068f
            X.2Xq r3 = r5.A0E
            X.2yu r35 = r3.A00()
            X.2Xr r3 = r5.A0F
            X.2yv r8 = r3.A00()
            X.3Ex r13 = r5.A0A
            X.33i r7 = r5.A0J
            X.5ZR r4 = r5.A0M
            java.lang.String r3 = "android.permission.READ_CONTACTS"
            int r3 = r4.A02(r3)
            if (r3 == 0) goto L_0x05ac
            java.lang.String r3 = "system-contacts-query/all/permission_denied"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            java.util.Map r7 = java.util.Collections.emptyMap()
            if (r7 != 0) goto L_0x05f8
        L_0x0430:
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.Map r4 = java.util.Collections.emptyMap()
            X.2KA r16 = new X.2KA
            r3 = r16
            r3.<init>(r7, r4)
        L_0x043f:
            java.util.Map r3 = r3.A01
            int r4 = r3.size()
            r3 = r16
            java.util.List r3 = r3.A00
            int r3 = r3.size()
            int r4 = r4 + r3
            java.lang.Long r3 = X.AnonymousClass0x9.A0m(r4)
            r6.A06 = r3
        L_0x0454:
            r47 = 0
        L_0x0456:
            boolean r3 = r2.A07
            if (r3 == 0) goto L_0x0490
            X.21Z r4 = r9.mode
            X.21Z r3 = X.AnonymousClass21Z.DELTA
            if (r4 != r3) goto L_0x0490
            X.21x r4 = r9.context
            X.21x r3 = X.C373521x.CONTACT_DISCOVERY
            if (r4 == r3) goto L_0x0490
            if (r34 == 0) goto L_0x05a9
            if (r17 == 0) goto L_0x05a9
            X.3Ex r4 = r5.A0A
            X.314 r3 = r5.A0I
            java.util.Set r3 = r3.A0B()
            java.util.List r47 = r4.A0H(r3)
            int r4 = r47.size()
        L_0x047a:
            if (r16 == 0) goto L_0x0564
            r3 = r16
            java.util.List r3 = r3.A00
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0490
            r3 = r16
            java.util.Map r3 = r3.A01
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0564
        L_0x0490:
            X.20t r4 = r9.scope
            X.20t r38 = X.C370520t.MULTI_PROTOCOLS_QUERY
            r3 = r38
            if (r4 != r3) goto L_0x04a4
            java.util.Set r3 = r2.A05
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x17bd
            java.util.List r47 = r5.A01(r3)
        L_0x04a4:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "ContactSyncManager/fullSync: mode="
            r4.append(r3)
            X.21Z r3 = r9.mode
            java.lang.String r3 = r3.modeString
            r4.append(r3)
            java.lang.String r3 = "; context="
            r4.append(r3)
            X.21x r3 = r9.context
            java.lang.String r3 = r3.contextString
            r4.append(r3)
            java.lang.String r3 = "; isContact="
            r4.append(r3)
            r3 = r18
            r4.append(r3)
            java.lang.String r3 = "; isSidelist="
            r4.append(r3)
            r3 = r17
            r4.append(r3)
            java.lang.String r3 = "; retry="
            r4.append(r3)
            int r3 = r2.A00
            r4.append(r3)
            java.lang.String r3 = "; urgent="
            r4.append(r3)
            boolean r3 = r2.A01
            X.C18260x0.A1V(r4, r3)
            X.21Z r7 = r9.mode
            r3 = r31
            if (r7 != r3) goto L_0x04f0
            if (r18 != 0) goto L_0x0500
        L_0x04f0:
            X.21x r4 = r9.context
            X.21x r3 = X.C373521x.NOTIFICATION
            if (r4 != r3) goto L_0x04f8
            if (r30 != 0) goto L_0x0500
        L_0x04f8:
            X.21Z r3 = X.AnonymousClass21Z.DELTA
            if (r7 != r3) goto L_0x0561
            if (r30 == 0) goto L_0x0561
            if (r34 == 0) goto L_0x0561
        L_0x0500:
            X.3Ex r3 = r5.A0A
            X.1vC r3 = r3.A05
            java.util.List r64 = r3.A0E()
        L_0x0508:
            X.21Z r4 = r9.mode
            r3 = r31
            if (r4 != r3) goto L_0x055e
            X.3Ex r3 = r5.A0A
            java.util.ArrayList r65 = r3.A0F()
        L_0x0514:
            X.21x r4 = r9.context
            X.21x r37 = X.C373521x.NOTIFICATION
            r3 = r37
            if (r4 != r3) goto L_0x055b
            if (r34 == 0) goto L_0x055b
            X.2sr r3 = r5.A04
            boolean r3 = r3.A0Y()
            if (r3 == 0) goto L_0x054d
            X.3Ex r4 = r5.A0A
            X.314 r3 = r5.A0I
            java.util.Set r3 = r3.A0B()
            java.util.List r66 = r4.A0H(r3)
        L_0x0532:
            X.34t r4 = r5.A0B
            X.2en r3 = r5.A08
            int r48 = r3.A00()
            java.util.List r3 = r2.A04
            r43 = r3
            X.33g r3 = r5.A07
            java.util.Map r8 = r3.A04()
            X.9U4 r3 = r4.A0M
            X.9TA r36 = r3.A0E()
            r10 = 0
            goto L_0x06b4
        L_0x054d:
            X.3Ex r3 = r5.A0A
            X.1vC r4 = r3.A05
            r3 = 1
            java.util.List r3 = r4.A0F(r3)
            java.util.ArrayList r66 = X.AnonymousClass002.A0J(r3)
            goto L_0x0532
        L_0x055b:
            r66 = 0
            goto L_0x0532
        L_0x055e:
            r65 = 0
            goto L_0x0514
        L_0x0561:
            r64 = 0
            goto L_0x0508
        L_0x0564:
            if (r4 != 0) goto L_0x0490
            r3 = r35
            X.66R r3 = r3.A02
            boolean r3 = X.C18270x1.A1V(r3)
            if (r3 == 0) goto L_0x0490
            java.util.List r3 = r8.A00
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0490
            java.util.List r3 = r8.A01
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0490
            java.lang.String r0 = "ContactSyncRequestExecutor/no_phonebook_or_sidelist_change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.304 r3 = X.AnonymousClass304.A08
            r0 = r89
            r0.A03(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.A04 = r0
            r6.A00 = r0
            r0 = r85
            r0.A01(r6)
            X.4FV r2 = r0.A01
            X.5ZC r0 = r6.samplingRate
            int r0 = r0.A01
            int r1 = r0 * 10
            X.5ZC r0 = new X.5ZC
            r0.<init>(r1, r1)
            r2.BhC(r6, r0)
            goto L_0x00bc
        L_0x05a9:
            r4 = 0
            goto L_0x047a
        L_0x05ac:
            X.5UR r43 = r7.A0R()
            r47 = 0
            if (r43 != 0) goto L_0x05bc
            java.lang.String r3 = "system-contacts-query/all cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r3)
            goto L_0x0430
        L_0x05bc:
            java.util.HashMap r7 = X.AnonymousClass001.A0t()
            java.lang.String r4 = "_id"
            java.lang.String r3 = "version"
            java.lang.String[] r45 = new java.lang.String[]{r4, r3}
            android.net.Uri r44 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ Exception -> 0x0686 }
            java.lang.String r46 = X.C622134a.A01()     // Catch:{ Exception -> 0x0686 }
            r48 = r47
            android.database.Cursor r10 = r43.A03(r44, r45, r46, r47, r48)     // Catch:{ Exception -> 0x0686 }
            if (r10 == 0) goto L_0x0672
            int r11 = r10.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x067a }
            int r12 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x067a }
        L_0x05df:
            boolean r3 = r10.moveToNext()     // Catch:{ all -> 0x067a }
            if (r3 == 0) goto L_0x05f5
            long r14 = r10.getLong(r11)     // Catch:{ all -> 0x067a }
            int r4 = r10.getInt(r12)     // Catch:{ all -> 0x067a }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x067a }
            X.AnonymousClass0x2.A1I(r3, r7, r4)     // Catch:{ all -> 0x067a }
            goto L_0x05df
        L_0x05f5:
            r10.close()     // Catch:{ Exception -> 0x0686 }
        L_0x05f8:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "system-contacts-query/all/"
            r4.append(r3)
            int r3 = r7.size()
            X.C18260x0.A1G(r4, r3)
            X.1vC r3 = r13.A05
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            X.4GK r15 = X.C18630y0.A03(r3)
            java.lang.String r4 = "SELECT id, version FROM system_contacts_version_table"
            java.lang.String r3 = "CONTACT_SYSTEM_VERSIONS"
            android.database.Cursor r10 = X.AnonymousClass361.A09(r15, r4, r3)     // Catch:{ all -> 0x184a }
            java.lang.String r3 = "id"
            int r14 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x183e }
            java.lang.String r3 = "version"
            int r13 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x183e }
        L_0x0628:
            boolean r3 = r10.moveToNext()     // Catch:{ all -> 0x183e }
            if (r3 == 0) goto L_0x0655
            int r3 = r10.getInt(r14)     // Catch:{ all -> 0x183e }
            long r3 = (long) r3     // Catch:{ all -> 0x183e }
            r36 = r3
            java.lang.Integer r12 = X.C18300x5.A0a(r10, r13)     // Catch:{ all -> 0x183e }
            java.lang.Long r4 = java.lang.Long.valueOf(r36)     // Catch:{ all -> 0x183e }
            boolean r3 = r7.containsKey(r4)     // Catch:{ all -> 0x183e }
            if (r3 != 0) goto L_0x0647
            r11.add(r4)     // Catch:{ all -> 0x183e }
            goto L_0x0628
        L_0x0647:
            java.lang.Object r3 = r7.get(r4)     // Catch:{ all -> 0x183e }
            boolean r3 = r12.equals(r3)     // Catch:{ all -> 0x183e }
            if (r3 == 0) goto L_0x0628
            r7.remove(r4)     // Catch:{ all -> 0x183e }
            goto L_0x0628
        L_0x0655:
            r10.close()     // Catch:{ all -> 0x184a }
            java.lang.StringBuilder r4 = X.C18280x3.A0f(r15)
            java.lang.String r3 = "system-contacts-query/updated/"
            r4.append(r3)
            int r3 = r7.size()
            X.C18260x0.A1G(r4, r3)
            X.2KA r16 = new X.2KA
            r3 = r16
            r3.<init>(r11, r7)
            goto L_0x043f
        L_0x0672:
            java.lang.String r3 = "system-contacts-query/contact cursor was null"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x067a }
            goto L_0x0430
        L_0x067a:
            r4 = move-exception
            if (r10 == 0) goto L_0x0685
            r10.close()     // Catch:{ all -> 0x0681 }
            goto L_0x0685
        L_0x0681:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ Exception -> 0x0686 }
        L_0x0685:
            throw r4     // Catch:{ Exception -> 0x0686 }
        L_0x0686:
            r4 = move-exception
            java.lang.String r3 = "system-contacts-query/contact exception"
            com.whatsapp.util.Log.e(r3, r4)
            goto L_0x0430
        L_0x068f:
            if (r34 == 0) goto L_0x06b0
            if (r17 == 0) goto L_0x06b0
            java.util.Set r3 = r2.A05
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x06a3
            java.util.List r47 = r5.A01(r3)
        L_0x069f:
            r16 = 0
            goto L_0x0456
        L_0x06a3:
            X.3Ex r4 = r5.A0A
            X.314 r3 = r5.A0I
            java.util.Set r3 = r3.A0B()
            java.util.List r47 = r4.A0H(r3)
            goto L_0x069f
        L_0x06b0:
            r16 = 0
            goto L_0x0454
        L_0x06b4:
            X.304 r3 = X.AnonymousClass304.A03     // Catch:{ all -> 0x181a }
            r83 = r3
            java.util.Map r7 = r4.A0Q     // Catch:{ all -> 0x181a }
            r82 = r7
            r7.putAll(r8)     // Catch:{ all -> 0x181a }
            java.util.Map r7 = r4.A0S     // Catch:{ all -> 0x181a }
            r41 = r7
            X.2rx r7 = r4.A06     // Catch:{ all -> 0x181a }
            X.1vC r7 = r7.A04     // Catch:{ all -> 0x181a }
            java.util.HashMap r11 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x181a }
            X.4GK r15 = X.C18630y0.A03(r7)     // Catch:{ all -> 0x181a }
            java.lang.String r8 = "SELECT jid, serial FROM wa_vnames"
            java.lang.String r7 = "CONTACT_VNAMES"
            android.database.Cursor r7 = X.AnonymousClass361.A0A(r15, r8, r7, r10)     // Catch:{ all -> 0x1810 }
            int r14 = X.AnonymousClass0x9.A01(r7)     // Catch:{ all -> 0x1804 }
            java.lang.String r8 = "serial"
            int r13 = r7.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x1804 }
        L_0x06e2:
            boolean r8 = r7.moveToNext()     // Catch:{ all -> 0x1804 }
            if (r8 == 0) goto L_0x06fa
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass32Y.A00(r7, r14)     // Catch:{ all -> 0x1804 }
            if (r8 == 0) goto L_0x06e2
            long r34 = r7.getLong(r13)     // Catch:{ all -> 0x1804 }
            java.lang.String r12 = java.lang.String.valueOf(r34)     // Catch:{ all -> 0x1804 }
            r11.put(r8, r12)     // Catch:{ all -> 0x1804 }
            goto L_0x06e2
        L_0x06fa:
            r7.close()     // Catch:{ all -> 0x1810 }
            r15.close()     // Catch:{ all -> 0x181a }
            r7 = r41
            r7.putAll(r11)     // Catch:{ all -> 0x181a }
            if (r20 == 0) goto L_0x075f
            X.5rC r8 = r4.A03     // Catch:{ all -> 0x181a }
            boolean r7 = r8.A07()     // Catch:{ all -> 0x181a }
            if (r7 == 0) goto L_0x075f
            java.lang.Object r7 = r8.A04()     // Catch:{ all -> 0x181a }
            X.2sS r7 = (X.C56722sS) r7     // Catch:{ all -> 0x181a }
            X.2m4 r7 = r7.A01     // Catch:{ all -> 0x181a }
            boolean r7 = r7.A00()     // Catch:{ all -> 0x181a }
            if (r7 == 0) goto L_0x075f
            java.util.Map r12 = r4.A0P     // Catch:{ all -> 0x181a }
            java.lang.Object r7 = r8.A04()     // Catch:{ all -> 0x181a }
            X.2sS r7 = (X.C56722sS) r7     // Catch:{ all -> 0x181a }
            X.2Xa r7 = r7.A02     // Catch:{ all -> 0x181a }
            com.whatsapp.bonsai.sync.discovery.DiscoveryBots r7 = r7.A00()     // Catch:{ all -> 0x181a }
            java.util.Collection r8 = X.AnonymousClass25B.A00(r7)     // Catch:{ all -> 0x181a }
            int r7 = r8.size()     // Catch:{ all -> 0x181a }
            X.8OR r11 = new X.8OR     // Catch:{ all -> 0x181a }
            r11.<init>(r7)     // Catch:{ all -> 0x181a }
            java.util.Iterator r14 = r8.iterator()     // Catch:{ all -> 0x181a }
        L_0x073c:
            boolean r7 = r14.hasNext()     // Catch:{ all -> 0x181a }
            if (r7 == 0) goto L_0x0758
            java.lang.Object r7 = r14.next()     // Catch:{ all -> 0x181a }
            X.2m6 r7 = (X.C52822m6) r7     // Catch:{ all -> 0x181a }
            java.lang.String r8 = r7.A02     // Catch:{ all -> 0x181a }
            if (r8 == 0) goto L_0x073c
            int r13 = r8.length()     // Catch:{ all -> 0x181a }
            if (r13 == 0) goto L_0x073c
            com.whatsapp.jid.UserJid r7 = r7.A01     // Catch:{ all -> 0x181a }
            r11.put(r7, r8)     // Catch:{ all -> 0x181a }
            goto L_0x073c
        L_0x0758:
            java.util.Map r7 = X.AnonymousClass8UG.A0K(r11)     // Catch:{ all -> 0x181a }
            r12.putAll(r7)     // Catch:{ all -> 0x181a }
        L_0x075f:
            if (r54 == 0) goto L_0x076c
            X.99n r7 = r4.A0L     // Catch:{ all -> 0x181a }
            boolean r7 = r7.A0E()     // Catch:{ all -> 0x181a }
            if (r7 == 0) goto L_0x076c
            r36.A02()     // Catch:{ all -> 0x181a }
        L_0x076c:
            X.20t r8 = r9.scope     // Catch:{ all -> 0x181a }
            r7 = r40
            if (r8 == r7) goto L_0x0777
            X.20t r7 = X.C370520t.PHONEBOOK_AND_SIDELIST     // Catch:{ all -> 0x181a }
            r15 = 0
            if (r8 != r7) goto L_0x0778
        L_0x0777:
            r15 = 1
        L_0x0778:
            r7 = r39
            if (r8 == r7) goto L_0x0781
            X.20t r7 = X.C370520t.PHONEBOOK_AND_SIDELIST     // Catch:{ all -> 0x181a }
            r14 = 0
            if (r8 != r7) goto L_0x0782
        L_0x0781:
            r14 = 1
        L_0x0782:
            r7 = r38
            if (r8 != r7) goto L_0x07ac
            X.3AK r3 = new X.3AK     // Catch:{ all -> 0x1802 }
            r43 = r3
            r44 = r4
            r45 = r9
            r46 = r6
            r49 = r18
            r50 = r21
            r52 = r23
            r53 = r19
            r55 = r22
            r56 = r24
            r57 = r20
            r58 = r26
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)     // Catch:{ all -> 0x1802 }
            java.lang.String r7 = "sync/syncQueryMultiProtocols/no result"
            X.304 r3 = X.C623734t.A00(r3, r7)     // Catch:{ all -> 0x1802 }
            goto L_0x0921
        L_0x07ac:
            X.21Z r8 = r9.mode     // Catch:{ all -> 0x1802 }
            r7 = r31
            boolean r7 = X.AnonymousClass000.A1Y(r8, r7)
            r13 = 1
            r12 = 0
            if (r7 == 0) goto L_0x0838
            if (r15 == 0) goto L_0x07bd
            r3 = 1
            if (r14 != 0) goto L_0x07be
        L_0x07bd:
            r3 = 0
        L_0x07be:
            X.C626936e.A0C(r3)     // Catch:{ all -> 0x1802 }
            if (r18 != 0) goto L_0x07d6
            if (r17 != 0) goto L_0x07d6
            if (r21 != 0) goto L_0x07d6
            if (r23 != 0) goto L_0x07d6
            if (r51 != 0) goto L_0x07d6
            if (r19 != 0) goto L_0x07d6
            if (r54 != 0) goto L_0x07d6
            if (r22 != 0) goto L_0x07d6
            if (r24 != 0) goto L_0x07d6
            if (r59 != 0) goto L_0x07d6
            r13 = 0
        L_0x07d6:
            X.C626936e.A0C(r13)     // Catch:{ all -> 0x1802 }
            if (r18 == 0) goto L_0x080d
            X.C626936e.A06(r64)     // Catch:{ all -> 0x1802 }
            X.C626936e.A06(r65)     // Catch:{ all -> 0x1802 }
            X.3AJ r3 = new X.3AJ     // Catch:{ all -> 0x1802 }
            r60 = r3
            r61 = r4
            r62 = r9
            r63 = r6
            r66 = r48
            r67 = r17
            r68 = r21
            r69 = r51
            r70 = r23
            r71 = r19
            r72 = r54
            r73 = r22
            r74 = r24
            r75 = r26
            r76 = r59
            r60.<init>(r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76)     // Catch:{ all -> 0x1802 }
            java.lang.String r7 = "sync/sync_all"
            X.304 r3 = X.C623734t.A00(r3, r7)     // Catch:{ all -> 0x1802 }
            goto L_0x0921
        L_0x080d:
            X.C626936e.A06(r65)     // Catch:{ all -> 0x1802 }
            X.3AI r3 = new X.3AI     // Catch:{ all -> 0x1802 }
            r43 = r3
            r44 = r4
            r45 = r9
            r46 = r6
            r47 = r65
            r49 = r17
            r50 = r21
            r52 = r23
            r53 = r19
            r55 = r22
            r56 = r24
            r57 = r26
            r58 = r59
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)     // Catch:{ all -> 0x1802 }
            java.lang.String r7 = "sync/sync_all_non_contact"
            X.304 r3 = X.C623734t.A00(r3, r7)     // Catch:{ all -> 0x1802 }
            goto L_0x0921
        L_0x0838:
            X.21x r11 = r9.context     // Catch:{ all -> 0x1802 }
            r7 = r37
            if (r11 != r7) goto L_0x08c5
            boolean r7 = r43.isEmpty()     // Catch:{ all -> 0x1802 }
            if (r7 != 0) goto L_0x08b1
            if (r15 == 0) goto L_0x087f
            if (r14 == 0) goto L_0x0849
            r13 = 0
        L_0x0849:
            X.C626936e.A0C(r13)     // Catch:{ all -> 0x1802 }
            X.C626936e.A06(r64)     // Catch:{ all -> 0x1802 }
            r72 = 1
            X.4J7 r3 = new X.4J7     // Catch:{ all -> 0x1802 }
            r65 = r3
            r66 = r4
            r67 = r9
            r68 = r6
            r69 = r43
            r70 = r64
            r71 = r48
            r73 = r21
            r74 = r51
            r75 = r23
            r76 = r19
            r77 = r54
            r78 = r22
            r79 = r24
            r80 = r26
            r81 = r59
            r65.<init>(r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ all -> 0x1802 }
            java.lang.String r7 = "sync/sync_notification_contact"
            X.304 r3 = X.C623734t.A00(r3, r7)     // Catch:{ all -> 0x1802 }
            goto L_0x0921
        L_0x087f:
            if (r14 == 0) goto L_0x0921
            X.C626936e.A06(r66)     // Catch:{ all -> 0x1802 }
            X.4J7 r3 = new X.4J7     // Catch:{ all -> 0x1802 }
            r61 = r3
            r62 = r4
            r63 = r9
            r64 = r6
            r65 = r43
            r67 = r48
            r68 = r12
            r69 = r21
            r70 = r51
            r71 = r23
            r72 = r19
            r73 = r54
            r74 = r22
            r75 = r24
            r76 = r26
            r77 = r59
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)     // Catch:{ all -> 0x1802 }
            java.lang.String r7 = "sync/sync_notification_sidelist"
            X.304 r3 = X.C623734t.A00(r3, r7)     // Catch:{ all -> 0x1802 }
            goto L_0x0921
        L_0x08b1:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1802 }
            java.lang.String r7 = "empty jid hash: "
            r8.append(r7)     // Catch:{ all -> 0x1802 }
            int r7 = r9.code     // Catch:{ all -> 0x1802 }
            X.C18270x1.A1F(r8, r7)     // Catch:{ all -> 0x1802 }
            X.2qk r8 = r4.A04     // Catch:{ all -> 0x1802 }
            java.lang.String r7 = "sync/sync_notification_no_jidhash/error"
            goto L_0x0905
        L_0x08c5:
            X.21Z r7 = X.AnonymousClass21Z.DELTA     // Catch:{ all -> 0x181c }
            if (r8 != r7) goto L_0x0921
            if (r15 == 0) goto L_0x08ee
            if (r14 == 0) goto L_0x08f1
            X.C626936e.A06(r64)     // Catch:{ all -> 0x181c }
            X.3AH r3 = new X.3AH     // Catch:{ all -> 0x181c }
            r49 = r3
            r50 = r4
            r51 = r9
            r52 = r6
            r53 = r47
            r54 = r64
            r55 = r48
            r56 = r24
            r57 = r26
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57)     // Catch:{ all -> 0x181c }
            java.lang.String r7 = "contactsynchelper/syncDelta"
            X.304 r3 = X.C623734t.A00(r3, r7)     // Catch:{ all -> 0x181c }
            goto L_0x0921
        L_0x08ee:
            if (r14 == 0) goto L_0x08f1
            goto L_0x0909
        L_0x08f1:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x181c }
            java.lang.String r7 = "wrong sync type and query scope: "
            r8.append(r7)     // Catch:{ all -> 0x181c }
            int r7 = r9.code     // Catch:{ all -> 0x181c }
            X.C18270x1.A1F(r8, r7)     // Catch:{ all -> 0x181c }
            X.2qk r8 = r4.A04     // Catch:{ all -> 0x181c }
            java.lang.String r7 = "sync/sync_delta/error"
        L_0x0905:
            r8.A0A(r7, r12, r10)     // Catch:{ all -> 0x181c }
            goto L_0x0921
        L_0x0909:
            X.3AG r3 = new X.3AG     // Catch:{ all -> 0x181c }
            r43 = r3
            r44 = r4
            r45 = r9
            r46 = r6
            r49 = r24
            r50 = r26
            r43.<init>(r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x181c }
            java.lang.String r7 = "sync/syncSidelist"
            X.304 r3 = X.C623734t.A00(r3, r7)     // Catch:{ all -> 0x181c }
        L_0x0921:
            boolean r8 = r3.A00()     // Catch:{ all -> 0x181c }
            if (r8 == 0) goto L_0x092e
            java.lang.String r7 = "sync/success"
            com.whatsapp.util.Log.d((java.lang.String) r7)     // Catch:{ all -> 0x181c }
            goto L_0x0934
        L_0x092e:
            java.lang.String r7 = "sync/failed"
            com.whatsapp.util.Log.d((java.lang.String) r7)     // Catch:{ all -> 0x181c }
        L_0x0934:
            java.util.Map r7 = r4.A0T
            r7.clear()
            java.util.Map r7 = r4.A0R
            r7.clear()
            r82.clear()
            r41.clear()
            java.util.Map r7 = r4.A0P
            r7.clear()
            r4.A01 = r10
            r4.A02 = r10
            r36.A01()
            X.2oU r4 = r5.A0L
            android.content.Context r4 = r4.A00
            r60 = r4
            if (r8 == 0) goto L_0x162e
            java.lang.String r2 = "ContactSyncRequestExecutor/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            int r13 = r3.A00
            r2 = 3
            if (r13 == r2) goto L_0x0965
            r2 = 2
            if (r13 != r2) goto L_0x096c
        L_0x0965:
            java.lang.Runnable r4 = r5.A0V
            r2 = r88
            r2.A0S(r4)
        L_0x096c:
            r2 = r89
            r2.A03(r3)
            if (r33 == 0) goto L_0x09f3
            X.338 r12 = r5.A06
            monitor-enter(r12)
            X.2sr r2 = r12.A00     // Catch:{ all -> 0x17ff }
            boolean r2 = r2.A0Y()     // Catch:{ all -> 0x17ff }
            r19 = 1
            if (r2 != 0) goto L_0x09e9
            X.2Xk r2 = r12.A01     // Catch:{ all -> 0x17ff }
            boolean r2 = r2.A00()     // Catch:{ all -> 0x17ff }
            if (r2 != 0) goto L_0x098e
            java.lang.String r2 = "androidcontactssync/clearsyncdata/permission_denied"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x17ff }
            goto L_0x09e9
        L_0x098e:
            X.33i r2 = r12.A02     // Catch:{ all -> 0x17ff }
            X.5UR r11 = r2.A0R()     // Catch:{ all -> 0x17ff }
            android.net.Uri r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x17ff }
            android.net.Uri$Builder r7 = r2.buildUpon()     // Catch:{ all -> 0x17ff }
            java.lang.String r4 = "account_name"
            r10 = 2131895665(0x7f122571, float:1.942617E38)
            r2 = r60
            java.lang.String r2 = r2.getString(r10)     // Catch:{ all -> 0x17ff }
            android.net.Uri$Builder r4 = r7.appendQueryParameter(r4, r2)     // Catch:{ all -> 0x17ff }
            java.lang.String r2 = "account_type"
            java.lang.String r14 = "com.whatsapp"
            android.net.Uri$Builder r7 = r4.appendQueryParameter(r2, r14)     // Catch:{ all -> 0x17ff }
            java.lang.String r4 = "caller_is_syncadapter"
            java.lang.String r2 = "true"
            android.net.Uri r8 = X.C18290x4.A0H(r7, r4, r2)     // Catch:{ all -> 0x17ff }
            java.lang.String r2 = "androidcontactssync/clearsyncdata/delete"
            com.whatsapp.util.Log.d((java.lang.String) r2)     // Catch:{ all -> 0x17ff }
            r15 = 0
            java.lang.String r7 = "account_name = ? AND account_type = ?"
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Z()     // Catch:{ SecurityException -> 0x09d4, IllegalArgumentException -> 0x09eb }
            r2 = r60
            java.lang.String r2 = r2.getString(r10)     // Catch:{ SecurityException -> 0x09d4, IllegalArgumentException -> 0x09eb }
            r4[r15] = r2     // Catch:{ SecurityException -> 0x09d4, IllegalArgumentException -> 0x09eb }
            r4[r19] = r14     // Catch:{ SecurityException -> 0x09d4, IllegalArgumentException -> 0x09eb }
            r11.A01(r8, r7, r4)     // Catch:{ SecurityException -> 0x09d4, IllegalArgumentException -> 0x09eb }
            goto L_0x09e9
        L_0x09d4:
            r7 = move-exception
            java.lang.String r2 = r7.getMessage()     // Catch:{ all -> 0x17ff }
            if (r2 == 0) goto L_0x17fe
            java.lang.String r4 = r7.getMessage()     // Catch:{ all -> 0x17ff }
            java.lang.String r2 = "User 0 tying to get authenticator types for "
            boolean r2 = r4.startsWith(r2)     // Catch:{ all -> 0x17ff }
            if (r2 == 0) goto L_0x17fe
            monitor-exit(r12)
            goto L_0x09ec
        L_0x09e9:
            monitor-exit(r12)
            goto L_0x09f3
        L_0x09eb:
            monitor-exit(r12)
        L_0x09ec:
            r4 = r89
            r2 = r83
            r4.A03(r2)
        L_0x09f3:
            X.21Z r4 = r9.mode
            r2 = r31
            if (r4 != r2) goto L_0x0a25
            if (r18 == 0) goto L_0x0a04
            android.content.SharedPreferences$Editor r4 = X.C56882si.A01(r87)
            java.lang.String r2 = "last_contact_full_sync"
            X.C18270x1.A0i(r4, r2, r0)
        L_0x0a04:
            if (r17 == 0) goto L_0x0a0f
            android.content.SharedPreferences$Editor r4 = X.C56882si.A01(r87)
            java.lang.String r2 = "last_sidelist_full_sync"
            X.C18270x1.A0i(r4, r2, r0)
        L_0x0a0f:
            if (r21 == 0) goto L_0x0a1a
            android.content.SharedPreferences$Editor r4 = X.C56882si.A01(r87)
            java.lang.String r2 = "last_status_full_sync"
            X.C18270x1.A0i(r4, r2, r0)
        L_0x0a1a:
            if (r59 == 0) goto L_0x0a25
            android.content.SharedPreferences$Editor r4 = X.C56882si.A01(r87)
            java.lang.String r2 = "last_text_status_full_sync"
            X.C18270x1.A0i(r4, r2, r0)
        L_0x0a25:
            if (r30 == 0) goto L_0x1688
            r0 = 2
            if (r13 != r0) goto L_0x1688
            X.338 r0 = r5.A06     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            r18 = r0
            r0 = r16
            java.util.Map r0 = r0.A01     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            java.util.Set r30 = r0.keySet()     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            X.3Ex r0 = r5.A0A     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            r59 = r0
            X.1vC r0 = r0.A05     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            X.33M r8 = X.AnonymousClass33M.A00()     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            java.util.ArrayList r36 = X.AnonymousClass001.A0s()     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            X.4GK r7 = X.C18630y0.A03(r0)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            java.lang.String r1 = "SELECT wa_contacts._id, wa_contacts.jid, is_whatsapp_user, number, raw_contact_id, display_name, phone_type, phone_label FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE is_whatsapp_user = 1"
            java.lang.String r0 = "GET_ALL_WA_CONTACTS"
            android.database.Cursor r4 = X.AnonymousClass361.A09(r7, r1, r0)     // Catch:{ all -> 0x1602 }
        L_0x0a50:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x15f6 }
            if (r0 == 0) goto L_0x0a9e
            r2 = 1
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x15f6 }
            com.whatsapp.jid.Jid r1 = X.AnonymousClass32W.A00(r0)     // Catch:{ all -> 0x15f6 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x15f6 }
            if (r0 == 0) goto L_0x0a50
            com.whatsapp.jid.UserJid r44 = X.AnonymousClass32Y.A03(r1)     // Catch:{ all -> 0x15f6 }
            r0 = 2
            int r1 = r4.getInt(r0)     // Catch:{ all -> 0x15f6 }
            r0 = 0
            boolean r51 = X.AnonymousClass000.A1U(r1, r2)
            r1 = 3
            java.lang.String r45 = r4.getString(r1)     // Catch:{ all -> 0x15f6 }
            r1 = 4
            long r49 = r4.getLong(r1)     // Catch:{ all -> 0x15f6 }
            r1 = 5
            java.lang.String r46 = r4.getString(r1)     // Catch:{ all -> 0x15f6 }
            r1 = 6
            int r48 = r4.getInt(r1)     // Catch:{ all -> 0x15f6 }
            r1 = 7
            java.lang.String r47 = r4.getString(r1)     // Catch:{ all -> 0x15f6 }
            X.3ZH r2 = new X.3ZH     // Catch:{ all -> 0x15f6 }
            r43 = r2
            r43.<init>(r44, r45, r46, r47, r48, r49, r51)     // Catch:{ all -> 0x15f6 }
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x15f6 }
            r2.A0N(r0)     // Catch:{ all -> 0x15f6 }
            r0 = r36
            r0.add(r2)     // Catch:{ all -> 0x15f6 }
            goto L_0x0a50
        L_0x0a9e:
            r4.close()     // Catch:{ all -> 0x1602 }
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r7)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            java.lang.String r2 = "retrieved "
            r0 = r36
            X.C18260x0.A19(r2, r1, r0)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            java.lang.String r0 = " whatsapp contacts for account sync | time: "
            X.AnonymousClass33M.A04(r8, r0, r1)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            monitor-enter(r18)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            r0 = r18
            X.2sr r0 = r0.A00     // Catch:{ all -> 0x15f3 }
            boolean r0 = r0.A0Y()     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x0ac8
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to companion mode"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x15f3 }
            goto L_0x15d7
        L_0x0ac8:
            java.lang.String r0 = "androidcontactssync/start"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            long r38 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x15f3 }
            r1 = r18
            r0 = r60
            android.accounts.Account r17 = r1.A02(r0)     // Catch:{ all -> 0x15f3 }
            X.2y5 r0 = r1.A05     // Catch:{ all -> 0x15f3 }
            r58 = r0
            java.lang.String r40 = X.C58152un.A0A     // Catch:{ all -> 0x15f3 }
            r1 = r40
            android.content.SharedPreferences r1 = r0.A03(r1)     // Catch:{ all -> 0x15f3 }
            java.lang.String r41 = "perform_sync_manager_version"
            r0 = r41
            int r11 = X.C18280x3.A02(r1, r0)     // Catch:{ all -> 0x15f3 }
            r0 = 3
            if (r11 >= r0) goto L_0x0cb6
            if (r17 != 0) goto L_0x0af5
            goto L_0x0cab
        L_0x0af5:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x15f3 }
            r0 = r18
            X.33i r0 = r0.A02     // Catch:{ all -> 0x15f3 }
            X.5UR r7 = r0.A0R()     // Catch:{ all -> 0x15f3 }
            boolean r0 = r36.isEmpty()     // Catch:{ all -> 0x15f3 }
            r1 = 1
            if (r0 != 0) goto L_0x0cc3
            java.util.HashMap r12 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x15f3 }
            java.util.Iterator r4 = r36.iterator()     // Catch:{ all -> 0x15f3 }
        L_0x0b10:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x0b22
            X.3ZH r2 = X.C18310x6.A0R(r4)     // Catch:{ all -> 0x15f3 }
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A03(r2)     // Catch:{ all -> 0x15f3 }
            r12.put(r0, r2)     // Catch:{ all -> 0x15f3 }
            goto L_0x0b10
        L_0x0b22:
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r4 = r0.buildUpon()     // Catch:{ all -> 0x15f3 }
            java.lang.String r2 = "account_name"
            r0 = r17
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r2, r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String r2 = "account_type"
            r0 = r17
            java.lang.String r0 = r0.type     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r0 = r4.appendQueryParameter(r2, r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String r4 = "caller_is_syncadapter"
            java.lang.String r2 = "true"
            android.net.Uri r44 = X.C18290x4.A0H(r0, r4, r2)     // Catch:{ all -> 0x15f3 }
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ all -> 0x15f3 }
            android.net.Uri r26 = X.C18290x4.A0H(r0, r4, r2)     // Catch:{ all -> 0x15f3 }
            r10 = 100
            r0 = 2
            java.lang.String r4 = "androidcontactssync/onVersionUpgrade/error"
            java.lang.String r9 = "sync1"
            java.lang.String r2 = "_id"
            if (r11 == 0) goto L_0x0b6f
            if (r11 == r1) goto L_0x0b6f
            if (r11 != r0) goto L_0x0b63
            r24 = 2
            goto L_0x0c11
        L_0x0b63:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "unexpected old version during AndroidContactsSyncHelper upgrade, version="
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r11)     // Catch:{ all -> 0x15f3 }
            throw r0     // Catch:{ all -> 0x15f3 }
        L_0x0b6f:
            java.lang.String r0 = "deleted"
            java.lang.String[] r45 = new java.lang.String[]{r2, r9, r0}     // Catch:{ all -> 0x15f3 }
            r46 = 0
            r24 = 2
            r48 = r46
            r43 = r7
            r47 = r46
            android.database.Cursor r11 = r43.A03(r44, r45, r46, r47, r48)     // Catch:{ all -> 0x15f3 }
            if (r11 == 0) goto L_0x0c03
            int r23 = r11.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0c8f }
            int r22 = r11.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0c8f }
            int r13 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0c8f }
        L_0x0b91:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0c00
            int r0 = r8.size()     // Catch:{ all -> 0x0c8f }
            if (r0 < r10) goto L_0x0ba5
            boolean r0 = X.AnonymousClass338.A00(r7, r4, r8)     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0ba5
            goto L_0x0c8b
        L_0x0ba5:
            r0 = r23
            long r20 = r11.getLong(r0)     // Catch:{ all -> 0x0c8f }
            r0 = r22
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass32Y.A00(r11, r0)     // Catch:{ all -> 0x0c8f }
            boolean r0 = r11.isNull(r13)     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0bb8
            goto L_0x0bbd
        L_0x0bb8:
            int r1 = r11.getInt(r13)     // Catch:{ all -> 0x0c8f }
            goto L_0x0bbe
        L_0x0bbd:
            r1 = 0
        L_0x0bbe:
            if (r14 == 0) goto L_0x0bfd
            boolean r0 = r12.containsKey(r14)     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0bfd
            if (r1 != 0) goto L_0x0bfd
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newUpdate(r44)     // Catch:{ all -> 0x0c8f }
            r0 = 1
            android.content.ContentProviderOperation$Builder r19 = r1.withYieldAllowed(r0)     // Catch:{ all -> 0x0c8f }
            java.lang.String r15 = "_id = ?"
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x0c8f }
            r0 = r20
            X.C18260x0.A1X(r10, r0)     // Catch:{ all -> 0x0c8f }
            r0 = r19
            android.content.ContentProviderOperation$Builder r10 = r0.withSelection(r15, r10)     // Catch:{ all -> 0x0c8f }
            java.lang.String r1 = "sync2"
            java.lang.Object r0 = r12.get(r14)     // Catch:{ all -> 0x0c8f }
            X.3ZH r0 = (X.AnonymousClass3ZH) r0     // Catch:{ all -> 0x0c8f }
            long r19 = r0.A0F()     // Catch:{ all -> 0x0c8f }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0c8f }
            X.C18270x1.A0Z(r10, r0, r1, r8)     // Catch:{ all -> 0x0c8f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "androidcontactssync/androidcontactssync/onVersionUpgrade/add: "
            X.C18260x0.A1P(r1, r0, r14)     // Catch:{ all -> 0x0c8f }
        L_0x0bfd:
            r10 = 100
            goto L_0x0b91
        L_0x0c00:
            r11.close()     // Catch:{ all -> 0x15f3 }
        L_0x0c03:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x0c11
            boolean r0 = X.AnonymousClass338.A00(r7, r4, r8)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x0c11
            goto L_0x0cb0
        L_0x0c11:
            java.lang.String r0 = "androidcontactssync/Start upgrading to version 3"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String[] r45 = new java.lang.String[]{r2, r9}     // Catch:{ all -> 0x15f3 }
            r46 = 0
            r48 = r46
            r43 = r7
            r47 = r46
            android.database.Cursor r11 = r43.A03(r44, r45, r46, r47, r48)     // Catch:{ all -> 0x15f3 }
            if (r11 == 0) goto L_0x0c9e
            int r14 = r11.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0c8f }
            int r15 = r11.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0c8f }
        L_0x0c30:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0c9b
            int r0 = r8.size()     // Catch:{ all -> 0x0c8f }
            if (r0 < r10) goto L_0x0c43
            boolean r0 = X.AnonymousClass338.A00(r7, r4, r8)     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0c43
            goto L_0x0c8b
        L_0x0c43:
            long r0 = r11.getLong(r14)     // Catch:{ all -> 0x0c8f }
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass32Y.A00(r11, r15)     // Catch:{ all -> 0x0c8f }
            if (r13 == 0) goto L_0x0c30
            android.content.ContentProviderOperation$Builder r9 = android.content.ContentProviderOperation.newDelete(r26)     // Catch:{ all -> 0x0c8f }
            r2 = 1
            android.content.ContentProviderOperation$Builder r12 = r9.withYieldAllowed(r2)     // Catch:{ all -> 0x0c8f }
            java.lang.String r9 = "raw_contact_id = ? AND mimetype in (?,?,?,?,?)"
            r2 = 5
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0c8f }
            X.C18260x0.A1X(r2, r0)     // Catch:{ all -> 0x0c8f }
            java.lang.String r1 = "vnd.android.cursor.item/name"
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r2[r24] = r0     // Catch:{ all -> 0x0c8f }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r0 = 3
            r2[r0] = r1     // Catch:{ all -> 0x0c8f }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r0 = 4
            r2[r0] = r1     // Catch:{ all -> 0x0c8f }
            android.content.ContentProviderOperation$Builder r0 = r12.withSelection(r9, r2)     // Catch:{ all -> 0x0c8f }
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x0c8f }
            r8.add(r0)     // Catch:{ all -> 0x0c8f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "androidcontactssync/onVersionUpgrade/delete existing data items: "
            X.C18260x0.A1P(r1, r0, r13)     // Catch:{ all -> 0x0c8f }
            goto L_0x0c30
        L_0x0c8b:
            r11.close()     // Catch:{ all -> 0x15f3 }
            goto L_0x0cb0
        L_0x0c8f:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0c95 }
            goto L_0x0de9
        L_0x0c95:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x15f3 }
            goto L_0x0de9
        L_0x0c9b:
            r11.close()     // Catch:{ all -> 0x15f3 }
        L_0x0c9e:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x0cc3
            boolean r0 = X.AnonymousClass338.A00(r7, r4, r8)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x0cc3
            goto L_0x0cb0
        L_0x0cab:
            java.lang.String r0 = "androidcontactssync/skipping onVersionUpgrade"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
        L_0x0cb0:
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x15f3 }
            goto L_0x15d7
        L_0x0cb6:
            if (r17 != 0) goto L_0x0cc3
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to null account"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x15f3 }
            goto L_0x15d7
        L_0x0cc3:
            r0 = r18
            X.2Xk r0 = r0.A01     // Catch:{ all -> 0x15f3 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x0cd8
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to permissions denied"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x15f3 }
            goto L_0x15d7
        L_0x0cd8:
            boolean r0 = r36.isEmpty()     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x0ce4
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x15f3 }
            goto L_0x15d7
        L_0x0ce4:
            java.util.HashMap r9 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x15f3 }
            java.util.Iterator r2 = r36.iterator()     // Catch:{ all -> 0x15f3 }
        L_0x0cec:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x0cfe
            X.3ZH r1 = X.C18310x6.A0R(r2)     // Catch:{ all -> 0x15f3 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r1)     // Catch:{ all -> 0x15f3 }
            r9.put(r0, r1)     // Catch:{ all -> 0x15f3 }
            goto L_0x0cec
        L_0x0cfe:
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch:{ all -> 0x15f3 }
            java.lang.String r37 = "account_name"
            r0 = r17
            java.lang.String r0 = r0.name     // Catch:{ all -> 0x15f3 }
            r2 = r37
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String r35 = "account_type"
            r0 = r17
            java.lang.String r0 = r0.type     // Catch:{ all -> 0x15f3 }
            r2 = r35
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String r34 = "caller_is_syncadapter"
            java.lang.String r32 = "true"
            r2 = r34
            r0 = r32
            android.net.Uri r23 = X.C18290x4.A0H(r1, r2, r0)     // Catch:{ all -> 0x15f3 }
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch:{ all -> 0x15f3 }
            r0 = r2
            r2 = r32
            android.net.Uri r20 = X.C18290x4.A0H(r1, r0, r2)     // Catch:{ all -> 0x15f3 }
            java.util.HashSet r33 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x15f3 }
            java.util.HashMap r21 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x15f3 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = "androidcontactssync/starting sync of raw contacts to Android contacts content provider, size="
            r0 = r36
            X.C18260x0.A1A(r1, r2, r0)     // Catch:{ all -> 0x15f3 }
            r0 = r18
            X.33i r0 = r0.A02     // Catch:{ all -> 0x15f3 }
            r57 = r0
            X.5UR r22 = r57.A0R()     // Catch:{ all -> 0x15f3 }
            java.lang.String r2 = "_id"
            java.lang.String r31 = "sync1"
            java.lang.String r1 = "deleted"
            java.lang.String r0 = "display_name"
            r4 = r31
            java.lang.String[] r49 = new java.lang.String[]{r2, r4, r1, r0}     // Catch:{ all -> 0x15f3 }
            r50 = 0
            r52 = r50
            r47 = r22
            r48 = r23
            r51 = r50
            android.database.Cursor r14 = r47.A03(r48, r49, r50, r51, r52)     // Catch:{ all -> 0x15f3 }
            if (r14 == 0) goto L_0x0ded
            int r13 = r14.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0de0 }
            int r12 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0de0 }
            int r11 = r14.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0de0 }
            int r10 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0de0 }
        L_0x0d82:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x0de0 }
            if (r0 == 0) goto L_0x0dea
            long r0 = r14.getLong(r13)     // Catch:{ all -> 0x0de0 }
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A00(r14, r12)     // Catch:{ all -> 0x0de0 }
            boolean r4 = r14.isNull(r11)     // Catch:{ all -> 0x0de0 }
            if (r4 == 0) goto L_0x0d98
            r8 = 0
            goto L_0x0d9c
        L_0x0d98:
            int r8 = r14.getInt(r11)     // Catch:{ all -> 0x0de0 }
        L_0x0d9c:
            java.lang.String r7 = r14.getString(r10)     // Catch:{ all -> 0x0de0 }
            X.2ZH r4 = new X.2ZH     // Catch:{ all -> 0x0de0 }
            r4.<init>(r2, r7, r0)     // Catch:{ all -> 0x0de0 }
            if (r8 == 0) goto L_0x0dcb
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0de0 }
            java.lang.String r2 = "androidcontactssync/ --> deleting data rows for raw contact "
            X.C18260x0.A1P(r7, r2, r4)     // Catch:{ all -> 0x0de0 }
            java.lang.String r8 = "raw_contact_id=?"
            java.lang.String[] r7 = X.C18260x0.A1b(r0)     // Catch:{ Exception -> 0x0dbf }
            r4 = r20
            r2 = r22
            r2.A01(r4, r8, r7)     // Catch:{ Exception -> 0x0dbf }
            goto L_0x0dc5
        L_0x0dbf:
            r4 = move-exception
            java.lang.String r2 = "androidcontactssync/delete error"
            com.whatsapp.util.Log.w(r2, r4)     // Catch:{ all -> 0x0de0 }
        L_0x0dc5:
            r2 = r33
            X.C18280x3.A1K(r2, r0)     // Catch:{ all -> 0x0de0 }
            goto L_0x0d82
        L_0x0dcb:
            r0 = r21
            java.lang.Object r1 = r0.get(r2)     // Catch:{ all -> 0x0de0 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0de0 }
            if (r1 != 0) goto L_0x0ddc
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0de0 }
            r0.put(r2, r1)     // Catch:{ all -> 0x0de0 }
        L_0x0ddc:
            r1.add(r4)     // Catch:{ all -> 0x0de0 }
            goto L_0x0d82
        L_0x0de0:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0de5 }
            goto L_0x0de9
        L_0x0de5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x15f3 }
        L_0x0de9:
            throw r1     // Catch:{ all -> 0x15f3 }
        L_0x0dea:
            r14.close()     // Catch:{ all -> 0x15f3 }
        L_0x0ded:
            java.util.HashSet r10 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x15f3 }
            java.util.Iterator r15 = X.AnonymousClass001.A0u(r21)     // Catch:{ all -> 0x15f3 }
        L_0x0df5:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x0e6e
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r15)     // Catch:{ all -> 0x15f3 }
            com.whatsapp.jid.UserJid r8 = X.C18320x8.A0P(r2)     // Catch:{ all -> 0x15f3 }
            java.lang.Object r1 = r9.get(r8)     // Catch:{ all -> 0x15f3 }
            X.3ZH r1 = (X.AnonymousClass3ZH) r1     // Catch:{ all -> 0x15f3 }
            if (r1 == 0) goto L_0x0e24
            X.2k5 r0 = r1.A0F     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x0e24
            boolean r0 = r1.A10     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x0e24
            boolean r0 = r1.A0U()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x0e24
            X.4uZ r1 = r1.A0H     // Catch:{ all -> 0x15f3 }
            boolean r0 = r1 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x0e24
            boolean r0 = r1 instanceof X.AnonymousClass1fW     // Catch:{ all -> 0x15f3 }
            r14 = 1
            if (r0 == 0) goto L_0x0e25
        L_0x0e24:
            r14 = 0
        L_0x0e25:
            java.lang.Object r7 = r2.getValue()     // Catch:{ all -> 0x15f3 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x15f3 }
            int r0 = r7.size()     // Catch:{ all -> 0x15f3 }
            int r4 = r0 + -1
            if (r14 == 0) goto L_0x0e35
            int r4 = r0 + -2
        L_0x0e35:
            r2 = 0
        L_0x0e36:
            if (r2 > r4) goto L_0x0e68
            java.lang.Object r13 = r7.get(r2)     // Catch:{ all -> 0x15f3 }
            X.2ZH r13 = (X.AnonymousClass2ZH) r13     // Catch:{ all -> 0x15f3 }
            long r0 = r13.A00     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x15f3 }
            r0 = r33
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x0e65
            java.lang.String r12 = "_id = ?"
            java.lang.String[] r11 = X.AnonymousClass0x9.A1Y()     // Catch:{ Exception -> 0x0e5f }
            long r0 = r13.A00     // Catch:{ Exception -> 0x0e5f }
            X.C18260x0.A1X(r11, r0)     // Catch:{ Exception -> 0x0e5f }
            r1 = r22
            r0 = r23
            r1.A01(r0, r12, r11)     // Catch:{ Exception -> 0x0e5f }
            goto L_0x0e65
        L_0x0e5f:
            r1 = move-exception
            java.lang.String r0 = "androidcontactssync/delete error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x15f3 }
        L_0x0e65:
            int r2 = r2 + 1
            goto L_0x0e36
        L_0x0e68:
            if (r14 != 0) goto L_0x0df5
            r10.add(r8)     // Catch:{ all -> 0x15f3 }
            goto L_0x0df5
        L_0x0e6e:
            java.util.Set r0 = r21.keySet()     // Catch:{ all -> 0x15f3 }
            r0.removeAll(r10)     // Catch:{ all -> 0x15f3 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x15f3 }
            java.util.ArrayList r26 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x15f3 }
            java.util.HashSet r47 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x15f3 }
            java.util.HashSet r46 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x15f3 }
            java.util.HashSet r45 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x15f3 }
            java.util.HashSet r44 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x15f3 }
            java.util.HashSet r43 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x15f3 }
            java.lang.String r24 = "mimetype"
            java.lang.String r2 = "raw_contact_id"
            java.lang.String r0 = "androidcontactssync/buildIdToMimeTypeMap/start"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            java.util.HashMap r48 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x15f3 }
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r7 = r0.buildUpon()     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = X.C18320x8.A0a(r60)     // Catch:{ all -> 0x15f3 }
            r0 = r37
            android.net.Uri$Builder r1 = r7.appendQueryParameter(r0, r1)     // Catch:{ all -> 0x15f3 }
            java.lang.String r11 = "com.whatsapp"
            r0 = r35
            android.net.Uri$Builder r7 = r1.appendQueryParameter(r0, r11)     // Catch:{ all -> 0x15f3 }
            r1 = r34
            r0 = r32
            android.net.Uri r52 = X.C18290x4.A0H(r7, r1, r0)     // Catch:{ all -> 0x15f3 }
            X.5UR r51 = r57.A0R()     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            r0 = r24
            java.lang.String[] r53 = new java.lang.String[]{r2, r0}     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            java.lang.String r54 = "mimetype in (?,?,?,?,?)"
            r0 = 5
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            java.lang.String r9 = "vnd.android.cursor.item/name"
            r0 = 0
            r10[r0] = r9     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            java.lang.String r8 = "vnd.android.cursor.item/phone_v2"
            r0 = 1
            r10[r0] = r8     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            java.lang.String r7 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r0 = 2
            r10[r0] = r7     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r0 = 3
            r10[r0] = r1     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r12 = 4
            r10[r12] = r0     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            r55 = r10
            r56 = r50
            android.database.Cursor r14 = r51.A03(r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            if (r14 != 0) goto L_0x0eff
            java.lang.String r0 = "androidcontactssync/failed/null hasDataUriCursorRow cursor"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0f76 }
            goto L_0x0f9f
        L_0x0eff:
            int r49 = r14.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0f76 }
            r10 = r24
            int r19 = r14.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0f76 }
        L_0x0f09:
            boolean r10 = r14.moveToNext()     // Catch:{ all -> 0x0f76 }
            if (r10 == 0) goto L_0x0f72
            r10 = r49
            java.lang.Long r13 = X.C18280x3.A0T(r14, r10)     // Catch:{ all -> 0x0f76 }
            r10 = r19
            java.lang.String r12 = r14.getString(r10)     // Catch:{ all -> 0x0f76 }
            r10 = r48
            boolean r10 = r10.containsKey(r13)     // Catch:{ all -> 0x0f76 }
            if (r10 != 0) goto L_0x0f2c
            java.util.HashSet r15 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0f76 }
            r10 = r48
            r10.put(r13, r15)     // Catch:{ all -> 0x0f76 }
        L_0x0f2c:
            r10 = r48
            java.lang.Object r10 = r10.get(r13)     // Catch:{ all -> 0x0f76 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x0f76 }
            boolean r13 = r12.equals(r9)     // Catch:{ all -> 0x0f76 }
            if (r13 == 0) goto L_0x0f3c
            r12 = 0
            goto L_0x0f5b
        L_0x0f3c:
            boolean r13 = r12.equals(r8)     // Catch:{ all -> 0x0f76 }
            if (r13 == 0) goto L_0x0f44
            r12 = 1
            goto L_0x0f5b
        L_0x0f44:
            boolean r13 = r12.equals(r7)     // Catch:{ all -> 0x0f76 }
            if (r13 == 0) goto L_0x0f4c
            r12 = 2
            goto L_0x0f5b
        L_0x0f4c:
            boolean r13 = r12.equals(r1)     // Catch:{ all -> 0x0f76 }
            if (r13 == 0) goto L_0x0f54
            r12 = 3
            goto L_0x0f5b
        L_0x0f54:
            boolean r13 = r12.equals(r0)     // Catch:{ all -> 0x0f76 }
            if (r13 == 0) goto L_0x0f63
            r12 = 4
        L_0x0f5b:
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)     // Catch:{ all -> 0x0f76 }
            r10.add(r12)     // Catch:{ all -> 0x0f76 }
            goto L_0x0f09
        L_0x0f63:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0f76 }
            java.lang.String r0 = "no code found for "
            r1.append(r0)     // Catch:{ all -> 0x0f76 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r12, r1)     // Catch:{ all -> 0x0f76 }
            throw r0     // Catch:{ all -> 0x0f76 }
        L_0x0f72:
            r14.close()     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
            goto L_0x0f9a
        L_0x0f76:
            r0 = move-exception
            if (r14 == 0) goto L_0x0f81
            r14.close()     // Catch:{ all -> 0x0f7d }
            goto L_0x0f81
        L_0x0f7d:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
        L_0x0f81:
            throw r0     // Catch:{ Exception -> 0x0f94, OutOfMemoryError -> 0x0f82 }
        L_0x0f82:
            r4 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = "androidcontactssync/too-many-rows/size/"
            r0 = r48
            int r0 = X.AnonymousClass0x7.A0A(r1, r2, r0)     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A1F(r2, r0)     // Catch:{ all -> 0x15f3 }
            goto L_0x1036
        L_0x0f94:
            r1 = move-exception
            java.lang.String r0 = "androidcontactssync/failed/null hasDataUriCursorRow error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x15f3 }
        L_0x0f9a:
            java.lang.String r0 = "androidcontactssync/buildIdToMimeTypeMap/end"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
        L_0x0f9f:
            java.lang.String r7 = "data3"
            java.lang.String r19 = "data2"
            java.lang.String r0 = "androidcontactssync/buildIdToCustomLabelMap/start"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            java.util.HashMap r8 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x15f3 }
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r9 = r0.buildUpon()     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = X.C18320x8.A0a(r60)     // Catch:{ all -> 0x15f3 }
            r0 = r37
            android.net.Uri$Builder r1 = r9.appendQueryParameter(r0, r1)     // Catch:{ all -> 0x15f3 }
            r0 = r35
            android.net.Uri$Builder r9 = r1.appendQueryParameter(r0, r11)     // Catch:{ all -> 0x15f3 }
            r1 = r34
            r0 = r32
            android.net.Uri r10 = X.C18290x4.A0H(r9, r1, r0)     // Catch:{ all -> 0x15f3 }
            X.5UR r9 = r57.A0R()     // Catch:{ Exception -> 0x1037, OutOfMemoryError -> 0x1028 }
            r0 = r19
            java.lang.String[] r11 = new java.lang.String[]{r2, r0, r7}     // Catch:{ Exception -> 0x1037, OutOfMemoryError -> 0x1028 }
            java.lang.String r12 = "mimetype = ?"
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            java.lang.String[] r13 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x1037, OutOfMemoryError -> 0x1028 }
            r14 = r50
            android.database.Cursor r13 = r9.A03(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x1037, OutOfMemoryError -> 0x1028 }
            if (r13 != 0) goto L_0x0fec
            java.lang.String r0 = "androidcontactssync/failed/null hasDataUriCursorRow cursor"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x101c }
            goto L_0x104a
        L_0x0fec:
            int r12 = r13.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x101c }
            r0 = r19
            int r11 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x101c }
            int r10 = r13.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x101c }
        L_0x0ffa:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x101c }
            if (r0 == 0) goto L_0x1018
            java.lang.Long r9 = X.C18280x3.A0T(r13, r12)     // Catch:{ all -> 0x101c }
            int r0 = r13.getInt(r11)     // Catch:{ all -> 0x101c }
            java.lang.String r1 = r13.getString(r10)     // Catch:{ all -> 0x101c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x101c }
            android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x101c }
            r8.put(r9, r0)     // Catch:{ all -> 0x101c }
            goto L_0x0ffa
        L_0x1018:
            r13.close()     // Catch:{ Exception -> 0x1037, OutOfMemoryError -> 0x1028 }
            goto L_0x103d
        L_0x101c:
            r1 = move-exception
            if (r13 == 0) goto L_0x1027
            r13.close()     // Catch:{ all -> 0x1023 }
            goto L_0x1027
        L_0x1023:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x1037, OutOfMemoryError -> 0x1028 }
        L_0x1027:
            throw r1     // Catch:{ Exception -> 0x1037, OutOfMemoryError -> 0x1028 }
        L_0x1028:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "androidcontactssync/hasCustomLabel/too-many-rows/size/"
            int r0 = X.AnonymousClass0x7.A0A(r0, r1, r8)     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A1F(r1, r0)     // Catch:{ all -> 0x15f3 }
        L_0x1036:
            throw r4     // Catch:{ all -> 0x15f3 }
        L_0x1037:
            r1 = move-exception
            java.lang.String r0 = "androidcontactssync/hasCustomLabel/failed/null hasDataUriCursorRow error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x15f3 }
        L_0x103d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "androidcontactssync/buildIdToCustomLabelMap/end/"
            int r0 = X.AnonymousClass0x7.A0A(r0, r1, r8)     // Catch:{ all -> 0x15f3 }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x15f3 }
        L_0x104a:
            r1 = 2131895577(0x7f122519, float:1.942599E38)
            r0 = r60
            java.lang.String r9 = r0.getString(r1)     // Catch:{ all -> 0x15f3 }
            java.util.Iterator r49 = r36.iterator()     // Catch:{ all -> 0x15f3 }
        L_0x1057:
            boolean r0 = r49.hasNext()     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x1320
            X.3ZH r10 = X.C18310x6.A0R(r49)     // Catch:{ all -> 0x15f3 }
            int r1 = r4.size()     // Catch:{ all -> 0x15f3 }
            r0 = 100
            if (r1 < r0) goto L_0x1070
            java.lang.String r1 = "error adding/updating contact data MIMETYPE labels"
            r0 = r22
            X.AnonymousClass338.A00(r0, r1, r4)     // Catch:{ all -> 0x15f3 }
        L_0x1070:
            com.whatsapp.jid.UserJid r11 = X.AnonymousClass3ZH.A07(r10)     // Catch:{ all -> 0x15f3 }
            X.C626936e.A06(r11)     // Catch:{ all -> 0x15f3 }
            X.2k5 r0 = r10.A0F     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x10a6
            boolean r0 = r10.A10     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x10a6
            boolean r0 = r10.A0U()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x10a6
            X.4uZ r1 = r10.A0H     // Catch:{ all -> 0x15f3 }
            boolean r0 = r1 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x10a6
            boolean r0 = r1 instanceof X.AnonymousClass1fW     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x10a6
            r0 = r21
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x10ed
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "androidcontactssync/ --> missing raw contact "
            X.C18260x0.A1P(r1, r0, r10)     // Catch:{ all -> 0x15f3 }
            r0 = r26
            r0.add(r10)     // Catch:{ all -> 0x15f3 }
            goto L_0x1057
        L_0x10a6:
            r0 = r21
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x10ed
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "androidcontactssync/ --> incorrect/old raw contact "
            X.C18260x0.A1P(r1, r0, r10)     // Catch:{ all -> 0x15f3 }
            r0 = r21
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x15f3 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x15f3 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x15f3 }
        L_0x10c3:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x1057
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x15f3 }
            X.2ZH r0 = (X.AnonymousClass2ZH) r0     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r10 = android.content.ContentProviderOperation.newDelete(r23)     // Catch:{ all -> 0x15f3 }
            r1 = 1
            android.content.ContentProviderOperation$Builder r12 = r10.withYieldAllowed(r1)     // Catch:{ all -> 0x15f3 }
            java.lang.String r11 = "_id=?"
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x15f3 }
            long r0 = r0.A00     // Catch:{ all -> 0x15f3 }
            X.C18260x0.A1X(r10, r0)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = r12.withSelection(r11, r10)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x15f3 }
            r4.add(r0)     // Catch:{ all -> 0x15f3 }
            goto L_0x10c3
        L_0x10ed:
            r0 = r21
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x1057
            r0 = r21
            java.lang.Object r1 = r0.get(r11)     // Catch:{ all -> 0x15f3 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x15f3 }
            int r0 = r1.size()     // Catch:{ all -> 0x15f3 }
            r12 = 1
            int r0 = r0 - r12
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x15f3 }
            X.2ZH r0 = (X.AnonymousClass2ZH) r0     // Catch:{ all -> 0x15f3 }
            long r0 = r0.A00     // Catch:{ all -> 0x15f3 }
            r50 = r0
            java.lang.Long r13 = java.lang.Long.valueOf(r50)     // Catch:{ all -> 0x15f3 }
            r0 = r48
            java.lang.Object r12 = r0.get(r13)     // Catch:{ all -> 0x15f3 }
            java.util.Set r12 = (java.util.Set) r12     // Catch:{ all -> 0x15f3 }
            if (r12 == 0) goto L_0x11f2
            java.lang.String r14 = "vnd.android.cursor.item/name"
            r0 = 0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x15f3 }
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x1207
            r0 = r47
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x1145
            r0 = r20
            android.content.ContentProviderOperation$Builder r14 = A01(r0, r13, r14)     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = "data1"
            java.lang.String r0 = r10.A0J()     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A0Z(r14, r0, r1, r4)     // Catch:{ all -> 0x15f3 }
            r0 = r47
            r0.add(r13)     // Catch:{ all -> 0x15f3 }
        L_0x1145:
            r0 = r18
            X.33j r1 = r0.A04     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = r11.user     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = X.AnonymousClass36P.A07(r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String r36 = r1.A0I(r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r0 = 2
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x15f3 }
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x1188
            r0 = r46
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x1188
            r0 = r20
            android.content.ContentProviderOperation$Builder r0 = A01(r0, r13, r1)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r15 = A00(r0, r11, r9)     // Catch:{ all -> 0x15f3 }
            r14 = 2131886288(0x7f1200d0, float:1.940715E38)
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r36)     // Catch:{ all -> 0x15f3 }
            r0 = r60
            java.lang.String r0 = r0.getString(r14, r1)     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A0Z(r15, r0, r7, r4)     // Catch:{ all -> 0x15f3 }
            r0 = r46
            r0.add(r13)     // Catch:{ all -> 0x15f3 }
        L_0x1188:
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r0 = 3
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x15f3 }
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x11bd
            r0 = r45
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x11bd
            r0 = r20
            android.content.ContentProviderOperation$Builder r0 = A01(r0, r13, r1)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r15 = A00(r0, r11, r9)     // Catch:{ all -> 0x15f3 }
            r14 = 2131886290(0x7f1200d2, float:1.9407155E38)
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r36)     // Catch:{ all -> 0x15f3 }
            r0 = r60
            java.lang.String r0 = r0.getString(r14, r1)     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A0Z(r15, r0, r7, r4)     // Catch:{ all -> 0x15f3 }
            r0 = r45
            r0.add(r13)     // Catch:{ all -> 0x15f3 }
        L_0x11bd:
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r0 = 4
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x15f3 }
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x11f2
            r0 = r44
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x11f2
            r0 = r20
            android.content.ContentProviderOperation$Builder r0 = A01(r0, r13, r1)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r14 = A00(r0, r11, r9)     // Catch:{ all -> 0x15f3 }
            r11 = 2131886289(0x7f1200d1, float:1.9407153E38)
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r36)     // Catch:{ all -> 0x15f3 }
            r0 = r60
            java.lang.String r0 = r0.getString(r11, r1)     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A0Z(r14, r0, r7, r4)     // Catch:{ all -> 0x15f3 }
            r0 = r44
            r0.add(r13)     // Catch:{ all -> 0x15f3 }
        L_0x11f2:
            X.2k5 r0 = r10.A0F     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x1205
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x15f3 }
        L_0x11f8:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x1057
            boolean r0 = r8.containsKey(r13)     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x1057
            goto L_0x123a
        L_0x1205:
            r1 = 0
            goto L_0x11f8
        L_0x1207:
            X.2k5 r0 = r10.A0F     // Catch:{ all -> 0x15f3 }
            long r0 = r0.A00     // Catch:{ all -> 0x15f3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x15f3 }
            r0 = r30
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x1145
            android.content.ContentProviderOperation$Builder r36 = android.content.ContentProviderOperation.newUpdate(r20)     // Catch:{ all -> 0x15f3 }
            java.lang.String r15 = "raw_contact_id=? AND mimetype=?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = java.lang.String.valueOf(r50)     // Catch:{ all -> 0x15f3 }
            X.AnonymousClass000.A16(r0, r14, r1)     // Catch:{ all -> 0x15f3 }
            r0 = r36
            android.content.ContentProviderOperation$Builder r14 = r0.withSelection(r15, r1)     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = "data1"
            java.lang.String r0 = r10.A0J()     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A0Z(r14, r0, r1, r4)     // Catch:{ all -> 0x15f3 }
            goto L_0x1145
        L_0x123a:
            if (r12 == 0) goto L_0x1249
            r0 = 0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x15f3 }
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x15f3 }
            r36 = 1
            if (r0 != 0) goto L_0x124b
        L_0x1249:
            r36 = 0
        L_0x124b:
            java.lang.Object r0 = r8.get(r13)     // Catch:{ all -> 0x15f3 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x15f3 }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x15f3 }
            int r14 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x15f3 }
            java.lang.Object r0 = r8.get(r13)     // Catch:{ all -> 0x15f3 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x15f3 }
            java.lang.Object r12 = r0.second     // Catch:{ all -> 0x15f3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x15f3 }
            java.lang.Integer r0 = r10.A0L     // Catch:{ all -> 0x15f3 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x1283
            java.lang.String r0 = r10.A0V     // Catch:{ all -> 0x15f3 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x127e
            java.lang.String r11 = r10.A0V     // Catch:{ all -> 0x15f3 }
        L_0x1273:
            java.lang.Integer r0 = r10.A0L     // Catch:{ all -> 0x15f3 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x15f3 }
            boolean r15 = X.AnonymousClass000.A1U(r0, r14)
            goto L_0x1285
        L_0x127e:
            java.lang.String r11 = X.C18320x8.A0a(r60)     // Catch:{ all -> 0x15f3 }
            goto L_0x1273
        L_0x1283:
            r11 = 0
            goto L_0x1273
        L_0x1285:
            if (r11 == 0) goto L_0x128d
            boolean r14 = r11.equals(r12)     // Catch:{ all -> 0x15f3 }
            if (r14 != 0) goto L_0x1299
        L_0x128d:
            if (r12 == 0) goto L_0x1295
            boolean r14 = r12.equals(r11)     // Catch:{ all -> 0x15f3 }
            if (r14 != 0) goto L_0x1299
        L_0x1295:
            if (r11 != 0) goto L_0x12a3
            if (r12 != 0) goto L_0x12a3
        L_0x1299:
            r12 = 1
        L_0x129a:
            if (r15 == 0) goto L_0x12a0
            if (r0 != 0) goto L_0x1057
            if (r12 != 0) goto L_0x1057
        L_0x12a0:
            if (r36 != 0) goto L_0x12ea
            goto L_0x12a5
        L_0x12a3:
            r12 = 0
            goto L_0x129a
        L_0x12a5:
            r0 = r43
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x1057
            android.content.ContentProviderOperation$Builder r12 = android.content.ContentProviderOperation.newInsert(r20)     // Catch:{ all -> 0x15f3 }
            r0 = 1
            android.content.ContentProviderOperation$Builder r0 = r12.withYieldAllowed(r0)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r14 = r0.withValue(r2, r13)     // Catch:{ all -> 0x15f3 }
            java.lang.String r12 = "vnd.android.cursor.item/phone_v2"
            r0 = r24
            android.content.ContentProviderOperation$Builder r12 = r14.withValue(r0, r12)     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "data1"
            android.content.ContentProviderOperation$Builder r12 = r12.withValue(r0, r1)     // Catch:{ all -> 0x15f3 }
            java.lang.Integer r1 = r10.A0L     // Catch:{ all -> 0x15f3 }
            r0 = r19
            android.content.ContentProviderOperation$Builder r0 = r12.withValue(r0, r1)     // Catch:{ all -> 0x15f3 }
            java.lang.Integer r1 = r10.A0L     // Catch:{ all -> 0x15f3 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x15f3 }
            if (r1 != 0) goto L_0x12dc
            r0.withValue(r7, r11)     // Catch:{ all -> 0x15f3 }
        L_0x12dc:
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x15f3 }
            r4.add(r0)     // Catch:{ all -> 0x15f3 }
            r0 = r43
            r0.add(r13)     // Catch:{ all -> 0x15f3 }
            goto L_0x1057
        L_0x12ea:
            android.content.ContentProviderOperation$Builder r12 = android.content.ContentProviderOperation.newUpdate(r20)     // Catch:{ all -> 0x15f3 }
            java.lang.Integer r1 = r10.A0L     // Catch:{ all -> 0x15f3 }
            r0 = r19
            android.content.ContentProviderOperation$Builder r14 = r12.withValue(r0, r1)     // Catch:{ all -> 0x15f3 }
            java.lang.String r13 = "raw_contact_id=? AND mimetype=?"
            java.lang.String[] r12 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x15f3 }
            r0 = r50
            X.C18260x0.A1X(r12, r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = "vnd.android.cursor.item/phone_v2"
            r0 = 1
            r12[r0] = r1     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = r14.withSelection(r13, r12)     // Catch:{ all -> 0x15f3 }
            java.lang.Integer r1 = r10.A0L     // Catch:{ all -> 0x15f3 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x15f3 }
            if (r1 != 0) goto L_0x1317
            r0.withValue(r7, r11)     // Catch:{ all -> 0x15f3 }
        L_0x1317:
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x15f3 }
            r4.add(r0)     // Catch:{ all -> 0x15f3 }
            goto L_0x1057
        L_0x1320:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x132d
            java.lang.String r0 = "error adding/updating contact data MIMETYPE labels"
            r1 = r22
            X.AnonymousClass338.A00(r1, r0, r4)     // Catch:{ all -> 0x15f3 }
        L_0x132d:
            r0 = r18
            X.33p r9 = r0.A03     // Catch:{ all -> 0x15f3 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r9)     // Catch:{ all -> 0x15f3 }
            java.lang.String r8 = "current_data_action_string_version"
            int r0 = X.C18280x3.A02(r0, r8)     // Catch:{ all -> 0x15f3 }
            r4 = 4
            if (r0 == r4) goto L_0x134a
            r10 = r18
            r1 = r17
            r0 = r60
            r10.A03(r1, r0)     // Catch:{ all -> 0x15f3 }
            X.C18260x0.A0L(r9, r8, r4)     // Catch:{ all -> 0x15f3 }
        L_0x134a:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x15f3 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x15f3 }
            X.5UR r46 = r57.A0R()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "androidcontactssync/recording raw contacts information to android contacts content provider"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            java.util.Iterator r45 = r26.iterator()     // Catch:{ all -> 0x15f3 }
        L_0x135f:
            boolean r0 = r45.hasNext()     // Catch:{ all -> 0x15f3 }
            java.lang.String r8 = "error while writing to android contacts provider"
            if (r0 == 0) goto L_0x1538
            X.3ZH r4 = X.C18310x6.A0R(r45)     // Catch:{ all -> 0x15f3 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r9 = X.AnonymousClass3ZH.A05(r4, r0)     // Catch:{ all -> 0x15f3 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x15f3 }
            int r1 = r10.size()     // Catch:{ all -> 0x15f3 }
            r0 = 100
            if (r1 < r0) goto L_0x1380
            r0 = r46
            X.AnonymousClass338.A00(r0, r8, r10)     // Catch:{ all -> 0x15f3 }
        L_0x1380:
            java.lang.String r0 = r9.user     // Catch:{ all -> 0x15f3 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x138c
            r11.add(r4)     // Catch:{ all -> 0x15f3 }
            goto L_0x135f
        L_0x138c:
            X.2k5 r0 = r4.A0F     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x14c7
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x15f3 }
            r44 = r0
        L_0x1394:
            java.lang.String r43 = r4.A0J()     // Catch:{ all -> 0x15f3 }
            long r20 = r4.A0F()     // Catch:{ all -> 0x15f3 }
            java.lang.Integer r0 = r4.A0L     // Catch:{ all -> 0x15f3 }
            r36 = r0
            java.lang.String r0 = r4.A0V     // Catch:{ all -> 0x15f3 }
            r30 = r0
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r4 = r0.buildUpon()     // Catch:{ all -> 0x15f3 }
            r1 = r34
            r0 = r32
            android.net.Uri r23 = X.C18290x4.A0H(r4, r1, r0)     // Catch:{ all -> 0x15f3 }
            int r8 = r10.size()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = r9.user     // Catch:{ all -> 0x15f3 }
            java.lang.String r4 = X.AnonymousClass36P.A07(r0)     // Catch:{ all -> 0x15f3 }
            r1 = 2131895577(0x7f122519, float:1.942599E38)
            r0 = r60
            java.lang.String r12 = r0.getString(r1)     // Catch:{ all -> 0x15f3 }
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "AndroidContactsSyncHelper/addRawContactOperations raw contact at "
            r13.append(r0)     // Catch:{ all -> 0x15f3 }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            r13.append(r0)     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = " <"
            r13.append(r1)     // Catch:{ all -> 0x15f3 }
            r0 = r17
            r13.append(r0)     // Catch:{ all -> 0x15f3 }
            r0 = 44
            r13.append(r0)     // Catch:{ all -> 0x15f3 }
            r13.append(r9)     // Catch:{ all -> 0x15f3 }
            r0 = 62
            X.C18270x1.A1E(r13, r0)     // Catch:{ all -> 0x15f3 }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r14 = android.content.ContentProviderOperation.newInsert(r0)     // Catch:{ all -> 0x15f3 }
            r0 = r17
            java.lang.String r13 = r0.name     // Catch:{ all -> 0x15f3 }
            r0 = r37
            android.content.ContentProviderOperation$Builder r14 = r14.withValue(r0, r13)     // Catch:{ all -> 0x15f3 }
            r0 = r17
            java.lang.String r13 = r0.type     // Catch:{ all -> 0x15f3 }
            r0 = r35
            android.content.ContentProviderOperation$Builder r14 = r14.withValue(r0, r13)     // Catch:{ all -> 0x15f3 }
            java.lang.String r13 = r9.getRawString()     // Catch:{ all -> 0x15f3 }
            r0 = r31
            android.content.ContentProviderOperation$Builder r14 = r14.withValue(r0, r13)     // Catch:{ all -> 0x15f3 }
            java.lang.String r13 = "sync2"
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = r14.withValue(r13, r0)     // Catch:{ all -> 0x15f3 }
            r13 = 1
            android.content.ContentProviderOperation$Builder r0 = r0.withYieldAllowed(r13)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x15f3 }
            r10.add(r0)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = android.content.ContentProviderOperation.newInsert(r23)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r15 = r0.withValueBackReference(r2, r8)     // Catch:{ all -> 0x15f3 }
            java.lang.String r14 = "vnd.android.cursor.item/name"
            r0 = r24
            android.content.ContentProviderOperation$Builder r15 = r15.withValue(r0, r14)     // Catch:{ all -> 0x15f3 }
            java.lang.String r22 = "data1"
            r14 = r22
            r0 = r43
            X.C18270x1.A0Z(r15, r0, r14, r10)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = android.content.ContentProviderOperation.newInsert(r23)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r15 = r0.withValueBackReference(r2, r8)     // Catch:{ all -> 0x15f3 }
            java.lang.String r14 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r0 = r24
            android.content.ContentProviderOperation$Builder r0 = r15.withValue(r0, r14)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r21 = A00(r0, r9, r12)     // Catch:{ all -> 0x15f3 }
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ all -> 0x15f3 }
            r20 = 0
            r15[r20] = r4     // Catch:{ all -> 0x15f3 }
            r14 = 2131886288(0x7f1200d0, float:1.940715E38)
            r0 = r60
            java.lang.String r14 = r0.getString(r14, r15)     // Catch:{ all -> 0x15f3 }
            r0 = r21
            X.C18270x1.A0Z(r0, r14, r7, r10)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = android.content.ContentProviderOperation.newInsert(r23)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r15 = r0.withValueBackReference(r2, r8)     // Catch:{ all -> 0x15f3 }
            java.lang.String r14 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r0 = r24
            android.content.ContentProviderOperation$Builder r0 = r15.withValue(r0, r14)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r15 = A00(r0, r9, r12)     // Catch:{ all -> 0x15f3 }
            r14 = 2131886290(0x7f1200d2, float:1.9407155E38)
            r0 = r60
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r0, r4, r13, r14)     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A0Z(r15, r0, r7, r10)     // Catch:{ all -> 0x15f3 }
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r13 = "AndroidContactsSyncHelper/addRawContactOperations raw contact data at "
            r0 = r23
            X.AnonymousClass000.A17(r0, r13, r1, r14)     // Catch:{ all -> 0x15f3 }
            java.lang.String r15 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r14.append(r15)     // Catch:{ all -> 0x15f3 }
            r0 = 44
            r14.append(r0)     // Catch:{ all -> 0x15f3 }
            r14.append(r9)     // Catch:{ all -> 0x15f3 }
            r0 = 62
            X.C18270x1.A1E(r14, r0)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = android.content.ContentProviderOperation.newInsert(r23)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r14 = r0.withValueBackReference(r2, r8)     // Catch:{ all -> 0x15f3 }
            r0 = r24
            android.content.ContentProviderOperation$Builder r0 = r14.withValue(r0, r15)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r15 = A00(r0, r9, r12)     // Catch:{ all -> 0x15f3 }
            r14 = 2131886289(0x7f1200d1, float:1.9407153E38)
            r12 = 1
            r0 = r60
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r0, r4, r12, r14)     // Catch:{ all -> 0x15f3 }
            X.C18270x1.A0Z(r15, r0, r7, r10)     // Catch:{ all -> 0x15f3 }
            goto L_0x14cb
        L_0x14c7:
            r44 = 0
            goto L_0x1394
        L_0x14cb:
            if (r44 == 0) goto L_0x135f
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            r0 = r23
            X.AnonymousClass000.A17(r0, r13, r1, r4)     // Catch:{ all -> 0x15f3 }
            java.lang.String r1 = "vnd.android.cursor.item/phone_v2"
            r4.append(r1)     // Catch:{ all -> 0x15f3 }
            r0 = 44
            r4.append(r0)     // Catch:{ all -> 0x15f3 }
            r4.append(r9)     // Catch:{ all -> 0x15f3 }
            r4.append(r0)     // Catch:{ all -> 0x15f3 }
            r9 = r36
            r4.append(r9)     // Catch:{ all -> 0x15f3 }
            r4.append(r0)     // Catch:{ all -> 0x15f3 }
            r0 = r30
            r4.append(r0)     // Catch:{ all -> 0x15f3 }
            r0 = 62
            X.C18270x1.A1E(r4, r0)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = android.content.ContentProviderOperation.newInsert(r23)     // Catch:{ all -> 0x15f3 }
            android.content.ContentProviderOperation$Builder r0 = r0.withValueBackReference(r2, r8)     // Catch:{ all -> 0x15f3 }
            r4 = r24
            android.content.ContentProviderOperation$Builder r4 = r0.withValue(r4, r1)     // Catch:{ all -> 0x15f3 }
            r1 = r22
            r0 = r44
            android.content.ContentProviderOperation$Builder r1 = r4.withValue(r1, r0)     // Catch:{ all -> 0x15f3 }
            if (r36 == 0) goto L_0x1515
            int r20 = r36.intValue()     // Catch:{ all -> 0x15f3 }
        L_0x1515:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x15f3 }
            r4 = r19
            r1.withValue(r4, r0)     // Catch:{ all -> 0x15f3 }
            if (r20 != 0) goto L_0x152f
            boolean r0 = android.text.TextUtils.isEmpty(r30)     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x152a
            java.lang.String r30 = X.C18320x8.A0a(r60)     // Catch:{ all -> 0x15f3 }
        L_0x152a:
            r0 = r30
            r1.withValue(r7, r0)     // Catch:{ all -> 0x15f3 }
        L_0x152f:
            android.content.ContentProviderOperation r0 = r1.build()     // Catch:{ all -> 0x15f3 }
            r10.add(r0)     // Catch:{ all -> 0x15f3 }
            goto L_0x135f
        L_0x1538:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x1543
            r0 = r46
            X.AnonymousClass338.A00(r0, r8, r10)     // Catch:{ all -> 0x15f3 }
        L_0x1543:
            java.lang.String r0 = "androidcontactssync/finished recording raw contacts information to android contacts content provider"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x15f3 }
            r1 = r58
            r0 = r40
            android.content.SharedPreferences$Editor r2 = X.C60152y5.A00(r1, r0)     // Catch:{ all -> 0x15f3 }
            r1 = 3
            r0 = r41
            android.content.SharedPreferences$Editor r0 = r2.putInt(r0, r1)     // Catch:{ all -> 0x15f3 }
            r0.commit()     // Catch:{ all -> 0x15f3 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "androidcontactssync/missing raw contacts added "
            r1 = r26
            X.C18260x0.A19(r0, r2, r1)     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = " in "
            r2.append(r0)     // Catch:{ all -> 0x15f3 }
            long r0 = X.AnonymousClass0x9.A05(r38)     // Catch:{ all -> 0x15f3 }
            r2.append(r0)     // Catch:{ all -> 0x15f3 }
            r0 = r42
            X.C18260x0.A1J(r2, r0)     // Catch:{ all -> 0x15f3 }
            boolean r0 = r33.isEmpty()     // Catch:{ all -> 0x15f3 }
            if (r0 != 0) goto L_0x15d7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x15f3 }
            java.lang.String r0 = "androidcontactssync/submit deletion from raw-contacts table size="
            r2 = r33
            X.C18260x0.A1A(r0, r1, r2)     // Catch:{ all -> 0x15f3 }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x15f3 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ all -> 0x15f3 }
            r0 = r17
            java.lang.String r1 = r0.name     // Catch:{ all -> 0x15f3 }
            r0 = r37
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)     // Catch:{ all -> 0x15f3 }
            r1 = r17
            java.lang.String r1 = r1.type     // Catch:{ all -> 0x15f3 }
            r2 = r35
            android.net.Uri$Builder r2 = r0.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x15f3 }
            r1 = r34
            r0 = r32
            android.net.Uri r2 = X.C18290x4.A0H(r2, r1, r0)     // Catch:{ all -> 0x15f3 }
            java.util.Iterator r8 = r33.iterator()     // Catch:{ all -> 0x15f3 }
        L_0x15ad:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x15f3 }
            if (r0 == 0) goto L_0x15d7
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x15f3 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x15d0 }
            java.lang.String r1 = "androidcontactssync/deleting raw contact rows size="
            r0 = r33
            X.C18260x0.A1A(r1, r4, r0)     // Catch:{ Exception -> 0x15d0 }
            X.5UR r4 = r57.A0R()     // Catch:{ Exception -> 0x15d0 }
            java.lang.String r1 = "_id = ?"
            java.lang.String[] r0 = X.C18270x1.A1b(r7)     // Catch:{ Exception -> 0x15d0 }
            r4.A01(r2, r1, r0)     // Catch:{ Exception -> 0x15d0 }
            goto L_0x15ad
        L_0x15d0:
            r1 = move-exception
            java.lang.String r0 = "androidcontactssync/error deleting raw contacts with deleted=1"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x15f3 }
            goto L_0x15ad
        L_0x15d7:
            monitor-exit(r18)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            boolean r0 = r11.isEmpty()     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            if (r0 != 0) goto L_0x168a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            java.lang.String r0 = "androidcontactssync/invalid contacts found during android contacts sync; removing "
            X.AnonymousClass000.A1H(r0, r1, r11)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            java.lang.String r0 = " contacts"
            X.C18260x0.A1M(r1, r0)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            r0 = r59
            r0.A0g(r11)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            goto L_0x168a
        L_0x15f3:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
            throw r0     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
        L_0x15f6:
            r1 = move-exception
            if (r4 == 0) goto L_0x1601
            r4.close()     // Catch:{ all -> 0x15fd }
            goto L_0x1601
        L_0x15fd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1602 }
        L_0x1601:
            throw r1     // Catch:{ all -> 0x1602 }
        L_0x1602:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x1607 }
            goto L_0x160b
        L_0x1607:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
        L_0x160b:
            throw r1     // Catch:{ SecurityException -> 0x162a, NullPointerException -> 0x1673, RuntimeException -> 0x160c }
        L_0x160c:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto L_0x1623
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x1627
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof android.os.DeadSystemException
            if (r0 == 0) goto L_0x1627
        L_0x1623:
            X.304 r3 = X.AnonymousClass304.A02
            goto L_0x00bc
        L_0x1627:
            java.lang.String r2 = "SyncTask/sync/RuntimeException"
            goto L_0x1676
        L_0x162a:
            r4 = move-exception
            java.lang.String r2 = "SyncTask/sync/securityException"
            goto L_0x1676
        L_0x162e:
            java.lang.String r0 = "ContactSyncRequestExecutor/failure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            r4 = 1390(0x56e, float:1.948E-42)
            r1 = r86
            r0 = r32
            int r1 = r1.A0O(r0, r4)
            int r0 = r2.A00
            if (r0 > r1) goto L_0x166d
            int r1 = r3.A00
            r0 = 6
            if (r1 == r0) goto L_0x166d
            r0 = r89
            r0.A02(r3)
        L_0x1651:
            java.lang.Long r0 = r6.A09
            if (r0 != 0) goto L_0x166a
            int r1 = r3.A00
            r0 = 3
            if (r1 == 0) goto L_0x1664
            r0 = 4
            if (r1 == r0) goto L_0x1664
            r0 = 5
            if (r1 == r0) goto L_0x1664
            r0 = 6
            if (r1 == r0) goto L_0x1664
            r0 = -1
        L_0x1664:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r6.A09 = r0
        L_0x166a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x16e7
        L_0x166d:
            r0 = r89
            r0.A03(r3)
            goto L_0x1651
        L_0x1673:
            r4 = move-exception
            java.lang.String r2 = "SyncTask/sync/npe"
        L_0x1676:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactSyncRequestExecutor/"
            X.C18260x0.A0u(r0, r2, r1, r4)
            X.2qk r1 = r5.A02
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r2)
            X.C55682qk.A04(r1, r0, r4)
        L_0x1688:
            if (r16 == 0) goto L_0x16d7
        L_0x168a:
            r0 = r16
            java.util.List r2 = r0.A00
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x169e
            r0 = r16
            java.util.Map r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x16d7
        L_0x169e:
            X.3Ex r0 = r5.A0A
            X.1vC r4 = r0.A05
            r0 = r16
            java.util.Map r1 = r0.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x1731
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x1731
        L_0x16b2:
            android.content.SharedPreferences r0 = r87.A02()
            java.lang.String r4 = "contact_version"
            int r2 = X.C18280x3.A02(r0, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-sync-prefs/getversion="
            X.C18260x0.A0y(r0, r1, r2)
            int r2 = r2 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-sync-prefs/setversion="
            X.C18260x0.A0y(r0, r1, r2)
            android.content.SharedPreferences$Editor r0 = X.C56882si.A01(r87)
            X.C18270x1.A0h(r0, r4, r2)
        L_0x16d7:
            java.lang.Long r0 = r6.A0F
            if (r0 == 0) goto L_0x1715
            long r7 = r0.longValue()
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x1715
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x16e7:
            r6.A04 = r0
            r0 = r85
            r0.A01(r6)
            X.4FV r0 = r0.A01
            r0.BhD(r6)
        L_0x16f3:
            long r6 = r84.A03()
            long r8 = r28 - r6
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactSyncAdapter/excessive internal storage used before: "
            r2.append(r0)
            r0 = r28
            r2.append(r0)
            java.lang.String r0 = " now"
            X.C18270x1.A1B(r0, r2, r6)
            goto L_0x00bc
        L_0x1715:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.A04 = r0
            r6.A00 = r0
            r0 = r85
            r0.A01(r6)
            X.4FV r2 = r0.A01
            X.5ZC r0 = r6.samplingRate
            int r0 = r0.A01
            int r1 = r0 * 10
            X.5ZC r0 = new X.5ZC
            r0.<init>(r1, r1)
            r2.BhC(r6, r0)
            goto L_0x16f3
        L_0x1731:
            X.4Fq r7 = X.C18630y0.A07(r4)     // Catch:{ RuntimeException -> 0x17b5 }
            X.3Yo r11 = r7.Axl()     // Catch:{ all -> 0x17ab }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x17a1 }
            java.lang.String r9 = "system_contacts_version_table"
            if (r0 != 0) goto L_0x176f
            android.content.ContentValues r8 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x17a1 }
            java.util.Iterator r10 = X.AnonymousClass000.A0q(r1)     // Catch:{ all -> 0x17a1 }
        L_0x174a:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x17a1 }
            if (r0 == 0) goto L_0x176f
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r10)     // Catch:{ all -> 0x17a1 }
            java.lang.String r1 = "id"
            java.lang.Object r0 = r4.getKey()     // Catch:{ all -> 0x17a1 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x17a1 }
            r8.put(r1, r0)     // Catch:{ all -> 0x17a1 }
            java.lang.String r1 = "version"
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x17a1 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x17a1 }
            r8.put(r1, r0)     // Catch:{ all -> 0x17a1 }
            X.AnonymousClass361.A0B(r8, r7, r9)     // Catch:{ all -> 0x17a1 }
            goto L_0x174a
        L_0x176f:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x17a1 }
            if (r0 != 0) goto L_0x1796
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x17a1 }
        L_0x1779:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x17a1 }
            if (r0 == 0) goto L_0x1796
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x17a1 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x17a1 }
            java.lang.String r4 = "id = ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x17a1 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x17a1 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x17a1 }
            X.AnonymousClass361.A08(r7, r9, r4, r2)     // Catch:{ all -> 0x17a1 }
            goto L_0x1779
        L_0x1796:
            r11.A00()     // Catch:{ all -> 0x17a1 }
            r11.close()     // Catch:{ all -> 0x17ab }
            r7.close()     // Catch:{ RuntimeException -> 0x17b5 }
            goto L_0x16b2
        L_0x17a1:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x17a6 }
            goto L_0x17aa
        L_0x17a6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x17ab }
        L_0x17aa:
            throw r1     // Catch:{ all -> 0x17ab }
        L_0x17ab:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x17b0 }
            goto L_0x17b4
        L_0x17b0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ RuntimeException -> 0x17b5 }
        L_0x17b4:
            throw r1     // Catch:{ RuntimeException -> 0x17b5 }
        L_0x17b5:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/system-version; apply-failed"
            X.C626936e.A08(r0, r1)
            goto L_0x16b2
        L_0x17bd:
            if (r19 == 0) goto L_0x17c8
            java.lang.String r0 = "ContactSyncRequestExecutor/No device to sync separately."
        L_0x17c1:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.304 r3 = X.AnonymousClass304.A08
            goto L_0x00b7
        L_0x17c8:
            if (r54 == 0) goto L_0x17cd
            java.lang.String r0 = "ContactSyncRequestExecutor/No payment to sync separately."
            goto L_0x17c1
        L_0x17cd:
            if (r51 == 0) goto L_0x17d2
            java.lang.String r0 = "ContactSyncRequestExecutor/No picture to sync separately."
            goto L_0x17c1
        L_0x17d2:
            java.lang.String r0 = "ContactSyncRequestExecutor/No contact to sync separately."
            goto L_0x17c1
        L_0x17d5:
            java.lang.String r0 = "ContactSyncRequestExecutor/onStop."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x17fb }
            r1 = 0
            monitor-enter(r25)     // Catch:{ all -> 0x17fb }
            r0 = r25
            r0.A00 = r1     // Catch:{ all -> 0x17f8 }
            r25.A01()     // Catch:{ all -> 0x17f8 }
            monitor-exit(r25)     // Catch:{ all -> 0x17fb }
            r1 = 0
            r0 = r27
            r0.set(r1)     // Catch:{ all -> 0x17fb }
            monitor-exit(r27)     // Catch:{ all -> 0x17fb }
            r0 = 44
            X.3a7 r1 = new X.3a7
            r1.<init>(r5, r0, r3)
            r0 = r88
            r0.A0S(r1)
            return
        L_0x17f8:
            r0 = move-exception
            monitor-exit(r25)     // Catch:{ all -> 0x17fb }
            throw r0     // Catch:{ all -> 0x17fb }
        L_0x17fb:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x17fb }
            throw r0
        L_0x17fe:
            throw r7     // Catch:{ all -> 0x17ff }
        L_0x17ff:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x1802:
            r1 = move-exception
            goto L_0x181d
        L_0x1804:
            r1 = move-exception
            if (r7 == 0) goto L_0x180f
            r7.close()     // Catch:{ all -> 0x180b }
            goto L_0x180f
        L_0x180b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1810 }
        L_0x180f:
            throw r1     // Catch:{ all -> 0x1810 }
        L_0x1810:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x1815 }
            goto L_0x1819
        L_0x1815:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x181a }
        L_0x1819:
            throw r1     // Catch:{ all -> 0x181a }
        L_0x181a:
            r1 = move-exception
            goto L_0x181d
        L_0x181c:
            r1 = move-exception
        L_0x181d:
            java.util.Map r0 = r4.A0T
            r0.clear()
            java.util.Map r0 = r4.A0R
            r0.clear()
            java.util.Map r0 = r4.A0Q
            r0.clear()
            java.util.Map r0 = r4.A0S
            r0.clear()
            java.util.Map r0 = r4.A0P
            r0.clear()
            r4.A01 = r10
            r4.A02 = r10
            r36.A01()
            throw r1
        L_0x183e:
            r1 = move-exception
            if (r10 == 0) goto L_0x1849
            r10.close()     // Catch:{ all -> 0x1845 }
            goto L_0x1849
        L_0x1845:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x184a }
        L_0x1849:
            throw r1     // Catch:{ all -> 0x184a }
        L_0x184a:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x184f }
            throw r1
        L_0x184f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x1854:
            r0 = move-exception
            monitor-exit(r25)     // Catch:{ all -> 0x1857 }
            throw r0     // Catch:{ all -> 0x1857 }
        L_0x1857:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x1857 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71243bn.run():void");
    }

    public static ContentProviderOperation.Builder A01(Uri uri, Object obj, Object obj2) {
        return ContentProviderOperation.newInsert(uri).withYieldAllowed(true).withValue("raw_contact_id", obj).withValue("mimetype", obj2);
    }
}
