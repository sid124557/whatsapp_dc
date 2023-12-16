package X;

import android.text.TextUtils;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.52Y  reason: invalid class name */
public class AnonymousClass52Y extends AnonymousClass7VK {
    public final /* synthetic */ C116145po A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52Y(C116145po r2) {
        super(AnonymousClass58Q.A03);
        this.A00 = r2;
    }

    public void A00() {
        C116145po r0 = this.A00;
        r0.A0L.BnN(r0.A03, r0.A07);
    }

    public void A01(CharSequence charSequence) {
        if (TextUtils.getTrimmedLength(charSequence) <= 0) {
            C116145po r3 = this.A00;
            boolean z = r3.A0M;
            C185948uV r1 = r3.A0L;
            if (z) {
                r1.Awz(125);
                r3.A05 = new C985752a(r3);
                r3.A09 = false;
                return;
            }
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r1;
            creationModeBottomBar.A05.setEnabled(false);
            AnonymousClass5VQ.A01(creationModeBottomBar.A04, false, false);
            AnonymousClass5VQ.A01(creationModeBottomBar.A05, false, true);
            r3.A05 = new AnonymousClass52W(r3);
        }
    }
}
