package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9GV  reason: invalid class name */
public class AnonymousClass9GV extends AnonymousClass5ZM {
    public final C52792m3 A00;
    public final AnonymousClass9U4 A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A08 = AnonymousClass9U4.A08(this.A01);
        if (A08.size() <= 0) {
            return null;
        }
        Collections.sort(A08, new C204569pZ(this, 2));
        C166587yw r5 = (C166587yw) C18290x4.A0k(A08);
        C133796hx r0 = r5.A08;
        if (r0 == null || ((C133786hw) r0).A06 < 0) {
            return null;
        }
        return AnonymousClass0x9.A0G(AnonymousClass0x9.A0l(A08), r5);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        AnonymousClass0PJ r6 = (AnonymousClass0PJ) obj;
        if (r6 != null) {
            Object obj2 = r6.A01;
            C626936e.A06(obj2);
            C166587yw r4 = (C166587yw) obj2;
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("credential_id", r4.A0A);
            A0t.put("last4", C1899593h.A0X(r4.A09));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("");
            A0t.put("remaining_cards", AnonymousClass000.A0R(r6.A00, A0o));
            C133786hw r0 = (C133786hw) r4.A08;
            if (r0 != null) {
                str = AnonymousClass000.A0h(AnonymousClass000.A0l(""), r0.A04);
            } else {
                str = "-1";
            }
            A0t.put("remaining_retries", str);
            this.A00.A01("on_success", A0t);
            return;
        }
        this.A00.A00("on_failure");
    }

    public AnonymousClass9GV(C52792m3 r1, AnonymousClass9U4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
