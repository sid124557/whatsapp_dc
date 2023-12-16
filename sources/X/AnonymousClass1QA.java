package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1QA  reason: invalid class name */
public abstract class AnonymousClass1QA extends C56692sP {
    public final C194449Sx A00;

    public void A0D(Activity activity, AnonymousClass398 r5, String str, String str2, long j) {
        if (r5.A01 != null) {
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("commerce", A0C(activity, r5));
            this.A00.A01(AnonymousClass20B.DATA, A0t);
        }
    }

    public AnonymousClass1QA(C194449Sx r1) {
        this.A00 = r1;
    }

    public Map A0C(Activity activity, AnonymousClass398 r9) {
        AnonymousClass3ZH contact;
        String A0J;
        HashMap A0t = AnonymousClass001.A0t();
        HashMap A0t2 = AnonymousClass001.A0t();
        AnonymousClass67A A01 = AnonymousClass31N.A01(activity);
        if (!(A01 == null || (contact = A01.getContact()) == null)) {
            String A0L = contact.A0L();
            AnonymousClass3ZH contact2 = A01.getContact();
            if (A0L != null) {
                A0J = contact2.A0L();
            } else if (contact2.A0J() != null) {
                A0J = A01.getContact().A0J();
            }
            A0t2.put("business_name", A0J);
        }
        A0t.put("business_info", A0t2);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add("address_message_validate");
        A0s.add("configure_top_bar");
        A0s.add("extension_message_response");
        A0s.add("fetch_catalog");
        A0s.add("show_error");
        A0s.add("data_exchange");
        A0t.put("supported_actions", A0s);
        A0t.put(A05(), AnonymousClass31O.A01(r9.A01));
        return A0t;
    }
}
