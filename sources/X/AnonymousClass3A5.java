package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3A5  reason: invalid class name */
public class AnonymousClass3A5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Runnable A02;

    public AnonymousClass3A5(Handler handler, View view, Runnable runnable) {
        this.A00 = handler;
        this.A02 = runnable;
        this.A01 = view;
    }

    public boolean onPreDraw() {
        Handler handler = this.A00;
        Message obtain = Message.obtain(handler, this.A02);
        C379424q.A00(obtain);
        handler.sendMessageAtFrontOfQueue(obtain);
        AnonymousClass0x7.A16(this.A01, this);
        return true;
    }
}
