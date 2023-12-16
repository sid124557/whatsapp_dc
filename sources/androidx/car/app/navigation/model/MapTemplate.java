package androidx.car.app.navigation.model;

import X.AnonymousClass001;
import X.C14790qH;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import java.util.Objects;

public final class MapTemplate implements C14790qH {
    public final ActionStrip mActionStrip = null;
    public final Header mHeader = null;
    public final ItemList mItemList = null;
    public final MapController mMapController = null;
    public final Pane mPane = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapTemplate)) {
            return false;
        }
        MapTemplate mapTemplate = (MapTemplate) obj;
        return Objects.equals(this.mPane, mapTemplate.mPane) && Objects.equals(this.mItemList, mapTemplate.mItemList) && Objects.equals(this.mHeader, mapTemplate.mHeader) && Objects.equals(this.mMapController, mapTemplate.mMapController) && Objects.equals(this.mActionStrip, mapTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mMapController;
        objArr[1] = this.mPane;
        objArr[2] = this.mItemList;
        objArr[3] = this.mHeader;
        return AnonymousClass001.A0L(this.mActionStrip, objArr, 4);
    }
}
