package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0GR;
import X.AnonymousClass0H5;
import X.AnonymousClass0N9;
import X.AnonymousClass0O9;
import X.AnonymousClass0T4;
import X.AnonymousClass0VH;
import X.AnonymousClass0WP;
import X.C06790Zf;
import X.C07730cj;
import X.C08300eE;
import X.C12540li;
import X.C18070wh;
import X.C18090wj;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.util.Log;
import androidx.car.app.ICarApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.Objects;

public final class CarAppBinder extends ICarApp.Stub {
    public C08300eE mCurrentSession;
    public final SessionInfo mCurrentSessionInfo;
    public HandshakeInfo mHandshakeInfo;
    public AnonymousClass0T4 mHostValidator;
    public CarAppService mService;

    public static /* synthetic */ Object $r8$lambda$3yiwG4NdehgsSgVrWcRdQbHIkwk(CarAppBinder carAppBinder, Intent intent) {
        Objects.requireNonNull((Object) null);
        AnonymousClass0VH.A00();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
        Objects.requireNonNull((Object) null);
        if (str.equals("app")) {
            throw AnonymousClass001.A0g("getCarContext");
        } else if (!str.equals("navigation")) {
            Log.e("CarApp", AnonymousClass000.A0X("%s is not a valid manager", AnonymousClass000.A0l(str)));
            AnonymousClass0WP.A02(iOnDoneCallback, "getManager", new InvalidParameterException(AnonymousClass000.A0X(" is not a valid manager type", AnonymousClass000.A0l(str))));
        } else {
            throw AnonymousClass001.A0g("getCarContext");
        }
    }

