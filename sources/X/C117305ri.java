package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5ri  reason: invalid class name and case insensitive filesystem */
public class C117305ri implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public C117305ri(Object obj, Object obj2, String str, int i, boolean z) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
        this.A03 = z;
    }

    public final void run() {
        String str;
        switch (this.A04) {
            case 0:
                C106185Xy r5 = (C106185Xy) this.A00;
                String str2 = this.A02;
                boolean z = this.A03;
                Jid A032 = Jid.Companion.A03(str2);
                AnonymousClass4sY r2 = new AnonymousClass4sY();
                C105145Tt r1 = r5.A00;
                r2.A09 = AnonymousClass0x9.A0m(r1.A0D.getAndIncrement());
                r2.A06 = 18;
                r2.A08 = (Long) this.A01;
                r2.A0B = r1.A02;
                r2.A01 = Boolean.valueOf(z);
                r2.A0A = r5.A02.A00(A032);
                r5.A01.BhD(r2);
                return;
            case 1:
                C54142oF r52 = (C54142oF) this.A00;
                boolean z2 = this.A03;
                Object obj = this.A01;
                String str3 = this.A02;
                C56962sq r22 = r52.A05;
                if (z2) {
                    r22.A0K((C46112b6) null);
                } else {
                    synchronized (r22) {
                        C117715sN.A00(r22.A0c, r22, obj, str3, 15);
                    }
                }
                r52.A0F.run();
                return;
            default:
                UserJid userJid = (UserJid) this.A01;
                String str4 = this.A02;
                boolean z3 = this.A03;
                C53412n3 r12 = ((DeepLinkActivity) this.A00).A0T;
                if (z3) {
                    str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                } else {
                    str = null;
                }
                r12.A03(userJid, str4, str, System.currentTimeMillis(), System.currentTimeMillis());
                return;
        }
    }
}
