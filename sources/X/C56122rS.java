package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2rS  reason: invalid class name and case insensitive filesystem */
public class C56122rS {
    public final C52212l7 A00;
    public final C56612sH A01;
    public final C49472ga A02;
    public final C623334p A03;
    public final C56322rn A04;
    public final C72303dV A05;
    public final C56082rO A06;
    public final AnonymousClass1VX A07;

    public synchronized void A06(AnonymousClass3ZF r9) {
        String str;
        C85284Fq A042 = this.A05.A04();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A042).A03;
            String[] strArr = new String[4];
            C623334p r1 = this.A03;
            AnonymousClass39J r6 = r9.A0E;
            C18260x0.A1Y(strArr, r1.A05(r6.A01));
            if (r6.A03) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[1] = str;
            strArr[2] = r6.A02;
            strArr[3] = Integer.toString(r6.A00);
            int A072 = r5.A07("call_log", "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?", "deleteCallLog/DELETE_CALL_LOG", strArr);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CallLogStore/deleteCallLog/rowId=");
            A0o.append(r9.A05());
            C18260x0.A0y("; count=", A0o, A072);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return;
        throw th;
    }

    public AnonymousClass3ZF A01(long j) {
        Cursor A0E;
        AnonymousClass4GK A032 = this.A05.get();
        try {
            C56862sg r7 = ((AnonymousClass3H0) A032).A03;
            String l = Long.toString(j);
            Cursor A0E2 = r7.A0E("SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log._id = ?", "GET_CALL_LOG_BY_CALL_ID", new String[]{l});
            try {
                if (A0E2.moveToLast()) {
                    A0E = r7.A0E("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_ROW_ID", new String[]{l});
                    AnonymousClass3ZF A022 = A02(A0E2, A0E);
                    if (A0E != null) {
                        A0E.close();
                    }
                    A0E2.close();
                    A032.close();
                    return A022;
                }
                A0E2.close();
                A032.close();
                return null;
            } catch (Throwable th) {
                if (A0E2 != null) {
                    A0E2.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final AnonymousClass3ZF A02(Cursor cursor, Cursor cursor2) {
        String string;
        C48292ef r8;
        AnonymousClass22I r7;
        Cursor cursor3 = cursor;
        long A0C = AnonymousClass0x2.A0C(cursor3, "_id");
        String A0Z = AnonymousClass0x2.A0Z(cursor3, "call_id");
        long A0C2 = AnonymousClass0x2.A0C(cursor3, "jid_row_id");
        C623334p r3 = this.A03;
        UserJid A022 = AnonymousClass32Y.A02(r3, A0C2);
        if (A022 == null) {
            C18260x0.A11("CallLogStore/readCallLogFromCursors/error getting jid; log jidRowId=", AnonymousClass001.A0o(), A0C2);
            return null;
        }
        AnonymousClass39J r1 = new AnonymousClass39J(AnonymousClass0x2.A04(cursor3, "transaction_id"), A022, A0Z, AnonymousClass001.A1W(AnonymousClass0x2.A04(cursor3, "from_me")));
        long A0C3 = AnonymousClass0x2.A0C(cursor3, "timestamp");
        boolean A1W = AnonymousClass001.A1W(AnonymousClass0x2.A04(cursor3, "video_call"));
        int A042 = AnonymousClass0x2.A04(cursor3, "duration");
        int A043 = AnonymousClass0x2.A04(cursor3, "call_result");
        int A044 = AnonymousClass0x2.A04(cursor3, "is_dnd_mode_on");
        long A0C4 = AnonymousClass0x2.A0C(cursor3, "bytes_transferred");
        int A045 = AnonymousClass0x2.A04(cursor3, "group_jid_row_id");
        boolean A1W2 = AnonymousClass001.A1W(AnonymousClass0x2.A04(cursor3, "is_joinable_group_call"));
        int A012 = C18290x4.A01(cursor3, cursor3.getColumnIndexOrThrow("offer_silence_reason"));
        long A0C5 = AnonymousClass0x2.A0C(cursor3, "call_creator_device_jid_row_id");
        int A013 = C18290x4.A01(cursor3, cursor3.getColumnIndexOrThrow("call_type"));
        int columnIndexOrThrow = cursor3.getColumnIndexOrThrow("scheduled_id");
        if (cursor3.isNull(columnIndexOrThrow)) {
            string = null;
        } else {
            string = cursor3.getString(columnIndexOrThrow);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        while (true) {
            Cursor cursor4 = cursor2;
            try {
                if (!cursor4.moveToNext()) {
                    break;
                }
                long A0C6 = AnonymousClass0x2.A0C(cursor4, "_id");
                int A046 = AnonymousClass0x2.A04(cursor4, "jid_row_id");
                UserJid A052 = AnonymousClass32Y.A05(r3.A08((long) A046));
                if (A052 != null) {
                    A0s.add(new AnonymousClass3ZE(A052, AnonymousClass0x2.A04(cursor4, "call_result"), A0C6));
                } else {
                    C18260x0.A0x("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=", AnonymousClass001.A0o(), A046);
                }
            } catch (RuntimeException e) {
                Log.e("CallLogStore/readCallLogFromCursors/exception", e);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(AnonymousClass0x9.A02(cursor3, "CallLogStore/readCallLogFromCursors/exception logCursorCount", A0o));
                A0o.append(" position:");
                C18270x1.A1F(A0o, cursor3.getPosition());
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(AnonymousClass0x9.A02(cursor4, "CallLogStore/readCallLogFromCursors/exception participantsCursorCount", A0o2));
                A0o2.append(" position:");
                C18270x1.A1F(A0o2, cursor4.getPosition());
                throw e;
            }
        }
        String A0Z2 = AnonymousClass0x2.A0Z(cursor3, "call_random_id");
        if (string != null) {
            r8 = new C48292ef(string);
        } else {
            r8 = null;
        }
        AnonymousClass22I[] values = AnonymousClass22I.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r7 = AnonymousClass22I.NONE;
                break;
            }
            r7 = values[i];
            if (r7.databaseValue == A044) {
                break;
            }
            i++;
        }
        GroupJid A014 = AnonymousClass32V.A01(r3.A08((long) A045));
        return new AnonymousClass3ZF(this.A00.A01(cursor3), DeviceJid.of(r3.A08(A0C5)), A014, (C30321mG) null, r1, r7, this.A04.A01(cursor3), r8, A0Z2, A0s, A042, A043, A012, A013, A0C, A0C3, A0C4, A1W, false, false, A1W2);
    }

    public AnonymousClass3ZF A03(AnonymousClass39J r47) {
        String str;
        Cursor A0E;
        int i;
        int i2;
        String str2;
        AnonymousClass22I r7;
        AnonymousClass4GK A032 = this.A05.get();
        try {
            C56862sg r8 = ((AnonymousClass3H0) A032).A03;
            String[] strArr = new String[4];
            AnonymousClass39J r12 = r47;
            strArr[0] = r12.A02;
            C623334p r3 = this.A03;
            strArr[1] = Long.toString(r3.A05(r12.A01));
            if (r12.A03) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[2] = str;
            strArr[3] = Integer.toString(r12.A00);
            Cursor A0E2 = r8.A0E("SELECT call_log._id, call_log.call_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log.call_id = ? AND jid_row_id = ? AND from_me = ? AND transaction_id = ?", "GET_CALL_LOG_BY_KEY", strArr);
            try {
                if (A0E2.moveToLast()) {
                    String[] strArr2 = new String[1];
                    C18280x3.A1R(strArr2, 0, AnonymousClass0x2.A0C(A0E2, "_id"));
                    A0E = r8.A0E("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_KEY", strArr2);
                    long A0C = AnonymousClass0x2.A0C(A0E2, "_id");
                    long A0C2 = AnonymousClass0x2.A0C(A0E2, "timestamp");
                    boolean A1W = AnonymousClass001.A1W(AnonymousClass0x2.A04(A0E2, "video_call"));
                    int A042 = AnonymousClass0x2.A04(A0E2, "duration");
                    int A043 = AnonymousClass0x2.A04(A0E2, "call_result");
                    int A044 = AnonymousClass0x2.A04(A0E2, "is_dnd_mode_on");
                    long A0C3 = AnonymousClass0x2.A0C(A0E2, "bytes_transferred");
                    int A045 = AnonymousClass0x2.A04(A0E2, "group_jid_row_id");
                    boolean A1W2 = AnonymousClass001.A1W(AnonymousClass0x2.A04(A0E2, "is_joinable_group_call"));
                    long A0C4 = AnonymousClass0x2.A0C(A0E2, "call_creator_device_jid_row_id");
                    int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("call_type");
                    if (A0E2.isNull(columnIndexOrThrow)) {
                        i = 0;
                    } else {
                        i = A0E2.getInt(columnIndexOrThrow);
                    }
                    int columnIndexOrThrow2 = A0E2.getColumnIndexOrThrow("offer_silence_reason");
                    if (A0E2.isNull(columnIndexOrThrow2)) {
                        i2 = 0;
                    } else {
                        i2 = A0E2.getInt(columnIndexOrThrow2);
                    }
                    int columnIndexOrThrow3 = A0E2.getColumnIndexOrThrow("scheduled_id");
                    C48292ef r13 = null;
                    if (A0E2.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = A0E2.getString(columnIndexOrThrow3);
                    }
                    ArrayList A0s = AnonymousClass001.A0s();
                    while (A0E.moveToNext()) {
                        long A0C5 = AnonymousClass0x2.A0C(A0E, "_id");
                        int A046 = AnonymousClass0x2.A04(A0E, "jid_row_id");
                        UserJid A022 = AnonymousClass32Y.A02(r3, (long) A046);
                        if (A022 != null) {
                            A0s.add(new AnonymousClass3ZE(A022, AnonymousClass0x2.A04(A0E, "call_result"), A0C5));
                        } else {
                            C18260x0.A0x("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=", AnonymousClass001.A0o(), A046);
                        }
                    }
                    String A0Z = AnonymousClass0x2.A0Z(A0E2, "call_random_id");
                    if (str2 != null) {
                        r13 = new C48292ef(str2);
                    }
                    AnonymousClass22I[] values = AnonymousClass22I.values();
                    int length = values.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            r7 = AnonymousClass22I.NONE;
                            break;
                        }
                        r7 = values[i3];
                        if (r7.databaseValue == A044) {
                            break;
                        }
                        i3++;
                    }
                    AnonymousClass3ZF r21 = new AnonymousClass3ZF(this.A00.A01(A0E2), DeviceJid.of(r3.A08(A0C4)), AnonymousClass32V.A00(r3.A08((long) A045)), (C30321mG) null, r12, r7, this.A04.A01(A0E2), r13, A0Z, A0s, A042, A043, i2, i, A0C, A0C2, A0C3, A1W, false, false, A1W2);
                    A0E.close();
                    A0E2.close();
                    A032.close();
                    return r21;
                }
                A0E2.close();
                A032.close();
                return null;
            } catch (Throwable th) {
                if (A0E2 != null) {
                    A0E2.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public AnonymousClass3ZF A04(String str) {
        Cursor A0E;
        AnonymousClass4GK A032 = this.A05.get();
        try {
            C56862sg r7 = ((AnonymousClass3H0) A032).A03;
            Cursor A0E2 = r7.A0E("SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log.call_id = ?", "GET_CALL_LOG_BY_CALL_ID", new String[]{str});
            try {
                AnonymousClass3ZF r1 = null;
                if (A0E2.moveToLast()) {
                    int columnIndex = A0E2.getColumnIndex("_id");
                    if (columnIndex < 0) {
                        C626936e.A0D(false, "CallLogStore/getColumnIndexOrThrow _id column not found");
                    } else {
                        String[] strArr = new String[1];
                        C18280x3.A1R(strArr, 0, (long) A0E2.getInt(columnIndex));
                        A0E = r7.A0E("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_ROW_ID", strArr);
                        r1 = A02(A0E2, A0E);
                        if (A0E != null) {
                            A0E.close();
                        }
                    }
                }
                A0E2.close();
                A032.close();
                return r1;
            } catch (Throwable th) {
                if (A0E2 != null) {
                    A0E2.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public C56122rS(C52212l7 r1, C56612sH r2, C49472ga r3, C623334p r4, C56322rn r5, C72303dV r6, C56082rO r7, AnonymousClass1VX r8) {
        this.A01 = r2;
        this.A07 = r8;
        this.A03 = r4;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final ContentValues A00(AnonymousClass39J r7, AnonymousClass3ZF r8) {
        long j;
        long j2;
        String str;
        ContentValues A062 = AnonymousClass0x9.A06();
        C623334p r5 = this.A03;
        A062.put("jid_row_id", C623334p.A03(r5, r7.A01));
        A062.put("from_me", Integer.valueOf(r7.A03 ? 1 : 0));
        A062.put("call_id", r7.A02);
        A062.put("transaction_id", Integer.valueOf(r7.A00));
        C18290x4.A19(A062, r8.A0B);
        A062.put("video_call", Boolean.valueOf(r8.A0L));
        A062.put("duration", Integer.valueOf(r8.A01));
        A062.put("call_result", Integer.valueOf(r8.A00));
        A062.put("is_dnd_mode_on", Integer.valueOf(r8.A07().databaseValue));
        A062.put("bytes_transferred", Long.valueOf(r8.A03));
        GroupJid groupJid = r8.A05;
        long j3 = 0;
        if (groupJid != null) {
            j = r5.A05(groupJid);
        } else {
            j = 0;
        }
        A062.put("group_jid_row_id", Long.valueOf(j));
        A062.put("is_joinable_group_call", Boolean.valueOf(r8.A0K));
        DeviceJid deviceJid = r8.A0C;
        if (deviceJid != null) {
            j2 = r5.A05(deviceJid);
        } else {
            j2 = 0;
        }
        A062.put("call_creator_device_jid_row_id", Long.valueOf(j2));
        A062.put("call_random_id", r8.A08);
        r8.A0A();
        A062.put("offer_silence_reason", Integer.valueOf(r8.A02));
        if (r8.A0I != null) {
            j3 = r8.A0I.A00;
        }
        A062.put("call_link_row_id", Long.valueOf(j3));
        A062.put("call_type", Integer.valueOf(r8.A0H));
        if (r8.A0J != null) {
            str = r8.A0J.A00;
        } else {
            str = null;
        }
        A062.put("scheduled_id", str);
        return A062;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00af, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass3ZF r21) {
        /*
            r20 = this;
            long r1 = r21.A05()
            r5 = 1
            r4 = 0
            r12 = -1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r0)
            java.lang.String r0 = "CallLog row_id is not set"
            X.C626936e.A0E(r1, r0)
            r3 = r20
            X.3dV r0 = r3.A05
            X.4Fq r11 = r0.A04()
            X.3Yo r10 = r11.Axl()     // Catch:{ all -> 0x00b0 }
            java.util.Iterator r9 = X.AnonymousClass3ZF.A01(r21)     // Catch:{ all -> 0x00a6 }
        L_0x0023:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x00a6 }
            r2 = r8
            X.3ZE r2 = (X.AnonymousClass3ZE) r2     // Catch:{ all -> 0x00a6 }
            boolean r0 = r2.A02()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0023
            android.content.ContentValues r15 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x00a6 }
            long r0 = r21.A05()     // Catch:{ all -> 0x00a6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "call_log_row_id"
            r15.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            X.34p r1 = r3.A03     // Catch:{ all -> 0x00a6 }
            com.whatsapp.jid.UserJid r0 = r2.A02     // Catch:{ all -> 0x00a6 }
            java.lang.Long r1 = X.C623334p.A03(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "jid_row_id"
            r15.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            int r0 = r2.A00     // Catch:{ all -> 0x00a6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "call_result"
            r15.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            long r6 = r2.A01()     // Catch:{ all -> 0x00a6 }
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0085
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a6 }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x00a6 }
            java.lang.String r16 = "call_log_participant_v2"
            java.lang.String r17 = "_id = ?"
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x00a6 }
            long r0 = r2.A01()     // Catch:{ all -> 0x00a6 }
            X.C18280x3.A1R(r6, r4, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r18 = "insertOrUpdateCallLogParticipants/UPDATE_CALL_LOG_PARTICIPANT"
            r19 = r6
            r14.A05(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00a6 }
        L_0x0080:
            monitor-enter(r8)     // Catch:{ all -> 0x00a6 }
            r2.A03 = r4     // Catch:{ all -> 0x0097 }
            monitor-exit(r8)     // Catch:{ all -> 0x00a6 }
            goto L_0x0023
        L_0x0085:
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a6 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "call_log_participant_v2"
            java.lang.String r0 = "insertOrUpdateCallLogParticipants/REPLACE_CALL_LOG_PARTICIPANT"
            long r0 = r6.A0B(r1, r0, r15)     // Catch:{ all -> 0x00a6 }
            monitor-enter(r8)     // Catch:{ all -> 0x00a6 }
            r2.A01 = r0     // Catch:{ all -> 0x0097 }
            monitor-exit(r8)     // Catch:{ all -> 0x00a6 }
            goto L_0x0080
        L_0x0097:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x009a:
            monitor-enter(r21)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r21)     // Catch:{ all -> 0x00a6 }
            r10.A00()     // Catch:{ all -> 0x00a6 }
            r10.close()     // Catch:{ all -> 0x00b0 }
            r11.close()
            return
        L_0x00a6:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00ab }
            goto L_0x00af
        L_0x00ab:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00b5 }
            throw r1
        L_0x00b5:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56122rS.A05(X.3ZF):void");
    }
}
