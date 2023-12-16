package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.4b1  reason: invalid class name and case insensitive filesystem */
public class C88924b1 extends C86994Mr {
    public final /* synthetic */ C93314oJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88924b1(Context context, C93314oJ r2) {
        super(context);
        this.A00 = r2;
    }

    public void onClick(View view) {
        C93314oJ r3 = this.A00;
        C624134x fMessage = r3.getFMessage();
        AnonymousClass677 r1 = r3.A0m;
        if (r1 != null) {
            r1.Bmp(fMessage, r1.BAS(fMessage) + 1);
            r3.A1H();
        }
    }
}
