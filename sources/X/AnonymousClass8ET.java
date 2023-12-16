package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8ET  reason: invalid class name */
public final class AnonymousClass8ET implements C184028r8 {
    public final /* synthetic */ C184028r8 A00;
    public final /* synthetic */ AnonymousClass5QD A01;

    public AnonymousClass8ET(C184028r8 r1, AnonymousClass5QD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BT7(C151157Tq r2, int i) {
        Log.d("WACC CachedCatalogCategoryRepository/onFetchCategoriesFailure/errorCode");
        this.A00.BT7(r2, i);
    }

    public void BT8(C151157Tq r4, C64553Dy r5) {
        Log.d("WACC CachedCatalogCategoryRepository/onFetchCategoriesSuccess");
        boolean isEmpty = r4.A04.isEmpty();
        C55752qr r1 = this.A01.A03;
        UserJid userJid = r4.A02;
        C162457s7.A0C(userJid);
        r1.A03(r5, userJid, isEmpty);
        this.A00.BT8(r4, r5);
    }
}
