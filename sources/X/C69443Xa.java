package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3Xa  reason: invalid class name and case insensitive filesystem */
public class C69443Xa implements C84724Dl {
    public final C84724Dl A00;
    public final /* synthetic */ C55552qX A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public void BaH(C150917Ss r2) {
        C162457s7.A0J(r2, 0);
        this.A00.BaH(r2);
    }

    public C69443Xa(C55552qX r1, C84724Dl r2, String str, String str2, boolean z) {
        this.A01 = r1;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = r2;
    }

    public void BaN(C46202bF r6) {
        String str;
        C59842xa r2;
        String str2;
        String str3;
        C59842xa r3;
        String str4;
        String str5;
        String str6 = null;
        if (r6.A03) {
            r3 = this.A01.A06;
            str4 = this.A03;
            str5 = "CACHE_HIT";
        } else {
            String str7 = this.A02;
            if (r6.A00 == 5) {
                boolean z = this.A04;
                r3 = this.A01.A06;
                str4 = this.A03;
                if (z) {
                    str5 = "REQUEST_SUCCESS";
                } else {
                    str5 = "PREFETCH_REQUEST_SUCCESS";
                }
            } else {
                Exception exc = r6.A02;
                if (exc != null) {
                    str6 = exc.getMessage();
                }
                HashMap A0t = AnonymousClass001.A0t();
                switch (r6.A00) {
                    case 1:
                        str = "REQUEST_FAILED";
                        break;
                    case 2:
                        str = "INVALID_TOS_VERSION";
                        break;
                    case 3:
                        str = "NULL_LAYOUT";
                        break;
                    case 4:
                        str = "UNEXPECTED_ERROR";
                        break;
                    case 5:
                        str = "SUCCESS";
                        break;
                    case 6:
                        str = "UNKNOWN";
                        break;
                    case 7:
                        str = "NETWORK_ERROR";
                        break;
                    case 8:
                        str = "EXPIRED_TOKEN";
                        break;
                    case 9:
                        str = "PING_NEEDED";
                        break;
                    default:
                        str = "RETRY_WITH_BACKOFF";
                        break;
                }
                A0t.put("EVENT_PARAM_ERROR_CODE", str);
                A0t.put("EVENT_PARAM_ERROR_MESSAGE", str6);
                if (this.A04) {
                    r2 = this.A01.A06;
                    str2 = this.A03;
                    str3 = "REQUEST_FAILURE";
                } else {
                    A0t.put("EVENT_PARAM_BLOKS_PARAMS", str7);
                    r2 = this.A01.A06;
                    str2 = this.A03;
                    str3 = "PREFETCH_REQUEST_FAILURE";
                }
                r2.A02(str2, str3, A0t);
                this.A00.BaN(r6);
            }
        }
        r3.A02(str4, str5, (Map) null);
        this.A00.BaN(r6);
    }
}
