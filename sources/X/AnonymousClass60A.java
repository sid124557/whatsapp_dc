package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.60A  reason: invalid class name */
public final class AnonymousClass60A extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C90724i8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60A(C90724i8 r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7KT r15 = (AnonymousClass7KT) obj;
        if (r15 != null) {
            C90724i8 r3 = this.this$0;
            AnonymousClass4w0 r1 = r3.A03;
            if (r1 == null) {
                throw C18270x1.A0S("businessDirectorySharedPrefs");
            } else if (r1.A04.A01().getBoolean("location_access_granted", r1.A00.A0A())) {
                AnonymousClass4U8 A74 = r3.A74();
                if (A74.A0D) {
                    AnonymousClass4UC r7 = A74.A0Z;
                    LatLng latLng = r15.A01;
                    double d = latLng.A00;
                    double d2 = latLng.A01;
                    C86644Kx.A1E(r7, C153847c7.A01(C108975ds.A00(d, d2), A74.A04.A01), 1000, true);
                    A74.A0D = false;
                    A74.A0L.A01(AnonymousClass4L0.A0H(d, d2), A74, (AnonymousClass5ZI) null, r15.A02, "device", r15.A00);
                }
            }
        }
        return C59022wD.A00;
    }
}
