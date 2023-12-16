package X;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;

/* renamed from: X.7lp  reason: invalid class name and case insensitive filesystem */
public class C159437lp {
    public static void A00(C184118rH r6, C48412er r7, String str) {
        String str2;
        JsonReader jsonReader;
        if (r7 != null) {
            r7.A00("START_PARSE");
        }
        try {
            jsonReader = new JsonReader(new StringReader(str));
            AnonymousClass8D3 r0 = new AnonymousClass8D3(jsonReader);
            r0.BLY();
            AnonymousClass000.A0A().post(new C172708Mj(AnonymousClass73K.A00(r0), r6, r7, 45));
            jsonReader.close();
            return;
        } catch (IOException e) {
            r6.BSF(e.getMessage());
            if (r7 == null) {
                return;
            }
            r7.A00("END_PARSE_FAIL");
            return;
        } catch (OutOfMemoryError e2) {
            if (e2.getMessage() != null) {
                str2 = e2.getMessage();
            } else {
                str2 = "OutOfMemoryError";
            }
            r6.BSF(str2);
            if (r7 == null) {
                return;
            }
            r7.A00("END_PARSE_FAIL");
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void A01(C184128rI r5, C48412er r6, String str) {
        JsonReader jsonReader;
        if (r6 != null) {
            r6.A00("START_PARSE");
        }
        try {
            jsonReader = new JsonReader(new StringReader(str));
            AnonymousClass8D3 r0 = new AnonymousClass8D3(jsonReader);
            r0.BLY();
            AnonymousClass000.A0A().post(new C172708Mj(AnonymousClass73K.A00(r0), r5, r6, 46));
            jsonReader.close();
            return;
        } catch (IOException e) {
            r5.BSF(e.getMessage());
            if (r6 != null) {
                r6.A00("END_PARSE_FAIL");
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
