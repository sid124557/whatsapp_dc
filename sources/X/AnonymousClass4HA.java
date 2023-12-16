package X;

import android.view.View;
import java.util.List;

/* renamed from: X.4HA  reason: invalid class name */
public class AnonymousClass4HA extends AnonymousClass3AQ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4HA(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void BMQ(View view) {
        C198012s r2;
        C05570Ua r1;
        List list;
        switch (this.A03) {
            case 0:
                ((C04830Qv) this.A01).A0A((AnonymousClass0u4) null);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                r2 = (C198012s) this.A00;
                r1 = (C05570Ua) this.A02;
                r2.A02(r1);
                list = r2.A0A;
                break;
            case 1:
                ((C04830Qv) this.A01).A0A((AnonymousClass0u4) null);
                r2 = (C198012s) this.A00;
                r1 = (C05570Ua) this.A02;
                r2.A02(r1);
                list = r2.A00;
                break;
            default:
                ((C04830Qv) this.A02).A0A((AnonymousClass0u4) null);
                AnonymousClass0x2.A0w(view);
                C198012s r3 = (C198012s) this.A00;
                C46652bz r22 = (C46652bz) this.A01;
                r3.A02(r22.A05);
                C18310x6.A1B(r3, r22.A05, r3.A02);
                return;
        }
        C18310x6.A1B(r2, r1, list);
    }

    public void BMS(View view) {
    }
}
