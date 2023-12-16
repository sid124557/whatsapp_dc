package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1jQ  reason: invalid class name */
public final class AnonymousClass1jQ extends C55212pz implements AnonymousClass4G9, AnonymousClass4GA {
    public AnonymousClass4DK A00;
    public String A01;
    public final C60482yd A02;

    public void AxJ(String str) {
        C162457s7.A0J(str, 0);
        this.A01 = str;
    }

    public void B3J(Map map) {
        Object obj;
        Object obj2;
        if (map != null) {
            obj = map.get("account_compliance_status");
        } else {
            obj = null;
        }
        if (map != null) {
            obj2 = map.get("last_screen");
        } else {
            obj2 = null;
        }
        if (obj != null) {
            AnonymousClass4DK r2 = this.A00;
            if (r2 == null) {
                throw C18270x1.A0S("resourceResultCallback");
            }
            AnonymousClass3Z6[] r1 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A09("account_compliance_status", obj, r1, 0);
            AnonymousClass3Z6.A09("last_screen", obj2, r1, 1);
            r2.BdH(C73813g7.A0F(r1));
            return;
        }
        Log.e("NativeP2mLiteDoComplianceResource/finish: resultComplianceStatus can't be null");
        AnonymousClass4DK r12 = this.A00;
        if (r12 == null) {
            throw C18270x1.A0S("resourceResultCallback");
        }
        r12.BSv(C60752z6.A03, (Map) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jQ(AnonymousClass1j2 r1, C60482yd r2) {
        super(r1);
        C18260x0.A0Q(r2, r1);
        this.A02 = r2;
    }
}
