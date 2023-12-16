package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Dm  reason: invalid class name and case insensitive filesystem */
public class C64443Dm implements AnonymousClass4CK {
    public final /* synthetic */ BusinessProfileExtraFieldsActivity A00;

    public C64443Dm(BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity) {
        this.A00 = businessProfileExtraFieldsActivity;
    }

    public /* synthetic */ void BNp(UserJid userJid) {
    }

    public void BNs(UserJid userJid) {
        if (userJid != null) {
            BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = this.A00;
            if (userJid.equals(businessProfileExtraFieldsActivity.A0C)) {
                businessProfileExtraFieldsActivity.A01.A06(new AnonymousClass4KA(businessProfileExtraFieldsActivity, 1), businessProfileExtraFieldsActivity.A0C);
            }
        }
    }
}
