package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.whatsapp.emoji.EmojiDescriptor;

/* renamed from: X.3CY  reason: invalid class name */
public class AnonymousClass3CY implements AnonymousClass4CE {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C114085mT A01;

    public AnonymousClass3CY(Resources resources, C114085mT r2) {
        this.A01 = r2;
        this.A00 = resources;
    }

    public void BRo(int[] iArr) {
        C94274qr r4 = new C94274qr(iArr);
        long A002 = EmojiDescriptor.A00(r4, false);
        C114085mT r0 = this.A01;
        AnonymousClass5Y0 r1 = r0.A0F;
        Resources resources = this.A00;
        Drawable A02 = r1.A02(resources, new C66563Lx(resources, r0, iArr), r4, A002);
        if (A02 != null) {
            C87624Ua r12 = r0.A08;
            C626936e.A06(r12);
            r12.A0D(A02, 0);
            return;
        }
        C87624Ua r3 = r0.A08;
        C626936e.A06(r3);
        int i = 2;
        if (!AnonymousClass000.A1S((A002 > -1 ? 1 : (A002 == -1 ? 0 : -1)))) {
            i = 1;
        }
        r3.A0D((Drawable) null, i);
    }

    public void BNH() {
    }
}
