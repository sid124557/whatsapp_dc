package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.3Lu  reason: invalid class name and case insensitive filesystem */
public class C66533Lu implements AnonymousClass485 {
    public static final Pattern A0Q = Pattern.compile("((?<= )|(?= ))");
    public static final int[] A0R = {105, 118, 103, 97, 100, C627136h.A03, 111};
    public Map A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final C49712gy A03;
    public final C64773Ex A04;
    public final AnonymousClass5ZU A05;
    public final C620733j A06;
    public final C50632iV A07;
    public final C56922sm A08;
    public final C56982ss A09;
    public final C66473Lo A0A;
    public final C49482gb A0B;
    public final C623334p A0C;
    public final AnonymousClass2S7 A0D;
    public final C55272q5 A0E;
    public final C72303dV A0F;
    public final C56082rO A0G;
    public final C66273Ks A0H;
    public final AnonymousClass3L1 A0I;
    public final AnonymousClass1VX A0J;
    public final C58392vB A0K;
    public final C50222hp A0L;
    public final AnonymousClass8JP A0M;
    public final C55832qz A0N;
    public final C183538qC A0O;
    public final boolean A0P;

    public C624134x A08(Cursor cursor, int i, int i2) {
        try {
            long j = cursor.getLong(i2);
            C95814uZ A0B2 = this.A08.A0B(cursor.getLong(i));
            if ((A0B2 instanceof C135166kE) || A0B2 == null) {
                C18260x0.A11("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/missing cursor chatjid; rowId=", AnonymousClass001.A0o(), j);
                return null;
            }
            try {
                C624134x A042 = this.A0N.A04(cursor, A0B2);
                if (A042 != null) {
                    return A042;
                }
                C18260x0.A11("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/null message; rowId=", AnonymousClass001.A0o(), j);
                return null;
            } catch (AssertionError | ClassCastException e) {
                Log.e(AnonymousClass000.A0Z("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/bad message; rowId=", AnonymousClass001.A0o(), j), e);
                return null;
            }
        } catch (Exception e2) {
            Log.e("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/failed on cursor", e2);
            return null;
        }
    }

