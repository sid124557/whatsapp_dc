package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C14830qL;
import androidx.car.app.model.ActionStrip;
import java.util.Objects;

public final class MapController {
    public final ActionStrip mMapActionStrip = null;
    public final C14830qL mPanModeDelegate = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return AnonymousClass001.A1b(Boolean.valueOf(AnonymousClass000.A1X(this.mPanModeDelegate)), AnonymousClass000.A1X(mapController.mPanModeDelegate)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.mPanModeDelegate;
        return AnonymousClass001.A0L(this.mMapActionStrip, A0M, 1);
    }
}
