package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4Sq  reason: invalid class name and case insensitive filesystem */
public class C87444Sq extends C04550Os {
    public static final Set A03;
    public static final Set A04 = Collections.unmodifiableSet(AnonymousClass0x9.A15(Collections.singletonList(5)));
    public final C55682qk A00;
    public final AnonymousClass65C A01;
    public final String A02;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 4);
        AnonymousClass000.A1M(numArr, 11);
        AnonymousClass000.A1N(numArr, 12);
        AnonymousClass000.A1O(numArr, 14);
        AnonymousClass000.A1P(numArr, 15, 4);
        A03 = Collections.unmodifiableSet(C18280x3.A0h(numArr));
    }

    public void A00() {
        Log.i("DeviceAuthenticationPlugin/AuthenticationCallback/failed");
    }

    public void A02(AnonymousClass0L0 r3) {
        Log.i("DeviceAuthenticationPlugin/AuthenticationCallback/succeeded");
        this.A01.BMz(-1);
    }

    public C87444Sq(C55682qk r1, AnonymousClass65C r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public void A01(int i, CharSequence charSequence) {
        AnonymousClass65C r1;
        int i2;
        C18260x0.A0y("DeviceAuthenticationPlugin/AuthenticationCallback/errorCode: ", AnonymousClass001.A0o(), i);
        Set set = A03;
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            C55682qk r2 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DeviceAuthenticationPlugin/FatalError/");
            r2.A0A(AnonymousClass000.A0X(this.A02, A0o), false, String.valueOf(i));
            r1 = this.A01;
            i2 = 2;
        } else if (A04.contains(valueOf)) {
            C55682qk r22 = this.A00;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("DeviceAuthenticationPlugin/TemporaryError/");
            r22.A0A(AnonymousClass000.A0X(this.A02, A0o2), false, String.valueOf(i));
            r1 = this.A01;
            i2 = 3;
        } else {
            this.A01.BMz(0);
            return;
        }
        r1.BMz(i2);
    }
}
