package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.53z  reason: invalid class name and case insensitive filesystem */
public class C989853z extends C109665ez {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C111755id A01;
    public final /* synthetic */ String A02;

    public C989853z(C111755id r1, String str, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = str;
    }

    public void A07(View view) {
        C111755id r1 = this.A01;
        if ((!r1.A0D() || !r1.A0V.A07()) && !r1.A0E()) {
            ContactInfoActivity contactInfoActivity = r1.A0n;
            int i = this.A00;
            String str = this.A02;
            UserJid A022 = r1.A02();
            Intent A07 = C18320x8.A07();
            A07.setClassName(contactInfoActivity.getPackageName(), "com.whatsapp.businessupsell.BusinessProfileEducation");
            A07.putExtra("key_extra_verified_level", i);
            A07.putExtra("key_extra_business_name", str);
            AnonymousClass0x2.A0u(A07, A022, "key_extra_business_jid");
            contactInfoActivity.startActivity(A07);
            return;
        }
        C116985rC.A03(r1.A0V).BpI(r1.A0n, true);
    }
}
