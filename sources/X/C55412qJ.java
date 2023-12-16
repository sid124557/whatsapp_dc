package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2qJ  reason: invalid class name and case insensitive filesystem */
public class C55412qJ {
    public final C52852m9 A00;
    public final C56922sm A01;
    public final C56982ss A02;
    public final C623334p A03;
    public final C55272q5 A04;
    public final C72303dV A05;

    public boolean A04(C95814uZ r4, int i) {
        AnonymousClass31A A002 = C56982ss.A00(this.A02, r4);
        if (A002 == null) {
            C18260x0.A1R(AnonymousClass001.A0o(), "groupchatstore/updateGroupChatInfoGroupTypeIfExist/chat does not exist: ", r4);
            return false;
        }
        Log.i("groupchatstore/updateGroupChatInfoGroupTypeInBackgroundIfExist/update group type");
        A002.A02 = i;
        return A03(A002, r4, (Long) null);
    }

    public UserJid A00(C27991fJ r8) {
        Cursor A0E;
        UserJid userJid;
        try {
            AnonymousClass4GK A032 = this.A05.get();
            try {
                C56862sg r3 = ((AnonymousClass3H0) A032).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                C56922sm.A01(this.A01, r8, A1Y);
                A0E = r3.A0E("SELECT sender_jid_row_id, sender_jid_raw_string FROM message_system_group AS system_group JOIN message_system AS message_system JOIN available_message_view AS message WHERE message_system.message_row_id = system_group.message_row_id AND message_system.message_row_id = message._id AND message.chat_row_id = ? AND message.message_type = '7' AND message.from_me = 1 AND (message_system.action_type = 12 OR message_system.action_type = 124 OR message_system.action_type = 144 OR message_system.action_type = 127) AND system_group.is_me_joined = 1 ORDER BY _id DESC LIMIT 1", "GET_GROUP_ADDER_JID_SQL", A1Y);
                if (A0E != null) {
                    if (A0E.moveToNext()) {
                        int columnIndexOrThrow = A0E.getColumnIndexOrThrow("sender_jid_row_id");
                        if (!A0E.isNull(columnIndexOrThrow)) {
                            long j = A0E.getLong(columnIndexOrThrow);
                            if (j >= 0) {
                                userJid = AnonymousClass32Y.A02(this.A03, j);
                                A0E.close();
                                A032.close();
                                return userJid;
                            }
                        }
                        userJid = AnonymousClass32Y.A08(AnonymousClass0x2.A0Z(A0E, "sender_jid_raw_string"));
                        A0E.close();
                        A032.close();
                        return userJid;
                    }
                    A0E.close();
                }
                A032.close();
                return null;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A04.A04();
            return null;
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e2);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public final boolean A03(AnonymousClass31A r8, C95814uZ r9, Long l) {
        ContentValues A0E;
        try {
            C85284Fq A042 = this.A05.A04();
            try {
                C69833Yo Axl = A042.Axl();
                try {
                    C56922sm r4 = this.A01;
                    synchronized (r8) {
                        A0E = C18290x4.A0E();
                        if (l != null) {
                            A0E.put("created_timestamp", l);
                        }
                        A0E.put("subject", r8.A0h);
                        C18270x1.A0b(A0E, "group_type", r8.A02);
                        C48742fO r0 = r8.A0e;
                        if (r0 != null) {
                            C18270x1.A0b(A0E, "growth_lock_level", r0.A00);
                            C18270x1.A0c(A0E, "growth_lock_expiration_ts", r8.A0e.A01);
                        }
                    }
                    if (!r4.A0N(A0E, r8)) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "msgstore/addmsg/chatlist/insert/failed jid=", r9);
                    }
                    Axl.A00();
                    Axl.close();
                    A042.close();
                    return true;
                } catch (Throwable th) {
                    Axl.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A042.close();
                throw th2;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A04.A04();
            return false;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    public C55412qJ(C52852m9 r1, C56922sm r2, C56982ss r3, C623334p r4, C55272q5 r5, C72303dV r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A04 = r5;
    }

    public void A01(C95814uZ r4, String str) {
        C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/updategroupchatsubject/", r4);
        this.A00.A01(new C117715sN(this, r4, str, 39), 37);
    }

    public void A02(C27991fJ r12, C48742fO r13, String str, int i, long j) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("msgstore/updategroupchat/");
        A0o.append(r12);
        A0o.append(" creation=");
        long j2 = j;
        A0o.append(j2);
        A0o.append(" groupType='");
        A0o.append(i);
        C18260x0.A1L(A0o, "'");
        this.A00.A01(new C70783b3(this, r12, r13, str, i, 1, j2), 38);
    }
}
