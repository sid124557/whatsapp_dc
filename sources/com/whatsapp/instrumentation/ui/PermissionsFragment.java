package com.whatsapp.instrumentation.ui;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass2OK;
import X.AnonymousClass48F;
import X.AnonymousClass5X8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class PermissionsFragment extends Hilt_PermissionsFragment {
    public AnonymousClass5X8 A00;
    public AnonymousClass1VX A01;
    public AnonymousClass2OK A02;
    public AnonymousClass48F A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 2131430772(0x7f0b0d74, float:1.8483254E38)
            android.view.View r1 = r6.findViewById(r0)
            r0 = 47
            X.C635439q.A00(r1, r4, r0)
            android.os.Bundle r1 = r4.A06
            if (r1 == 0) goto L_0x007b
            java.lang.String r0 = "content_variant"
            int r2 = r1.getInt(r0)
            r0 = 2
            if (r2 == r0) goto L_0x001c
            r0 = 1
            if (r2 != r0) goto L_0x007c
        L_0x001c:
            r0 = 2131430775(0x7f0b0d77, float:1.848326E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r6, r0)
            if (r1 == 0) goto L_0x002b
            r0 = 2131890230(0x7f121036, float:1.9415146E38)
            r1.setText(r0)
        L_0x002b:
            r0 = 2131430773(0x7f0b0d75, float:1.8483256E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r6, r0)
            r0 = 2131890225(0x7f121031, float:1.9415136E38)
        L_0x0035:
            if (r1 == 0) goto L_0x003a
            r1.setText(r0)
        L_0x003a:
            r0 = 2
            if (r2 == r0) goto L_0x0075
            r0 = 1
            if (r2 == r0) goto L_0x0075
            X.2OK r0 = r4.A02
            X.1VX r2 = r0.A01
            r1 = 2624(0xa40, float:3.677E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r2.A0O(r0, r1)
            r0 = 2
            if (r1 != r0) goto L_0x006f
            r3 = 2131890228(0x7f121034, float:1.9415142E38)
            java.lang.String r1 = "https://faq.whatsapp.com/660493885504088"
        L_0x0054:
            r0 = 2131430774(0x7f0b0d76, float:1.8483258E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r6, r0)
            X.5X8 r0 = r4.A00
            android.net.Uri r0 = r0.A00(r1)
            java.lang.String r0 = r0.toString()
            X.1VX r1 = r4.A01
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0)
            X.AnonymousClass5BC.A00(r2, r1, r0, r3)
            return
        L_0x006f:
            r3 = 2131890226(0x7f121032, float:1.9415138E38)
            java.lang.String r1 = "https://faq.whatsapp.com/general/security-and-privacy/about-your-privacy-when-using-whatsapp-on-ray-ban-stories/"
            goto L_0x0054
        L_0x0075:
            r3 = 2131890227(0x7f121033, float:1.941514E38)
            java.lang.String r1 = "https://faq.whatsapp.com/836703167795647"
            goto L_0x0054
        L_0x007b:
            r2 = 0
        L_0x007c:
            r0 = 2131430775(0x7f0b0d77, float:1.848326E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r6, r0)
            if (r1 == 0) goto L_0x008b
            r0 = 2131890229(0x7f121035, float:1.9415144E38)
            r1.setText(r0)
        L_0x008b:
            r0 = 2131430773(0x7f0b0d75, float:1.8483256E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r6, r0)
            r0 = 2131890224(0x7f121030, float:1.9415134E38)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.instrumentation.ui.PermissionsFragment.A0w(android.os.Bundle, android.view.View):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof AnonymousClass48F) {
            this.A03 = (AnonymousClass48F) context;
        }
    }
}
