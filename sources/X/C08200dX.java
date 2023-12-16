package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: X.0dX  reason: invalid class name and case insensitive filesystem */
public final class C08200dX implements C17180uh {
    public final Context A00;

    public void B0W(Context context, C03710Lg r8, CancellationSignal cancellationSignal, Executor executor, C16630ti r11) {
        AnonymousClass0u5 A02 = AnonymousClass0JY.A00.A02(this.A00);
        C16630ti r5 = r11;
        if (A02 == null) {
            r11.BSE(new C007406n("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            A02.onCreateCredential(context, r8, cancellationSignal, executor, r5);
        }
    }

    public void B6G(Context context, AnonymousClass0KT r8, CancellationSignal cancellationSignal, Executor executor, C16630ti r11) {
        AnonymousClass0u5 A02 = AnonymousClass0JY.A00.A02(this.A00);
        C16630ti r5 = r11;
        if (A02 == null) {
            r11.BSE(new C008106u("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            A02.onGetCredential(context, r8, cancellationSignal, executor, r5);
        }
    }

    public C08200dX(Context context) {
        this.A00 = context;
    }
}
