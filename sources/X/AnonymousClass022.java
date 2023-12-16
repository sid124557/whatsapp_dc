package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: X.022  reason: invalid class name */
public final class AnonymousClass022 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public void A00(Object obj) {
        C162457s7.A0J(obj, 1);
        this.A00.A03.remove(obj);
    }

    public AnonymousClass022(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }

    public /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        A00(obj);
    }
}
