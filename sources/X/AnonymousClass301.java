package X;

import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.301  reason: invalid class name */
public class AnonymousClass301 {
    public final C116985rC A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final AnonymousClass4F4 A03;
    public final C50072ha A04;
    public final C64773Ex A05;
    public final C56642sK A06;
    public final C56612sH A07;
    public final C621133n A08;
    public final C48972fm A09;
    public final C56122rS A0A;
    public final C56542sA A0B;
    public final C56922sm A0C;
    public final C56982ss A0D;
    public final AnonymousClass313 A0E;
    public final C56892sj A0F;
    public final C50012hU A0G;
    public final C56082rO A0H;
    public final C620233e A0I;
    public final C55302q8 A0J;
    public final C56662sM A0K;
    public final AnonymousClass311 A0L;
    public final C620333f A0M;
    public final C60052xv A0N;
    public final AnonymousClass1VX A0O;
    public final AnonymousClass33H A0P;
    public final C28131fk A0Q;
    public final C55832qz A0R;
    public final AnonymousClass4FS A0S;
    public final C29111iI A0T;

    public final boolean A03(AnonymousClass1ES r10, C624134x r11) {
        try {
            if (C624134x.A0g(r11)) {
                this.A03.Bh2(r10, r11);
            }
            r11.A1B(65536);
            C56082rO r7 = this.A0H;
            long A002 = r7.A00("next_sort_id_for_companion_history_sync", -2);
            r11.A1M = A002;
            long j = A002 - 1;
            C626936e.A0E(AnonymousClass001.A1V((j > r7.A00("next_sort_id_for_companion_history_sync", -2) ? 1 : (j == r7.A00("next_sort_id_for_companion_history_sync", -2) ? 0 : -1))), "The next sort_id for a historical message should be negative and smaller than our last used sort_id.");
            r7.A04("next_sort_id_for_companion_history_sync", j);
            if (r11.A05 > 0) {
                this.A0E.A04(r11, r11.A0K);
            }
            this.A0R.A06(r11);
            this.A0M.A0D(r11);
            return true;
        } catch (SQLiteConstraintException unused) {
            Log.w("HistorySyncChunkProcessor/ tried to insert duplicate message");
            return false;
        } catch (Exception e) {
            Log.e("HistorySyncChunkProcessor/ could not insert message into db", e);
            return false;
        }
    }

    public final void A02(AnonymousClass2NP r10, C58922w2 r11, File file) {
        Log.d("HistorySyncChunkProcessor process with file");
        try {
            C42792Pn r4 = new C42792Pn();
            r4.A03 = file.length();
            r4.A02 = r11.A03;
            r4.A01 = this.A07.A0H();
            A01(r10, r4, file, C627536m.A0V(file), r11.A01, r11.A00);
        } catch (IOException unused) {
            Log.e("HistorySyncChunkProcessor/ unable to read file data");
        }
    }

    public AnonymousClass301(C116985rC r2, C69263Wi r3, C56972sr r4, AnonymousClass4F4 r5, C50072ha r6, C64773Ex r7, C56642sK r8, C56612sH r9, C621133n r10, C48972fm r11, C56122rS r12, C56542sA r13, C56922sm r14, C56982ss r15, AnonymousClass313 r16, C56892sj r17, C50012hU r18, C56082rO r19, C620233e r20, C55302q8 r21, C56662sM r22, AnonymousClass311 r23, C620333f r24, C60052xv r25, AnonymousClass1VX r26, AnonymousClass33H r27, C28131fk r28, C55832qz r29, AnonymousClass4FS r30, C29111iI r31) {
        this.A07 = r9;
        this.A0O = r26;
        this.A01 = r3;
        this.A0C = r14;
        this.A0S = r30;
        this.A02 = r4;
        this.A0D = r15;
        this.A0I = r20;
        this.A0B = r13;
        this.A0A = r12;
        this.A0G = r18;
        this.A09 = r11;
        this.A05 = r7;
        this.A0T = r31;
        this.A0R = r29;
        this.A0K = r22;
        this.A0H = r19;
        this.A08 = r10;
        this.A00 = r2;
        this.A0M = r24;
        this.A0Q = r28;
        this.A06 = r8;
        this.A0P = r27;
        this.A0E = r16;
        this.A0L = r23;
        this.A03 = r5;
        this.A04 = r6;
        this.A0F = r17;
        this.A0J = r21;
        this.A0N = r25;
    }

