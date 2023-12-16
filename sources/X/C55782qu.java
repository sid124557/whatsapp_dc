package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2qu  reason: invalid class name and case insensitive filesystem */
public final class C55782qu {
    public Integer A00;
    public final C186568vZ A01;
    public final AtomicInteger A02 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);

    public C55782qu(C186568vZ r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
    }

    public final void A01(int i, String str) {
        C162457s7.A0J(str, 1);
        this.A01.markerPoint(354170068, i, str);
    }

    public final void A02(C372621o r4, int i) {
        C162457s7.A0J(r4, 1);
        this.A01.markerEnd(354170068, i, r4.id);
    }

    public final void A05(C40752Hp r4, String str, int i) {
        C162457s7.A0J(str, 2);
        this.A01.markerAnnotate(354170068, i, r4.A00, str);
    }

    public final int A00() {
        int andIncrement = this.A02.getAndIncrement();
        this.A01.markerStart(354170068, andIncrement);
        return andIncrement;
    }

    public final void A03(C40752Hp r4, int i, int i2) {
        this.A01.markerAnnotate(354170068, i, r4.A00, i2);
    }

    public final void A04(C40752Hp r7, int i, long j) {
        this.A01.markerAnnotate(354170068, i, r7.A00, j);
    }
}
