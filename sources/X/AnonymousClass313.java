package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.313  reason: invalid class name */
public class AnonymousClass313 {
    public static final byte[] A0D = {0, 1, 3, 2, 20, 9, 66, 23};
    public final C64773Ex A00;
    public final C56922sm A01;
    public final C56982ss A02;
    public final C56892sj A03;
    public final C72303dV A04;
    public final C56382rt A05;
    public final AnonymousClass34U A06;
    public final C56112rR A07;
    public final C60992zV A08;
    public final AnonymousClass2GG A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4FV A0B;
    public final AnonymousClass30N A0C;

    public void A05(int i, String str, long j) {
        C69833Yo Axl;
        C85284Fq A042 = this.A04.A04();
        try {
            Axl = A042.Axl();
            ContentValues A062 = AnonymousClass0x9.A06();
            A062.put("chat_jid", str);
            long j2 = j;
            C18270x1.A0c(A062, "last_sync_response_sent_timestamp", j2);
            AnonymousClass3H0.A01(A062, A042, "no_of_retries_sent_already", i).A0C("message_ephemeral_sync_response", "UPDATE_EPHEMERAL_SYNC_RESPONSE_FOR_CHAT_JID_SQL", A062, 5);
            Axl.A00();
            A042.B25(new C70383aP(this, str, i, j2));
            Axl.close();
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

    public int A01(String str) {
        int i;
        AnonymousClass2GG r1 = this.A09;
        C162457s7.A0J(str, 0);
        C60522yh r0 = (C60522yh) r1.A00.get(str);
        if (r0 != null && (i = r0.A00) != -1) {
            return i;
        }
        C60522yh A032 = A03(str);
        A06(A032, str);
        return A032.A00;
    }

    public final C60522yh A03(String str) {
        Cursor A0E;
        C60522yh r4 = new C60522yh(0, 0);
        AnonymousClass4GK A032 = this.A04.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            A1Y[0] = str;
            A0E = r3.A0E("SELECT no_of_retries_sent_already, last_sync_response_sent_timestamp FROM message_ephemeral_sync_response WHERE chat_jid = ?", "GET_SYNC_RESPONSE_INFO_FOR_CHAT_JID", A1Y);
            if (A0E.moveToNext()) {
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("last_sync_response_sent_timestamp");
                int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("no_of_retries_sent_already");
                r4.A01 = A0E.getLong(columnIndexOrThrow);
                r4.A00 = A0E.getInt(columnIndexOrThrow2);
            }
            A0E.close();
            A032.close();
            return r4;
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

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        if (r0 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3Z2 A04(X.C624134x r12, long r13) {
        /*
            r11 = this;
            X.2z0 r3 = r12.A1J
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x003c
            boolean r0 = r12 instanceof X.C30521ma
            if (r0 == 0) goto L_0x0019
            r0 = r12
            X.1ma r0 = (X.C30521ma) r0
            int r4 = r0.A00
            long r2 = r0.A01
        L_0x0011:
            int r1 = r12.A00
            X.3Z2 r0 = new X.3Z2
            r0.<init>(r4, r2, r1)
            return r0
        L_0x0019:
            int r1 = r12.A05
            if (r1 <= 0) goto L_0x0068
            X.2zV r0 = r11.A08
            boolean r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x0068
            X.2ss r2 = r11.A02
            X.3Ex r1 = r11.A00
            X.4uZ r0 = X.AnonymousClass2z0.A01(r3)
            int r0 = X.AnonymousClass352.A00(r1, r2, r0)
            r12.A1E(r0)
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()
            r12.A1Y(r0)
            goto L_0x0068
        L_0x003c:
            boolean r0 = r12.A1q()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r12.A1W
            if (r0 != 0) goto L_0x0068
            boolean r0 = r12 instanceof X.C30311mF
            if (r0 != 0) goto L_0x0068
            boolean r0 = r12 instanceof X.C30521ma
            if (r0 != 0) goto L_0x0068
            r8 = 1
            X.4uZ r5 = r3.A00
            boolean r0 = X.C627336j.A0K(r5)
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0083
            X.3Ex r0 = r11.A00
            X.3ZH r0 = r0.A07(r5)
            if (r0 == 0) goto L_0x0068
            int r0 = r0.A02
            if (r0 <= 0) goto L_0x0068
            r12.A1E(r0)
        L_0x0068:
            int r4 = r12.A05
            if (r4 <= 0) goto L_0x0076
            long r0 = X.C18290x4.A0A(r4)
            java.lang.Long r0 = X.AnonymousClass0x9.A0n(r13, r0)
            r12.A0r = r0
        L_0x0076:
            java.lang.Long r0 = r12.A0q
            if (r0 != 0) goto L_0x007e
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()
        L_0x007e:
            long r2 = r0.longValue()
            goto L_0x0011
        L_0x0083:
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0068
            X.2ss r0 = r11.A02
            X.31A r0 = r0.A0A(r5, r7)
            if (r0 == 0) goto L_0x00c5
            X.3Z2 r9 = r0.A0b
            X.2kh r6 = r0.A0a
            r5 = 2
            if (r9 == 0) goto L_0x0068
            int r10 = r9.expiration
            if (r10 > 0) goto L_0x00a2
            long r3 = r9.ephemeralSettingTimestamp
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
        L_0x00a2:
            r12.A1E(r10)
            long r0 = r9.ephemeralSettingTimestamp
            X.C624134x.A0L(r12, r0)
            int r0 = r9.disappearingMessagesInitiator
            if (r0 != r5) goto L_0x00bd
            r12.A00 = r5
        L_0x00b0:
            if (r6 == 0) goto L_0x0068
            int r0 = r6.A00
            r12.A04 = r0
            java.lang.Boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0068
        L_0x00ba:
            r12.A0o = r0
            goto L_0x0068
        L_0x00bd:
            if (r0 != r8) goto L_0x00c2
            r12.A00 = r8
            goto L_0x00b0
        L_0x00c2:
            r12.A00 = r7
            goto L_0x00b0
        L_0x00c5:
            X.2rR r1 = r11.A07
            com.whatsapp.jid.UserJid r0 = r1.A03(r5)
            if (r0 == 0) goto L_0x0068
            int r3 = r1.A01(r0)
            long r1 = r1.A02(r0)
            boolean r0 = r0.equals(r5)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00de
            r4 = 2
        L_0x00de:
            r12.A1E(r3)
            X.C624134x.A0L(r12, r1)
            r12.A00 = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass313.A04(X.34x, long):X.3Z2");
    }

    public void A06(C60522yh r4, String str) {
        AnonymousClass4GK A032 = this.A04.get();
        try {
            if (((AnonymousClass3H0) A032).A03.A00.inTransaction()) {
                A032.B25(new C117715sN(this, r4, str, 38));
            } else {
                this.A09.A00.put(str, r4);
            }
            A032.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A07(C95814uZ r6, int i) {
        ContentValues A062;
        AnonymousClass31A A002 = C56982ss.A00(this.A02, r6);
        if (A002 != null) {
            A002.A01 = i;
            C56922sm r3 = this.A01;
            synchronized (A002) {
                A062 = AnonymousClass0x9.A06();
                C18270x1.A0b(A062, "ephemeral_displayed_exemptions", A002.A01);
            }
            r3.A04(A062, A002);
        }
    }

    public void A08(C624134x r8) {
        Cursor A0E;
        AnonymousClass4GK A032 = this.A04.get();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A032).A03;
            boolean z = true;
            String[] strArr = new String[1];
            C18260x0.A1Y(strArr, r8.A1L);
            A0E = r5.A0E("SELECT duration, expire_timestamp, keep_in_chat, ephemeral_trigger, ephemeral_initiated_by_me FROM message_ephemeral WHERE message_row_id = ?", "GET_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", strArr);
            if (A0E.moveToNext()) {
                r8.A1E(AnonymousClass0x2.A04(A0E, "duration"));
                r8.A0r = Long.valueOf(AnonymousClass0x2.A0C(A0E, "expire_timestamp"));
                r8.A07 = AnonymousClass0x2.A04(A0E, "keep_in_chat");
                r8.A04 = AnonymousClass0x2.A04(A0E, "ephemeral_trigger");
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("ephemeral_initiated_by_me");
                if (!A0E.isNull(columnIndexOrThrow)) {
                    if (A0E.getInt(columnIndexOrThrow) == 0) {
                        z = false;
                    }
                    r8.A0o = Boolean.valueOf(z);
                }
            }
            A0E.close();
            A032.close();
            return;
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

    public void A09(C624134x r6) {
        C85284Fq A042 = this.A04.A04();
        try {
            ContentValues A022 = A02(r6);
            C624134x.A0H(A022, r6);
            ((AnonymousClass3H0) A042).A03.A08("message_ephemeral", "INSERT_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", A022);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0B(C624134x r7) {
        C626936e.A0C(AnonymousClass001.A1W(r7.A05));
        C85284Fq A042 = this.A04.A04();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A042).A03;
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A1L(A0M, r7.A0j());
            AnonymousClass001.A1Q(A0M, r7.A1L);
            r4.A0I("UPDATE message_ephemeral SET keep_in_chat=?  WHERE message_row_id =? ", "KEEP_IN_CHAT_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", A0M);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass313(C64773Ex r1, C56922sm r2, C56982ss r3, C56892sj r4, C72303dV r5, C56382rt r6, AnonymousClass34U r7, C56112rR r8, C60992zV r9, AnonymousClass2GG r10, AnonymousClass1VX r11, AnonymousClass4FV r12, AnonymousClass30N r13) {
        this.A0A = r11;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A0B = r12;
        this.A00 = r1;
        this.A0C = r13;
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = r4;
        this.A09 = r10;
        this.A08 = r9;
        this.A07 = r8;
    }

    public final int A00(C85284Fq r8, C624134x r9) {
        ContentValues A022 = A02(r9);
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18260x0.A1X(A1Y, r9.A1L);
        return ((AnonymousClass3H0) r8).A03.A05(A022, "message_ephemeral", "message_row_id = ?", "updateEphemeralMessage/UPDATE_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", A1Y);
    }

    public final ContentValues A02(C624134x r4) {
        ContentValues A062 = AnonymousClass0x9.A06();
        A062.put("duration", Integer.valueOf(r4.A05));
        Long l = r4.A0r;
        C626936e.A06(l);
        A062.put("expire_timestamp", l);
        if (C56952sp.A0G(this.A0A)) {
            A062.put("ephemeral_trigger", Integer.valueOf(r4.A04));
            Boolean bool = r4.A0o;
            if (bool != null) {
                A062.put("ephemeral_initiated_by_me", bool);
            }
        }
        return A062;
    }

    public void A0A(C624134x r8) {
        C626936e.A0C(AnonymousClass2z0.A0D(r8));
        C85284Fq A042 = this.A04.A04();
        try {
            if (r8.A05 <= 0) {
                C56862sg r5 = ((AnonymousClass3H0) A042).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                C18260x0.A1X(A1Y, r8.A1L);
                r5.A07("message_ephemeral", "message_row_id = ?", "DELETE_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", A1Y);
            } else if (A00(A042, r8) == 0) {
                A09(r8);
            }
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