    public final synchronized Map A0H() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass001.A0t();
            Iterator A0j = AnonymousClass0x2.A0j(this.A0O);
            while (A0j.hasNext()) {
                C84914Ef r3 = (C84914Ef) A0j.next();
                String B9v = r3.B9v();
                if (this.A00.containsKey(B9v)) {
                    C626936e.A0D(false, "Namespace already registered");
                }
                this.A00.put(B9v, r3);
            }
        }
        return this.A00;
    }

    public void A0K(C624134x r7) {
        C624134x r1 = r7;
        A06(r1, Collections.emptyMap(), A03(), false);
    }

    public static boolean A01(AnonymousClass0QU r1) {
        if (r1 == null || !r1.A04()) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C624134x r2, boolean z) {
        C95814uZ r1 = r2.A1J.A00;
        if (r1 == null || (r1 instanceof C135166kE) || (r1 instanceof C95804uY) || (r2 instanceof AnonymousClass1nO) || (r2 instanceof C30321mG) || (r2 instanceof C30311mF) || (r2 instanceof C30521ma) || ((!z && (r2 instanceof AnonymousClass1nE)) || (r2 instanceof C30341mI) || (r2 instanceof AnonymousClass1n3) || (r2 instanceof C31991pD) || (r2 instanceof C31931p6) || (r2 instanceof C30711mt))) {
            return true;
        }
        return false;
    }

    public long A03() {
        long A002 = this.A0G.A00("fts_ready", 0);
        long j = 1;
        if (!(A002 == 1 || A002 == 3)) {
            j = 5;
            if (!(A002 == 0 || A002 == 2 || A002 == 5)) {
                C626936e.A0D(false, "Unknown Fts version, using V2");
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        if (r0.isEmpty() != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0401, code lost:
        if ((r1 instanceof android.os.OperationCanceledException) == false) goto L_0x0439;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0262  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A04(X.AnonymousClass0QU r22, X.C56532s8 r23, java.lang.Integer r24) {
        /*
            r21 = this;
            java.lang.String r8 = "fts_done"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r10 = r23
            X.4uZ r0 = r10.A04
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 == 0) goto L_0x02f3
            java.lang.String r0 = "FtsMessageStore/search-with-jid/"
        L_0x0012:
            r1.append(r0)
            java.lang.String r0 = r10.A02()
            int r0 = r0.length()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.33M r7 = X.AnonymousClass33M.A01(r0)
            r6 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            android.util.Pair r5 = X.AnonymousClass0x9.A0C(r1, r0)
            r4 = r21
            boolean r0 = r4.A0N()
            r9 = r24
            if (r0 != 0) goto L_0x004c
            X.8JP r1 = r4.A0M
            java.lang.String r0 = "fts_not_ready"
            X.AnonymousClass5YZ.A01(r1, r9, r0)
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x0045:
            r7.A08(r0)
            r7.A07()
            return r5
        L_0x004c:
            r20 = r22
            boolean r0 = A01(r20)
            java.lang.String r19 = "cancelled"
            java.lang.String r3 = "fts_cancelled"
            if (r0 != 0) goto L_0x02ea
            long r14 = r4.A03()
            java.util.List r0 = r10.A0D
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 == 0) goto L_0x0068
        L_0x0067:
            r2 = 0
        L_0x0068:
            java.lang.String r13 = "FTS_QUERY"
            r11 = 1
            boolean r0 = X.C56532s8.A00(r10)
            if (r2 != 0) goto L_0x008e
            if (r0 != 0) goto L_0x0227
            int r0 = r10.A02
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0227
            X.4uZ r0 = r10.A04
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 != 0) goto L_0x0227
            X.8JP r1 = r4.A0M
            java.lang.String r0 = "fts_empty"
            X.AnonymousClass5YZ.A01(r1, r9, r0)
            java.lang.String r0 = "empty"
            goto L_0x0045
        L_0x008e:
            if (r0 != 0) goto L_0x00bb
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.util.List r0 = r10.A0D
            if (r0 != 0) goto L_0x00a0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
        L_0x00a0:
            java.lang.String r0 = A00(r0, r11)
            r1.append(r0)
            java.lang.String r0 = " ORDER BY message._id DESC"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r0 = r11.toArray(r0)
            android.util.Pair r11 = X.AnonymousClass0x9.A0C(r1, r0)
            java.lang.String r13 = "FTS_QUERY_WITH_LABEL"
            goto L_0x025c
        L_0x00bb:
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x01fa
            X.2S7 r12 = r4.A0D
            java.util.List r1 = r10.A0D
            if (r1 != 0) goto L_0x00c9
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
        L_0x00c9:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r13 = r1.toArray(r0)
            java.lang.String[] r13 = (java.lang.String[]) r13
            int r18 = r1.size()
            java.util.HashSet r17 = X.AnonymousClass002.A0K()
            X.3dV r0 = r12.A03
            X.4GK r16 = r0.get()
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0303 }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x0303 }
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0303 }
            java.lang.String r14 = "SELECT jid_row_id FROM labeled_jid JOIN labels ON labeled_jid.label_id = labels._id WHERE label_name = ?"
            r15.append(r14)     // Catch:{ all -> 0x0303 }
            r1 = 1
        L_0x00ef:
            r0 = r18
            if (r1 >= r0) goto L_0x00fe
            java.lang.String r0 = " INTERSECT "
            r15.append(r0)     // Catch:{ all -> 0x0303 }
            r15.append(r14)     // Catch:{ all -> 0x0303 }
            int r1 = r1 + 1
            goto L_0x00ef
        L_0x00fe:
            java.lang.String r1 = r15.toString()     // Catch:{ all -> 0x0303 }
            java.lang.String r0 = "ASSEMBLE_MULTIPLE_SEARCH_LABELED_JID"
            android.database.Cursor r11 = r11.A0E(r1, r0, r13)     // Catch:{ all -> 0x0303 }
            java.lang.String r0 = "jid_row_id"
            int r13 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02f7 }
        L_0x010e:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x02f7 }
            if (r0 == 0) goto L_0x012a
            long r0 = r11.getLong(r13)     // Catch:{ all -> 0x02f7 }
            X.34p r15 = r12.A01     // Catch:{ all -> 0x02f7 }
            java.lang.Class<X.4uZ> r14 = X.C95814uZ.class
            com.whatsapp.jid.Jid r1 = r15.A0B(r14, r0)     // Catch:{ all -> 0x02f7 }
            X.4uZ r1 = (X.C95814uZ) r1     // Catch:{ all -> 0x02f7 }
            if (r1 == 0) goto L_0x010e
            r0 = r17
            r0.add(r1)     // Catch:{ all -> 0x02f7 }
            goto L_0x010e
        L_0x012a:
            r11.close()     // Catch:{ all -> 0x0303 }
            r16.close()
            java.util.HashSet r15 = X.C18310x6.A0r(r17)
            java.util.Iterator r11 = r17.iterator()
        L_0x0138:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x014c
            X.4uZ r1 = X.C18300x5.A0P(r11)
            X.2sm r0 = r4.A08
            long r0 = r0.A07(r1)
            X.AnonymousClass0x2.A1Q(r15, r0)
            goto L_0x0138
        L_0x014c:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.List r0 = r10.A0D
            if (r0 != 0) goto L_0x0158
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
        L_0x0158:
            java.lang.String r12 = A00(r0, r11)
            boolean r0 = X.C56532s8.A00(r10)
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = r10.A02()
            java.lang.String r1 = r4.A0F(r0)
        L_0x016a:
            X.C626936e.A06(r1)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0l(r12)
            java.lang.String r0 = " JOIN messages_fts ON docid = message._id WHERE messages_fts.content MATCH ?"
            java.lang.String r12 = X.AnonymousClass000.A0X(r0, r12)
            r11.add(r1)
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x01e3
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0l(r12)
            java.lang.String r0 = " UNION "
            r13.append(r0)
            java.lang.StringBuilder r12 = X.AnonymousClass0x2.A0h()
            java.lang.String r0 = X.AnonymousClass2C5.A01
            X.AnonymousClass0x2.A1O(r12, r0)
            java.lang.String r0 = "available_message_view AS message JOIN messages_fts AS messages_fts ON messages_fts.docid = message.sort_id"
            r12.append(r0)
            java.lang.String r0 = " WHERE content MATCH ?"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r12)
            r11.add(r1)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = " AND chat_row_id in ("
            java.lang.StringBuilder r14 = X.C18290x4.A0w(r0, r12)
            java.util.Iterator r0 = r15.iterator()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x01d7
            java.util.Iterator r16 = r15.iterator()
            r15 = 1
        L_0x01b9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r1 = r16.next()
            if (r1 == 0) goto L_0x01b9
            if (r15 == 0) goto L_0x01d1
            r15 = 0
        L_0x01c8:
            java.lang.String r0 = "?"
            r14.append(r0)
            X.C18320x8.A1I(r1, r11)
            goto L_0x01b9
        L_0x01d1:
            X.AnonymousClass001.A1M(r14)
            goto L_0x01c8
        L_0x01d5:
            r1 = 0
            goto L_0x016a
        L_0x01d7:
            X.AnonymousClass000.A1B(r14, r12)
            java.lang.String r0 = ")"
            X.C18270x1.A1C(r0, r12, r13)
            java.lang.String r12 = r13.toString()
        L_0x01e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r12)
            java.lang.String r0 = " ORDER BY message._id DESC"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r0 = r11.toArray(r0)
            android.util.Pair r11 = X.AnonymousClass0x9.A0C(r1, r0)
            java.lang.String r13 = "FTS_DEPRECATED_QUERY_WITH_LABEL"
            goto L_0x025c
        L_0x01fa:
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()
            r0 = r20
            java.lang.String r0 = r4.A0A(r0, r10, r9)
            r1[r6] = r0
            X.1VX r0 = r4.A0J
            boolean r0 = X.C56952sp.A0H(r0)
            if (r0 == 0) goto L_0x02e6
            java.lang.String r0 = X.AnonymousClass2CD.A07
        L_0x0210:
            java.lang.StringBuilder r11 = X.C18330xA.A0A(r0)
            X.2sr r0 = r4.A02
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x02e2
            java.lang.String r0 = " ORDER BY timestamp DESC"
        L_0x021e:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r11)
            android.util.Pair r11 = X.AnonymousClass0x9.A0C(r0, r1)
            goto L_0x025c
        L_0x0227:
            X.4uZ r0 = r10.A04
            boolean r1 = X.AnonymousClass000.A1W(r0)
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0292
            if (r0 != 0) goto L_0x01fa
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass2CD.A05
            r1.append(r0)
            java.lang.String r0 = " ORDER BY docid DESC"
            java.lang.String r11 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()
            boolean r0 = X.C56532s8.A00(r10)
            if (r0 == 0) goto L_0x0290
            java.lang.String r0 = r10.A02()
            java.lang.String r0 = r4.A0F(r0)
        L_0x0254:
            r1[r6] = r0
            android.util.Pair r11 = X.AnonymousClass0x9.A0C(r11, r1)
            java.lang.String r13 = "FTS_DEPRECATED_QUERY"
        L_0x025c:
            boolean r0 = A01(r20)
            if (r0 != 0) goto L_0x02ea
            java.lang.Object r1 = r11.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r14 = r11.second
            java.lang.String[] r14 = (java.lang.String[]) r14
            java.lang.String r0 = "compiled"
            r7.A08(r0)
            X.8JP r11 = r4.A0M
            X.AnonymousClass5YZ.A01(r11, r9, r0)
            boolean r0 = r1.isEmpty()
            r12 = 1
            r15 = r0 ^ 1
            java.lang.String r0 = "FtsMessageStore/search/sql empty"
            X.C626936e.A0D(r15, r0)
            int r0 = r10.A01
            if (r0 != 0) goto L_0x0285
            r12 = 0
        L_0x0285:
            java.lang.String r0 = "FtsMessageStore/refusing to query unbounded search"
            X.C626936e.A0D(r12, r0)
            int r15 = r10.A01
            int r0 = r10.A00
            int r15 = r15 * r0
            goto L_0x0308
        L_0x0290:
            r0 = 0
            goto L_0x0254
        L_0x0292:
            if (r0 != 0) goto L_0x01fa
            boolean r0 = X.C56532s8.A00(r10)
            if (r0 != 0) goto L_0x029f
            java.lang.String r0 = "no jid v1"
            goto L_0x0045
        L_0x029f:
            X.4uZ r0 = r10.A04
            r13 = 1
            boolean r0 = X.AnonymousClass000.A1W(r0)
            X.C626936e.A0C(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass2CD.A04
            X.C18320x8.A1L(r1, r0)
            java.lang.String r0 = "_id"
            r1.append(r0)
            java.lang.String r0 = " DESC"
            java.lang.String r12 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String[] r11 = X.AnonymousClass0x9.A1Z()
            boolean r0 = X.C56532s8.A00(r10)
            if (r0 == 0) goto L_0x02e0
            java.lang.String r0 = r10.A02()
            java.lang.String r0 = r4.A0F(r0)
        L_0x02cf:
            r11[r6] = r0
            X.2sm r1 = r4.A08
            X.4uZ r0 = r10.A04
            X.C56922sm.A02(r1, r0, r11, r13)
            android.util.Pair r11 = X.AnonymousClass0x9.A0C(r12, r11)
            java.lang.String r13 = "FTS_DEPRECATED_QUERY_WITH_JID"
            goto L_0x025c
        L_0x02e0:
            r0 = 0
            goto L_0x02cf
        L_0x02e2:
            java.lang.String r0 = " ORDER BY docid DESC"
            goto L_0x021e
        L_0x02e6:
            java.lang.String r0 = X.AnonymousClass2CD.A06
            goto L_0x0210
        L_0x02ea:
            X.8JP r0 = r4.A0M
            X.AnonymousClass5YZ.A01(r0, r9, r3)
            r0 = r19
            goto L_0x0045
        L_0x02f3:
            java.lang.String r0 = "FtsMessageStore/search/"
            goto L_0x0012
        L_0x02f7:
            r1 = move-exception
            if (r11 == 0) goto L_0x0302
            r11.close()     // Catch:{ all -> 0x02fe }
            goto L_0x0302
        L_0x02fe:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0303 }
        L_0x0302:
            throw r1     // Catch:{ all -> 0x0303 }
        L_0x0303:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0435 }
            throw r1
        L_0x0308:
            X.3dV r0 = r4.A0F     // Catch:{ SQLiteDatabaseCorruptException -> 0x03f4, 0nr -> 0x0403, SQLiteException -> 0x03ac, Exception -> 0x03fe }
            X.4GK r16 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x03f4, 0nr -> 0x0403, SQLiteException -> 0x03ac, Exception -> 0x03fe }
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x03a2 }
            X.2sg r12 = r0.A03     // Catch:{ all -> 0x03a2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)     // Catch:{ all -> 0x03a2 }
            java.lang.String r0 = "  LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x03a2 }
            int r0 = r10.A01     // Catch:{ all -> 0x03a2 }
            r1.append(r0)     // Catch:{ all -> 0x03a2 }
            java.lang.String r0 = " OFFSET "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r15)     // Catch:{ all -> 0x03a2 }
            r0 = r20
            android.database.Cursor r10 = r12.A0D(r0, r1, r13, r14)     // Catch:{ all -> 0x03a2 }
        L_0x032e:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x0391
            boolean r0 = A01(r20)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x0352
            X.AnonymousClass5YZ.A01(r11, r9, r3)     // Catch:{ all -> 0x0398 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0398 }
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x0398 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0398 }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r1, r0)     // Catch:{ all -> 0x0398 }
            r0 = r19
            r7.A08(r0)     // Catch:{ all -> 0x0398 }
            r7.A07()     // Catch:{ all -> 0x0398 }
            goto L_0x038a
        L_0x0352:
            X.2qz r0 = r4.A0N     // Catch:{ all -> 0x0398 }
            X.34x r12 = r0.A03(r10)     // Catch:{ all -> 0x0398 }
            int r6 = r6 + 1
            if (r12 == 0) goto L_0x032e
            int r0 = r12.A0j()     // Catch:{ all -> 0x0398 }
            r13 = 1
            if (r0 == r13) goto L_0x036e
            X.2gb r0 = r4.A0B     // Catch:{ all -> 0x0398 }
            long r0 = r0.A00     // Catch:{ all -> 0x0398 }
            boolean r0 = X.C627636p.A0u(r12, r0)     // Catch:{ all -> 0x0398 }
            if (r0 == 0) goto L_0x036e
            r13 = 0
        L_0x036e:
            if (r13 == 0) goto L_0x032e
            X.2ss r1 = r4.A09     // Catch:{ all -> 0x0398 }
            X.2z0 r0 = r12.A1J     // Catch:{ all -> 0x0398 }
            X.4uZ r0 = r0.A00     // Catch:{ all -> 0x0398 }
            boolean r0 = r1.A0P(r0)     // Catch:{ all -> 0x0398 }
            if (r0 != 0) goto L_0x032e
            boolean r0 = A02(r12, r2)     // Catch:{ all -> 0x0398 }
            if (r0 != 0) goto L_0x032e
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x0398 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0398 }
            r0.add(r12)     // Catch:{ all -> 0x0398 }
            goto L_0x032e
        L_0x038a:
            r10.close()     // Catch:{ all -> 0x03a2 }
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x03f4, 0nr -> 0x0403, SQLiteException -> 0x03ac, Exception -> 0x03fe }
            return r1
        L_0x0391:
            r10.close()     // Catch:{ all -> 0x03a2 }
            r16.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x03f4, 0nr -> 0x0403, SQLiteException -> 0x03ac, Exception -> 0x03fe }
            goto L_0x0403
        L_0x0398:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x039d }
            goto L_0x03a1
        L_0x039d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03a2 }
        L_0x03a1:
            throw r1     // Catch:{ all -> 0x03a2 }
        L_0x03a2:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x03a7 }
            goto L_0x03ab
        L_0x03a7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x03f4, 0nr -> 0x0403, SQLiteException -> 0x03ac, Exception -> 0x03fe }
        L_0x03ab:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x03f4, 0nr -> 0x0403, SQLiteException -> 0x03ac, Exception -> 0x03fe }
        L_0x03ac:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x03de
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "FTS expression tree is too large"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x03de
            java.lang.String r0 = "FtsMessageStore/search/error/query-too-large"
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.String r0 = "fts_query_too_large"
            X.AnonymousClass5YZ.A01(r11, r9, r0)
            r0 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.second
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r1, r0)
            java.lang.String r0 = "query-too-large"
        L_0x03d7:
            r7.A08(r0)
            r7.A07()
            return r1
        L_0x03de:
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r2)
            X.AnonymousClass5YZ.A01(r11, r9, r8)
            r0 = -3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.second
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r1, r0)
            java.lang.String r0 = "error"
            goto L_0x03d7
        L_0x03f4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r4.A0E
            r0.A04()
            goto L_0x0403
        L_0x03fe:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 == 0) goto L_0x0439
        L_0x0403:
            X.AnonymousClass5YZ.A01(r11, r9, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "found: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "|:"
            r1.append(r0)
            java.lang.Object r0 = r5.second
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.String r2 = X.AnonymousClass000.A0h(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r5.second
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            r7.A08(r2)
            r7.A07()
            return r0
        L_0x0435:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0439:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66533Lu.A04(X.0QU, X.2s8, java.lang.Integer):android.util.Pair");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|6|7|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        r3 = new X.C58592vV(1, ((X.AnonymousClass3H0) r7).A03.A09("messages_fts", "INSERT_FTS_DEPRECATED_MESSAGE", r9), r3.A01);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C58592vV A05(X.C58592vV r17, java.lang.String r18) {
        /*
            r16 = this;
            r3 = r17
            java.lang.String r6 = "docid"
            r0 = r16
            X.3dV r0 = r0.A0F
            X.4Fq r7 = r0.A04()
            android.content.ContentValues r9 = X.C18280x3.A09()     // Catch:{ all -> 0x004f }
            long r0 = r3.A02     // Catch:{ all -> 0x004f }
            X.C18270x1.A0c(r9, r6, r0)     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "content"
            r4 = r18
            r9.put(r2, r4)     // Catch:{ all -> 0x004f }
            r2 = r7
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ SQLiteConstraintException -> 0x0033 }
            X.2sg r5 = r2.A03     // Catch:{ SQLiteConstraintException -> 0x0033 }
            java.lang.String r4 = "messages_fts"
            java.lang.String r2 = "INSERT_FTS_DEPRECATED_MESSAGE"
            long r12 = r5.A09(r4, r2, r9)     // Catch:{ SQLiteConstraintException -> 0x0033 }
            long r14 = r3.A01     // Catch:{ SQLiteConstraintException -> 0x0033 }
            r11 = 1
            X.2vV r10 = new X.2vV     // Catch:{ SQLiteConstraintException -> 0x0033 }
            r10.<init>(r11, r12, r14)     // Catch:{ SQLiteConstraintException -> 0x0033 }
            goto L_0x004a
        L_0x0033:
            r9.remove(r6)     // Catch:{ all -> 0x004f }
            r2 = r7
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x004f }
            X.2sg r8 = r2.A03     // Catch:{ all -> 0x004f }
            java.lang.String r10 = "messages_fts"
            java.lang.String r11 = "docid = ?"
            java.lang.String[] r13 = X.C18260x0.A1b(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r12 = "UPDATE_FTS_DEPRECATED_MESSAGE"
            r8.A05(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x004f }
            goto L_0x004b
        L_0x004a:
            r3 = r10
        L_0x004b:
            r7.close()
            return r3
        L_0x004f:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0054 }
            throw r1
        L_0x0054:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66533Lu.A05(X.2vV, java.lang.String):X.2vV");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:9|(2:11|(1:23)(1:15))|16|(1:(1:19)(1:21))(1:22)|20|24|25|26|27|28|29|30|32|(1:47)(2:36|37)) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        r11 = new X.C58592vV(1, ((X.AnonymousClass3H0) r9).A03.A09("message_ftsv2", "INSERT_FTS_MESSAGE", r13), r13.A01);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00c7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C58592vV A06(X.C624134x r22, java.util.Map r23, long r24, boolean r26) {
        /*
            r21 = this;
            r2 = r21
            if (r26 != 0) goto L_0x0010
            boolean r0 = r2.A0N()
            if (r0 != 0) goto L_0x0010
            r0 = -5
        L_0x000b:
            X.2vV r11 = X.C58592vV.A00(r0)
        L_0x000f:
            return r11
        L_0x0010:
            r3 = r22
            X.2z0 r7 = r3.A1J
            X.4uZ r9 = r7.A00
            r0 = 0
            boolean r0 = A02(r3, r0)
            if (r0 == 0) goto L_0x001f
            r0 = -6
            goto L_0x000b
        L_0x001f:
            java.lang.String r4 = r2.A0D(r3)
            long r0 = r3.A1M
            r5 = r23
            java.lang.Object r1 = X.C18280x3.A0W(r5, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x004b
            int r1 = r4.length()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L_0x007f
            java.util.regex.Pattern r0 = X.AnonymousClass2BP.A00
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.find()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007f
            X.33j r0 = r2.A06
            java.lang.String r1 = X.C107155an.A01(r0, r4)
        L_0x004b:
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass32Y.A07(r3)
            java.lang.String r8 = r2.A0E(r3)
            long r5 = r3.A1M
            long r3 = r3.A1L
            r14 = 1
            X.2vV r0 = new X.2vV
            r11 = r0
            r13 = r0
            r15 = r5
            r17 = r3
            r13.<init>(r14, r15, r17)
            boolean r3 = r7.A02
            java.lang.String r7 = "docid"
            if (r10 != 0) goto L_0x007a
            if (r3 == 0) goto L_0x0077
            java.lang.String r4 = "1"
        L_0x006c:
            java.lang.String r6 = r2.A0C(r9)
            X.3dV r3 = r2.A0F
            X.4Fq r9 = r3.A04()
            goto L_0x008b
        L_0x0077:
            java.lang.String r4 = "0"
            goto L_0x006c
        L_0x007a:
            java.lang.String r4 = r2.A0C(r10)
            goto L_0x006c
        L_0x007f:
            X.2gy r1 = r2.A03
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r0 = new com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob
            r0.<init>(r3)
            r1.A02(r0)
            r1 = r4
            goto L_0x004b
        L_0x008b:
            android.content.ContentValues r13 = X.C18300x5.A06()     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = "content"
            r13.put(r3, r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = "fts_jid"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r4)     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = " "
            java.lang.String r3 = X.AnonymousClass000.A0V(r3, r6, r4)     // Catch:{ all -> 0x00f3 }
            r13.put(r5, r3)     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = "fts_namespace"
            r13.put(r3, r8)     // Catch:{ all -> 0x00f3 }
            long r3 = r0.A02     // Catch:{ all -> 0x00f3 }
            X.C18270x1.A0c(r13, r7, r3)     // Catch:{ all -> 0x00f3 }
            r5 = r9
            X.3H0 r5 = (X.AnonymousClass3H0) r5     // Catch:{ SQLiteConstraintException -> 0x00c7 }
            X.2sg r8 = r5.A03     // Catch:{ SQLiteConstraintException -> 0x00c7 }
            java.lang.String r6 = "message_ftsv2"
            java.lang.String r5 = "INSERT_FTS_MESSAGE"
            long r17 = r8.A09(r6, r5, r13)     // Catch:{ SQLiteConstraintException -> 0x00c7 }
            long r5 = r0.A01     // Catch:{ SQLiteConstraintException -> 0x00c7 }
            X.2vV r15 = new X.2vV     // Catch:{ SQLiteConstraintException -> 0x00c7 }
            r19 = r5
            r16 = r14
            r15.<init>(r16, r17, r19)     // Catch:{ SQLiteConstraintException -> 0x00c7 }
            goto L_0x00de
        L_0x00c7:
            r13.remove(r7)     // Catch:{ all -> 0x00f3 }
            r5 = r9
            X.3H0 r5 = (X.AnonymousClass3H0) r5     // Catch:{ all -> 0x00f3 }
            X.2sg r12 = r5.A03     // Catch:{ all -> 0x00f3 }
            java.lang.String r14 = "message_ftsv2"
            java.lang.String r15 = "docid = ?"
            java.lang.String[] r17 = X.C18260x0.A1b(r3)     // Catch:{ all -> 0x00f3 }
            java.lang.String r16 = "UPDATE_FTS_MESSAGE"
            r12.A05(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00f3 }
            goto L_0x00df
        L_0x00de:
            r11 = r15
        L_0x00df:
            r9.close()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x000f
            r4 = 1
            int r3 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x000f
            X.2vV r11 = r2.A05(r0, r1)
            return r11
        L_0x00f3:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00f8 }
            throw r1
        L_0x00f8:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66533Lu.A06(X.34x, java.util.Map, long, boolean):X.2vV");
    }

    public final C58592vV A07(String str, String str2, String[] strArr) {
        int i;
        Cursor A032;
        try {
            AnonymousClass4GK A033 = this.A0F.get();
            try {
                A032 = C56862sg.A03(A033, str, str2, strArr);
                if (A032.moveToNext()) {
                    C58592vV r4 = new C58592vV(1, AnonymousClass0x2.A0C(A032, "docid"), C18270x1.A01(A032));
                    A032.close();
                    A033.close();
                    return r4;
                }
                A032.close();
                A033.close();
                i = -4;
                return C58592vV.A00(i);
            } catch (Throwable th) {
                A033.close();
                throw th;
            }
            throw th;
        } catch (SQLiteException e) {
            if (e.getMessage() == null || !e.getMessage().contains("FTS expression tree is too large")) {
                C18260x0.A0u("FtsMessageStore/getRowIdForJidSearch/error/", str2, AnonymousClass001.A0o(), e);
                i = -3;
            } else {
                C18260x0.A0u("FtsMessageStore/getRowIdForJidSearch/too-large/", str2, AnonymousClass001.A0o(), e);
                i = -2;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public C56532s8 A09(C95814uZ r4) {
        C56532s8 r2 = new C56532s8(this.A06);
        r2.A04 = r4;
        if (C627336j.A0K(r4)) {
            List singletonList = Collections.singletonList(new AnonymousClass3FB());
            if (r2.A0B != null) {
                Log.e("FtsQuery/cannot re-set contactPreFilter");
                return r2;
            }
            r2.A0B = singletonList;
            return r2;
        }
        r2.A0C = Collections.emptyList();
        return r2;
    }

    public String A0C(C95814uZ r5) {
        return Long.toString(this.A0C.A05(r5) + 10, 36);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019b, code lost:
        if (r2 != 1) goto L_0x01ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0D(X.C624134x r10) {
        /*
            r9 = this;
            java.lang.String r8 = ""
            boolean r0 = r10 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x008e
            X.2hp r0 = r9.A0L
            X.4DV r10 = (X.AnonymousClass4DV) r10
            X.315 r1 = r0.A01(r10)
            if (r1 == 0) goto L_0x0367
            boolean r0 = r1 instanceof X.C32021pQ
            if (r0 == 0) goto L_0x006a
            X.39W r6 = r1.A02
            r5 = 0
            X.39S r0 = r6.A01
            if (r0 == 0) goto L_0x0067
            X.39H r0 = r0.A07
            java.util.List r0 = r0.A09
            X.33j r7 = r1.A00
            r2 = 2131887771(0x7f12069b, float:1.9410158E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            int r0 = r0.size()
            X.AnonymousClass000.A1L(r1, r0)
            java.lang.String r4 = r7.A0E(r2, r1)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            X.39S r0 = r6.A01
            if (r0 == 0) goto L_0x0043
            X.39H r0 = r0.A07
            if (r0 == 0) goto L_0x0043
            java.lang.String r5 = r0.A01()
        L_0x0043:
            java.lang.String r2 = " "
            X.AnonymousClass315.A02(r5, r2, r3)
            X.39S r1 = r6.A01
            if (r1 == 0) goto L_0x005b
            X.4Fi r0 = r1.A06
            if (r0 == 0) goto L_0x005b
            X.39G r0 = r1.A09
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r1.A05(r7)
            X.AnonymousClass315.A02(r0, r2, r3)
        L_0x005b:
            X.AnonymousClass315.A02(r4, r2, r3)
            java.lang.String r0 = r6.A08
            X.C32021pQ.A00(r6, r0, r2, r3)
            java.lang.String r5 = X.C18290x4.A0o(r3)
        L_0x0067:
            if (r5 == 0) goto L_0x0367
            return r5
        L_0x006a:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r1.A08()
            java.lang.String r2 = " "
            X.AnonymousClass315.A02(r0, r2, r3)
            X.39W r1 = r1.A02
            X.39A r0 = r1.A02
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r0.A00
        L_0x007f:
            X.AnonymousClass315.A02(r0, r2, r3)
            java.lang.String r0 = r1.A08
            X.C32021pQ.A00(r1, r0, r2, r3)
            java.lang.String r5 = r3.toString()
            goto L_0x0067
        L_0x008c:
            r0 = 0
            goto L_0x007f
        L_0x008e:
            boolean r0 = r10 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x0099
            X.4FG r10 = (X.AnonymousClass4FG) r10
            java.lang.String r5 = r10.B7t()
            goto L_0x0067
        L_0x0099:
            boolean r0 = r10 instanceof X.C30481mW
            r1 = 8
            java.lang.String r3 = " "
            if (r0 == 0) goto L_0x0154
            X.1mW r10 = (X.C30481mW) r10
            boolean r0 = r10.A1r(r1)
            java.lang.String r5 = r10.A13()
            if (r0 == 0) goto L_0x00d1
            X.2Ot r0 = X.C40802Hu.A01(r10)
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x00cc
            r1 = r8
        L_0x00b6:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00c0
            java.lang.String r1 = X.C18260x0.A06(r5, r3, r1)
        L_0x00c0:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r1 = X.C18260x0.A06(r1, r3, r2)
        L_0x00ca:
            r5 = r1
            goto L_0x0067
        L_0x00cc:
            java.lang.String r1 = r0.A00
            java.lang.String r2 = r0.A01
            goto L_0x00b6
        L_0x00d1:
            java.lang.String r0 = r10.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r5, r3)
            java.lang.String r0 = r10.A06
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00e3:
            java.lang.String r0 = r10.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r5, r3)
            java.lang.String r0 = r10.A04
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00f5:
            java.lang.String r0 = r10.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0107
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r5, r3)
            java.lang.String r0 = r10.A07
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0107:
            X.34w r1 = r10.A0P
            if (r1 == 0) goto L_0x0067
            X.39Q r0 = r1.A08
            if (r0 == 0) goto L_0x0067
            java.math.BigDecimal r7 = r0.A00
            java.lang.String r1 = r1.A0I
            if (r7 == 0) goto L_0x0141
            java.lang.String r0 = r7.toPlainString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0141
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0141
            java.lang.String r6 = r7.toPlainString()
            X.7ny r4 = new X.7ny     // Catch:{ IllegalArgumentException -> 0x0143 }
            r4.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0143 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r6, r3)     // Catch:{ IllegalArgumentException -> 0x0143 }
            X.33j r1 = r9.A06     // Catch:{ IllegalArgumentException -> 0x0143 }
            r0 = 1
            java.lang.String r0 = r4.A04(r1, r7, r0)     // Catch:{ IllegalArgumentException -> 0x0143 }
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x0143 }
            java.lang.String r6 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0143 }
            goto L_0x0148
        L_0x0141:
            r6 = 0
            goto L_0x0148
        L_0x0143:
            java.lang.String r0 = "FtsMessageStore/formatAmount/currencyParseError"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0148:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0067
            java.lang.String r5 = X.C18260x0.A06(r5, r3, r6)
            goto L_0x0067
        L_0x0154:
            boolean r0 = r10 instanceof X.C30341mI
            if (r0 == 0) goto L_0x01b2
            X.1mI r10 = (X.C30341mI) r10
            boolean r0 = X.C624134x.A0a(r10)
            if (r0 == 0) goto L_0x01ad
            r5 = r8
        L_0x0161:
            boolean r0 = r10 instanceof X.C31341o8
            if (r0 == 0) goto L_0x0174
            r0 = r10
            X.1o8 r0 = (X.C31341o8) r0
            com.whatsapp.jid.UserJid r1 = r0.A01
            if (r1 == 0) goto L_0x0174
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r5)
            java.lang.String r5 = X.C18260x0.A03(r1, r3, r0)
        L_0x0174:
            boolean r0 = r10 instanceof X.C31201nu
            if (r0 == 0) goto L_0x0067
            r4 = r10
            X.1nu r4 = (X.C31201nu) r4
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0067
            X.2z0 r0 = r10.A1J
            X.4uZ r1 = r0.A00
            if (r1 == 0) goto L_0x0067
            X.3Ex r0 = r9.A04
            X.3ZH r1 = r0.A0A(r1)
            boolean r0 = r1.A0R()
            if (r0 == 0) goto L_0x01ab
            int r2 = r1.A08
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x019d
            if (r2 != r0) goto L_0x01ab
        L_0x019d:
            if (r0 != 0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r5, r3)
            java.lang.String r0 = r4.A00
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0067
        L_0x01ab:
            r0 = 0
            goto L_0x019d
        L_0x01ad:
            java.lang.String r5 = r10.A13()
            goto L_0x0161
        L_0x01b2:
            boolean r0 = r10 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x02bc
            boolean r0 = r10 instanceof X.C31981pC
            if (r0 != 0) goto L_0x02bc
            boolean r0 = r10 instanceof X.C30801n8
            if (r0 == 0) goto L_0x01c4
            X.1n8 r10 = (X.C30801n8) r10
            java.lang.String r5 = r10.A03
            goto L_0x0067
        L_0x01c4:
            boolean r0 = r10 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r10.A1r(r1)
            if (r0 != 0) goto L_0x033f
            X.1nF r10 = (X.AnonymousClass1nF) r10
            java.lang.String r0 = r10.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01eb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r10.A01
            X.AnonymousClass0x2.A1N(r1, r0)
            java.lang.String r0 = r10.A1x()
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0067
        L_0x01eb:
            java.lang.String r5 = r10.A1x()
            goto L_0x0067
        L_0x01f1:
            boolean r0 = r10 instanceof X.AnonymousClass1n9
            if (r0 == 0) goto L_0x0203
            boolean r0 = r10.A1r(r1)
            if (r0 != 0) goto L_0x033f
            X.1n9 r10 = (X.AnonymousClass1n9) r10
            java.lang.String r5 = r10.A1y()
            goto L_0x0067
        L_0x0203:
            boolean r0 = r10 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x020d
            X.1mQ r10 = (X.C30421mQ) r10
            java.lang.String r5 = r10.A00
            goto L_0x0067
        L_0x020d:
            boolean r0 = r10 instanceof X.C30411mP
            if (r0 == 0) goto L_0x023b
            X.1mP r10 = (X.C30411mP) r10
            java.util.List r0 = r10.A02
            if (r0 != 0) goto L_0x021a
            r5 = 0
            goto L_0x0067
        L_0x021a:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.util.Iterator r1 = r0.iterator()
        L_0x0222:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0282
            java.lang.Object r0 = r1.next()
            X.2Mn r0 = (X.C42032Mn) r0
            X.5a1 r0 = r0.A01
            java.lang.String r0 = r0.A03()
            r5.append(r0)
            r5.append(r3)
            goto L_0x0222
        L_0x023b:
            boolean r0 = r10 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0245
            java.lang.String r5 = r10.A16()
            goto L_0x0067
        L_0x0245:
            boolean r0 = r10 instanceof X.C30821nD
            if (r0 == 0) goto L_0x028a
            X.1nD r10 = (X.C30821nD) r10
            X.33j r4 = r9.A06
            java.lang.String r0 = r10.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0288
            java.lang.String r5 = r10.A08
        L_0x0257:
            java.lang.String r0 = r10.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0269
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r5, r3)
            java.lang.String r0 = r10.A06
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0269:
            java.lang.String r0 = r10.A05
            if (r0 == 0) goto L_0x0067
            java.math.BigDecimal r2 = r10.A0A
            if (r2 == 0) goto L_0x0067
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0m(r5, r3)
            X.7ny r1 = new X.7ny
            r1.<init>(r0)
            r0 = 1
            java.lang.String r0 = r1.A04(r4, r2, r0)
            r5.append(r0)
        L_0x0282:
            java.lang.String r5 = r5.toString()
            goto L_0x0067
        L_0x0288:
            r5 = r8
            goto L_0x0257
        L_0x028a:
            boolean r0 = r10 instanceof X.C30451mT
            if (r0 == 0) goto L_0x0367
            X.1mT r10 = (X.C30451mT) r10
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r10.A03
            r2.append(r0)
            boolean r0 = r9.A0P
            if (r0 == 0) goto L_0x02b6
            java.util.List r0 = r10.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x02a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02b6
            X.2y4 r0 = X.AnonymousClass0x9.A0Z(r1)
            r2.append(r3)
            java.lang.String r0 = r0.A03
            r2.append(r0)
            goto L_0x02a3
        L_0x02b6:
            java.lang.String r5 = r2.toString()
            goto L_0x0067
        L_0x02bc:
            boolean r0 = r10 instanceof X.C30771mz
            if (r0 == 0) goto L_0x0331
            X.1mz r10 = (X.C30771mz) r10
            java.lang.String r5 = r10.A09
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x02cb
            r5 = r8
        L_0x02cb:
            java.lang.String r1 = r10.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02d7
            java.lang.String r5 = X.C18260x0.A06(r5, r3, r1)
        L_0x02d7:
            java.lang.String r1 = r10.A05
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02e3
            java.lang.String r5 = X.C18260x0.A06(r5, r3, r1)
        L_0x02e3:
            java.lang.String r0 = r10.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02f5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r5, r3)
            java.lang.String r0 = r10.A04
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
        L_0x02f5:
            java.math.BigDecimal r0 = r10.A0A
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = r10.A03
            X.7ny r7 = new X.7ny
            r7.<init>(r0)
            X.33j r6 = r9.A06
            java.math.BigDecimal r0 = r10.A0A
            r4 = 1
            java.lang.String r2 = r7.A04(r6, r0, r4)
            java.math.BigDecimal r1 = r10.A0B
            if (r1 == 0) goto L_0x032b
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x032b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r2, r3)
            java.math.BigDecimal r0 = r10.A0B
            java.lang.String r0 = r7.A04(r6, r0, r4)
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
        L_0x032b:
            java.lang.String r5 = X.C18260x0.A06(r5, r3, r2)
            goto L_0x0067
        L_0x0331:
            boolean r0 = r10.A1r(r1)
            if (r0 != 0) goto L_0x033f
            X.1mV r10 = (X.C30471mV) r10
            java.lang.String r5 = r10.A1w()
            goto L_0x0067
        L_0x033f:
            java.lang.String r2 = r10.A13()
            X.2Ot r0 = X.C40802Hu.A01(r10)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0362
            r5 = r8
        L_0x034c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0356
            java.lang.String r5 = X.C18260x0.A06(r2, r3, r5)
        L_0x0356:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0067
            java.lang.String r5 = X.C18260x0.A06(r5, r3, r1)
            goto L_0x0067
        L_0x0362:
            java.lang.String r5 = r0.A00
            java.lang.String r1 = r0.A01
            goto L_0x034c
        L_0x0367:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66533Lu.A0D(X.34x):java.lang.String");
    }

    @Deprecated
    public String A0F(String str) {
        boolean z;
        String A0X;
        StringBuilder A0o;
        String trim = C107155an.A01(this.A06, str).trim();
        int length = trim.length();
        if (length == 0) {
            return trim;
        }
        if (!trim.startsWith("\"") || !trim.endsWith("\"") || length <= 2) {
            z = false;
        } else {
            z = true;
            trim = trim.substring(1, length - 1);
        }
        String trim2 = C107155an.A02.matcher(trim).replaceAll(" ").trim();
        if (trim2.length() == 0) {
            return trim2;
        }
        if (z) {
            A0X = AnonymousClass000.A0X("\"", AnonymousClass000.A0m("\"", trim2));
        } else {
            A0X = AnonymousClass000.A0X("*", AnonymousClass000.A0l(trim2));
        }
        if (A0X.indexOf(105) == -1) {
            return A0X;
        }
        if (z) {
            A0o = AnonymousClass000.A0m(A0X, " OR ");
            A0o.append(A0X.replace('i', 305));
        } else {
            String[] split = A0Q.split(A0X);
            A0o = AnonymousClass001.A0o();
            for (String str2 : split) {
                if (str2.indexOf(105) != -1) {
                    A0o.append(str2);
                    A0o.append(" OR ");
                    str2 = str2.replace('i', 305);
                }
                A0o.append(str2);
            }
        }
        return A0o.toString();
    }

    public void A0I() {
        C69833Yo Axl;
        C72303dV r0 = this.A0F;
        C85284Fq A042 = r0.A04();
        try {
            r0.A05();
            C18620xz r6 = r0.A04;
            AnonymousClass33M A012 = AnonymousClass33M.A01("databasehelper/createFtsTable");
            Axl = A042.Axl();
            C41492Kl r3 = new C41492Kl(r6.A01());
            C56622sI r2 = new C56622sI();
            r2.A09(this.A0I, "message_ftsv2");
            C56862sg r02 = ((AnonymousClass3H0) A042).A03;
            r2.A06(r02, r3);
            r6.A06(r02, r3);
            Axl.A00();
            Axl.close();
            AnonymousClass33M.A05(A012, "databasehelper/createFtsDeprecatedTable time spent:", AnonymousClass001.A0o());
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0J() {
        C69833Yo Axl;
        AnonymousClass33M A012 = AnonymousClass33M.A01("FtsMessageStore/drop");
        C72303dV r6 = this.A0F;
        C85284Fq A042 = r6.A04();
        try {
            Axl = A042.Axl();
            C56862sg r3 = ((AnonymousClass3H0) A042).A03;
            r3.A0H(AnonymousClass000.A0V("DROP TABLE IF EXISTS ", "messages_fts", AnonymousClass001.A0o()), "DROP_TABLE_MESSAGES_FTS_DEPRECATED");
            r3.A0H(AnonymousClass000.A0V("DROP TABLE IF EXISTS ", "message_ftsv2", AnonymousClass001.A0o()), "DROP_TABLE_MESSAGE_FTS");
            r6.A05();
            r6.A04.A03(A042);
            C56082rO r32 = this.A0G;
            r32.A02("migration_fts_index");
            r32.A02("migration_fts_retry");
            r32.A03("fts_index_start", 0);
            r32.A04("fts_ready", 0);
            Axl.A00();
            Axl.close();
            A042.close();
            A012.A07();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0M(C56532s8 r7) {
        if (r7.A0C == null) {
            synchronized (r7.A0I) {
                if (r7.A0C == null) {
                    AnonymousClass33M A012 = AnonymousClass33M.A01("FtsMessageStore/getSearchableContacts");
                    C58392vB r0 = this.A0K;
                    C46512bk r4 = new C46512bk(r0.A00, C58392vB.A01, "warm-contact");
                    LinkedList linkedList = new LinkedList(this.A0A.A04().values());
                    r7.A0C = linkedList;
                    if (r7.A0B != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C95814uZ A013 = AnonymousClass3ZH.A01(C18310x6.A0R(it));
                            if (A013 == null || !C66473Lo.A00(A013, r7.A0B)) {
                                it.remove();
                            }
                        }
                    }
                    r4.A00();
                    List list = r7.A0C;
                    if (list != null) {
                        list.size();
                    }
                    A012.A07();
                }
            }
        }
    }

    public boolean A0N() {
        return AnonymousClass000.A1S(((this.A0G.A00("fts_ready", 0) % 2) > 0 ? 1 : ((this.A0G.A00("fts_ready", 0) % 2) == 0 ? 0 : -1)));
    }

    public C66533Lu(C55682qk r4, C56972sr r5, C49712gy r6, C64773Ex r7, AnonymousClass5ZU r8, C620733j r9, C50632iV r10, C56922sm r11, C56982ss r12, C66473Lo r13, C49482gb r14, C623334p r15, AnonymousClass2S7 r16, C55272q5 r17, C72303dV r18, C56082rO r19, C66273Ks r20, AnonymousClass3L1 r21, AnonymousClass1VX r22, C58392vB r23, C50222hp r24, AnonymousClass8JP r25, C55832qz r26, C183538qC r27) {
        AnonymousClass1VX r2 = r22;
        this.A0J = r2;
        this.A0C = r15;
        this.A0I = r21;
        this.A08 = r11;
        this.A01 = r4;
        this.A02 = r5;
        this.A09 = r12;
        this.A03 = r6;
        this.A0D = r16;
        this.A04 = r7;
        this.A0H = r20;
        this.A05 = r8;
        this.A06 = r9;
        this.A0N = r26;
        this.A0K = r23;
        this.A0G = r19;
        this.A07 = r10;
        this.A0F = r18;
        this.A0B = r14;
        this.A0O = r27;
        this.A0M = r25;
        this.A0A = r13;
        this.A0E = r17;
        this.A0L = r24;
        this.A0P = r2.A0Y(C58422vE.A02, 2822);
    }

    public static String A00(List list, List list2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0h = AnonymousClass0x2.A0h();
        AnonymousClass0x2.A1O(A0h, AnonymousClass2C5.A01);
        C18270x1.A1C("message_view AS message JOIN ( ", A0h, A0o);
        A0o.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name = ?");
        list2.add(C18290x4.A0k(list));
        for (int i = 1; i < list.size(); i++) {
            A0o.append(" INTERSECT ");
            A0o.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name = ?");
            list2.add(list.get(i));
        }
        return AnonymousClass000.A0X(") ON message._id = message_row_id", A0o);
    }

    public String A0A(AnonymousClass0QU r13, C56532s8 r14, Integer num) {
        StringBuilder sb;
        String str = "";
        if (C56532s8.A00(r14)) {
            String A022 = r14.A02();
            if (!A022.startsWith("\"") || !A022.endsWith("\"") || A022.length() <= 2) {
                if (!r14.A0F || !C386628q.A00(this)) {
                    sb = AnonymousClass000.A0l(str);
                    List A042 = r14.A04();
                    ArrayList A0p = AnonymousClass000.A0p(A042);
                    Iterator it = A042.iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass001.A0m(it);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("content:");
                        C18270x1.A1D(A0m, A0o, A0p);
                    }
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18310x6.A1G(" ", A0p, A0o2);
                    str = AnonymousClass000.A0X("*", A0o2);
                } else {
                    sb = AnonymousClass000.A0l(str);
                    if (!r14.A04().isEmpty()) {
                        List A0G2 = A0G(r13, r14, num);
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        int size = A0G2.size();
                        for (int i = 0; i < size && !A01(r13); i++) {
                            boolean A1U = AnonymousClass000.A1U(i, size - 1);
                            AnonymousClass001.A1L(A0o3);
                            Pair pair = (Pair) A0G2.get(i);
                            StringBuilder A0o4 = AnonymousClass001.A0o();
                            A0o4.append("content:");
                            A0o4.append((String) pair.first);
                            if (A1U) {
                                A0o4.append('*');
                            }
                            for (int i2 = 0; i2 < ((List) pair.second).size(); i2++) {
                                C95814uZ r11 = (C95814uZ) ((List) pair.second).get(i2);
                                if ((r11 instanceof PhoneUserJid) || C627336j.A0K(r11)) {
                                    A0o4.append(" OR ");
                                    A0o4.append("fts_jid:");
                                    A0o4.append(A0C(r11));
                                }
                            }
                            AnonymousClass000.A1B(A0o4, A0o3);
                        }
                        str = A0o3.toString().trim();
                    }
                }
                str = AnonymousClass000.A0X(str, sb);
            } else {
                str = A022;
            }
        }
        C95814uZ r0 = r14.A04;
        if (r0 != null) {
            StringBuilder A0u = C18290x4.A0u(r0);
            AnonymousClass0x2.A1N(A0u, str);
            C95814uZ r3 = r14.A04;
            boolean z = r14.A0G;
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append("fts_jid:");
            String A0X = AnonymousClass000.A0X(A0C(r3), A0o5);
            if (z && !C627336j.A0K(r3)) {
                A0X = AnonymousClass000.A0X(" fts_jid:0 OR fts_jid:1", AnonymousClass000.A0l(A0X));
            }
            str = AnonymousClass000.A0X(A0X, A0u);
        }
        return A0B(r13, r14, str);
    }

    public final String A0B(AnonymousClass0QU r11, C56532s8 r12, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0q = AnonymousClass000.A0q(A0H());
        boolean z = false;
        boolean z2 = false;
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (A01(r11)) {
                break;
            }
            String A0q2 = C18310x6.A0q(A0w);
            AnonymousClass2M8 B9w = ((C84914Ef) A0w.getValue()).B9w(r12);
            if (B9w != null) {
                Iterator it = B9w.A00.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    if (A01(r11)) {
                        break;
                    }
                    A0s.add(AnonymousClass000.A0U("fts_namespace:", A0q2, A0m, AnonymousClass001.A0o()));
                    z2 = true;
                }
                Iterator it2 = B9w.A01.iterator();
                while (it2.hasNext()) {
                    String A0m2 = AnonymousClass001.A0m(it2);
                    if (A01(r11)) {
                        break;
                    }
                    A0s.add(AnonymousClass000.A0U("fts_namespace:-", A0q2, A0m2, AnonymousClass001.A0o()));
                    z = true;
                }
            }
        }
        if (A01(r11) || !z || z2 || !TextUtils.isEmpty(str)) {
            String join = TextUtils.join(" ", A0s);
            if (!TextUtils.isEmpty(join)) {
                return C18260x0.A06(str, " ", join);
            }
            return str;
        }
        throw AnonymousClass001.A0e("Compiled FTS query comprised entirely of NOTs");
    }

    public final String A0E(C624134x r6) {
        Set B9Z;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0q = AnonymousClass000.A0q(A0H());
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (!(A0w == null || A0w.getValue() == null || (B9Z = ((C84914Ef) A0w.getValue()).B9Z(r6)) == null)) {
                String A0q2 = C18310x6.A0q(A0w);
                Iterator it = B9Z.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    if (A0m != null) {
                        A0s.add(AnonymousClass000.A0T(A0q2, A0m));
                    }
                }
            }
        }
        return TextUtils.join(" ", A0s);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0G(X.AnonymousClass0QU r22, X.C56532s8 r23, java.lang.Integer r24) {
        /*
            r21 = this;
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            r6 = r23
            java.util.List r20 = r6.A04()
            r5 = 0
        L_0x000b:
            int r0 = r20.size()
            if (r5 >= r0) goto L_0x0101
            boolean r0 = A01(r22)
            if (r0 != 0) goto L_0x0101
            r0 = r20
            java.lang.String r4 = X.AnonymousClass001.A0n(r0, r5)
            if (r4 == 0) goto L_0x00f7
            int r0 = r20.size()
            r14 = 1
            int r0 = r0 - r14
            boolean r19 = X.AnonymousClass000.A1U(r5, r0)
            monitor-enter(r6)
            java.util.Map r13 = r6.A0E     // Catch:{ all -> 0x00fe }
            if (r13 != 0) goto L_0x0034
            java.util.concurrent.ConcurrentHashMap r13 = X.AnonymousClass0x9.A1D()     // Catch:{ all -> 0x00fe }
            r6.A0E = r13     // Catch:{ all -> 0x00fe }
        L_0x0034:
            monitor-exit(r6)
            java.lang.Object r11 = r6.A0I
            monitor-enter(r11)
            java.util.List r10 = X.C18320x8.A0s(r4, r13)     // Catch:{ all -> 0x00fb }
            r12 = r21
            r8 = r24
            if (r10 == 0) goto L_0x004b
            X.8JP r3 = r12.A0M     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "fts_cached_jids"
            X.AnonymousClass5YZ.A01(r3, r8, r0)     // Catch:{ all -> 0x00fb }
        L_0x0049:
            monitor-exit(r11)     // Catch:{ all -> 0x00fb }
            goto L_0x00ba
        L_0x004b:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00fb }
            java.util.List r18 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x00fb }
            r12.A0M(r6)     // Catch:{ all -> 0x00fb }
            X.8JP r3 = r12.A0M     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "fts_warm_cache"
            X.AnonymousClass5YZ.A01(r3, r8, r0)     // Catch:{ all -> 0x00fb }
            java.util.List r0 = r6.A0C     // Catch:{ all -> 0x00fb }
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "contact list null after warming"
            X.C626936e.A0D(r1, r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "FtsMessageStore/filter"
            X.33M r17 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x00fb }
            java.util.List r0 = r6.A0C     // Catch:{ all -> 0x00fb }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x00fb }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x00fb }
        L_0x0077:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00ae
            X.3ZH r15 = X.C18310x6.A0R(r16)     // Catch:{ all -> 0x00fb }
            boolean r0 = A01(r22)     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x008a
            if (r19 == 0) goto L_0x008a
            goto L_0x00e2
        L_0x008a:
            X.4uZ r9 = X.AnonymousClass3ZH.A01(r15)     // Catch:{ all -> 0x00fb }
            if (r9 == 0) goto L_0x0077
            boolean r0 = r9 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x00fb }
            if (r0 != 0) goto L_0x0098
            boolean r0 = r9 instanceof com.whatsapp.jid.GroupJid     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x0077
        L_0x0098:
            X.5ZU r2 = r12.A05     // Catch:{ all -> 0x00fb }
            int r0 = r4.length()     // Catch:{ all -> 0x00fb }
            r1 = 0
            if (r0 <= r14) goto L_0x00a2
            r1 = 1
        L_0x00a2:
            r0 = r18
            boolean r0 = r2.A0f(r15, r0, r1)     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x0077
            r10.add(r9)     // Catch:{ all -> 0x00fb }
            goto L_0x0077
        L_0x00ae:
            r13.put(r4, r10)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "fts_search"
            X.AnonymousClass5YZ.A01(r3, r8, r0)     // Catch:{ all -> 0x00fb }
            r17.A07()     // Catch:{ all -> 0x00fb }
            goto L_0x0049
        L_0x00ba:
            java.util.List r0 = r6.A0A
            if (r0 == 0) goto L_0x00e9
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r10.iterator()
        L_0x00c6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00dc
            X.4uZ r1 = X.C18300x5.A0P(r2)
            java.util.List r0 = r6.A0A
            boolean r0 = X.C66473Lo.A00(r1, r0)
            if (r0 == 0) goto L_0x00c6
            r9.add(r1)
            goto L_0x00c6
        L_0x00dc:
            java.lang.String r0 = "fts_filtered"
            X.AnonymousClass5YZ.A01(r3, r8, r0)
            goto L_0x00ef
        L_0x00e2:
            java.lang.String r0 = "fts_last_cancel"
            X.AnonymousClass5YZ.A01(r3, r8, r0)     // Catch:{ all -> 0x00fb }
            monitor-exit(r11)     // Catch:{ all -> 0x00fb }
            goto L_0x00ee
        L_0x00e9:
            java.lang.String r0 = "fts_unfiltered"
            X.AnonymousClass5YZ.A01(r3, r8, r0)
        L_0x00ee:
            r9 = r10
        L_0x00ef:
            java.lang.String r0 = "fts_token_jids"
            X.AnonymousClass5YZ.A01(r3, r8, r0)
            X.C18320x8.A1F(r4, r9, r7)
        L_0x00f7:
            int r5 = r5 + 1
            goto L_0x000b
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00fb }
            throw r0
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0101:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66533Lu.A0G(X.0QU, X.2s8, java.lang.Integer):java.util.List");
    }

    public void A0L(C56532s8 r3) {
        try {
            A0M(r3);
        } catch (IllegalStateException e) {
            Log.e("FtsMessageStore/safeWarm/failed to warm contact list", e);
        }
    }
}
