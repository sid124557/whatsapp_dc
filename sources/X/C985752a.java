package X;

import android.text.TextUtils;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.52a  reason: invalid class name and case insensitive filesystem */
public class C985752a extends AnonymousClass7VK {
    public final /* synthetic */ C116145po A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C985752a(C116145po r2) {
        super(AnonymousClass58Q.A05);
        this.A00 = r2;
    }

    public void A00() {
        CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) this.A00.A0L;
        creationModeBottomBar.A01();
        creationModeBottomBar.A03(0);
        AnonymousClass5VQ.A01(creationModeBottomBar.A04, true, false);
        AnonymousClass5VQ.A01(creationModeBottomBar.A05, false, false);
    }

    public void A01(CharSequence charSequence) {
        if (TextUtils.getTrimmedLength(charSequence) > 0) {
            C116145po r7 = this.A00;
            C185948uV r6 = r7.A0L;
            int i = r7.A03;
            String str = r7.A07;
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r6;
            creationModeBottomBar.A05.setEnabled(true);
            C18270x1.A0d(creationModeBottomBar.getContext(), creationModeBottomBar.A05, creationModeBottomBar.A0C, i);
            creationModeBottomBar.A05.setContentDescription(str);
            AnonymousClass5VQ.A01(creationModeBottomBar.A05, true, true);
            AnonymousClass5VQ.A01(creationModeBottomBar.A04, false, true);
            r7.A05 = new AnonymousClass52Y(r7);
        }
    }
}
