package X;

import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import androidx.car.app.navigation.model.PanModeDelegateImpl;

/* renamed from: X.0wl  reason: invalid class name and case insensitive filesystem */
public class C18110wl implements C15650ri {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C18110wl(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final Object B1v() {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            PanModeDelegateImpl.PanModeListenerStub.$r8$lambda$LqYy1vRrRropiFqxnLxOFkdo8I0((PanModeDelegateImpl.PanModeListenerStub) obj, this.A01);
            throw AnonymousClass000.A0L();
        }
        OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub.$r8$lambda$ajJY3J__wF0eQzHmi5qujwF7Tbg((OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub) obj, this.A01);
        throw AnonymousClass000.A0L();
    }
}
