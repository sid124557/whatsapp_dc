package X;

import android.graphics.BitmapFactory;
import java.util.Map;

/* renamed from: X.9de  reason: invalid class name and case insensitive filesystem */
public final class C197649de implements AnonymousClass4DR {
    public final C54292oU A00;
    public final AnonymousClass9V1 A01;

    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        C166557yt r0;
        String str;
        C133796hx r6 = (C133796hx) obj;
        AnonymousClass9KF r5 = (AnonymousClass9KF) enumR;
        C18260x0.A0O(r6, r5);
        if (!(r6 instanceof AnonymousClass99H)) {
            return null;
        }
        switch (r5.ordinal()) {
            case 0:
                r0 = ((AnonymousClass99H) r6).A03;
                break;
            case 1:
                return ((AnonymousClass99H) r6).A0A;
            case 2:
                String str2 = ((AnonymousClass99H) r6).A0B;
                if (str2 == null) {
                    return "UNKNOWN";
                }
                switch (str2.hashCode()) {
                    case -1704036199:
                        str = "SAVINGS";
                        break;
                    case -240997565:
                        str = "OD_SECURED";
                        break;
                    case 358786314:
                        str = "OD_UNSECURED";
                        break;
                    case 1844922713:
                        if (str2.equals("CURRENT")) {
                            return "CURRENT";
                        }
                        return "UNKNOWN";
                    case 1996005113:
                        str = "CREDIT";
                        break;
                    default:
                        return "UNKNOWN";
                }
                if (!str2.equals(str)) {
                    return "UNKNOWN";
                }
                return str;
            case 3:
                return ((C133766hu) r6).A03;
            case 4:
                r0 = ((AnonymousClass99H) r6).A05;
                break;
            case 5:
                r0 = ((AnonymousClass99H) r6).A09;
                break;
            case 6:
                return ((AnonymousClass99H) r6).A0F;
            case 7:
                return C107245ax.A07(BitmapFactory.decodeResource(C54292oU.A00(this.A00), this.A01.A00(((AnonymousClass99H) r6).A0A, (String) null).A00));
            case 8:
                r0 = ((AnonymousClass99H) r6).A06;
                break;
            default:
                throw new C73153f1();
        }
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public C197649de(C54292oU r1, AnonymousClass9V1 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public Class B3E() {
        return AnonymousClass9KF.class;
    }
}
