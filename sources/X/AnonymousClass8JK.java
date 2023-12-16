package X;

import android.util.Pair;

/* renamed from: X.8JK  reason: invalid class name */
public class AnonymousClass8JK implements C184558s8 {
    public final /* synthetic */ AnonymousClass5PC A00;

    public AnonymousClass8JK(AnonymousClass5PC r1) {
        this.A00 = r1;
    }

    public void BS1(Pair pair) {
        AnonymousClass08M r1 = this.A00.A07;
        if (r1 != null) {
            r1.A0G(Boolean.TRUE);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.A0M.BkM(new C117165rU(this, 40, obj));
    }
}
