package X;

import android.os.Message;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Bm  reason: invalid class name and case insensitive filesystem */
public class C124236Bm implements C84134Bd {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public C124236Bm(DeepLinkActivity deepLinkActivity, UserJid userJid, String str, int i, boolean z) {
        this.A04 = i;
        this.A00 = deepLinkActivity;
        if (i != 0) {
            this.A03 = z;
            this.A01 = userJid;
            this.A02 = str;
            return;
        }
        this.A01 = userJid;
        this.A02 = str;
        this.A03 = z;
    }

    public final void AwB(Object obj) {
        String str;
        String str2;
        Object obj2 = obj;
        if (this.A04 != 0) {
            DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A00;
            boolean z = this.A03;
            UserJid userJid = (UserJid) this.A01;
            String str3 = this.A02;
            if (AnonymousClass001.A1Z(obj2)) {
                C105145Tt r1 = deepLinkActivity.A0E;
                if (z) {
                    str2 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                } else {
                    str2 = null;
                }
                r1.A02(6, "product_link", str2);
                boolean A46 = AnonymousClass4SG.A46(deepLinkActivity, userJid);
                AnonymousClass3XA A002 = AnonymousClass5ZY.A00(deepLinkActivity, C627736r.A1E(deepLinkActivity, false, false), deepLinkActivity.A05, deepLinkActivity.A0D, deepLinkActivity.A0E, deepLinkActivity.A0F, userJid, str3, A46);
                Message obtain = Message.obtain(deepLinkActivity.A00, 1);
                obtain.arg1 = R.string.f11nameremoved;
                deepLinkActivity.A00.sendMessageDelayed(obtain, 500);
                A002.A03(new AnonymousClass92W(deepLinkActivity, R.string.f11nameremoved, 2));
                deepLinkActivity.A76(userJid, "product_link", z);
                return;
            }
            C19340zH A003 = AnonymousClass5V0.A00(deepLinkActivity);
            A003.A0T(R.string.f11nameremoved);
            A003.A0U(R.string.f11nameremoved);
            A003.A0d(deepLinkActivity, AnonymousClass4L0.A0G(deepLinkActivity, 226), R.string.f11nameremoved);
            A003.A0b(deepLinkActivity, AnonymousClass4L0.A0G(deepLinkActivity, 227));
            C18280x3.A0q(A003);
            return;
        }
        DeepLinkActivity deepLinkActivity2 = (DeepLinkActivity) this.A00;
        UserJid userJid2 = (UserJid) this.A01;
        String str4 = this.A02;
        boolean z2 = this.A03;
        String str5 = (String) obj2;
        switch (str5.hashCode()) {
            case -839883634:
                str = "PERMANENT";
                break;
            case 181990675:
                if (str5.equals("UNBLOCKED")) {
                    deepLinkActivity2.A0C.A01(userJid2).A03(new C124236Bm(deepLinkActivity2, userJid2, str4, 1, z2));
                    return;
                }
                return;
            case 476614193:
                str = "TEMPORARY";
                break;
            default:
                return;
        }
        if (str5.equals(str)) {
            deepLinkActivity2.A0G.A01(deepLinkActivity2, new C1893290w(deepLinkActivity2, 3), str5);
        }
    }
}
