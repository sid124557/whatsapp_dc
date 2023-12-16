package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Ll  reason: invalid class name and case insensitive filesystem */
public class C66443Ll implements AnonymousClass485 {
    public final C56612sH A00;
    public final C56922sm A01;
    public final C623334p A02;
    public final C72303dV A03;
    public final AnonymousClass2YF A04;
    public final AnonymousClass4BY A05;

    public Cursor A03(AnonymousClass4GK r7, byte b, long j, long j2, boolean z) {
        String str;
        String[] strArr = new String[5];
        C18260x0.A1W(strArr, b, j);
        AnonymousClass0x2.A1T(strArr, this.A00.A0H());
        AnonymousClass0x2.A1S(strArr, 3, j2);
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C56862sg A042 = AnonymousClass3H0.A04(str, r7, strArr, 4);
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(C625035h.A00(b));
        C18270x1.A1C(" WHERE message_add_on.parent_message_row_id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0o2, A0o);
        A0o.append(" AND ");
        A0o.append("message_add_on");
        A0o.append(".");
        A0o.append("sender_jid_row_id");
        AnonymousClass001.A1K(" = ? AND ", "message_add_on", ".", A0o);
        A0o.append("from_me");
        return A042.A0E(AnonymousClass000.A0X(" = ? ", A0o), "MessageAddOnStore/getMessageAddOnCursorForMessage", strArr);
    }

    public Cursor A04(AnonymousClass4GK r5, AnonymousClass2z0 r6) {
        String[] strArr = new String[4];
        C56922sm.A01(this.A01, AnonymousClass2z0.A01(r6), strArr);
        strArr[1] = r6.A01;
        C18280x3.A1O(strArr, r6.A02 ? 1 : 0);
        return AnonymousClass3H0.A04(String.valueOf(this.A00.A0H()), r5, strArr, 3).A0E(C625035h.A05, "MessageAddOnStore/getSelectMessageAddOnForMessageKeyWithoutExtraTables", strArr);
    }

    public Cursor A01(AnonymousClass4GK r6, byte b, long j) {
        C56862sg r4 = ((AnonymousClass3H0) r6).A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C625035h.A00(b));
        String A0X = AnonymousClass000.A0X(" WHERE message_add_on._id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0o);
        String[] A1a = AnonymousClass0x9.A1a();
        C18260x0.A1W(A1a, b, j);
        AnonymousClass0x2.A1T(A1a, this.A00.A0H());
        return r4.A0E(A0X, "MessageAddOnStore/getMessageAddOnCursorForAddOnRowId", A1a);
    }

    public C30331mH A05(Cursor cursor, HashMap hashMap) {
        String str;
        int A0K = AnonymousClass001.A0K(C18290x4.A0i("from_me", hashMap));
        int A0K2 = AnonymousClass001.A0K(C18290x4.A0i("key_id", hashMap));
        int A0K3 = AnonymousClass001.A0K(C18290x4.A0i("chat_row_id", hashMap));
        int i = 0;
        boolean A1T = AnonymousClass001.A1T(cursor.getInt(A0K));
        String string = cursor.getString(A0K2);
        C95814uZ BLb = this.A05.BLb(this.A01.A0B(cursor.getLong(A0K3)));
        if (BLb == null) {
            str = "MessageAddOnStore/createFMessageFromCursor unexpected jid for MessageAddOn";
        } else {
            AnonymousClass2z0 A052 = AnonymousClass2z0.A05(BLb, string, A1T);
            int A0K4 = AnonymousClass001.A0K(C18290x4.A0i("timestamp", hashMap));
            int A0K5 = AnonymousClass001.A0K(C18290x4.A0i("received_timestamp", hashMap));
            int A0K6 = AnonymousClass001.A0K(C18290x4.A0i("message_add_on_type", hashMap));
            int A0K7 = AnonymousClass001.A0K(C18290x4.A0i("server_timestamp", hashMap));
            int A0K8 = AnonymousClass001.A0K(C18290x4.A0i("expiry_duration_in_secs", hashMap));
            long j = cursor.getLong(A0K4);
            long j2 = cursor.getLong(A0K5);
            long j3 = 0;
            if (j2 == 0) {
                j2 = j;
            }
            byte b = (byte) cursor.getInt(A0K6);
            if (!cursor.isNull(A0K7)) {
                j3 = cursor.getLong(A0K7);
            }
            if (!cursor.isNull(A0K8)) {
                i = cursor.getInt(A0K8);
            }
            C624134x A002 = this.A04.A00(A052, b, j);
            if (!(A002 instanceof C30331mH)) {
                str = "MessageAddOnStore/createFMessageFromCursor read fMessage with not supported messageAddOnType";
            } else {
                if (!A052.A02) {
                    A002.A0I = j2;
                }
                C30331mH r5 = (C30331mH) A002;
                if (r5 instanceof C30561me) {
                    r5.A00 = i;
                    r5.A1w();
                }
                r5.A1x(j3);
                return r5;
            }
        }
        Log.e(str);
        return null;
    }

    public C30331mH A06(C624134x r6, byte b) {
        Cursor A022;
        long j = r6.A1L;
        AnonymousClass4GK A032 = this.A03.get();
        try {
            A022 = A02(A032, b, j);
            if (!A022.moveToNext()) {
                A022.close();
                A032.close();
                return null;
            }
            HashMap A002 = AnonymousClass26E.A00(A022, b);
            C30331mH A052 = A05(A022, A002);
            if (A052 != null) {
                A052.A1y(A022, this.A02, A002);
                C30331mH.A04(r6, A052);
            }
            A022.close();
            A032.close();
            return A052;
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

    public List A07(int i, long j) {
        String A0Y;
        Cursor A0E;
        AnonymousClass4GK A032 = this.A03.get();
        try {
            String[] A1Z = AnonymousClass0x9.A1Z();
            C18270x1.A1S(A1Z, j);
            C18270x1.A1R(A1Z, this.A00.A0H());
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            if (i <= -1) {
                A0Y = "";
            } else {
                A0Y = AnonymousClass000.A0Y(" LIMIT ", AnonymousClass001.A0o(), i);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(C625035h.A00((byte) 79));
            A0o.append(" WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1");
            A0E = r4.A0E(AnonymousClass000.A0V(" ORDER BY CASE WHEN server_timestamp > 0 THEN server_timestamp ELSE timestamp END DESC", A0Y, A0o), "MessageAddOnStore/getMessageAddOnCursorForPinnedMessagesInChat", A1Z);
            ArrayList A0o2 = AnonymousClass000.A0o(A0E);
            while (A0E.moveToNext()) {
                HashMap A002 = AnonymousClass26E.A00(A0E, (byte) 79);
                C30331mH A052 = A05(A0E, A002);
                if (!(A052 instanceof C30561me)) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "MessageAddOnStore/getMessageAddOnsForPinnedMessagesInChat Unexpected FMessage ", A052);
                } else {
                    A052.A1y(A0E, this.A02, A002);
                    A0o2.add((C30561me) A052);
                }
            }
            A0E.close();
            A032.close();
            return A0o2;
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

    public void A08(long j) {
        C85284Fq A042 = this.A03.A04();
        try {
            String[] strArr = new String[1];
            C18260x0.A1X(strArr, j);
            ((AnonymousClass3H0) A042).A03.A07("message_add_on", "_id = ?", "MessageAddOnStore/deleteMessageAddOn", strArr);
            A042.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C66443Ll(C56612sH r1, C56922sm r2, C623334p r3, C72303dV r4, AnonymousClass2YF r5, AnonymousClass4BY r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r1;
    }

    public long A00(C30331mH r17) {
        long j;
        Cursor A0E;
        long j2;
        long j3;
        int i;
        Integer num;
        int i2;
        Integer valueOf;
        long j4;
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        C30331mH r4 = r17;
        AnonymousClass2z0 A08 = C624134x.A08(r4, "MessageAddOnStore/getRowIdOfDecryptionFailurePlaceholder/key: ", A0o);
        String str2 = A08.A01;
        C18260x0.A1J(A0o, str2);
        boolean z = A08.A02;
        String valueOf2 = String.valueOf(z ? 1 : 0);
        C56922sm r6 = this.A01;
        C95814uZ A012 = AnonymousClass2z0.A01(A08);
        String valueOf3 = String.valueOf(r6.A07(A012));
        C95814uZ A0n = r4.A0n();
        if (A0n != null) {
            j = this.A02.A05(A0n);
        } else {
            j = -1;
        }
        String valueOf4 = String.valueOf(j);
        C72303dV r3 = this.A03;
        AnonymousClass4GK A032 = r3.get();
        try {
            C56862sg r10 = ((AnonymousClass3H0) A032).A03;
            String str3 = C625035h.A01;
            String[] strArr = new String[4];
            C18260x0.A0i(str2, valueOf2, valueOf3, strArr);
            strArr[3] = valueOf4;
            A0E = r10.A0E(str3, "SELECT_ROW_ID_OF_PLACEHOLDER", strArr);
            if (A0E.moveToNext()) {
                j2 = C18270x1.A01(A0E);
                A0E.close();
                A032.close();
            } else {
                A0E.close();
                A032.close();
                j2 = -1;
            }
            if (j2 > 0) {
                ContentValues A06 = AnonymousClass0x9.A06();
                A06.put("parent_message_row_id", Long.valueOf(r4.A02));
                C18280x3.A0m(A06, r4.A0D);
                A06.put("message_add_on_type", Byte.valueOf(r4.A1I));
                A06.put("received_timestamp", Long.valueOf(r4.A0I));
                boolean z2 = r4 instanceof C30561me;
                if (z2) {
                    i2 = r4.A00;
                } else {
                    i2 = 0;
                }
                Long l = null;
                if (i2 <= 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(i2);
                }
                A06.put("expiry_duration_in_secs", valueOf);
                if (z2) {
                    long j5 = r4.A01;
                    if (j5 > 0) {
                        l = Long.valueOf(j5);
                    }
                }
                A06.put("expiry_timestamp", l);
                C95814uZ A0n2 = r4.A0n();
                if (A0n2 != null) {
                    j4 = this.A02.A05(A0n2);
                } else {
                    j4 = -1;
                }
                String[] A1a = C18300x5.A1a(str2, 4);
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                A1a[1] = str;
                C626936e.A06(A012);
                AnonymousClass0x2.A1T(A1a, r6.A07(A012));
                AnonymousClass0x2.A1S(A1a, 3, j4);
                C85284Fq A042 = r3.A04();
                try {
                    ((AnonymousClass3H0) A042).A03.A05(A06, "message_add_on", "message_add_on_type=11 AND key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", "MessageAddOnStore/updateMessageAddOnAfterRetry", A1a);
                    A042.close();
                    return j2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            } else {
                C85284Fq A043 = r3.A04();
                try {
                    ContentValues A07 = AnonymousClass0x9.A07(15);
                    C626936e.A06(A012);
                    C18270x1.A0c(A07, "chat_row_id", r6.A07(A012));
                    AnonymousClass0x2.A0o(A07, "from_me", z);
                    A07.put("key_id", str2);
                    C95814uZ A0n3 = r4.A0n();
                    if (A0n3 != null) {
                        j3 = this.A02.A05(A0n3);
                    } else {
                        j3 = -1;
                    }
                    C18270x1.A0c(A07, "sender_jid_row_id", j3);
                    C18270x1.A0c(A07, "parent_message_row_id", r4.A02);
                    C18270x1.A0c(A07, "timestamp", r4.A0K);
                    C18270x1.A0b(A07, "status", r4.A0D);
                    A07.put("message_add_on_type", Byte.valueOf(r4.A1I));
                    C18270x1.A0c(A07, "received_timestamp", r4.A0I);
                    boolean z3 = r4 instanceof C30561me;
                    if (z3) {
                        i = r4.A00;
                    } else {
                        i = 0;
                    }
                    Long l2 = null;
                    if (i <= 0) {
                        num = null;
                    } else {
                        num = Integer.valueOf(i);
                    }
                    A07.put("expiry_duration_in_secs", num);
                    if (z3) {
                        long j6 = r4.A01;
                        if (j6 > 0) {
                            l2 = Long.valueOf(j6);
                        }
                    }
                    A07.put("expiry_timestamp", l2);
                    long A0C = AnonymousClass3H0.A02(A07, A043, "server_timestamp", r4.A03).A0C("message_add_on", "MessageAddOnStore/insertMessageAddOn", A07, 4);
                    r4.A1L = A0C;
                    A043.close();
                    return A0C;
                } catch (Throwable th2) {
                    th = th2;
                    A043.close();
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            A032.close();
            throw th;
        }
        throw th;
    }

    public Cursor A02(AnonymousClass4GK r5, byte b, long j) {
        String[] A1a = AnonymousClass0x9.A1a();
        C18260x0.A1W(A1a, b, j);
        AnonymousClass0x2.A1T(A1a, this.A00.A0H());
        C56862sg r2 = ((AnonymousClass3H0) r5).A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C625035h.A00(b));
        return r2.A0E(AnonymousClass000.A0X(" WHERE message_add_on.parent_message_row_id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0o), "GET_MESSAGE_ADD_ON_FOR_PARENT_MESSAGE_SQL", A1a);
    }

    public void A09(Set set, int i) {
        C69833Yo Axl;
        ContentValues A06 = AnonymousClass0x9.A06();
        C18270x1.A0b(A06, "status", i);
        C85284Fq A042 = this.A03.A04();
        try {
            Axl = A042.Axl();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass2z0 r3 = (AnonymousClass2z0) it.next();
                String[] A1a = AnonymousClass0x9.A1a();
                C56922sm.A01(this.A01, AnonymousClass2z0.A01(r3), A1a);
                A1a[1] = AnonymousClass2z0.A08(r3);
                AnonymousClass3H0.A04(r3.A01, A042, A1a, 2).A05(A06, "message_add_on", "chat_row_id = ? AND from_me = ? AND key_id = ?", "MessageAddOnStore/updateMessageAddOnsStatusForKeys", A1a);
            }
            Axl.A00();
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
}
