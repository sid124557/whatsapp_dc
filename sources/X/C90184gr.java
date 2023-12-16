package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4gr  reason: invalid class name and case insensitive filesystem */
public final class C90184gr extends AnonymousClass8JJ {
    public AnonymousClass7ZZ A00;
    public C184558s8 A01;
    public final C69263Wi A02;
    public final AnonymousClass7KF A03;
    public final AnonymousClass1VX A04;
    public final C105915Wx A05;
    public final AnonymousClass31C A06;
    public final C105255Ue A07;
    public final C104705Sa A08;
    public final C147527Eq A09;

    public final void A02(AnonymousClass7ZZ r8, C184558s8 r9) {
        AnonymousClass36K r0;
        C162457s7.A0J(r9, 1);
        this.A01 = r9;
        String A032 = this.A06.A03();
        this.A07.A04("cart_view_tag");
        C104705Sa r02 = this.A08;
        UserJid userJid = r8.A03;
        r02.A00(userJid, A032, 253);
        C105915Wx r3 = this.A05;
        C147527Eq r2 = this.A09;
        C120895zL r1 = new C120895zL(r8, this, A032);
        C120905zM r03 = new C120905zM(r8, this, A032);
        if (r2 != null) {
            C41032Ir r12 = (C41032Ir) r1.invoke();
            C162457s7.A0J(r12, 1);
            r2.A00.put(A032, r12);
            r0 = r12.A00;
            C162457s7.A0H(r0);
        } else {
            r0 = (AnonymousClass36K) r03.invoke();
        }
        r3.A01(this, r0, A032, 253);
        C18260x0.A1R(AnonymousClass001.A0o(), "RefreshCartProtocol/sendRefreshCartRequest/biz_jid=", userJid);
    }

    public void BQs(String str) {
        C162457s7.A0J(str, 0);
        this.A07.A03("cart_view_tag");
        AnonymousClass75Q.A00(this.A09, str);
        this.A08.A01(str);
        C184558s8 r2 = this.A01;
        if (r2 != null) {
            C86654Ky.A1N(r2, C18280x3.A0S(), "delivery failed");
        }
        Log.i("RefreshCartProtocol/onDeliveryFailure");
        this.A00 = null;
    }

    public void BRD(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        AnonymousClass7ZZ r2 = this.A00;
        if (r2 == null) {
            Log.e("RefreshCartProtocol/onDirectConnectionSucceeded/directConnectionRequestToRetry is null");
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RefreshCartProtocol/onDirectConnectionSucceeded/jid=");
        C18260x0.A1L(A0o, userJid.getRawString());
        C184558s8 r0 = this.A01;
        if (r0 != null) {
            A02(r2, r0);
            return;
        }
        throw C18290x4.A0Y();
    }

    public void BdM(AnonymousClass36K r28, String str) {
        C148027Gq r4;
        C633238u r15;
        AnonymousClass36K r42 = r28;
        String str2 = str;
        C18260x0.A0O(str2, r42);
        this.A07.A03("cart_view_tag");
        this.A08.A02(str2);
        AnonymousClass75Q.A00(this.A09, str2);
        AnonymousClass7KF r0 = this.A03;
        AnonymousClass36K A0l = r42.A0l("cart");
        if (A0l != null) {
            List A0s = A0l.A0s("product");
            ArrayList A0t = C18300x5.A0t(A0s);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass36K A0Y = C18310x6.A0Y(it);
                C109015dw A032 = r0.A01.A03(A0Y);
                if (A032 == null) {
                    AnonymousClass36K A0l2 = A0Y.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    AnonymousClass36K A0l3 = A0Y.A0l("status");
                    String A0Q = AnonymousClass4L0.A0Q(A0l2);
                    if (A0l3 == null) {
                        r15 = null;
                    } else {
                        r15 = new C633238u((String) null, (String) null, (List) null, 3, false);
                    }
                    if (A0Q != null) {
                        A032 = new C109015dw((C166017y0) null, r15, (C108745dU) null, (C108755dV) null, (C160617ny) null, A0Q, "", (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, AnonymousClass001.A0s(), 0, 99, true, false);
                    }
                }
                A0t.add(A032);
            }
            r4 = new C148027Gq(r0.A02.A00(A0l.A0l("price")), A0t);
        } else {
            r4 = null;
        }
        this.A00 = null;
        this.A02.A0S(new C117165rU(this, 36, r4));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90184gr(C69263Wi r2, C620433g r3, AnonymousClass7KF r4, AnonymousClass1VX r5, C105915Wx r6, AnonymousClass31C r7, C105255Ue r8, C104705Sa r9) {
        super(r3);
        C147527Eq r0;
        C18260x0.A0c(r3, r2, r8, r7);
        C18260x0.A0W(r6, r9, r5);
        this.A02 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
        this.A04 = r5;
        if (r5.A0X(6503)) {
            r0 = new C147527Eq();
        } else {
            r0 = null;
        }
        this.A09 = r0;
    }

    public void BRC(UserJid userJid) {
        StringBuilder A0X = C18270x1.A0X(userJid);
        A0X.append("RefreshCartProtocol/onDirectConnectionError/jid=");
        C18260x0.A1K(A0X, userJid.getRawString());
        C117115rP.A00(this.A02, this, 13);
        this.A00 = null;
    }

    public void BSN(AnonymousClass36K r5, String str) {
        C18260x0.A0O(str, r5);
        this.A07.A03("cart_view_tag");
        this.A08.A01(str);
        AnonymousClass75Q.A00(this.A09, str);
        Pair A022 = C57492tj.A02(r5);
        AnonymousClass7ZZ r0 = this.A00;
        if (!(r0 == null || A022 == null)) {
            UserJid userJid = r0.A03;
            Object obj = A022.first;
            C162457s7.A0C(obj);
            if (A01(userJid, AnonymousClass001.A0K(obj))) {
                return;
            }
        }
        this.A00 = null;
        this.A02.A0S(new C117165rU(A022, 37, this));
    }
}
