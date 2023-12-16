package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.2f4  reason: invalid class name and case insensitive filesystem */
public class C48542f4 {
    public final C623334p A00;
    public final C72303dV A01;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A01(X.C30691mr r20) {
        /*
            r19 = this;
            r6 = r20
            long r1 = r6.A1L
            r17 = -1
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0139
            r5 = 0
            r4 = r19
            X.3dV r7 = r4.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, Error | RuntimeException -> 0x012d }
            X.4Fq r3 = r7.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, Error | RuntimeException -> 0x012d }
            java.util.List r0 = r6.A1w()     // Catch:{ all -> 0x0123 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0123 }
        L_0x001b:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x0123 }
            X.3ZF r2 = (X.AnonymousClass3ZF) r2     // Catch:{ all -> 0x0123 }
            boolean r0 = r2.A0R()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x001b
            android.content.ContentValues r9 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0123 }
            long r10 = r2.A05()     // Catch:{ all -> 0x0123 }
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
            java.lang.String r8 = "_id"
            long r0 = r2.A05()     // Catch:{ all -> 0x0123 }
            X.C18270x1.A0c(r9, r8, r0)     // Catch:{ all -> 0x0123 }
        L_0x0042:
            X.C624134x.A0H(r9, r6)     // Catch:{ all -> 0x0123 }
            java.lang.String r8 = "timestamp"
            long r0 = r2.A0B     // Catch:{ all -> 0x0123 }
            X.C18270x1.A0c(r9, r8, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "video_call"
            boolean r0 = r2.A0L     // Catch:{ all -> 0x0123 }
            X.AnonymousClass0x2.A0o(r9, r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r8 = "group_jid_row_id"
            com.whatsapp.jid.GroupJid r1 = r2.A05     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x010f
            X.34p r0 = r4.A00     // Catch:{ all -> 0x0123 }
            long r0 = r0.A05(r1)     // Catch:{ all -> 0x0123 }
        L_0x0061:
            X.C18270x1.A0c(r9, r8, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "is_joinable_group_call"
            boolean r0 = r2.A0K     // Catch:{ all -> 0x0123 }
            X.AnonymousClass0x2.A0o(r9, r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "is_dnd_mode_on"
            X.22I r0 = r2.A07()     // Catch:{ all -> 0x0123 }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x0123 }
            X.C18270x1.A0b(r9, r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "offer_silence_reason"
            r2.A0A()     // Catch:{ all -> 0x0123 }
            int r0 = r2.A02     // Catch:{ all -> 0x0123 }
            X.2sg r8 = X.AnonymousClass3H0.A01(r9, r3, r1, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "missed_call_logs"
            java.lang.String r0 = "insertOrUpdateCallLog/REPLACE_MISSED_CALL_LOGS"
            long r0 = r8.A0A(r1, r0, r9)     // Catch:{ all -> 0x0123 }
            r2.A0F(r0)     // Catch:{ all -> 0x0123 }
            r2.A0B()     // Catch:{ all -> 0x0123 }
            long r8 = r2.A05()     // Catch:{ all -> 0x0123 }
            int r0 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0113
            X.4Fq r8 = r7.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0107, Error | RuntimeException -> 0x011a }
            java.util.Iterator r15 = X.AnonymousClass3ZF.A01(r2)     // Catch:{ all -> 0x00fd }
        L_0x00a1:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x00fd }
            r9 = r14
            X.3ZE r9 = (X.AnonymousClass3ZE) r9     // Catch:{ all -> 0x00fd }
            boolean r0 = r9.A02()     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00a1
            android.content.ContentValues r11 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00fd }
            java.lang.String r10 = "call_logs_row_id"
            long r0 = r2.A05()     // Catch:{ all -> 0x00fd }
            X.C18270x1.A0c(r11, r10, r0)     // Catch:{ all -> 0x00fd }
            long r12 = r9.A01()     // Catch:{ all -> 0x00fd }
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x00d2
            java.lang.String r10 = "_id"
            long r0 = r9.A01()     // Catch:{ all -> 0x00fd }
            X.C18270x1.A0c(r11, r10, r0)     // Catch:{ all -> 0x00fd }
        L_0x00d2:
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r0 = r9.A02     // Catch:{ all -> 0x00fd }
            X.AnonymousClass0x2.A0n(r11, r0, r1)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "call_result"
            int r0 = r9.A00     // Catch:{ all -> 0x00fd }
            X.2sg r10 = X.AnonymousClass3H0.A01(r11, r8, r1, r0)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "missed_call_log_participant"
            java.lang.String r0 = "insertOrUpdateCallLogParticipants/REPLACE_MISSED_CALL_LOG_PARTICIPANTS"
            long r0 = r10.A0A(r1, r0, r11)     // Catch:{ all -> 0x00fd }
            monitor-enter(r14)     // Catch:{ all -> 0x00fd }
            r9.A01 = r0     // Catch:{ all -> 0x00f3 }
            monitor-exit(r14)     // Catch:{ all -> 0x00fd }
            monitor-enter(r14)     // Catch:{ all -> 0x00fd }
            r9.A03 = r5     // Catch:{ all -> 0x00f3 }
            monitor-exit(r14)     // Catch:{ all -> 0x00fd }
            goto L_0x00a1
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00fd }
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00f6:
            monitor-enter(r2)     // Catch:{ all -> 0x00fd }
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0107, Error | RuntimeException -> 0x011a }
            goto L_0x001b
        L_0x00fd:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0102 }
            goto L_0x0106
        L_0x0102:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0107, Error | RuntimeException -> 0x011a }
        L_0x0106:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0107, Error | RuntimeException -> 0x011a }
        L_0x0107:
            r1 = move-exception
            java.lang.String r0 = "MissedCallLogStore/insertOfUpdateCallLogParticipants"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0123 }
            goto L_0x001b
        L_0x010f:
            r0 = 0
            goto L_0x0061
        L_0x0113:
            java.lang.String r0 = "CallLog row_id is not set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0123 }
            goto L_0x011e
        L_0x011a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0123 }
        L_0x011e:
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x011f:
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, Error | RuntimeException -> 0x012d }
            return
        L_0x0123:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0128 }
            goto L_0x012c
        L_0x0128:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, Error | RuntimeException -> 0x012d }
        L_0x012c:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0132, Error | RuntimeException -> 0x012d }
        L_0x012d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0132:
            r1 = move-exception
            java.lang.String r0 = "MissedCallLogStore/insertOfUpdateCallLogs"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0139:
            java.lang.String r0 = "message.row_id is not set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48542f4.A01(X.1mr):void");
    }

    public C48542f4(C623334p r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass3ZF A00(C30691mr r43) {
        Cursor A0E;
        int i;
        AnonymousClass22I r6;
        StringBuilder A0o = AnonymousClass001.A0o();
        C30691mr r13 = r43;
        AnonymousClass2z0 A08 = C624134x.A08(r13, "MissedCallLogStore/getMessageCallLogs/msg.key=", A0o);
        C18260x0.A0m(A08, A0o);
        if (r13.A00) {
            return r13.A1v();
        }
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r7 = ((AnonymousClass3H0) A03).A03;
            Cursor A0E2 = r7.A0E("SELECT _id, timestamp, video_call, group_jid_row_id, is_joinable_group_call, is_dnd_mode_on, offer_silence_reason FROM missed_call_logs WHERE message_row_id = ? ORDER BY timestamp ASC", "getMessageCallLog/QUERY_MISSED_CALL_LOGS", new String[]{Long.toString(r13.A1L)});
            try {
                if (A0E2.moveToNext()) {
                    String[] strArr = new String[1];
                    C18280x3.A1R(strArr, 0, AnonymousClass0x2.A0C(A0E2, "_id"));
                    A0E = r7.A0E("SELECT _id, jid, call_result FROM missed_call_log_participant WHERE call_logs_row_id = ? ORDER BY _id ASC", "getMessageCallLog/QUERY_MISSED_CALL_LOG_PARTICIPANTS", strArr);
                    long A0C = AnonymousClass0x2.A0C(A0E2, "_id");
                    long A0C2 = AnonymousClass0x2.A0C(A0E2, "timestamp");
                    boolean A1W = AnonymousClass001.A1W(AnonymousClass0x2.A04(A0E2, "video_call"));
                    int A04 = AnonymousClass0x2.A04(A0E2, "group_jid_row_id");
                    boolean A1W2 = AnonymousClass001.A1W(AnonymousClass0x2.A04(A0E2, "is_joinable_group_call"));
                    int A042 = AnonymousClass0x2.A04(A0E2, "is_dnd_mode_on");
                    int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("offer_silence_reason");
                    if (A0E2.isNull(columnIndexOrThrow)) {
                        i = 0;
                    } else {
                        i = A0E2.getInt(columnIndexOrThrow);
                    }
                    ArrayList A0s = AnonymousClass001.A0s();
                    while (A0E.moveToNext()) {
                        long A0C3 = AnonymousClass0x2.A0C(A0E, "_id");
                        UserJid A082 = AnonymousClass32Y.A08(AnonymousClass0x2.A0Z(A0E, "jid"));
                        if (A082 instanceof PhoneUserJid) {
                            A0s.add(new AnonymousClass3ZE(A082, AnonymousClass0x2.A04(A0E, "call_result"), A0C3));
                        }
                    }
                    AnonymousClass22I[] values = AnonymousClass22I.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            r6 = AnonymousClass22I.NONE;
                            break;
                        }
                        r6 = values[i2];
                        if (r6.databaseValue == A042) {
                            break;
                        }
                        i2++;
                    }
                    GroupJid A002 = AnonymousClass32V.A00(this.A00.A08((long) A04));
                    AnonymousClass3ZF r18 = null;
                    C95814uZ r0 = A08.A00;
                    UserJid A032 = AnonymousClass32Y.A03(r0);
                    if (A032 == null) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "CallLog/fromFMessage V1 bad UserJid: ", r0);
                    } else {
                        r18 = new AnonymousClass3ZF((C52222l8) null, (DeviceJid) null, A002, r13, new AnonymousClass39J(0, A032, A08.A01, A08.A02), r6, (C53312mt) null, (C48292ef) null, (String) null, A0s, 0, 2, i, 0, A0C, A0C2, 0, A1W, false, true, A1W2);
                    }
                    A0E.close();
                    A0E2.close();
                    A03.close();
                    return r18;
                }
                A0E2.close();
                A03.close();
                return null;
            } catch (Throwable th) {
                if (A0E2 != null) {
                    A0E2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A03.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
        throw th;
    }
}
