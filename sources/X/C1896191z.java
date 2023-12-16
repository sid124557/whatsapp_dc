package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.util.Log;

/* renamed from: X.91z  reason: invalid class name and case insensitive filesystem */
public class C1896191z implements OnFailureListener {
    public Object A00;
    public final int A01;

    public C1896191z(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.A01) {
            case 0:
                C162457s7.A0J(exc, 1);
                ((DirectoryGPSLocationManager) this.A00).A05(AnonymousClass000.A0a("Location services unavailable ", AnonymousClass001.A0o(), exc));
                return;
            case 1:
                ((DirectoryGPSLocationManager) this.A00).A05("Unable to fetch last known location from FusedLocationProviderClient");
                return;
            default:
                Object obj = this.A00;
                Log.e("BackupTokenUtils/setBlockStoreBytes/exception determining E2EE", exc);
                if (obj != null) {
                    Log.e("BackupTokenProtocolHelper/encryptAndSaveToken/onFailure", exc);
                    return;
                }
                return;
        }
    }
}
