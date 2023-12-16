package X;

import androidx.car.app.CarAppBinder;
import androidx.car.app.IOnDoneCallback;

/* renamed from: X.0li  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12540li implements Runnable {
    public final /* synthetic */ CarAppBinder A00;
    public final /* synthetic */ IOnDoneCallback A01;
    public final /* synthetic */ String A02;

    public final void run() {
        this.A00.lambda$getManager$7(this.A02, this.A01);
    }

    public /* synthetic */ C12540li(CarAppBinder carAppBinder, String str, IOnDoneCallback iOnDoneCallback) {
        this.A00 = carAppBinder;
        this.A02 = str;
        this.A01 = iOnDoneCallback;
    }
}
