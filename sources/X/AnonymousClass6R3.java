package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6R3  reason: invalid class name */
public final class AnonymousClass6R3 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final Handler A00 = new C124806Dy(Looper.getMainLooper());
    public final C13570nO A01;
    public final AnonymousClass6Q8 A02;
    public final C163007t7 A03;
    public final AtomicReference A04 = new AtomicReference((Object) null);
    public volatile boolean A05;

    public final void A04(Bundle bundle) {
        AnonymousClass7GK r0;
        if (bundle != null) {
            AtomicReference atomicReference = this.A04;
            if (bundle.getBoolean("resolving_error", false)) {
                r0 = new AnonymousClass7GK(new C127866Tp(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                r0 = null;
            }
            atomicReference.set(r0);
        }
    }

    public final void A05(Bundle bundle) {
        AnonymousClass7GK r2 = (AnonymousClass7GK) this.A04.get();
        if (r2 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", r2.A00);
            C127866Tp r22 = r2.A01;
            bundle.putInt("failed_status", r22.A01);
            bundle.putParcelable("failed_resolution", r22.A02);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        C127866Tp r3 = new C127866Tp(13, (PendingIntent) null);
        AtomicReference atomicReference = this.A04;
        AnonymousClass7GK r0 = (AnonymousClass7GK) atomicReference.get();
        if (r0 == null) {
            i = -1;
        } else {
            i = r0.A00;
        }
        atomicReference.set((Object) null);
        this.A03.A05(r3, i);
    }

    public AnonymousClass6R3(AnonymousClass6Q8 r3, C163007t7 r4, C185368tX r5) {
        super(r5);
        this.A02 = r3;
        this.A01 = new C13570nO(0);
        this.A03 = r4;
        this.A00.AwP(this, "ConnectionlessLifecycleHelper");
    }
}
