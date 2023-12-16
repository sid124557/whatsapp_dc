package X;

import android.database.Cursor;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2c1  reason: invalid class name and case insensitive filesystem */
public class C46672c1 {
    public final C56972sr A00;
    public final C66543Lv A01;
    public final C55762qs A02;
    public final AnonymousClass33S A03;
    public final C55832qz A04;
    public final AnonymousClass4FS A05;

    public List A00(C27991fJ r8, long j) {
        Cursor A0E;
        C55762qs r6 = this.A02;
        PhoneUserJid A052 = C56972sr.A05(this.A00);
        ArrayList A0s = AnonymousClass001.A0s();
        String[] A1a = AnonymousClass0x9.A1a();
        C623334p r2 = r6.A01;
        C18260x0.A1Y(A1a, r2.A05(r8));
        C18280x3.A1T(A1a, r2.A05(A052));
        C18280x3.A1R(A1a, 2, j);
        AnonymousClass4GK A032 = r6.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT chat_row_id, message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND invite.admin_jid_row_id = ? AND invite.expiration > ? AND invite.expired = 0", "GET_UNEXPIRED_INVITE_MESSAGES_FOR_GROUP_SQL", A1a);
            while (A0E.moveToNext()) {
                C18260x0.A0H(A0E, A0s, A0E.getColumnIndexOrThrow("message_row_id"));
            }
            A0E.close();
            A032.close();
            ArrayList A0y = C18290x4.A0y(A0s);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                C624134x A002 = C55122pp.A00(this.A04, ((Number) it.next()).longValue());
                if (A002 != null) {
                    A0y.add(A002);
                }
            }
            return A0y;
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

    public C46672c1(C56972sr r1, C66543Lv r2, C55762qs r3, AnonymousClass33S r4, C55832qz r5, AnonymousClass4FS r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }
}
