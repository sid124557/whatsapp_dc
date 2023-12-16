package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import java.util.Map;

/* renamed from: X.4fa  reason: invalid class name and case insensitive filesystem */
public final class C89974fa extends C105205Tz {
    public final void A05(ARModelMetadataRequest aRModelMetadataRequest, AnonymousClass32L r6, int i, boolean z) {
        String str;
        String str2 = r6.A01;
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = str2;
        int A08 = C18310x6.A08(aRModelMetadataRequest.getCapability().name(), A0M, 1);
        if (z) {
            str = "model_cache_check_hit";
        } else {
            str = "model_cache_check_miss";
        }
        A01(A08, str);
        this.A01.markerAnnotate(22413317, A08, "version", i);
        if (z) {
            A03(A08, 2);
        }
    }

    public C89974fa(C56612sH r1, AnonymousClass8JP r2, Map map) {
        super(r1, r2, map);
    }
}
