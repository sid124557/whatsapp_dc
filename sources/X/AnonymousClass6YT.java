package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* renamed from: X.6YT  reason: invalid class name */
public final class AnonymousClass6YT extends AnonymousClass6YU implements C187778xn, C187788xo {
    public static final AnonymousClass6QU A07 = AnonymousClass79S.A00;
    public C180888ln A00;
    public C187678xd A01;
    public final Context A02;
    public final Handler A03;
    public final AnonymousClass6QU A04;
    public final AnonymousClass7P4 A05;
    public final Set A06;

    public AnonymousClass6YT(Context context, Handler handler, AnonymousClass7P4 r5) {
        AnonymousClass6QU r1 = A07;
        this.A02 = context;
        this.A03 = handler;
        this.A05 = r5;
        this.A06 = r5.A05;
        this.A04 = r1;
    }

    public final void onConnected(Bundle bundle) {
        this.A01.Bsy(this);
    }

    public final void onConnectionFailed(C127866Tp r2) {
        this.A00.Bt1(r2);
    }

    public final void onConnectionSuspended(int i) {
        this.A01.B1l();
    }
}
