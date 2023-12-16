package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2sC  reason: invalid class name and case insensitive filesystem */
public class C56562sC {
    public final C55682qk A00;
    public final AnonymousClass310 A01;
    public final C56612sH A02;
    public final C56922sm A03;
    public final C623334p A04;
    public final C72303dV A05;
    public final C56082rO A06;
    public final C53992o0 A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass2YF A09;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        if ((r5 instanceof X.C95804uY) != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C624134x r26) {
        /*
            r25 = this;
            r9 = 1
            r8 = r26
            r8.A1H(r9)
            r6 = r25
            X.3dV r7 = r6.A05
            X.4Fq r18 = r7.A04()
            X.3Yo r17 = r18.Axl()     // Catch:{ all -> 0x0133 }
            X.34p r0 = r6.A04     // Catch:{ all -> 0x0129 }
            X.2z0 r3 = r8.A1J     // Catch:{ all -> 0x0129 }
            X.4uZ r5 = X.AnonymousClass2z0.A01(r3)     // Catch:{ all -> 0x0129 }
            r0.A05(r5)     // Catch:{ all -> 0x0129 }
            X.2sm r4 = r6.A03     // Catch:{ all -> 0x0129 }
            if (r5 != 0) goto L_0x0022
            goto L_0x0033
        L_0x0022:
            boolean r0 = r8 instanceof X.C30341mI     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x002b
            long r1 = r4.A08(r5)     // Catch:{ all -> 0x0129 }
            goto L_0x0035
        L_0x002b:
            long r1 = r4.A09(r5)     // Catch:{ all -> 0x0129 }
            r4.A0M(r5, r1)     // Catch:{ all -> 0x0129 }
            goto L_0x0035
        L_0x0033:
            r1 = -1
        L_0x0035:
            r15 = 0
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x003c
            r9 = 0
        L_0x003c:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "MainMessageStore/insertMainMessage/Chat row not inserted; chatRowId="
            r4.append(r0)     // Catch:{ all -> 0x0129 }
            r4.append(r1)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = " key="
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r4)     // Catch:{ all -> 0x0129 }
            X.C626936e.A0D(r9, r0)     // Catch:{ all -> 0x0129 }
            X.4Fq r14 = r7.A04()     // Catch:{ SQLException -> 0x011e }
            X.3Yo r13 = r14.Axl()     // Catch:{ all -> 0x0114 }
            android.content.ContentValues r9 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x010a }
            r6.A03(r9, r8)     // Catch:{ all -> 0x010a }
            long r0 = r8.A1L     // Catch:{ all -> 0x010a }
            java.lang.String r10 = "sort_id"
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            java.lang.String r4 = "INSERT_MESSAGE_MAIN_SQL"
            goto L_0x0087
        L_0x006d:
            java.lang.String r2 = "_id"
            long r0 = r8.A1L     // Catch:{ all -> 0x010a }
            X.C18270x1.A0c(r9, r2, r0)     // Catch:{ all -> 0x010a }
            long r0 = r8.A1M     // Catch:{ all -> 0x010a }
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0080
            long r0 = r8.A1L     // Catch:{ all -> 0x010a }
            r8.A1M = r0     // Catch:{ all -> 0x010a }
        L_0x0080:
            long r0 = r8.A1M     // Catch:{ all -> 0x010a }
            X.C18270x1.A0c(r9, r10, r0)     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "INSERT_MESSAGE_MAIN_WITH_ROW_ID_SQL"
        L_0x0087:
            long r0 = r8.A1M     // Catch:{ all -> 0x010a }
            r7 = 1
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x0099
            boolean r0 = r8.A1o()     // Catch:{ all -> 0x010a }
            if (r0 != 0) goto L_0x0099
            boolean r0 = r5 instanceof X.C95804uY     // Catch:{ all -> 0x010a }
            r12 = 0
            if (r0 == 0) goto L_0x009a
        L_0x0099:
            r12 = 1
        L_0x009a:
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x010a }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x010a }
            java.lang.String r2 = "message"
            long r4 = r6.A09(r2, r4, r9)     // Catch:{ all -> 0x010a }
            long r0 = r8.A1L     // Catch:{ all -> 0x010a }
            int r11 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x00b4
            long r1 = r8.A1L     // Catch:{ all -> 0x010a }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1T(r0)
            goto L_0x00ef
        L_0x00b4:
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1W(r0)
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, row_id for inserted message not set."
            X.C626936e.A0D(r1, r0)     // Catch:{ all -> 0x010a }
            r8.A1L = r4     // Catch:{ all -> 0x010a }
            if (r12 != 0) goto L_0x00f4
            r8.A1M = r4     // Catch:{ all -> 0x010a }
            r9.clear()     // Catch:{ SQLException -> 0x00e4 }
            long r0 = r8.A1M     // Catch:{ SQLException -> 0x00e4 }
            X.C18270x1.A0c(r9, r10, r0)     // Catch:{ SQLException -> 0x00e4 }
            java.lang.String r22 = "_id = ?"
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ SQLException -> 0x00e4 }
            long r0 = r8.A1L     // Catch:{ SQLException -> 0x00e4 }
            X.C18260x0.A1X(r4, r0)     // Catch:{ SQLException -> 0x00e4 }
            java.lang.String r23 = "UPDATE_MESSAGE_MAIN_SORT_ID_SQL"
            r19 = r6
            r20 = r9
            r21 = r2
            r24 = r4
            r19.A05(r20, r21, r22, r23, r24)     // Catch:{ SQLException -> 0x00e4 }
            goto L_0x00f4
        L_0x00e4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, failed to update sortId key="
            X.C18260x0.A0k(r3, r0, r1, r2)     // Catch:{ all -> 0x010a }
            throw r2     // Catch:{ all -> 0x010a }
        L_0x00ef:
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2/RowId for inserted message doesn't match."
            X.C626936e.A0D(r1, r0)     // Catch:{ all -> 0x010a }
        L_0x00f4:
            r8.A1H(r7)     // Catch:{ all -> 0x010a }
            r13.A00()     // Catch:{ all -> 0x010a }
            r13.close()     // Catch:{ all -> 0x0114 }
            r14.close()     // Catch:{ SQLException -> 0x011e }
            r17.A00()     // Catch:{ all -> 0x0129 }
            r17.close()     // Catch:{ all -> 0x0133 }
            r18.close()
            return
        L_0x010a:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x010f }
            goto L_0x0113
        L_0x010f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0114 }
        L_0x0113:
            throw r1     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0119 }
            goto L_0x011d
        L_0x0119:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x011e }
        L_0x011d:
            throw r1     // Catch:{ SQLException -> 0x011e }
        L_0x011e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, unknown error key="
            X.C18260x0.A0k(r3, r0, r1, r2)     // Catch:{ all -> 0x0129 }
            throw r2     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x012e }
            goto L_0x0132
        L_0x012e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0133 }
        L_0x0132:
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0138 }
            throw r1
        L_0x0138:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56562sC.A06(X.34x):void");
    }

    public void A07(C624134x r14, boolean z) {
        String[] strArr;
        String str;
        String str2;
        String str3;
        ContentValues contentValues;
        C56862sg r7;
        AnonymousClass2z0 r2;
        Cursor A0E;
        r14.A1H(1);
        C85284Fq A042 = this.A05.A04();
        if (z) {
            try {
                List A19 = r14.A19();
                if (A19 == null || A19.size() <= 0) {
                    contentValues = AnonymousClass0x9.A06();
                    A04(contentValues, r14);
                    str2 = "broadcast = 1 AND from_me = 1 AND key_id = ?";
                    strArr = new String[1];
                    r2 = r14.A1J;
                    r7 = AnonymousClass3H0.A04(String.valueOf(r2.A01), A042, strArr, 0);
                    str3 = "message";
                    str = "UPDATE_MESSAGE_MAIN_BROADCAST_SCAN_SQL";
                } else {
                    ArrayList A0I = AnonymousClass002.A0I(A19.size() + 1);
                    C56922sm r72 = this.A03;
                    r2 = r14.A1J;
                    C18280x3.A1K(A0I, r72.A07(r2.A00));
                    Iterator it = A19.iterator();
                    while (it.hasNext()) {
                        C18280x3.A1K(A0I, r72.A07(C18300x5.A0P(it)));
                    }
                    A0I.add(r2.A01);
                    contentValues = AnonymousClass0x9.A06();
                    A04(contentValues, r14);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("chat_row_id IN ");
                    String A0p = C18310x6.A0p(C57212tH.A00(AnonymousClass0x9.A03(A0I, 1)), A0o);
                    A0o.append("from_me = 1");
                    A0o.append(A0p);
                    str2 = AnonymousClass000.A0X("key_id = ?", A0o);
                    r7 = ((AnonymousClass3H0) A042).A03;
                    str3 = "message";
                    strArr = C18300x5.A1b(A0I);
                    str = "UPDATE_MESSAGE_MAIN_BROADCAST_PARTICIPANTS_SQL";
                }
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            contentValues = AnonymousClass0x9.A06();
            A05(contentValues, r14);
            r2 = r14.A1J;
            strArr = A09(r2);
            r7 = ((AnonymousClass3H0) A042).A03;
            str3 = "message";
            str2 = "chat_row_id = ? AND from_me = ? AND key_id = ?";
            str = "UPDATE_MESSAGE_MAIN_SQL";
        }
        r7.A05(contentValues, str3, str2, str, strArr);
        if (r14.A1L <= 0 && !z) {
            A0E = r7.A0E("SELECT _id FROM message_view WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", "FIND_MESSAGE_MAIN_SQL", A09(r2));
            if (A0E.moveToNext()) {
                r14.A1L = C18270x1.A01(A0E);
            }
            A0E.close();
        }
        A042.close();
        return;
        throw th;
    }

    public C624134x A00(Cursor cursor) {
        String A0Z = AnonymousClass0x2.A0Z(cursor, "key_id");
        boolean A1T = AnonymousClass001.A1T(AnonymousClass0x2.A04(cursor, "from_me"));
        C95814uZ A0B = this.A03.A0B(AnonymousClass0x2.A0C(cursor, "chat_row_id"));
        if (A0B == null) {
            return null;
        }
        return A01(cursor, AnonymousClass2z0.A05(A0B, A0Z, A1T));
    }

    public final void A04(ContentValues contentValues, C624134x r7) {
        C18280x3.A0m(contentValues, r7.A0D);
        C624134x.A0I(contentValues, r7);
        C624134x.A0E(contentValues, r7);
        long j = r7.A0I;
        if (j == 0) {
            j = this.A02.A0H();
        }
        C621833x.A00(contentValues, r7, j);
        C624134x.A0G(contentValues, r7);
        C624134x.A0J(contentValues, r7);
    }

    public final void A05(ContentValues contentValues, C624134x r7) {
        C56922sm r1 = this.A03;
        AnonymousClass2z0 r2 = r7.A1J;
        C56922sm.A00(contentValues, r1, AnonymousClass2z0.A01(r2));
        C621833x.A03(contentValues, "from_me", r2.A02);
        contentValues.put("key_id", r2.A01);
        C18280x3.A0m(contentValues, r7.A0D);
        C621833x.A03(contentValues, "broadcast", r7.A1B);
        C624134x.A0I(contentValues, r7);
        C621833x.A02(contentValues, "participant_hash", r7.A14);
        C624134x.A0E(contentValues, r7);
        long j = r7.A0I;
        if (j == 0) {
            j = this.A02.A0H();
        }
        C621833x.A00(contentValues, r7, j);
        C624134x.A0G(contentValues, r7);
        C624134x.A0J(contentValues, r7);
        if (r7.A0t() != null && (r7.A0t() instanceof C30211m5)) {
            contentValues.put("view_mode", AnonymousClass001.A0f());
        }
    }

    public boolean A08(Set set, boolean z) {
        Object[] array = set.toArray(C58152un.A0M);
        C85284Fq A042 = this.A05.A04();
        try {
            ContentValues A062 = AnonymousClass0x9.A06();
            C71923ct A002 = C71923ct.A00(array);
            int i = 0;
            while (A002.hasNext()) {
                Long[] lArr = (Long[]) A002.next();
                int length = lArr.length;
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = String.valueOf(lArr[i2]);
                }
                C621833x.A03(A062, "starred", z);
                C56862sg r7 = ((AnonymousClass3H0) A042).A03;
                StringBuilder A0o = AnonymousClass001.A0o();
                C57212tH.A02("_id IN ", A0o, length);
                i += r7.A05(A062, "message", A0o.toString(), "UPDATE_MESSAGE_STARRED_BY_ROW_ID_MAIN_SQL", strArr);
            }
            A042.close();
            if (i != set.size()) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "MainMessageStore/updateMessageStarredStatusV2/update failed; rowIds=", set);
            }
            return true;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C56562sC(C55682qk r1, AnonymousClass310 r2, C56612sH r3, C56922sm r4, C623334p r5, C72303dV r6, C56082rO r7, C53992o0 r8, AnonymousClass1VX r9, AnonymousClass2YF r10) {
        this.A02 = r3;
        this.A08 = r9;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A09 = r10;
    }

    public C624134x A01(Cursor cursor, AnonymousClass2z0 r7) {
        Cursor A0E;
        if (cursor.getColumnIndex("table_version") != -1) {
            return A02(cursor, r7);
        }
        this.A00.A0A("MainMessageStore/readMessage/read directly from old table instead of view.", true, (String) null);
        AnonymousClass4GK A032 = this.A05.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E(C58122uk.A03, "GET_MESSAGE_MAIN_BY_KEY_SQL", A09(r7));
            if (A0E.moveToNext()) {
                C624134x A022 = A02(A0E, r7);
                A0E.close();
                A032.close();
                return A022;
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

    /* JADX WARNING: Code restructure failed: missing block: B:366:0x079f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07a3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x07a4, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x07a5, code lost:
        if (r7 != null) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:253:0x0545, B:361:0x0799] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C624134x A02(android.database.Cursor r19, X.AnonymousClass2z0 r20) {
        /*
            r18 = this;
            java.lang.String r0 = "message_type"
            r8 = r19
            int r0 = X.AnonymousClass0x2.A04(r8, r0)
            byte r2 = (byte) r0
            java.lang.String r0 = "timestamp"
            long r5 = X.AnonymousClass0x2.A0C(r8, r0)
            java.lang.String r0 = "status"
            int r1 = X.AnonymousClass0x2.A04(r8, r0)
            r14 = r18
            r10 = r20
            if (r2 != 0) goto L_0x002f
            r0 = 6
            if (r1 == r0) goto L_0x0032
        L_0x0021:
            X.2YF r0 = r14.A09
            X.34x r5 = r0.A00(r10, r2, r5)
        L_0x0027:
            if (r5 == 0) goto L_0x0781
            X.34p r0 = r14.A04
            r5.A1I(r8, r0)
            return r5
        L_0x002f:
            r0 = 7
            if (r2 != r0) goto L_0x0021
        L_0x0032:
            X.2o0 r4 = r14.A07
            long r0 = X.C18270x1.A01(r8)
            X.3dV r9 = r4.A04
            X.4GK r16 = r9.get()
            r2 = r16
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x07df }
            X.2sg r12 = r2.A03     // Catch:{ all -> 0x07df }
            java.lang.String r11 = "SELECT action_type FROM message_system WHERE message_row_id = ?"
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x07df }
            X.C18260x0.A1Y(r7, r0)     // Catch:{ all -> 0x07df }
            java.lang.String r2 = "GET_SYSTEM_MESSAGE"
            android.database.Cursor r12 = r12.A0E(r11, r2, r7)     // Catch:{ all -> 0x07df }
            boolean r2 = r12.moveToFirst()     // Catch:{ all -> 0x07d3 }
            if (r2 != 0) goto L_0x005a
            goto L_0x077b
        L_0x005a:
            java.lang.String r2 = "action_type"
            int r7 = X.AnonymousClass0x2.A04(r12, r2)     // Catch:{ all -> 0x07d3 }
            X.2aD r2 = r4.A09     // Catch:{ all -> 0x07d3 }
            X.1mI r5 = r2.A00(r10, r7, r5)     // Catch:{ all -> 0x07d3 }
            r5.A1H(r3)     // Catch:{ all -> 0x07d3 }
            r5.A1L = r0     // Catch:{ all -> 0x07d3 }
            java.lang.String r7 = "remote_message_from_me"
            java.lang.String r10 = "new_photo_id"
            X.4GK r17 = r9.get()     // Catch:{ all -> 0x07d3 }
            boolean r0 = r5 instanceof X.C31611oZ     // Catch:{ all -> 0x07c9 }
            java.lang.String r9 = "GET_SYSTEM_MESSAGE_VALUE_CHANGE"
            r6 = 0
            if (r0 == 0) goto L_0x00a2
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r0)     // Catch:{ all -> 0x07c9 }
            android.database.Cursor r2 = r2.A0E(r1, r9, r0)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x009f
            r1 = r5
            X.1oZ r1 = (X.C31611oZ) r1     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "old_data"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A01 = r0     // Catch:{ all -> 0x0783 }
        L_0x009f:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x00a2:
            boolean r0 = r5 instanceof X.C31551oT     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x00cc
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r0)     // Catch:{ all -> 0x07c9 }
            android.database.Cursor r2 = r2.A0E(r1, r9, r0)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x00c9
            r1 = r5
            X.1oT r1 = (X.C31551oT) r1     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "old_data"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A00 = r0     // Catch:{ all -> 0x0783 }
        L_0x00c9:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x00cc:
            boolean r0 = r5 instanceof X.C31601oY     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x00f8
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r0)     // Catch:{ all -> 0x07c9 }
            android.database.Cursor r2 = r2.A0E(r1, r9, r0)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "old_data"
            java.lang.String r1 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            if (r1 == 0) goto L_0x00f5
            r0 = r5
            X.1oY r0 = (X.C31601oY) r0     // Catch:{ all -> 0x0783 }
            r0.A00 = r1     // Catch:{ all -> 0x0783 }
        L_0x00f5:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x00f8:
            boolean r0 = r5 instanceof X.C31201nu     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0122
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r0)     // Catch:{ all -> 0x07c9 }
            android.database.Cursor r2 = r2.A0E(r1, r9, r0)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x011f
            r1 = r5
            X.1nu r1 = (X.C31201nu) r1     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "old_data"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A00 = r0     // Catch:{ all -> 0x0783 }
        L_0x011f:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x0122:
            boolean r0 = r5 instanceof X.C31891p1     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0183
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "SELECT is_me_joined FROM message_system_group WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r1)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_GROUP"
            android.database.Cursor r2 = r9.A0E(r2, r0, r1)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x014a
            r1 = r5
            X.1p1 r1 = (X.C31891p1) r1     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "is_me_joined"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A00 = r0     // Catch:{ all -> 0x0783 }
        L_0x014a:
            r2.close()     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "SELECT user_jid_row_id FROM message_system_chat_participant WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r1)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_CHAT_PATRICIPANTS"
            android.database.Cursor r2 = r9.A0E(r2, r0, r1)     // Catch:{ all -> 0x07c9 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0783 }
        L_0x015e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = "user_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x0783 }
            X.34p r11 = r4.A03     // Catch:{ all -> 0x0783 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A02(r11, r0)     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x015e
            r9.add(r0)     // Catch:{ all -> 0x0783 }
            goto L_0x015e
        L_0x0177:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0783 }
            if (r0 != 0) goto L_0x0180
            r5.A1h(r9)     // Catch:{ all -> 0x0783 }
        L_0x0180:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x0183:
            boolean r0 = r5 instanceof X.C31331o7     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x01d0
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "SELECT new_photo_id, old_photo, new_photo FROM message_system_photo_change WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r1)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PHOTO_CHANGE"
            android.database.Cursor r2 = r9.A0E(r2, r0, r1)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x01cd
            r9 = r5
            X.1o7 r9 = (X.C31331o7) r9     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r10)     // Catch:{ all -> 0x0783 }
            r9.A1x(r0)     // Catch:{ all -> 0x0783 }
            com.whatsapp.data.ProfilePhotoChange r1 = new com.whatsapp.data.ProfilePhotoChange     // Catch:{ all -> 0x0783 }
            r1.<init>()     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r10)     // Catch:{ NumberFormatException -> 0x01b9 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01b9 }
            r1.newPhotoId = r0     // Catch:{ NumberFormatException -> 0x01b9 }
        L_0x01b9:
            java.lang.String r0 = "new_photo"
            byte[] r0 = X.C18280x3.A1Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.newPhoto = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "old_photo"
            byte[] r0 = X.C18280x3.A1Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.oldPhoto = r0     // Catch:{ all -> 0x0783 }
            r9.A00 = r1     // Catch:{ all -> 0x0783 }
        L_0x01cd:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x01d0:
            boolean r0 = r5 instanceof X.C31341o8     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x023a
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "SELECT old_jid_row_id, new_jid_row_id FROM message_system_number_change WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r1)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_NUMBER_CHANGE"
            android.database.Cursor r2 = r9.A0E(r2, r0, r1)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x0237
            r10 = r5
            X.1o8 r10 = (X.C31341o8) r10     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "old_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x0783 }
            X.2qk r9 = r4.A00     // Catch:{ all -> 0x0783 }
            r10.A03 = r9     // Catch:{ all -> 0x0783 }
            X.34p r9 = r4.A03     // Catch:{ all -> 0x0783 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A02(r9, r0)     // Catch:{ all -> 0x0783 }
            r11 = 0
            if (r0 == 0) goto L_0x022e
            r10.A01 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "new_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x0783 }
            com.whatsapp.jid.Jid r0 = r9.A08(r0)     // Catch:{ all -> 0x0783 }
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A05(r0)     // Catch:{ all -> 0x0783 }
            boolean r0 = r1 instanceof X.C27981fH     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x0227
            X.2sM r0 = r4.A07     // Catch:{ all -> 0x0783 }
            com.whatsapp.jid.PhoneUserJid r1 = X.C56662sM.A00(r0, r1)     // Catch:{ all -> 0x0783 }
            if (r1 != 0) goto L_0x022a
            java.lang.String r0 = "SystemMessageStore/fillMessageAdditionalTables/LID -> PN mapping unknown"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0783 }
            goto L_0x022e
        L_0x0227:
            if (r1 != 0) goto L_0x022a
            goto L_0x022e
        L_0x022a:
            r10.A1w(r1)     // Catch:{ all -> 0x0783 }
            goto L_0x0237
        L_0x022e:
            r2.close()     // Catch:{ all -> 0x07c9 }
            r17.close()     // Catch:{ all -> 0x07d3 }
            r5 = r11
            goto L_0x0773
        L_0x0237:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x023a:
            boolean r0 = r5 instanceof X.C31351o9     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0341
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "SELECT sender_jid_row_id, receiver_jid_row_id, amount_with_symbol, remote_message_sender_jid_row_id, remote_message_from_me, remote_message_key FROM message_payment WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r1)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PAYMENT"
            android.database.Cursor r2 = r11.A0E(r2, r0, r1)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x02ae
            r10 = r5
            X.1o9 r10 = (X.C31351o9) r10     // Catch:{ all -> 0x0783 }
            X.34p r9 = r4.A03     // Catch:{ all -> 0x0783 }
            java.lang.Class<com.whatsapp.jid.UserJid> r13 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "sender_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x0783 }
            com.whatsapp.jid.UserJid r0 = X.C623334p.A02(r9, r13, r0)     // Catch:{ all -> 0x0783 }
            r10.A01 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "receiver_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x0783 }
            com.whatsapp.jid.UserJid r0 = X.C623334p.A02(r9, r13, r0)     // Catch:{ all -> 0x0783 }
            r10.A00 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "amount_with_symbol"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r10.A03 = r0     // Catch:{ all -> 0x0783 }
            int r0 = r2.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0783 }
            boolean r0 = r2.isNull(r0)     // Catch:{ all -> 0x0783 }
            if (r0 != 0) goto L_0x02ae
            java.lang.Class<X.4uZ> r13 = X.C95814uZ.class
            java.lang.String r0 = "remote_message_sender_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x0783 }
            com.whatsapp.jid.Jid r1 = r9.A0B(r13, r0)     // Catch:{ all -> 0x0783 }
            X.4uZ r1 = (X.C95814uZ) r1     // Catch:{ all -> 0x0783 }
            int r0 = X.AnonymousClass0x2.A04(r2, r7)     // Catch:{ all -> 0x0783 }
            boolean r7 = X.AnonymousClass000.A1U(r0, r3)
            java.lang.String r0 = "remote_message_key"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            X.2z0 r0 = X.AnonymousClass2z0.A05(r1, r0, r7)     // Catch:{ all -> 0x0783 }
            r10.A02 = r0     // Catch:{ all -> 0x0783 }
        L_0x02ae:
            r2.close()     // Catch:{ all -> 0x07c9 }
            boolean r0 = r5 instanceof X.C31681og     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x02f9
            java.lang.String r2 = "SELECT web_stub , amount , transfer_date , payment_sender_name , expiration FROM message_payment_transaction_reminder WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r1)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_TRANSACTION_REMINDER"
            android.database.Cursor r2 = r11.A0E(r2, r0, r1)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x02f6
            r1 = r5
            X.1og r1 = (X.C31681og) r1     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "web_stub"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A02 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "amount"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A01 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "transfer_date"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A04 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "payment_sender_name"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A03 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "expiration"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A00 = r0     // Catch:{ all -> 0x0783 }
        L_0x02f6:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x02f9:
            boolean r0 = r5 instanceof X.C31671of     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0341
            java.lang.String r2 = "SELECT transaction_info, transaction_data, init_timestamp, update_timestamp, amount_data FROM message_payment_status_update WHERE message_row_id  = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r5, r1)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_TRANSACTION_STATUS_UPDATE"
            android.database.Cursor r2 = r11.A0E(r2, r0, r1)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0783 }
            if (r0 == 0) goto L_0x033e
            r1 = r5
            X.1of r1 = (X.C31671of) r1     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "transaction_info"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A03 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "transaction_data"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A01 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "init_timestamp"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A02 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "update_timestamp"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A04 = r0     // Catch:{ all -> 0x0783 }
            java.lang.String r0 = "amount_data"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0783 }
            r1.A00 = r0     // Catch:{ all -> 0x0783 }
        L_0x033e:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x0341:
            boolean r0 = r5 instanceof X.C31291o3     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0374
            r1 = r5
            X.1o3 r1 = (X.C31291o3) r1     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r1, r7)     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "GET_SYSTEM_MESSAGE_DEVICE_CHANGE"
            java.lang.String r0 = "SELECT device_added_count, device_removed_count FROM message_system_device_change WHERE message_row_id = ?"
            android.database.Cursor r2 = r9.A0E(r0, r2, r7)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x0371
            java.lang.String r0 = "device_added_count"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            r1.A00 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "device_removed_count"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            r1.A01 = r0     // Catch:{ all -> 0x07b9 }
        L_0x0371:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x0374:
            boolean r0 = r5 instanceof X.C31211nv     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x039f
            r7 = r5
            X.1nv r7 = (X.C31211nv) r7     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r7, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_INITIAL_PRIVACY_PROVIDER"
            java.lang.String r0 = "SELECT privacy_provider, verified_biz_name, biz_state_id FROM message_system_initial_privacy_provider WHERE message_row_id = ?"
            android.database.Cursor r2 = r9.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x039c
            java.lang.String r0 = "biz_state_id"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            r7.A00 = r0     // Catch:{ all -> 0x07b9 }
        L_0x039c:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x039f:
            boolean r0 = r5 instanceof X.C31241ny     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x03ce
            r7 = r5
            X.1ny r7 = (X.C31241ny) r7     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x07c9 }
            r1 = 1
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r7, r9)     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "GET_SYSTEM_MESSAGE_BLOCK_CONTACT"
            java.lang.String r0 = "SELECT is_blocked FROM message_system_block_contact WHERE message_row_id = ?"
            android.database.Cursor r2 = r10.A0E(r0, r2, r9)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x03cb
            java.lang.String r0 = "is_blocked"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            if (r0 == r3) goto L_0x03c9
            r1 = 0
        L_0x03c9:
            r7.A00 = r1     // Catch:{ all -> 0x07b9 }
        L_0x03cb:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x03ce:
            boolean r0 = r5 instanceof X.C31261o0     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0401
            r1 = r5
            X.1o0 r1 = (X.C31261o0) r1     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r1, r7)     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = "GET_SYSTEM_MESSAGE_BIZ_OPT_OUT"
            java.lang.String r0 = "SELECT biz_opt_out_category , biz_opt_out_action FROM message_system_opt_out WHERE message_row_id = ?"
            android.database.Cursor r2 = r9.A0E(r0, r2, r7)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x03fe
            java.lang.String r0 = "biz_opt_out_category"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            r1.A01 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "biz_opt_out_action"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            r1.A00 = r0     // Catch:{ all -> 0x07b9 }
        L_0x03fe:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x0401:
            boolean r0 = r5 instanceof X.C31251nz     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x042d
            r7 = r5
            X.1nz r7 = (X.C31251nz) r7     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r7, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_EPHEMERAL_SETTING_NOT_APPLIED"
            java.lang.String r0 = "SELECT setting_duration FROM message_system_ephemeral_setting_not_applied WHERE message_row_id = ?"
            android.database.Cursor r2 = r9.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x042a
            java.lang.String r0 = "setting_duration"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            r7.A00 = r0     // Catch:{ all -> 0x07b9 }
        L_0x042a:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x042d:
            boolean r0 = r5 instanceof X.C31271o1     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0461
            r7 = r5
            X.1o1 r7 = (X.C31271o1) r7     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r7, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_BUSINESS_STATE_FOR_MESSAGE_ROW_ID"
            java.lang.String r0 = "SELECT message_row_id, privacy_message_type, business_name FROM message_system_business_state WHERE message_row_id = ?"
            android.database.Cursor r2 = r9.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x045e
            java.lang.String r0 = "privacy_message_type"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            r7.A00 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "business_name"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x07b9 }
            r7.A01 = r0     // Catch:{ all -> 0x07b9 }
        L_0x045e:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x0461:
            boolean r0 = r5 instanceof X.C31301o4     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x04a3
            X.2Fw r0 = r4.A05     // Catch:{ all -> 0x07c9 }
            r7 = r5
            X.1o4 r7 = (X.C31301o4) r7     // Catch:{ all -> 0x07c9 }
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x07c9 }
            X.4GK r11 = r0.get()     // Catch:{ all -> 0x07c9 }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0798 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x0798 }
            java.lang.String r9 = "SELECT service, invite_used FROM message_system_payment_invite_setup WHERE message_row_id =?"
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x0798 }
            X.C624134x.A0X(r7, r2)     // Catch:{ all -> 0x0798 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PAYMENT_INVITE_SETUP"
            android.database.Cursor r2 = r10.A0E(r9, r0, r2)     // Catch:{ all -> 0x0798 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x078c }
            if (r0 == 0) goto L_0x049d
            java.lang.String r0 = "service"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x078c }
            r7.A00 = r0     // Catch:{ all -> 0x078c }
            java.lang.String r0 = "invite_used"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x078c }
            if (r0 == r3) goto L_0x049b
            r1 = 0
        L_0x049b:
            r7.A01 = r1     // Catch:{ all -> 0x078c }
        L_0x049d:
            r2.close()     // Catch:{ all -> 0x0798 }
            r11.close()     // Catch:{ all -> 0x07c9 }
        L_0x04a3:
            boolean r0 = r5 instanceof X.C31541oS     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x04d2
            r9 = r5
            X.1oS r9 = (X.C31541oS) r9     // Catch:{ all -> 0x07c9 }
            X.C162457s7.A0J(r9, r3)     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0Y(r9, r2, r6)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_GROUP_AUTO_RESTRICT"
            java.lang.String r0 = "SELECT threshold FROM message_system_group_auto_restrict WHERE message_row_id = ?"
            android.database.Cursor r2 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x079d }
            if (r0 == 0) goto L_0x04cf
            java.lang.String r0 = "threshold"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x079d }
            r9.A00 = r0     // Catch:{ all -> 0x079d }
        L_0x04cf:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x04d2:
            boolean r0 = r5 instanceof X.C31321o6     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x052b
            r7 = r5
            X.1o6 r7 = (X.C31321o6) r7     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x07c9 }
            r10 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            long r0 = r7.A1L     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x07c9 }
            r9 = 0
            r2[r6] = r0     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_LINKED_GROUP_CALL"
            java.lang.String r0 = "SELECT call_id, is_video_call, call_type FROM message_system_linked_group_call WHERE message_row_id = ?"
            android.database.Cursor r2 = r11.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x0528
            java.lang.String r0 = "call_id"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x07b9 }
            r7.A01 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "is_video_call"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07b9 }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x07b9 }
            if (r0 != 0) goto L_0x0516
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x07b9 }
            if (r0 == r3) goto L_0x0514
            r10 = 0
        L_0x0514:
            r7.A02 = r10     // Catch:{ all -> 0x07b9 }
        L_0x0516:
            java.lang.String r0 = "call_type"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07b9 }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x07b9 }
            if (r0 != 0) goto L_0x0526
            int r9 = r2.getInt(r1)     // Catch:{ all -> 0x07b9 }
        L_0x0526:
            r7.A00 = r9     // Catch:{ all -> 0x07b9 }
        L_0x0528:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x052b:
            boolean r0 = r5 instanceof X.C31571oV     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x057f
            r9 = r5
            X.1oV r9 = (X.C31571oV) r9     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r9, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_MESSAGE_SYSTEM_COMMUNITY_LINK_CHANGED"
            java.lang.String r0 = "SELECT old_group_type, new_group_type, linked_parent_group_jid_row_id FROM message_system_community_link_changed WHERE message_row_id = ?"
            android.database.Cursor r7 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x07a4 }
            if (r0 == 0) goto L_0x057c
            java.lang.String r0 = "old_group_type"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07a4 }
            boolean r0 = r7.isNull(r1)     // Catch:{ all -> 0x07a4 }
            if (r0 == 0) goto L_0x055a
            r0 = 0
            goto L_0x055e
        L_0x055a:
            java.lang.Integer r0 = X.C18300x5.A0a(r7, r1)     // Catch:{ all -> 0x07a4 }
        L_0x055e:
            r9.A02 = r0     // Catch:{ all -> 0x07a4 }
            java.lang.String r0 = "new_group_type"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)     // Catch:{ all -> 0x07a4 }
            r9.A00 = r0     // Catch:{ all -> 0x07a4 }
            java.lang.String r0 = "linked_parent_group_jid_row_id"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)     // Catch:{ all -> 0x07a4 }
            X.34p r2 = r4.A03     // Catch:{ all -> 0x07a4 }
            long r0 = (long) r0     // Catch:{ all -> 0x07a4 }
            com.whatsapp.jid.Jid r0 = r2.A08(r0)     // Catch:{ all -> 0x07a4 }
            X.1fJ r0 = X.AnonymousClass34R.A01(r0)     // Catch:{ all -> 0x07a4 }
            r9.A01 = r0     // Catch:{ all -> 0x07a4 }
        L_0x057c:
            r7.close()     // Catch:{ all -> 0x07c9 }
        L_0x057f:
            boolean r0 = r5 instanceof X.C31561oU     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x05aa
            r9 = r5
            X.1oU r9 = (X.C31561oU) r9     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r9, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_MESSAGE_SYSTEM_GROUP_WITH_PARENT"
            java.lang.String r0 = "SELECT linked_parent_group_name FROM message_system_group_with_parent WHERE message_row_id = ?"
            android.database.Cursor r2 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x05a7
            java.lang.String r0 = "linked_parent_group_name"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x07b9 }
            r9.A00 = r0     // Catch:{ all -> 0x07b9 }
        L_0x05a7:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x05aa:
            boolean r0 = r5 instanceof X.C31581oW     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0619
            r11 = r5
            X.1oW r11 = (X.C31581oW) r11     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r11, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SUBGROUPS_BY_MSG_ROW_ID"
            java.lang.String r0 = "SELECT subgroup_raw_jid, subgroup_subject, parent_group_jid_row_id FROM message_system_sibling_group_link_change WHERE message_row_id = ?"
            android.database.Cursor r9 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            java.util.HashSet r10 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x07ab }
            java.lang.String r0 = "subgroup_raw_jid"
            int r13 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07ab }
            java.lang.String r0 = "subgroup_subject"
            int r7 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07ab }
            java.lang.String r0 = "parent_group_jid_row_id"
            int r2 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07ab }
            r1 = 0
        L_0x05de:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x07ab }
            if (r0 == 0) goto L_0x0603
            java.lang.String r0 = r9.getString(r13)     // Catch:{ all -> 0x07ab }
            X.1fJ r1 = X.AnonymousClass34R.A04(r0)     // Catch:{ all -> 0x07ab }
            java.lang.String r0 = r9.getString(r7)     // Catch:{ all -> 0x07ab }
            X.C52882mC.A00(r1, r0, r10)     // Catch:{ all -> 0x07ab }
            int r0 = r9.getInt(r2)     // Catch:{ all -> 0x07ab }
            X.34p r15 = r4.A03     // Catch:{ all -> 0x07ab }
            long r0 = (long) r0     // Catch:{ all -> 0x07ab }
            com.whatsapp.jid.Jid r0 = r15.A08(r0)     // Catch:{ all -> 0x07ab }
            X.1fJ r1 = X.AnonymousClass34R.A03(r0)     // Catch:{ all -> 0x07ab }
            goto L_0x05de
        L_0x0603:
            r11.A01 = r1     // Catch:{ all -> 0x07ab }
            int r0 = r10.size()     // Catch:{ all -> 0x07ab }
            if (r0 >= 0) goto L_0x060c
            r0 = 0
        L_0x060c:
            r11.A00 = r0     // Catch:{ all -> 0x07ab }
            java.util.Set r0 = r11.A03     // Catch:{ all -> 0x07ab }
            r0.clear()     // Catch:{ all -> 0x07ab }
            r0.addAll(r10)     // Catch:{ all -> 0x07ab }
            r9.close()     // Catch:{ all -> 0x07c9 }
        L_0x0619:
            boolean r0 = r5 instanceof X.C31881p0     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0685
            r13 = r5
            X.1p0 r13 = (X.C31881p0) r13     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r13, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_ALL_GROUP_NODES_BY_MSG_ROW_ID"
            java.lang.String r0 = "SELECT group_jid_row_id, group_subject, group_node_type FROM message_system_with_group_nodes WHERE message_row_id = ?"
            android.database.Cursor r10 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x07b2 }
            java.lang.String r0 = "group_jid_row_id"
            int r9 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07b2 }
            java.lang.String r0 = "group_subject"
            int r7 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07b2 }
            java.lang.String r0 = "group_node_type"
            int r2 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x07b2 }
        L_0x0649:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x07b2 }
            if (r0 == 0) goto L_0x067a
            int r0 = r10.getInt(r9)     // Catch:{ all -> 0x07b2 }
            X.34p r15 = r4.A03     // Catch:{ all -> 0x07b2 }
            long r0 = (long) r0     // Catch:{ all -> 0x07b2 }
            com.whatsapp.jid.Jid r0 = r15.A08(r0)     // Catch:{ all -> 0x07b2 }
            X.1fJ r15 = X.AnonymousClass34R.A01(r0)     // Catch:{ all -> 0x07b2 }
            java.lang.String r1 = r10.getString(r7)     // Catch:{ all -> 0x07b2 }
            int r0 = r10.getInt(r2)     // Catch:{ all -> 0x07b2 }
            if (r15 == 0) goto L_0x066c
            X.C52662lq.A00(r15, r1, r11, r0)     // Catch:{ all -> 0x07b2 }
            goto L_0x0649
        L_0x066c:
            java.lang.String r15 = "SystemMessageStore/fillMessageSystemWithGroupNodes/no jid found"
            X.C626936e.A0D(r6, r15)     // Catch:{ all -> 0x07b2 }
            X.2qk r1 = r4.A00     // Catch:{ all -> 0x07b2 }
            java.lang.String r0 = "wa-community-event"
            r1.A0A(r0, r3, r15)     // Catch:{ all -> 0x07b2 }
            goto L_0x0649
        L_0x067a:
            java.util.List r0 = r13.A00     // Catch:{ all -> 0x07b2 }
            r0.clear()     // Catch:{ all -> 0x07b2 }
            r0.addAll(r11)     // Catch:{ all -> 0x07b2 }
            r10.close()     // Catch:{ all -> 0x07c9 }
        L_0x0685:
            boolean r0 = r5 instanceof X.C31281o2     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x06bc
            r7 = r5
            X.1o2 r7 = (X.C31281o2) r7     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x07c9 }
            r4 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r7, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_CHAT_ASSIGNMENT"
            java.lang.String r0 = "SELECT agent_name, is_unassigned_chat FROM message_system_chat_assignment WHERE message_row_id = ?"
            android.database.Cursor r2 = r9.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x06b9
            java.lang.String r0 = "agent_name"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x07b9 }
            r7.A00 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "is_unassigned_chat"
            int r0 = X.AnonymousClass0x2.A04(r2, r0)     // Catch:{ all -> 0x07b9 }
            if (r0 == r3) goto L_0x06b7
            r4 = 0
        L_0x06b7:
            r7.A01 = r4     // Catch:{ all -> 0x07b9 }
        L_0x06b9:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x06bc:
            boolean r0 = r5 instanceof X.C31311o5     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x06f7
            r4 = r5
            X.1o5 r4 = (X.C31311o5) r4     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r4, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_SCHEDULED_CALL_START"
            java.lang.String r0 = "SELECT creation_message_row_id, call_title, call_timestamp_ms FROM message_system_scheduled_call_start WHERE message_row_id = ?"
            android.database.Cursor r2 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x06f4
            java.lang.String r0 = "creation_message_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x07b9 }
            r4.A01 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "call_timestamp_ms"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x07b9 }
            r4.A00 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "call_title"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x07b9 }
            r4.A02 = r0     // Catch:{ all -> 0x07b9 }
        L_0x06f4:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x06f7:
            boolean r0 = r5 instanceof X.C31231nx     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0738
            r4 = r5
            X.1nx r4 = (X.C31231nx) r4     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r4, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_REMINDER_SETUP"
            java.lang.String r0 = "SELECT original_message_row_id, reminder_content, reminder_timestamp_ms FROM message_system_reminder_setup WHERE message_row_id = ?"
            android.database.Cursor r2 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x0735
            java.lang.String r0 = "original_message_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x07b9 }
            r4.A00 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "reminder_timestamp_ms"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x07b9 }
            r4.A01 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "reminder_content"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x07b9 }
            X.C162457s7.A0J(r0, r6)     // Catch:{ all -> 0x07b9 }
            r4.A02 = r0     // Catch:{ all -> 0x07b9 }
        L_0x0735:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x0738:
            boolean r0 = r5 instanceof X.C31221nw     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x0770
            r4 = r5
            X.1nw r4 = (X.C31221nw) r4     // Catch:{ all -> 0x07c9 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07c9 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x07c9 }
            X.C624134x.A0X(r4, r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_REMINDER_SENT"
            java.lang.String r0 = "SELECT original_message_row_id, original_reminder_content FROM message_system_reminder_sent WHERE message_row_id = ?"
            android.database.Cursor r2 = r7.A0E(r0, r1, r2)     // Catch:{ all -> 0x07c9 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07b9 }
            if (r0 == 0) goto L_0x076d
            java.lang.String r0 = "original_message_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x07b9 }
            r4.A00 = r0     // Catch:{ all -> 0x07b9 }
            java.lang.String r0 = "original_reminder_content"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x07b9 }
            X.C162457s7.A0J(r0, r6)     // Catch:{ all -> 0x07b9 }
            r4.A01 = r0     // Catch:{ all -> 0x07b9 }
        L_0x076d:
            r2.close()     // Catch:{ all -> 0x07c9 }
        L_0x0770:
            r17.close()     // Catch:{ all -> 0x07d3 }
        L_0x0773:
            r12.close()     // Catch:{ all -> 0x07df }
            r16.close()
            goto L_0x0027
        L_0x077b:
            r12.close()     // Catch:{ all -> 0x07df }
            r16.close()
        L_0x0781:
            r0 = 0
            return r0
        L_0x0783:
            r1 = move-exception
            if (r2 == 0) goto L_0x07c8
            r2.close()     // Catch:{ all -> 0x078a }
            goto L_0x07c8
        L_0x078a:
            r0 = move-exception
            goto L_0x07c5
        L_0x078c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0797
            r2.close()     // Catch:{ all -> 0x0793 }
            goto L_0x0797
        L_0x0793:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0798 }
        L_0x0797:
            throw r1     // Catch:{ all -> 0x0798 }
        L_0x0798:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x07c0 }
            goto L_0x07c8
        L_0x079d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x079f }
        L_0x079f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x07c9 }
            throw r0     // Catch:{ all -> 0x07c9 }
        L_0x07a4:
            r1 = move-exception
            if (r7 == 0) goto L_0x07c8
            r7.close()     // Catch:{ all -> 0x07c0 }
            goto L_0x07c8
        L_0x07ab:
            r1 = move-exception
            if (r9 == 0) goto L_0x07c8
            r9.close()     // Catch:{ all -> 0x07c0 }
            goto L_0x07c8
        L_0x07b2:
            r1 = move-exception
            if (r10 == 0) goto L_0x07c8
            r10.close()     // Catch:{ all -> 0x07c0 }
            goto L_0x07c8
        L_0x07b9:
            r1 = move-exception
            if (r2 == 0) goto L_0x07c8
            r2.close()     // Catch:{ all -> 0x07c0 }
            goto L_0x07c8
        L_0x07c0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07c9 }
            goto L_0x07c8
        L_0x07c5:
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07c9 }
        L_0x07c8:
            throw r1     // Catch:{ all -> 0x07c9 }
        L_0x07c9:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x07ce }
            goto L_0x07d2
        L_0x07ce:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07d3 }
        L_0x07d2:
            throw r1     // Catch:{ all -> 0x07d3 }
        L_0x07d3:
            r1 = move-exception
            if (r12 == 0) goto L_0x07de
            r12.close()     // Catch:{ all -> 0x07da }
            goto L_0x07de
        L_0x07da:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07df }
        L_0x07de:
            throw r1     // Catch:{ all -> 0x07df }
        L_0x07df:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x07e4 }
            throw r1
        L_0x07e4:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56562sC.A02(android.database.Cursor, X.2z0):X.34x");
    }

    public void A03(ContentValues contentValues, C624134x r11) {
        long A092;
        long A052;
        int i;
        C624134x.A0G(contentValues, r11);
        C56922sm r3 = this.A03;
        AnonymousClass2z0 r4 = r11.A1J;
        C95814uZ r2 = r4.A00;
        if (r2 == null) {
            A092 = -1;
        } else if (r11 instanceof C30341mI) {
            A092 = r3.A08(r2);
        } else {
            A092 = r3.A09(r2);
            r3.A0M(r2, A092);
        }
        contentValues.put("chat_row_id", Long.valueOf(A092));
        if (r11.A0t() != null && (r11.A0t() instanceof C30211m5)) {
            C18270x1.A0b(contentValues, "view_mode", 1);
        }
        C621833x.A03(contentValues, "from_me", r4.A02);
        String str = r4.A01;
        contentValues.put("key_id", str);
        C95814uZ A0n = r11.A0n();
        if (A0n == null) {
            A052 = 0;
        } else {
            A052 = this.A04.A05(A0n);
        }
        contentValues.put("sender_jid_row_id", Long.valueOf(A052));
        C18280x3.A0m(contentValues, r11.A0D);
        C621833x.A03(contentValues, "broadcast", r11.A1B);
        C624134x.A0I(contentValues, r11);
        C621833x.A02(contentValues, "participant_hash", r11.A14);
        C624134x.A0E(contentValues, r11);
        contentValues.put("received_timestamp", Long.valueOf(r11.A0I));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r11.A0J));
        byte b = r11.A1I;
        contentValues.put("message_type", Byte.valueOf(b));
        C621833x.A02(contentValues, "text_data", r11.A18());
        C621833x.A03(contentValues, "starred", r11.A1F);
        contentValues.put("lookup_tables", Long.valueOf(r11.A0m()));
        C624134x.A0J(contentValues, r11);
        if (r11.A1L > 0) {
            contentValues.put("_id", C624134x.A0A(r11));
        }
        C95814uZ A0n2 = r11.A0n();
        if (A0n2 != null && !(A0n2 instanceof UserJid) && !(A0n2 instanceof AnonymousClass1fS)) {
            if (r2 != null) {
                i = r2.getType();
            } else {
                i = -1;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MainMessageStore/bindMessage/senderJid not a UserJid; key.id=");
            A0o.append(str);
            A0o.append("; key.ChatJidType=");
            A0o.append(i);
            C18260x0.A0x("; msg_type=", A0o, b);
            if (this.A08.A0Y(C58422vE.A02, 6711)) {
                this.A00.A0A("FMessage/SenderJid", true, "SenderJid is not a UserJid");
            }
        }
    }

    public final String[] A09(AnonymousClass2z0 r4) {
        String[] A1a = AnonymousClass0x9.A1a();
        C56922sm.A01(this.A03, AnonymousClass2z0.A01(r4), A1a);
        A1a[1] = AnonymousClass2z0.A08(r4);
        A1a[2] = r4.A01;
        return A1a;
    }
}
