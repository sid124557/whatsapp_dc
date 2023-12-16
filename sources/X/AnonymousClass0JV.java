package X;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;

/* renamed from: X.0JV  reason: invalid class name */
public final class AnonymousClass0JV {
    public static final HashMap A00;

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A00 = A0t;
        if (Build.VERSION.SDK_INT >= 22) {
            A0t.put(SubscriptionManager.class, "telephony_subscription_service");
            A0t.put(UsageStatsManager.class, "usagestats");
        }
        A0t.put(AppWidgetManager.class, "appwidget");
        A0t.put(BatteryManager.class, "batterymanager");
        A0t.put(CameraManager.class, "camera");
        A0t.put(JobScheduler.class, "jobscheduler");
        A0t.put(LauncherApps.class, "launcherapps");
        A0t.put(MediaProjectionManager.class, "media_projection");
        A0t.put(MediaSessionManager.class, "media_session");
        A0t.put(RestrictionsManager.class, "restrictions");
        A0t.put(TelecomManager.class, "telecom");
        A0t.put(TvInputManager.class, "tv_input");
        A0t.put(AppOpsManager.class, "appops");
        A0t.put(CaptioningManager.class, "captioning");
        A0t.put(ConsumerIrManager.class, "consumer_ir");
        A0t.put(PrintManager.class, "print");
        A0t.put(BluetoothManager.class, "bluetooth");
        A0t.put(DisplayManager.class, "display");
        A0t.put(UserManager.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A0t.put(InputManager.class, "input");
        A0t.put(MediaRouter.class, "media_router");
        A0t.put(NsdManager.class, "servicediscovery");
        A0t.put(AccessibilityManager.class, "accessibility");
        A0t.put(AccountManager.class, "account");
        A0t.put(ActivityManager.class, "activity");
        A0t.put(AlarmManager.class, "alarm");
        A0t.put(AudioManager.class, "audio");
        A0t.put(ClipboardManager.class, "clipboard");
        A0t.put(ConnectivityManager.class, "connectivity");
        A0t.put(DevicePolicyManager.class, "device_policy");
        A0t.put(DownloadManager.class, "download");
        A0t.put(DropBoxManager.class, "dropbox");
        A0t.put(InputMethodManager.class, "input_method");
        A0t.put(KeyguardManager.class, "keyguard");
        A0t.put(LayoutInflater.class, "layout_inflater");
        A0t.put(LocationManager.class, "location");
        A0t.put(NfcManager.class, "nfc");
        A0t.put(NotificationManager.class, "notification");
        A0t.put(PowerManager.class, "power");
        A0t.put(SearchManager.class, "search");
        A0t.put(SensorManager.class, "sensor");
        A0t.put(StorageManager.class, "storage");
        A0t.put(TelephonyManager.class, "phone");
        A0t.put(TextServicesManager.class, "textservices");
        A0t.put(UiModeManager.class, "uimode");
        A0t.put(UsbManager.class, "usb");
        A0t.put(Vibrator.class, "vibrator");
        A0t.put(WallpaperManager.class, "wallpaper");
        A0t.put(WifiP2pManager.class, "wifip2p");
        A0t.put(WifiManager.class, "wifi");
        A0t.put(WindowManager.class, "window");
    }
}
