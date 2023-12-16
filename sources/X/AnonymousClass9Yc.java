package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;

/* renamed from: X.9Yc  reason: invalid class name */
public class AnonymousClass9Yc implements C203259nN {
    public final C1903395j A00;

    public boolean BJq(AnonymousClass9SI r6, VersionedCapability versionedCapability) {
        ModelPathsHolder modelPathsHolderForLastSavedVersion;
        try {
            C195519Yf r1 = (C195519Yf) this.A00.A00(versionedCapability);
            if (r1.A05 == null || (modelPathsHolderForLastSavedVersion = r1.A05.getModelPathsHolderForLastSavedVersion(versionedCapability)) == null) {
                return false;
            }
            r6.A00.put(versionedCapability, modelPathsHolderForLastSavedVersion);
            return true;
        } catch (IllegalArgumentException e) {
            C162477s9.A0D("SingleARModelLoader", "Failed to get model storage for capability: %s", e, versionedCapability.name());
            return false;
        }
    }

    public boolean BJt(AnonymousClass9SI r7, VersionedCapability versionedCapability, int i) {
        try {
            C195519Yf r1 = (C195519Yf) this.A00.A00(versionedCapability);
            if (r1.A05 != null) {
                try {
                    ModelPathsHolder modelPathsHolder = r1.A05.getModelPathsHolder(versionedCapability, i);
                    if (modelPathsHolder != null) {
                        r7.A00.put(versionedCapability, modelPathsHolder);
                        return true;
                    }
                } catch (EffectsFrameworkException e) {
                    C162477s9.A0B("ModelCacheAssetStorage", "Failed call to ModelCache.getModelPathsHolder", e);
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            C162477s9.A0D("SingleARModelLoader", "Failed to get model storage for capability: %s", e2, versionedCapability.name());
            return false;
        }
    }

    public boolean AwO(AnonymousClass9WL r6, VersionedCapability versionedCapability) {
        try {
            return ((C195519Yf) this.A00.A00(versionedCapability)).A01(r6, versionedCapability);
        } catch (IllegalArgumentException e) {
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = versionedCapability.name();
            C162477s9.A0D("SingleARModelLoader", "Failed to get model storage for capability %s", e, A0L);
            return false;
        }
    }

    public AnonymousClass9Yc(C1903395j r1) {
        this.A00 = r1;
    }
}
