package X;

/* renamed from: X.5b7  reason: invalid class name and case insensitive filesystem */
public class C107325b7 implements C183298po {
    public Object A00;
    public final int A01;

    public C107325b7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTj() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass5TR r2 = (AnonymousClass5TR) obj;
            Runnable runnable = r2.A02;
            if (runnable != null) {
                r2.A09.A0R(runnable);
            }
            Runnable runnable2 = r2.A01;
            if (runnable2 != null) {
                r2.A09.A0R(runnable2);
            }
            r2.A02 = null;
            r2.A01 = null;
            r2.A03(false);
            return;
        }
        AnonymousClass566 r22 = (AnonymousClass566) obj;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("conversation/row/ConversationRowInlineVideoPlayer/onForceVideoPlayerRelease state=");
        C18260x0.A0m(r22.A00, A0o);
        r22.A0g();
    }
}
