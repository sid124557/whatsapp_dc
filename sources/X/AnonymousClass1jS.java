package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.1jS  reason: invalid class name */
public final class AnonymousClass1jS extends C55212pz implements AnonymousClass4G9, AnonymousClass4GA {
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
        Object obj2;
        if (map == null || (obj2 = map.get("action")) == null || !"on_back_pressed".equals(obj2)) {
            if (map != null) {
                obj = map.get("account_compliance_status");
                C373621y r2 = C373621y.ERROR;
                if (map.containsKey(r2.key)) {
                    Object obj3 = map.get(r2.key);
                    C162457s7.A0K(obj3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
                    AbstractMap abstractMap = (AbstractMap) obj3;
                    Object obj4 = abstractMap.get(C373621y.ERROR_NAME.key);
                    C162457s7.A0K(obj4, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj4;
                    Object obj5 = abstractMap.get(C373621y.ERROR_CODE.key);
                    C162457s7.A0K(obj5, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) obj5;
                    AnonymousClass4DK r1 = this.A01;
                    if (r1 != null) {
                        r1.BSv(new C60752z6(num, str, (String) null), (Map) null);
                    }
                    AnonymousClass4DK r12 = this.A01;
                    if (r12 != null) {
                        r12.BSv(C60752z6.A03, map);
                        return;
                    }
                    return;
                }
            } else {
                obj = null;
            }
            AnonymousClass4DK r13 = this.A01;
            if (r13 != null) {
                r13.BdH(C57692u3.A04("account_compliance_status", obj));
                return;
            }
            return;
        }
        C60482yd r14 = this.A05;
        String str2 = this.A02;
        if (str2 == null) {
            throw C18270x1.A0S("observerId");
        }
        r14.A02(str2).A01(new C197989eC("br_p2m_checkout_add_card:AddCardUserInfoCollectionScreen", false, (String) null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jS(AnonymousClass2VP r1, C54292oU r2, AnonymousClass1j2 r3, C60482yd r4) {
        super(r3);
        C18260x0.A0c(r2, r4, r3, r1);
        this.A04 = r2;
        this.A05 = r4;
        this.A03 = r1;
    }
}
