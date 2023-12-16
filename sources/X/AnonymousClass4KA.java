package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;

/* renamed from: X.4KA  reason: invalid class name */
public class AnonymousClass4KA implements AnonymousClass499 {
    public Object A00;
    public final int A01;

    public AnonymousClass4KA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BNt(C108985dt r3) {
        AnonymousClass5ZB r0;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) obj;
            if (r3 != null && (r0 = businessProfileExtraFieldsActivity.A00) != null) {
                r0.A03(r3);
                return;
            }
            return;
        }
        ((AnonymousClass1LY) obj).A06(r3);
    }
}
