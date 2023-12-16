package X;

import android.location.Location;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;

/* renamed from: X.8Xt  reason: invalid class name and case insensitive filesystem */
public final class C175278Xt extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ DirectoryGPSLocationManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175278Xt(DirectoryGPSLocationManager directoryGPSLocationManager) {
        super(1);
        this.this$0 = directoryGPSLocationManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Location location = (Location) obj;
        DirectoryGPSLocationManager directoryGPSLocationManager = this.this$0;
        if (location != null) {
            directoryGPSLocationManager.A04(location);
        }
        return C59022wD.A00;
    }
}
