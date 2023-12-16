package X;

import com.whatsapp.jid.UserJid;
import java.io.IOException;

/* renamed from: X.3Oo  reason: invalid class name and case insensitive filesystem */
public final class C67253Oo implements AnonymousClass4EN {
    public final /* synthetic */ AnonymousClass4AC A00;
    public final /* synthetic */ C56162rW A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public void AyP(AnonymousClass2SI r9) {
        C162457s7.A0J(r9, 0);
        C56162rW r0 = this.A01;
        Integer num = this.A03;
        UserJid userJid = this.A02;
        boolean z = this.A06;
        String str = this.A04;
        String str2 = this.A05;
        r0.A01(this.A00, r9, userJid, num, str, str2, z);
    }

    public void BQq(IOException iOException) {
        C162457s7.A0J(iOException, 0);
        this.A01.A02(this.A00, this.A03, iOException);
    }

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        this.A01.A02(this.A00, this.A03, exc);
    }

    public C67253Oo(AnonymousClass4AC r1, C56162rW r2, UserJid userJid, Integer num, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A03 = num;
        this.A02 = userJid;
        this.A06 = z;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = r1;
    }
}
