package X;

import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Ij  reason: invalid class name and case insensitive filesystem */
public final class C125526Ij extends C05570Ua {
    public final C152967aS A00;
    public final C170688Ed A01;
    public final UserJid A02;
    public final AnonymousClass4GQ A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125526Ij(View view, C152967aS r4, C170688Ed r5, UserJid userJid, AnonymousClass4GQ r7) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A03 = r7;
        this.A02 = userJid;
        this.A01 = r5;
        this.A00 = r4;
        view.setOnClickListener(new C109685f1((Object) this, 40));
    }
}
