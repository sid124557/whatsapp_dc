package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.30D  reason: invalid class name */
public class AnonymousClass30D {
    public final C55682qk A00;
    public final C56972sr A01;
    public final AnonymousClass5Z4 A02;
    public final AnonymousClass5PA A03;
    public final C56612sH A04;
    public final AnonymousClass33p A05;
    public final C61072zf A06;
    public final C623334p A07;
    public final AnonymousClass2W1 A08;
    public final C72303dV A09;
    public final C59412ws A0A;
    public final C48602fA A0B;
    public final AnonymousClass1VX A0C;
    public final AnonymousClass4FV A0D;
    public final AtomicBoolean A0E = C18280x3.A0l();

    public static void A00(AnonymousClass5PA r2, AnonymousClass30D r3, C25951bL r4) {
        r2.A00(5, false);
        boolean booleanValue = r4.A00.booleanValue();
        AnonymousClass4FV r0 = r3.A0D;
        if (booleanValue) {
            r0.BhD(r4);
        } else {
            r0.BhB(r4);
        }
    }

    public final C42362Nu A03(C44342Vr r18, List list) {
        List list2;
        boolean z;
        int i;
        StringBuilder A0o;
        String str;
        C42362Nu r4 = new C42362Nu();
        ArrayList A0s = AnonymousClass001.A0s();
        HashSet A0K = AnonymousClass002.A0K();
        do {
            list2 = list;
            Iterator it = list2.iterator();
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass31D r8 = (AnonymousClass31D) it.next();
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("DatabaseMigrationManager/handleMigrationPhase; name=");
                String str2 = r8.A0C;
                A0o2.append(str2);
                C18260x0.A1L(A0o2, "; start processing.");
                C44342Vr r1 = r18;
                if (!r1.A00()) {
                    C18260x0.A1L(AnonymousClass000.A0m("DatabaseMigrationManager/handleMigrationPhase; name=", str2), "; conditions check requires to stop migration process.");
                    break;
                }
                C18260x0.A0s("DatabaseMigrationManager/processMigrations/", str2, AnonymousClass001.A0o());
                char c = 2;
                char c2 = 3;
                if (r8.A09() == 3 || r8.A0N() || r8.A0O()) {
                    if (r8.A0P()) {
                        C18260x0.A1L(AnonymousClass000.A0m("DatabaseMigrationManager/processMigrations; name=", str2), "; stale and needs rollback, skipping.");
                        i = 10;
                    } else if (r8.A0M()) {
                        C18260x0.A1L(AnonymousClass000.A0m("DatabaseMigrationManager/processMigrations; name=", str2), "; already migrated, skipping.");
                        A05(r8, 4);
                    } else if (r8.A0Q() && !r8.A0N() && !r8.A0O()) {
                        C18260x0.A1L(AnonymousClass000.A0m("DatabaseMigrationManager/processMigrations; name=", str2), "; migration exceeds retry count; mark it as stuck and skip.");
                        i = 8;
                    } else if (!r8.A0K()) {
                        C18260x0.A1L(AnonymousClass000.A0m("DatabaseMigrationManager/processMigrations; name=", str2), "; not enough storage to migrate, skipping.");
                        A05(r8, 2);
                    } else {
                        r8.A0L();
                        c = 1;
                        if (!r8.A0S()) {
                            C18260x0.A1M(AnonymousClass000.A0m("DatabaseMigrationManager/processMigrations; name=", str2), "; pre requisites check failed, not ready.");
                            i = 5;
                        } else if (!r8.A0R()) {
                            Iterator it2 = r8.A0H().iterator();
                            while (it2.hasNext()) {
                                String A0m = AnonymousClass001.A0m(it2);
                                AnonymousClass31D A022 = this.A0B.A02(A0m);
                                if (A022 == null) {
                                    A0o = AnonymousClass000.A0m("DatabaseMigrationManager/processMigrations; name=", str2);
                                    A0o.append(";  has a dependency '");
                                    A0o.append(A0m);
                                    str = "' - not found, skipping.";
                                } else if (!A022.A0M()) {
                                    A0o = AnonymousClass001.A0o();
                                    C18260x0.A0p("DatabaseMigrationManager/processMigrations; name=", str2, "; has a dependency '", A0m, A0o);
                                    str = "' - not migrated, not ready.";
                                } else if (A022.A0P()) {
                                    A0o = AnonymousClass001.A0o();
                                    C18260x0.A0p("DatabaseMigrationManager/processMigrations; name=", str2, "; has a dependency '", A0m, A0o);
                                    str = "' - stale, not ready.";
                                }
                                C18260x0.A1M(A0o, str);
                            }
                            i = 7;
                        } else {
                            if (!r8.A0T(r1)) {
                                c2 = 4;
                            }
                            c = c2;
                        }
                    }
                    A05(r8, i);
                } else {
                    C18260x0.A1L(AnonymousClass000.A0m("DatabaseMigrationManager/processMigrations; name=", str2), "; migration is disabled, skipping.");
                    A05(r8, 3);
                }
                if (c == 2) {
                    A0s.add(r8);
                    r4.A01++;
                } else if (c == 3) {
                    A0s.add(r8);
                    r4.A02++;
                    z = true;
                } else if (c == 4) {
                    A0s.add(r8);
                    r4.A00++;
                    C18260x0.A0t("DatabaseMigrationManager/handleMigrationPhase/migration failed; migration.name=", str2, AnonymousClass001.A0o());
                    if (r8.A0Q()) {
                        A0K.add(str2);
                    }
                }
            }
            list2.removeAll(A0s);
            A0s.clear();
        } while (z);
        if (this.A0C.A0Y(C58422vE.A02, 2632)) {
            Iterator it3 = A0K.iterator();
            while (it3.hasNext()) {
                this.A00.A0A(AnonymousClass000.A0V("db-migration-stuck/", AnonymousClass001.A0m(it3), AnonymousClass001.A0o()), false, (String) null);
            }
        }
        r4.A01 += (long) list2.size();
        return r4;
    }

    public void A04(int i) {
        Log.i("DatabaseMigrationManager/processAllConsistencyChecks");
        A06(new C44342Vr(new C84414Cg[0]), this.A0B.A01().keySet(), 8, i);
    }

    public void A05(AnonymousClass31D r7, int i) {
        C72303dV r0 = this.A09;
        r0.A05();
        C25591al r2 = new C25591al();
        long length = (long) ((double) r0.A05.length());
        List list = this.A0A.A00;
        r2.A01 = C18330xA.A07(C59412ws.A00(list, length));
        r2.A00 = C18330xA.A07(C59412ws.A00(list, length));
        r2.A09 = r7.A0C;
        r2.A02 = C18330xA.A07(C59412ws.A00(list, (long) ((double) this.A06.A03())));
        Long A0T = AnonymousClass0x2.A0T();
        r2.A05 = A0T;
        r2.A07 = A0T;
        r2.A08 = A0T;
        r2.A06 = Long.valueOf(r7.A0B());
        r2.A04 = AnonymousClass001.A0f();
        r2.A03 = Integer.valueOf(i);
        this.A0D.BhD(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035d, code lost:
        if (r14 == 0) goto L_0x035f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d0 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e9 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }, LOOP:3: B:102:0x01e3->B:104:0x01e9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0211 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02bf A[Catch:{ Exception -> 0x0470, all -> 0x0488 }, LOOP:7: B:127:0x02b9->B:129:0x02bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02cd A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02f9 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0304 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0309 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0312 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0317 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0320 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03c7 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x043c A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x01a6 A[EDGE_INSN: B:223:0x01a6->B:91:0x01a6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0 A[Catch:{ all -> 0x00e7, all -> 0x00ee, all -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018d A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b8 A[Catch:{ Exception -> 0x0470, all -> 0x0488 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C44342Vr r33, java.util.Set r34, int r35, int r36) {
        /*
            r32 = this;
            r13 = r34
            boolean r0 = r13.isEmpty()
            r12 = 1
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations/no migrations requested, skipping."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r12
        L_0x000f:
            r4 = r32
            java.util.concurrent.atomic.AtomicBoolean r10 = r4.A0E
            boolean r0 = r10.getAndSet(r12)
            r3 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations/migrations already in progress"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        L_0x0020:
            X.1bL r2 = new X.1bL
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r36)
            r2.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A00 = r0
            r15 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r2.A05 = r0
            X.2ws r7 = r4.A0A
            X.2zf r0 = r4.A06
            long r0 = r0.A03()
            double r5 = (double) r0
            long r0 = (long) r5
            java.util.List r11 = r7.A00
            long r0 = X.C59412ws.A00(r11, r0)
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r2.A03 = r0
            X.2W1 r0 = r4.A08
            r31 = r0
            java.lang.Long r0 = r31.A00()
            if (r0 == 0) goto L_0x0082
            long r0 = r0.longValue()
            long r5 = X.C59412ws.A00(r11, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            if (r0 == 0) goto L_0x0082
            java.lang.Double r0 = X.C18330xA.A07(r5)
        L_0x0069:
            r2.A02 = r0
            int r0 = r13.size()
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r2.A06 = r0
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations"
            X.33M r23 = X.AnonymousClass33M.A01(r0)
            X.5PA r9 = r4.A03
            r0 = 5
            r9.A00(r0, r12)
            goto L_0x0084
        L_0x0082:
            r0 = 0
            goto L_0x0069
        L_0x0084:
            X.34p r8 = r4.A07     // Catch:{ Exception -> 0x0470 }
            X.33M r17 = X.AnonymousClass33M.A02(r3)     // Catch:{ Exception -> 0x0470 }
            r6 = 0
            X.3dV r0 = r8.A01     // Catch:{ SQLiteBlobTooBigException -> 0x00fd }
            X.4GK r14 = r0.get()     // Catch:{ SQLiteBlobTooBigException -> 0x00fd }
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00f3 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = "SELECT _id, user, server, agent, device, type, raw_string FROM jid"
            java.lang.String r0 = "GET_ALL_JID_SQL"
            android.database.Cursor r7 = r5.A0E(r1, r0, r6)     // Catch:{ all -> 0x00f3 }
            int r6 = X.AnonymousClass0x7.A02(r7)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "user"
            int r25 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "server"
            int r26 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "agent"
            int r27 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "device"
            int r28 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "type"
            int r29 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "raw_string"
            int r30 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e7 }
        L_0x00ca:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00e0
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x00e7 }
            r24 = r7
            com.whatsapp.jid.Jid r5 = X.C623334p.A01(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x00e7 }
            if (r5 == 0) goto L_0x00ca
            r8.A0F(r5, r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ca
        L_0x00e0:
            r7.close()     // Catch:{ all -> 0x00f3 }
            r14.close()     // Catch:{ SQLiteBlobTooBigException -> 0x00fd }
            goto L_0x015e
        L_0x00e7:
            r1 = move-exception
            if (r7 == 0) goto L_0x00f2
            r7.close()     // Catch:{ all -> 0x00ee }
            goto L_0x00f2
        L_0x00ee:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f3 }
        L_0x00f2:
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x00f8 }
            goto L_0x00fc
        L_0x00f8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00fd }
        L_0x00fc:
            throw r1     // Catch:{ SQLiteBlobTooBigException -> 0x00fd }
        L_0x00fd:
            r6 = -1
            X.3dV r0 = r8.A01     // Catch:{ Exception -> 0x013e }
            X.4GK r7 = r0.get()     // Catch:{ Exception -> 0x013e }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0134 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0134 }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM jid"
            java.lang.String r0 = "GET_ALL_ROW_COUNT_SQL"
            android.database.Cursor r5 = X.C56862sg.A01(r5, r1, r0)     // Catch:{ all -> 0x0134 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0128 }
            int r6 = r5.getInt(r0)     // Catch:{ all -> 0x0128 }
        L_0x0121:
            r5.close()     // Catch:{ all -> 0x0134 }
            r7.close()     // Catch:{ Exception -> 0x013e }
            goto L_0x0144
        L_0x0128:
            r1 = move-exception
            if (r5 == 0) goto L_0x0133
            r5.close()     // Catch:{ all -> 0x012f }
            goto L_0x0133
        L_0x012f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0134 }
        L_0x0133:
            throw r1     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0139 }
            goto L_0x013d
        L_0x0139:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x013e }
        L_0x013d:
            throw r1     // Catch:{ Exception -> 0x013e }
        L_0x013e:
            r1 = move-exception
            java.lang.String r0 = "JidStore/populateJidRowIdCache/failed to get count"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x0470 }
        L_0x0144:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "JidStore/populateJidRowIdCache(); failing to load the window for "
            X.C18260x0.A0y(r0, r1, r6)     // Catch:{ Exception -> 0x0470 }
            X.2qk r5 = r8.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "failing to load the window for "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r6)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "JidStore/populateJidRowIdCache/blobTooBig"
            r5.A0A(r0, r3, r1)     // Catch:{ Exception -> 0x0470 }
        L_0x015e:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "JidStore/populateJidRowIdCache/cached populated; count= "
            r5.append(r0)     // Catch:{ Exception -> 0x0470 }
            java.util.Map r0 = r8.A04     // Catch:{ Exception -> 0x0470 }
            X.AnonymousClass0x7.A1H(r5, r0)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "; time="
            r5.append(r0)     // Catch:{ Exception -> 0x0470 }
            long r0 = r17.A07()     // Catch:{ Exception -> 0x0470 }
            X.C18260x0.A1H(r5, r0)     // Catch:{ Exception -> 0x0470 }
            X.2fA r0 = r4.A0B     // Catch:{ Exception -> 0x0470 }
            X.8OQ r5 = r0.A01()     // Catch:{ Exception -> 0x0470 }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0470 }
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ Exception -> 0x0470 }
            r6.<init>(r13)     // Catch:{ Exception -> 0x0470 }
        L_0x0187:
            java.lang.Object r7 = r6.poll()     // Catch:{ Exception -> 0x0470 }
            if (r7 == 0) goto L_0x01a6
            boolean r0 = r1.contains(r7)     // Catch:{ Exception -> 0x0470 }
            if (r0 != 0) goto L_0x0187
            r1.add(r7)     // Catch:{ Exception -> 0x0470 }
            java.lang.Object r0 = r5.get(r7)     // Catch:{ Exception -> 0x0470 }
            X.31D r0 = (X.AnonymousClass31D) r0     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x0187
            java.util.Set r0 = r0.A0H()     // Catch:{ Exception -> 0x0470 }
            r6.addAll(r0)     // Catch:{ Exception -> 0x0470 }
            goto L_0x0187
        L_0x01a6:
            java.util.HashSet r6 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x0470 }
            java.util.HashMap r8 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x0470 }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ Exception -> 0x0470 }
        L_0x01b2:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x0470 }
            java.lang.Object r0 = r5.get(r1)     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x01c6
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0470 }
            goto L_0x01b2
        L_0x01c6:
            r6.add(r1)     // Catch:{ Exception -> 0x0470 }
            goto L_0x01b2
        L_0x01ca:
            boolean r0 = r6.isEmpty()     // Catch:{ Exception -> 0x0470 }
            if (r0 != 0) goto L_0x01db
            X.2qk r5 = r4.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "db-missing-migration-name"
            r5.A0A(r0, r3, r1)     // Catch:{ Exception -> 0x0470 }
        L_0x01db:
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x0470 }
            java.util.Iterator r6 = X.AnonymousClass001.A0u(r8)     // Catch:{ Exception -> 0x0470 }
        L_0x01e3:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x01fa
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r6)     // Catch:{ Exception -> 0x0470 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ Exception -> 0x0470 }
            r0.getValue()     // Catch:{ Exception -> 0x0470 }
            r0 = 1
            X.AnonymousClass0x2.A1J(r5, r7, r0)     // Catch:{ Exception -> 0x0470 }
            goto L_0x01e3
        L_0x01fa:
            java.util.ArrayDeque r14 = new java.util.ArrayDeque     // Catch:{ Exception -> 0x0470 }
            r14.<init>()     // Catch:{ Exception -> 0x0470 }
            java.util.Set r0 = r7.keySet()     // Catch:{ Exception -> 0x0470 }
            java.util.HashSet r0 = X.AnonymousClass0x9.A15(r0)     // Catch:{ Exception -> 0x0470 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x0470 }
        L_0x020b:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x0294
            X.C18310x6.A1R(r14, r13)     // Catch:{ Exception -> 0x0470 }
        L_0x0214:
            boolean r0 = r14.isEmpty()     // Catch:{ Exception -> 0x0470 }
            if (r0 != 0) goto L_0x020b
            java.lang.Object r6 = r14.poll()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0470 }
            java.lang.Object r0 = r8.get(r6)     // Catch:{ Exception -> 0x0470 }
            X.31D r0 = (X.AnonymousClass31D) r0     // Catch:{ Exception -> 0x0470 }
            if (r0 != 0) goto L_0x024a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "DatabaseMigrationManager/sortedMigrations; can't get migration with name "
            r1.append(r0)     // Catch:{ Exception -> 0x0470 }
            r1.append(r6)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "from a map of migrations"
            X.C18260x0.A1K(r1, r0)     // Catch:{ Exception -> 0x0470 }
            X.2qk r5 = r4.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "DatabaseMigrationManager/sortedMigrations/missing dependent migration; name="
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r6, r1)     // Catch:{ Exception -> 0x0470 }
            r0 = 0
            r5.A0A(r1, r3, r0)     // Catch:{ Exception -> 0x0470 }
            goto L_0x0214
        L_0x024a:
            java.util.Set r0 = r0.A0H()     // Catch:{ Exception -> 0x0470 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x0470 }
            java.util.Iterator r22 = r0.iterator()     // Catch:{ Exception -> 0x0470 }
        L_0x0255:
            boolean r0 = r22.hasNext()     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x0214
            java.lang.Object r5 = r22.next()     // Catch:{ Exception -> 0x0470 }
            java.lang.Object r1 = r7.get(r5)     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0470 }
            r20 = 1
            if (r1 != 0) goto L_0x0270
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ Exception -> 0x0470 }
            r7.put(r5, r1)     // Catch:{ Exception -> 0x0470 }
        L_0x0270:
            java.lang.Object r0 = r7.get(r6)     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0470 }
            if (r0 != 0) goto L_0x027f
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ Exception -> 0x0470 }
            r7.put(r6, r0)     // Catch:{ Exception -> 0x0470 }
        L_0x027f:
            long r18 = r1.longValue()     // Catch:{ Exception -> 0x0470 }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0470 }
            int r17 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r17 > 0) goto L_0x0255
            long r0 = r0 + r20
            X.AnonymousClass0x2.A1J(r5, r7, r0)     // Catch:{ Exception -> 0x0470 }
            r14.add(r5)     // Catch:{ Exception -> 0x0470 }
            goto L_0x0255
        L_0x0294:
            java.util.Collection r0 = r8.values()     // Catch:{ Exception -> 0x0470 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)     // Catch:{ Exception -> 0x0470 }
            r5 = 6
            X.4IS r1 = new X.4IS     // Catch:{ Exception -> 0x0470 }
            r1.<init>((java.util.Map) r7, (int) r5)     // Catch:{ Exception -> 0x0470 }
            java.util.Collections.sort(r0, r1)     // Catch:{ Exception -> 0x0470 }
            java.util.ArrayList r7 = X.AnonymousClass002.A0J(r0)     // Catch:{ Exception -> 0x0470 }
            java.util.ArrayList r14 = X.AnonymousClass002.A0J(r0)     // Catch:{ Exception -> 0x0470 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0470 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0470 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ Exception -> 0x0470 }
        L_0x02b9:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x02c9
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x0470 }
            X.31D r0 = (X.AnonymousClass31D) r0     // Catch:{ Exception -> 0x0470 }
            r6.add(r0)     // Catch:{ Exception -> 0x0470 }
            goto L_0x02b9
        L_0x02c9:
            r0 = r35 & 1
            if (r0 == 0) goto L_0x02f9
            X.2Nu r8 = new X.2Nu     // Catch:{ Exception -> 0x0470 }
            r8.<init>()     // Catch:{ Exception -> 0x0470 }
            java.util.Iterator r13 = r7.iterator()     // Catch:{ Exception -> 0x0470 }
        L_0x02d6:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x02fe
            java.lang.Object r5 = r13.next()     // Catch:{ Exception -> 0x0470 }
            X.31D r5 = (X.AnonymousClass31D) r5     // Catch:{ Exception -> 0x0470 }
            boolean r0 = A01(r5)     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x02d6
            int r7 = r4.A02(r5, r8)     // Catch:{ Exception -> 0x0470 }
            r0 = 3
            if (r7 == r0) goto L_0x02d6
            X.2qk r7 = r4.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.String r5 = r5.A0C     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "db-rollback-not-completed"
            r7.A0A(r0, r3, r5)     // Catch:{ Exception -> 0x0470 }
            goto L_0x02d6
        L_0x02f9:
            X.2Nu r8 = new X.2Nu     // Catch:{ Exception -> 0x0470 }
            r8.<init>()     // Catch:{ Exception -> 0x0470 }
        L_0x02fe:
            r0 = r35 & 2
            r5 = r33
            if (r0 == 0) goto L_0x0309
            X.2Nu r6 = r4.A03(r5, r6)     // Catch:{ Exception -> 0x0470 }
            goto L_0x030e
        L_0x0309:
            X.2Nu r6 = new X.2Nu     // Catch:{ Exception -> 0x0470 }
            r6.<init>()     // Catch:{ Exception -> 0x0470 }
        L_0x030e:
            r0 = r35 & 4
            if (r0 == 0) goto L_0x0317
            X.2Nu r5 = r4.A03(r5, r1)     // Catch:{ Exception -> 0x0470 }
            goto L_0x031c
        L_0x0317:
            X.2Nu r5 = new X.2Nu     // Catch:{ Exception -> 0x0470 }
            r5.<init>()     // Catch:{ Exception -> 0x0470 }
        L_0x031c:
            r0 = r35 & 8
            if (r0 == 0) goto L_0x03c7
            java.lang.String r0 = "DatabaseMigrationManager/handleConsistencyPhase"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0470 }
            X.2Nu r7 = new X.2Nu     // Catch:{ Exception -> 0x0470 }
            r7.<init>()     // Catch:{ Exception -> 0x0470 }
            java.util.Iterator r20 = r14.iterator()     // Catch:{ Exception -> 0x0470 }
        L_0x032e:
            boolean r0 = r20.hasNext()     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x03cc
            java.lang.Object r13 = r20.next()     // Catch:{ Exception -> 0x0470 }
            X.31D r13 = (X.AnonymousClass31D) r13     // Catch:{ Exception -> 0x0470 }
            boolean r0 = r13 instanceof X.C23241Rv     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x032e
            r18 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x039f }
            java.lang.String r0 = "DatabaseMigration/checkConsistency; name="
            r1.append(r0)     // Catch:{ Exception -> 0x039f }
            java.lang.String r0 = r13.A0C     // Catch:{ Exception -> 0x039f }
            X.C18260x0.A1L(r1, r0)     // Catch:{ Exception -> 0x039f }
            X.3dV r0 = r13.A05     // Catch:{ Exception -> 0x039f }
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r0.A07     // Catch:{ Exception -> 0x039f }
            int r14 = r1.getWriteHoldCount()     // Catch:{ Exception -> 0x039f }
            if (r14 > 0) goto L_0x035f
            int r14 = r1.getReadHoldCount()     // Catch:{ Exception -> 0x039f }
            r1 = 0
            if (r14 != 0) goto L_0x0360
        L_0x035f:
            r1 = 1
        L_0x0360:
            X.C626936e.A0C(r1)     // Catch:{ Exception -> 0x039f }
            r0.A05()     // Catch:{ Exception -> 0x039f }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r14 = r0.A06     // Catch:{ Exception -> 0x039f }
            r14.lock()     // Catch:{ Exception -> 0x039f }
            X.4Fq r17 = r0.A04()     // Catch:{ all -> 0x039a }
            X.3Yo r0 = r17.Axl()     // Catch:{ all -> 0x0390 }
            r0.A00()     // Catch:{ all -> 0x0386 }
            r0.close()     // Catch:{ all -> 0x0390 }
            r17.close()     // Catch:{ all -> 0x039a }
            r14.unlock()     // Catch:{ Exception -> 0x039f }
            long r0 = r7.A02     // Catch:{ Exception -> 0x039f }
            long r0 = r0 + r18
            r7.A02 = r0     // Catch:{ Exception -> 0x039f }
            goto L_0x032e
        L_0x0386:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x038b }
            goto L_0x038f
        L_0x038b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0390 }
        L_0x038f:
            throw r1     // Catch:{ all -> 0x0390 }
        L_0x0390:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0395 }
            goto L_0x0399
        L_0x0395:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x039a }
        L_0x0399:
            throw r1     // Catch:{ all -> 0x039a }
        L_0x039a:
            r0 = move-exception
            r14.unlock()     // Catch:{ Exception -> 0x039f }
            throw r0     // Catch:{ Exception -> 0x039f }
        L_0x039f:
            r14 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "DatabaseMigrationManager/handleConsistencyPhase; checkConsistency failed for "
            r1.append(r0)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = r13.A0C     // Catch:{ Exception -> 0x0470 }
            X.C18260x0.A15(r0, r1, r14)     // Catch:{ Exception -> 0x0470 }
            X.2qk r13 = r4.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass000.A0P(r14, r0, r1)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "db-consistency-check-failure"
            r13.A0A(r0, r3, r1)     // Catch:{ Exception -> 0x0470 }
            long r0 = r7.A00     // Catch:{ Exception -> 0x0470 }
            long r0 = r0 + r18
            r7.A00 = r0     // Catch:{ Exception -> 0x0470 }
            goto L_0x032e
        L_0x03c7:
            X.2Nu r7 = new X.2Nu     // Catch:{ Exception -> 0x0470 }
            r7.<init>()     // Catch:{ Exception -> 0x0470 }
        L_0x03cc:
            long r0 = r8.A02     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0G = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r8.A01     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0F = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r8.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0E = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r6.A02     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0D = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r6.A01     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0C = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r6.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0B = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r5.A02     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0J = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r5.A01     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0I = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r5.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0H = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r7.A02     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A0A = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r7.A01     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A09 = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r7.A00     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A08 = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r23.A07()     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A07 = r0     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = r31.A00()     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x045b
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0470 }
            long r7 = X.C59412ws.A00(r11, r0)     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0470 }
            if (r0 == 0) goto L_0x045b
            java.lang.Double r0 = X.C18330xA.A07(r7)     // Catch:{ Exception -> 0x0470 }
        L_0x044e:
            r2.A01 = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r6.A02     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A05 = r0     // Catch:{ Exception -> 0x0470 }
            long r0 = r6.A00     // Catch:{ Exception -> 0x0470 }
            goto L_0x045d
        L_0x045b:
            r0 = 0
            goto L_0x044e
        L_0x045d:
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1T(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r2.A00 = r0     // Catch:{ Exception -> 0x0470 }
            A00(r9, r4, r2)
            r10.set(r3)
            return r12
        L_0x0470:
            r6 = move-exception
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations/error while processing scheduled migrations."
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0488 }
            X.2qk r5 = r4.A00     // Catch:{ all -> 0x0488 }
            java.lang.String r1 = "db-process-migration-failure"
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0488 }
            r5.A0A(r1, r3, r0)     // Catch:{ all -> 0x0488 }
            A00(r9, r4, r2)
            r10.set(r3)
            return r3
        L_0x0488:
            r0 = move-exception
            A00(r9, r4, r2)
            r10.set(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30D.A06(X.2Vr, java.util.Set, int, int):boolean");
    }

    public AnonymousClass30D(C55682qk r2, C56972sr r3, AnonymousClass5Z4 r4, AnonymousClass5PA r5, C56612sH r6, AnonymousClass33p r7, C61072zf r8, C623334p r9, AnonymousClass2W1 r10, C72303dV r11, C59412ws r12, C48602fA r13, AnonymousClass1VX r14, AnonymousClass4FV r15) {
        this.A04 = r6;
        this.A0C = r14;
        this.A07 = r9;
        this.A00 = r2;
        this.A01 = r3;
        this.A0D = r15;
        this.A06 = r8;
        this.A03 = r5;
        this.A0B = r13;
        this.A05 = r7;
        this.A09 = r11;
        this.A0A = r12;
        this.A08 = r10;
        this.A02 = r4;
    }

    public static boolean A01(AnonymousClass31D r3) {
        if ((r3.A0L() || r3.A0M()) && r3.A09() == 1) {
            return true;
        }
        boolean A0P = r3.A0P();
        if (A0P) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DatabaseMigrationManager/needsRollback, migration '");
            A0o.append(r3.A0C);
            C18260x0.A1L(A0o, "' is stale, rollback.");
        }
        return A0P;
    }

    public int A02(AnonymousClass31D r21, C42362Nu r22) {
        AnonymousClass31D r2;
        C42362Nu r6;
        C69833Yo Axl;
        int i;
        AnonymousClass31D r7;
        int A022;
        ArrayList A0s = AnonymousClass001.A0s();
        synchronized (this) {
            C172878Nf A002 = C48602fA.A00(this);
            while (true) {
                r2 = r21;
                if (!A002.hasNext()) {
                    break;
                }
                AnonymousClass31D r3 = (AnonymousClass31D) A002.next();
                if (r3.A0H().contains(r2.A0C)) {
                    A0s.add(r3);
                }
            }
        }
        Iterator it = A0s.iterator();
        do {
            r6 = r22;
            if (it.hasNext()) {
                r7 = (AnonymousClass31D) it.next();
                A022 = A02(r7, r6);
            } else if (r2.A0M() || r2.A0L() || r2.A0P()) {
                try {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("DatabaseMigrationManager/processMigrations; name=");
                    String str = r2.A0C;
                    A0o.append(str);
                    C18260x0.A1L(A0o, "; trying to rollback migration.");
                    if (!(r2 instanceof C23231Ru)) {
                        r2.A01.A0A("db-rollbacks-not-supported", false, str);
                    } else {
                        C23231Ru r8 = (C23231Ru) r2;
                        AnonymousClass33M A023 = AnonymousClass33M.A02(false);
                        C85284Fq A032 = AnonymousClass31D.A03(r2);
                        try {
                            C69833Yo Axl2 = A032.Axl();
                            try {
                                if (r2.A00 != Integer.MIN_VALUE) {
                                    C56082rO r11 = r2.A06;
                                    r11.A02(AnonymousClass000.A0X("_in_progress", C23281Rz.A01(r2)));
                                    if (r2 instanceof C23201Rr) {
                                        i = 1;
                                    } else {
                                        i = -1;
                                    }
                                    String A0E2 = r2.A0E();
                                    if (i != -1) {
                                        r11.A03(A0E2, i);
                                    } else {
                                        r11.A02(A0E2);
                                    }
                                }
                                C56082rO r9 = r2.A06;
                                r9.A02(r2.A0F());
                                r9.A02(AnonymousClass000.A0X("_retry_revision", C23281Rz.A01(r2)));
                                r9.A02(r2.A0G());
                                r9.A02(AnonymousClass000.A0V("migration_stats_", str, AnonymousClass001.A0o()));
                                try {
                                    C626936e.A0C(false);
                                    AnonymousClass33M A012 = AnonymousClass33M.A01("FtsMessageStore/reset");
                                    C66533Lu r0 = r8.A00;
                                    r0.A0J();
                                    r0.A0I();
                                    C72303dV r02 = r0.A0F;
                                    C85284Fq A042 = r02.A04();
                                    try {
                                        r02.A05();
                                        C18620xz r12 = r02.A04;
                                        AnonymousClass33M A013 = AnonymousClass33M.A01("databasehelper/createFtsDeprecatedTable");
                                        Axl = A042.Axl();
                                        C41492Kl r82 = new C41492Kl(r12.A01());
                                        C56622sI r1 = new C56622sI();
                                        C56862sg r03 = ((AnonymousClass3H0) A042).A03;
                                        r1.A06(r03, r82);
                                        r12.A06(r03, r82);
                                        Axl.A00();
                                        Axl.close();
                                        AnonymousClass33M.A05(A013, "databasehelper/createFtsDeprecatedTable time spent:", AnonymousClass001.A0o());
                                        A042.close();
                                        A012.A07();
                                        Axl2.A00();
                                        Axl2.close();
                                        A032.close();
                                        long A072 = A023.A07();
                                        C24331Wz r13 = new C24331Wz();
                                        r13.A01 = str;
                                        r13.A00 = Long.valueOf(A072);
                                        r2.A0B.BhD(r13);
                                    } catch (Throwable th) {
                                        A042.close();
                                        throw th;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    AnonymousClass266.A00(r2.A01, str, "rollback", e);
                                    throw e;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                AnonymousClass266.A00(r2.A01, str, "before-rollback", e);
                            } catch (Throwable th3) {
                                Axl2.close();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            try {
                                A032.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                    C18260x0.A1L(AnonymousClass000.A0m("DatabaseMigrationManager/processMigrations; name=", str), "; migration was rolled back.");
                    if (r2.A0M() || r2.A0L()) {
                        this.A00.A0A("db-rollback-had-no-effect", false, str);
                        r6.A01++;
                        return 3;
                    }
                    r6.A02++;
                    return 3;
                } catch (Exception e3) {
                    C55682qk r4 = this.A00;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("name=");
                    String str2 = r2.A0C;
                    A0o2.append(str2);
                    StringBuilder A033 = C55682qk.A03(r4, "db-rollback-failed", AnonymousClass000.A0P(e3, ", ", A0o2), false);
                    A033.append("DatabaseMigrationManager/processMigrations/error; name=");
                    A033.append(str2);
                    C18260x0.A1K(A033, "; failed to rollback migration.");
                    r6.A00++;
                    return 4;
                }
            } else {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("DatabaseMigrationManager/processMigrations; name=");
                A0o3.append(r2.A0C);
                C18260x0.A1L(A0o3, "; rollback not needed, already in original state");
                return 3;
            }
        } while (A022 == 3);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("DatabaseMigrationManager/processMigrations; name=");
        A0o4.append(r2.A0C);
        A0o4.append("; cannot rollback, because reverse dependency ");
        A0o4.append(r7.A0C);
        A0o4.append(" cannot be rolled (");
        A0o4.append(A022);
        C18260x0.A1L(A0o4, ")");
        r6.A01++;
        return A022;
        throw th;
    }
}
