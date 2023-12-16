package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import java.util.Map;

/* renamed from: X.8D7  reason: invalid class name */
public class AnonymousClass8D7 implements AnonymousClass8r1 {
    public C147927Gg Bnh(C153427bI r4, C160817oM r5, C155007e8 r6, C156387gX r7, C151147Tp r8) {
        Object A00 = AnonymousClass73H.A00(r8, r7.A02);
        Map map = (Map) r7.A02.get("debug_metadata");
        if (map != null) {
            map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }
        return new C147927Gg((Runnable) null, A00);
    }

    public void Bsd(C153427bI r6, C156387gX r7, C151147Tp r8, Object obj) {
        String str = r7.A00;
        Number number = (Number) r7.A02.get("depth");
        List list = r8.A04;
        if (!(number == null || number.intValue() == 0)) {
            if (list == null) {
                throw AnonymousClass001.A0c("Keypath must be set on environment if trying to WriteLocalState on a depth larger than 0.");
            } else if (number.intValue() <= list.size()) {
                String A00 = C154087ca.A00(C141306vM.INTERNAL_VARIABLE, list.subList(0, number.intValue()));
                if (A00 != null && !A00.equals("")) {
                    str = AnonymousClass000.A0V("#", A00, AnonymousClass000.A0l(str));
                }
            } else {
                throw AnonymousClass001.A0c("Depth supplied should never exceed the size of the key path.");
            }
        }
        C162377rs.A02(r6).A08(new C152207Xz(str, obj));
    }
}
