package X;

import java.util.Map;

/* renamed from: X.1jT  reason: invalid class name */
public final class AnonymousClass1jT extends C55212pz implements AnonymousClass4G9, AnonymousClass4GA {
    public C48722fM A00;
    public AnonymousClass4DK A01;
    public String A02;
    public final AnonymousClass2VP A03;
    public final C54292oU A04;
    public final C60482yd A05;

    public void AxJ(String str) {
        C162457s7.A0J(str, 0);
        this.A02 = str;
        this.A00 = this.A03.A00(str);
    }

    public void B3J(Map map) {
        Object obj;
        Object obj2 = null;
        if (map == null || (obj = map.get("action")) == null || !"on_back_pressed".equals(obj)) {
            if (map != null) {
                obj2 = map.get("kyc_status");
            }
            AnonymousClass4DK r1 = this.A01;
            if (r1 != null) {
                r1.BdH(C57692u3.A04("kyc_status", obj2));
                return;
            }
            return;
        }
        C60482yd r12 = this.A05;
        String str = this.A02;
        if (str == null) {
            throw C18270x1.A0S("observerId");
        }
        r12.A02(str).A01(new C197989eC("br_p2m_checkout_add_card:AddCardUserInfoCollectionScreen", false, (String) null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jT(AnonymousClass2VP r1, C54292oU r2, AnonymousClass1j2 r3, C60482yd r4) {
        super(r3);
        C18260x0.A0c(r2, r4, r3, r1);
        this.A04 = r2;
        this.A05 = r4;
        this.A03 = r1;
    }
}
