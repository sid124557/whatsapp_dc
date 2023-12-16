package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Map;

/* renamed from: X.0y8  reason: invalid class name and case insensitive filesystem */
public final class C18710y8 extends Handler {
    public final /* synthetic */ C65223Gr A00;

    public void handleMessage(Message message) {
        C162457s7.A0J(message, 0);
        Object obj = message.obj;
        C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.protocol.FMessage");
        C65223Gr r2 = this.A00;
        Map map = r2.A09;
        AnonymousClass2z0 A0B = C627636p.A0B((C624134x) obj);
        C162457s7.A0D(A0B);
        C624134x r0 = (C624134x) map.get(A0B);
        if (r0 != null) {
            r2.A00(r0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18710y8(Looper looper, C65223Gr r2) {
        super(looper);
        this.A00 = r2;
    }
}