    public List A00(List list) {
        C624134x r3;
        boolean z;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1ES r4 = ((C21411Bs) it.next()).message_;
            if (r4 == null) {
                r4 = AnonymousClass1ES.DEFAULT_INSTANCE;
            }
            try {
                r3 = this.A0P.A04(new C50972j4(C371120z.FOR_COMPANION_SYNC), r4);
            } catch (Exception e) {
                Log.e("HistorySyncChunkProcessor/ failed to parse wmi of history sync message", e);
                r3 = null;
            }
            if (r3 == null) {
                z = false;
            } else {
                z = true;
                if (r3.A0N == C371321b.USERNAME) {
                    z = C56952sp.A0J(this.A0O, 6595);
                }
            }
            if (z && A03(r4, r3)) {
                A0s.add(r3);
            }
        }
        return A0s;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public final void A01(X.AnonymousClass2NP r42, X.C42792Pn r43, java.io.File r44, byte[] r45, int r46, int r47) {
        /*
            r41 = this;
            X.1E2 r0 = X.AnonymousClass1E2.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x085b }
            r1 = r45
            X.6cX r3 = X.C130786cX.A05(r0, r1)     // Catch:{ IOException -> 0x085b }
            X.1E2 r3 = (X.AnonymousClass1E2) r3     // Catch:{ IOException -> 0x085b }
            int r1 = r3.progress_     // Catch:{ IOException -> 0x085b }
            r40 = r43
            r0 = r40
            r0.A00 = r1     // Catch:{ IOException -> 0x085b }
            r2 = r41
            X.2ha r7 = r2.A04     // Catch:{ IOException -> 0x085b }
            long r10 = (long) r1     // Catch:{ IOException -> 0x085b }
            long r8 = r0.A03     // Catch:{ IOException -> 0x085b }
            long r4 = r0.A02     // Catch:{ IOException -> 0x085b }
            long r0 = r0.A01     // Catch:{ IOException -> 0x085b }
            r13 = 0
            X.1aw r6 = new X.1aw     // Catch:{ IOException -> 0x085b }
            r6.<init>()     // Catch:{ IOException -> 0x085b }
            java.lang.Integer r12 = X.AnonymousClass001.A0f()     // Catch:{ IOException -> 0x085b }
            r6.A02 = r12     // Catch:{ IOException -> 0x085b }
            java.lang.String r12 = r7.A00()     // Catch:{ IOException -> 0x085b }
            r6.A0A = r12     // Catch:{ IOException -> 0x085b }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x085b }
            r6.A04 = r10     // Catch:{ IOException -> 0x085b }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x085b }
            r6.A05 = r8     // Catch:{ IOException -> 0x085b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x085b }
            r6.A09 = r0     // Catch:{ IOException -> 0x085b }
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x085b }
            java.lang.Long r0 = X.C18310x6.A0f(r0, r4)     // Catch:{ IOException -> 0x085b }
            r6.A06 = r0     // Catch:{ IOException -> 0x085b }
            java.lang.Integer r0 = X.C64663Ek.A01(r46)     // Catch:{ IOException -> 0x085b }
            r6.A00 = r0     // Catch:{ IOException -> 0x085b }
            java.lang.Integer r0 = X.C64663Ek.A00(r46)     // Catch:{ IOException -> 0x085b }
            r6.A01 = r0     // Catch:{ IOException -> 0x085b }
            X.2zf r1 = r7.A04     // Catch:{ IOException -> 0x085b }
            long r4 = r1.A05()     // Catch:{ IOException -> 0x085b }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x085b }
            r6.A07 = r0     // Catch:{ IOException -> 0x085b }
            long r0 = r1.A03()     // Catch:{ IOException -> 0x085b }
            java.lang.Long r0 = X.C18310x6.A0f(r4, r0)     // Catch:{ IOException -> 0x085b }
            r6.A08 = r0     // Catch:{ IOException -> 0x085b }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r47)     // Catch:{ IOException -> 0x085b }
            r6.A03 = r0     // Catch:{ IOException -> 0x085b }
            X.4FV r0 = r7.A06     // Catch:{ IOException -> 0x085b }
            r0.BhD(r6)     // Catch:{ IOException -> 0x085b }
            int r0 = r3.syncType_     // Catch:{ IOException -> 0x085b }
            X.23J r0 = X.AnonymousClass23J.A00(r0)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0082
            X.23J r0 = X.AnonymousClass23J.INITIAL_BOOTSTRAP     // Catch:{ IOException -> 0x085b }
        L_0x0082:
            int r0 = r0.ordinal()     // Catch:{ IOException -> 0x085b }
            switch(r0) {
                case 0: goto L_0x03d3;
                case 1: goto L_0x0219;
                case 2: goto L_0x012b;
                case 3: goto L_0x012b;
                case 4: goto L_0x03ab;
                case 5: goto L_0x00ad;
                default: goto L_0x0089;
            }     // Catch:{ IOException -> 0x085b }
        L_0x0089:
            java.lang.String r0 = "HistorySyncChunkProcessor/ invalid sync type"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x085b }
        L_0x008e:
            r0 = r42
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker r8 = r0.A01     // Catch:{ IOException -> 0x085b }
            X.2yM r7 = r8.A01     // Catch:{ IOException -> 0x085b }
            X.2w2 r9 = r0.A02     // Catch:{ IOException -> 0x085b }
            long r2 = r0.A00     // Catch:{ IOException -> 0x085b }
            java.lang.String r6 = r9.A08     // Catch:{ IOException -> 0x085b }
            X.2sr r0 = r7.A00     // Catch:{ IOException -> 0x085b }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)     // Catch:{ IOException -> 0x085b }
            X.2z0 r5 = X.AnonymousClass2z0.A04(r0, r6)     // Catch:{ IOException -> 0x085b }
            r0 = 1
            X.1nO r4 = new X.1nO     // Catch:{ IOException -> 0x085b }
            r4.<init>(r5, r0)     // Catch:{ IOException -> 0x085b }
            goto L_0x070d
        L_0x00ad:
            java.lang.String r0 = "HistorySyncChunkProcessor/addNonBlockingData"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x085b }
            X.8ya r0 = r3.callLogRecords_     // Catch:{ IOException -> 0x085b }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ IOException -> 0x085b }
        L_0x00b8:
            boolean r0 = r11.hasNext()     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = r11.next()     // Catch:{ IOException -> 0x085b }
            X.1E6 r1 = (X.AnonymousClass1E6) r1     // Catch:{ IOException -> 0x085b }
            X.35H r0 = X.AnonymousClass35H.A00     // Catch:{ IOException -> 0x085b }
            X.3ZF r8 = r0.A03(r1)     // Catch:{ IOException -> 0x085b }
            if (r8 == 0) goto L_0x00b8
            X.2rS r7 = r2.A0A     // Catch:{ IOException -> 0x085b }
            X.2l8 r4 = r8.A0I     // Catch:{ IOException -> 0x085b }
            if (r4 == 0) goto L_0x00ea
            X.2l7 r1 = r7.A00     // Catch:{ IOException -> 0x085b }
            java.lang.String r6 = r4.A02     // Catch:{ IOException -> 0x085b }
            X.2l8 r0 = r1.A02(r6)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x00ea
            com.whatsapp.jid.UserJid r5 = r4.A01     // Catch:{ IOException -> 0x085b }
            long r0 = r1.A00(r5, r6)     // Catch:{ IOException -> 0x085b }
            X.2l8 r4 = new X.2l8     // Catch:{ IOException -> 0x085b }
            r4.<init>(r5, r6, r0)     // Catch:{ IOException -> 0x085b }
            r8.A0G(r4)     // Catch:{ IOException -> 0x085b }
        L_0x00ea:
            X.3dV r0 = r7.A05     // Catch:{ IOException -> 0x085b }
            X.4Fq r10 = r0.A04()     // Catch:{ IOException -> 0x085b }
            X.3Yo r9 = r10.Axl()     // Catch:{ all -> 0x083d }
            X.39J r0 = r8.A0E     // Catch:{ all -> 0x0833 }
            android.content.ContentValues r6 = r7.A00(r0, r8)     // Catch:{ all -> 0x0833 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0833 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0833 }
            java.lang.String r4 = "call_log"
            r1 = 5
            java.lang.String r0 = "insertCallLog/INSERT_CALL_LOG"
            long r0 = r5.A0C(r4, r0, r6, r1)     // Catch:{ all -> 0x0833 }
            r8.A0F(r0)     // Catch:{ all -> 0x0833 }
            r8.A0B()     // Catch:{ all -> 0x0833 }
            r7.A05(r8)     // Catch:{ all -> 0x0833 }
            r9.A00()     // Catch:{ all -> 0x0833 }
            r9.close()     // Catch:{ all -> 0x083d }
            r10.close()     // Catch:{ IOException -> 0x085b }
            goto L_0x00b8
        L_0x011b:
            X.3Wi r4 = r2.A01     // Catch:{ IOException -> 0x085b }
            X.1iI r1 = r2.A0T     // Catch:{ IOException -> 0x085b }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IOException -> 0x085b }
            r0 = 24
            X.3Zi r0 = X.C69963Zi.A00(r1, r0)     // Catch:{ IOException -> 0x085b }
            r4.A0S(r0)     // Catch:{ IOException -> 0x085b }
        L_0x012b:
            X.1VX r4 = r2.A0O     // Catch:{ IOException -> 0x085b }
            r1 = 1706(0x6aa, float:2.39E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IOException -> 0x085b }
            boolean r0 = r4.A0Y(r0, r1)     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x008e
            X.8ya r0 = r3.conversations_     // Catch:{ IOException -> 0x085b }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ IOException -> 0x085b }
        L_0x013d:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x0212
            java.lang.Object r7 = r12.next()     // Catch:{ IOException -> 0x085b }
            X.1EG r7 = (X.AnonymousClass1EG) r7     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = r7.id_     // Catch:{ IOException -> 0x085b }
            X.4uZ r4 = X.C18310x6.A0S(r0)     // Catch:{ IOException -> 0x085b }
            if (r4 == 0) goto L_0x0207
            boolean r0 = r4 instanceof X.AnonymousClass1fS     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0207
            X.2ss r0 = r2.A0D     // Catch:{ IOException -> 0x085b }
            X.31A r4 = X.C56982ss.A00(r0, r4)     // Catch:{ IOException -> 0x085b }
            if (r4 != 0) goto L_0x0163
            java.lang.String r0 = "HistorySyncChunkProcessor/ received chat history from chat not sent in bootstrap"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x085b }
            goto L_0x013d
        L_0x0163:
            X.8ya r0 = r7.messages_     // Catch:{ IOException -> 0x085b }
            java.util.List r8 = r2.A00(r0)     // Catch:{ IOException -> 0x085b }
            int r0 = r7.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x018e
            int r1 = r7.endOfHistoryTransferType_     // Catch:{ IOException -> 0x085b }
            if (r1 == 0) goto L_0x017c
            r0 = 1
            if (r1 == r0) goto L_0x017f
            r0 = 2
            if (r1 != r0) goto L_0x017c
            X.22o r0 = X.C374222o.COMPLETE_ON_DEMAND_SYNC_BUT_MORE_MSG_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x085b }
            goto L_0x0181
        L_0x017c:
            X.22o r0 = X.C374222o.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x085b }
            goto L_0x0181
        L_0x017f:
            X.22o r0 = X.C374222o.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x085b }
        L_0x0181:
            int r5 = r0.ordinal()     // Catch:{ IOException -> 0x085b }
            r1 = 2
            r0 = 0
            if (r5 == r0) goto L_0x018b
            if (r5 != r1) goto L_0x018c
        L_0x018b:
            r0 = 2
        L_0x018c:
            r4.A03 = r0     // Catch:{ IOException -> 0x085b }
        L_0x018e:
            X.2sm r5 = r2.A0C     // Catch:{ IOException -> 0x085b }
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x01b3 }
            java.lang.String r1 = "history_sync_progress"
            int r0 = r4.A03     // Catch:{ all -> 0x01b3 }
            X.C18270x1.A0b(r6, r1, r0)     // Catch:{ all -> 0x01b3 }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
            int r0 = r5.A04(r6, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
            if (r0 != 0) goto L_0x01bf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
            java.lang.String r0 = "msgstore/historysyncprogress/did not update "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
            X.4uZ r0 = r4.A0q     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
            X.C18260x0.A0n(r0, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
            goto L_0x01bf
        L_0x01b3:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01b6, Error | RuntimeException -> 0x0847 }
        L_0x01b6:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException -> 0x085b }
            X.2q5 r0 = r5.A05     // Catch:{ IOException -> 0x085b }
            r0.A04()     // Catch:{ IOException -> 0x085b }
        L_0x01bf:
            int r0 = r8.size()     // Catch:{ IOException -> 0x085b }
            if (r0 <= 0) goto L_0x01fd
            monitor-enter(r4)     // Catch:{ IOException -> 0x085b }
            long r0 = r4.A0U     // Catch:{ all -> 0x084c }
            monitor-exit(r4)     // Catch:{ IOException -> 0x085b }
            r10 = 1
            r6 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x01ef
            r1 = 0
        L_0x01d1:
            int r0 = r8.size()     // Catch:{ IOException -> 0x085b }
            if (r1 >= r0) goto L_0x01ef
            X.34x r9 = X.C18320x8.A0R(r8, r1)     // Catch:{ IOException -> 0x085b }
            r0 = 1
            boolean r0 = X.C627636p.A0w(r9, r0)     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x0204
            long r0 = r9.A1M     // Catch:{ IOException -> 0x085b }
            r4.A0D(r0)     // Catch:{ IOException -> 0x085b }
            long r0 = r9.A1L     // Catch:{ IOException -> 0x085b }
            r4.A0C(r0)     // Catch:{ IOException -> 0x085b }
            r5.A05(r4)     // Catch:{ IOException -> 0x085b }
        L_0x01ef:
            X.2hU r0 = r2.A0G     // Catch:{ IOException -> 0x085b }
            android.os.Handler r5 = r0.A00     // Catch:{ IOException -> 0x085b }
            r4 = 29
            java.lang.Object r1 = r8.get(r6)     // Catch:{ IOException -> 0x085b }
            r0 = 5
            X.C18300x5.A16(r5, r1, r0, r4)     // Catch:{ IOException -> 0x085b }
        L_0x01fd:
            X.8ya r0 = r7.messages_     // Catch:{ IOException -> 0x085b }
            r0.size()     // Catch:{ IOException -> 0x085b }
            goto L_0x013d
        L_0x0204:
            int r1 = r1 + 1
            goto L_0x01d1
        L_0x0207:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = "HistorySyncChunkProcessor/ skip importing of chatJid="
            X.C18260x0.A1S(r1, r0, r4)     // Catch:{ IOException -> 0x085b }
            goto L_0x013d
        L_0x0212:
            X.8ya r0 = r3.conversations_     // Catch:{ IOException -> 0x085b }
            r0.size()     // Catch:{ IOException -> 0x085b }
            goto L_0x008e
        L_0x0219:
            X.8ya r8 = r3.statusV3Messages_     // Catch:{ IOException -> 0x085b }
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x085b }
            java.util.HashMap r6 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x085b }
            java.util.HashMap r12 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x085b }
            java.util.HashMap r5 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x085b }
            java.util.HashMap r10 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x085b }
            r0 = 0
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x085b }
            r4 = 0
        L_0x0235:
            int r0 = r8.size()     // Catch:{ IOException -> 0x085b }
            if (r4 >= r0) goto L_0x02e2
            java.lang.Object r3 = r8.get(r4)     // Catch:{ IOException -> 0x085b }
            X.1ES r3 = (X.AnonymousClass1ES) r3     // Catch:{ IOException -> 0x085b }
            X.20z r0 = X.C371120z.FOR_COMPANION_SYNC     // Catch:{ Exception -> 0x02d8 }
            X.2j4 r1 = new X.2j4     // Catch:{ Exception -> 0x02d8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02d8 }
            X.33H r0 = r2.A0P     // Catch:{ Exception -> 0x02d8 }
            X.34x r9 = r0.A04(r1, r3)     // Catch:{ Exception -> 0x02d8 }
            if (r9 == 0) goto L_0x02de
            boolean r0 = r2.A03(r3, r9)     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x02de
            com.whatsapp.jid.UserJid r1 = r9.A0o()     // Catch:{ IOException -> 0x085b }
            if (r1 != 0) goto L_0x0267
            X.2z0 r0 = r9.A1J     // Catch:{ IOException -> 0x085b }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x0267
            X.1fY r1 = X.AnonymousClass1fY.A00     // Catch:{ IOException -> 0x085b }
            X.C626936e.A06(r1)     // Catch:{ IOException -> 0x085b }
        L_0x0267:
            java.lang.Object r0 = r7.get(r1)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0270
            r7.put(r1, r9)     // Catch:{ IOException -> 0x085b }
        L_0x0270:
            java.lang.Object r0 = r6.get(r1)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0289
            X.2z0 r0 = r9.A1J     // Catch:{ IOException -> 0x085b }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0289
            int r0 = r3.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0289
            boolean r0 = r3.ignore_     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x0289
            r6.put(r1, r9)     // Catch:{ IOException -> 0x085b }
        L_0x0289:
            X.2z0 r0 = r9.A1J     // Catch:{ IOException -> 0x085b }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x02ad
            int r0 = r3.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0299
            boolean r0 = r3.ignore_     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x02ad
        L_0x0299:
            r12.put(r1, r9)     // Catch:{ IOException -> 0x085b }
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r1, r5)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x02a4
            r0 = r21
        L_0x02a4:
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x085b }
            int r0 = r0 + 1
            X.AnonymousClass0x2.A1I(r1, r5, r0)     // Catch:{ IOException -> 0x085b }
        L_0x02ad:
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r1, r10)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x02b5
            r0 = r21
        L_0x02b5:
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x085b }
            int r0 = r0 + 1
            X.AnonymousClass0x2.A1I(r1, r10, r0)     // Catch:{ IOException -> 0x085b }
            int r0 = X.AnonymousClass002.A03(r8)     // Catch:{ IOException -> 0x085b }
            if (r4 != r0) goto L_0x02cd
            X.2rO r11 = r2.A0H     // Catch:{ IOException -> 0x085b }
            java.lang.String r3 = "earliest_status_time"
            long r0 = r9.A0K     // Catch:{ IOException -> 0x085b }
            r11.A04(r3, r0)     // Catch:{ IOException -> 0x085b }
        L_0x02cd:
            X.2hU r0 = r2.A0G     // Catch:{ IOException -> 0x085b }
            android.os.Handler r3 = r0.A00     // Catch:{ IOException -> 0x085b }
            r1 = 5
            r0 = 29
            X.C18300x5.A16(r3, r9, r1, r0)     // Catch:{ IOException -> 0x085b }
            goto L_0x02de
        L_0x02d8:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncChunkProcessor/ failed to parse wmi of history sync message"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x085b }
        L_0x02de:
            int r4 = r4 + 1
            goto L_0x0235
        L_0x02e2:
            java.util.Iterator r20 = X.AnonymousClass001.A0u(r7)     // Catch:{ IOException -> 0x085b }
        L_0x02e6:
            boolean r0 = r20.hasNext()     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x008e
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r20)     // Catch:{ IOException -> 0x085b }
            com.whatsapp.jid.UserJid r4 = X.C18320x8.A0P(r0)     // Catch:{ IOException -> 0x085b }
            java.lang.Object r3 = r0.getValue()     // Catch:{ IOException -> 0x085b }
            X.C626936e.A06(r3)     // Catch:{ IOException -> 0x085b }
            X.34x r3 = (X.C624134x) r3     // Catch:{ IOException -> 0x085b }
            java.lang.Object r0 = r6.get(r4)     // Catch:{ IOException -> 0x085b }
            r16 = -9223372036854775808
            if (r0 != 0) goto L_0x0308
            r18 = -9223372036854775808
            goto L_0x0312
        L_0x0308:
            java.lang.Object r0 = X.C18290x4.A0i(r4, r6)     // Catch:{ IOException -> 0x085b }
            X.34x r0 = (X.C624134x) r0     // Catch:{ IOException -> 0x085b }
            long r0 = r0.A1M     // Catch:{ IOException -> 0x085b }
            r18 = r0
        L_0x0312:
            java.lang.Object r0 = r12.get(r4)     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x0322
            java.lang.Object r0 = X.C18290x4.A0i(r4, r12)     // Catch:{ IOException -> 0x085b }
            X.34x r0 = (X.C624134x) r0     // Catch:{ IOException -> 0x085b }
            long r0 = r0.A1M     // Catch:{ IOException -> 0x085b }
            r16 = r0
        L_0x0322:
            java.lang.Object r0 = r5.get(r4)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x032b
            r1 = r21
            goto L_0x0331
        L_0x032b:
            java.lang.Object r1 = X.C18290x4.A0i(r4, r5)     // Catch:{ IOException -> 0x085b }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ IOException -> 0x085b }
        L_0x0331:
            java.lang.Object r0 = X.C18290x4.A0i(r4, r10)     // Catch:{ IOException -> 0x085b }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x085b }
            X.33e r9 = r2.A0I     // Catch:{ IOException -> 0x085b }
            int r11 = r1.intValue()     // Catch:{ IOException -> 0x085b }
            int r26 = r0.intValue()     // Catch:{ IOException -> 0x085b }
            java.lang.Object r8 = r9.A07     // Catch:{ IOException -> 0x085b }
            monitor-enter(r8)     // Catch:{ IOException -> 0x085b }
            r9.A0A()     // Catch:{ all -> 0x084f }
            android.content.ContentValues r7 = X.C18300x5.A06()     // Catch:{ all -> 0x084f }
            X.34r r13 = r9.A05(r4)     // Catch:{ all -> 0x084f }
            r1 = 2
            if (r13 == 0) goto L_0x0380
            int r0 = r13.A02()     // Catch:{ all -> 0x084f }
            int r0 = r0 + r26
            r13.A08(r0)     // Catch:{ all -> 0x084f }
            int r0 = r13.A03()     // Catch:{ all -> 0x084f }
            if (r0 > r1) goto L_0x037a
            long r0 = r13.A04()     // Catch:{ all -> 0x084f }
        L_0x0365:
            r13.A09(r0)     // Catch:{ all -> 0x084f }
        L_0x0368:
            java.util.concurrent.ConcurrentHashMap r0 = r9.A09     // Catch:{ all -> 0x084f }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x084f }
            r0.put(r4, r13)     // Catch:{ all -> 0x084f }
            X.C620233e.A01(r7, r13)     // Catch:{ all -> 0x084f }
            r0 = 0
            r9.A0B(r7, r4, r3, r0)     // Catch:{ all -> 0x084f }
            monitor-exit(r8)     // Catch:{ all -> 0x084f }
            goto L_0x02e6
        L_0x037a:
            int r0 = r13.A03()     // Catch:{ all -> 0x084f }
            long r0 = (long) r0     // Catch:{ all -> 0x084f }
            goto L_0x0365
        L_0x0380:
            if (r11 > r1) goto L_0x0383
            goto L_0x0385
        L_0x0383:
            long r14 = (long) r11     // Catch:{ all -> 0x084f }
            goto L_0x0387
        L_0x0385:
            long r14 = r3.A1M     // Catch:{ all -> 0x084f }
        L_0x0387:
            X.2sH r0 = r9.A01     // Catch:{ all -> 0x084f }
            r39 = r0
            long r0 = r3.A1M     // Catch:{ all -> 0x084f }
            r29 = r0
            long r0 = r3.A0K     // Catch:{ all -> 0x084f }
            X.34r r13 = new X.34r     // Catch:{ all -> 0x084f }
            r31 = r18
            r24 = r4
            r25 = r11
            r27 = r29
            r29 = r18
            r33 = r16
            r35 = r14
            r37 = r0
            r22 = r13
            r23 = r39
            r22.<init>(r23, r24, r25, r26, r27, r29, r31, r33, r35, r37)     // Catch:{ all -> 0x084f }
            goto L_0x0368
        L_0x03ab:
            X.8ya r0 = r3.pushnames_     // Catch:{ IOException -> 0x085b }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ IOException -> 0x085b }
        L_0x03b1:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x008e
            java.lang.Object r4 = r5.next()     // Catch:{ IOException -> 0x085b }
            X.1BW r4 = (X.AnonymousClass1BW) r4     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = r4.id_     // Catch:{ IOException -> 0x085b }
            X.4uZ r0 = X.C18310x6.A0S(r0)     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x03b1
            X.3Ex r3 = r2.A05     // Catch:{ IOException -> 0x085b }
            X.3ZH r1 = r3.A0A(r0)     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = r4.pushname_     // Catch:{ IOException -> 0x085b }
            r1.A0b = r0     // Catch:{ IOException -> 0x085b }
            r3.A0N(r1)     // Catch:{ IOException -> 0x085b }
            goto L_0x03b1
        L_0x03d3:
            X.8ya r0 = r3.conversations_     // Catch:{ IOException -> 0x085b }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ IOException -> 0x085b }
        L_0x03d9:
            boolean r0 = r11.hasNext()     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x06c0
            java.lang.Object r4 = r11.next()     // Catch:{ IOException -> 0x085b }
            X.1EG r4 = (X.AnonymousClass1EG) r4     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = r4.id_     // Catch:{ IOException -> 0x085b }
            X.4uZ r14 = X.C18310x6.A0S(r0)     // Catch:{ IOException -> 0x085b }
            if (r14 == 0) goto L_0x06b5
            boolean r0 = r14 instanceof X.AnonymousClass1fS     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x06b5
            X.2ss r5 = r2.A0D     // Catch:{ IOException -> 0x085b }
            X.31A r0 = X.C56982ss.A00(r5, r14)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0424
            java.util.concurrent.CountDownLatch r7 = X.C18290x4.A14()     // Catch:{ IOException -> 0x085b }
            X.2sA r12 = r2.A0B     // Catch:{ IOException -> 0x085b }
            java.lang.String r1 = r4.name_     // Catch:{ IOException -> 0x085b }
            r0 = 25
            X.3Zi r15 = X.C69963Zi.A00(r7, r0)     // Catch:{ IOException -> 0x085b }
            r17 = 0
            r16 = r1
            r12.A02(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x085b }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x041e }
            r0 = 10
            boolean r0 = r7.await(r0, r6)     // Catch:{ InterruptedException -> 0x041e }
            if (r0 != 0) goto L_0x0424
            java.lang.String r0 = "HistorySyncChunkProcessor/ Chat creation timed out"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x041e }
            goto L_0x0424
        L_0x041e:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncChunkProcessor/ Chat creation interrupted."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x085b }
        L_0x0424:
            X.31A r6 = X.C56982ss.A00(r5, r14)     // Catch:{ IOException -> 0x085b }
            if (r6 != 0) goto L_0x0535
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoFromConversation ChatInfo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x085b }
        L_0x042f:
            X.8ya r0 = r4.messages_     // Catch:{ IOException -> 0x085b }
            java.util.List r7 = r2.A00(r0)     // Catch:{ IOException -> 0x085b }
            X.8ya r0 = r4.messages_     // Catch:{ IOException -> 0x085b }
            r0.size()     // Catch:{ IOException -> 0x085b }
            r10 = 0
            X.31A r5 = r5.A0A(r14, r10)     // Catch:{ IOException -> 0x085b }
            if (r5 != 0) goto L_0x04cc
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoWithAddedMessages ChatInfo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x085b }
        L_0x0446:
            X.3Ex r6 = r2.A05     // Catch:{ IOException -> 0x085b }
            X.3ZH r5 = r6.A0A(r14)     // Catch:{ IOException -> 0x085b }
            boolean r0 = r14 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x05eb
            java.lang.String r0 = r4.name_     // Catch:{ IOException -> 0x085b }
            r5.A0P = r0     // Catch:{ IOException -> 0x085b }
            java.lang.String r7 = r4.pHash_     // Catch:{ IOException -> 0x085b }
            java.lang.String r1 = "1:"
            boolean r0 = r7.startsWith(r1)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0462
            java.lang.String r7 = X.AnonymousClass000.A0T(r1, r7)     // Catch:{ IOException -> 0x085b }
        L_0x0462:
            r5.A0S = r7     // Catch:{ IOException -> 0x085b }
            boolean r0 = r4.suspended_     // Catch:{ IOException -> 0x085b }
            r5.A0s = r0     // Catch:{ IOException -> 0x085b }
            boolean r0 = r4.readOnly_     // Catch:{ IOException -> 0x085b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x049c
            X.4uZ r4 = r5.A0H     // Catch:{ IOException -> 0x085b }
            boolean r0 = r4 instanceof X.C28011fL     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x049a
            X.1fL r4 = (X.C28011fL) r4     // Catch:{ IOException -> 0x085b }
        L_0x0476:
            X.C626936e.A06(r4)     // Catch:{ IOException -> 0x085b }
            X.2sr r0 = r2.A02     // Catch:{ IOException -> 0x085b }
            com.whatsapp.jid.PhoneUserJid r15 = X.C56972sr.A05(r0)     // Catch:{ IOException -> 0x085b }
            X.2sj r1 = r2.A0F     // Catch:{ IOException -> 0x085b }
            r16 = 0
            X.2zG r14 = new X.2zG     // Catch:{ IOException -> 0x085b }
            r18 = r16
            r19 = r16
            r17 = r16
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ IOException -> 0x085b }
            java.util.List r0 = java.util.Collections.singletonList(r14)     // Catch:{ IOException -> 0x085b }
            r1.A07(r4, r13, r0)     // Catch:{ IOException -> 0x085b }
        L_0x0495:
            r6.A0O(r5)     // Catch:{ IOException -> 0x085b }
            goto L_0x03d9
        L_0x049a:
            r4 = 0
            goto L_0x0476
        L_0x049c:
            int r7 = r4.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r7
            if (r0 == 0) goto L_0x04ab
            long r0 = r4.createdAt_     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IOException -> 0x085b }
            r5.A0V = r0     // Catch:{ IOException -> 0x085b }
        L_0x04ab:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r7 = r7 & r0
            if (r7 == 0) goto L_0x04b8
            java.lang.String r0 = r4.createdBy_     // Catch:{ IOException -> 0x085b }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)     // Catch:{ IOException -> 0x085b }
            r5.A0I = r0     // Catch:{ IOException -> 0x085b }
        L_0x04b8:
            long r0 = r4.createdAt_     // Catch:{ IOException -> 0x085b }
            java.lang.String r7 = r4.description_     // Catch:{ IOException -> 0x085b }
            X.2zN r4 = new X.2zN     // Catch:{ IOException -> 0x085b }
            r15 = r13
            r12 = r4
            r14 = r13
            r16 = r7
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x085b }
            r5.A0O(r4)     // Catch:{ IOException -> 0x085b }
            goto L_0x0495
        L_0x04cc:
            int r0 = r7.size()     // Catch:{ IOException -> 0x085b }
            if (r0 <= 0) goto L_0x04f7
            int r0 = r7.size()     // Catch:{ IOException -> 0x085b }
            r8 = 1
            int r0 = r0 - r8
            X.34x r0 = X.C18320x8.A0R(r7, r0)     // Catch:{ IOException -> 0x085b }
            long r0 = r0.A0K     // Catch:{ IOException -> 0x085b }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x085b }
            r9 = 0
            X.34x r10 = X.C18320x8.A0R(r7, r10)     // Catch:{ IOException -> 0x085b }
            monitor-enter(r5)     // Catch:{ IOException -> 0x085b }
            r5.A0c = r10     // Catch:{ all -> 0x0852 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x085b }
            long r0 = r10.A1M     // Catch:{ IOException -> 0x085b }
            monitor-enter(r5)     // Catch:{ IOException -> 0x085b }
            r5.A0O = r0     // Catch:{ all -> 0x0852 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x085b }
            long r0 = r10.A1L     // Catch:{ IOException -> 0x085b }
            monitor-enter(r5)     // Catch:{ IOException -> 0x085b }
            r5.A0N = r0     // Catch:{ all -> 0x0852 }
            goto L_0x04f9
        L_0x04f7:
            r6 = 0
            goto L_0x051c
        L_0x04f9:
            monitor-exit(r5)     // Catch:{ IOException -> 0x085b }
            X.21b r1 = r10.A0N     // Catch:{ IOException -> 0x085b }
            X.21b r0 = r5.A0Z     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0502
            r5.A0Z = r1     // Catch:{ IOException -> 0x085b }
        L_0x0502:
            int r0 = r7.size()     // Catch:{ IOException -> 0x085b }
            if (r9 >= r0) goto L_0x051c
            X.34x r10 = X.C18320x8.A0R(r7, r9)     // Catch:{ IOException -> 0x085b }
            boolean r0 = X.C627636p.A0w(r10, r8)     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x0527
            long r0 = r10.A1M     // Catch:{ IOException -> 0x085b }
            r5.A0D(r0)     // Catch:{ IOException -> 0x085b }
            long r0 = r10.A1L     // Catch:{ IOException -> 0x085b }
            r5.A0C(r0)     // Catch:{ IOException -> 0x085b }
        L_0x051c:
            X.2sm r1 = r2.A0C     // Catch:{ IOException -> 0x085b }
            android.content.ContentValues r0 = r5.A04(r6)     // Catch:{ IOException -> 0x085b }
            r1.A0N(r0, r5)     // Catch:{ IOException -> 0x085b }
            goto L_0x0446
        L_0x0527:
            int r0 = X.AnonymousClass002.A04(r7, r8)     // Catch:{ IOException -> 0x085b }
            if (r9 != r0) goto L_0x0532
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoWithAddedMessages no display message in initial history sync"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x085b }
        L_0x0532:
            int r9 = r9 + 1
            goto L_0x0502
        L_0x0535:
            boolean r0 = r4.notSpam_     // Catch:{ IOException -> 0x085b }
            r7 = 1
            if (r0 == 0) goto L_0x053d
            r6.A0A(r7)     // Catch:{ IOException -> 0x085b }
        L_0x053d:
            int r1 = r4.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x054a
            boolean r0 = r4.markedAsUnread_     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x054a
            r0 = -1
            goto L_0x054c
        L_0x054a:
            int r0 = r4.unreadCount_     // Catch:{ IOException -> 0x085b }
        L_0x054c:
            monitor-enter(r6)     // Catch:{ IOException -> 0x085b }
            r6.A08 = r0     // Catch:{ all -> 0x0855 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x085b }
            long r0 = r4.ephemeralSettingTimestamp_     // Catch:{ IOException -> 0x085b }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0577
            int r10 = r4.ephemeralExpiration_     // Catch:{ IOException -> 0x085b }
            boolean r8 = r14 instanceof com.whatsapp.jid.UserJid     // Catch:{ IOException -> 0x085b }
            if (r8 == 0) goto L_0x0595
            X.1EP r8 = r4.disappearingMode_     // Catch:{ IOException -> 0x085b }
            if (r8 != 0) goto L_0x0564
            X.1EP r8 = X.AnonymousClass1EP.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x085b }
        L_0x0564:
            X.22v r8 = r8.A0M()     // Catch:{ IOException -> 0x085b }
            int r9 = r8.value     // Catch:{ IOException -> 0x085b }
            r8 = 0
            int r9 = java.lang.Math.max(r8, r9)     // Catch:{ IOException -> 0x085b }
            r8 = 3
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ IOException -> 0x085b }
        L_0x0574:
            r6.A0B(r10, r0, r8)     // Catch:{ IOException -> 0x085b }
        L_0x0577:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoFromConversation setArchive - "
            r1.append(r0)     // Catch:{ IOException -> 0x085b }
            boolean r0 = r4.archived_     // Catch:{ IOException -> 0x085b }
            X.C18260x0.A1V(r1, r0)     // Catch:{ IOException -> 0x085b }
            boolean r0 = r4.archived_     // Catch:{ IOException -> 0x085b }
            r6.A0i = r0     // Catch:{ IOException -> 0x085b }
            long r0 = r4.conversationTimestamp_     // Catch:{ IOException -> 0x085b }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            r6.A0E(r0)     // Catch:{ IOException -> 0x085b }
            int r0 = r4.unreadMentionCount_     // Catch:{ IOException -> 0x085b }
            monitor-enter(r6)     // Catch:{ IOException -> 0x085b }
            goto L_0x059b
        L_0x0595:
            boolean r8 = r14 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x085b }
            if (r8 == 0) goto L_0x0577
            r8 = 0
            goto L_0x0574
        L_0x059b:
            r6.A06 = r0     // Catch:{ all -> 0x0855 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x085b }
            int r0 = r4.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x05c1
            int r1 = r4.endOfHistoryTransferType_     // Catch:{ IOException -> 0x085b }
            if (r1 == 0) goto L_0x05b0
            if (r1 == r7) goto L_0x05b3
            r0 = 2
            if (r1 != r0) goto L_0x05b0
            X.22o r0 = X.C374222o.COMPLETE_ON_DEMAND_SYNC_BUT_MORE_MSG_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x085b }
            goto L_0x05b5
        L_0x05b0:
            X.22o r0 = X.C374222o.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x085b }
            goto L_0x05b5
        L_0x05b3:
            X.22o r0 = X.C374222o.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x085b }
        L_0x05b5:
            int r8 = r0.ordinal()     // Catch:{ IOException -> 0x085b }
            r1 = 2
            r0 = 0
            if (r8 == r0) goto L_0x05bf
            if (r8 != r1) goto L_0x05c4
        L_0x05bf:
            r0 = 2
            goto L_0x05c4
        L_0x05c1:
            r6.A03 = r7     // Catch:{ IOException -> 0x085b }
            goto L_0x05c6
        L_0x05c4:
            r6.A03 = r0     // Catch:{ IOException -> 0x085b }
        L_0x05c6:
            int r1 = r4.bitField1_     // Catch:{ IOException -> 0x085b }
            r0 = r1 & 1
            if (r0 == 0) goto L_0x05d2
            boolean r0 = r4.isParentGroup_     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x05d2
            r6.A02 = r7     // Catch:{ IOException -> 0x085b }
        L_0x05d2:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x05dd
            boolean r0 = r4.isDefaultSubgroup_     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x05dd
            r0 = 3
            r6.A02 = r0     // Catch:{ IOException -> 0x085b }
        L_0x05dd:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x05e4
            r0 = 2
            r6.A02 = r0     // Catch:{ IOException -> 0x085b }
        L_0x05e4:
            X.2sm r0 = r2.A0C     // Catch:{ IOException -> 0x085b }
            r0.A05(r6)     // Catch:{ IOException -> 0x085b }
            goto L_0x042f
        L_0x05eb:
            boolean r0 = r14 instanceof com.whatsapp.jid.UserJid     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x03d9
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ IOException -> 0x085b }
            r0 = 2
            byte[][] r7 = new byte[r0][]     // Catch:{ 23X -> 0x062d }
            r6 = 1
            byte[] r5 = new byte[r6]     // Catch:{ 23X -> 0x062d }
            r1 = 5
            r0 = 0
            r5[r0] = r1     // Catch:{ 23X -> 0x062d }
            r7[r0] = r5     // Catch:{ 23X -> 0x062d }
            X.8Lq r0 = r4.contactPrimaryIdentityKey_     // Catch:{ 23X -> 0x062d }
            byte[] r0 = r0.A07()     // Catch:{ 23X -> 0x062d }
            byte[] r0 = X.AnonymousClass36A.A04(r0, r7, r6)     // Catch:{ 23X -> 0x062d }
            X.2jv r6 = X.AnonymousClass36G.A01(r0)     // Catch:{ 23X -> 0x062d }
            X.33n r5 = r2.A08     // Catch:{ 23X -> 0x062d }
            boolean r0 = r5.A0X()     // Catch:{ 23X -> 0x062d }
            if (r0 == 0) goto L_0x0620
            X.2ov r1 = X.AnonymousClass36G.A03(r14)     // Catch:{ 23X -> 0x062d }
            X.2e4 r0 = new X.2e4     // Catch:{ 23X -> 0x062d }
            r0.<init>(r6)     // Catch:{ 23X -> 0x062d }
            r5.A0M(r0, r1)     // Catch:{ 23X -> 0x062d }
            goto L_0x0636
        L_0x0620:
            X.2fm r5 = r2.A09     // Catch:{ 23X -> 0x062d }
            r1 = 38
            X.3aJ r0 = new X.3aJ     // Catch:{ 23X -> 0x062d }
            r0.<init>(r2, r14, r6, r1)     // Catch:{ 23X -> 0x062d }
            X.C48972fm.A02(r5, r0)     // Catch:{ 23X -> 0x062d }
            goto L_0x0636
        L_0x062d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = "HistorySyncChunkProcessor/ invalid public key jid="
            X.C18260x0.A1Q(r1, r0, r14)     // Catch:{ IOException -> 0x085b }
        L_0x0636:
            int r1 = r4.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x064f
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x064f
            X.2sK r6 = r2.A06     // Catch:{ IOException -> 0x085b }
            X.8Lq r0 = r4.tcToken_     // Catch:{ IOException -> 0x085b }
            byte[] r5 = r0.A07()     // Catch:{ IOException -> 0x085b }
            long r0 = r4.tcTokenTimestamp_     // Catch:{ IOException -> 0x085b }
            r6.A01(r14, r5, r0)     // Catch:{ IOException -> 0x085b }
        L_0x064f:
            int r1 = r4.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x065d
            X.2sK r5 = r2.A06     // Catch:{ IOException -> 0x085b }
            long r0 = r4.tcTokenSenderTimestamp_     // Catch:{ IOException -> 0x085b }
            r5.A0A(r14, r0)     // Catch:{ IOException -> 0x085b }
        L_0x065d:
            boolean r0 = r14 instanceof X.C27981fH     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x0671
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03d9
            java.lang.String r0 = r4.lidJid_     // Catch:{ IOException -> 0x085b }
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass32Y.A08(r0)     // Catch:{ IOException -> 0x085b }
            boolean r0 = r14 instanceof X.C27981fH     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x03d9
        L_0x0671:
            X.1fH r14 = (X.C27981fH) r14     // Catch:{ IOException -> 0x085b }
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0680
            X.2q8 r1 = r2.A0J     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = r4.displayName_     // Catch:{ IOException -> 0x085b }
            r1.A03(r14, r0)     // Catch:{ IOException -> 0x085b }
        L_0x0680:
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0697
            java.lang.String r0 = r4.pnJid_     // Catch:{ IOException -> 0x085b }
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r0)     // Catch:{ IOException -> 0x085b }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x0697
            X.2sM r0 = r2.A0K     // Catch:{ IOException -> 0x085b }
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ IOException -> 0x085b }
            r0.A09(r14, r1)     // Catch:{ IOException -> 0x085b }
        L_0x0697:
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x06a6
            boolean r0 = r4.shareOwnPn_     // Catch:{ IOException -> 0x085b }
            if (r0 == 0) goto L_0x06a6
            X.311 r0 = r2.A0L     // Catch:{ IOException -> 0x085b }
            r0.A05(r14)     // Catch:{ IOException -> 0x085b }
        L_0x06a6:
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x03d9
            X.311 r1 = r2.A0L     // Catch:{ IOException -> 0x085b }
            boolean r0 = r4.pnhDuplicateLidThread_     // Catch:{ IOException -> 0x085b }
            r1.A08(r14, r0)     // Catch:{ IOException -> 0x085b }
            goto L_0x03d9
        L_0x06b5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = "HistorySyncChunkProcessor/ skip importing of chatJid="
            X.C18260x0.A1S(r1, r0, r14)     // Catch:{ IOException -> 0x085b }
            goto L_0x03d9
        L_0x06c0:
            int r0 = r3.bitField0_     // Catch:{ IOException -> 0x085b }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x06ff
            int r1 = r3.aiWaitListState_     // Catch:{ IOException -> 0x085b }
            if (r1 == 0) goto L_0x06d1
            r0 = 1
            if (r1 == r0) goto L_0x06ce
            goto L_0x06d4
        L_0x06ce:
            X.22Z r4 = X.AnonymousClass22Z.AI_AVAILABLE     // Catch:{ IOException -> 0x085b }
            goto L_0x06d6
        L_0x06d1:
            X.22Z r4 = X.AnonymousClass22Z.IN_WAITLIST     // Catch:{ IOException -> 0x085b }
            goto L_0x06d6
        L_0x06d4:
            X.22Z r4 = X.AnonymousClass22Z.IN_WAITLIST     // Catch:{ IOException -> 0x085b }
        L_0x06d6:
            X.5rC r0 = r2.A00     // Catch:{ IOException -> 0x085b }
            java.lang.Object r2 = r0.A05()     // Catch:{ IOException -> 0x085b }
            X.2sS r2 = (X.C56722sS) r2     // Catch:{ IOException -> 0x085b }
            if (r2 == 0) goto L_0x06ff
            r1 = 0
            int r0 = X.C18320x8.A02(r4, r1)     // Catch:{ IOException -> 0x085b }
            if (r0 == r1) goto L_0x070a
            X.21j r1 = X.C372121j.AI_AVAILABLE     // Catch:{ IOException -> 0x085b }
        L_0x06e9:
            r0 = 0
            X.C162457s7.A0J(r1, r0)     // Catch:{ IOException -> 0x085b }
            X.2qG r2 = r2.A04     // Catch:{ IOException -> 0x085b }
            X.21j r0 = r2.A00()     // Catch:{ IOException -> 0x085b }
            if (r1 == r0) goto L_0x06ff
            int r1 = r1.ordinal()     // Catch:{ IOException -> 0x085b }
            r0 = 1
            if (r1 == r0) goto L_0x0706
            r2.A02()     // Catch:{ IOException -> 0x085b }
        L_0x06ff:
            X.8ya r0 = r3.conversations_     // Catch:{ IOException -> 0x085b }
            r0.size()     // Catch:{ IOException -> 0x085b }
            goto L_0x008e
        L_0x0706:
            r2.A03()     // Catch:{ IOException -> 0x085b }
            goto L_0x06ff
        L_0x070a:
            X.21j r1 = X.C372121j.IN_WAITLIST     // Catch:{ IOException -> 0x085b }
            goto L_0x06e9
        L_0x070d:
            r10 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0715
            r4.A1O = r2     // Catch:{ IOException -> 0x085b }
        L_0x0715:
            r0 = r40
            int r5 = r0.A00     // Catch:{ IOException -> 0x085b }
            r4.A01 = r5     // Catch:{ IOException -> 0x085b }
            int r10 = r9.A01     // Catch:{ IOException -> 0x085b }
            int r11 = r9.A00     // Catch:{ IOException -> 0x085b }
            r3 = 2
            r2 = 1
            if (r10 == 0) goto L_0x0757
            r1 = 100
            r0 = 3
            if (r10 == r3) goto L_0x0749
            if (r10 != r0) goto L_0x0777
            if (r5 != r1) goto L_0x0750
            X.2oU r0 = r7.A07     // Catch:{ IOException -> 0x085b }
            java.io.File r1 = X.C54292oU.A03(r0)     // Catch:{ IOException -> 0x085b }
            X.4It r0 = new X.4It     // Catch:{ IOException -> 0x085b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x085b }
            java.io.File[] r3 = r1.listFiles(r0)     // Catch:{ IOException -> 0x085b }
            if (r3 == 0) goto L_0x0777
            int r2 = r3.length     // Catch:{ IOException -> 0x085b }
            r1 = 0
        L_0x073f:
            if (r1 >= r2) goto L_0x0777
            r0 = r3[r1]     // Catch:{ IOException -> 0x085b }
            r0.delete()     // Catch:{ IOException -> 0x085b }
            int r1 = r1 + 1
            goto L_0x073f
        L_0x0749:
            if (r5 != r1) goto L_0x0750
            org.json.JSONObject r3 = X.C60322yM.A00(r0, r2)     // Catch:{ IOException -> 0x085b }
            goto L_0x076a
        L_0x0750:
            int r0 = r11 + 1
            org.json.JSONObject r3 = X.C60322yM.A00(r10, r0)     // Catch:{ IOException -> 0x085b }
            goto L_0x076a
        L_0x0757:
            org.json.JSONObject r3 = X.C60322yM.A00(r3, r2)     // Catch:{ IOException -> 0x085b }
            X.2FR r2 = r7.A03     // Catch:{ IOException -> 0x085b }
            monitor-enter(r2)     // Catch:{ IOException -> 0x085b }
            X.2K3 r0 = r2.A00     // Catch:{ all -> 0x0858 }
            if (r0 == 0) goto L_0x0769
            X.3XA r1 = r0.A00     // Catch:{ all -> 0x0858 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0858 }
            r1.A05(r0)     // Catch:{ all -> 0x0858 }
        L_0x0769:
            monitor-exit(r2)     // Catch:{ IOException -> 0x085b }
        L_0x076a:
            if (r3 == 0) goto L_0x0777
            X.2q4 r0 = r7.A05     // Catch:{ IOException -> 0x085b }
            android.content.SharedPreferences$Editor r1 = X.C55262q4.A00(r0)     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = "history_sync_companion_state"
            X.C18270x1.A0e(r1, r3, r0)     // Catch:{ IOException -> 0x085b }
        L_0x0777:
            boolean r15 = X.AnonymousClass000.A1W(r44)
            X.33Y r0 = r7.A0A     // Catch:{ IOException -> 0x085b }
            r0.A04(r4)     // Catch:{ IOException -> 0x085b }
            X.2ha r12 = r7.A02     // Catch:{ IOException -> 0x085b }
            r0 = r40
            int r0 = r0.A00     // Catch:{ IOException -> 0x085b }
            long r4 = (long) r0     // Catch:{ IOException -> 0x085b }
            r0 = r40
            long r2 = r0.A01     // Catch:{ IOException -> 0x085b }
            X.1av r13 = new X.1av     // Catch:{ IOException -> 0x085b }
            r13.<init>()     // Catch:{ IOException -> 0x085b }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ IOException -> 0x085b }
            r13.A05 = r0     // Catch:{ IOException -> 0x085b }
            java.lang.Integer r0 = X.C64663Ek.A01(r10)     // Catch:{ IOException -> 0x085b }
            r13.A03 = r0     // Catch:{ IOException -> 0x085b }
            java.lang.Integer r0 = X.C64663Ek.A00(r10)     // Catch:{ IOException -> 0x085b }
            r13.A04 = r0     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = r12.A00()     // Catch:{ IOException -> 0x085b }
            r13.A0A = r0     // Catch:{ IOException -> 0x085b }
            X.2sH r0 = r12.A03     // Catch:{ IOException -> 0x085b }
            long r0 = r0.A0H()     // Catch:{ IOException -> 0x085b }
            java.lang.Long r14 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x085b }
            r13.A09 = r14     // Catch:{ IOException -> 0x085b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x085b }
            r13.A07 = r4     // Catch:{ IOException -> 0x085b }
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)     // Catch:{ IOException -> 0x085b }
            r13.A08 = r0     // Catch:{ IOException -> 0x085b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)     // Catch:{ IOException -> 0x085b }
            r13.A00 = r0     // Catch:{ IOException -> 0x085b }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r11)     // Catch:{ IOException -> 0x085b }
            r13.A06 = r0     // Catch:{ IOException -> 0x085b }
            X.4FV r0 = r12.A06     // Catch:{ IOException -> 0x085b }
            r0.BhD(r13)     // Catch:{ IOException -> 0x085b }
            java.lang.String r3 = r9.A04     // Catch:{ IOException -> 0x085b }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x07eb
            java.lang.String r2 = r9.A06     // Catch:{ IOException -> 0x085b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x07eb
            X.2gy r1 = r7.A01     // Catch:{ IOException -> 0x085b }
            com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r0 = new com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob     // Catch:{ IOException -> 0x085b }
            r0.<init>(r6, r3, r2)     // Catch:{ IOException -> 0x085b }
            r1.A02(r0)     // Catch:{ IOException -> 0x085b }
        L_0x07eb:
            X.2xv r0 = r7.A09     // Catch:{ IOException -> 0x085b }
            r0.A02(r6)     // Catch:{ IOException -> 0x085b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = "ReceiveHistorySyncManager/ processed syncType="
            r1.append(r0)     // Catch:{ IOException -> 0x085b }
            r1.append(r10)     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = " chunkOrder="
            r1.append(r0)     // Catch:{ IOException -> 0x085b }
            r1.append(r11)     // Catch:{ IOException -> 0x085b }
            java.lang.String r0 = " progress="
            r1.append(r0)     // Catch:{ IOException -> 0x085b }
            r0 = r40
            int r0 = r0.A00     // Catch:{ IOException -> 0x085b }
            X.C18260x0.A1G(r1, r0)     // Catch:{ IOException -> 0x085b }
            if (r44 == 0) goto L_0x081d
            boolean r0 = r44.delete()     // Catch:{ IOException -> 0x085b }
            if (r0 != 0) goto L_0x081d
            java.lang.String r0 = "ReceiveHistorySyncManager/ failed to delete local chunk file."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x085b }
        L_0x081d:
            r0 = 2
            if (r10 == r0) goto L_0x0823
            r0 = 3
            if (r10 != r0) goto L_0x082f
        L_0x0823:
            X.4FS r2 = r7.A0B     // Catch:{ IOException -> 0x085b }
            X.3Gp r1 = r7.A04     // Catch:{ IOException -> 0x085b }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IOException -> 0x085b }
            r0 = 16
            X.C69963Zi.A01(r2, r1, r0)     // Catch:{ IOException -> 0x085b }
        L_0x082f:
            r8.A0B()     // Catch:{ IOException -> 0x085b }
            return
        L_0x0833:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0838 }
            goto L_0x083c
        L_0x0838:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x083d }
        L_0x083c:
            throw r1     // Catch:{ all -> 0x083d }
        L_0x083d:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0842 }
            goto L_0x0846
        L_0x0842:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x085b }
        L_0x0846:
            throw r1     // Catch:{ IOException -> 0x085b }
        L_0x0847:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException -> 0x085b }
            goto L_0x085a
        L_0x084c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x085b }
            goto L_0x085a
        L_0x084f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x084f }
            goto L_0x085a
        L_0x0852:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x085b }
            goto L_0x085a
        L_0x0855:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x085b }
            goto L_0x085a
        L_0x0858:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x085b }
        L_0x085a:
            throw r0     // Catch:{ IOException -> 0x085b }
        L_0x085b:
            java.lang.String r0 = "HistorySyncChunkProcessor/ unable to parse history sync protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass301.A01(X.2NP, X.2Pn, java.io.File, byte[], int, int):void");
    }
}
