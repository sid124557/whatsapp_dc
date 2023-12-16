package X;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* renamed from: X.2Yc  reason: invalid class name and case insensitive filesystem */
public class C44952Yc {
    public final /* synthetic */ AnonymousClass5ND A00;
    public final /* synthetic */ AnonymousClass8s5 A01;

    public C44952Yc(AnonymousClass5ND r1, AnonymousClass8s5 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00() {
        Handler A0A = AnonymousClass000.A0A();
        AnonymousClass8s5 r1 = this.A01;
        Objects.requireNonNull(r1);
        Message obtain = Message.obtain(A0A, C71263bp.A00(r1, 19));
        C379424q.A00(obtain);
        A0A.sendMessageAtFrontOfQueue(obtain);
    }
}
