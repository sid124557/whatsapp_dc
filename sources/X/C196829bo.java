package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9bo  reason: invalid class name and case insensitive filesystem */
public class C196829bo implements C202529mA {
    public ArrayList BgU(C617332a r5, AnonymousClass36K r6) {
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        String str2 = r6.A00;
        if (str2.equals("card-update")) {
            try {
                AnonymousClass36K A0m = r6.A0m("card");
                AnonymousClass99I r0 = new AnonymousClass99I();
                r0.A04(r5, A0m, 0);
                A0s.add(r0);
                return A0s;
            } catch (AnonymousClass24Y unused) {
                str = "PAY: BrazilProtoParser/parse: no card node for card-update notification";
                Log.w(str);
                return A0s;
            }
        } else {
            if (str2.equals("merchant-update")) {
                try {
                    AnonymousClass36K A0m2 = r6.A0m("merchant");
                    AnonymousClass99J r02 = new AnonymousClass99J();
                    r02.A04(r5, A0m2, 0);
                    A0s.add(r02);
                    return A0s;
                } catch (AnonymousClass24Y unused2) {
                    str = "PAY: BrazilProtoParser/parse: no merchant node for merchant-update notification";
                    Log.w(str);
                    return A0s;
                }
            }
            return A0s;
        }
    }
}
