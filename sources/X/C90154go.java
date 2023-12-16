package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.4go  reason: invalid class name and case insensitive filesystem */
public class C90154go extends AnonymousClass8JJ {
    public final C146997Ck A00;
    public final C149687Nm A01;
    public final C147017Cm A02;
    public final C105915Wx A03;
    public final AnonymousClass31C A04;
    public final C105255Ue A05;
    public final C72183dJ A06 = new C72183dJ();

    public void BQs(String str) {
        this.A05.A03("order_view_tag");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GetOrderProtocol/delivery-error with iqId ");
        A0o.append(str);
        C18260x0.A1M(A0o, ">");
        this.A06.BQr(new AnonymousClass249(str));
    }

    public void BRC(UserJid userJid) {
        C86634Kw.A1A(AnonymousClass0x9.A0C(421, "Failed to generate direct connection info"), this.A06, (Object) null);
        C18260x0.A1R(AnonymousClass001.A0o(), "GetOrderProtocol/onDirectConnectionError/jid= ", userJid);
    }

    public void BRD(UserJid userJid) {
        String A032 = this.A04.A03();
        this.A03.A02(this, A02(A032), A032, 248);
        C18260x0.A1R(AnonymousClass001.A0o(), "GetOrderProtocol/onDirectConnectionSucceeded/Retrying with jid= ", userJid);
    }