    private /* synthetic */ Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) {
        Objects.requireNonNull((Object) null);
        Objects.requireNonNull(this.mCurrentSessionInfo);
        throw AnonymousClass001.A0g("onCreateSession");
    }

    private /* synthetic */ Object lambda$onAppPause$3() {
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0g("handleLifecycleEvent");
    }

    private /* synthetic */ Object lambda$onAppResume$2() {
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0g("handleLifecycleEvent");
    }

    private /* synthetic */ Object lambda$onAppStart$1() {
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0g("handleLifecycleEvent");
    }

    private /* synthetic */ Object lambda$onAppStop$4() {
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0g("handleLifecycleEvent");
    }

    private /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) {
        Objects.requireNonNull((Object) null);
        onConfigurationChangedInternal((C08300eE) null, configuration);
        throw AnonymousClass000.A0L();
    }

    private /* synthetic */ Object lambda$onNewIntent$5(Intent intent) {
        Objects.requireNonNull((Object) null);
        AnonymousClass0VH.A00();
        return null;
    }

    public void destroy() {
        this.mCurrentSession = null;
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18090wj(this, 3), (AnonymousClass0O9) null, "onAppPause");
    }

    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18090wj(this, 0), (AnonymousClass0O9) null, "onAppResume");
    }

    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18090wj(this, 2), (AnonymousClass0O9) null, "onAppStart");
    }

    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18090wj(this, 1), (AnonymousClass0O9) null, "onAppStop");
    }

    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18070wh(configuration, 1, this), (AnonymousClass0O9) null, "onConfigurationChanged");
    }

    public void onDestroyLifecycle() {
        this.mCurrentSession = null;
    }

    public void onHandshakeCompleted(C06790Zf r6, IOnDoneCallback iOnDoneCallback) {
        Objects.requireNonNull((Object) null);
        try {
            String str = ((HandshakeInfo) r6.A00()).mHostPackageName;
            Objects.requireNonNull(str);
            AnonymousClass0N9 r4 = new AnonymousClass0N9(str, Binder.getCallingUid());
            getHostValidator();
            Objects.requireNonNull(r4);
            if (Log.isLoggable("CarApp.Val", 3)) {
                AnonymousClass000.A19(r4, "Evaluating ", "CarApp.Val", AnonymousClass001.A0o());
            }
            if (Log.isLoggable("CarApp.Val", 3)) {
                Log.d("CarApp.Val", "Accepted - Validator disabled, all hosts allowed");
            }
            throw AnonymousClass001.A0g("getAppInfo");
        } catch (AnonymousClass0GR | IllegalArgumentException unused) {
            throw AnonymousClass001.A0g("setHostInfo");
        }
    }

    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0WP.A00(iOnDoneCallback, new C18070wh(intent, 0, this), (AnonymousClass0O9) null, "onNewIntent");
    }

    private AnonymousClass0O9 getCurrentLifecycle() {
        return null;
    }

    private AnonymousClass0T4 getHostValidator() {
        AnonymousClass0T4 r0 = this.mHostValidator;
        if (r0 != null) {
            return r0;
        }
        Objects.requireNonNull((Object) null);
        throw AnonymousClass001.A0g("createHostValidator");
    }

    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            Objects.requireNonNull((Object) null);
            throw AnonymousClass001.A0g("getAppInfo");
        } catch (IllegalArgumentException e) {
            AnonymousClass0WP.A02(iOnDoneCallback, "getAppInfo", e);
        }
    }

    public C08300eE getCurrentSession() {
        return null;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0VH.A01(new C12540li(this, str, iOnDoneCallback));
    }

    public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            AnonymousClass000.A19(intent, "onAppCreate intent: ", "CarApp", AnonymousClass001.A0o());
        }
        AnonymousClass0WP.A01(iOnDoneCallback, new C07730cj(intent, configuration, this, iCarHost), "onAppCreate");
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    public void onAutoDriveEnabled() {
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int i = handshakeInfo.mHostCarAppApiLevel;
        if (i >= 1) {
            ClassLoader classLoader = AnonymousClass0H5.class.getClassLoader();
            Objects.requireNonNull(classLoader);
            InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
            if (resourceAsStream != null) {
                try {
                    String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
                    int parseInt = Integer.parseInt(readLine);
                    if (parseInt < 1 || parseInt > 6) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Unrecognized Car API level: ");
                        throw AnonymousClass000.A0I(readLine, A0o);
                    } else if (i <= parseInt) {
                        this.mHandshakeInfo = handshakeInfo;
                        return;
                    }
                } catch (IOException unused) {
                    throw AnonymousClass001.A0e("Unable to read Car API level file");
                }
            } else {
                throw AnonymousClass001.A0e(String.format("Car API level file %s not found", new Object[]{"car-app-api.level"}));
            }
        }
        throw AnonymousClass000.A0G("Invalid Car App API level received: ", AnonymousClass001.A0o(), i);
    }

    /* renamed from: $r8$lambda$FtMETRY96JnJnFv9CvE-L-SDVFk  reason: not valid java name */
    public static /* synthetic */ Object m0$r8$lambda$FtMETRY96JnJnFv9CvELSDVFk(CarAppBinder carAppBinder) {
        carAppBinder.lambda$onAppStop$4();
        throw AnonymousClass000.A0L();
    }

    public static /* synthetic */ Object $r8$lambda$KDsTHmwbbYtXHbKh3M3Kz1dm4qw(CarAppBinder carAppBinder) {
        carAppBinder.lambda$onAppResume$2();
        throw AnonymousClass000.A0L();
    }

    public static /* synthetic */ Object $r8$lambda$NEk2QLDK3rWmGDHSnVWHtKgiMoc(CarAppBinder carAppBinder) {
        carAppBinder.lambda$onAppStart$1();
        throw AnonymousClass000.A0L();
    }

    public static /* synthetic */ Object $r8$lambda$f7LOk0K_bjVEYPVzGzm8YMRUA8o(CarAppBinder carAppBinder, Configuration configuration) {
        carAppBinder.lambda$onConfigurationChanged$6(configuration);
        throw AnonymousClass000.A0L();
    }

    /* renamed from: $r8$lambda$pQ-Eqo1Se2nevCEjHrvw2DXCY24  reason: not valid java name */
    public static /* synthetic */ Object m1$r8$lambda$pQEqo1Se2nevCEjHrvw2DXCY24(CarAppBinder carAppBinder, ICarHost iCarHost, Configuration configuration, Intent intent) {
        carAppBinder.lambda$onAppCreate$0(iCarHost, configuration, intent);
        throw AnonymousClass000.A0L();
    }

    public static /* synthetic */ Object $r8$lambda$woLD3SHLdixVYINvV7UeLzCeQx0(CarAppBinder carAppBinder) {
        carAppBinder.lambda$onAppPause$3();
        throw AnonymousClass000.A0L();
    }

    public CarAppBinder(CarAppService carAppService, SessionInfo sessionInfo) {
        this.mService = carAppService;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private void onConfigurationChangedInternal(C08300eE r4, Configuration configuration) {
        AnonymousClass0VH.A00();
        if (Log.isLoggable("CarApp", 3)) {
            AnonymousClass000.A19(configuration, "onCarConfigurationChanged configuration: ", "CarApp", AnonymousClass001.A0o());
        }
        throw AnonymousClass001.A0g("onCarConfigurationChangedInternal");
    }

    private void onNewIntentInternal(C08300eE r1, Intent intent) {
        AnonymousClass0VH.A00();
    }
}
