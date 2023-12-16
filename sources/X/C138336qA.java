package X;

import android.content.Context;

/* renamed from: X.6qA  reason: invalid class name and case insensitive filesystem */
public class C138336qA extends AnonymousClass6FP {
    public final C125036Ex A00;

    public void setIsFullscreen(boolean z) {
        this.A00.A01 = !z;
    }

    public C138336qA(Context context, int i) {
        super(context);
        setClipToOutline(true);
        C125036Ex r0 = new C125036Ex();
        this.A00 = r0;
        r0.A00 = i;
        setOutlineProvider(r0);
    }
}
