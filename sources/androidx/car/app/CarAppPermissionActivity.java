package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03x;
import X.C004805c;
import X.C05880Vi;
import X.C07460av;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.IOnRequestPermissionsListener;

public class CarAppPermissionActivity extends C004805c {
    public void onCreate(Bundle bundle) {
        String action;
        int i;
        super.onCreate(bundle);
        try {
            Bundle bundle2 = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            if (bundle2 != null) {
                i = bundle2.getInt("androidx.car.app.theme");
            } else {
                i = 0;
            }
            Context createConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i != 0) {
                createConfigurationContext.setTheme(i);
            }
            int identifier = createConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = createConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unexpected intent action for CarAppPermissionActivity: ");
            if (intent == null) {
                action = "null Intent";
            } else {
                action = intent.getAction();
            }
            Log.e("CarApp", AnonymousClass000.A0X(action, A0o));
        } else {
            Bundle extras = intent.getExtras();
            IOnRequestPermissionsListener asInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
            String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
            if (asInterface == null || stringArray == null) {
                Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            } else {
                Bid(new C07460av(this, asInterface), new AnonymousClass03x()).A00((C05880Vi) null, stringArray);
                return;
            }
        }
        finish();
    }
}
