package X;

import android.widget.ImageView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Uk  reason: invalid class name */
public final class AnonymousClass4Uk extends C05550Ty {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final UserJid A03;
    public final C153127ai A04;
    public final C989153s A05;
    public final AnonymousClass65M A06;

    public final void A0D(ImageView imageView, C108855df r9) {
        C162457s7.A0J(r9, 0);
        ImageView imageView2 = imageView;
        if (imageView != null) {
            imageView.setTag(r9.A01.A04);
        }
        this.A04.A01(imageView2, r9.A01, new AnonymousClass90T(imageView, 6), new C107025aZ(imageView, 1), 2);
    }

    public AnonymousClass4Uk(UserJid userJid, C153127ai r3, C989153s r4, AnonymousClass65M r5) {
        this.A03 = userJid;
        this.A06 = r5;
        this.A05 = r4;
        this.A04 = r3;
    }
}
