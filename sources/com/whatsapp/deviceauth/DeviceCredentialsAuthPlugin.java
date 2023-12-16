package com.whatsapp.deviceauth;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0MY;
import X.AnonymousClass0O8;
import X.AnonymousClass0UE;
import X.AnonymousClass0Y8;
import X.AnonymousClass65C;
import X.C003203q;
import X.C04270Nm;
import X.C04550Os;
import X.C07680bQ;
import X.C55682qk;
import X.C620633i;
import X.C86654Ky;
import X.C87444Sq;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

public class DeviceCredentialsAuthPlugin extends DeviceAuthenticationPlugin {
    public AnonymousClass0UE A00;
    public AnonymousClass0MY A01;
    public AnonymousClass0O8 A02;
    public final int A03;
    public final C04550Os A04;
    public final C003203q A05;
    public final C620633i A06;

    public void A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            C003203q r3 = this.A05;
            this.A02 = new AnonymousClass0O8(this.A04, r3, AnonymousClass0Y8.A09(r3));
            this.A01 = A02();
        }
    }

    public boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || !A06()) {
            return false;
        }
        if (i >= 30) {
            return A05();
        }
        if (i == 29) {
            return C86654Ky.A1X(this.A06, "android.software.secure_lock_screen");
        }
        return true;
    }

    public final AnonymousClass0MY A02() {
        C04270Nm r2 = new C04270Nm();
        r2.A03 = this.A05.getString(this.A03);
        r2.A00 = 32768;
        return r2.A00();
    }

    public void A03() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            throw AnonymousClass001.A0e("DeviceCredentialsAuthPlugin/authenticate: SDK must be 23 or higher. Have you checked if you can authenticate?");
        } else if (i >= 30) {
            A04();
        } else {
            KeyguardManager A09 = this.A06.A09();
            if (A09 != null) {
                C003203q r2 = this.A05;
                Intent createConfirmDeviceCredentialIntent = A09.createConfirmDeviceCredentialIntent(r2.getString(this.A03), "");
                Log.i("DeviceCredentialsAuthPlugin/authentication-attempt-API29AndBelow");
                r2.startActivityForResult(createConfirmDeviceCredentialIntent, 12345);
                return;
            }
            throw AnonymousClass001.A0e("DeviceCredentialsManager/authenticate: Cannot get KeyguardManager. Have you checked if you can authenticate?");
        }
    }

    public final void A04() {
        if (this.A02 == null || this.A01 == null) {
            throw AnonymousClass001.A0e("DeviceCredentialsAuthPlugin/authenticate: No prompt created. Have you checked if you can authenticate?");
        }
        Log.i("DeviceCredentialsAuthPlugin/authentication-attempt-API30AndAbove");
        this.A02.A01(this.A01);
    }

    public final boolean A05() {
        AnonymousClass0UE r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass0UE(new C07680bQ(this.A05));
            this.A00 = r1;
        }
        return AnonymousClass000.A1T(r1.A03(32768));
    }

    public final boolean A06() {
        KeyguardManager A09 = this.A06.A09();
        if (A09 == null || !A09.isDeviceSecure()) {
            return false;
        }
        return true;
    }

    public DeviceCredentialsAuthPlugin(C003203q r3, C55682qk r4, C620633i r5, AnonymousClass65C r6, int i) {
        this.A06 = r5;
        this.A05 = r3;
        this.A03 = i;
        this.A04 = new C87444Sq(r4, r6, "DeviceCredentialsAuthPlugin");
        r3.A06.A00(this);
    }
}
