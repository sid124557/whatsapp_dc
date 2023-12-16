package X;

import android.content.Context;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.4aB  reason: invalid class name and case insensitive filesystem */
public abstract class C88564aB extends AnonymousClass6FD implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static CameraPosition A00(LatLng latLng, AnonymousClass4uh r8) {
        float f = r8.A00;
        LatLng A012 = AnonymousClass4uh.A01(latLng, (double) f);
        C151747Wd r2 = new C151747Wd();
        r2.A01 = Math.max(Math.min(r8.A02, 67.5f), 0.0f);
        r2.A02 = f;
        r2.A00 = Math.max(r8.A01, 15.0f);
        r2.A01(A012);
        CameraPosition A002 = r2.A00();
        r8.A0A = true;
        return A002;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C88564aB(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        if (!this.A01) {
            this.A01 = true;
            ((AnonymousClass4uh) this).A09 = C64333Db.A2o(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
    }
}
