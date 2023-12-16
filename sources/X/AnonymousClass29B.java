package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.29B  reason: invalid class name */
public final class AnonymousClass29B {
    public static final C60612yq A00(AnonymousClass36K r7) {
        Long l;
        AnonymousClass36K A0l = r7.A0l("tos");
        if (A0l == null) {
            return new C60612yq(C72023d3.A00, 864000000);
        }
        try {
            String A0L = AnonymousClass36K.A0L(A0l, "refresh");
            if (A0L == null) {
                A0L = "";
            }
            C162457s7.A0H(A0L);
            l = Long.valueOf(TimeUnit.SECONDS.toMillis(Long.parseLong(A0L)));
        } catch (Throwable th) {
            l = AnonymousClass3Z0.A01(th);
        }
        if (l instanceof AnonymousClass3Z0) {
            l = 864000000L;
        }
        long A0B = C18310x6.A0B(l);
        List A0s = A0l.A0s("notice");
        ArrayList A0t = C18300x5.A0t(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass36K A0Y = C18310x6.A0Y(it);
            C162457s7.A0H(A0Y);
            String A0r = A0Y.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            if (A0r != null && !C175738Zn.A0V(A0r)) {
                String A0r2 = A0Y.A0r("state", (String) null);
                int i = 1;
                if (A0r2 != null && !C175738Zn.A0V(A0r2) && !Boolean.parseBoolean(A0r2)) {
                    i = 2;
                }
                A0t.add(new C52022kl(A0r, i));
            }
        }
        return new C60612yq(A0t, A0B);
    }
}
