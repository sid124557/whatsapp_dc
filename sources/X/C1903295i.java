package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import java.util.Map;

/* renamed from: X.95i  reason: invalid class name and case insensitive filesystem */
public class C1903295i extends C195509Ye {
    public C1903295i(Map map) {
        super(map);
        if (!(map.get(ARAssetType.SUPPORT) instanceof C1903395j)) {
            C162477s9.A09("ARAssetTypeCompositeStorage", "Support storage is not properly initialized");
        }
    }
}
