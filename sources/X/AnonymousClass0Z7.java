package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.0Z7  reason: invalid class name */
public class AnonymousClass0Z7 implements ServiceConnection {
    public final /* synthetic */ SettingsGoogleDriveViewModel A00;

    public AnonymousClass0Z7(SettingsGoogleDriveViewModel settingsGoogleDriveViewModel) {
        this.A00 = settingsGoogleDriveViewModel;
    }

    public static /* synthetic */ void A00(AnonymousClass0Z7 r1) {
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = r1.A00;
        settingsGoogleDriveViewModel.A0R.A01(settingsGoogleDriveViewModel.A0T);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A00;
        settingsGoogleDriveViewModel.A0t(true);
        settingsGoogleDriveViewModel.A0S.A0G();
        settingsGoogleDriveViewModel.A0X.BkM(new C11740k8(this));
        settingsGoogleDriveViewModel.A01.open();
        settingsGoogleDriveViewModel.A0b();
        Log.i("settings-gdrive/service-connected");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A00;
        settingsGoogleDriveViewModel.A0t(false);
        settingsGoogleDriveViewModel.A01.close();
        Log.i("settings-gdrive/service-disconnected");
    }
}
