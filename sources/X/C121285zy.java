package X;

import android.location.Location;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.5zy  reason: invalid class name and case insensitive filesystem */
public final class C121285zy extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121285zy(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(1);
        this.this$0 = businessDirectoryMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7KT r6 = (AnonymousClass7KT) obj;
        if (r6 != null) {
            BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.this$0;
            C105085Tn r0 = businessDirectoryMapViewActivity.A0D;
            if (r0 == null) {
                throw C18270x1.A0S("searchLocationRepository");
            } else if (r0.A04()) {
                AnonymousClass4U2 r3 = businessDirectoryMapViewActivity.A0N;
                if (r3 == null) {
                    throw C86604Kt.A0j();
                }
                r3.A06 = r6;
                C06270Wx.A03(r3.A0i, 10);
                if (r3.A0L) {
                    r3.A0L = false;
                    Location location = new Location("");
                    C86624Kv.A0o(location, r6.A01);
                    location.setAccuracy(r6.A00);
                    r3.A0C = "device";
                    C86644Kx.A1E(r3.A0h, C153847c7.A01(C108975ds.A01(location), 15.5f), 1000, false);
                    r3.A0B = 0;
                    r3.A0K = true;
                }
            }
        }
        return C59022wD.A00;
    }
}
