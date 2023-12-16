package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9AZ  reason: invalid class name */
public class AnonymousClass9AZ extends C1908099x {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C203339nX A02;
    public final /* synthetic */ C194389Sr A03;
    public final /* synthetic */ C192199Io A04;
    public final /* synthetic */ Integer A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AZ(Context context, Context context2, C69263Wi r10, UserJid userJid, C40602Ha r12, C153607bd r13, C203339nX r14, C194389Sr r15, C192199Io r16, Integer num) {
        super(context, r10, r12, r13, "upi-get-vpa");
        this.A03 = r15;
        this.A04 = r16;
        this.A05 = num;
        this.A00 = context2;
        this.A01 = userJid;
        this.A02 = r14;
    }

    public void A05(AnonymousClass36K r30) {
        Class<String> cls = String.class;
        try {
            AnonymousClass36K r2 = r30;
            AnonymousClass36K A022 = C41032Ir.A02(r2, this.A04);
            Long A0R = AnonymousClass0x2.A0R();
            Long A0S = AnonymousClass0x2.A0S();
            Class<String> cls2 = cls;
            AnonymousClass36K r7 = r2;
            C626836d.A06(r7, cls2, A0R, A0S, "upi-get-vpa", new String[]{"account", "action"}, false);
            AnonymousClass36K r72 = r2;
            C626836d.A06(r72, cls2, A0R, A0S, "1", new String[]{"account", "version"}, false);
            AnonymousClass36K r73 = r2;
            Long A0U = AnonymousClass0x2.A0U();
            Object A06 = C626836d.A06(r2, cls, A0U, 200L, (Object) null, new String[]{"account", "vpa"}, false);
            Long A0i = AnonymousClass0x7.A0i();
            AnonymousClass36K r18 = r2;
            Class<String> cls3 = cls;
            Long l = A0U;
            Object A052 = C626836d.A05(r18, cls3, l, 1000L, (Object) null, new String[]{"account", "user-name"}, false);
            String A0A = C626836d.A0A(r2, C192259Iu.A01, new String[]{"account", "nodal"});
            String A0A2 = C626836d.A0A(r2, C192259Iu.A00, new String[]{"account", "nodal-allowed"});
            String A0A3 = C626836d.A0A(r2, C192259Iu.A02, new String[]{"account", "notif-allowed"});
            C626836d.A04(r2, new C205019qI(A022, 10), new String[0]);
            C205029qJ.A02(r2, new String[]{"account"}, 48);
            AnonymousClass99D r74 = new AnonymousClass99D();
            r74.A05 = (UserJid) C626836d.A06(r73, UserJid.class, A0R, A0S, (Object) null, new String[]{"account", PublicKeyCredentialControllerUtility.JSON_KEY_USER}, false);
            r74.A02 = C1899593h.A0C(A06, "upiHandle");
            r74.A03 = (String) C626836d.A06(r18, cls3, l, A0i, (Object) null, new String[]{"account", "vpa-id"}, false);
            r74.A01 = C1899593h.A0C(A052, "accountHolderName");
            boolean equals = A0A.equals("1");
            r74.A04 = equals;
            r74.A05 = A0A2.equals("1");
            r74.A06 = A0A3.equals("1");
            if (equals) {
                r74.A02 = null;
                r74.A03 = null;
            }
            C194389Sr r9 = this.A03;
            C194569Tl A002 = AnonymousClass9U4.A00(r9.A0C);
            AnonymousClass0x7.A1B(new C203869oR(A002, r74), A002.A03);
            AnonymousClass9B3 r14 = r9.A0E;
            r14.A07(this.A05, "upi-get-vpa");
            if (!r9.A04.A0X(3619) || !r74.A04) {
                C203339nX r0 = this.A02;
                if (r0 != null) {
                    r0.BPu(r74);
                    return;
                }
                return;
            }
            Context context = this.A00;
            UserJid userJid = this.A01;
            C203339nX r10 = this.A02;
            C69263Wi r12 = r9.A00;
            AnonymousClass31C r11 = r9.A05;
            C194259Se r8 = r9.A0F;
            AnonymousClass9U1 r6 = r9.A07;
            AnonymousClass9U5 r5 = r9.A0B;
            C617332a r4 = r9.A03;
            AnonymousClass9AI r182 = new AnonymousClass9AI(context, r12, r4, r11, r9.A06, r6, r9.A0A, r5, r14, r8);
            try {
                Class<String> cls4 = cls;
                r182.A01((C166557yt) null, C1899693i.A0F(AnonymousClass3QD.A00(), cls4, String.valueOf(C162167rN.A00().A0F(AnonymousClass36P.A06(userJid), (String) null).nationalNumber_), "upiAlias"), new C204799pw(r74, 0, r10));
            } catch (C143616zC e) {
                C18260x0.A16("Error parsing the number", AnonymousClass001.A0o(), e);
            }
        } catch (AnonymousClass24Y unused) {
            Log.w("PAY: IndiaUpiContactActions : invalid node");
            A06(C1899693i.A0M());
        }
    }

    public final void A06(AnonymousClass34V r4) {
        this.A03.A0E.A05(r4, this.A05, "upi-get-vpa");
        C203339nX r0 = this.A02;
        if (r0 != null) {
            r0.BS6(r4);
        }
    }

    public void A03(AnonymousClass34V r1) {
        super.A03(r1);
        A06(r1);
    }

    public void A04(AnonymousClass34V r1) {
        super.A04(r1);
        A06(r1);
    }
}
