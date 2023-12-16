package X;

import android.util.Log;
import java.util.Collections;

/* renamed from: X.5qi  reason: invalid class name and case insensitive filesystem */
public class C116695qi implements C84724Dl {
    public final /* synthetic */ C009707r A00;
    public final /* synthetic */ AnonymousClass64K A01;
    public final /* synthetic */ AnonymousClass5K4 A02;
    public final /* synthetic */ C47382dA A03;

    public C116695qi(C009707r r1, AnonymousClass64K r2, AnonymousClass5K4 r3, C47382dA r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BaH(C150917Ss r5) {
        C159377lj.A02(this.A00, r5, C157967jD.A01, this.A03, Collections.emptyMap());
        this.A01.B29(true);
    }

    public void BaN(C46202bF r3) {
        if (r3.A00 == 5) {
            Log.e("", "should launch as an async action");
        }
        this.A01.B29(false);
    }
}
