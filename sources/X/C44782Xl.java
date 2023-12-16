package X;

import android.database.Cursor;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.2Xl  reason: invalid class name and case insensitive filesystem */
public class C44782Xl {
    public final C623334p A00;
    public final AnonymousClass1RI A01;

    public Integer A00(GroupJid groupJid) {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A01.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A0B).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, this.A00.A05(groupJid));
            A0E = r4.A0E("SELECT member_count FROM group_membership_count WHERE jid_row_id = ?", "GET_GROUP_MEMBER_COUNT", A1Y);
            if (A0E.moveToNext()) {
                Integer valueOf = Integer.valueOf(AnonymousClass0x2.A04(A0E, "member_count"));
                A0E.close();
                A0B.close();
                return valueOf;
            }
            A0E.close();
            A0B.close();
            return null;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C44782Xl(C623334p r1, AnonymousClass1RI r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
