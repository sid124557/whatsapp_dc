package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4gs  reason: invalid class name and case insensitive filesystem */
public class C90194gs extends AnonymousClass8JJ {
    public AnonymousClass7KL A00;
    public C184558s8 A01;
    public final C69263Wi A02;
    public final C104095Pq A03;
    public final C147007Cl A04;
    public final AnonymousClass33p A05;
    public final C105915Wx A06;
    public final AnonymousClass31C A07;
    public final C105255Ue A08;
    public final C104705Sa A09;

    public final void A02(AnonymousClass7KL r19) {
        List<C165977xw> list;
        String A032 = this.A07.A03();
        C104705Sa r0 = this.A09;
        AnonymousClass7KL r2 = r19;
        UserJid userJid = r2.A00;
        r0.A00(userJid, A032, 252);
        C105915Wx r3 = this.A06;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = r2.A01.iterator();
        while (it.hasNext()) {
            C152217Ya A0J = AnonymousClass4L0.A0J(it);
            ArrayList A0s2 = AnonymousClass001.A0s();
            C109015dw r9 = A0J.A02;
            AnonymousClass36K.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r9.A0F, A0s2);
            AnonymousClass36K.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r9.A05, A0s2);
            AnonymousClass36K.A0P("quantity", Long.toString(A0J.A00), A0s2);
            BigDecimal bigDecimal = r9.A06;
            C108745dU r14 = r9.A02;
            Date date = r2.A02;
            if (bigDecimal != null) {
                if (r14 != null && r14.A00(date)) {
                    bigDecimal = r14.A01;
                }
                AnonymousClass36K.A0P("price", Long.toString(bigDecimal.multiply(C57952uT.A00).longValue()), A0s2);
            }
            C160617ny r02 = r9.A04;
            if (r02 != null) {
                AnonymousClass36K.A0P("currency", r02.A00, A0s2);
            }
            C108755dV r03 = r9.A0B;
            if (!(r03 == null || (list = r03.A02) == null)) {
                ArrayList A0c = C73783g4.A0c(list);
                for (C165977xw r04 : list) {
                    AnonymousClass39V[] r142 = new AnonymousClass39V[2];
                    AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r04.A00, r142, 0);
                    AnonymousClass39V.A0B("value", r04.A01, r142, 1);
                    A0c.add(new AnonymousClass36K("property", r142));
                }
                ArrayList A0J2 = AnonymousClass002.A0J(A0c);
                if (true ^ A0J2.isEmpty()) {
                    A0s2.add(new AnonymousClass36K(new AnonymousClass36K("properties", (AnonymousClass39V[]) null, C18280x3.A1a(A0J2, 0)), "variant_info", (AnonymousClass39V[]) null));
                }
            }
            A0s.add(new AnonymousClass36K("product", (AnonymousClass39V[]) null, C18280x3.A1a(A0s2, 0)));
        }
        String A012 = this.A01.A07.A01(userJid);
        if (A012 != null) {
            this.A00 = r2;
            AnonymousClass36K.A0P("direct_connection_encrypted_info", A012, A0s);
        }
        AnonymousClass39V[] r13 = new AnonymousClass39V[2];
        AnonymousClass39V.A0B("op", "create", r13, 0);
        r13[1] = new AnonymousClass39V("biz_jid", userJid.getRawString());
        AnonymousClass36K r8 = new AnonymousClass36K("order", r13, C18280x3.A1a(A0s, 0));
        AnonymousClass39V[] r22 = new AnonymousClass39V[5];
        AnonymousClass39V.A0B("smax_id", "10", r22, 0);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r22, 1);
        AnonymousClass39V.A0B("xmlns", "fb:thrift_iq", r22, 2);
        AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22);
        r22[4] = AnonymousClass39V.A00();
        r3.A01(this, AnonymousClass36K.A0G(r8, r22), A032, 252);
        C18260x0.A1R(AnonymousClass001.A0o(), "CreateOrderProtocol/doSendCreateOrderRequest/biz_jid=", userJid);
    }

    public void BQs(String str) {
        this.A08.A03("order_creates_tag");
        this.A09.A01(str);
        C117115rP.A00(this.A02, this, 39);
    }

    public void BRC(UserJid userJid) {
        C117115rP.A00(this.A02, this, 40);
    }

    public void BRD(UserJid userJid) {
        C117115rP.A00(this.A02, this, 41);
    }

    public void BSN(AnonymousClass36K r5, String str) {
        int A032;
        this.A08.A03("order_creates_tag");
        this.A09.A01(str);
        Pair A022 = C57492tj.A02(r5);
        AnonymousClass7KL r2 = this.A00;
        if (r2 == null || A022 == null || (A032 = C18280x3.A03(A022)) != 421) {
            this.A00 = null;
            this.A02.A0S(new C117175rV(this, 3, A022));
            return;
        }
        A01(r2.A00, A032);
    }

    public void BdM(AnonymousClass36K r7, String str) {
        AnonymousClass7KM r3;
        this.A08.A03("order_creates_tag");
        this.A09.A02(str);
        C147007Cl r5 = this.A04;
        AnonymousClass36K A0l = r7.A0l("order");
        if (A0l != null) {
            String A0r = A0l.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            String A0r2 = A0l.A0r("token", (String) null);
            AnonymousClass7KN A002 = r5.A00.A00(A0l.A0l("price"));
            if (A0r != null) {
                r3 = new AnonymousClass7KM(A002, A0r, A0r2);
                this.A02.A0S(new C117175rV(this, 2, r3));
            }
        }
        r3 = null;
        this.A02.A0S(new C117175rV(this, 2, r3));
    }

    public C90194gs(C69263Wi r1, C620433g r2, C104095Pq r3, C147007Cl r4, AnonymousClass33p r5, C105915Wx r6, AnonymousClass31C r7, C105255Ue r8, C104705Sa r9) {
        super(r2);
        this.A04 = r4;
        this.A02 = r1;
        this.A08 = r8;
        this.A07 = r7;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A09 = r9;
    }
}
