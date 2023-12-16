package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.util.Objects;

public final class Place {
    public final CarLocation mLocation = null;
    public final PlaceMarker mMarker = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.mLocation;
        return AnonymousClass001.A0L(this.mMarker, A0M, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ location: ");
        A0o.append(this.mLocation);
        A0o.append(", marker: ");
        return AnonymousClass000.A0S(this.mMarker, A0o);
    }
}
