package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.5Sp  reason: invalid class name and case insensitive filesystem */
public final class C104855Sp {
    public final C89964fZ A00;
    public final C89994fc A01;
    public final C89974fa A02;
    public final Map A03;
    public final Map A04 = Collections.synchronizedMap(C18320x8.A0r());
    public final AnonymousClass66R A05;

    public void A00(ARModelMetadataRequest aRModelMetadataRequest, AnonymousClass9KQ r6, AnonymousClass32L r7, boolean z) {
        short s;
        C162457s7.A0J(aRModelMetadataRequest, 0);
        if (!A02(r7)) {
            C89974fa r3 = this.A02;
            int A08 = C18310x6.A08(aRModelMetadataRequest.getCapability().name(), C18310x6.A1b(r7.A01, 0), 1);
            if (!z) {
                if (r6 != null) {
                    String A012 = r6.A01();
                    C162457s7.A0D(A012);
                    r3.A02(A08, "failure_reason", A012);
                }
                s = 3;
            } else {
                s = 2;
            }
            r3.A03(A08, s);
        }
    }

    public void A01(C195349Xk r10, AnonymousClass9KQ r11, AnonymousClass32L r12, boolean z) {
        String str;
        int i;
        String str2;
        this.A04.remove(r10.A03());
        if (!A02(r12)) {
            C89994fc r3 = this.A01;
            long A06 = r3.A06(r12);
            synchronized (r3) {
                if (r3.A00 == A06) {
                    r3.A00 = 0;
                }
            }
            if (z) {
                C32251pv r0 = r3.A01;
                if (r0 != null) {
                    r0.flowEndSuccess(A06);
                } else {
                    UserFlowLogger userFlowLogger = r3.A00;
                    if (userFlowLogger != null) {
                        userFlowLogger.flowEndSuccess(A06);
                    } else {
                        throw C18290x4.A0Y();
                    }
                }
            } else {
                if (r11 != null) {
                    r3.A03(A06, "failure_reason", r11.toString());
                    str = r11.A00().name();
                    i = 0;
                    str2 = r11.A01();
                    C162457s7.A0D(str2);
                } else {
                    str = "unknown";
                    i = 0;
                    str2 = str;
                }
                r3.A02(A06, str, i, str2);
            }
            this.A03.remove(r12.A01);
        }
    }

    public final boolean A02(AnonymousClass32L r3) {
        if (C18270x1.A1V(this.A05) || r3.A02) {
            return true;
        }
        return false;
    }

    public C104855Sp(AnonymousClass59x r3, C56612sH r4, AnonymousClass1VX r5, AnonymousClass8JP r6, C32251pv r7) {
        C18260x0.A0c(r4, r5, r7, r6);
        this.A05 = C154517dI.A00(AnonymousClass58H.PUBLICATION, new C118825vz(r5));
        Map synchronizedMap = Collections.synchronizedMap(C18320x8.A0r());
        this.A03 = synchronizedMap;
        C162457s7.A0D(synchronizedMap);
        this.A01 = new C89994fc(r3, r7, synchronizedMap);
        this.A02 = new C89974fa(r4, r6, synchronizedMap);
        this.A00 = new C89964fZ(r3, r4, r6, synchronizedMap);
    }
}
