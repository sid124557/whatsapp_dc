package X;

import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.concurrent.Callable;

/* renamed from: X.8Oa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C173028Oa implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass8KC A02;

    public final Object call() {
        int i;
        AnonymousClass8KC r1 = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        if (!r1.A0E()) {
            i = -6;
        } else {
            r1.A05(AnonymousClass8KC.A0O);
            GlVideoRenderer glVideoRenderer = r1.A0G;
            i = 0;
            glVideoRenderer.setWindow(0, 0, i2, i3);
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ C173028Oa(AnonymousClass8KC r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }
}
