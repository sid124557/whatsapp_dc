package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.whatsapp.R;
import com.whatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.67b  reason: invalid class name and case insensitive filesystem */
public class C1230867b extends AnonymousClass0WH {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1230867b(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(C1230867b r1, C05650Ui r2) {
        super.A0D((View) r1.A01, r2);
        C88474Yw r0 = (C88474Yw) r1.A00;
        C86644Kx.A1B(r2, r0.A07.getString(r0.A00), 16);
    }

    public void A05(View view, int i) {
        if (1 - this.A02 == 0 && i == 256) {
            AnonymousClass561 r1 = (AnonymousClass561) this.A01;
            if (!C86604Kt.A1Y(r1.A0E)) {
                r1.A05();
            }
            r1.A0E(3000);
            return;
        }
        super.A05(view, i);
    }

    public void A06(View view, AccessibilityEvent accessibilityEvent) {
        if (2 - this.A02 != 0) {
            super.A06(view, accessibilityEvent);
            return;
        }
        super.A06(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            AnonymousClass0x9.A1K(this.A01);
            ((VerifyPhoneNumber) this.A00).A7L();
        }
    }

    public void A0D(View view, C05650Ui r4) {
        String str;
        switch (this.A02) {
            case 0:
                super.A0D(view, r4);
                str = ((C149407Mi) this.A01).A02;
                break;
            case 2:
                super.A0D(view, r4);
                str = ((Context) this.A00).getString(R.string.f11nameremoved);
                break;
            case 3:
                A00(this, r4);
                return;
            default:
                super.A0D(view, r4);
                return;
        }
        C86644Kx.A1B(r4, str, 16);
    }
}