    public void BSN(AnonymousClass36K r5, String str) {
        this.A05.A03("order_view_tag");
        Pair A022 = C57492tj.A02(r5);
        if (A022 == null) {
            C86634Kw.A1A(AnonymousClass0x9.A0C(AnonymousClass001.A0f(), "error code is null"), this.A06, (Object) null);
        } else if (!A01(this.A01.A02, C18280x3.A03(A022))) {
            C86634Kw.A1A(A022, this.A06, (Object) null);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GetOrderProtocol/response-error with iqId <");
            A0o.append(str);
            C18260x0.A1S(A0o, "> and error ", A022);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r32, java.lang.String r33) {
        /*
            r31 = this;
            r6 = r31
            X.5Ue r1 = r6.A05
            java.lang.String r0 = "order_view_tag"
            r1.A03(r0)
            X.7Cm r11 = r6.A02
            java.lang.String r0 = "order"
            r1 = r32
            X.36K r7 = r1.A0l(r0)
            if (r7 == 0) goto L_0x0145
            java.lang.String r9 = "id"
            r1 = 0
            java.lang.String r27 = r7.A0r(r9, r1)
            java.lang.String r0 = "creation_ts"
            java.lang.String r17 = r7.A0r(r0, r1)
            java.lang.String r0 = "product"
            java.util.List r0 = r7.A0s(r0)
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            java.util.Iterator r16 = r0.iterator()
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0120
            X.36K r2 = X.C18310x6.A0Y(r16)
            X.36K r15 = r2.A0l(r9)
            java.lang.String r10 = "name"
            X.36K r14 = r2.A0l(r10)
            java.lang.String r0 = "price"
            X.36K r3 = r2.A0l(r0)
            java.lang.String r0 = "currency"
            X.36K r13 = r2.A0l(r0)
            java.lang.String r0 = "image"
            X.36K r1 = r2.A0l(r0)
            java.lang.String r0 = "quantity"
            X.36K r5 = r2.A0l(r0)
            java.lang.String r0 = "status"
            X.36K r4 = r2.A0l(r0)
            java.lang.String r0 = "variant_info"
            X.36K r2 = r2.A0l(r0)
            r8 = 0
            java.lang.String r22 = X.AnonymousClass4L0.A0Q(r15)
            java.lang.String r23 = X.AnonymousClass4L0.A0Q(r14)
            java.lang.String r14 = X.AnonymousClass4L0.A0Q(r5)
            if (r13 == 0) goto L_0x011d
            java.lang.String r0 = r13.A0n()
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = r13.A0n()
            X.7ny r5 = new X.7ny
            r5.<init>(r0)
        L_0x008a:
            java.math.BigDecimal r24 = X.C86654Ky.A0p(r5, r3)
            if (r4 != 0) goto L_0x0117
            r3 = 0
        L_0x0091:
            java.lang.String r0 = "deleted"
            boolean r0 = r0.equalsIgnoreCase(r3)
            boolean r26 = X.AnonymousClass000.A1S(r0)
            r4 = 0
            if (r1 == 0) goto L_0x00b9
            X.36K r3 = r1.A0l(r9)
            java.lang.String r0 = "url"
            X.36K r0 = r1.A0l(r0)
            java.lang.String r1 = X.AnonymousClass4L0.A0Q(r3)
            java.lang.String r0 = X.AnonymousClass4L0.A0Q(r0)
            if (r1 == 0) goto L_0x00b9
            if (r0 == 0) goto L_0x00b9
            X.7yY r4 = new X.7yY
            r4.<init>(r1, r0)
        L_0x00b9:
            if (r2 == 0) goto L_0x00ee
            java.lang.String r0 = "properties"
            X.36K r1 = r2.A0l(r0)
            if (r1 == 0) goto L_0x00ee
            java.lang.String r0 = "property"
            java.util.List r0 = r1.A0s(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r13 = r0.iterator()
        L_0x00d1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00f0
            X.36K r1 = X.C18310x6.A0Y(r13)
            java.lang.String r2 = r1.A0r(r10, r8)
            java.lang.String r0 = "value"
            java.lang.String r1 = r1.A0r(r0, r8)
            X.7xw r0 = new X.7xw
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x00d1
        L_0x00ee:
            r0 = r8
            goto L_0x00fb
        L_0x00f0:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00ee
            X.5dV r0 = new X.5dV
            r0.<init>(r8, r8, r8, r3)
        L_0x00fb:
            if (r22 == 0) goto L_0x0030
            if (r23 == 0) goto L_0x0030
            if (r14 == 0) goto L_0x0030
            int r25 = java.lang.Integer.parseInt(r14)
            X.5dJ r1 = new X.5dJ
            r18 = r1
            r19 = r0
            r20 = r4
            r21 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r12.add(r1)
            goto L_0x0030
        L_0x0117:
            java.lang.String r3 = r4.A0n()
            goto L_0x0091
        L_0x011d:
            r5 = 0
            goto L_0x008a
        L_0x0120:
            boolean r0 = X.C107575bX.A0F(r17)
            if (r0 != 0) goto L_0x0142
            long r29 = java.lang.Long.parseLong(r17)
        L_0x012a:
            X.5Lk r1 = r11.A00
            java.lang.String r0 = "price"
            X.36K r0 = r7.A0l(r0)
            X.7KN r26 = r1.A00(r0)
            if (r27 == 0) goto L_0x0145
            X.7Ma r1 = new X.7Ma
            r28 = r12
            r25 = r1
            r25.<init>(r26, r27, r28, r29)
            goto L_0x0146
        L_0x0142:
            r29 = 0
            goto L_0x012a
        L_0x0145:
            r1 = 0
        L_0x0146:
            r3 = 0
            if (r1 == 0) goto L_0x014f
            X.3dJ r0 = r6.A06
            X.C86634Kw.A1A(r3, r0, r1)
            return
        L_0x014f:
            X.3dJ r2 = r6.A06
            java.lang.Integer r1 = X.AnonymousClass001.A0f()
            java.lang.String r0 = "order is null"
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            X.C86634Kw.A1A(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90154go.BdM(X.36K, java.lang.String):void");
    }

    public C90154go(C620433g r2, C146997Ck r3, C149687Nm r4, C147017Cm r5, C105915Wx r6, AnonymousClass31C r7, C105255Ue r8) {
        super(r2);
        this.A05 = r8;
        this.A04 = r7;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = r3;
    }

    public final AnonymousClass36K A02(String str) {
        AnonymousClass39V[] r2;
        ArrayList A0s = AnonymousClass001.A0s();
        C149687Nm r22 = this.A01;
        AnonymousClass36K.A0P("width", Integer.toString(r22.A01), A0s);
        AnonymousClass36K.A0P("height", Integer.toString(r22.A00), A0s);
        AnonymousClass36K r4 = new AnonymousClass36K("image_dimensions", (AnonymousClass39V[]) null, C18280x3.A1a(A0s, 0));
        AnonymousClass36K r0 = new AnonymousClass36K("token", r22.A04, (AnonymousClass39V[]) null);
        ArrayList A0s2 = C18300x5.A0s(r4);
        A0s2.add(r0);
        C620433g r02 = this.A01;
        UserJid userJid = r22.A02;
        String A012 = r02.A07.A01(userJid);
        if (A012 != null) {
            AnonymousClass36K.A0P("direct_connection_encrypted_info", A012, A0s2);
        }
        C146997Ck r1 = this.A00;
        AnonymousClass39V r9 = new AnonymousClass39V("op", "get");
        AnonymousClass39V r3 = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r22.A03);
        if (r1.A00.A0X(3215)) {
            r2 = new AnonymousClass39V[3];
            r2[0] = r9;
            r2[1] = r3;
            AnonymousClass39V.A0B("biz_jid", userJid.getRawString(), r2, 2);
        } else {
            r2 = new AnonymousClass39V[]{r9, r3};
        }
        AnonymousClass36K r32 = new AnonymousClass36K("order", r2, C18280x3.A1a(A0s2, 0));
        AnonymousClass39V[] r23 = new AnonymousClass39V[5];
        AnonymousClass39V.A0B("smax_id", "5", r23, 0);
        AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r23);
        AnonymousClass39V.A0B("xmlns", "fb:thrift_iq", r23, 2);
        AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r23);
        r23[4] = AnonymousClass39V.A00();
        return AnonymousClass36K.A0G(r32, r23);
    }
}
