package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5Pz  reason: invalid class name and case insensitive filesystem */
public final class C104185Pz {
    public final C105115Tq A00;
    public final C186568vZ A01;
    public final AtomicInteger A02 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);

    public final void A00(int i, String str, String str2) {
        C162457s7.A0J(str, 1);
        this.A01.markerPoint(694884634, i, str, str2);
    }

    public final void A01(C999858y r4, int i) {
        C162457s7.A0J(r4, 1);
        this.A01.markerEnd(694884634, i, r4.id);
    }

    public C104185Pz(C105115Tq r3, C186568vZ r4) {
        C18260x0.A0Q(r4, r3);
        this.A01 = r4;
        this.A00 = r3;
    }
}
