package com.whatsapp.deviceauth;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0MY;
import X.AnonymousClass0O8;
import X.AnonymousClass0UE;
import X.AnonymousClass0Y8;
import X.AnonymousClass1VX;
import X.AnonymousClass65C;
import X.C003203q;
import X.C04270Nm;
import X.C07680bQ;
import X.C114025mN;
import X.C55682qk;
import X.C620633i;
import X.C626936e;
import X.C69263Wi;
import X.C69983Zk;
import X.C87444Sq;
import android.app.KeyguardManager;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.Objects;

public class BiometricAuthPlugin extends DeviceAuthenticationPlugin {
    public AnonymousClass0UE A00;
    public AnonymousClass0MY A01;
    public AnonymousClass0O8 A02;
    public final int A03;
    public final int A04;
    public final C003203q A05;
    public final C55682qk A06;
    public final C69263Wi A07;
    public final C620633i A08;
    public final AnonymousClass65C A09;
    public final DeviceCredentialsAuthPlugin A0A;
    public final AnonymousClass1VX A0B;

    public void A00() {
        String str;
        C003203q r5 = this.A05;
        this.A02 = new AnonymousClass0O8(new C87444Sq(this.A06, new C114025mN(this), "BiometricAuthPlugin"), r5, AnonymousClass0Y8.A09(r5));
        C04270Nm r1 = new C04270Nm();
        r1.A03 = r5.getString(this.A04);
        int i = this.A03;
        if (i != 0) {
            str = r5.getString(i);
        } else {
            str = null;
        }
        r1.A02 = str;
        r1.A00 = 33023;
        r1.A04 = false;
        this.A01 = r1.A00();
    }

    public boolean A01() {
        if (Build.VERSION.SDK_INT < 23 || !this.A0B.A0X(482) || !A04() || !A05()) {
            return false;
        }
        return true;
    }

    public void A02() {
        if (this.A02 == null || this.A01 == null) {
            throw AnonymousClass001.A0e("BiometricAuthPlugin/authenticate: No prompt created. Have you checked if you can authenticate?");
        }
        Log.i("BiometricAuthPlugin/authentication-attempt");
        this.A02.A01(this.A01);
    }

    public final void A03(int i) {
        if (Build.VERSION.SDK_INT != 29 && (i == 2 || i == 3)) {
            C626936e.A06(this.A02);
            this.A02.A00();
            C69263Wi r3 = this.A07;
            DeviceCredentialsAuthPlugin deviceCredentialsAuthPlugin = this.A0A;
            Objects.requireNonNull(deviceCredentialsAuthPlugin);
            r3.A0T(new C69983Zk(deviceCredentialsAuthPlugin, 40), 200);
        } else if (i == 2) {
            this.A09.BMz(4);
        } else {
            this.A09.BMz(i);
        }
    }

    public final boolean A04() {
        AnonymousClass0UE r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass0UE(new C07680bQ(this.A05));
            this.A00 = r1;
        }
        return AnonymousClass000.A1T(r1.A03(255));
    }

    public final boolean A05() {
        String str;
        KeyguardManager A092 = this.A08.A09();
        if (A092 == null || !A092.isDeviceSecure()) {
            str = "BiometricAuthPlugin/NoDeviceCredentials";
        } else if (this.A0A.A01()) {
            return true;
        } else {
            str = "BiometricAuthPlugin/CannotAuthenticateWithDeviceCredentials";
        }
        Log.i(str);
        return false;
    }

    public BiometricAuthPlugin(C003203q r7, C55682qk r8, C69263Wi r9, C620633i r10, AnonymousClass65C r11, AnonymousClass1VX r12, int i, int i2) {
        this.A0B = r12;
        this.A07 = r9;
        this.A06 = r8;
        this.A08 = r10;
        this.A05 = r7;
        this.A04 = i;
        this.A03 = i2;
        this.A09 = r11;
        this.A0A = new DeviceCredentialsAuthPlugin(r7, r8, r10, r11, i);
        r7.A06.A00(this);
    }
}
