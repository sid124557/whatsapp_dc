package X;

import java.util.Map;

/* renamed from: X.3zz  reason: invalid class name and case insensitive filesystem */
public final class C81503zz extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C108895dj $enforcedDecryptedUniqueIdToMessageRowIdMap;
    public final /* synthetic */ C108895dj $enforcedEncryptedUniqueId;
    public final /* synthetic */ C49312gK $xFamilyEncryptionHelper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81503zz(C108895dj r2, C108895dj r3, C49312gK r4) {
        super(0);
        this.$enforcedEncryptedUniqueId = r2;
        this.$xFamilyEncryptionHelper = r4;
        this.$enforcedDecryptedUniqueIdToMessageRowIdMap = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C108895dj r1 = this.$enforcedEncryptedUniqueId;
        C49312gK r4 = this.$xFamilyEncryptionHelper;
        C162457s7.A0J(r4, 2);
        String str2 = null;
        if (!(r1 == null || (str = (String) r1.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER")) == null || str.length() == 0)) {
            str2 = r4.A00(str);
        }
        Map map = (Map) this.$enforcedDecryptedUniqueIdToMessageRowIdMap.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER");
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }
}
