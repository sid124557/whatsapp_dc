package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1jR  reason: invalid class name */
public final class AnonymousClass1jR extends C55212pz implements AnonymousClass4G9, AnonymousClass4GA {
    public AnonymousClass4DK A00;
    public String A01;
    public final C60482yd A02;

    public void AxJ(String str) {
        C162457s7.A0J(str, 0);
        this.A01 = str;
    }

    public void B3J(Map map) {
        Object obj;
        String str;
        if (map != null) {
            obj = map.get("result_code");
        } else {
            obj = null;
        }
        if (obj != null) {
            AnonymousClass4DK r2 = this.A00;
            if (r2 == null) {
                throw C18270x1.A0S("resourceResultCallback");
            }
            if (obj.equals(AnonymousClass0x7.A0f())) {
                str = "SUCCESS";
            } else {
                str = "DISMISSED";
            }
            r2.BdH(C57692u3.A04("result", str));
            return;
        }
        Log.e("NativeP2mLiteHppCheckoutResource/finish: resultCode can't be null");
        AnonymousClass4DK r1 = this.A00;
        if (r1 == null) {
            throw C18270x1.A0S("resourceResultCallback");
        }
        r1.BSv(C60752z6.A03, (Map) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jR(AnonymousClass1j2 r1, C60482yd r2) {
        super(r1);
        C18260x0.A0Q(r2, r1);
        this.A02 = r2;
    }
}
