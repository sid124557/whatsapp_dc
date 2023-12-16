package X;

import android.os.Message;
import com.whatsapp.R;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Bl  reason: invalid class name and case insensitive filesystem */
public class C124226Bl implements C84134Bd {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public final int A05;

    public C124226Bl(DeepLinkActivity deepLinkActivity, UserJid userJid, int i, int i2, boolean z, boolean z2) {
        this.A05 = i2;
        this.A01 = deepLinkActivity;
        this.A02 = userJid;
        this.A00 = i;
        if (i2 != 0) {
            this.A03 = z;
            this.A04 = z2;
            return;
        }
        this.A04 = z;
        this.A03 = z2;
    }

    public final void AwB(Object obj) {
        String str;
        String str2;
        Object obj2 = obj;
        int i = this.A05;
        DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A01;
        if (i != 0) {
            UserJid userJid = (UserJid) this.A02;
            int i2 = this.A00;
            boolean z = this.A03;
            boolean z2 = this.A04;
            String str3 = (String) obj2;
            switch (str3.hashCode()) {
                case -839883634:
                    str2 = "PERMANENT";
                    break;
                case 181990675:
                    if (str3.equals("UNBLOCKED")) {
                        deepLinkActivity.A0C.A01(userJid).A03(new C124226Bl(deepLinkActivity, userJid, i2, 0, z, z2));
                        return;
                    }
                    return;
                case 476614193:
                    str2 = "TEMPORARY";
                    break;
                default:
                    return;
            }
            if (str3.equals(str2)) {
                deepLinkActivity.A0G.A01(deepLinkActivity, new C1893290w(deepLinkActivity, 2), str3);
                return;
            }
            return;
        }
        UserJid userJid2 = (UserJid) this.A02;
        int i3 = this.A00;
        boolean z3 = this.A04;
        boolean z4 = this.A03;
        if (AnonymousClass001.A1Z(obj2)) {
            deepLinkActivity.A0s.A00();
            AnonymousClass3XA A002 = deepLinkActivity.A0C.A00(deepLinkActivity, userJid2, i3, 11);
            Message obtain = Message.obtain(deepLinkActivity.A00, 1);
            obtain.arg1 = R.string.f11nameremoved;
            deepLinkActivity.A00.sendMessageDelayed(obtain, 500);
            A002.A03(new AnonymousClass92W(deepLinkActivity, R.string.f11nameremoved, 2));
            if (z3) {
                str = "wa_pages";
            } else {
                str = "catalog_link";
            }
            deepLinkActivity.A76(userJid2, str, z4);
            return;
        }
        C19340zH A003 = AnonymousClass5V0.A00(deepLinkActivity);
        A003.A0T(R.string.f11nameremoved);
        A003.A0U(R.string.f11nameremoved);
        A003.A0d(deepLinkActivity, AnonymousClass4L0.A0G(deepLinkActivity, 224), R.string.f11nameremoved);
        A003.A0b(deepLinkActivity, AnonymousClass4L0.A0G(deepLinkActivity, 225));
        C18280x3.A0q(A003);
    }
}
