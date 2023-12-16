package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5PR  reason: invalid class name */
public class AnonymousClass5PR {
    public final LinkedList A00 = AnonymousClass0x9.A18();

    public C105425Uw A00(List list) {
        LinkedList linkedList = this.A00;
        if (!linkedList.isEmpty()) {
            C158697kP r2 = (C158697kP) linkedList.removeLast();
            r2.A01(list);
            if ((r2 instanceof C135706l7) && !linkedList.isEmpty()) {
                C158697kP r1 = (C158697kP) linkedList.getLast();
                if ((r1 instanceof C95994vK) && r1.A00 == r2.A00) {
                    A00(list);
                }
            } else if (r2 instanceof C135686l5) {
                return r2.A00;
            }
        }
        return null;
    }

    public String A01(List list) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("version", 1);
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C158697kP r3 = (C158697kP) it.next();
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put("shape_index", list.indexOf(r3.A00));
            A1G2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A00());
            r3.A03(A1G2);
            A1F.put(A1G2);
        }
        A1G.put("actions", A1F);
        return A1G.toString();
    }
}
