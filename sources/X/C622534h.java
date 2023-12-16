package X;

import android.app.ActivityManager;
import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.util.Log;

/* renamed from: X.34h  reason: invalid class name and case insensitive filesystem */
public class C622534h {
    public static final String[] A09 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public boolean A00;
    public final C159027ky A01;
    public final C56972sr A02;
    public final C620633i A03;
    public final C56612sH A04;
    public final C54292oU A05;
    public final AnonymousClass33p A06;
    public final AnonymousClass1VX A07;
    public volatile Boolean A08;

    public static boolean A01(Location location, Location location2) {
        return location2 == null || location2.getTime() + 120000 < location.getTime() || location2.getAccuracy() > location.getAccuracy() || (TextUtils.equals(location2.getProvider(), location.getProvider()) && location2.distanceTo(location) > Math.max(10.0f, location.getAccuracy()));
    }

    public static void A00(AnonymousClass172 r4, C54942pX r5, Integer num) {
        double d = r5.A00;
        C21921Dr r1 = (C21921Dr) C18320x8.A0C(r4);
        r1.bitField0_ |= 1;
        r1.degreesLatitude_ = d;
        double d2 = r5.A01;
        C21921Dr r12 = (C21921Dr) C18320x8.A0C(r4);
        r12.bitField0_ |= 2;
        r12.degreesLongitude_ = d2;
        int i = r5.A03;
        if (i != -1) {
            C21921Dr r13 = (C21921Dr) C18320x8.A0C(r4);
            r13.bitField0_ |= 4;
            r13.accuracyInMeters_ = i;
        }
        float f = r5.A02;
        if (f != -1.0f) {
            C21921Dr r14 = (C21921Dr) C18320x8.A0C(r4);
            r14.bitField0_ |= 8;
            r14.speedInMps_ = f;
        }
        int i2 = r5.A04;
        if (i2 != -1) {
            C21921Dr r15 = (C21921Dr) C18320x8.A0C(r4);
            r15.bitField0_ |= 16;
            r15.degreesClockwiseFromMagneticNorth_ = i2;
        }
        if (num != null) {
            int intValue = num.intValue();
            C21921Dr r16 = (C21921Dr) C18320x8.A0C(r4);
            r16.bitField0_ |= 128;
            r16.timeOffset_ = intValue;
        }
    }

    public void A03(Context context) {
        String A0w;
        Me A002 = C56972sr.A00(this.A02);
        if (A002 == null) {
            A0w = "ZZ";
        } else {
            A0w = AnonymousClass0x9.A0w(A002);
        }
        C161247pI.A03 = A0w;
        if (AnonymousClass76J.A00 == null) {
            AnonymousClass76J.A00 = new AnonymousClass829(this.A01);
        }
        C161247pI.A01(context, C58172up.A0A);
        C161247pI.A02(true);
        AnonymousClass714.A00(context);
    }

    public void A04(Context context) {
        if (AnonymousClass76J.A00 == null) {
            AnonymousClass76J.A00 = new AnonymousClass829(this.A01);
        }
        C161247pI.A01(context, C58172up.A0A);
        AnonymousClass714.A00(context);
    }

    public boolean A05(Context context) {
        boolean z;
        if (this.A08 == null) {
            synchronized (this) {
                if (this.A08 != null) {
                    z = this.A08.booleanValue();
                } else {
                    z = AnonymousClass000.A1T(C159787mS.A00(context));
                    if (!this.A07.A0Y(C58422vE.A02, 4269)) {
                        boolean z2 = false;
                        if (z && C154947e0.A00(context) == 0) {
                            ActivityManager A062 = this.A03.A06();
                            if (A062 == null) {
                                Log.w("app/has-google-maps-v2 am=false");
                            } else if (A062.getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
                                z2 = true;
                            }
                        }
                        z = z2;
                    }
                }
            }
            this.A08 = Boolean.valueOf(z);
        }
        return this.A08.booleanValue();
    }

    public C622534h(C159027ky r1, C56972sr r2, C620633i r3, C56612sH r4, C54292oU r5, AnonymousClass33p r6, AnonymousClass1VX r7) {
        this.A04 = r4;
        this.A07 = r7;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = r6;
        this.A01 = r1;
    }

    public AnonymousClass1EU A02(C54942pX r5, Integer num) {
        AnonymousClass1A4 A0R = C18300x5.A0R();
        C21921Dr r0 = ((AnonymousClass1EU) A0R.A00).liveLocationMessage_;
        if (r0 == null) {
            r0 = C21921Dr.DEFAULT_INSTANCE;
        }
        AnonymousClass172 r02 = (AnonymousClass172) r0.A0H();
        A00(r02, r5, num);
        AnonymousClass1EU A0T = C18290x4.A0T(A0R);
        C21921Dr r03 = (C21921Dr) r02.A06();
        r03.getClass();
        A0T.liveLocationMessage_ = r03;
        A0T.bitField0_ |= 65536;
        return AnonymousClass0x9.A0W(A0R);
    }
}
