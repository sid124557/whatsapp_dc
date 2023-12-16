package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4Uy  reason: invalid class name and case insensitive filesystem */
public final class C87694Uy extends C05550Ty {
    public UserJid A00;
    public UserJid A01;
    public List A02;
    public final C102535Jf A03;
    public final C104725Sc A04;
    public final AnonymousClass107 A05 = AnonymousClass4L0.A0O(new AnonymousClass5XT((Bitmap) null, (UserJid) null, (List) null));
    public final AnonymousClass4FS A06;
    public final Runnable A07;

    public C87694Uy(C102535Jf r3, UserJid userJid, C104725Sc r5, AnonymousClass4FS r6) {
        C162457s7.A0J(r6, 3);
        this.A00 = userJid;
        this.A04 = r5;
        this.A06 = r6;
        this.A03 = r3;
        C117095rN r1 = new C117095rN(this, 5);
        this.A07 = r1;
        this.A06.BkM(r1);
    }

    public void A0C() {
        this.A06.BjN(this.A07);
    }
}
