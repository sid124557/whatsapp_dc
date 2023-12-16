package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2mo  reason: invalid class name and case insensitive filesystem */
public class C53262mo {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass2Ze A02;
    public final C45032Yk A03;
    public final AnonymousClass4FS A04;

    public void A01(C624134x r8, String str, int i) {
        String str2 = str;
        if (!A02(str)) {
            this.A04.BkM(new C70473aY(this, r8, str2, i, 11));
        }
    }

    public final boolean A02(String str) {
        AnonymousClass1VX r1;
        int i;
        if (str.equals("link_to_webview")) {
            r1 = this.A00;
            i = 3577;
        } else if (str.equals("marketing_msg_webview")) {
            r1 = this.A00;
            i = 3904;
        } else if (!str.equals("checkout_lite")) {
            return false;
        } else {
            r1 = this.A00;
            i = 4295;
        }
        return C56952sp.A0J(r1, i);
    }

    public C53262mo(AnonymousClass1VX r1, AnonymousClass4FV r2, AnonymousClass2Ze r3, C45032Yk r4, AnonymousClass4FS r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void A00(C95814uZ r10, String str, String str2, int i, int i2) {
        if (!A02(str)) {
            JSONObject A1G = AnonymousClass0x9.A1G();
            try {
                A1G.put("cta", str);
            } catch (JSONException e) {
                C18260x0.A17("MessageWithLinkLogging/logInteraction/", AnonymousClass001.A0o(), e);
            }
            C95814uZ r1 = r10;
            this.A02.A00(r1, C18290x4.A0a(), A1G.toString(), str2, i, i2, 1, true);
        }
    }
}
