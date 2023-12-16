package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.Map;

/* renamed from: X.9SI  reason: invalid class name */
public class AnonymousClass9SI {
    public final Map A00 = AnonymousClass001.A0t();

    public ModelPathsHolder A00(VersionedCapability versionedCapability) {
        return (ModelPathsHolder) this.A00.get(versionedCapability);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ARModelPaths{mModelPathsByCapabilityMap=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
