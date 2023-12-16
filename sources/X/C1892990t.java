package X;

import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.90t  reason: invalid class name and case insensitive filesystem */
public class C1892990t implements C180278km {
    public Object A00;
    public final int A01;

    public C1892990t(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(C1892990t r0) {
        C96384wH r02 = ((C96784wv) r0.A00).A03;
        if (r02 != null) {
            r02.A03.invoke();
        }
    }

    public final void BVz(C108975ds r4) {
        switch (this.A01) {
            case 0:
                AnonymousClass4U2 r1 = ((BusinessDirectoryMapViewActivity) this.A00).A0N;
                if (r1 == null) {
                    throw C86604Kt.A0j();
                }
                r1.A0M(r1.A07);
                r1.A0O(r1.A08);
                return;
            case 1:
                ((C90724i8) this.A00).A74().A0F();
                return;
            case 2:
                A00(this);
                return;
            default:
                LocationPicker locationPicker = (LocationPicker) this.A00;
                PlaceInfo placeInfo = locationPicker.A0P.A0f;
                if (placeInfo != null) {
                    Object obj = placeInfo.A0D;
                    if (obj != null) {
                        ((C88534Zc) obj).A0G(locationPicker.A05);
                    }
                    C108145cU r12 = locationPicker.A0P;
                    r12.A0f = null;
                    r12.A0B();
                }
                C108145cU r13 = locationPicker.A0P;
                if (r13.A0p) {
                    r13.A0E.setVisibility(0);
                }
                locationPicker.A0P.A0B.setVisibility(8);
                return;
        }
    }
}
