package X;

import java.util.Map;

/* renamed from: X.8ZW  reason: invalid class name */
public final class AnonymousClass8ZW extends C829045j implements AnonymousClass4GS {
    public final /* synthetic */ C159127lA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ZW(C159127lA r2) {
        super(3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Map map = (Map) obj2;
        C60752z6 r6 = (C60752z6) obj3;
        C159127lA r0 = this.this$0;
        C152677Zw r1 = r0.A07;
        if (r1 != null) {
            C151217Tw r02 = r0.A01;
            if (r02 == null) {
                throw C18270x1.A0S("flowManager");
            }
            r1.A01((String) C162457s7.A03(r02.A03));
        }
        C159127lA r12 = this.this$0;
        if (str == null) {
            AnonymousClass1j2 r03 = r12.A0M;
            r03.A03.A07(r12.A00, 3);
            this.this$0.A08(r6, map);
        } else {
            r12.A07(r6, str, map, 2);
        }
        return C59022wD.A00;
    }
}
