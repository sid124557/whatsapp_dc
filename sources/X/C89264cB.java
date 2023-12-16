package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.4cB  reason: invalid class name and case insensitive filesystem */
public final class C89264cB extends C88944b3 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass5JB A01;
    public final /* synthetic */ C624134x A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89264cB(Context context, C69263Wi r8, C85244Fm r9, AnonymousClass5JB r10, C620633i r11, C624134x r12, String str) {
        super(context, r9, r8, r11, str);
        this.A00 = context;
        this.A01 = r10;
        this.A02 = r12;
    }

    public void onClick(View view) {
        C116985rC r1 = this.A01.A00;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("showPaymentAmountDetectionBottomsheetHelper");
        }
    }
}
