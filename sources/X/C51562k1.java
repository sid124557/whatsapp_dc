package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2k1  reason: invalid class name and case insensitive filesystem */
public class C51562k1 {
    public final C623334p A00;
    public final C72303dV A01;

    public static void A00(Object obj, Object obj2, Object obj3) {
        ((AnonymousClass3H0) obj3).A03.A07("parent_group_participants", "parent_group_jid_row_id = ? AND user_jid_row_id = ?", "parent_group_participants_store/DELETE_OLD_PARTICIPANT", new String[]{String.valueOf(obj), String.valueOf(obj2)});
    }

    public synchronized void A02(C27991fJ r13, List list) {
        C85284Fq A04 = this.A01.A04();
        try {
            C623334p r8 = this.A00;
            long A05 = r8.A05(r13);
            Long valueOf = Long.valueOf(A05);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long A052 = r8.A05(C18310x6.A0T(it));
                Long valueOf2 = Long.valueOf(A052);
                if (!(A05 == -1 || A052 == -1)) {
                    A00(valueOf, valueOf2, A04);
                }
            }
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return;
        throw th;
    }

    public synchronized void A03(C27991fJ r11, List list, boolean z) {
        HashSet hashSet;
        HashSet A15 = AnonymousClass0x9.A15(A01(r11));
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0x2.A1Q(A0K, this.A00.A05(C18310x6.A0T(it)));
        }
        HashSet A152 = AnonymousClass0x9.A15(A0K);
        AnonymousClass367.A01(new AnonymousClass4KD(A15, 2), A152);
        if (z) {
            hashSet = AnonymousClass002.A0K();
        } else {
            hashSet = AnonymousClass0x9.A15(A15);
        }
        AnonymousClass367.A01(new AnonymousClass4KD(A0K, 2), hashSet);
        if (A152.size() != 0 || hashSet.size() != 0) {
            C85284Fq A04 = this.A01.A04();
            try {
                Long A03 = C623334p.A03(this.A00, r11);
                Iterator it2 = A152.iterator();
                while (it2.hasNext()) {
                    ContentValues A07 = AnonymousClass0x9.A07(2);
                    A07.put("parent_group_jid_row_id", A03);
                    AnonymousClass3H0.A00(A07, (Long) it2.next(), A04, "user_jid_row_id").A0C("parent_group_participants", "parent_group_participants_store/INSERT_NEW_PARTICIPANT", A07, 5);
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    A00(A03, (Long) it3.next(), A04);
                }
                A04.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return;
        throw th;
    }

    public final List A01(C27991fJ r9) {
        Cursor A0E;
        long A05 = this.A00.A05(r9);
        try {
            AnonymousClass4GK A03 = this.A01.get();
            try {
                A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT user_jid_row_id FROM parent_group_participants WHERE parent_group_jid_row_id= ?", "linkedGroupParticipantsStore/getParticipantsForParentGroupJid", C18260x0.A1b(A05));
                ArrayList A0s = AnonymousClass001.A0s();
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("user_jid_row_id");
                while (A0E.moveToNext()) {
                    C18260x0.A0H(A0E, A0s, columnIndexOrThrow);
                }
                A0E.close();
                A03.close();
                return A0s;
            } catch (Throwable th) {
                A03.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("linkedGroupParticipantsStore/getParticipantsForParentGroupJid", e);
            return AnonymousClass001.A0s();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public C51562k1(C623334p r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
