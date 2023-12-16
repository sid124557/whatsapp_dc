package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3TY  reason: invalid class name */
public final class AnonymousClass3TY implements AnonymousClass4EZ {
    public AnonymousClass49B A00;
    public C40072Ek A01;
    public final C620733j A02;
    public final AnonymousClass31C A03;

    public void BQs(String str) {
        C18260x0.A0r("GetCommerceMetadataProtocolHelper/onDeliveryFailure: Network failed  while sending the payload: ", str, C18280x3.A0g(str, 0));
        C40072Ek r0 = this.A01;
        if (r0 == null) {
            throw C18270x1.A0S("listener");
        }
        r0.A00.A06.set(false);
    }

    public void BSN(AnonymousClass36K r4, String str) {
        C162457s7.A0J(r4, 1);
        Log.e("GetCommerceMetadataProtocolHelper/response-error");
        AnonymousClass36K A0l = r4.A0l("error");
        if (A0l != null) {
            A0l.A0b("code", 0);
            C40072Ek r0 = this.A01;
            if (r0 == null) {
                throw C18270x1.A0S("listener");
            }
            AnonymousClass49B r2 = this.A00;
            r0.A00.A06.set(false);
            if (r2 != null) {
                r2.BLH();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012f, code lost:
        if (r4 != null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        r4 = X.C72023d3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0133, code lost:
        r2 = new X.C40062Ej(r4);
        r14 = r1.A00;
        r13 = r0.A00;
        r13.A06.set(false);
        r0 = r2.A00;
        r12 = X.C73783g4.A0c(r0);
        r16 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0150, code lost:
        if (r16.hasNext() == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        r0 = (X.C61252zx) r16.next();
        r1 = X.AnonymousClass0x7.A10(r13.A07);
        r11 = r0.A03;
        r25 = X.C18310x6.A0o(r11, r1);
        r15 = r0.A0A;
        r10 = r0.A06;
        r4 = r0.A01;
        r9 = r0.A08;
        r8 = r0.A04;
        r12.add(new X.C61252zx(r0.A02, r15, r10, r11, r25, r9, r8, r0.A09, r0.A07, r0.A05, r0.A0B, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0199, code lost:
        r0 = new X.C40062Ej(r12);
        r4 = r13.A02;
        r2 = X.AnonymousClass0x9.A1F();
        r3 = r0.A00;
        r1 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ae, code lost:
        if (r1.hasNext() == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b0, code lost:
        r2.put(A00((X.C61252zx) r1.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01be, code lost:
        X.C18270x1.A0j(X.C18270x1.A03(r4), "commerce_metadata", X.AnonymousClass0x9.A0y(r2, "bloksLinks", X.AnonymousClass0x9.A1G()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d1, code lost:
        if (r14 == null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d3, code lost:
        r14.BLH();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e0, code lost:
        if (r13.A04.A0Y(X.C58422vE.A02, 2175) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e2, code lost:
        r4 = r13.A05;
        r8 = X.AnonymousClass001.A0s();
        r7 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f0, code lost:
        if (r7.hasNext() == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f2, code lost:
        r3 = r7.next();
        r2 = (X.C61252zx) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0201, code lost:
        if (X.C162457s7.A0P(r2.A08, "android") == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0203, code lost:
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0205, code lost:
        if (r0 == null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020f, code lost:
        if (r0.longValue() > 0) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0211, code lost:
        r8.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0215, code lost:
        r3 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021d, code lost:
        if (r3.hasNext() == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x021f, code lost:
        r1 = ((X.C61252zx) r3.next()).A01();
        r2 = X.C380125b.A00(r1, r4.A06);
        r7 = r4.A01;
        r11 = r4.A05;
        r6 = r4.A00;
        r10 = r4.A04;
        new X.C23391Sw(r6, r7, r4.A02, r4.A03, r10, r11).A0F(new X.C66573Ly(r2), r1.A0A, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r41, java.lang.String r42) {
        /*
            r40 = this;
            r1 = r41
            r0 = r42
            X.C18260x0.A0O(r0, r1)
            java.lang.String r19 = "commerce_metadata"
            r0 = r19
            X.36K r1 = r1.A0l(r0)
            if (r1 == 0) goto L_0x0121
            java.lang.String r0 = "bloks_links"
            X.36K r0 = r1.A0l(r0)
            if (r0 == 0) goto L_0x0121
            X.36K[] r6 = r0.A03
            if (r6 == 0) goto L_0x0121
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r4 = r6.length
            r3 = 0
        L_0x0023:
            if (r3 >= r4) goto L_0x0031
            r2 = r6[r3]
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "link"
            X.C18280x3.A17(r1, r0, r2, r5)
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0031:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r18 = r5.iterator()
        L_0x0039:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0122
            X.36K r0 = X.C18310x6.A0Y(r18)
            java.lang.String r1 = "language"
            r2 = 0
            java.lang.String r23 = r0.A0r(r1, r2)
            java.lang.String r34 = ""
            if (r23 != 0) goto L_0x0058
            java.lang.String r1 = "locale"
            java.lang.String r23 = r0.A0r(r1, r2)
            if (r23 != 0) goto L_0x0058
            r23 = r34
        L_0x0058:
            X.C162457s7.A0H(r23)
            java.lang.String r1 = "extra_versions"
            X.36K r1 = r0.A0l(r1)
            java.lang.String r14 = "signature"
            java.lang.String r13 = "biz_jid"
            java.lang.String r12 = "flow_version_id"
            java.lang.String r11 = "platform"
            java.lang.String r10 = "bloks_app_id"
            java.lang.String r9 = "expires_at"
            java.lang.String r8 = "url"
            if (r1 == 0) goto L_0x00d7
            X.36K[] r3 = r1.A03
            if (r3 == 0) goto L_0x00d7
            int r1 = r3.length
            r35 = r1
            java.util.ArrayList r15 = X.AnonymousClass002.A0I(r35)
            r2 = 0
        L_0x0080:
            r1 = r35
            if (r2 >= r1) goto L_0x00d8
            r5 = r3[r2]
            r1 = 0
            java.lang.String r24 = r0.A0r(r10, r1)
            if (r24 != 0) goto L_0x008f
            r24 = r34
        L_0x008f:
            java.lang.String r26 = r0.A0r(r11, r1)
            if (r26 != 0) goto L_0x0097
            r26 = r34
        L_0x0097:
            r6 = -1
            long r16 = r0.A0e(r12, r6)
            java.lang.String r27 = r0.A0r(r13, r1)
            java.lang.String r22 = r5.A0r(r8, r1)
            if (r22 != 0) goto L_0x00a9
            r22 = r34
        L_0x00a9:
            java.lang.String r28 = r5.A0r(r14, r1)
            if (r28 != 0) goto L_0x00b1
            r28 = r34
        L_0x00b1:
            long r32 = X.AnonymousClass36K.A05(r5, r9)
            java.lang.String r6 = "min_app_version"
            java.lang.String r29 = r5.A0r(r6, r1)
            java.lang.String r6 = "bloks_version_id"
            java.lang.String r30 = r5.A0r(r6, r1)
            java.lang.Long r21 = java.lang.Long.valueOf(r16)
            X.2zx r5 = new X.2zx
            r31 = r1
            r20 = r5
            r25 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r15.add(r5)
            int r2 = r2 + 1
            goto L_0x0080
        L_0x00d7:
            r15 = 0
        L_0x00d8:
            r3 = 0
            java.lang.String r28 = r0.A0r(r8, r3)
            if (r28 != 0) goto L_0x00e1
            r28 = r34
        L_0x00e1:
            long r38 = X.AnonymousClass36K.A05(r0, r9)
            java.lang.String r30 = r0.A0r(r10, r3)
            if (r30 != 0) goto L_0x00ed
            r30 = r34
        L_0x00ed:
            java.lang.String r32 = r0.A0r(r11, r3)
            if (r32 != 0) goto L_0x00f5
            r32 = r34
        L_0x00f5:
            r1 = -1
            long r1 = r0.A0e(r12, r1)
            java.lang.String r33 = r0.A0r(r13, r3)
            java.lang.String r0 = r0.A0r(r14, r3)
            if (r0 == 0) goto L_0x0107
            r34 = r0
        L_0x0107:
            java.lang.Long r27 = java.lang.Long.valueOf(r1)
            X.2zx r0 = new X.2zx
            r35 = r3
            r36 = r3
            r26 = r0
            r29 = r23
            r31 = r3
            r37 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r4.add(r0)
            goto L_0x0039
        L_0x0121:
            r4 = 0
        L_0x0122:
            r1 = r40
            X.2Ek r0 = r1.A01
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = "listener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x012f:
            if (r4 != 0) goto L_0x0133
            X.3d3 r4 = X.C72023d3.A00
        L_0x0133:
            X.2Ej r2 = new X.2Ej
            r2.<init>(r4)
            X.49B r14 = r1.A00
            r1 = 0
            X.30S r13 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A06
            r0.set(r1)
            java.util.List r0 = r2.A00
            java.util.ArrayList r12 = X.C73783g4.A0c(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x014c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r0 = r16.next()
            X.2zx r0 = (X.C61252zx) r0
            X.66R r1 = r13.A07
            java.util.Map r1 = X.AnonymousClass0x7.A10(r1)
            java.lang.String r11 = r0.A03
            java.lang.String r25 = X.C18310x6.A0o(r11, r1)
            java.lang.String r15 = r0.A0A
            java.lang.String r10 = r0.A06
            long r4 = r0.A01
            java.lang.String r9 = r0.A08
            java.lang.String r8 = r0.A04
            java.lang.Long r7 = r0.A02
            java.lang.String r6 = r0.A09
            java.lang.String r3 = r0.A07
            java.lang.String r2 = r0.A05
            java.util.List r1 = r0.A0B
            X.2zx r0 = new X.2zx
            r20 = r0
            r21 = r7
            r22 = r15
            r23 = r10
            r24 = r11
            r26 = r9
            r27 = r8
            r28 = r6
            r29 = r3
            r30 = r2
            r31 = r1
            r32 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r12.add(r0)
            goto L_0x014c
        L_0x0199:
            X.2Ej r0 = new X.2Ej
            r0.<init>(r12)
            X.33p r4 = r13.A02
            org.json.JSONArray r2 = X.AnonymousClass0x9.A1F()
            java.util.List r3 = r0.A00
            java.util.Iterator r1 = r3.iterator()
        L_0x01aa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01be
            java.lang.Object r0 = r1.next()
            X.2zx r0 = (X.C61252zx) r0
            org.json.JSONObject r0 = A00(r0)
            r2.put(r0)
            goto L_0x01aa
        L_0x01be:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "bloksLinks"
            java.lang.String r2 = X.AnonymousClass0x9.A0y(r2, r0, r1)
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r4)
            r0 = r19
            X.C18270x1.A0j(r1, r0, r2)
            if (r14 == 0) goto L_0x01d6
            r14.BLH()
        L_0x01d6:
            X.1VX r2 = r13.A04
            r1 = 2175(0x87f, float:3.048E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x024b
            X.2TC r4 = r13.A05
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r3.iterator()
        L_0x01ec:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0215
            java.lang.Object r3 = r7.next()
            r2 = r3
            X.2zx r2 = (X.C61252zx) r2
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "android"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x01ec
            java.lang.Long r0 = r2.A02
            if (r0 == 0) goto L_0x0211
            long r5 = r0.longValue()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01ec
        L_0x0211:
            r8.add(r3)
            goto L_0x01ec
        L_0x0215:
            java.util.Iterator r3 = r8.iterator()
        L_0x0219:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x024b
            java.lang.Object r0 = r3.next()
            X.2zx r0 = (X.C61252zx) r0
            X.2zx r1 = r0.A01()
            X.2xz r0 = r4.A06
            java.lang.String r2 = X.C380125b.A00(r1, r0)
            X.2oU r7 = r4.A01
            X.4FS r11 = r4.A05
            X.2s4 r6 = r4.A00
            X.2pq r10 = r4.A04
            X.33K r9 = r4.A03
            X.1VX r8 = r4.A02
            X.1Sw r5 = new X.1Sw
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = r1.A0A
            X.3Ly r0 = new X.3Ly
            r0.<init>(r2)
            r5.A0F(r0, r1, r2)
            goto L_0x0219
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TY.BdM(X.36K, java.lang.String):void");
    }

    public AnonymousClass3TY(C620733j r1, AnonymousClass31C r2) {
        C18260x0.A0Q(r2, r1);
        this.A03 = r2;
        this.A02 = r1;
    }

    public static final JSONObject A00(C61252zx r4) {
        JSONObject A0l = AnonymousClass0x2.A0l(r4);
        A0l.put("url", r4.A0A);
        A0l.put("locale", r4.A06);
        A0l.put("expiresData", r4.A01);
        A0l.put("appId", r4.A03);
        A0l.put("version", r4.A00);
        A0l.put("platform", r4.A08);
        A0l.put("bizJid", r4.A04);
        A0l.put("flowVersionId", r4.A02);
        A0l.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, r4.A09);
        String str = r4.A07;
        if (str != null) {
            A0l.put("minAppVersion", str);
        }
        String str2 = r4.A05;
        if (str2 != null) {
            A0l.put("bloksVersionId", str2);
        }
        List<C61252zx> list = r4.A0B;
        if (list != null) {
            JSONArray A1F = AnonymousClass0x9.A1F();
            for (C61252zx A002 : list) {
                A1F.put(A00(A002));
            }
            A0l.put("extraVersions", A1F);
        }
        return A0l;
    }
}
