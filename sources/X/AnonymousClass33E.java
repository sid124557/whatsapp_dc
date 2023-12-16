package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.33E  reason: invalid class name */
public class AnonymousClass33E {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C66543Lv A02;
    public final C623334p A03;
    public final C72303dV A04;
    public final C623934v A05;

    public static long A00(long j, long j2) {
        if (j2 > 0 && j / 10 > j2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MessageRangeUtil/convertTheTimestampIfTooLarge DeleteMessageForMeMutation message timestamp is too large, timestampToConvert=");
            A0o.append(j);
            C18270x1.A1B("; validTimestamp=", A0o, j2);
            while (j / 10 > j2) {
                j = C18290x4.A0B(j);
            }
        }
        return j;
    }

    public C54782pH A02(Cursor cursor, C95814uZ r13) {
        String A0Z = AnonymousClass0x2.A0Z(cursor, "key_id");
        boolean A1U = AnonymousClass000.A1U(AnonymousClass0x2.A04(cursor, "from_me"), 1);
        long A012 = A01(cursor, A1U);
        C95814uZ r5 = r13;
        UserJid userJid = null;
        if (C627336j.A0K(r13) && !A1U) {
            long A0C = AnonymousClass0x2.A0C(cursor, "sender_jid_row_id");
            Jid A08 = this.A03.A08(A0C);
            UserJid A032 = AnonymousClass32Y.A03(A08);
            if (A032 == null) {
                DeviceJid of = DeviceJid.of(A08);
                if (of != null) {
                    A032 = of.userJid;
                    if (A032 == null) {
                        return null;
                    }
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("MessageRangeUtil/getSenderJid null or not UserJid/DeviceJid when db migration is completed; senderJidRowId=");
                    A0o.append(A0C);
                    C18260x0.A1Q(A0o, "; jid=", A08);
                    return null;
                }
            }
            userJid = A032;
        }
        return new C54782pH(r5, userJid, A0Z, A012, A1U);
    }

    public AnonymousClass35N A03(C95814uZ r18) {
        UserJid userJid;
        HashSet A0h = C18280x3.A0h(new String[]{"clearChat", "deleteChat", "deleteMessageForMe"});
        ArrayList A0s = AnonymousClass001.A0s();
        C623934v r2 = this.A05;
        C95814uZ r6 = r18;
        A0s.addAll(r2.A09(r6, A0h, false));
        A0s.addAll(r2.A09(r6, A0h, true));
        AnonymousClass35N A042 = A04(r6, true);
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass33W A0K2 = C18320x8.A0K(it);
            if (A0K2 instanceof C837749s) {
                A042 = AnonymousClass35N.A01(A042, ((C837749s) A0K2).B9b());
            } else if (A0K2 instanceof AnonymousClass1SZ) {
                AnonymousClass1SZ r62 = (AnonymousClass1SZ) A0K2;
                long j = r62.A00;
                if (j > 0) {
                    long A002 = A00(j, r62.A04);
                    AnonymousClass2z0 r0 = r62.A02;
                    boolean z = r0.A02;
                    String str = r0.A01;
                    C95814uZ A012 = AnonymousClass2z0.A01(r0);
                    C95814uZ r02 = r62.A01;
                    if (r02 != null) {
                        userJid = AnonymousClass32Y.A08(r02.getRawString());
                    } else {
                        userJid = null;
                    }
                    A0K.add(new C54782pH(A012, userJid, str, A002, z));
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("MessageRangeUtil/createActiveRange unhandledMutation:");
                C18260x0.A1K(A0o, A0K2.A09());
            }
        }
        return AnonymousClass35N.A01(A042, new AnonymousClass35N(A0K, Collections.emptySet(), 0, 0));
    }

