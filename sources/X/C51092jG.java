package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2jG  reason: invalid class name and case insensitive filesystem */
public class C51092jG {
    public final C183538qC A00;

    public void A01(C50612iT r7) {
        C85284Fq A08 = C18630y0.A08(this.A00);
        try {
            String[] strArr = new String[1];
            AnonymousClass3H0.A04(r7.A0G, A08, strArr, 0).A07("unseen_sticker_packs", "pack_id = ?", "markPackAsSeen/DELETE_UNSEEN_STICKER_PACK", strArr);
            A08.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A02(String str) {
        C85284Fq A08 = C18630y0.A08(this.A00);
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            AnonymousClass3H0.A03(A06, A08, "pack_id", str).A0C("unseen_sticker_packs", "markPackAsUnseen/INSERT_UNSEEN_STICKER_PACK", A06, 5);
            A08.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C51092jG(C183538qC r1) {
        this.A00 = r1;
    }

    public Set A00() {
        Cursor A01;
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass4GK A04 = C18630y0.A04(this.A00);
        try {
            A01 = C56862sg.A01(((AnonymousClass3H0) A04).A03, "SELECT pack_id FROM unseen_sticker_packs", "getUnseenStickerPackIds/QUERY_UNSEEN_STICKER_PACK");
            int columnIndexOrThrow = A01.getColumnIndexOrThrow("pack_id");
            while (A01.moveToNext()) {
                A0K.add(A01.getString(columnIndexOrThrow));
            }
            A01.close();
            A04.close();
            return A0K;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
