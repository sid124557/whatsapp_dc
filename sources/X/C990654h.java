package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.54h  reason: invalid class name and case insensitive filesystem */
public class C990654h extends AnonymousClass5ZM {
    public final C49792h6 A00;
    public final AnonymousClass3ZH A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A00(C86604Kt.A0d(this.A01));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        UserJid userJid;
        C92224mI r4;
        C31341o8 r6 = (C31341o8) obj;
        UserJid userJid2 = null;
        if (r6 != null) {
            UserJid userJid3 = r6.A00;
            userJid = r6.A01;
            if (userJid3 == null || userJid == null) {
                Log.e("ChangeNumberNotificationBanner/GetChangeNumberMessageTask trying to show change number message for non-user jids");
            } else {
                userJid2 = userJid3;
                r4 = (C92224mI) this.A02.get();
                if (r4 != null && userJid2 != null && userJid != null) {
                    r4.A02 = userJid2;
                    r4.A03 = userJid;
                    boolean A06 = r4.A06();
                    boolean A07 = r4.A07();
                    if (A06) {
                        if (A07) {
                            r4.A08();
                            return;
                        } else {
                            r4.A04.postDelayed(new C69973Zj(r4, 43), 500);
                            return;
                        }
                    } else if (A07) {
                        r4.A05(true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        userJid = null;
        r4 = (C92224mI) this.A02.get();
        if (r4 != null) {
        }
    }

    public C990654h(C92224mI r2, C49792h6 r3, AnonymousClass3ZH r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = AnonymousClass0x9.A14(r2);
    }
}
