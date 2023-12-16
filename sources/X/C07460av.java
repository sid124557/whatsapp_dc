package X;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0av  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C07460av implements C15530rW {
    public final /* synthetic */ CarAppPermissionActivity A00;
    public final /* synthetic */ IOnRequestPermissionsListener A01;

    public final void BM2(Object obj) {
        CarAppPermissionActivity carAppPermissionActivity = this.A00;
        IOnRequestPermissionsListener iOnRequestPermissionsListener = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator A0q = AnonymousClass000.A0q((Map) obj);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Boolean bool = (Boolean) A0w.getValue();
            if (bool == null || !bool.booleanValue()) {
                A0s2.add(A0w.getKey());
            } else {
                A0s.add(A0w.getKey());
            }
        }
        try {
            iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) A0s.toArray(new String[0]), (String[]) A0s2.toArray(new String[0]));
        } catch (RemoteException e) {
            Log.e("CarApp", "CarAppService dead when accepting/rejecting permissions", e);
        }
        carAppPermissionActivity.finish();
    }

    public /* synthetic */ C07460av(CarAppPermissionActivity carAppPermissionActivity, IOnRequestPermissionsListener iOnRequestPermissionsListener) {
        this.A00 = carAppPermissionActivity;
        this.A01 = iOnRequestPermissionsListener;
    }
}
