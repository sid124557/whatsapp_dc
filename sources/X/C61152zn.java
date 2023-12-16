package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2zn  reason: invalid class name and case insensitive filesystem */
public class C61152zn {
    public final C623334p A00;
    public final C72303dV A01;
    public final AnonymousClass1VX A02;

    public void A02(C28011fL r7) {
        long A05 = this.A00.A05(r7);
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18270x1.A1S(A1Y, A05);
        C85284Fq A04 = this.A01.A04();
        try {
            ((AnonymousClass3H0) A04).A03.A07("group_past_participant_user", "group_jid_row_id = ?", "deletePastParticipant/DELETE_PAST_PARTICIPANT_GROUP", A1Y);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A03(C28011fL r7, UserJid userJid) {
        C623334p r0 = this.A00;
        long A05 = r0.A05(r7);
        long A052 = r0.A05(userJid);
        String[] A1Z = AnonymousClass0x9.A1Z();
        C18270x1.A1S(A1Z, A05);
        AnonymousClass0x2.A1S(A1Z, 1, A052);
        C85284Fq A04 = this.A01.A04();
        try {
            ((AnonymousClass3H0) A04).A03.A07("group_past_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", "deletePastParticipant/DELETE_PAST_PARTICIPANT_USER", A1Z);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A04(C28011fL r7, UserJid userJid, long j, boolean z) {
        C623334p r2 = this.A00;
        long A05 = r2.A05(r7);
        long A052 = r2.A05(userJid);
        ContentValues A06 = C18300x5.A06();
        C18270x1.A0c(A06, "group_jid_row_id", A05);
        C18270x1.A0c(A06, "user_jid_row_id", A052);
        AnonymousClass0x2.A0o(A06, "is_leave", z);
        C18270x1.A0c(A06, "timestamp", j);
        C85284Fq A04 = this.A01.A04();
        try {
            ((AnonymousClass3H0) A04).A03.A0C("group_past_participant_user", "insertOrUpdatePastParticipant/INSERT_PAST_PARTICIPANT_USER", A06, 5);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C61152zn(C623334p r1, C72303dV r2, AnonymousClass1VX r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final List A00(Cursor cursor) {
        ArrayList A0s = AnonymousClass001.A0s();
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("group_jid_row_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("user_jid_row_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("is_leave");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("timestamp");
        while (cursor2.moveToNext()) {
            A0s.add(new C42862Pu(cursor2.getLong(columnIndexOrThrow), cursor2.getLong(columnIndexOrThrow2), cursor2.getLong(columnIndexOrThrow4), AnonymousClass000.A1S((cursor2.getLong(columnIndexOrThrow3) > 0 ? 1 : (cursor2.getLong(columnIndexOrThrow3) == 0 ? 0 : -1)))));
        }
        return A0s;
    }

    public final Map A01(List list) {
        HashSet A0K = AnonymousClass002.A0K();
        HashSet A0K2 = AnonymousClass002.A0K();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42862Pu r2 = (C42862Pu) it.next();
            AnonymousClass0x2.A1Q(A0K, r2.A00);
            AnonymousClass0x2.A1Q(A0K2, r2.A02);
        }
        C623334p r1 = this.A00;
        Map A0D = r1.A0D(C28011fL.class, A0K);
        Map A0D2 = r1.A0D(UserJid.class, A0K2);
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C42862Pu r22 = (C42862Pu) it2.next();
            C28011fL r8 = (C28011fL) C18280x3.A0W(A0D, r22.A00);
            UserJid userJid = (UserJid) C18280x3.A0W(A0D2, r22.A02);
            if (!(userJid == null || r8 == null)) {
                ((List) C18310x6.A0h(r8, A0t)).add(new C42852Pt(r8, userJid, r22.A01, r22.A03));
            }
        }
        return A0t;
    }
}
