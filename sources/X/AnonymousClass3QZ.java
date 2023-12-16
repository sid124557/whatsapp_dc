package X;

import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3QZ  reason: invalid class name */
public final class AnonymousClass3QZ implements AnonymousClass4DA {
    public final C69183Wa A00;

    public AnonymousClass3QZ(C69183Wa r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean BFA(Message message, int i) {
        AnonymousClass36K r1;
        C162457s7.A0J(message, 1);
        if (i == 249) {
            Object obj = message.obj;
            if ((obj instanceof AnonymousClass36K) && (r1 = (AnonymousClass36K) obj) != null) {
                List A0s = r1.A0s("notice");
                ArrayList A0t = C18300x5.A0t(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    String A0L = AnonymousClass36K.A0L(C18310x6.A0Y(it), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (A0L != null) {
                        A0t.add(A0L);
                    }
                }
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it2 = A0t.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((String) next).length() > 0) {
                        A0s2.add(next);
                    }
                }
                this.A00.A02(A0s2, 0);
                return true;
            }
        }
        return false;
    }

    public int[] B81() {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 249;
        return A0E;
    }
}
