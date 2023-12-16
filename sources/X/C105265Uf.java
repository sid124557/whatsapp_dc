package X;

import android.app.KeyguardManager;
import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.5Uf  reason: invalid class name and case insensitive filesystem */
public final class C105265Uf {
    public final Context A00;
    public final C620633i A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass1VW A03;
    public final AnonymousClass1VX A04;

    public final long A00() {
        long A002 = AnonymousClass345.A00(this.A00, "com.google.android.gms");
        C18260x0.A12("PasskeyEligibility / determineDeviceGMSVersionCode:  ", AnonymousClass001.A0o(), A002);
        return A002;
    }

    public final boolean A04() {
        C997658c r5 = C997658c.ENABLED;
        C997658c A012 = A01();
        C183538qC r3 = this.A02.A01;
        boolean z = !C18300x5.A0B(r3).getBoolean("reg_abprop_passkey_create_education_screen", false);
        if (A012.ordinal() == 0) {
            if (z) {
                A012 = r5;
            } else {
                A012 = C997658c.DISABLED_NOT_ROLLED_OUT;
            }
        }
        boolean z2 = C18300x5.A0B(r3).getBoolean("reg_abprop_passkey_create_delay_keyboard", false);
        if (A012.ordinal() == 0) {
            if (z2) {
                return true;
            }
            return false;
        } else if (r5 == A012) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A05() {
        C127866Tp r2 = new C127866Tp(C159787mS.A00(this.A00));
        C18260x0.A1R(AnonymousClass001.A0o(), "PasskeyEligibility / googlePlayServicesStatus : ", r2);
        boolean A1T = AnonymousClass000.A1T(r2.A01);
        C18260x0.A1E("PasskeyEligibility / isGooglePlayServicesEnabled : ", AnonymousClass001.A0o(), A1T);
        return A1T;
    }

    public C105265Uf(Context context, C620633i r2, AnonymousClass33p r3, AnonymousClass1VW r4, AnonymousClass1VX r5) {
        C18260x0.A0d(r5, r4, r2, r3);
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final C997658c A01() {
        C997658c r3;
        if (!C107385bE.A06()) {
            r3 = C997658c.DISABLED_ANDROID_TOO_OLD;
        } else if (!A05()) {
            r3 = C997658c.DISABLED_PLAY_SERVICES_DISABLED;
        } else {
            boolean A1U = AnonymousClass001.A1U((A00() > 230110000 ? 1 : (A00() == 230110000 ? 0 : -1)));
            C18260x0.A1E("PasskeyEligibility / gmsVersionIsNewEnough : ", AnonymousClass001.A0o(), A1U);
            if (!A1U) {
                r3 = C997658c.DISABLED_GMS_TOO_OLD;
            } else if (!Boolean.TRUE.equals(A03())) {
                r3 = C997658c.DISABLED_DEVICE_NOT_SECURED;
            } else {
                r3 = C997658c.ENABLED;
            }
        }
        boolean z = AnonymousClass0x2.A0F(this.A02).getBoolean("reg_abprop_passkey_create", false);
        if (r3.ordinal() != 0) {
            return r3;
        }
        if (z) {
            return C997658c.ENABLED;
        }
        return C997658c.DISABLED_NOT_ROLLED_OUT;
    }

    public final C997658c A02() {
        C997658c r3;
        if (!C107385bE.A06()) {
            r3 = C997658c.DISABLED_ANDROID_TOO_OLD;
        } else {
            if (!C107385bE.A0B()) {
                if (!A05()) {
                    r3 = C997658c.DISABLED_PLAY_SERVICES_DISABLED;
                } else {
                    boolean A1U = AnonymousClass001.A1U((A00() > 230815045 ? 1 : (A00() == 230815045 ? 0 : -1)));
                    C18260x0.A1E("PasskeyEligibility / gmsVersionIsNewEnough : ", AnonymousClass001.A0o(), A1U);
                    if (!A1U) {
                        r3 = C997658c.DISABLED_GMS_TOO_OLD;
                    }
                }
            }
            r3 = C997658c.ENABLED;
        }
        boolean A0X = this.A03.A0X(4733);
        if (r3.ordinal() != 0) {
            return r3;
        }
        if (A0X) {
            return C997658c.ENABLED;
        }
        return C997658c.DISABLED_NOT_ROLLED_OUT;
    }

    public final Boolean A03() {
        String str;
        Boolean bool = null;
        if (C107385bE.A02()) {
            KeyguardManager A09 = this.A01.A09();
            if (A09 != null) {
                bool = Boolean.valueOf(A09.isDeviceSecure());
            } else {
                str = "PasskeyEligibility / isDeviceSecured:  no keyguard service";
                Log.i(str);
            }
        } else {
            str = "PasskeyEligibility / isDeviceSecured:  android too old";
            Log.i(str);
        }
        C18260x0.A1R(AnonymousClass001.A0o(), "PasskeyEligibility / isDeviceSecured:  ", bool);
        return bool;
    }
}
