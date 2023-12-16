package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.4gq  reason: invalid class name and case insensitive filesystem */
public class C90174gq extends AnonymousClass8JJ {
    public final AnonymousClass5TG A00;
    public final C59082wK A01;
    public final C184088rE A02;
    public final C29441ip A03;
    public final C105915Wx A04;
    public final AnonymousClass31C A05;
    public final C105255Ue A06;
    public final C104705Sa A07;

    public void A02() {
        if (!this.A03.A0F()) {
            this.A02.BSn(this.A00, -1);
            return;
        }
        String A032 = this.A05.A03();
        C104705Sa r0 = this.A07;
        AnonymousClass5TG r8 = this.A00;
        UserJid userJid = r8.A04;
        r0.A00(userJid, A032, 270);
        String str = r8.A05;
        if (str == null) {
            this.A06.A04("view_collection_details_tag");
        }
        C105915Wx r7 = this.A04;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass36K.A0P("limit", Integer.toString(r8.A01), A0s);
        AnonymousClass36K.A0P("width", Integer.toString(r8.A02), A0s);
        AnonymousClass36K.A0P("height", Integer.toString(r8.A00), A0s);
        AnonymousClass36K.A0P("is_category", Boolean.toString(r8.A08), A0s);
        String str2 = r8.A07;
        if (str2 != null) {
            AnonymousClass36K.A0P("catalog_session_id", str2, A0s);
        }
        if (str != null) {
            AnonymousClass36K.A0P("after", str, A0s);
        }
        String A012 = this.A01.A07.A01(userJid);
        if (A012 != null) {
            AnonymousClass36K.A0P("direct_connection_encrypted_info", A012, A0s);
        }
        AnonymousClass5V2.A00(r8.A03, A0s, false);
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r8.A06, r2, 0);
        r2[1] = new AnonymousClass39V((Jid) userJid, "biz_jid");
        AnonymousClass36K r6 = new AnonymousClass36K("collection", r2, C18280x3.A1a(A0s, 0));
        AnonymousClass39V[] r22 = new AnonymousClass39V[5];
        r22[0] = AnonymousClass39V.A00();
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r22, 1);
        AnonymousClass39V.A0B("smax_id", "30", r22, 2);
        AnonymousClass39V.A07("xmlns", "w:biz:catalog", r22);
        AnonymousClass39V.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22);
        r7.A02(this, AnonymousClass36K.A0G(r6, r22), A032, 270);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/sendGetCollectionProductList jid=");
        A0o.append(userJid);
        C18260x0.A1L(A0o, " success");
    }

    public void BQs(String str) {
        AnonymousClass5TG r2 = this.A00;
        if (r2.A05 == null) {
            this.A06.A03("view_collection_details_tag");
        }
        this.A07.A01(str);
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/delivery-error");
        this.A02.BSn(r2, -1);
    }

    public void BRC(UserJid userJid) {
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/direct-connection-error");
        this.A02.BSn(this.A00, 421);
    }

    public void BRD(UserJid userJid) {
        Log.i("GetCollectionProductListProtocolonDirectConnectionSucceeded/retry-request");
        A02();
    }

    public void BSN(AnonymousClass36K r4, String str) {
        AnonymousClass5TG r2 = this.A00;
        if (r2.A05 == null) {
            this.A06.A03("view_collection_details_tag");
        }
        this.A07.A01(str);
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductList/response-error");
        int A012 = C57492tj.A01(r4);
        if (!A01(r2.A04, A012)) {
            this.A02.BSn(r2, A012);
        }
    }

    public void BdM(AnonymousClass36K r5, String str) {
        C49722gz A012;
        AnonymousClass5TG r3 = this.A00;
        if (r3.A05 == null) {
            this.A06.A03("view_collection_details_tag");
        }
        this.A07.A02(str);
        C59082wK r1 = this.A01;
        AnonymousClass36K A0l = r5.A0l("collection");
        if (A0l == null || (A012 = r1.A01(A0l)) == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess/emptyPage jid=");
            C18260x0.A0n(r3.A04, A0o);
            this.A02.BSn(r3, 0);
            return;
        }
        C64533Dw r2 = new C64533Dw(C106665Zw.A00(A0l.A0l("paging")), A012);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess jid=");
        C18260x0.A0o(r3.A04, A0o2);
        this.A02.BdN(r2, r3);
    }

    public C90174gq(C620433g r1, AnonymousClass5TG r2, C59082wK r3, C184088rE r4, C29441ip r5, C105915Wx r6, AnonymousClass31C r7, C105255Ue r8, C104705Sa r9) {
        super(r1);
        this.A01 = r3;
        this.A06 = r8;
        this.A05 = r7;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A07 = r9;
    }
}
