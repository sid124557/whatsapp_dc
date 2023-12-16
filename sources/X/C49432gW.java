package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.2gW  reason: invalid class name and case insensitive filesystem */
public final class C49432gW {
    public final C56422rx A00;
    public final C66543Lv A01;
    public final C48032eE A02;
    public final AnonymousClass4C1 A03;

    public final int A00(C95814uZ r4, String str, boolean z) {
        C55502qS A002;
        if (z || !(r4 instanceof UserJid)) {
            PhoneUserJid A003 = AnonymousClass32X.A00(str);
            C56422rx r1 = this.A00;
            A002 = r1.A00(A003);
            if (A002 == null) {
                ((C47472dJ) this.A03.get()).A00(A003).get();
                A002 = r1.A00(A003);
            }
        } else {
            A002 = this.A00.A00((UserJid) r4);
        }
        return AnonymousClass30C.A00(A002);
    }

    public C49432gW(C56422rx r1, C66543Lv r2, C48032eE r3, AnonymousClass4C1 r4) {
        C18260x0.A0c(r1, r4, r3, r2);
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final String A01(AnonymousClass2z0 r4, Integer num) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("cta", "catalog_message");
        String str = r4.A01;
        C162457s7.A0C(str);
        String A0V = C18270x1.A0V(AnonymousClass0x7.A0t(), C18290x4.A1b(str));
        C162457s7.A0D(A0V);
        A1G.put("catalog_message_id", A0V);
        Object obj = num;
        if (num == null) {
            obj = JSONObject.NULL;
        }
        return C18280x3.A0c(obj, "is_template", A1G);
    }
}