    public AnonymousClass35N A04(C95814uZ r19, boolean z) {
        Cursor A0E;
        long j;
        long j2;
        Cursor A0E2;
        C66543Lv r3 = this.A02;
        String[] A1a = AnonymousClass0x9.A1a();
        C56922sm r9 = r3.A0W;
        C95814uZ r12 = r19;
        C56922sm.A01(r9, r12, A1a);
        C56612sH r7 = r3.A0K;
        C18270x1.A1R(A1a, r7.A0H());
        String valueOf = String.valueOf(1000);
        A1a[2] = valueOf;
        C72303dV r8 = r3.A18;
        AnonymousClass4GK A032 = r8.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("   SELECT MAX(timestamp) as timestamp FROM  ( SELECT timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = 0 AND (message_type != '7') AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT ? )", "SELECT_LATEST_TIMESTAMP_OF_RECEIVED_MESSAGES_IN_CHAT_SQL", A1a);
            if (!A0E.moveToFirst()) {
                A0E.close();
                A032.close();
                j = -1;
            } else {
                j = AnonymousClass0x2.A0C(A0E, "timestamp");
                A0E.close();
                A032.close();
            }
            if (z) {
                String[] A1Y = AnonymousClass0x9.A1Y();
                C56922sm.A01(r9, r12, A1Y);
                AnonymousClass4GK A033 = r8.get();
                try {
                    A0E2 = ((AnonymousClass3H0) A033).A03.A0E("   SELECT timestamp FROM available_message_view WHERE chat_row_id = ? AND from_me = 1 AND message_type = 7 ORDER BY sort_id DESC LIMIT 1", "SELECT_LATEST_TIMESTAMP_OF_SYSTEM_MESSAGES_IN_CHAT_SQL", A1Y);
                    if (!A0E2.moveToFirst()) {
                        A0E2.close();
                        A033.close();
                        j2 = -1;
                    } else {
                        j2 = AnonymousClass0x2.A0C(A0E2, "timestamp");
                        A0E2.close();
                        A033.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        A033.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                j2 = 0;
            }
            HashSet A0K = AnonymousClass002.A0K();
            HashSet A0K2 = AnonymousClass002.A0K();
            AnonymousClass4GK A034 = this.A04.get();
            try {
                String valueOf2 = String.valueOf(j);
                String[] strArr = new String[7];
                C56922sm.A01(r9, r12, strArr);
                strArr[1] = valueOf2;
                strArr[2] = valueOf2;
                strArr[3] = valueOf2;
                strArr[4] = valueOf2;
                strArr[5] = String.valueOf(r7.A0H());
                strArr[6] = valueOf;
                A034 = r8.get();
                try {
                    Cursor A0E3 = ((AnonymousClass3H0) A034).A03.A0E("   SELECT key_id, from_me, timestamp, receipt_server_timestamp, receipt_device_timestamp, sender_jid_raw_string, sender_jid_row_id, status FROM available_message_view WHERE chat_row_id = ? AND (message_type != '7') AND  (  ( from_me = 0 AND timestamp >= ? ) OR ( from_me = 1 AND (  CASE  WHEN status = 0 THEN 1  WHEN receipt_server_timestamp > 0  THEN receipt_server_timestamp >= ?  WHEN receipt_device_timestamp > 0  THEN receipt_device_timestamp >= ?  WHEN timestamp >= 0  THEN timestamp >= ?  ELSE 0  END  ) ))  AND (status != '7')  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT ?", "SELECT_MESSAGE_KEYS_FROM_C2S_TIMESTAMP_IN_CHAT_SQL", strArr);
                    if (A0E3 != null) {
                        while (A0E3.moveToNext()) {
                            try {
                                C54782pH A022 = A02(A0E3, r12);
                                if (A022 == null) {
                                    Log.e("MessageRangeUtil/createRange unable to create message");
                                } else if (A022.A00 <= 0) {
                                    A0K2.add(A022);
                                } else {
                                    A0K.add(A022);
                                }
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                        A0E3.close();
                    }
                    A034.close();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    long millis = timeUnit.toMillis(timeUnit2.toSeconds(j));
                    long millis2 = timeUnit.toMillis(timeUnit2.toSeconds(j2));
                    if (millis2 <= millis) {
                        millis2 = 0;
                    }
                    return new AnonymousClass35N(A0K, A0K2, millis, millis2);
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
            } finally {
                th = th;
                A034.close();
            }
            throw th;
            throw th;
            throw th;
        } catch (Throwable th5) {
            th = th5;
            A032.close();
            throw th;
        }
    }

    public void A05(AnonymousClass35N r8) {
        long A0H = this.A01.A0H();
        long j = r8.A00;
        if (j > A0H || r8.A01 > A0H) {
            C55682qk r6 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("currentTs=");
            A0o.append(A0H);
            A0o.append("; msgTs=");
            A0o.append(j);
            A0o.append("; sysMsgTs=");
            r6.A0A("invalid_syncD_range_ts", false, AnonymousClass001.A0k(A0o, r8.A01));
        }
    }

    public AnonymousClass33E(C55682qk r1, C56612sH r2, C66543Lv r3, C623334p r4, C72303dV r5, C623934v r6) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(android.database.Cursor r6, boolean r7) {
        /*
            java.lang.String r5 = "timestamp"
            if (r7 == 0) goto L_0x002e
            java.lang.String r0 = "status"
            int r0 = X.AnonymousClass0x2.A04(r6, r0)
            r3 = 0
            if (r0 != 0) goto L_0x0011
            return r3
        L_0x0011:
            java.lang.String r0 = "receipt_server_timestamp"
            long r1 = X.AnonymousClass0x2.A0C(r6, r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            java.lang.String r0 = "receipt_device_timestamp"
            int r0 = r6.getColumnIndex(r0)
            if (r0 < 0) goto L_0x002e
            long r1 = r6.getLong(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
        L_0x002d:
            return r1
        L_0x002e:
            long r0 = X.AnonymousClass0x2.A0C(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33E.A01(android.database.Cursor, boolean):long");
    }
}
