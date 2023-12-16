package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.util.Objects;

public final class PlaceMarker {
    public final CarColor mColor = null;
    public final CarIcon mIcon = null;
    public final int mIconType = 0;
    public final CarText mLabel = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceMarker)) {
            return false;
        }
        PlaceMarker placeMarker = (PlaceMarker) obj;
        return Objects.equals(this.mIcon, placeMarker.mIcon) && Objects.equals(this.mLabel, placeMarker.mLabel) && Objects.equals(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mIcon;
        objArr[1] = this.mLabel;
        objArr[2] = this.mColor;
        AnonymousClass000.A1O(objArr, this.mIconType);
        return Objects.hash(objArr);
    }

    public String toString() {
        String obj;
        StringBuilder A0p = AnonymousClass001.A0p();
        CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            obj = carIcon.toString();
        } else {
            CarText carText = this.mLabel;
            if (carText != null) {
                obj = CarText.A00(carText);
            } else {
                obj = super.toString();
            }
        }
        return AnonymousClass000.A0W(obj, A0p);
    }
}
