package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;

/* renamed from: X.9Yb  reason: invalid class name */
public class AnonymousClass9Yb implements C203259nN {
    public final C1903595l A00;

    public boolean AwO(AnonymousClass9WL r2, VersionedCapability versionedCapability) {
        return this.A00.A01(r2, versionedCapability);
    }

    public boolean BJq(AnonymousClass9SI r3, VersionedCapability versionedCapability) {
        ModelPathsHolder modelPathsHolderForLastSavedVersion;
        C1903595l r1 = this.A00;
        if (r1.A05 == null || (modelPathsHolderForLastSavedVersion = r1.A05.getModelPathsHolderForLastSavedVersion(versionedCapability)) == null) {
            return false;
        }
        r3.A00.put(versionedCapability, modelPathsHolderForLastSavedVersion);
        return true;
    }

    public boolean BJt(AnonymousClass9SI r4, VersionedCapability versionedCapability, int i) {
        C1903595l r1 = this.A00;
        if (r1.A05 == null) {
            return false;
        }
        try {
            ModelPathsHolder modelPathsHolder = r1.A05.getModelPathsHolder(versionedCapability, i);
            if (modelPathsHolder == null) {
                return false;
            }
            r4.A00.put(versionedCapability, modelPathsHolder);
            return true;
        } catch (EffectsFrameworkException e) {
            C162477s9.A0B("ModelCacheAssetStorage", "Failed call to ModelCache.getModelPathsHolder", e);
            return false;
        }
    }

    public AnonymousClass9Yb(C1903595l r1) {
        this.A00 = r1;
    }
}
