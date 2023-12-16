package X;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.33i  reason: invalid class name and case insensitive filesystem */
public class C620633i {
    public static boolean A0P;
    public ActivityManager A00;
    public AppOpsManager A01;
    public KeyguardManager A02;
    public NotificationManager A03;
    public AnonymousClass00N A04;
    public JobScheduler A05;
    public UsageStatsManager A06;
    public ClipboardManager A07;
    public SensorManager A08;
    public CameraManager A09;
    public LocationManager A0A;
    public AudioManager A0B;
    public ConnectivityManager A0C;
    public WifiManager A0D;
    public PowerManager A0E;
    public UserManager A0F;
    public Vibrator A0G;
    public TelecomManager A0H;
    public SubscriptionManager A0I;
    public TelephonyManager A0J;
    public WindowManager A0K;
    public AccessibilityManager A0L;
    public InputMethodManager A0M;
    public final C54292oU A0N;
    public final AnonymousClass5UR A0O;

    public static Object A03(C620633i r1, String str) {
        return r1.A0S(str, true);
    }

    public static LayoutInflater A00(Context context) {
        C626936e.A0D(!(context instanceof Application), "Application context should not be used here");
        return (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ActivityManager A06() {
        ActivityManager activityManager = this.A00;
        if (activityManager != null) {
            return activityManager;
        }
        ActivityManager activityManager2 = (ActivityManager) A0S("activity", false);
        this.A00 = activityManager2;
        return activityManager2;
    }

    public AlarmManager A07() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i >= 26) {
            return (AlarmManager) A0S("alarm", false);
        }
        return A08();
    }

    public final AlarmManager A08() {
        AnonymousClass00N r1 = this.A04;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass00N r12 = new AnonymousClass00N((AlarmManager) A0S("alarm", false));
        this.A04 = r12;
        return r12;
    }

    public KeyguardManager A09() {
        KeyguardManager keyguardManager = this.A02;
        if (keyguardManager != null) {
            return keyguardManager;
        }
        KeyguardManager keyguardManager2 = (KeyguardManager) A03(this, "keyguard");
        this.A02 = keyguardManager2;
        return keyguardManager2;
    }

    public NotificationManager A0A() {
        NotificationManager notificationManager = this.A03;
        if (notificationManager != null) {
            return notificationManager;
        }
        NotificationManager notificationManager2 = (NotificationManager) A03(this, "notification");
        this.A03 = notificationManager2;
        return notificationManager2;
    }

    public UsageStatsManager A0B() {
        UsageStatsManager usageStatsManager = this.A06;
        if (usageStatsManager != null) {
            return usageStatsManager;
        }
        UsageStatsManager usageStatsManager2 = (UsageStatsManager) A03(this, "usagestats");
        this.A06 = usageStatsManager2;
        return usageStatsManager2;
    }

