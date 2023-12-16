package X;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.5Ug  reason: invalid class name and case insensitive filesystem */
public class C105275Ug {
    public C1228466b A00;
    public Boolean A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final AnonymousClass33p A04;
    public final AnonymousClass1VX A05;

    public final synchronized C1228466b A00() {
        C1228466b r1;
        r1 = this.A00;
        if (r1 == null) {
            if (this.A05.A0X(266)) {
                r1 = new C111165he(this.A03.A00);
            } else {
                r1 = new C111175hf(this.A03.A00);
            }
            this.A00 = r1;
        }
        return r1;
    }

    public void A01(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            A02(activity);
        } else if (i >= 26) {
            Class<Activity> cls = Activity.class;
            try {
                Method method = cls.getMethod("setDisablePreviewScreenshots", new Class[]{Boolean.TYPE});
                method.setAccessible(true);
                method.invoke(activity, new Object[]{Boolean.valueOf(A05())});
            } catch (Exception e) {
                Log.e("Could not invoke setDisablePreviewScreenshots()", e);
            }
        }
    }

    public void A03(boolean z) {
        Boolean bool = this.A01;
        if (bool == null || bool.booleanValue() != z) {
            this.A01 = Boolean.valueOf(z);
            C18260x0.A1E("AppAuthManager/setIsAuthenticationNeeded: ", AnonymousClass001.A0o(), z);
            C18270x1.A0l(C18270x1.A03(this.A04), "fingerprint_authentication_needed", z);
        }
    }

    public boolean A05() {
        if (Build.VERSION.SDK_INT < 23 || !C18280x3.A1W(AnonymousClass0x2.A0F(this.A04), "privacy_fingerprint_enabled") || !A00().AyQ()) {
            return false;
        }
        return true;
    }

    public boolean A06() {
        if (Build.VERSION.SDK_INT < 23 || !A00().BHg()) {
            return false;
        }
        return true;
    }

    public boolean A07() {
        AnonymousClass33p r10 = this.A04;
        boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(r10), "privacy_fingerprint_enabled");
        C183538qC r2 = r10.A01;
        boolean A1W2 = C18280x3.A1W(C18300x5.A0B(r2), "fingerprint_authentication_needed");
        boolean A042 = A04();
        if (!A042 || !A1W || !A1W2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AppAuthManager/shouldShowAuthPrompt: No prompt: ");
            A0o.append(!A042);
            A0o.append(" || ");
            A0o.append(!A1W);
            A0o.append(" || ");
            C18260x0.A1V(A0o, !A1W2);
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long A0B = AnonymousClass0x2.A0B(C18300x5.A0B(r2), "app_background_time");
        long j = AnonymousClass0x2.A0F(r10).getLong("privacy_fingerprint_timeout", 60000);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("AppAuthManager/shouldShowAuthPrompt: show prompt if necessary: ");
        int i = ((A0B + j) > elapsedRealtime ? 1 : ((A0B + j) == elapsedRealtime ? 0 : -1));
        C18260x0.A1V(A0o2, AnonymousClass001.A1V(i));
        if (i < 0) {
            return true;
        }
        return false;
    }

    public C105275Ug(C56612sH r1, C54292oU r2, AnonymousClass33p r3, AnonymousClass1VX r4) {
        this.A02 = r1;
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
    }

    public final void A02(Activity activity) {
        activity.setRecentsScreenshotEnabled(!A05());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (A00().BFF() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r3 = this;
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x0011
            X.66b r0 = r3.A00()
            boolean r0 = r0.BFF()
            r2 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AppAuthManager/hasEnrolledBiometrics: enrolled: "
            X.C18260x0.A1E(r0, r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105275Ug.A04():boolean");
    }

    public boolean A08() {
        if (!A05() || C86654Ky.A1T(AnonymousClass0x2.A0F(this.A04), "privacy_fingerprint_show_notification_content")) {
            return true;
        }
        return false;
    }
}
