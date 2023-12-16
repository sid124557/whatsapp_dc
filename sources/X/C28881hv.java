package X;

import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1hv  reason: invalid class name and case insensitive filesystem */
public class C28881hv extends C61102zi {
    public Map A00 = AnonymousClass001.A0t();
    public final C44282Vl A01;
    public final C44742Xh A02;
    public final C48942fj A03;
    public final C56612sH A04;
    public final AnonymousClass33p A05;
    public final C621133n A06;
    public final AnonymousClass31C A07;

    public C28881hv(C44282Vl r2, C44742Xh r3, C48942fj r4, C56612sH r5, AnonymousClass33p r6, C621133n r7, AnonymousClass31C r8) {
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A08() {
        String str;
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            C58212ut r6 = (C58212ut) A032.next();
            LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = r6.A00;
            C44742Xh r4 = linkedDevicesEnterCodeActivity.A04;
            C60172y7 A002 = r4.A00.A00();
            String str2 = null;
            if (A002 != null) {
                str = A002.A02;
                str2 = A002.A01;
            } else {
                str = null;
            }
            r4.A00(13, str, str2);
            linkedDevicesEnterCodeActivity.runOnUiThread(C71313bu.A00(r6, 42));
        }
    }

    public final void A09(String str, String str2) {
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            C58212ut r3 = (C58212ut) A032.next();
            LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = r3.A00;
            linkedDevicesEnterCodeActivity.A04.A00(9, str, str2);
            linkedDevicesEnterCodeActivity.runOnUiThread(C71313bu.A00(r3, 41));
        }
    }

    public final void A0A(String str, String str2) {
        Iterator A032 = C61102zi.A03(this);
        while (A032.hasNext()) {
            C58212ut r4 = (C58212ut) A032.next();
            LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = r4.A00;
            AnonymousClass33p r5 = linkedDevicesEnterCodeActivity.A09;
            int i = AnonymousClass0x2.A0F(r5).getInt("companion_reg_with_link_code_retry_count", 0) + 1;
            C18260x0.A0L(r5, "companion_reg_with_link_code_retry_count", i);
            if (i >= 3) {
                Log.w("LinkedDevicesEnterCodeActivity/companionRegWithLinkCodeObserver/onLinkCodeIsWrong retry limit is exceeded");
                C18260x0.A0K(linkedDevicesEnterCodeActivity.A09, "companion_reg_with_link_code_retry_count");
                linkedDevicesEnterCodeActivity.A04.BkM(new C71323bv(24, str, r4));
                new AnonymousClass3TD(linkedDevicesEnterCodeActivity.A0D).A00(str, (String) null);
            }
            linkedDevicesEnterCodeActivity.A04.A00(8, str, str2);
            linkedDevicesEnterCodeActivity.runOnUiThread(C71313bu.A00(r4, 44));
        }
    }
}
