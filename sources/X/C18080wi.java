package X;

import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnSelectedDelegateImpl;

/* renamed from: X.0wi  reason: invalid class name and case insensitive filesystem */
public class C18080wi implements C15650ri {
    public int A00;
    public Object A01;
    public final int A02;

    public C18080wi(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final Object B1v() {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            OnSelectedDelegateImpl.OnSelectedListenerStub.$r8$lambda$fKUdzFllb1AVIyam1QyB6oddRTc((OnSelectedDelegateImpl.OnSelectedListenerStub) obj, this.A00);
            throw AnonymousClass000.A0L();
        }
        AlertCallbackDelegateImpl.AlertCallbackStub.$r8$lambda$x1zoKpRCTVEbSbYWKHNstLhHAFE((AlertCallbackDelegateImpl.AlertCallbackStub) obj, this.A00);
        throw AnonymousClass000.A0L();
    }
}
