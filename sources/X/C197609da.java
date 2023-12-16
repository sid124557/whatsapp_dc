package X;

import android.util.Base64;
import java.util.Map;

/* renamed from: X.9da  reason: invalid class name and case insensitive filesystem */
public final class C197609da implements AnonymousClass4DR {
    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        AnonymousClass39S r0;
        AnonymousClass39H r02;
        AnonymousClass39S r03;
        AnonymousClass39S r04;
        AnonymousClass39S r05;
        AnonymousClass39S r06;
        byte[] bArr;
        AnonymousClass39S r07;
        AnonymousClass39S r08;
        C30791n7 r7 = (C30791n7) obj;
        AnonymousClass9KE r6 = (AnonymousClass9KE) enumR;
        C162457s7.A0J(r7, 0);
        C162457s7.A0J(r6, 1);
        switch (r6.ordinal()) {
            case 0:
                AnonymousClass39W r09 = r7.A00;
                if (r09 == null || (r04 = r09.A01) == null) {
                    return null;
                }
                return r04.A0E;
            case 1:
                AnonymousClass39W r010 = r7.A00;
                if (r010 == null || (r05 = r010.A01) == null) {
                    return null;
                }
                return r05.A04();
            case 2:
                AnonymousClass39W r011 = r7.A00;
                if (r011 == null || (r06 = r011.A01) == null || (bArr = r06.A0M) == null) {
                    return null;
                }
                return Base64.encodeToString(bArr, 0);
            case 3:
                AnonymousClass39W r012 = r7.A00;
                if (r012 == null || (r07 = r012.A01) == null) {
                    return null;
                }
                return r07.A0F;
            case 4:
                AnonymousClass39W r013 = r7.A00;
                if (r013 == null || (r08 = r013.A01) == null) {
                    return null;
                }
                AnonymousClass39G r4 = r08.A09;
                C85204Fi r3 = r08.A06;
                if (r4 == null || r3 == null) {
                    return null;
                }
                C60042xu r2 = new C60042xu();
                r2.A01 = r4.A01;
                r2.A00 = r4.A00;
                r2.A02 = r3;
                return r2.A01();
            case 5:
                AnonymousClass39W r014 = r7.A00;
                if (r014 == null || (r0 = r014.A01) == null || (r02 = r0.A07) == null) {
                    return "UNKNOWN";
                }
                switch (AnonymousClass39S.A00(r02.A01)) {
                    case 1:
                        return "PENDING";
                    case 2:
                        return "PROCESSING";
                    case 3:
                        return "COMPLETED";
                    case 4:
                        return "CANCELED";
                    case 5:
                        return "PARTIALLY_SHIPPED";
                    case 6:
                        return "SHIPPED";
                    case 7:
                        return "PAYMENT_REQUESTED";
                    case 8:
                        return "PREPARING_TO_SHIP";
                    case 9:
                        return "DELIVERED";
                    default:
                        return "UNKNOWN";
                }
            case 6:
                AnonymousClass39W r015 = r7.A00;
                if (r015 == null || (r03 = r015.A01) == null) {
                    return "UNKNOWN";
                }
                int A02 = r03.A02();
                if (A02 == 1) {
                    return "DIGITAL_GOODS";
                }
                if (A02 == 2) {
                    return "PHYSICAL_GOODS";
                }
                return "UNKNOWN";
            default:
                throw new C73153f1();
        }
    }

    public Class B3E() {
        return AnonymousClass9KE.class;
    }
}
