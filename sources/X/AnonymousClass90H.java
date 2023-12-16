package X;

import android.content.Context;
import com.whatsapp.support.Remove;

/* renamed from: X.90H  reason: invalid class name */
public class AnonymousClass90H implements C15520rV {
    public Object A00;
    public final int A01;

    public AnonymousClass90H(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BQ0(Context context) {
        switch (this.A01) {
            case AnonymousClass1EU.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
            case 79:
                ((AnonymousClass4TR) this.A00).A5e();
                return;
            case 105:
                Remove remove = (Remove) this.A00;
                if (!remove.A00) {
                    remove.A00 = true;
                    remove.generatedComponent();
                    return;
                }
                return;
            default:
                ((AnonymousClass4SG) this.A00).A5r();
                return;
        }
    }
}
