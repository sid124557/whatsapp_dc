package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5oO  reason: invalid class name and case insensitive filesystem */
public class C115265oO implements AnonymousClass4EZ {
    public final UserJid A00;
    public final AnonymousClass31C A01;
    public final C72183dJ A02 = new C72183dJ();

    /* JADX WARNING: type inference failed for: r6v1, types: [X.7yI] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "merchant_info"
            X.36K r3 = r14.A0l(r0)
            r12 = 0
            if (r3 == 0) goto L_0x00b2
            java.lang.String r0 = "entity_name"
            X.36K r2 = r3.A0l(r0)
            java.lang.String r0 = "entity_type"
            X.36K r1 = r3.A0l(r0)
            java.lang.String r0 = "entity_type_custom"
            X.36K r0 = r3.A0l(r0)
            if (r2 == 0) goto L_0x00cc
            java.lang.String r10 = r2.A0n()
        L_0x0021:
            if (r1 == 0) goto L_0x00c9
            java.lang.String r11 = r1.A0n()
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            java.lang.String r12 = r0.A0n()
        L_0x002d:
            java.lang.String r1 = "is_registered"
            r0 = 0
            java.lang.String r0 = r3.A0r(r1, r0)
            boolean r6 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r0 = "customer_care_details"
            X.36K r2 = r3.A0l(r0)
            java.lang.String r0 = "grievance_officer_details"
            X.36K r3 = r3.A0l(r0)
            r5 = 0
            if (r2 == 0) goto L_0x00c7
            java.lang.String r0 = "email"
            X.36K r1 = r2.A0l(r0)
            java.lang.String r0 = "landline_number"
            X.36K r4 = r2.A0l(r0)
            java.lang.String r0 = "mobile_number"
            X.36K r2 = r2.A0l(r0)
            if (r1 == 0) goto L_0x00c5
            java.lang.String r1 = r1.A0n()
        L_0x005f:
            if (r4 == 0) goto L_0x00c3
            java.lang.String r0 = r4.A0n()
        L_0x0065:
            if (r2 == 0) goto L_0x006b
            java.lang.String r5 = r2.A0n()
        L_0x006b:
            X.7y2 r7 = new X.7y2
            r7.<init>(r1, r0, r5)
        L_0x0070:
            r5 = 0
            if (r3 == 0) goto L_0x00c1
            java.lang.String r0 = "name"
            X.36K r2 = r3.A0l(r0)
            java.lang.String r0 = "email"
            X.36K r1 = r3.A0l(r0)
            java.lang.String r0 = "landline_number"
            X.36K r4 = r3.A0l(r0)
            java.lang.String r0 = "mobile_number"
            X.36K r3 = r3.A0l(r0)
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = r2.A0n()
        L_0x0091:
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r1.A0n()
        L_0x0097:
            if (r4 == 0) goto L_0x00bb
            java.lang.String r0 = r4.A0n()
        L_0x009d:
            if (r3 == 0) goto L_0x00a3
            java.lang.String r5 = r3.A0n()
        L_0x00a3:
            X.7yA r8 = new X.7yA
            r8.<init>(r2, r1, r0, r5)
        L_0x00a8:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            X.7yI r6 = new X.7yI
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r12 = r6
        L_0x00b2:
            r3 = 0
            if (r12 == 0) goto L_0x00cf
            X.3dJ r0 = r13.A02
            X.C86634Kw.A1A(r3, r0, r12)
            return
        L_0x00bb:
            r0 = r5
            goto L_0x009d
        L_0x00bd:
            r1 = r5
            goto L_0x0097
        L_0x00bf:
            r2 = r5
            goto L_0x0091
        L_0x00c1:
            r8 = r5
            goto L_0x00a8
        L_0x00c3:
            r0 = r5
            goto L_0x0065
        L_0x00c5:
            r1 = r5
            goto L_0x005f
        L_0x00c7:
            r7 = r5
            goto L_0x0070
        L_0x00c9:
            r11 = r12
            goto L_0x0027
        L_0x00cc:
            r10 = r12
            goto L_0x0021
        L_0x00cf:
            X.3dJ r2 = r13.A02
            java.lang.Integer r1 = X.AnonymousClass001.A0f()
            java.lang.String r0 = "Merchant Info is Null"
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            X.C86634Kw.A1A(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115265oO.BdM(X.36K, java.lang.String):void");
    }

    public C115265oO(UserJid userJid, AnonymousClass31C r3) {
        this.A01 = r3;
        this.A00 = userJid;
    }

    public void BQs(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GetBusinessComplianceDetailProtocol/delivery-error with iqId ");
        A0o.append(str);
        C18260x0.A1M(A0o, ">");
        this.A02.BQr(new AnonymousClass249(str));
    }

    public void BSN(AnonymousClass36K r5, String str) {
        Pair A022 = C57492tj.A02(r5);
        if (A022 != null) {
            C86634Kw.A1A(A022, this.A02, (Object) null);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GetBusinessComplianceDetailProtocol/response-error with iqId <");
            A0o.append(str);
            C18260x0.A1S(A0o, "> and error ", A022);
            return;
        }
        C86634Kw.A1A(AnonymousClass0x9.A0C(AnonymousClass001.A0f(), "error code is null"), this.A02, (Object) null);
    }
}
