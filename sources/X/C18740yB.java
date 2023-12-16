package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewConfiguration;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;

/* renamed from: X.0yB  reason: invalid class name and case insensitive filesystem */
public final class C18740yB extends Handler {
    public final /* synthetic */ ExpressionsBottomSheetView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18740yB(Looper looper, ExpressionsBottomSheetView expressionsBottomSheetView) {
        super(looper);
        this.A00 = expressionsBottomSheetView;
    }

    public void handleMessage(Message message) {
        this.A00.getExpressionsViewModel().A0D();
        sendEmptyMessageDelayed(0, (long) ViewConfiguration.getKeyRepeatDelay());
    }
}
