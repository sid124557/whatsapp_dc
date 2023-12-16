package X;

import java.io.IOException;
import java.util.Map;
import javax.crypto.SecretKey;

/* renamed from: X.3Or  reason: invalid class name and case insensitive filesystem */
public final class C67283Or implements AnonymousClass4EN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C53952nw A02;
    public final /* synthetic */ AnonymousClass4DK A03;
    public final /* synthetic */ AnonymousClass1jG A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ Map A09;
    public final /* synthetic */ Map A0A;
    public final /* synthetic */ SecretKey A0B;
    public final /* synthetic */ byte[] A0C;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014d, code lost:
        if (r11 == false) goto L_0x0136;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyP(X.AnonymousClass2SI r23) {
        /*
            r22 = this;
            r4 = 0
            r5 = r23
            X.C162457s7.A0J(r5, r4)
            r0 = r22
            X.1jG r13 = r0.A04
            X.1Uc r9 = r13.A0F
            boolean r2 = r13.A02
            r1 = 1
            r2 = r2 ^ 1
            int r10 = r0.A01
            if (r2 == 0) goto L_0x0349
            java.lang.String r2 = "forward_network_1_end"
        L_0x0017:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r9.A09(r8, r2)
            int r3 = r5.A00
            r2 = 0
            if (r3 != 0) goto L_0x01f1
            X.2WN r6 = r5.A03
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlDataProcessor"
            X.C162457s7.A0K(r6, r3)
            X.1M8 r6 = (X.AnonymousClass1M8) r6
            java.lang.Object r15 = r6.A00
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto L_0x0050
            X.2x9 r1 = r13.A0J
            java.lang.String r2 = r1.A01()
            java.lang.String r1 = r13.A01
            java.util.Map r17 = X.C59582x9.A00(r2, r1)
            X.4DK r14 = r0.A03
            java.lang.String r15 = "extensions-decryption-failed-data-is-null"
        L_0x0043:
            r3 = 0
        L_0x0044:
            java.util.Map r2 = r0.A0A
        L_0x0046:
            r18 = r2
            r19 = r4
            r16 = r3
            r13.A0A(r14, r15, r16, r17, r18, r19)
            return
        L_0x0050:
            X.2gx r14 = r13.A0K
            javax.crypto.SecretKey r7 = r0.A0B
            byte[] r5 = r0.A0C
            boolean r3 = r13.A02
            r20 = r3 ^ 1
            r18 = r10
            r19 = r1
            r16 = r7
            r17 = r5
            java.lang.String r7 = r14.A00(r15, r16, r17, r18, r19, r20)
            boolean r3 = r13.A02
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0156
            java.lang.String r3 = "decryption_1_end"
        L_0x006e:
            r9.A09(r8, r3)
            if (r7 != 0) goto L_0x0085
            java.util.Map r5 = r0.A09
            java.util.Map r3 = r0.A0A
            X.4DK r14 = r0.A03
            java.lang.String r15 = "response-decryption-error"
            java.lang.String r16 = "We failed to decrypt your payload. Please check your encryption/decryption logic."
            r18 = r3
            r17 = r5
            r13.A09(r14, r15, r16, r17, r18)
        L_0x0085:
            int r3 = r6.A00
            if (r3 != 0) goto L_0x0197
            java.util.Map r14 = X.C1452674v.A00(r7)
            java.lang.String r15 = r0.A07
            if (r15 == 0) goto L_0x0185
            java.lang.String r5 = r0.A08
            if (r5 == 0) goto L_0x0185
            if (r14 == 0) goto L_0x0185
            X.4FS r3 = r13.A0I
            java.lang.String r7 = r0.A06
            r18 = 2
            X.3as r12 = new X.3as
            r16 = r5
            r17 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r3.BkM(r12)
            java.lang.String r3 = "screen"
            java.lang.String r6 = X.AnonymousClass0x2.A0c(r3, r14)
            java.util.Map r3 = r0.A09
            java.lang.String r5 = "routing_model"
            java.lang.Object r9 = r3.get(r5)
            boolean r5 = r9 instanceof java.util.Map
            if (r5 == 0) goto L_0x0153
            java.util.Map r9 = (java.util.Map) r9
        L_0x00bf:
            java.lang.String r5 = "entry_screens"
            java.lang.Object r8 = r3.get(r5)
            boolean r5 = r8 instanceof java.util.List
            if (r5 == 0) goto L_0x0150
            java.util.List r8 = (java.util.List) r8
        L_0x00cb:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r14)
            java.lang.String r15 = r0.A05
            if (r15 == 0) goto L_0x00da
            java.lang.String r2 = "prev_screen_name"
            r5.put(r2, r15)
        L_0x00da:
            X.2WJ r14 = r13.A0D
            r16 = r6
            r18 = r8
            r19 = r9
            X.20v r7 = r14.A00(r15, r16, r17, r18, r19)
            X.20v r2 = X.C370720v.VALID
            boolean r11 = X.AnonymousClass000.A1Y(r7, r2)
            java.util.Map r2 = r0.A0A
            java.lang.String r7 = "is_draft"
            java.lang.Object r7 = r2.get(r7)
            boolean r10 = X.AnonymousClass0x9.A1Q(r7)
            X.1VX r9 = r13.A0H
            r8 = 4425(0x1149, float:6.201E-42)
            X.2vE r7 = X.C58422vE.A02
            boolean r7 = r9.A0Y(r7, r8)
            java.lang.String r15 = "extensions-invalid-screen-transition-error"
            if (r7 == 0) goto L_0x014d
            if (r11 != 0) goto L_0x0140
            X.4DK r14 = r0.A03
            java.lang.String r18 = "invalid-screen-transition"
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r7 = "Screen transition to "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r7 = " is invalid. Please check your routing model."
            java.lang.String r19 = X.AnonymousClass000.A0X(r7, r8)
            r16 = r13
            r17 = r14
            r20 = r3
            r21 = r2
            r16.A09(r17, r18, r19, r20, r21)
            if (r10 != 0) goto L_0x015a
            int r7 = r0.A00
            r3 = 120(0x78, float:1.68E-43)
            if (r7 >= r3) goto L_0x015a
            java.lang.String r3 = "Business has published extension with invalid routing model."
            r13.A0B(r15, r3, r2)
        L_0x0136:
            java.util.List r3 = r13.A0M
            r3.add(r15)
            java.util.List r3 = r13.A0L
            r3.add(r15)
        L_0x0140:
            X.4DK r0 = r0.A03
            r8 = 0
            r6 = r13
            r7 = r0
            r9 = r8
            r10 = r5
            r11 = r2
            r12 = r1
            r6.A0A(r7, r8, r9, r10, r11, r12)
            return
        L_0x014d:
            if (r11 != 0) goto L_0x0140
            goto L_0x0136
        L_0x0150:
            r8 = r2
            goto L_0x00cb
        L_0x0153:
            r9 = r2
            goto L_0x00bf
        L_0x0156:
            java.lang.String r3 = "decryption_end"
            goto L_0x006e
        L_0x015a:
            r3 = 0
            r13.A01 = r3
            X.2oU r7 = r13.A09
            if (r10 == 0) goto L_0x0179
            r5 = 2131889279(0x7f120c7f, float:1.9413217E38)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            if (r6 != 0) goto L_0x016a
            java.lang.String r6 = ""
        L_0x016a:
            java.lang.String r1 = X.C54292oU.A05(r7, r6, r0, r4, r5)
        L_0x016e:
            X.C162457s7.A0H(r1)
            java.lang.String r0 = r13.A01
            java.util.Map r17 = X.C59582x9.A00(r1, r0)
            goto L_0x0046
        L_0x0179:
            r1 = 2131889283(0x7f120c83, float:1.9413225E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r7)
            java.lang.String r1 = r0.getString(r1)
            goto L_0x016e
        L_0x0185:
            X.2x9 r1 = r13.A0J
            java.lang.String r2 = r1.A01()
            java.lang.String r1 = r13.A01
            java.util.Map r17 = X.C59582x9.A00(r2, r1)
            X.4DK r14 = r0.A03
            java.lang.String r15 = "extensions-decryption-failed-exception"
            goto L_0x0043
        L_0x0197:
            java.lang.String r6 = X.C60032xt.A00(r7)
            java.lang.String r15 = "extensions-invalid-flow-token-error"
            if (r6 != 0) goto L_0x01a9
            java.util.List r1 = r13.A0M
            r1.add(r15)
            java.util.List r1 = r13.A0L
            r1.add(r15)
        L_0x01a9:
            r1 = 0
            r13.A01 = r1
            X.2x9 r8 = r13.A0J
            java.util.Map r2 = r0.A0A
            java.lang.String r1 = "business_jid"
            java.lang.String r9 = X.C18310x6.A0o(r1, r2)
            java.lang.String r1 = "message_id"
            java.lang.String r10 = X.C18310x6.A0o(r1, r2)
            java.lang.String r1 = "action_name"
            java.lang.String r11 = X.AnonymousClass0x2.A0d(r1, r2)
            r12 = 2
            X.C162457s7.A0J(r11, r12)
            if (r10 == 0) goto L_0x01d3
            X.4FS r1 = r8.A03
            X.3ab r7 = new X.3ab
            r7.<init>(r8, r9, r10, r11, r12)
            r1.BkM(r7)
        L_0x01d3:
            X.21V r1 = X.AnonymousClass21V.A02
            java.lang.String r5 = r1.key
            if (r6 != 0) goto L_0x01ef
            X.2oU r3 = r13.A09
            r1 = 2131889286(0x7f120c86, float:1.9413231E38)
            java.lang.String r1 = X.C54292oU.A04(r3, r1)
        L_0x01e2:
            r3 = 0
            java.util.Map r17 = X.C52632ln.A00(r5, r1)
            X.4DK r14 = r0.A03
            if (r6 != 0) goto L_0x0046
            java.lang.String r15 = "extensions-decryption-failed-exception"
            goto L_0x0046
        L_0x01ef:
            r1 = r6
            goto L_0x01e2
        L_0x01f1:
            X.2fE r7 = r5.A04
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.wabloks.commerce.network.extensions.dataexchange.ExtensionsDataExchangeGraphqlErrorProcessor"
            X.C162457s7.A0K(r7, r3)
            java.lang.Object r3 = r7.A00(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x020d
            int r5 = r3.intValue()
            r3 = 2498098(0x261e32, float:3.500581E-39)
            if (r5 != r3) goto L_0x020d
            r9.A08(r8)
        L_0x020d:
            boolean r3 = r13.A02
            r6 = 10
            if (r3 == 0) goto L_0x0271
            java.util.Map r3 = r7.A00
            if (r3 == 0) goto L_0x0271
            java.util.Set r5 = r3.keySet()
            if (r5 == 0) goto L_0x0271
            r3 = 2498061(0x261e0d, float:3.500529E-39)
            boolean r3 = X.C18300x5.A1X(r5, r3)
            if (r3 != r1) goto L_0x0271
            java.util.List r5 = r13.A0M
            java.lang.String r3 = "extensions-business-decryption-error"
            r5.add(r3)
            java.util.List r9 = r13.A0L
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.util.Map r7 = r7.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r7.get(r5)
            X.32n r3 = (X.C618532n) r3
            if (r3 == 0) goto L_0x026f
            java.lang.String r3 = r3.A06
        L_0x0243:
            r8.append(r3)
            r8.append(r6)
            java.lang.Object r3 = r7.get(r5)
            X.32n r3 = (X.C618532n) r3
            if (r3 == 0) goto L_0x0253
            java.lang.String r2 = r3.A05
        L_0x0253:
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r8)
            r9.add(r2)
            long r5 = r13.A00
            r2 = 1
            long r5 = r5 + r2
            r13.A00 = r5
            r13.A02 = r4
            r13.A03 = r1
            java.util.Map r2 = r0.A09
            X.2nw r1 = r0.A02
            X.4DK r0 = r0.A03
            r13.A08(r1, r0, r2)
            return
        L_0x026f:
            r3 = r2
            goto L_0x0243
        L_0x0271:
            java.util.Map r3 = r7.A00
            if (r3 == 0) goto L_0x0338
            java.util.Set r5 = r3.keySet()
            if (r5 == 0) goto L_0x0338
            r3 = 2498058(0x261e0a, float:3.500525E-39)
            boolean r3 = X.C18300x5.A1X(r5, r3)
            if (r3 != r1) goto L_0x0338
            X.2oU r3 = r13.A09
            r5 = 2131889284(0x7f120c84, float:1.9413227E38)
            android.content.res.Resources r3 = X.C54292oU.A00(r3)
            java.lang.String r5 = r3.getString(r5)
            java.lang.String r15 = "extensions-timeout-error"
        L_0x0293:
            X.C162457s7.A0H(r5)
            X.1VX r9 = r13.A0H
            r8 = 3192(0xc78, float:4.473E-42)
            X.2vE r3 = X.C58422vE.A02
            java.lang.String r3 = r9.A0R(r3, r8)
            if (r3 == 0) goto L_0x02a8
            java.lang.String r2 = ","
            java.util.List r2 = X.AnonymousClass2AB.A02(r3, r2)
        L_0x02a8:
            java.util.Map r9 = r7.A00
            if (r9 == 0) goto L_0x02b8
            if (r2 == 0) goto L_0x02b8
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0317
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0317
        L_0x02b8:
            r12 = 0
        L_0x02b9:
            java.lang.String r3 = r13.A01
            if (r3 == 0) goto L_0x02f7
            int r2 = r3.length()
            if (r2 == 0) goto L_0x02f7
            java.util.Map r17 = X.C59582x9.A00(r5, r3)
        L_0x02c7:
            X.4DK r14 = r0.A03
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.util.Map r3 = r7.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r3.get(r2)
            X.32n r1 = (X.C618532n) r1
            if (r1 == 0) goto L_0x02f5
            java.lang.String r1 = r1.A06
        L_0x02dd:
            r5.append(r1)
            r5.append(r6)
            java.lang.Object r1 = r3.get(r2)
            X.32n r1 = (X.C618532n) r1
            if (r1 == 0) goto L_0x02f3
            java.lang.String r1 = r1.A05
        L_0x02ed:
            java.lang.String r3 = X.AnonymousClass000.A0X(r1, r5)
            goto L_0x0044
        L_0x02f3:
            r1 = 0
            goto L_0x02ed
        L_0x02f5:
            r1 = 0
            goto L_0x02dd
        L_0x02f7:
            r2 = 2
            X.3Z6[] r11 = new X.AnonymousClass3Z6[r2]
            X.21V r2 = X.AnonymousClass21V.A02
            java.lang.String r10 = r2.key
            r9 = 0
            r2 = -1
            X.2ln r8 = new X.2ln
            r8.<init>(r5, r9, r2)
            X.AnonymousClass3Z6.A09(r10, r8, r11, r4)
            java.lang.String r3 = "disable_nfm_cta"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            X.AnonymousClass3Z6.A09(r3, r2, r11, r1)
            java.util.Map r17 = X.C73813g7.A0F(r11)
            goto L_0x02c7
        L_0x0317:
            java.util.Iterator r8 = r2.iterator()
        L_0x031b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x02b8
            java.lang.String r2 = X.AnonymousClass001.A0m(r8)
            java.util.Set r3 = r9.keySet()
            int r2 = java.lang.Integer.parseInt(r2)
            boolean r2 = X.C18300x5.A1X(r3, r2)
            if (r2 == 0) goto L_0x031b
            r12 = 1
            r2 = 0
            r13.A01 = r2
            goto L_0x02b9
        L_0x0338:
            X.2oU r3 = r13.A09
            r5 = 2131889283(0x7f120c83, float:1.9413225E38)
            android.content.res.Resources r3 = X.C54292oU.A00(r3)
            java.lang.String r5 = r3.getString(r5)
            java.lang.String r15 = "extensions-business-endpoint-response-error"
            goto L_0x0293
        L_0x0349:
            java.lang.String r2 = "forward_network_end"
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67283Or.AyP(X.2SI):void");
    }

    public void BQq(IOException iOException) {
        String str;
        C162457s7.A0J(iOException, 0);
        AnonymousClass1jG r3 = this.A04;
        AnonymousClass1Uc r2 = r3.A0F;
        boolean z = !r3.A02;
        int i = this.A01;
        if (z) {
            str = "forward_network_1_end";
        } else {
            str = "forward_network_end";
        }
        C56672sN.A01(r2, str, i);
        r3.A0A(this.A03, "extensions-data-exchange-graphql-response-error", iOException.getMessage(), C59582x9.A00(r3.A0J.A01(), r3.A01), this.A0A, false);
    }

    public void BSB(Exception exc) {
        String str;
        C162457s7.A0J(exc, 0);
        AnonymousClass1jG r3 = this.A04;
        AnonymousClass1Uc r2 = r3.A0F;
        boolean z = !r3.A02;
        int i = this.A01;
        if (z) {
            str = "forward_network_1_end";
        } else {
            str = "forward_network_end";
        }
        C56672sN.A01(r2, str, i);
        Map A002 = C59582x9.A00(r3.A0J.A01(), r3.A01);
        AnonymousClass4DK r4 = this.A03;
        String message = exc.getMessage();
        if (message == null) {
            message = "extensions-data-exchange-graphql-response-error";
        }
        r3.A0A(r4, message, exc.getMessage(), A002, this.A0A, false);
    }

    public C67283Or(C53952nw r1, AnonymousClass4DK r2, AnonymousClass1jG r3, String str, String str2, String str3, String str4, Map map, Map map2, SecretKey secretKey, byte[] bArr, int i, int i2) {
        this.A04 = r3;
        this.A01 = i;
        this.A03 = r2;
        this.A0A = map;
        this.A0B = secretKey;
        this.A0C = bArr;
        this.A09 = map2;
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = i2;
        this.A02 = r1;
    }
}
