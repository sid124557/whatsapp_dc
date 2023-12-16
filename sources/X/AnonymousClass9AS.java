package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9AS  reason: invalid class name */
public class AnonymousClass9AS extends C1908099x {
    public AnonymousClass9PH A00;
    public AnonymousClass9IZ A01;
    public final C160757oG A02 = C160757oG.A00("GetContactsPaymentStatusIndiaUpiNetworkCallback", "network", "IN");

    public AnonymousClass9AS(Context context, C69263Wi r11, AnonymousClass9PH r12, C40602Ha r13, AnonymousClass9IZ r14) {
        super(context, r11, r13, (C153607bd) null, "get-contacts-payment-status");
        this.A01 = r14;
        this.A00 = r12;
    }

    public void A05(AnonymousClass36K r26) {
        String A0e;
        try {
            AnonymousClass36K r4 = r26;
            AnonymousClass36K A022 = C41032Ir.A02(r4, this.A01);
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_TYPE};
            Class<String> cls = String.class;
            Long A0R = AnonymousClass0x2.A0R();
            Long A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r4, cls, A0R, A0S, "result", strArr, false);
            AnonymousClass36K r11 = r4;
            Long l = A0R;
            Long l2 = A0S;
            C626836d.A06(r11, C135206kI.class, l, l2, C135206kI.A00, new String[]{"from"}, false);
            C626836d.A06(r4, cls, A0R, A0S, "get-contacts-payment-status", new String[]{"account", "action"}, false);
            C626836d.A06(r4, cls, A0R, A0S, C626836d.A06(A022, cls, A0R, A0S, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, true);
            List<AnonymousClass9I8> A0B = C626836d.A0B(r4, new C205029qJ(46), new String[]{"account", "contact"}, 0, Long.MAX_VALUE);
            C205029qJ.A02(r4, new String[]{"account"}, 47);
            HashMap A0t = AnonymousClass001.A0t();
            for (AnonymousClass9I8 r3 : A0B) {
                A0t.put(r3.A00.getRawString(), r3.A01);
            }
            AnonymousClass9PH r6 = this.A00;
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = r6.A03.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R2 = C18310x6.A0R(it);
                Jid A0I = A0R2.A0I(UserJid.class);
                if (!(A0I == null || (A0e = C18320x8.A0e(A0I.getRawString(), A0t)) == null || 2 != C133676hl.A01(AnonymousClass0x9.A0z(A0e)))) {
                    A0s.add(A0R2);
                }
            }
            r6.A00.AwB(A0s);
        } catch (AnonymousClass24Y unused) {
            this.A02.A05("sendGetContactsPaymentStatus/onResponseSuccess/CorruptStreamException");
            AnonymousClass9PH r2 = this.A00;
            r2.A02.AwB(new AnonymousClass34V(500));
        }
    }

    public void A03(AnonymousClass34V r2) {
        super.A03(r2);
        this.A00.A01.AwB(r2);
    }

    public void A04(AnonymousClass34V r2) {
        super.A04(r2);
        this.A00.A02.AwB(r2);
    }
}
