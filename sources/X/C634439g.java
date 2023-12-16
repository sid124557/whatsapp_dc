package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: X.39g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C634439g implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C22711Pu A02;

    public final void onClick(View view) {
        C22711Pu r0 = this.A02;
        long j = this.A00;
        Context context = this.A01;
        AnonymousClass1hJ r3 = new AnonymousClass1hJ(r0.A03, String.valueOf(j));
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.product.integrityappeals.NewsletterRequestReviewActivity");
        A07.putExtra("appeal-request", r3);
        context.startActivity(A07);
    }

    public /* synthetic */ C634439g(Context context, C22711Pu r2, long j) {
        this.A02 = r2;
        this.A00 = j;
        this.A01 = context;
    }
}
