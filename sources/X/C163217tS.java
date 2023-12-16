package X;

import android.os.MessageQueue;
import com.whatsapp.AbstractAppShellDelegate;

/* renamed from: X.7tS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C163217tS implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass4FO A00;
    public final /* synthetic */ AbstractAppShellDelegate A01;

    public final boolean queueIdle() {
        return this.A01.lambda$queueAsyncInit$6(this.A00);
    }

    public /* synthetic */ C163217tS(AnonymousClass4FO r1, AbstractAppShellDelegate abstractAppShellDelegate) {
        this.A01 = abstractAppShellDelegate;
        this.A00 = r1;
    }
}
