package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2gv  reason: invalid class name and case insensitive filesystem */
public class C49682gv {
    public final C55682qk A00;
    public final C623334p A01;
    public final C72303dV A02;
    public final C56082rO A03;

    public void A00(C30441mS r8) {
        Cursor A0E;
        C624134x.A0V(r8, "RevokedMessageStore/fillRevokedInfo/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r8.A1L > 0 ? 1 : (r8.A1L == 0 ? 0 : -1))));
        String[] strArr = new String[1];
        C624134x.A0X(r8, strArr);
        AnonymousClass4GK A032 = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT revoked_key_id,admin_jid_row_id,revoke_timestamp FROM message_revoked WHERE message_row_id = ?", "GET_REVOKED_MESSAGE_BY_ROW_ID_SQL", strArr);
            if (A0E.moveToNext()) {
                r8.A01 = AnonymousClass0x2.A0Z(A0E, "revoked_key_id");
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("admin_jid_row_id");
                if (!A0E.isNull(columnIndexOrThrow)) {
                    long j = A0E.getLong(columnIndexOrThrow);
                    if (Long.valueOf(j) != null) {
                        if (r8 instanceof C30961nV) {
                            UserJid A022 = C623334p.A02(this.A01, UserJid.class, j);
                            C626936e.A06(A022);
                            ((C30961nV) r8).A1v(A022);
                        } else {
                            this.A00.A0A("RevokedMessageStore/fillRevokedInfo invalid cast", true, Integer.toString(r8.A1I));
                        }
                    }
                }
                r8.A00 = AnonymousClass0x2.A0C(A0E, "revoke_timestamp");
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

    public void A01(C30441mS r10) {
        Long l;
        UserJid userJid;
        boolean z = false;
        C18260x0.A0l(C624134x.A09(r10, "RevokedMessageStore/insertOrUpdateRevokedMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r10.A1L > 0 ? 1 : (r10.A1L == 0 ? 0 : -1)))), "RevokedMessageStore/insertOrUpdateRevokedMessage/message in main storage; key=", AnonymousClass001.A0o(), AnonymousClass000.A1U(r10.A0l(), 1));
        C85284Fq A04 = this.A02.A04();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            C624134x.A0F(A06, r10);
            C621833x.A02(A06, "revoked_key_id", r10.A01);
            if (!(r10 instanceof C30961nV) || (userJid = ((C30961nV) r10).A00) == null) {
                l = null;
            } else {
                l = C623334p.A03(this.A01, userJid);
            }
            C621833x.A01(A06, l, "admin_jid_row_id");
            if (AnonymousClass3H0.A00(A06, Long.valueOf(r10.A00), A04, "revoke_timestamp").A0C("message_revoked", "INSERT_MESSAGE_REVOKED_SQL", A06, 5) == r10.A1L) {
                z = true;
            }
            C626936e.A0F(z, "RevokedMessageStore/insertOrUpdateRevokedMessage/inserted row should have same row_id");
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C49682gv(C55682qk r1, C623334p r2, C72303dV r3, C56082rO r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
