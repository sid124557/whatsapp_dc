package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2rw  reason: invalid class name and case insensitive filesystem */
public class C56412rw {
    public final C56972sr A00;
    public final C56612sH A01;
    public final C56922sm A02;
    public final C56982ss A03;
    public final AnonymousClass2Y2 A04;
    public final C72303dV A05;
    public final C56112rR A06;
    public final C60992zV A07;
    public final C158767kW A08;
    public final AnonymousClass1VX A09;
    public final C56832sd A0A;

    public AnonymousClass31A A02(C30521ma r12) {
        AnonymousClass31A A012 = A01(r12);
        if (A012 == null) {
            Log.e("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/no chat");
            return null;
        }
        int i = 0;
        if (this.A09.A0Y(C58422vE.A02, 4131)) {
            int i2 = r12.A00;
            if (i2 == 1) {
                i = 2;
            } else if (i2 == 2) {
                i = 1;
            }
            Log.i("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/flip initiator");
        }
        int i3 = r12.A00;
        long j = r12.A01;
        A05(A012, r12.A0o, i3, i, r12.A04, j);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/update ephemeral info ");
        C18260x0.A0o(A012.A0b, A0o);
        return A012;
    }

    public final int A00(long j) {
        Cursor A0E;
        AnonymousClass4GK A032 = this.A05.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            int i = 0;
            A1Y[0] = Long.toString(j);
            A0E = r4.A0E("SELECT setting_duration FROM message_ephemeral_setting WHERE message_row_id = ?", "GET_EPHEMERAL_SETTING_DURATION", A1Y);
            if (A0E != null) {
                if (A0E.moveToNext()) {
                    i = AnonymousClass0x2.A04(A0E, "setting_duration");
                }
                A0E.close();
            }
            A032.close();
            return i;
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

    public final AnonymousClass31A A01(C624134x r4) {
        UserJid A032 = AnonymousClass32Y.A03(r4.A1J.A00);
        if (A032 == null) {
            Log.e("EphemeralSettingMessageStore/getChatInfo/not a user");
            return null;
        }
        AnonymousClass31A A002 = C56982ss.A00(this.A03, A032);
        if (A002 != null) {
            return A002;
        }
        Log.w("EphemeralSettingMessageStore/getChatInfo/no chat");
        return null;
    }

    public Integer A03(C624134x r7) {
        Cursor A0E;
        long A072 = this.A02.A07(AnonymousClass2z0.A00(r7));
        AnonymousClass4GK A032 = this.A05.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            C18260x0.A1Y(A1Z, A072);
            C18280x3.A1T(A1Z, r7.A1M);
            A0E = r4.A0E("SELECT setting_duration FROM message_ephemeral_setting INNER JOIN message_view ON message_ephemeral_setting.message_row_id=message_view._id WHERE chat_row_id == ? AND sort_id < ? ORDER BY sort_id DESC LIMIT 1", "GET_EPHEMERAL_SETTING_BEFORE_MESSAGE", A1Z);
            if (A0E != null) {
                if (A0E.moveToNext()) {
                    Integer valueOf = Integer.valueOf(AnonymousClass0x2.A04(A0E, "setting_duration"));
                    A0E.close();
                    A032.close();
                    return valueOf;
                }
            }
            if (A0E != null) {
                A0E.close();
            }
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

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0 <= r0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass31A r16, X.C30311mF r17) {
        /*
            r15 = this;
            r7 = r16
            r6 = r15
            r2 = r17
            if (r16 != 0) goto L_0x000e
            X.31A r7 = r15.A01(r2)
            if (r7 != 0) goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            X.3Z2 r10 = r7.A0b
            X.2zV r8 = r15.A07
            int r12 = r2.A00
            int r0 = r10.expiration
            if (r12 != r0) goto L_0x0031
            long r0 = r2.A0K
            long r3 = r10.ephemeralSettingTimestamp
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0031
            int r3 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0031
        L_0x0024:
            int r9 = r2.A00
            long r12 = r2.A0K
            r10 = 0
            int r11 = r2.A04
            java.lang.Boolean r8 = r2.A0o
            r6.A05(r7, r8, r9, r10, r11, r12)
            return
        L_0x0031:
            int r1 = r2.A0l()
            r0 = 1
            if (r1 != r0) goto L_0x000d
            X.2z0 r0 = r2.A1J
            X.4uZ r9 = r0.A00
            long r13 = r2.A0K
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            boolean r0 = r8.A03(r9, r10, r11, r12, r13)
            if (r0 == 0) goto L_0x000d
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56412rw.A04(X.31A, X.1mF):void");
    }

    public void A06(C31161nq r8) {
        Cursor A0E;
        Cursor A0E2;
        r8.A00 = A00(r8.A1L);
        if (C56952sp.A0G(this.A09)) {
            AnonymousClass4GK A032 = this.A05.get();
            try {
                C56862sg r4 = ((AnonymousClass3H0) A032).A03;
                boolean z = true;
                String[] strArr = new String[1];
                C18260x0.A1Y(strArr, r8.A1L);
                A0E2 = r4.A0E("SELECT setting_reason, ephemeral_trigger, ephemeral_initiated_by_me FROM message_ephemeral_setting WHERE message_row_id = ?", "GET_EPHEMERAL_SETTING_INFO", strArr);
                if (A0E2 != null) {
                    if (A0E2.moveToNext()) {
                        int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("setting_reason");
                        int columnIndexOrThrow2 = A0E2.getColumnIndexOrThrow("ephemeral_trigger");
                        int columnIndexOrThrow3 = A0E2.getColumnIndexOrThrow("ephemeral_initiated_by_me");
                        r8.A00 = A0E2.getInt(columnIndexOrThrow);
                        r8.A04 = A0E2.getInt(columnIndexOrThrow2);
                        if (!A0E2.isNull(columnIndexOrThrow3)) {
                            if (A0E2.getInt(columnIndexOrThrow3) == 0) {
                                z = false;
                            }
                            r8.A0o = Boolean.valueOf(z);
                        }
                    }
                    A0E2.close();
                }
                A032.close();
                return;
            } catch (Throwable th) {
                th = th;
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            long j = r8.A1L;
            AnonymousClass4GK A033 = this.A05.get();
            try {
                C56862sg r42 = ((AnonymousClass3H0) A033).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                int i = 0;
                A1Y[0] = Long.toString(j);
                A0E = r42.A0E("SELECT setting_reason FROM message_ephemeral_setting WHERE message_row_id = ?", "GET_EPHEMERAL_SETTING_DURATION", A1Y);
                if (A0E != null) {
                    if (A0E.moveToNext()) {
                        i = AnonymousClass0x2.A04(A0E, "setting_reason");
                    }
                    A0E.close();
                }
                A033.close();
                r8.A00 = i;
                return;
            } catch (Throwable th3) {
                th = th3;
                A033.close();
                throw th;
            }
        }
        throw th;
        throw th;
    }

    public void A07(Boolean bool, int i, int i2, int i3, long j) {
        C85284Fq A042 = this.A05.A04();
        try {
            ContentValues A062 = AnonymousClass0x9.A06();
            C18270x1.A0a(A062, j);
            C18270x1.A0b(A062, "setting_duration", i);
            C18270x1.A0b(A062, "setting_reason", i2);
            if (C56952sp.A0G(this.A09)) {
                C18270x1.A0b(A062, "ephemeral_trigger", i3);
                if (bool != null) {
                    A062.put("ephemeral_initiated_by_me", bool);
                }
            }
            ((AnonymousClass3H0) A042).A03.A0C("message_ephemeral_setting", "INSERT_EPHEMERAL_SETTING_DURATION", A062, 5);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C56412rw(C56972sr r1, C56612sH r2, C56922sm r3, C56982ss r4, AnonymousClass2Y2 r5, C72303dV r6, C56112rR r7, C60992zV r8, C158767kW r9, AnonymousClass1VX r10, C56832sd r11) {
        this.A01 = r2;
        this.A09 = r10;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A0A = r11;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
    }

    public final void A05(AnonymousClass31A r6, Boolean bool, int i, int i2, int i3, long j) {
        ContentValues A062;
        r6.A0B(i, j, i2);
        C56922sm r4 = this.A02;
        synchronized (r6) {
            A062 = AnonymousClass0x9.A06();
            C18270x1.A0b(A062, "ephemeral_expiration", r6.A0b.expiration);
            C18270x1.A0c(A062, "ephemeral_setting_timestamp", r6.A0b.ephemeralSettingTimestamp);
            C18270x1.A0b(A062, "ephemeral_disappearing_messages_initiator", r6.A0b.disappearingMessagesInitiator);
        }
        r4.A04(A062, r6);
        if (C56952sp.A0G(this.A09) && r6.A0H(bool, i3)) {
            this.A04.A00(r6);
        }
    }
}