    public ClipboardManager A0C() {
        ClipboardManager clipboardManager = this.A07;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) A03(this, "clipboard");
        this.A07 = clipboardManager2;
        return clipboardManager2;
    }

    public SensorManager A0D() {
        SensorManager sensorManager = this.A08;
        if (sensorManager != null) {
            return sensorManager;
        }
        SensorManager sensorManager2 = (SensorManager) A03(this, "sensor");
        this.A08 = sensorManager2;
        return sensorManager2;
    }

    public CameraManager A0E() {
        CameraManager cameraManager = this.A09;
        if (cameraManager != null) {
            return cameraManager;
        }
        CameraManager cameraManager2 = (CameraManager) A03(this, "camera");
        this.A09 = cameraManager2;
        return cameraManager2;
    }

    public LocationManager A0F() {
        LocationManager locationManager = this.A0A;
        if (locationManager != null) {
            return locationManager;
        }
        LocationManager locationManager2 = (LocationManager) A03(this, "location");
        this.A0A = locationManager2;
        return locationManager2;
    }

    public AudioManager A0G() {
        AudioManager audioManager = this.A0B;
        if (audioManager != null) {
            return audioManager;
        }
        AudioManager audioManager2 = (AudioManager) A0S("audio", false);
        this.A0B = audioManager2;
        return audioManager2;
    }

    public ConnectivityManager A0H() {
        ConnectivityManager connectivityManager = this.A0C;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) A03(this, "connectivity");
        this.A0C = connectivityManager2;
        return connectivityManager2;
    }

    public WifiManager A0I() {
        WifiManager wifiManager = this.A0D;
        if (wifiManager != null) {
            return wifiManager;
        }
        WifiManager wifiManager2 = (WifiManager) ((ContextWrapper) this.A0N.A00).getBaseContext().getSystemService("wifi");
        this.A0D = wifiManager2;
        return wifiManager2;
    }

    public PowerManager A0J() {
        PowerManager powerManager = this.A0E;
        if (powerManager != null) {
            return powerManager;
        }
        PowerManager powerManager2 = (PowerManager) A0S("power", false);
        this.A0E = powerManager2;
        return powerManager2;
    }

    public Vibrator A0K() {
        Vibrator vibrator = this.A0G;
        if (vibrator != null) {
            return vibrator;
        }
        Vibrator vibrator2 = (Vibrator) A0S("vibrator", false);
        this.A0G = vibrator2;
        return vibrator2;
    }

    public TelecomManager A0L() {
        TelecomManager telecomManager = this.A0H;
        if (telecomManager != null) {
            return telecomManager;
        }
        TelecomManager telecomManager2 = (TelecomManager) A03(this, "telecom");
        this.A0H = telecomManager2;
        return telecomManager2;
    }

    public SubscriptionManager A0M() {
        SubscriptionManager subscriptionManager = this.A0I;
        if (subscriptionManager != null) {
            return subscriptionManager;
        }
        SubscriptionManager subscriptionManager2 = (SubscriptionManager) A03(this, "telephony_subscription_service");
        this.A0I = subscriptionManager2;
        return subscriptionManager2;
    }

    public TelephonyManager A0N() {
        TelephonyManager telephonyManager = this.A0J;
        if (telephonyManager != null) {
            return telephonyManager;
        }
        TelephonyManager telephonyManager2 = (TelephonyManager) A0S("phone", false);
        this.A0J = telephonyManager2;
        return telephonyManager2;
    }

    @Deprecated
    public WindowManager A0O() {
        WindowManager windowManager = this.A0K;
        if (windowManager == null) {
            windowManager = (WindowManager) A03(this, "window");
            this.A0K = windowManager;
        }
        C626936e.A06(windowManager);
        return windowManager;
    }

    public AccessibilityManager A0P() {
        AccessibilityManager accessibilityManager = this.A0L;
        if (accessibilityManager != null) {
            return accessibilityManager;
        }
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) A03(this, "accessibility");
        this.A0L = accessibilityManager2;
        return accessibilityManager2;
    }

    public InputMethodManager A0Q() {
        InputMethodManager inputMethodManager = this.A0M;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) A03(this, "input_method");
        this.A0M = inputMethodManager2;
        return inputMethodManager2;
    }

    public AnonymousClass5UR A0R() {
        AnonymousClass5UR r1 = this.A0O;
        if (r1.A00 == null) {
            ContentResolver contentResolver = this.A0N.A00.getContentResolver();
            if (contentResolver == null) {
                return null;
            }
            r1.A00 = contentResolver;
        }
        return r1;
    }

    public final Object A0S(String str, boolean z) {
        boolean z2 = A0P;
        Context context = this.A0N.A00;
        if (!z) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context.getSystemService(str);
    }

    public C620633i(C54292oU r1, AnonymousClass5UR r2) {
        this.A0N = r1;
        this.A0O = r2;
    }

    public static WindowManager A01(Context context) {
        C626936e.A0D(!(context instanceof Application), "Application context should not be used here");
        Object systemService = context.getSystemService("window");
        C626936e.A06(systemService);
        return (WindowManager) systemService;
    }

    public static AnonymousClass5UR A02(C620633i r0) {
        AnonymousClass5UR A0R = r0.A0R();
        C626936e.A06(A0R);
        return A0R;
    }

    public static void A04(View view, C08310eF r5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - AnonymousClass5YL.A01(view.getContext(), A01(r5.A0G()));
        view.setLayoutParams(layoutParams);
    }

    public static void A05(C620633i r2) {
        Vibrator A0K2 = r2.A0K();
        C626936e.A06(A0K2);
        A0K2.vibrate(75);
    }
}
