package X;

import android.os.Message;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.5rh  reason: invalid class name and case insensitive filesystem */
public class C117295rh implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public C117295rh(Object obj, String str, int i, int i2, boolean z) {
        this.A04 = i2;
        this.A01 = obj;
        this.A03 = z;
        this.A00 = i;
        this.A02 = str;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                boolean z = this.A03;
                int i = this.A00;
                String str = this.A02;
                Message obtain = Message.obtain();
                obtain.arg1 = z ? 1 : 0;
                obtain.arg2 = i;
                obtain.obj = str;
                ((C112455jl) this.A01).A0C.A00(new C106645Zu(obtain, "preview_call_link"));
                return;
            case 1:
                C107285b3 r3 = (C107285b3) this.A01;
                boolean z2 = this.A03;
                String str2 = this.A02;
                int i2 = this.A00;
                if (z2) {
                    C106155Xv.A02(r3);
                }
                int previewCallLink = Voip.previewCallLink(str2, z2);
                if (previewCallLink == 0) {
                    r3.A0l = Integer.valueOf(i2);
                    return;
                } else {
                    C18260x0.A0x("voip/actionPreviewCallLink failed error: ", AnonymousClass001.A0o(), previewCallLink);
                    return;
                }
            default:
                boolean z3 = this.A03;
                String str3 = this.A02;
                int i3 = this.A00;
                C69263Wi r0 = ((C112925kb) this.A01).A00;
                r0.A0D();
                if (!z3) {
                    r0.A0P(str3, i3);
                    return;
                }
                return;
        }
    }
}
