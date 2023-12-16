package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2qs  reason: invalid class name and case insensitive filesystem */
public class C55762qs {
    public final C56922sm A00;
    public final C623334p A01;
    public final C72303dV A02;

    public long A00(C27991fJ r8, UserJid userJid) {
        Cursor A0E;
        long j = -1;
        if (r8 == null || userJid == null) {
            return -1;
        }
        String[] A1Z = AnonymousClass0x9.A1Z();
        C623334p r2 = this.A01;
        C18260x0.A1Y(A1Z, r2.A05(r8));
        C18280x3.A1T(A1Z, r2.A05(userJid));
        AnonymousClass4GK A03 = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT message_row_id FROM message_group_invite WHERE group_jid_row_id = ? AND admin_jid_row_id = ? AND expired = 0 ORDER BY invite_time DESC", "GET_LAST_GROUP_INVITE_MESSAGE_BY_GROUP_AND_ADMIN_SQL", A1Z);
            if (A0E.moveToNext()) {
                j = AnonymousClass0x2.A0C(A0E, "message_row_id");
            }
            A0E.close();
            A03.close();
            return j;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A01(C27991fJ r8, UserJid userJid) {
        Cursor A0E;
        long j = -1;
        if (r8 == null || userJid == null) {
            return -1;
        }
        String[] A1Z = AnonymousClass0x9.A1Z();
        C18260x0.A1Y(A1Z, this.A01.A05(r8));
        C18280x3.A1T(A1Z, this.A00.A07(userJid));
        AnonymousClass4GK A03 = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT invite.message_row_id AS message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND message.chat_row_id = ? AND invite.expired = 0 ORDER BY invite.invite_time DESC", "GET_LAST_SENT_GROUP_INVITE_MESSAGE_BY_GROUP_AND_REMOTE_SQL", A1Z);
            if (A0E.moveToNext()) {
                j = AnonymousClass0x2.A0C(A0E, "message_row_id");
            }
            A0E.close();
            A03.close();
            return j;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A04(C30391mN r7) {
        C85284Fq A04 = this.A02.A04();
        try {
            ((AnonymousClass3H0) A04).A03.A0C("message_group_invite", "INSERT_GROUP_INVITE_MESSAGE_SQL", A02(r7, r7.A1L), 5);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A05(C30391mN r7, long j) {
        C85284Fq A04 = this.A02.A04();
        try {
            ((AnonymousClass3H0) A04).A03.A0C("message_quoted_group_invite", "INSERT_QUOTED_GROUP_INVITE_MESSAGE_SQL", A02(r7, j), 5);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C55762qs(C56922sm r1, C623334p r2, C72303dV r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final ContentValues A02(C30391mN r5, long j) {
        String l;
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("message_row_id", Long.toString(j));
        C27991fJ r1 = r5.A02;
        String str = null;
        if (r1 == null) {
            l = null;
        } else {
            l = Long.toString(this.A01.A05(r1));
        }
        A06.put("group_jid_row_id", l);
        UserJid userJid = r5.A03;
        if (userJid != null) {
            str = Long.toString(this.A01.A05(userJid));
        }
        A06.put("admin_jid_row_id", str);
        A06.put("group_name", r5.A05);
        A06.put("invite_code", r5.A06);
        A06.put("expiration", Long.valueOf(r5.A01));
        A06.put("invite_time", Long.valueOf(r5.A0K));
        A06.put("expired", Integer.valueOf(r5.A07 ? 1 : 0));
        A06.put("group_type", Integer.valueOf(r5.A00));
        return A06;
    }

    public void A03(C30391mN r15) {
        Cursor A0E;
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18260x0.A1Y(A1Y, r15.A1L);
        AnonymousClass4GK A03 = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration , expired , group_type FROM message_group_invite WHERE message_row_id = ?", "GET_GROUP_INVITE_MESSAGE_BY_ROW_ID_SQL", A1Y);
            if (A0E.moveToNext()) {
                long A0C = AnonymousClass0x2.A0C(A0E, "expiration");
                long A0C2 = AnonymousClass0x2.A0C(A0E, "group_jid_row_id");
                long A0C3 = AnonymousClass0x2.A0C(A0E, "admin_jid_row_id");
                String A0Z = AnonymousClass0x2.A0Z(A0E, "group_name");
                String A0Z2 = AnonymousClass0x2.A0Z(A0E, "invite_code");
                int A04 = AnonymousClass0x2.A04(A0E, "expired");
                int A042 = AnonymousClass0x2.A04(A0E, "group_type");
                C623334p r11 = this.A01;
                C27991fJ r6 = (C27991fJ) r11.A0B(C27991fJ.class, A0C2);
                UserJid A022 = C623334p.A02(r11, UserJid.class, A0C3);
                if (r6 == null || A022 == null) {
                    Log.e("GroupInviteMessageStore/fillGroupInviteInfo/could not fill group invite data as groupJid and/or adminJid are null");
                } else {
                    boolean A1S = AnonymousClass000.A1S(A04);
                    r15.A02 = r6;
                    r15.A03 = A022;
                    r15.A05 = A0Z;
                    r15.A06 = A0Z2;
                    r15.A01 = A0C;
                    r15.A07 = A1S;
                    r15.A00 = A042;
                }
            }
            A0E.close();
            A03.close();
            return;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
