package X;

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9GP  reason: invalid class name */
public class AnonymousClass9GP extends AnonymousClass5ZM {
    public final AnonymousClass9NB A00;
    public final AnonymousClass9U4 A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A08 = AnonymousClass9U4.A08(this.A01);
        if (A08.size() <= 0) {
            return null;
        }
        Collections.sort(A08, new C204569pZ(this, 1));
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
            C166587yw r2 = (C166587yw) obj2;
            C89644eZ r4 = this.A00.A00;
            if (r2 == null) {
                C621433s.A01(r4, 102);
                return;
            }
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("credential_id", r2.A0A);
            A0t.put("last4", C1899593h.A0X(r2.A09));
            C133786hw r22 = (C133786hw) r2.A08;
            if (r22 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("");
                str = AnonymousClass000.A0h(A0o, r22.A04);
            } else {
                str = "-1";
            }
            A0t.put("remaining_retries", str);
            Intent A03 = C1899693i.A03(r4);
            A03.putExtra("screen_name", "brpay_p_reset_pin_from_card");
            A03.putExtra("screen_params", A0t);
            r4.startActivity(A03);
            return;
        }
        C621433s.A01(this.A00.A00, 102);
    }

    public AnonymousClass9GP(AnonymousClass9NB r1, AnonymousClass9U4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
