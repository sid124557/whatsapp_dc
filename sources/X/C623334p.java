package X;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.34p  reason: invalid class name and case insensitive filesystem */
public class C623334p {
    public final C55682qk A00;
    public final C72303dV A01;
    public final C56082rO A02;
    public final Map A03 = AnonymousClass0x9.A1D();
    public final Map A04 = AnonymousClass0x9.A1D();

    public long A06(Jid jid) {
        Jid jid2 = jid;
        Number A0q = AnonymousClass0x9.A0q(jid, this.A03);
        if (A0q != null) {
            return A0q.longValue();
        }
        AnonymousClass4GK A032 = this.A01.get();
        try {
            long A07 = A07(jid);
            if (A07 > 0) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("JidStore/lookupRowIdForJid/read jid row id; jid=");
                A0o.append(jid);
                C18260x0.A10("; rowId=", A0o, A07);
                if (((AnonymousClass3H0) A032).A03.A00.inTransaction()) {
                    A032.B25(new C70283aF(this, jid2, 6, A07));
                } else {
                    A0F(jid, A07);
                }
            }
            A032.close();
            return A07;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Jid A0A(Cursor cursor, AnonymousClass4GK r16, Class cls, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        long j2 = j;
        try {
            return (Jid) cls.cast(A09(cursor, r16, i, i2, i3, i4, i5, i6, j2));
        } catch (ClassCastException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("JidStore/readJidByRowId/jid wrong class; rowId=");
            A0o.append(j2);
            A0o.append("; db_data=");
            C18260x0.A15(A0C(j2), A0o, e);
            this.A00.A0A("invalid-jid-in-store", false, (String) null);
            return null;
        }
    }

    public static long A00(C56862sg r8, Jid jid) {
        Cursor cursor;
        long j;
        if (jid instanceof DeviceJid) {
            String[] strArr = new String[5];
            strArr[0] = jid.user;
            strArr[1] = jid.getServer();
            C18320x8.A1Q(strArr, jid.getAgent(), 2);
            C18320x8.A1Q(strArr, jid.getDevice(), 3);
            C18320x8.A1Q(strArr, jid.getType(), 4);
            cursor = r8.A0E("SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND device = ? AND type = ?", "GET_JID_ROW_ID_FROM_DEVICE_JID", strArr);
            try {
                if (cursor.moveToLast()) {
                    j = AnonymousClass0x2.A0C(cursor, "_id");
                }
                cursor.close();
                return -1;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            String[] strArr2 = new String[4];
            strArr2[0] = jid.user;
            strArr2[1] = jid.getServer();
            C18320x8.A1Q(strArr2, jid.getAgent(), 2);
            C18320x8.A1Q(strArr2, jid.getType(), 3);
            cursor = r8.A0E("SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND type = ?", "GET_JID_ROW_ID_FROM_JID", strArr2);
            if (cursor.moveToLast()) {
                j = AnonymousClass0x2.A0C(cursor, "_id");
            }
            cursor.close();
            return -1;
        }
        cursor.close();
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x021f A[Catch:{ all -> 0x0289, SQLiteConstraintException -> 0x00d0, all -> 0x028e, all -> 0x0282 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05(com.whatsapp.jid.Jid r24) {
        /*
            r23 = this;
            java.lang.String r20 = "jid"
            java.lang.String r19 = "raw_string"
            java.lang.String r18 = "type"
            java.lang.String r3 = "device"
            java.lang.String r14 = "agent"
            java.lang.String r13 = "server"
            java.lang.String r12 = "user"
            r6 = r23
            java.util.Map r0 = r6.A03
            r7 = r24
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r7, r0)
            if (r0 == 0) goto L_0x0023
            long r0 = r0.longValue()
            return r0
        L_0x0023:
            java.lang.String r0 = r7.user
            r4 = -1
            if (r0 != 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "JidStore/getRowIdForJid/Error creating a valid Jid object; jid="
            X.C18260x0.A1Q(r1, r0, r7)
            return r4
        L_0x0033:
            X.3dV r0 = r6.A01
            X.4Fq r5 = r0.A04()
            long r1 = r6.A07(r7)     // Catch:{ all -> 0x0298 }
            r8 = 0
            java.lang.String r10 = "; rowId="
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0298 }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x0298 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0298 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0298 }
            if (r0 == 0) goto L_0x0060
            r11 = 7
            X.3aF r8 = new X.3aF     // Catch:{ all -> 0x0298 }
            r9 = r6
            r10 = r7
            r12 = r1
            r8.<init>(r9, r10, r11, r12)     // Catch:{ all -> 0x0298 }
            r5.B25(r8)     // Catch:{ all -> 0x0298 }
            goto L_0x027d
        L_0x0060:
            r6.A0F(r7, r1)     // Catch:{ all -> 0x0298 }
            goto L_0x027d
        L_0x0065:
            X.3Yo r17 = r5.Axm()     // Catch:{ all -> 0x0298 }
            long r1 = r6.A07(r7)     // Catch:{ all -> 0x028e }
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "JidStore/getRowIdForJid/read jid row id again; jid="
            r3.append(r0)     // Catch:{ all -> 0x028e }
            r3.append(r7)     // Catch:{ all -> 0x028e }
            X.C18260x0.A10(r10, r3, r1)     // Catch:{ all -> 0x028e }
        L_0x0080:
            r17.A00()     // Catch:{ all -> 0x028e }
            goto L_0x024e
        L_0x0085:
            r0 = 6
            android.content.ContentValues r9 = X.AnonymousClass0x9.A07(r0)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            java.lang.String r0 = r7.user     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            r9.put(r12, r0)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            java.lang.String r0 = r7.getServer()     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            r9.put(r13, r0)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            int r0 = r7.getAgent()     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            X.C18270x1.A0b(r9, r14, r0)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            int r0 = r7.getDevice()     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            X.C18270x1.A0b(r9, r3, r0)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            int r4 = r7.getType()     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            r0 = r18
            X.C18270x1.A0b(r9, r0, r4)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            r0 = r19
            X.AnonymousClass0x2.A0n(r9, r7, r0)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            X.2sg r8 = r0.A03     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            java.lang.String r4 = "INSERT_JID_SQL"
            r0 = r20
            long r1 = r8.A09(r0, r4, r9)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            java.lang.String r0 = "JidStore/getRowIdForJid/inserted to database; jid="
            r4.append(r0)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            r4.append(r7)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            X.C18260x0.A10(r10, r4, r1)     // Catch:{ SQLiteConstraintException -> 0x00d0 }
            goto L_0x0237
        L_0x00d0:
            r11 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "JidStore/getRowIdForJid/insert failed with exception "
            r4.append(r0)     // Catch:{ all -> 0x028e }
            r4.append(r11)     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "; jid="
            r4.append(r0)     // Catch:{ all -> 0x028e }
            r4.append(r7)     // Catch:{ all -> 0x028e }
            X.C18260x0.A10(r10, r4, r1)     // Catch:{ all -> 0x028e }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x028e }
            X.2sg r15 = r0.A03     // Catch:{ all -> 0x028e }
            java.lang.String r4 = "SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE raw_string = ?"
            r21 = r1
            java.lang.String[] r1 = X.C18270x1.A1a(r7)     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "GET_JID_FROM_RAW_STRING"
            android.database.Cursor r9 = r15.A0E(r4, r0, r1)     // Catch:{ all -> 0x028e }
            boolean r0 = r9.moveToLast()     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0207
            long r1 = X.C18270x1.A01(r9)     // Catch:{ all -> 0x0282 }
            java.util.Map r4 = r6.A04     // Catch:{ all -> 0x0282 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0282 }
            boolean r16 = r4.containsKey(r0)     // Catch:{ all -> 0x0282 }
            com.whatsapp.jid.Jid r8 = r6.A08(r1)     // Catch:{ all -> 0x0282 }
            java.lang.String r4 = "; errorRowId="
            if (r8 == 0) goto L_0x01e5
            int r15 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0282 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed; jid="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            X.C18280x3.A0u(r7, r3)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; db.user="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r9, r12)     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; db.server="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r9, r13)     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; db.agent="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            int r0 = X.AnonymousClass0x2.A04(r9, r14)     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; db.device="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            boolean r0 = r9.isNull(r15)     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x01df
            java.lang.String r0 = "<null>"
        L_0x0158:
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; db.type="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            r0 = r18
            int r0 = X.AnonymousClass0x2.A04(r9, r0)     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; db.raw_string="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            r0 = r19
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r9, r0)     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            r3.append(r4)     // Catch:{ all -> 0x0282 }
            r3.append(r1)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; inCache="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            r0 = r16
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; jidFromDb.user="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = r8.user     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; jidFromDb.server="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = r8.getServer()     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; jidFromDb.agent="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            int r0 = r8.getAgent()     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; jidFromDb.device="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            int r0 = r8.getDevice()     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; jidFromDb.type="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            int r0 = r8.getType()     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; jidFromDb.raw_string="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            X.C18280x3.A0u(r8, r3)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "; matchingJid="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            boolean r0 = r7.equals(r8)     // Catch:{ all -> 0x0282 }
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            X.C18280x3.A13(r3)     // Catch:{ all -> 0x0282 }
            boolean r0 = r7.equals(r8)     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0217
            goto L_0x0219
        L_0x01df:
            java.lang.Integer r0 = X.C18300x5.A0a(r9, r15)     // Catch:{ all -> 0x0282 }
            goto L_0x0158
        L_0x01e5:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by row_id; jid="
            r3.append(r0)     // Catch:{ all -> 0x0282 }
            r3.append(r7)     // Catch:{ all -> 0x0282 }
            X.C18260x0.A11(r4, r3, r1)     // Catch:{ all -> 0x0282 }
            java.lang.String r4 = "raw_string = ?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x0282 }
            X.C18280x3.A0v(r7, r2)     // Catch:{ all -> 0x0282 }
            java.lang.String r1 = "getRowIdForJid/DELETE_JID_ON_MISMATCH"
            r0 = r20
            r15.A07(r0, r4, r1, r2)     // Catch:{ all -> 0x0282 }
            r1 = r21
            goto L_0x021a
        L_0x0207:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by raw_string; jid="
            r1.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x0282 }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0282 }
        L_0x0217:
            r1 = r21
        L_0x0219:
            r3 = 0
        L_0x021a:
            r9.close()     // Catch:{ all -> 0x028e }
            if (r3 != 0) goto L_0x0237
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0281
            X.2qk r8 = r6.A00     // Catch:{ all -> 0x028e }
            java.lang.String r4 = "JidStore/raw_string-constraint-failed"
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "jid found by raws string; jid="
            java.lang.String r3 = X.C18260x0.A03(r7, r0, r3)     // Catch:{ all -> 0x028e }
            r0 = 0
            r8.A0A(r4, r0, r3)     // Catch:{ all -> 0x028e }
        L_0x0237:
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "JidStore/getRowIdForJid/inserted jid to database; jid="
            r3.append(r0)     // Catch:{ all -> 0x028e }
            r3.append(r7)     // Catch:{ all -> 0x028e }
            X.C18260x0.A10(r10, r3, r1)     // Catch:{ all -> 0x028e }
            goto L_0x0080
        L_0x024e:
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x026c
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "JidStore/getRowIdForJid/Error inserting jid; jid="
            r3.append(r0)     // Catch:{ all -> 0x028e }
            r3.append(r7)     // Catch:{ all -> 0x028e }
            X.C18260x0.A11(r10, r3, r1)     // Catch:{ all -> 0x028e }
            r17.close()     // Catch:{ all -> 0x0298 }
            r5.close()
            r0 = -1
            return r0
        L_0x026c:
            r11 = 8
            X.3aF r0 = new X.3aF     // Catch:{ all -> 0x028e }
            r8 = r0
            r9 = r6
            r10 = r7
            r12 = r1
            r8.<init>(r9, r10, r11, r12)     // Catch:{ all -> 0x028e }
            r5.B25(r0)     // Catch:{ all -> 0x028e }
            r17.close()     // Catch:{ all -> 0x0298 }
        L_0x027d:
            r5.close()
            return r1
        L_0x0281:
            throw r11     // Catch:{ all -> 0x028e }
        L_0x0282:
            r1 = move-exception
            if (r9 == 0) goto L_0x028d
            r9.close()     // Catch:{ all -> 0x0289 }
            goto L_0x028d
        L_0x0289:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x028e }
        L_0x028d:
            throw r1     // Catch:{ all -> 0x028e }
        L_0x028e:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0293 }
            goto L_0x0297
        L_0x0293:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0298 }
        L_0x0297:
            throw r1     // Catch:{ all -> 0x0298 }
        L_0x0298:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x029d }
            throw r1
        L_0x029d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623334p.A05(com.whatsapp.jid.Jid):long");
    }

    public final long A07(Jid jid) {
        C85284Fq A042 = this.A01.A04();
        try {
            long A002 = A00(((AnonymousClass3H0) A042).A03, jid);
            A042.close();
            return A002;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Jid A08(long j) {
        Cursor A0E;
        long j2 = j;
        if (j <= 0) {
            return null;
        }
        Map map = this.A04;
        Long valueOf = Long.valueOf(j2);
        if (map.containsKey(valueOf)) {
            return (Jid) map.get(valueOf);
        }
        AnonymousClass4GK A032 = this.A01.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j2);
            A0E = r3.A0E("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", "GET_JID_BY_ROW_ID_SQL", A1Y);
            if (A0E.moveToLast()) {
                Jid A09 = A09(A0E, A032, A0E.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER), A0E.getColumnIndexOrThrow("server"), A0E.getColumnIndexOrThrow("agent"), A0E.getColumnIndexOrThrow("device"), A0E.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A0E.getColumnIndexOrThrow("raw_string"), j2);
                A0E.close();
                A032.close();
                return A09;
            }
            A0E.close();
            A032.close();
            return null;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Jid A09(Cursor cursor, AnonymousClass4GK r14, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        long j2 = j;
        if (j <= 0) {
            return null;
        }
        Map map = this.A04;
        Long valueOf = Long.valueOf(j2);
        if (map.containsKey(valueOf)) {
            return (Jid) map.get(valueOf);
        }
        Jid A012 = A01(cursor, i, i2, i3, i4, i5, i6);
        if (A012 == null) {
            return A012;
        }
        if (((AnonymousClass3H0) r14).A03.A00.inTransaction()) {
            r14.B25(new C70283aF(this, A012, 5, j2));
            return A012;
        }
        A0F(A012, j2);
        return A012;
    }

    public final String A0C(long j) {
        Cursor A0E;
        int i;
        String str;
        AnonymousClass4GK A032 = this.A01.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r3.A0E("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", "GET_JID_BY_ROW_ID_SQL", A1Y);
            if (A0E.moveToLast()) {
                String A0Z = AnonymousClass0x2.A0Z(A0E, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                String A0Z2 = AnonymousClass0x2.A0Z(A0E, "server");
                int A042 = AnonymousClass0x2.A04(A0E, "agent");
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("device");
                if (A0E.isNull(columnIndexOrThrow)) {
                    i = 0;
                } else {
                    i = A0E.getInt(columnIndexOrThrow);
                }
                int A043 = AnonymousClass0x2.A04(A0E, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                String A0Z3 = AnonymousClass0x2.A0Z(A0E, "raw_string");
                boolean isNull = A0E.isNull(columnIndexOrThrow);
                if (A0Z != null) {
                    String str2 = A0Z;
                    C626936e.A0B(true);
                    int length = A0Z.length();
                    if (length > 4) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18310x6.A1G("", Collections.nCopies(length - 4, '*'), A0o);
                        str2 = AnonymousClass000.A0X(C107575bX.A0B(A0Z, 4), A0o);
                    }
                    if (A0Z3 != null) {
                        A0Z3 = A0Z3.replace(A0Z, str2);
                    }
                    A0Z = str2;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("user=");
                A0o2.append(A0Z);
                A0o2.append("; server=");
                A0o2.append(A0Z2);
                A0o2.append("; agent=");
                A0o2.append(A042);
                A0o2.append("; device=");
                A0o2.append(i);
                A0o2.append("; type=");
                A0o2.append(A043);
                A0o2.append("; rawString=");
                A0o2.append(A0Z3);
                A0o2.append("; has_device=");
                if (isNull) {
                    str = "no";
                } else {
                    str = "yes";
                }
                String A0X = AnonymousClass000.A0X(str, A0o2);
                A0E.close();
                A032.close();
                return A0X;
            }
            A0E.close();
            A032.close();
            return null;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0F(Jid jid, long j) {
        Map map = this.A04;
        Long valueOf = Long.valueOf(j);
        map.put(valueOf, jid);
        this.A03.put(jid, valueOf);
    }

    public C623334p(C55682qk r2, C72303dV r3, C56082rO r4) {
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static Jid A01(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6) {
        String A012 = C626135u.A01(cursor, i);
        String A013 = C626135u.A01(cursor, i2);
        int i7 = cursor.getInt(i3);
        int A014 = C18290x4.A01(cursor, i4);
        int i8 = cursor.getInt(i5);
        String A015 = C626135u.A01(cursor, i6);
        try {
            Jid A016 = AnonymousClass32W.A01(A015);
            if (i8 == 0) {
                if (A016 instanceof DeviceJid) {
                    A016 = ((DeviceJid) A016).userJid;
                }
            } else if (i8 == 17 && (A016 instanceof UserJid)) {
                A016 = C18320x8.A0O(A016);
            }
            if (C107575bX.A0G(A012, A016.user) && C107575bX.A0G(A013, A016.getServer()) && i7 == A016.getAgent() && A014 == A016.getDevice() && i8 == A016.getType()) {
                return A016;
            }
            StringBuilder A0l = AnonymousClass000.A0l("jidstore/readjidfromcursor/cursormismatch");
            A0l.append(" user=");
            A0l.append(A012);
            A0l.append(" server=");
            A0l.append(A013);
            A0l.append(" agent=");
            A0l.append(i7);
            A0l.append(" device=");
            A0l.append(A014);
            A0l.append(" type=");
            A0l.append(i8);
            C18260x0.A0r(" rawString=", A015, A0l);
            return null;
        } catch (AnonymousClass24P unused) {
            if (i8 == 11 && TextUtils.isEmpty(A012) && TextUtils.isEmpty(A013) && i7 == 0 && A014 == 0 && TextUtils.isEmpty(A015)) {
                return AnonymousClass1fY.A00;
            }
            StringBuilder A0l2 = AnonymousClass000.A0l("jidstore/readjidfromcursor/invalidjid");
            A0l2.append(" user=");
            A0l2.append(A012);
            A0l2.append(" server=");
            A0l2.append(A013);
            A0l2.append(" agent=");
            A0l2.append(i7);
            A0l2.append(" device=");
            A0l2.append(A014);
            A0l2.append(" type=");
            A0l2.append(i8);
            C18260x0.A0r(" rawString=", A015, A0l2);
            return null;
        }
    }

    public static UserJid A02(C623334p r0, Class cls, long j) {
        return (UserJid) r0.A0B(cls, j);
    }

    public static Long A03(C623334p r0, Jid jid) {
        return Long.valueOf(r0.A05(jid));
    }

    public static String A04(C623334p r0, Jid jid) {
        return String.valueOf(r0.A05(jid));
    }

    public Jid A0B(Class cls, long j) {
        try {
            return (Jid) cls.cast(A08(j));
        } catch (ClassCastException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("JidStore/readJidByRowId/jid wrong class; rowId=");
            A0o.append(j);
            A0o.append("; db_data=");
            C18260x0.A15(A0C(j), A0o, e);
            this.A00.A0A("JidStore/readJidByRowId", true, "invalid-jid-in-store");
            return null;
        }
    }

    public Map A0D(Class cls, Collection collection) {
        Class cls2;
        Cursor A0E;
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = collection.iterator();
        while (true) {
            cls2 = cls;
            if (!it.hasNext()) {
                break;
            }
            Number number = (Number) it.next();
            long longValue = number.longValue();
            if (this.A04.containsKey(number)) {
                A0t.put(number, A0B(cls2, longValue));
            } else {
                A0s.add(Long.toString(longValue));
            }
        }
        Object[] array = A0s.toArray(C58152un.A0N);
        AnonymousClass4GK A032 = this.A01.get();
        try {
            C71923ct r2 = new C71923ct(array, 975);
            while (r2.hasNext()) {
                String[] A012 = C71923ct.A01(r2);
                C56862sg r6 = ((AnonymousClass3H0) A032).A03;
                int length = A012.length;
                StringBuilder A0o = AnonymousClass001.A0o();
                C57212tH.A02("SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE _id IN ", A0o, length);
                A0E = r6.A0E(A0o.toString(), "GET_JIDS_BY_ROW_IDS_SQL", A012);
                int A022 = AnonymousClass0x7.A02(A0E);
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("server");
                int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("agent");
                int columnIndexOrThrow4 = A0E.getColumnIndexOrThrow("device");
                int columnIndexOrThrow5 = A0E.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                int columnIndexOrThrow6 = A0E.getColumnIndexOrThrow("raw_string");
                while (A0E.moveToNext()) {
                    long j = A0E.getLong(A022);
                    A0t.put(Long.valueOf(j), A0A(A0E, A032, cls2, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, j));
                }
                A0E.close();
            }
            A032.close();
            for (Object A1G : collection) {
                C18320x8.A1G(A1G, (Object) null, A0t);
            }
            return A0t;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A0E(Cursor cursor) {
        while (cursor.moveToNext()) {
            String A012 = C626135u.A01(cursor, 0);
            if (!TextUtils.isEmpty(A012)) {
                for (String A002 : C18320x8.A1b(A012)) {
                    Jid A003 = AnonymousClass32W.A00(A002);
                    if (A003 != null) {
                        A05(A003);
                    }
                }
            }
        }
    }
}
