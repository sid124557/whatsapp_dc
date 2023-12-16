package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2wK  reason: invalid class name and case insensitive filesystem */
public class C59082wK {
    public final C106665Zw A00;

    public static C49362gP A00(AnonymousClass36K r8) {
        String A0n;
        int i;
        String A0n2;
        boolean z = false;
        if (r8 == null) {
            return new C49362gP((String) null, (String) null, 0, false);
        }
        AnonymousClass36K A0l = r8.A0l("status");
        AnonymousClass36K A0l2 = r8.A0l("can_appeal");
        AnonymousClass36K A0l3 = r8.A0l("reject_reason");
        AnonymousClass36K A0l4 = r8.A0l("commerce_url");
        String str = null;
        if (A0l == null) {
            A0n = null;
        } else {
            A0n = A0l.A0n();
        }
        if (C107575bX.A0F(A0n) || "approved".equalsIgnoreCase(A0n)) {
            i = 0;
        } else {
            i = C18280x3.A00("rejected".equalsIgnoreCase(A0n) ? 1 : 0);
        }
        if (A0l3 == null) {
            A0n2 = null;
        } else {
            A0n2 = A0l3.A0n();
        }
        if (A0l4 != null) {
            str = A0l4.A0n();
        }
        if (A0l2 != null && Boolean.parseBoolean(A0l2.A0n())) {
            z = true;
        }
        return new C49362gP(A0n2, str, i, z);
    }

    public C59082wK(C106665Zw r1) {
        this.A00 = r1;
    }

    public C49722gz A01(AnonymousClass36K r8) {
        String A0n;
        String A0n2;
        List A0s = r8.A0s("product");
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C109015dw A03 = this.A00.A03(C18310x6.A0Y(it));
            if (A03 != null) {
                A0s2.add(A03);
            }
        }
        AnonymousClass36K A0l = r8.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        AnonymousClass36K A0l2 = r8.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        AnonymousClass36K A0l3 = r8.A0l("status_info");
        if (A0l == null) {
            A0n = null;
        } else {
            A0n = A0l.A0n();
        }
        if (A0l2 == null) {
            A0n2 = null;
        } else {
            A0n2 = A0l2.A0n();
        }
        if (A0n != null && A0n2 != null) {
            return new C49722gz(A00(A0l3), (Integer) null, A0n, A0n2, A0s2);
        }
        Log.e("CollectionParser/parseCollectionNode/required fields missing");
        return null;
    }
}
