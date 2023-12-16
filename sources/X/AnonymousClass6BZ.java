package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import java.util.ArrayList;

/* renamed from: X.6BZ  reason: invalid class name */
public class AnonymousClass6BZ implements C184418rl {
    public Object A00;
    public final int A01;

    public AnonymousClass6BZ(AnonymousClass5Y5 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void BRr() {
        int i = this.A01;
        AnonymousClass5Y5 r1 = (AnonymousClass5Y5) this.A00;
        if (i != 0) {
            r1.A00();
        } else if (r1.A02 != null) {
            r1.A02((String) null);
        }
    }

    public void Baz(C102925Ku r15) {
        int i;
        int i2 = this.A01;
        AnonymousClass5Y5 r3 = (AnonymousClass5Y5) this.A00;
        ContactUsActivity contactUsActivity = r3.A02;
        if (i2 != 0) {
            if (contactUsActivity != null) {
                i = 2;
            } else {
                return;
            }
        } else if (contactUsActivity != null) {
            i = 1;
        } else {
            return;
        }
        C626936e.A06(contactUsActivity);
        int i3 = r15.A00;
        ArrayList A0I = AnonymousClass002.A0I(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            A0I.add(new C108955dq((C166277yQ) null, C86664Kz.A1M(r15.A04, i4), C86664Kz.A1M(r15.A06, i4), C86664Kz.A1M(r15.A03, i4), C86664Kz.A1M(r15.A07, i4), (ArrayList) null, false));
        }
        int i5 = 2;
        if (i == 2) {
            i5 = 1;
        }
        if ("biz-directory-browsing".equals(r3.A02.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from"))) {
            r3.A00();
            return;
        }
        ContactUsActivity contactUsActivity2 = r3.A02;
        String str = r15.A01;
        Intent A0K = C627736r.A0K(contactUsActivity2, (Bundle) null, contactUsActivity2.A74(A0I), 2, i5);
        A0K.putExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", i);
        A0K.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info", str);
        contactUsActivity2.startActivityForResult(A0K, 11);
    }
}
