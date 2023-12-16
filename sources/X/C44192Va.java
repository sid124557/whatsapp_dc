package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Va  reason: invalid class name and case insensitive filesystem */
public class C44192Va {
    public final C72303dV A00;

    public C44192Va(C72303dV r1) {
        this.A00 = r1;
    }

    public final Map A00() {
        Cursor A01;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass4GK A03 = this.A00.get();
        try {
            A01 = C56862sg.A01(((AnonymousClass3H0) A03).A03, "SELECT seq, name FROM SQLITE_SEQUENCE", "SequencesHandler/GET_ALL_SEQUENCES");
            int columnIndexOrThrow = A01.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int columnIndexOrThrow2 = A01.getColumnIndexOrThrow("seq");
            while (A01.moveToNext()) {
                AnonymousClass0x2.A1J(A01.getString(columnIndexOrThrow), A0t, A01.getLong(columnIndexOrThrow2));
            }
            A01.close();
            A03.close();
            return A0t;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
