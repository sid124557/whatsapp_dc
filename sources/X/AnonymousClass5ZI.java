package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5ZI  reason: invalid class name */
public final class AnonymousClass5ZI {
    public static final AtomicInteger A04 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);
    public Integer A00;
    public String A01;
    public final int A02;
    public final C186568vZ A03;

    public AnonymousClass5ZI(C186568vZ r2, int i) {
        C162457s7.A0J(r2, 1);
        this.A03 = r2;
        this.A02 = i;
    }

    public static void A01(AnonymousClass5ZI r4, Number number, String str) {
        if (number != null) {
            r4.A03.markerPoint(r4.A02, number.intValue(), A00(str, r4.A02()));
            return;
        }
        r4.A03.markerPoint(r4.A02, A00(str, r4.A02()));
    }

    public String A02() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw C18270x1.A0S("endpointName");
    }

    public void A03() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerEnd(this.A02, num.intValue(), 3);
            return;
        }
        this.A03.markerEnd(this.A02, 3);
    }

    public void A04() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerEnd(this.A02, num.intValue(), 2);
            return;
        }
        this.A03.markerEnd(this.A02, 2);
    }

    public void A05() {
        A01(this, this.A00, "graphapi_response_parsing_success");
    }

    public void A06() {
        A01(this, this.A00, "graphapi_request_end");
    }

    public void A07() {
        A01(this, this.A00, "graphapi_request_start");
    }

    public void A08() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerStart(this.A02, num.intValue());
            return;
        }
        this.A03.markerStart(this.A02);
    }

    public final void A09(String str) {
        Integer num = this.A00;
        if (num != null) {
            this.A03.markerPoint(this.A02, num.intValue(), str);
            return;
        }
        this.A03.markerPoint(this.A02, str);
    }

    public static final String A00(String str, String str2) {
        return AnonymousClass0x2.A0e(str, AnonymousClass000.A0l(str2), '_');
    }
}
