package com.whatsapp.extensions.webview.bridge;

import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.C162457s7;
import X.C18260x0;
import X.C23651Ud;
import X.C48032eE;
import X.C53472n9;
import X.C54292oU;
import X.C54402of;
import X.C55512qT;
import X.C55832qz;
import X.C56162rW;
import X.C56422rx;
import X.C56612sH;
import X.C59102wM;
import X.C60922zO;
import X.C613330g;
import X.C624134x;
import X.C64773Ex;
import X.C73853gB;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import org.json.JSONObject;

public final class FlowsWebViewDataRepository {
    public C53472n9 A00;
    public C624134x A01;
    public JSONObject A02;
    public final C60922zO A03;
    public final C64773Ex A04;
    public final C56422rx A05;
    public final C613330g A06;
    public final C56612sH A07;
    public final C54292oU A08;
    public final C54402of A09;
    public final AnonymousClass33p A0A;
    public final C48032eE A0B;
    public final C55512qT A0C;
    public final C56162rW A0D;
    public final C59102wM A0E;
    public final C23651Ud A0F;
    public final AnonymousClass1VX A0G;
    public final C55832qz A0H;
    public final C73853gB A0I;

    public static int A00(WaFlowsViewModel waFlowsViewModel) {
        C53472n9 r0 = waFlowsViewModel.A0G.A00;
        if (r0 != null) {
            return r0.A02.hashCode();
        }
        return 0;
    }

