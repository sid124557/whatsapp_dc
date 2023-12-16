package X;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2WC  reason: invalid class name */
public class AnonymousClass2WC {
    public final AnonymousClass1RE A00;

    public AnonymousClass2WC(AnonymousClass1RE r1) {
        this.A00 = r1;
    }

    public Set A00() {
        Cursor A01;
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass4GK A0B = this.A00.get();
        try {
            A01 = C56862sg.A01(((AnonymousClass3H0) A0B).A03, "SELECT DISTINCT collection_name FROM missing_keys", "SyncdMissingKeysTable.COLLECTIONS_WAITING_FOR_KEY");
            while (A01.moveToNext()) {
                A0K.add(AnonymousClass0x2.A0Z(A01, "collection_name"));
            }
            A01.close();
            A0B.close();
            return A0K;
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
}
