package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1it  reason: invalid class name and case insensitive filesystem */
public final class C29481it extends C191819Go {
    public final C40632Hd A00;
    public final AnonymousClass4FS A01;
    public final String A02;
    public final String A03;

    public C29481it(C29441ip r7, C620933l r8, AnonymousClass9U5 r9, C40632Hd r10, C193119Nf r11, AnonymousClass28X r12, AnonymousClass4FS r13, String str, String str2) {
        super(r7, r8, r9, r11, r12);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r10;
        this.A01 = r13;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Integer num;
        AnonymousClass0PJ r6 = (AnonymousClass0PJ) obj;
        C40632Hd r3 = this.A00;
        if (r3 != null) {
            AnonymousClass34V r1 = null;
            if (r6 != null) {
                String str = (String) r6.A00;
                r1 = (AnonymousClass34V) r6.A01;
                if (!(str == null || str.length() == 0)) {
                    r3.A00.BdH(C57692u3.A04("card_token", str));
                    return;
                }
            }
            AnonymousClass4DK r4 = r3.A00;
            if (r1 != null) {
                num = Integer.valueOf(r1.A00);
            } else {
                num = null;
            }
            r4.BSv(new C60752z6(num, "PaymentNetworkError", (String) null), (Map) null);
        }
    }

    public List A0G() {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass0x2.A1G("creditCardNumber", this.A03, A0s);
        AnonymousClass0x2.A1G("csc", this.A02, A0s);
        return A0s;
    }
}