    public FlowsWebViewDataRepository(C60922zO r4, C64773Ex r5, C56422rx r6, C613330g r7, C56612sH r8, C54292oU r9, C54402of r10, AnonymousClass33p r11, C48032eE r12, C55512qT r13, C56162rW r14, C59102wM r15, C23651Ud r16, AnonymousClass1VX r17, C55832qz r18, C73853gB r19) {
        AnonymousClass1VX r1 = r17;
        C18260x0.A0Q(r9, r1);
        C162457s7.A0J(r12, 5);
        C18260x0.A0W(r6, r11, r8);
        C18260x0.A0Y(r10, r5, r7);
        C55832qz r2 = r18;
        C162457s7.A0J(r2, 15);
        this.A08 = r9;
        this.A0G = r1;
        this.A0C = r13;
        this.A03 = r4;
        this.A0B = r12;
        this.A05 = r6;
        this.A0A = r11;
        this.A07 = r8;
        this.A0F = r16;
        this.A0D = r14;
        this.A09 = r10;
        this.A04 = r5;
        this.A06 = r7;
        this.A0E = r15;
        this.A0H = r2;
        this.A0I = r19;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0225 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02e3 A[PHI: r10 
      PHI: (r10v1 java.lang.Object) = (r10v6 java.lang.Object), (r10v0 java.lang.Object) binds: [B:58:0x0223, B:82:0x02e0] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(android.os.Bundle r32, com.whatsapp.jid.UserJid r33, X.C84814Du r34) {
        /*
            r31 = this;
            r3 = r34
            r6 = r33
            boolean r0 = r3 instanceof X.C74693hX
            r5 = r31
            if (r0 == 0) goto L_0x002f
            r4 = r3
            X.3hX r4 = (X.C74693hX) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r4.label = r2
        L_0x0018:
            java.lang.Object r10 = r4.result
            X.218 r21 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r7 = r4.label
            r2 = 3
            r1 = 1
            r0 = 2
            r3 = 0
            if (r7 == 0) goto L_0x0035
            if (r7 == r1) goto L_0x02e0
            if (r7 == r0) goto L_0x0257
            if (r7 == r2) goto L_0x02e0
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002f:
            X.3hX r4 = new X.3hX
            r4.<init>(r5, r3)
            goto L_0x0018
        L_0x0035:
            X.C57682u2.A01(r10)
            java.lang.String r0 = "message_id"
            java.lang.String r9 = ""
            r10 = r32
            java.lang.String r7 = r10.getString(r0, r9)
            java.lang.String r0 = "session_id"
            java.lang.String r20 = r10.getString(r0, r9)
            java.lang.String r0 = "flow_id"
            java.lang.String r2 = r10.getString(r0, r9)
            java.lang.String r8 = "message_row_id"
            r0 = 0
            long r28 = r10.getLong(r8, r0)
            java.lang.String r0 = "flow_message_version"
            java.lang.String r8 = r10.getString(r0, r3)
            r0 = 0
            if (r7 == 0) goto L_0x006c
            X.2z0 r1 = X.AnonymousClass2z0.A03(r6, r7)
            X.2qz r0 = r5.A0H
            X.34x r0 = r0.A05(r1)
        L_0x006c:
            r5.A01 = r0
            r19 = 0
            r30 = r9
            r0 = r20
            X.C18280x3.A16(r2, r7, r0)
            X.C162457s7.A0H(r8)
            r11 = r3
            X.2n9 r0 = new X.2n9
            r22 = r0
            r23 = r6
            r24 = r2
            r25 = r7
            r26 = r20
            r27 = r8
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r5.A00 = r0
            X.34x r0 = r5.A01
            r12 = 0
            if (r0 == 0) goto L_0x02d9
            X.2eE r13 = r5.A0B
            long r0 = r0.A1L
            X.2k2 r0 = r13.A00(r0)
            if (r0 == 0) goto L_0x00a1
            r19 = 1
            java.lang.String r3 = r0.A00
        L_0x00a1:
            r30 = r3
        L_0x00a3:
            java.lang.String r14 = "is_draft"
            boolean r0 = r10.getBoolean(r14, r12)
            if (r0 == 0) goto L_0x02d5
            java.lang.String r3 = "DRAFT"
        L_0x00ad:
            java.lang.String r13 = "flow_action_payload"
            java.lang.String r18 = r10.getString(r13, r11)
            org.json.JSONObject r11 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = X.AnonymousClass26l.A00(r20)
            java.lang.String r0 = "wam_session_id"
            org.json.JSONObject r11 = r11.put(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r12 = "wae"
            r0 = r20
            java.lang.String r0 = X.AnonymousClass000.A0V(r12, r0, r1)
            java.lang.String r1 = X.AnonymousClass26l.A00(r0)
            java.lang.String r0 = "qpl_session_id"
            org.json.JSONObject r11 = r11.put(r0, r1)
            java.lang.String r1 = "wam_message_id"
            java.lang.String r0 = X.AnonymousClass26l.A00(r7)
            org.json.JSONObject r11 = r11.put(r1, r0)
            java.lang.String r0 = X.AnonymousClass000.A0T(r12, r7)
            java.lang.String r1 = X.AnonymousClass26l.A00(r0)
            java.lang.String r0 = "qpl_message_id"
            org.json.JSONObject r1 = r11.put(r0, r1)
            java.lang.String r0 = "extension_status"
            org.json.JSONObject r3 = r1.put(r0, r3)
            java.lang.String r1 = "flow_token"
            java.lang.String r0 = r10.getString(r1, r9)
            org.json.JSONObject r3 = r3.put(r1, r0)
            java.lang.String r0 = "business_jid"
            java.lang.String r1 = r10.getString(r0, r9)
            java.lang.String r0 = "biz_jid"
            org.json.JSONObject r11 = r3.put(r0, r1)
            X.2rx r12 = r5.A05
            r3 = 0
            X.2qS r0 = r12.A00(r6)
            int r1 = X.AnonymousClass30C.A00(r0)
            java.lang.String r0 = "biz_platform"
            org.json.JSONObject r1 = r11.put(r0, r1)
            java.lang.String r0 = "extension_id"
            org.json.JSONObject r11 = r1.put(r0, r2)
            X.2qS r0 = r12.A00(r6)
            if (r0 == 0) goto L_0x02d2
            java.lang.String r1 = r0.A08
        L_0x012f:
            java.lang.String r0 = "business_name"
            org.json.JSONObject r17 = r11.put(r0, r1)
            java.lang.String r16 = "biz_logo"
            X.3Ex r0 = r5.A04
            X.3ZH r12 = r0.A07(r6)
            X.2oU r0 = r5.A08
            android.content.Context r0 = r0.A00
            r15 = r0
            float r11 = X.C18310x6.A01(r0)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166012(0x7f07033c, float:1.7946257E38)
            int r1 = r1.getDimensionPixelSize(r0)
            if (r12 == 0) goto L_0x02cf
            X.30g r0 = r5.A06
            android.graphics.Bitmap r1 = r0.A01(r15, r12, r11, r1)
        L_0x0159:
            java.io.ByteArrayOutputStream r0 = X.AnonymousClass0x9.A0e()
            if (r1 == 0) goto L_0x0162
            X.C18310x6.A12(r1, r0)
        L_0x0162:
            byte[] r1 = r0.toByteArray()
            r0 = 0
            java.lang.String r11 = android.util.Base64.encodeToString(r1, r0)
            r1 = r17
            r0 = r16
            org.json.JSONObject r11 = r1.put(r0, r11)
            java.lang.String r1 = "is_template"
            r0 = r19
            org.json.JSONObject r11 = r11.put(r1, r0)
            java.lang.String r1 = "hsm_tag"
            r0 = r30
            org.json.JSONObject r1 = r11.put(r1, r0)
            java.lang.String r11 = "flow_action"
            if (r18 == 0) goto L_0x02c3
            java.lang.String r0 = "navigate"
            java.lang.String r0 = r10.getString(r11, r0)
            r1.put(r11, r0)
            java.lang.String r0 = r10.getString(r13, r9)
            X.C162457s7.A0D(r0)
            byte[] r0 = X.AnonymousClass0x2.A1a(r0)
            r9 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)
            r1.put(r13, r0)
        L_0x01a4:
            X.2sH r0 = r5.A07
            long r17 = r0.A0H()
            X.2of r11 = r5.A09
            java.lang.String r0 = r6.user
            long r15 = r11.A00(r0, r2)
            r11 = 0
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x01c1
            X.1VX r11 = r5.A0G
            r0 = 2892(0xb4c, float:4.053E-42)
            long r11 = X.C56952sp.A05(r11, r0)
            long r11 = r11 + r15
        L_0x01c1:
            int r0 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01cd
            java.lang.String r1 = "extensions-banned-id-error"
        L_0x01c7:
            X.1Ug r0 = new X.1Ug
            r0.<init>(r1)
            return r0
        L_0x01cd:
            X.1Ud r12 = r5.A0F
            java.lang.String r0 = "user_interaction"
            int r11 = r12.A0C(r6, r0)
            r0 = 0
            boolean r0 = r10.getBoolean(r14, r0)
            if (r0 != 0) goto L_0x0228
            X.2rW r10 = r5.A0D
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r11)
            X.2Kt r13 = r10.A00(r6, r0)
            if (r13 == 0) goto L_0x0228
            java.util.List r0 = r13.A01
            java.util.Iterator r14 = r0.iterator()
        L_0x01ef:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0226
            java.lang.Object r10 = r14.next()
            r0 = r10
            X.2nk r0 = (X.C53832nk) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C162457s7.A0P(r0, r2)
            if (r0 == 0) goto L_0x01ef
        L_0x0204:
            X.2nk r10 = (X.C53832nk) r10
            if (r10 == 0) goto L_0x0228
            java.lang.Integer r2 = X.AnonymousClass0x9.A0k(r11)
            java.lang.Short r0 = new java.lang.Short
            r0.<init>(r9)
            r12.A0E(r2, r0)
            r0 = 1
            r4.label = r0
            r9 = r5
            r11 = r13
            r12 = r6
            r13 = r8
            r14 = r4
            r15 = r1
            java.lang.Object r10 = r9.A02(r10, r11, r12, r13, r14, r15)
        L_0x0221:
            r0 = r21
            if (r10 != r0) goto L_0x02e3
            return r21
        L_0x0226:
            r10 = r3
            goto L_0x0204
        L_0x0228:
            X.2rW r10 = r5.A0D
            java.lang.Integer r15 = X.AnonymousClass0x9.A0k(r11)
            r4.L$0 = r5
            r4.L$1 = r6
            r4.L$2 = r2
            r4.L$3 = r8
            r4.L$4 = r1
            r4.I$0 = r11
            r4.label = r9
            r19 = 0
            X.3gB r9 = r10.A0A
            r18 = 0
            com.whatsapp.extensions.network.metadata.ExtensionsMetadataManager$fetchExtensionsMetaData$2 r0 = new com.whatsapp.extensions.network.metadata.ExtensionsMetadataManager$fetchExtensionsMetaData$2
            r16 = r7
            r17 = r20
            r12 = r0
            r13 = r10
            r14 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r10 = X.C616131n.A00(r4, r9, r0)
            r0 = r21
            if (r10 != r0) goto L_0x026e
            return r21
        L_0x0257:
            int r11 = r4.I$0
            java.lang.Object r1 = r4.L$4
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.Object r8 = r4.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r4.L$2
            java.lang.Object r6 = r4.L$1
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r4.L$0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r5 = (com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository) r5
            X.C57682u2.A01(r10)
        L_0x026e:
            X.2mF r10 = (X.C52912mF) r10
            X.1Ud r9 = r5.A0F
            java.lang.Integer r7 = X.AnonymousClass0x9.A0k(r11)
            java.lang.Short r0 = r10.A01
            r9.A0E(r7, r0)
            X.2Kt r10 = r10.A00
            if (r10 == 0) goto L_0x02bf
            java.util.List r0 = r10.A01
            java.util.Iterator r9 = r0.iterator()
        L_0x0285:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02bd
            java.lang.Object r7 = r9.next()
            r0 = r7
            X.2nk r0 = (X.C53832nk) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C162457s7.A0P(r0, r2)
            if (r0 == 0) goto L_0x0285
        L_0x029a:
            X.2nk r7 = (X.C53832nk) r7
            if (r7 == 0) goto L_0x02bf
            X.C162457s7.A0H(r1)
            r4.L$0 = r3
            r4.L$1 = r3
            r4.L$2 = r3
            r4.L$3 = r3
            r4.L$4 = r3
            r0 = 3
            r4.label = r0
            r11 = r5
            r12 = r7
            r13 = r10
            r14 = r6
            r15 = r8
            r16 = r4
            r17 = r1
            java.lang.Object r10 = r11.A02(r12, r13, r14, r15, r16, r17)
            goto L_0x0221
        L_0x02bd:
            r7 = r3
            goto L_0x029a
        L_0x02bf:
            java.lang.String r1 = "extensions-invalid-extensions-id"
            goto L_0x01c7
        L_0x02c3:
            r9 = 2
            java.lang.String r0 = "data_exchange"
            java.lang.String r0 = r10.getString(r11, r0)
            r1.put(r11, r0)
            goto L_0x01a4
        L_0x02cf:
            r1 = 0
            goto L_0x0159
        L_0x02d2:
            r1 = r3
            goto L_0x012f
        L_0x02d5:
            java.lang.String r3 = "PUBLISHED"
            goto L_0x00ad
        L_0x02d9:
            java.lang.String r0 = "ExtensionsLogger/FlowsWebViewDataRepository/FMessage is not accessible"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00a3
        L_0x02e0:
            X.C57682u2.A01(r10)
        L_0x02e3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A01(android.os.Bundle, com.whatsapp.jid.UserJid, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C53832nk r9, X.C41572Kt r10, com.whatsapp.jid.UserJid r11, java.lang.String r12, X.C84814Du r13, org.json.JSONObject r14) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof X.C74453h9
            if (r0 == 0) goto L_0x008f
            r4 = r13
            X.3h9 r4 = (X.C74453h9) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008f
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r7 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 != r7) goto L_0x0096
            java.lang.Object r14 = r4.L$1
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            java.lang.Object r2 = r4.L$0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r2 = (com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository) r2
            X.C57682u2.A01(r1)
        L_0x0028:
            X.26m r1 = (X.AnonymousClass26m) r1
            boolean r0 = r1 instanceof X.C23671Uf
            if (r0 == 0) goto L_0x009e
            X.1Uf r1 = (X.C23671Uf) r1
            java.lang.Object r1 = r1.A00
            java.lang.String r0 = "public_key"
            r14.put(r0, r1)
            r2.A02 = r14
        L_0x003a:
            X.1Uh r1 = X.C23691Uh.A00
            return r1
        L_0x003d:
            X.C57682u2.A01(r1)
            X.2wM r1 = r8.A0E
            r0 = 0
            if (r10 == 0) goto L_0x0047
            X.2z5 r0 = r10.A00
        L_0x0047:
            X.20w r0 = r1.A01(r0, r9, r12)
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0057
            if (r1 == r7) goto L_0x009b
            java.lang.String r0 = "extensions-metadata-unknown-version"
            goto L_0x00aa
        L_0x0057:
            org.json.JSONArray r6 = X.AnonymousClass0x9.A1F()
            java.lang.String[] r3 = r9.A07
            if (r3 == 0) goto L_0x006b
            int r2 = r3.length
            r1 = 0
        L_0x0061:
            if (r1 >= r2) goto L_0x006b
            r0 = r3[r1]
            r6.put(r0)
            int r1 = r1 + 1
            goto L_0x0061
        L_0x006b:
            java.lang.String r0 = "categories"
            r14.put(r0, r6)
            java.lang.String r0 = r9.A02
            if (r0 == 0) goto L_0x008c
            r4.L$0 = r8
            r4.L$1 = r14
            r4.label = r7
            r3 = 0
            X.3gB r2 = r8.A0I
            r1 = 0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2 r0 = new com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2
            r0.<init>(r8, r11, r1, r3)
            java.lang.Object r1 = X.C616131n.A00(r4, r2, r0)
            if (r1 != r5) goto L_0x008a
            return r5
        L_0x008a:
            r2 = r8
            goto L_0x0028
        L_0x008c:
            r8.A02 = r14
            goto L_0x003a
        L_0x008f:
            X.3h9 r4 = new X.3h9
            r4.<init>(r8, r13)
            goto L_0x0012
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x009b:
            java.lang.String r0 = "extensions-metadata-not-compatible"
            goto L_0x00aa
        L_0x009e:
            boolean r0 = r1 instanceof X.C23661Ue
            if (r0 == 0) goto L_0x00b0
            X.1Ue r1 = (X.C23661Ue) r1
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "UNKNOWN"
        L_0x00aa:
            X.1Ug r1 = new X.1Ug
            r1.<init>(r0)
            return r1
        L_0x00b0:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A02(X.2nk, X.2Kt, com.whatsapp.jid.UserJid, java.lang.String, X.4Du, org.json.JSONObject):java.lang.Object");
    }
}
