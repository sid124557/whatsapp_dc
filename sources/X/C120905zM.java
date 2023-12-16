package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5zM  reason: invalid class name and case insensitive filesystem */
public final class C120905zM extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ AnonymousClass7ZZ $request;
    public final /* synthetic */ C90184gr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120905zM(AnonymousClass7ZZ r2, C90184gr r3, String str) {
        super(0);
        this.this$0 = r3;
        this.$iqId = str;
        this.$request = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C90184gr r10 = this.this$0;
        String str = this.$iqId;
        AnonymousClass7ZZ r4 = this.$request;
        boolean A1Y = AnonymousClass0x2.A1Y(str, r4);
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K.A0P("width", String.valueOf(r4.A01), A0s);
        AnonymousClass36K.A0P("height", String.valueOf(r4.A00), A0s);
        AnonymousClass36K r0 = new AnonymousClass36K("image_dimensions", (AnonymousClass39V[]) null, C18280x3.A1a(A0s, 0));
        AnonymousClass8U9 r3 = new AnonymousClass8U9();
        r3.add(r0);
        Iterator it = r4.A04.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            ArrayList A0s2 = AnonymousClass001.A0s();
            AnonymousClass36K.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0m, A0s2);
            r3.add(new AnonymousClass36K("product", (AnonymousClass39V[]) null, C18280x3.A1a(A0s2, 0)));
        }
        C620433g r02 = r10.A01;
        UserJid userJid = r4.A03;
        String A01 = r02.A07.A01(userJid);
        if (A01 != null) {
            r10.A00 = r4;
            AnonymousClass36K.A0P("direct_connection_encrypted_info", A01, r3);
        }
        AnonymousClass5V2.A00(r4.A02, r3, A1Y);
        List A0h = C159507lx.A0h(r3);
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        AnonymousClass39V.A0B("op", "refresh", r2, 0);
        AnonymousClass39V.A0B("biz_jid", userJid.getRawString(), r2, A1Y ? 1 : 0);
        AnonymousClass36K r32 = new AnonymousClass36K("cart", r2, (AnonymousClass36K[]) A0h.toArray(new AnonymousClass36K[0]));
        AnonymousClass39V[] r22 = new AnonymousClass39V[5];
        AnonymousClass39V.A0B("smax_id", "11", r22, 0);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r22, A1Y);
        AnonymousClass39V.A0B("xmlns", "fb:thrift_iq", r22, 2);
        AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22);
        r22[4] = AnonymousClass39V.A00();
        return AnonymousClass36K.A0G(r32, r22);
    }
}
