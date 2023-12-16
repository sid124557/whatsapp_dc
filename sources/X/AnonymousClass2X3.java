package X;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2X3  reason: invalid class name */
public class AnonymousClass2X3 {
    public final C183538qC A00;

    public AnonymousClass2X3(C183538qC r1) {
        this.A00 = r1;
    }

    public Set A00() {
        Cursor A01;
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass4GK A04 = C18630y0.A04(this.A00);
        try {
            A01 = C56862sg.A01(((AnonymousClass3H0) A04).A03, "SELECT pack_id FROM new_sticker_packs", "getNewStickerPackIds/QUERY_NEW_STICKER_PACK");
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
