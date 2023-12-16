package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3zf  reason: invalid class name and case insensitive filesystem */
public final class C81303zf extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Map $crosspostingInfoMap;
    public final /* synthetic */ C49312gK $xFamilyEncryptionHelper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81303zf(C49312gK r2, Map map) {
        super(0);
        this.$crosspostingInfoMap = map;
        this.$xFamilyEncryptionHelper = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        HashMap A0t = AnonymousClass001.A0t();
        Map map = this.$crosspostingInfoMap;
        C49312gK r6 = this.$xFamilyEncryptionHelper;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            long A0B = C18310x6.A0B(A0w.getKey());
            C108895dj r4 = ((C53142mc) A0w.getValue()).A02;
            C162457s7.A0J(r6, 2);
            if (r4 == null || (str = (String) r4.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER")) == null || str.length() == 0) {
                C626936e.A0D(false, "XFamilyCrosspostRequestManager/UniqueId field is empty while iterating through crosspostingInfoMap");
            } else {
                AnonymousClass0x2.A1J(r6.A00(str), A0t, A0B);
            }
        }
        return AnonymousClass0x7.A0a(AnonymousClass3QD.A00(), A0t.getClass(), A0t, "XFamilyUniqueIdToMessageRowIdMap");
    }
}
