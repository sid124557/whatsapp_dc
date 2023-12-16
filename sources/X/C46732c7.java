package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.2c7  reason: invalid class name and case insensitive filesystem */
public class C46732c7 {
    public final C54292oU A00;
    public final C46022ax A01;
    public final C34211uP A02;
    public final C48112eN A03;
    public final C45172Yy A04;
    public final Executor A05;

    public C46732c7(C54292oU r4, C46022ax r5, C34211uP r6, C48112eN r7, AnonymousClass4FS r8) {
        C72163dH r2 = new C72163dH(r8, 5, false);
        C45172Yy r0 = new C45172Yy(r4, new C52062kp(r4, new C34201uO()));
        this.A00 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        this.A05 = r2;
        this.A04 = r0;
    }

    public final void A00(String str, boolean z) {
        SecurityException securityException;
        try {
            if (this.A02.A01("com.facebook.stella").A03) {
                Intent intent = AnonymousClass0x9.A09("com.whatsapp.action.INSTRUMENTATION_CALLBACK_SERVICE").setPackage("com.facebook.stella");
                try {
                    C45172Yy r0 = this.A04;
                    String str2 = C58152un.A0C;
                    List<ResolveInfo> queryIntentServices = r0.A00.queryIntentServices(intent, 0);
                    if (!queryIntentServices.isEmpty()) {
                        if (queryIntentServices.size() <= 1) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo == null || !str2.equals(serviceInfo.permission)) {
                                securityException = new SecurityException(AnonymousClass000.A0V("Service not protected by permission ", str2, AnonymousClass001.A0o()));
                            }
                        } else {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Multiple services can handle this intent ");
                            securityException = new SecurityException(AnonymousClass000.A0X(intent.getAction(), A0o));
                        }
                        throw securityException;
                    }
                    if (!this.A00.A00.bindService(intent, new AnonymousClass37H(this, str, z), 1)) {
                        Log.w("CallbackServiceProxy/Failed to bind to stella service");
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("CallbackServiceProxy/Failed to bind to stella service", th);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.w("CallbackServiceProxy/verification failed, dropping event");
    }
}
