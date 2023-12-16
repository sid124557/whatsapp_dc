package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2eF  reason: invalid class name and case insensitive filesystem */
public class C48042eF {
    public final AnonymousClass1RC A00;

    public String A00(String str) {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A00.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A0B).A03;
            String[] A1a = C18300x5.A1a(str, 2);
            C18270x1.A1R(A1a, System.currentTimeMillis());
            A0E = r4.A0E("SELECT file_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?", "SharedMediaIdsStore/getSharedFileByUUID", A1a);
            if (!A0E.moveToNext()) {
                A0E.close();
                A0B.close();
                return null;
            }
            String A0Z = AnonymousClass0x2.A0Z(A0E, "file_name");
            A0E.close();
            A0B.close();
            return A0Z;
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

    public void A01(String str, String str2, String str3, String str4) {
        C85284Fq A0C = this.A00.A0C();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            A06.put("item_uuid", str);
            A06.put("file_name", str2);
            A06.put("mime_type", str3);
            C621833x.A02(A06, "display_name", str4);
            AnonymousClass3H0.A03(A06, A0C, "expiration_timestamp", String.valueOf(System.currentTimeMillis() + 3600000)).A08("shared_media_ids", "INSERT_SHARED_MEDIA", A06);
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C48042eF(AnonymousClass1RC r1) {
        this.A00 = r1;
    }
}
