package X;

import android.app.Activity;
import com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1;

/* renamed from: X.8VK  reason: invalid class name */
public final class AnonymousClass8VK extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C131136d6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8VK(C131136d6 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C159147lC r1 = this.this$0.A00;
        if (r1 == null) {
            throw C18270x1.A0S("selfieViewProvider");
        }
        C203699oA r0 = r1.A03;
        if (r0 != null) {
            r0.Bk9();
        }
        Activity A01 = r1.A01(r1.A06);
        if (r1.A07.A02) {
            C616131n.A02((C85494Gl) null, new AESelfieViewProvider$increaseBrightness$1(A01, (C84814Du) null), AnonymousClass349.A02(AnonymousClass788.A00), (AnonymousClass20D) null, 3);
        }
        return C59022wD.A00;
    }
}
