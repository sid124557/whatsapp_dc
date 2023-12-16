package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3TO  reason: invalid class name */
public final class AnonymousClass3TO implements AnonymousClass4EZ {
    public final C60852zH A00;
    public final C29441ip A01;
    public final C105915Wx A02;
    public final AnonymousClass31C A03;
    public final C46212bG A04;

    public final Map A00(AnonymousClass36K r9) {
        AnonymousClass3Z6 A022;
        C162457s7.A0J(r9, 0);
        AnonymousClass36K[] r7 = r9.A03;
        if (r7 == null) {
            A022 = AnonymousClass3Z6.A02(r9.A00, r9.A0n());
        } else {
            LinkedHashMap A0r = C18320x8.A0r();
            AnonymousClass39V[] A0u = r9.A0u();
            if (A0u != null) {
                for (AnonymousClass39V r0 : A0u) {
                    A0r.put(r0.A02, r0.A03);
                }
            }
            for (AnonymousClass36K r02 : r7) {
                C162457s7.A0H(r02);
                A0r.putAll(A00(r02));
            }
            A022 = AnonymousClass3Z6.A02(r9.A00, A0r);
        }
        C162457s7.A0J(A022, 0);
        Map singletonMap = Collections.singletonMap(A022.first, A022.second);
        C162457s7.A0D(singletonMap);
        return singletonMap;
    }

    public void BdM(AnonymousClass36K r9, String str) {
        AnonymousClass36K[] r6;
        C162457s7.A0J(r9, 1);
        AnonymousClass36K A0l = r9.A0l("product_list");
        if (A0l != null && (r6 = A0l.A03) != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (AnonymousClass36K r2 : r6) {
                if (C162457s7.A0P(r2.A00, "product")) {
                    Object obj = A00(r2).get("product");
                    C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                    A0s.add(obj);
                }
            }
            C46212bG r1 = this.A04;
            r1.A02.A00(r1.A00, r1.A01, "success", C57692u3.A04("products", A0s), r1.A03);
        }
    }

    public void BQs(String str) {
        Log.e("SKURequestProtocolHelper/onDeliveryFailure");
        this.A04.A00();
    }

    public void BSN(AnonymousClass36K r2, String str) {
        Log.e("SKURequestProtocolHelper/onSuccess/error: empty response");
        this.A04.A00();
    }

    public AnonymousClass3TO(C60852zH r1, C29441ip r2, C105915Wx r3, AnonymousClass31C r4, C46212bG r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }
}
