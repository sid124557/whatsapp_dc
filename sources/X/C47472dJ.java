package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.Future;

/* renamed from: X.2dJ  reason: invalid class name and case insensitive filesystem */
public class C47472dJ {
    public final C116985rC A00;
    public final C55682qk A01;
    public final C56972sr A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass31C A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;

    public Future A00(UserJid userJid) {
        AnonymousClass31C r5 = this.A05;
        String A032 = r5.A03();
        C18260x0.A0s("BizVNameXmppMethods/sendGetBizVNameCert; iq=", A032, AnonymousClass001.A0o());
        C130066bK r3 = new C130066bK();
        AnonymousClass36K A0I = AnonymousClass36K.A0I("verified_name", new AnonymousClass39V[]{new AnonymousClass39V((Jid) userJid, "jid")});
        AnonymousClass39V[] r2 = new AnonymousClass39V[3];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r2, 0);
        AnonymousClass39V.A09("xmlns", "w:biz", r2);
        r5.A0K(new AnonymousClass4KX(userJid, this, r3, 15), AnonymousClass36K.A0G(A0I, r2), A032, 118, 32000);
        return r3;
    }

    public C47472dJ(C116985rC r1, C55682qk r2, C56972sr r3, AnonymousClass33p r4, AnonymousClass1VX r5, AnonymousClass31C r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10, C183538qC r11, C183538qC r12) {
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A0B = r7;
        this.A06 = r8;
        this.A0A = r9;
        this.A03 = r4;
        this.A00 = r1;
        this.A07 = r10;
        this.A09 = r11;
        this.A08 = r12;
    }
}
