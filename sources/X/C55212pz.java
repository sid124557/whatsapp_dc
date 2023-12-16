package X;

import java.util.Map;

/* renamed from: X.2pz  reason: invalid class name and case insensitive filesystem */
public abstract class C55212pz {
    public boolean A00;
    public final AnonymousClass1j2 A01;

    public void A03() {
        this.A00 = true;
    }

    public final void A05(AnonymousClass4DK r4, String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A02());
        C18260x0.A0r("/execute: ", str2, A0o);
        r4.BSv(new C60752z6((Integer) null, str, str2), (Map) null);
    }

    public String A02() {
        if (this instanceof AnonymousClass1jE) {
            return "wae_direct_connect";
        }
        if (this instanceof AnonymousClass1j8) {
            return "payments_preprocessor";
        }
        if (this instanceof AnonymousClass1jG) {
            return "wae_action_dispatcher";
        }
        if (this instanceof AnonymousClass1jF) {
            return "native_card_encryption_resource";
        }
        if (this instanceof AnonymousClass1jI) {
            return "payment_encrypt_with_public_key";
        }
        if (this instanceof AnonymousClass1jC) {
            return "br_verify_card_check_if_app_exists";
        }
        if (this instanceof AnonymousClass1jT) {
            return "native_br_p2m_checkout_address";
        }
        if (this instanceof AnonymousClass1jS) {
            return "native_br_compliance";
        }
        if (this instanceof AnonymousClass1jH) {
            return "native_upi_send_payment_message";
        }
        if (this instanceof AnonymousClass1jO) {
            return "native_upi_transaction_confirmation";
        }
        if (this instanceof AnonymousClass1jN) {
            return "native_upi_reset_pin";
        }
        if (this instanceof AnonymousClass1jM) {
            return "native_upi_consumer_onboarding";
        }
        if (this instanceof AnonymousClass1jL) {
            return "native_upi_add_payment_method";
        }
        if (this instanceof AnonymousClass1jU) {
            return "native_flow_npci_common_library";
        }
        if (this instanceof AnonymousClass1jV) {
            return "dismiss_bottom_sheet";
        }
        if (this instanceof AnonymousClass1jP) {
            return "request_permission";
        }
        if (this instanceof AnonymousClass1jB) {
            return "send_fds_iq";
        }
        if (this instanceof AnonymousClass1jA) {
            return "abprop_fetch";
        }
        if (this instanceof AnonymousClass1j9) {
            return "throw_error";
        }
        if (this instanceof AnonymousClass1jR) {
            return "native_p2m_lite_hpp_checkout";
        }
        if (this instanceof AnonymousClass1jQ) {
            return "native_p2m_lite_compliance";
        }
        if (this instanceof AnonymousClass1jK) {
            return "native_flow_call_manager";
        }
        if (this instanceof AnonymousClass1jD) {
            return "client_dasl_query";
        }
        if (this instanceof AnonymousClass1jY) {
            return "open_web_view";
        }
        if (this instanceof C29521ix) {
            return "open_bloks_screen_graphql";
        }
        return "open_bloks_screen";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.1iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.1iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.1ix} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.1iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.1iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.1iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.1iy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C29521ix
            if (r0 == 0) goto L_0x0027
            r3 = r4
            X.1ix r3 = (X.C29521ix) r3
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x001d
            X.2nE r2 = r3.A01
        L_0x000d:
            X.9Sx r0 = r2.A02
            r0.A02(r1)
            X.2yd r0 = r2.A05
            X.2or r1 = r0.A00()
            java.lang.Class<X.3Wu> r0 = X.C69383Wu.class
            r1.A02(r0, r2)
        L_0x001d:
            X.7nZ r1 = r3.A07()
            X.2or r0 = r1.A01
            r0.A03(r1)
        L_0x0026:
            return
        L_0x0027:
            boolean r0 = r4 instanceof X.C29531iy
            if (r0 == 0) goto L_0x0026
            r3 = r4
            X.1iy r3 = (X.C29531iy) r3
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x001d
            X.2nE r2 = r3.A01
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55212pz.A04():void");
    }

    public C55212pz(AnonymousClass1j2 r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if ((r7 instanceof java.util.Map) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0796, code lost:
        if (r4.length() == 0) goto L_0x0776;
     */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0aea A[Catch:{ IllegalArgumentException -> 0x0b18 }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0b0b A[Catch:{ IllegalArgumentException -> 0x0b18 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C53952nw r26, X.AnonymousClass4DK r27, X.C60752z6 r28, java.util.Map r29) {
        /*
            r25 = this;
            r15 = r25
            boolean r1 = r15 instanceof X.AnonymousClass1jE
            r14 = r26
            r0 = r27
            r13 = r29
            if (r1 == 0) goto L_0x0127
            X.1jE r15 = (X.AnonymousClass1jE) r15
            r9 = 0
            int r3 = X.C18300x5.A05(r13, r14, r9)
            java.lang.String r6 = "data"
            java.lang.Object r5 = r13.get(r6)
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L_0x001f
            if (r5 != 0) goto L_0x0023
        L_0x001f:
            X.3d5 r5 = X.C72043d5.A00()
        L_0x0023:
            java.lang.String r1 = "screen"
            java.lang.Object r8 = r13.get(r1)
            java.lang.String r2 = "external_resources"
            java.lang.Object r4 = r13.get(r2)
            boolean r2 = r4 instanceof java.util.Map
            if (r2 == 0) goto L_0x0038
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L_0x003c
        L_0x0038:
            X.3d5 r4 = X.C72043d5.A00()
        L_0x003c:
            X.3Z6[] r3 = new X.AnonymousClass3Z6[r3]
            X.AnonymousClass3Z6.A09(r6, r5, r3, r9)
            X.3Z6 r2 = X.AnonymousClass3Z6.A02(r1, r8)
            r6 = 1
            r3[r6] = r2
            java.util.Map r2 = X.C73813g7.A0F(r3)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r2)
            java.util.Map r3 = r14.A07
            java.lang.String r2 = "business_jid"
            java.lang.String r10 = X.AnonymousClass0x2.A0d(r2, r3)
            java.lang.String r2 = "action_name"
            java.lang.Object r3 = r13.get(r2)
            java.lang.String r2 = "navigate"
            boolean r2 = X.C162457s7.A0P(r3, r2)
            java.lang.String r3 = "external_data"
            if (r2 == 0) goto L_0x0074
            boolean r2 = r13.containsKey(r3)
            if (r2 != 0) goto L_0x0074
        L_0x0070:
            r15.A07(r0, r5, r6)
        L_0x0073:
            return
        L_0x0074:
            boolean r2 = r13.containsKey(r3)
            if (r2 == 0) goto L_0x0113
            java.lang.Object r7 = r13.get(r3)
            boolean r2 = r7 instanceof java.util.Map
            if (r2 == 0) goto L_0x09b6
        L_0x0082:
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L_0x09b6
            X.2gH r2 = new X.2gH
            r2.<init>(r0, r15, r5)
            java.lang.Object r3 = r4.get(r8)
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 != 0) goto L_0x0095
            X.3d3 r3 = X.C72023d3.A00
        L_0x0095:
            boolean r3 = X.C18310x6.A1X(r3)
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = "name"
            java.lang.Object r4 = r7.get(r3)
            java.lang.String r3 = "payload"
            java.lang.Object r12 = r7.get(r3)
            boolean r3 = r12 instanceof java.util.Map
            if (r3 == 0) goto L_0x00b1
            java.util.Map r12 = (java.util.Map) r12
            if (r12 != 0) goto L_0x00b5
        L_0x00b1:
            X.3d5 r12 = X.C72043d5.A00()
        L_0x00b5:
            java.util.Map r3 = r15.A03
            java.lang.Object r3 = r3.get(r4)
            X.4C1 r3 = (X.AnonymousClass4C1) r3
            if (r3 == 0) goto L_0x0070
            java.lang.Object r4 = r3.get()
            X.4Bk r4 = (X.C84194Bk) r4
            if (r4 == 0) goto L_0x0070
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass32Y.A09(r10)
            X.4JG r4 = (X.AnonymousClass4JG) r4
            int r3 = r4.A01
            java.lang.Object r0 = r4.A00
            X.3dX r0 = (X.C72323dX) r0
            X.3Db r0 = r0.A01
            X.2bQ r9 = r0.Agy()
            X.5Xe r11 = r0.As4()
            switch(r3) {
                case 0: goto L_0x010d;
                case 1: goto L_0x0107;
                case 2: goto L_0x0101;
                case 3: goto L_0x00fb;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            X.1uv r8 = new X.1uv
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00e5:
            boolean r0 = r8 instanceof X.C34371uy
            if (r0 == 0) goto L_0x0888
            java.util.List r1 = r8.A00()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x098a
            X.3d5 r0 = X.C72043d5.A00()
            r2.A00(r0)
            return
        L_0x00fb:
            X.1uy r8 = new X.1uy
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00e5
        L_0x0101:
            X.1ux r8 = new X.1ux
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00e5
        L_0x0107:
            X.1uu r8 = new X.1uu
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00e5
        L_0x010d:
            X.1uw r8 = new X.1uw
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00e5
        L_0x0113:
            java.util.List r3 = X.C18320x8.A0s(r8, r4)
            if (r3 != 0) goto L_0x011b
            X.3d3 r3 = X.C72023d3.A00
        L_0x011b:
            boolean r2 = X.C18310x6.A1X(r3)
            if (r2 == 0) goto L_0x09b6
            java.lang.Object r7 = r3.get(r9)
            goto L_0x0082
        L_0x0127:
            boolean r1 = r15 instanceof X.AnonymousClass1j8
            if (r1 == 0) goto L_0x0188
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            java.util.Map r5 = r14.A07
            java.lang.String r1 = "business_jid"
            java.lang.Object r6 = r5.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r6, r4)
            java.lang.String r1 = "action_payload"
            java.lang.Object r3 = r13.get(r1)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C162457s7.A0K(r3, r2)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r1 = "data"
            java.lang.Object r2 = X.AnonymousClass0x9.A0s(r1, r2, r3)
            java.util.Map r2 = (java.util.Map) r2
            r1 = 0
            X.C162457s7.A0J(r2, r1)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.lang.String r1 = "id"
            java.util.Map r2 = X.C57692u3.A04(r1, r6)
            java.lang.String r1 = "recipient"
            r3.put(r1, r2)
            java.lang.String r2 = "error_map_type"
            java.lang.String r1 = "payments"
            r3.put(r2, r1)
            java.lang.String r1 = "message_id"
            java.lang.Object r2 = X.AnonymousClass0x9.A0s(r1, r4, r5)
            java.lang.String r1 = "quoted_message_id"
            r3.put(r1, r2)
            java.lang.String r1 = "state_machine_parameters"
            java.util.Map r1 = X.C57692u3.A04(r1, r3)
            r0.BdH(r1)
            return
        L_0x0188:
            boolean r1 = r15 instanceof X.AnonymousClass1jF
            if (r1 == 0) goto L_0x01d6
            X.1jF r15 = (X.AnonymousClass1jF) r15
            X.C18270x1.A12(r13, r0)
            r15.A00 = r0
            java.lang.String r1 = "card_cvv"
            java.lang.Object r9 = r13.get(r1)
            boolean r1 = r9 instanceof java.lang.String
            r4 = 0
            if (r1 == 0) goto L_0x01d4
            java.lang.String r9 = (java.lang.String) r9
        L_0x01a0:
            java.lang.String r1 = "card_pan"
            java.lang.String r10 = X.AnonymousClass0x2.A0c(r1, r13)
            if (r9 == 0) goto L_0x09be
            int r1 = r9.length()
            if (r1 == 0) goto L_0x09be
            if (r10 == 0) goto L_0x09be
            int r1 = r10.length()
            if (r1 == 0) goto L_0x09be
            X.2Hd r5 = new X.2Hd
            r5.<init>(r0)
            X.4FS r8 = r15.A07
            X.9Nf r6 = r15.A05
            X.33l r3 = r15.A03
            X.28X r7 = r15.A06
            X.9U5 r4 = r15.A04
            X.1ip r2 = r15.A02
            X.1it r1 = new X.1it
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.A01 = r1
            X.4FS r0 = r1.A01
            X.C18270x1.A0w(r1, r0)
            return
        L_0x01d4:
            r9 = r4
            goto L_0x01a0
        L_0x01d6:
            boolean r1 = r15 instanceof X.AnonymousClass1jI
            if (r1 == 0) goto L_0x0248
            X.1jI r15 = (X.AnonymousClass1jI) r15
            r5 = 0
            r15.A00 = r0
            java.lang.String r1 = "data_value"
            java.lang.Object r3 = r13.get(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "data_type"
            java.lang.String r4 = X.C18290x4.A0p(r1, r13)
            java.lang.String r1 = "key_scope"
            java.lang.String r14 = X.C18290x4.A0p(r1, r13)
            java.lang.String r1 = "provider_name"
            java.lang.String r2 = X.C18290x4.A0p(r1, r13)
            java.lang.String r1 = "network"
            java.lang.String r6 = X.C18310x6.A0o(r1, r13)
            X.C162457s7.A0J(r14, r5)
            X.2oU r1 = r15.A02
            android.content.Context r9 = r1.A00
            X.3Wi r10 = r15.A01
            X.9U5 r12 = r15.A05
            X.2Ha r11 = r15.A04
            X.9VU r13 = r15.A06
            X.9Rt r8 = new X.9Rt
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = "OTP"
            boolean r1 = X.C162457s7.A0P(r4, r1)
            if (r1 == 0) goto L_0x09d8
            if (r6 == 0) goto L_0x0246
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toUpperCase(r1)
            X.C162457s7.A0D(r6)
        L_0x022e:
            java.lang.String r1 = "VISA"
            boolean r1 = X.C162457s7.A0P(r6, r1)
            if (r1 != 0) goto L_0x09d8
            r1 = 1
            X.3Z6[] r2 = new X.AnonymousClass3Z6[r1]
            java.lang.String r1 = "data"
            X.AnonymousClass3Z6.A09(r1, r3, r2, r5)
            java.util.Map r1 = X.C73813g7.A0G(r2)
            r0.BdH(r1)
            return
        L_0x0246:
            r6 = 0
            goto L_0x022e
        L_0x0248:
            boolean r1 = r15 instanceof X.AnonymousClass1jC
            if (r1 == 0) goto L_0x02f2
            X.1jC r15 = (X.AnonymousClass1jC) r15
            X.C18270x1.A12(r13, r0)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r13)
            java.lang.String r9 = "data"
            java.lang.Object r1 = r8.get(r9)
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            X.C162457s7.A0K(r1, r10)
            java.util.Map r7 = X.AnonymousClass360.A02(r1)
            java.lang.String r6 = "verify_method_list"
            java.lang.Object r5 = r7.get(r6)
            java.lang.String r1 = "null cannot be cast to non-null type net.minidev.json.JSONArray"
            X.C162457s7.A0K(r5, r1)
            java.util.AbstractList r5 = (java.util.AbstractList) r5
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x02eb
            int r2 = r5.size()
            r4 = 0
        L_0x0280:
            if (r4 >= r2) goto L_0x02e5
            java.lang.Object r1 = r5.get(r4)
            X.C162457s7.A0K(r1, r10)
            java.util.Map r3 = X.AnonymousClass360.A02(r1)
            java.lang.String r1 = "verify_type"
            java.lang.Object r11 = r3.get(r1)
            java.lang.String r1 = "APP_TO_APP"
            boolean r1 = X.C162457s7.A0P(r11, r1)
            if (r1 == 0) goto L_0x02ef
            java.lang.String r1 = "source"
            java.lang.String r11 = X.C18310x6.A0o(r1, r3)
            java.lang.String r1 = "intent_action"
            java.lang.String r1 = X.C18310x6.A0o(r1, r3)
            X.0PJ r1 = X.AnonymousClass9UN.A00(r11, r1)
            if (r1 == 0) goto L_0x02db
            java.lang.Object r14 = r1.A00
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r1.A01
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r1 = "request_payload"
            java.lang.String r12 = X.C18310x6.A0o(r1, r3)
            android.content.Intent r11 = X.C18320x8.A07()
            java.lang.String r1 = "android.intent.extra.TEXT"
            r11.putExtra(r1, r12)
            r11.setPackage(r14)
            r11.setAction(r13)
            X.2oU r1 = r15.A00
            android.content.Context r1 = r1.A00
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r1 = r11.resolveActivity(r1)
            if (r1 != 0) goto L_0x02ef
        L_0x02db:
            java.lang.String r2 = "disabled"
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.put(r2, r1)
            r5.set(r4, r3)
        L_0x02e5:
            r7.put(r6, r5)
            r8.put(r9, r7)
        L_0x02eb:
            r0.BdH(r8)
            return
        L_0x02ef:
            int r4 = r4 + 1
            goto L_0x0280
        L_0x02f2:
            boolean r1 = r15 instanceof X.AnonymousClass1jT
            r7 = r28
            if (r1 == 0) goto L_0x030c
            X.1jT r15 = (X.AnonymousClass1jT) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r4 = 0
            if (r28 == 0) goto L_0x09f0
            X.2fM r2 = r15.A00
            if (r2 != 0) goto L_0x0a94
            java.lang.String r0 = "fcsLoadingEventManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x030c:
            boolean r1 = r15 instanceof X.AnonymousClass1jS
            if (r1 == 0) goto L_0x039a
            X.1jS r15 = (X.AnonymousClass1jS) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r4 = 0
            if (r28 == 0) goto L_0x0324
            X.2fM r2 = r15.A00
            if (r2 != 0) goto L_0x0a94
            java.lang.String r0 = "fcsLoadingEventManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0324:
            r15.A01 = r0
            java.lang.String r0 = "account_compliance_status"
            java.lang.Object r1 = r13.get(r0)
            if (r1 != 0) goto L_0x0344
            java.lang.String r0 = "FcsBRComplianceResource/execute missing complianceStatus input"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r3 = "ILLEGAL_ARGUMENTS"
            java.lang.String r2 = "Invalid data input. Please make sure to provide the compliance status to this resource"
        L_0x0337:
            X.4DK r1 = r15.A01
            if (r1 == 0) goto L_0x0073
            X.2z6 r0 = new X.2z6
            r0.<init>(r4, r3, r2)
            r1.BSv(r0, r4)
            return
        L_0x0344:
            java.lang.String r0 = "DOB_CHALLENGED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0395
            java.lang.String r4 = r14.A05
            X.2oU r0 = r15.A04
            android.content.Context r2 = r0.A00
            java.lang.Class<com.whatsapp.payments.ui.BrazilPayBloksActivity> r0 = com.whatsapp.payments.ui.BrazilPayBloksActivity.class
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r2, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_compliance_dob"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "p2m_context"
            X.AnonymousClass98s.A0a(r3, r1, r0)
            java.lang.String r0 = "fds_manager_id"
            X.AnonymousClass98s.A0a(r3, r0, r4)
            java.lang.String r1 = "dob_prompted_for_compliance_only"
            java.lang.String r0 = "1"
            X.AnonymousClass98s.A0a(r3, r1, r0)
            java.lang.String r1 = "compliance_reason"
            java.lang.String r0 = "account-registration"
            X.AnonymousClass98s.A0a(r3, r1, r0)
            java.lang.String r1 = "fds_resource_id"
            java.lang.String r0 = "native_br_compliance"
            X.AnonymousClass98s.A0a(r3, r1, r0)
            java.lang.String r1 = r15.A02
            if (r1 != 0) goto L_0x0a9d
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0395:
            java.lang.String r3 = "UNSUPPORTED_TYPE"
            java.lang.String r2 = "This compliance type is not supported. Please add a supported type"
            goto L_0x0337
        L_0x039a:
            boolean r1 = r15 instanceof X.AnonymousClass1jO
            if (r1 == 0) goto L_0x03f5
            X.1jO r15 = (X.AnonymousClass1jO) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r2 = "formatted_amount"
            java.lang.Object r4 = r13.get(r2)
            r5 = 0
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r4 == 0) goto L_0x03b5
            boolean r1 = r4 instanceof java.lang.String
            if (r1 != 0) goto L_0x03b9
        L_0x03b5:
            X.AnonymousClass1jH.A00(r0, r15, r6, r2)
            r4 = r5
        L_0x03b9:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0073
            java.lang.String r3 = "recipient_name"
            java.lang.Object r2 = r13.get(r3)
            if (r2 == 0) goto L_0x03f1
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x03f1
            r5 = r2
        L_0x03cb:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0073
            X.2oU r0 = r15.A01
            android.content.Context r3 = r0.A00
            java.lang.String r2 = r14.A05
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity"
            r1.setClassName(r3, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_merchant_name"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "extra_formatted_amount"
            r1.putExtra(r0, r4)
            X.C18280x3.A0n(r3, r1)
            return
        L_0x03f1:
            X.AnonymousClass1jH.A00(r0, r15, r6, r3)
            goto L_0x03cb
        L_0x03f5:
            boolean r1 = r15 instanceof X.AnonymousClass1jN
            if (r1 == 0) goto L_0x0433
            X.1jN r15 = (X.AnonymousClass1jN) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r0 = "credential_id"
            java.lang.String r6 = X.AnonymousClass0x2.A0d(r0, r13)
            java.lang.String r0 = "is_forget_pin_flow"
            boolean r5 = X.AnonymousClass0x2.A1Z(r13, r0)
            X.2oU r0 = r15.A01
            android.content.Context r4 = r0.A00
            java.lang.String r3 = r14.A05
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsResetPinActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "extra_credential_id"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "extra_is_forget_pin"
            r2.putExtra(r0, r5)
            X.C18280x3.A0n(r4, r2)
            return
        L_0x0433:
            boolean r1 = r15 instanceof X.AnonymousClass1jM
            if (r1 == 0) goto L_0x0488
            X.1jM r15 = (X.AnonymousClass1jM) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r0 = "is_full_screen"
            java.lang.Object r1 = r13.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C162457s7.A0K(r1, r0)
            boolean r7 = X.AnonymousClass001.A1Z(r1)
            java.lang.String r0 = "skip_2fa"
            boolean r6 = X.C18280x3.A1Y(r13, r0)
            java.lang.String r0 = "skip_value_props_screen"
            boolean r5 = X.C18280x3.A1Y(r13, r0)
            X.2oU r0 = r15.A01
            android.content.Context r4 = r0.A00
            java.lang.String r3 = r14.A05
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "extra_onboarding_skip_2fa"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "extra_is_full_screen"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "extra_skip_value_props_screen"
            r2.putExtra(r0, r5)
            X.C18280x3.A0n(r4, r2)
            return
        L_0x0488:
            boolean r1 = r15 instanceof X.AnonymousClass1jL
            if (r1 == 0) goto L_0x04af
            X.1jL r15 = (X.AnonymousClass1jL) r15
            X.C18260x0.A0S(r14, r0)
            r15.A00 = r0
            X.2oU r0 = r15.A01
            android.content.Context r4 = r0.A00
            java.lang.String r3 = r14.A05
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_fds_manager_id"
            r2.putExtra(r0, r3)
            X.C18280x3.A0n(r4, r2)
            return
        L_0x04af:
            boolean r1 = r15 instanceof X.AnonymousClass1jU
            if (r1 == 0) goto L_0x053f
            X.1jU r15 = (X.AnonymousClass1jU) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r0 = "credential_id"
            java.lang.Object r6 = r13.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "mode"
            java.lang.String r21 = X.C18290x4.A0p(r0, r13)
            java.lang.String r0 = "npci_common_library_transaction_id"
            java.lang.Object r5 = r13.get(r0)
            boolean r0 = r5 instanceof java.lang.String
            r4 = 0
            if (r0 == 0) goto L_0x053d
            java.lang.String r5 = (java.lang.String) r5
        L_0x04de:
            java.lang.String r0 = "receiver_handle"
            java.lang.String r24 = X.AnonymousClass0x2.A0c(r0, r13)
            java.lang.String r0 = "receiver_name"
            java.lang.String r23 = X.AnonymousClass0x2.A0c(r0, r13)
            java.lang.String r0 = "amount"
            java.lang.Object r3 = r13.get(r0)
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0534
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Long r3 = X.C18280x3.A0U(r3)
        L_0x04fc:
            java.lang.String r0 = "offset"
            java.lang.Object r2 = r13.get(r0)
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0532
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0509:
            java.lang.String r0 = "is_asynchronous"
            java.lang.Object r1 = r13.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0530
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x0515:
            if (r28 == 0) goto L_0x0519
            java.lang.Integer r4 = r7.A00
        L_0x0519:
            X.4FS r0 = r15.A05
            X.3bd r13 = new X.3bd
            r17 = r2
            r18 = r4
            r19 = r3
            r20 = r6
            r22 = r5
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.BkM(r13)
            return
        L_0x0530:
            r1 = r4
            goto L_0x0515
        L_0x0532:
            r2 = r4
            goto L_0x0509
        L_0x0534:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L_0x053b
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x04fc
        L_0x053b:
            r3 = r4
            goto L_0x04fc
        L_0x053d:
            r5 = r4
            goto L_0x04de
        L_0x053f:
            boolean r1 = r15 instanceof X.AnonymousClass1jV
            if (r1 == 0) goto L_0x0554
            X.1jV r15 = (X.AnonymousClass1jV) r15
            X.2yd r2 = r15.A01
            java.lang.String r1 = r15.A00
            r3 = 0
            if (r1 != 0) goto L_0x0aa6
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0554:
            boolean r1 = r15 instanceof X.AnonymousClass1jP
            if (r1 == 0) goto L_0x0581
            X.1jP r15 = (X.AnonymousClass1jP) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r1 = "permission"
            java.lang.Object r6 = r13.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            r4 = 0
            if (r1 == 0) goto L_0x057f
            java.lang.String r6 = (java.lang.String) r6
        L_0x056e:
            java.lang.String r3 = "no_valid_permission"
            if (r6 != 0) goto L_0x0ab6
            java.lang.String r2 = "permission is null"
            X.2z6 r1 = new X.2z6
            r1.<init>(r4, r3, r2)
            r0.BSv(r1, r4)
            return
        L_0x057f:
            r6 = r4
            goto L_0x056e
        L_0x0581:
            boolean r1 = r15 instanceof X.AnonymousClass1jB
            if (r1 == 0) goto L_0x05a1
            X.1jB r15 = (X.AnonymousClass1jB) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            X.2Wj r2 = r15.A00
            java.lang.String r1 = r14.A05
            X.7pg r8 = r2.A00(r1)
            r7 = 0
            if (r8 != 0) goto L_0x0b36
            java.lang.String r1 = "FdsIqResource/execute: can't find FdsManager from the job_id"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.2z6 r1 = X.C60752z6.A03
            r0.BSv(r1, r7)
            return
        L_0x05a1:
            boolean r1 = r15 instanceof X.AnonymousClass1jA
            if (r1 == 0) goto L_0x0656
            X.1jA r15 = (X.AnonymousClass1jA) r15
            r2 = 0
            java.lang.String r1 = "code"
            java.lang.Object r3 = r13.get(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            X.C162457s7.A0K(r3, r1)
            int r3 = X.AnonymousClass001.A0K(r3)
            java.lang.String r1 = "abprop_type"
            java.lang.String r6 = X.AnonymousClass0x2.A0d(r1, r13)
            java.lang.String r1 = "default_value"
            java.lang.Object r8 = r13.get(r1)
            int r7 = r6.hashCode()
            switch(r7) {
                case -891985903: goto L_0x05db;
                case 3271912: goto L_0x05df;
                case 64711720: goto L_0x05e2;
                case 97526364: goto L_0x05e5;
                case 1958052158: goto L_0x05e8;
                default: goto L_0x05cb;
            }
        L_0x05cb:
            r1 = 1
            X.3Z6[] r3 = new X.AnonymousClass3Z6[r1]
            java.lang.String r1 = "abprop_value"
            X.AnonymousClass3Z6.A09(r1, r8, r3, r2)
            java.util.Map r1 = X.C73813g7.A0G(r3)
            r0.BdH(r1)
            return
        L_0x05db:
            java.lang.String r1 = "string"
            goto L_0x05ea
        L_0x05df:
            java.lang.String r1 = "json"
            goto L_0x05ea
        L_0x05e2:
            java.lang.String r1 = "boolean"
            goto L_0x05ea
        L_0x05e5:
            java.lang.String r1 = "float"
            goto L_0x05ea
        L_0x05e8:
            java.lang.String r1 = "integer"
        L_0x05ea:
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x05cb
            X.1VX r4 = r15.A00
            android.content.SharedPreferences r5 = r4.A03
            java.lang.String r1 = java.lang.Integer.toString(r3)
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L_0x05cb
            switch(r7) {
                case -891985903: goto L_0x0603;
                case 3271912: goto L_0x0613;
                case 64711720: goto L_0x0622;
                case 97526364: goto L_0x062f;
                case 1958052158: goto L_0x0642;
                default: goto L_0x0601;
            }
        L_0x0601:
            r8 = 0
            goto L_0x05cb
        L_0x0603:
            java.lang.String r1 = "string"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0601
            X.2vE r1 = X.C58422vE.A02
            java.lang.String r8 = r4.A0R(r1, r3)
            goto L_0x05cb
        L_0x0613:
            java.lang.String r1 = "json"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0601
            X.2vE r1 = X.C58422vE.A02
            org.json.JSONObject r8 = r4.A0T(r1, r3)
            goto L_0x05cb
        L_0x0622:
            java.lang.String r1 = "boolean"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0601
            java.lang.Boolean r8 = X.C56952sp.A07(r4, r3)
            goto L_0x05cb
        L_0x062f:
            java.lang.String r1 = "float"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0601
            X.2vE r1 = X.C58422vE.A02
            float r1 = r4.A0M(r1, r3)
            java.lang.Float r8 = java.lang.Float.valueOf(r1)
            goto L_0x05cb
        L_0x0642:
            java.lang.String r1 = "integer"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0601
            X.2vE r1 = X.C58422vE.A02
            int r1 = r4.A0O(r1, r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            goto L_0x05cb
        L_0x0656:
            boolean r1 = r15 instanceof X.AnonymousClass1j9
            if (r1 == 0) goto L_0x06ef
            X.1j9 r15 = (X.AnonymousClass1j9) r15
            X.C18270x1.A12(r13, r0)
            X.21y r1 = X.C373621y.ERROR
            java.lang.String r1 = r1.key
            java.lang.Object r2 = r13.get(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C162457s7.A0K(r2, r1)
            java.util.Map r2 = (java.util.Map) r2
            r1 = 0
            X.C162457s7.A0J(r2, r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r2)
            java.util.Set r2 = r6.keySet()
            X.21y r3 = X.C373621y.ERROR_NAME
            java.lang.String r1 = r3.key
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x068d
            java.lang.String r2 = r3.key
            java.lang.String r1 = ""
            r6.put(r2, r1)
        L_0x068d:
            java.lang.String r1 = "error_map_type"
            java.lang.Object r2 = r13.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            r5 = 0
            if (r1 != 0) goto L_0x0699
            r2 = r5
        L_0x0699:
            X.21y r1 = X.C373621y.ERROR_CODE
            java.lang.String r1 = r1.key
            java.lang.Object r4 = r6.get(r1)
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x06ed
            java.lang.Integer r4 = (java.lang.Integer) r4
        L_0x06a7:
            if (r2 == 0) goto L_0x06c6
            if (r4 == 0) goto L_0x06c6
            java.util.Map r1 = r15.A00
            java.lang.Object r2 = r1.get(r2)
            X.2fL r2 = (X.C48712fL) r2
            if (r2 == 0) goto L_0x06c6
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = r2.A00(r1)
            if (r2 == 0) goto L_0x06c6
            X.21y r1 = X.C373621y.ERROR_MESSAGE
            java.lang.String r1 = r1.key
            r6.put(r1, r2)
        L_0x06c6:
            java.lang.String r1 = r3.key
            java.lang.Object r3 = r6.get(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.C162457s7.A0K(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            X.21y r1 = X.C373621y.ERROR_MESSAGE
            java.lang.String r1 = r1.key
            java.lang.Object r2 = r6.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x06eb
            java.lang.String r2 = (java.lang.String) r2
        L_0x06e2:
            X.2z6 r1 = new X.2z6
            r1.<init>(r4, r3, r2)
            r0.BSv(r1, r5)
            return
        L_0x06eb:
            r2 = r5
            goto L_0x06e2
        L_0x06ed:
            r4 = r5
            goto L_0x06a7
        L_0x06ef:
            boolean r1 = r15 instanceof X.AnonymousClass1jR
            if (r1 == 0) goto L_0x0731
            X.1jR r15 = (X.AnonymousClass1jR) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r1 = "payment_link"
            java.lang.Object r3 = r13.get(r1)
            boolean r1 = r3 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x072f
            java.lang.String r3 = (java.lang.String) r3
        L_0x0709:
            java.lang.String r1 = "success_url"
            java.lang.String r4 = X.AnonymousClass0x2.A0c(r1, r13)
            java.lang.String r1 = "cancel_url"
            java.lang.String r5 = X.AnonymousClass0x2.A0c(r1, r13)
            java.lang.String r1 = "referral"
            java.lang.String r6 = X.AnonymousClass0x2.A0c(r1, r13)
            if (r3 == 0) goto L_0x0bb7
            if (r4 == 0) goto L_0x0bb7
            X.2yd r1 = r15.A02
            java.lang.String r0 = r15.A01
            if (r0 != 0) goto L_0x0ba8
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x072f:
            r3 = r2
            goto L_0x0709
        L_0x0731:
            boolean r1 = r15 instanceof X.AnonymousClass1jQ
            if (r1 == 0) goto L_0x0763
            X.1jQ r15 = (X.AnonymousClass1jQ) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            r15.A00 = r0
            java.lang.String r1 = "account_compliance_status"
            java.lang.Object r4 = r13.get(r1)
            boolean r1 = r4 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x0761
            java.lang.String r4 = (java.lang.String) r4
        L_0x074a:
            java.lang.String r1 = "referral"
            java.lang.String r3 = X.AnonymousClass0x2.A0c(r1, r13)
            if (r4 == 0) goto L_0x0bd1
            X.2yd r1 = r15.A02
            java.lang.String r0 = r15.A01
            if (r0 != 0) goto L_0x0bc2
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0761:
            r4 = r2
            goto L_0x074a
        L_0x0763:
            boolean r1 = r15 instanceof X.AnonymousClass1jK
            if (r1 == 0) goto L_0x0799
            X.1jK r15 = (X.AnonymousClass1jK) r15
            X.C18270x1.A12(r13, r0)
            java.lang.String r2 = "phone_number"
            boolean r1 = r13.containsKey(r2)
            if (r1 != 0) goto L_0x0780
            r4 = 0
        L_0x0776:
            r3 = 1
        L_0x0777:
            r2 = 0
            if (r3 == 0) goto L_0x0bdc
            X.2z6 r1 = X.C60752z6.A03
            r0.BSv(r1, r2)
            return
        L_0x0780:
            java.lang.String r3 = X.AnonymousClass0x2.A0d(r2, r13)
            java.lang.String r1 = "[^\\d+]"
            X.5rB r2 = new X.5rB
            r2.<init>((java.lang.String) r1)
            java.lang.String r1 = ""
            java.lang.String r4 = r2.A00(r3, r1)
            int r1 = r4.length()
            r3 = 0
            if (r1 != 0) goto L_0x0777
            goto L_0x0776
        L_0x0799:
            boolean r1 = r15 instanceof X.AnonymousClass1jD
            if (r1 == 0) goto L_0x07b7
            X.1jD r15 = (X.AnonymousClass1jD) r15
            X.C18270x1.A12(r13, r0)
            java.lang.String r1 = "query"
            java.lang.Object r1 = r13.get(r1)
            if (r1 != 0) goto L_0x0bf7
            java.lang.String r1 = "No parameters"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r2 = 0
            X.2z6 r1 = X.C60752z6.A03
            r0.BSv(r1, r2)
            return
        L_0x07b7:
            boolean r1 = r15 instanceof X.AnonymousClass1jY
            if (r1 == 0) goto L_0x07e4
            X.1jY r15 = (X.AnonymousClass1jY) r15
            r2 = 0
            X.C18260x0.A0Z(r13, r14, r0, r2)
            java.util.List r1 = r15.A01
            r1.add(r0)
            X.7nZ r9 = r15.A07()
            java.lang.String r11 = r14.A04
            boolean r0 = r14.A08
            X.7O0 r10 = r14.A02
            if (r10 == 0) goto L_0x0c04
            int r15 = r14.A00
            r16 = 100
            java.lang.String r12 = r14.A05
            X.3d5 r14 = X.C72043d5.A00()
            r17 = r0
            r18 = r2
            r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x07e4:
            boolean r1 = r15 instanceof X.C29521ix
            if (r1 == 0) goto L_0x0825
            X.1ix r15 = (X.C29521ix) r15
            r5 = 0
            X.C18260x0.A0Z(r13, r14, r0, r5)
            int r4 = r14.A00
            java.lang.String r3 = r14.A05
            r15.A00 = r3
            java.lang.String r2 = r14.A04
            X.3Z6 r6 = X.AnonymousClass3Z6.A02(r3, r2)
            X.3Rm r1 = r15.A02
            r1.A00 = r6
            X.2nE r1 = r15.A01
            boolean r0 = r1.A01(r14, r0, r13, r6)
            if (r0 == 0) goto L_0x0073
            X.7nZ r7 = r15.A07()
            boolean r0 = r14.A08
            X.7O0 r8 = r14.A02
            X.C626936e.A06(r8)
            X.C162457s7.A0D(r8)
            r14 = 100
            X.3d5 r12 = X.C72043d5.A00()
            r9 = r2
            r10 = r3
            r11 = r13
            r13 = r4
            r15 = r0
            r16 = r5
            r7.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0825:
            X.1iy r15 = (X.C29531iy) r15
            r1 = 0
            X.C18260x0.A0Z(r13, r14, r0, r1)
            java.lang.String r12 = r14.A05
            r15.A00 = r12
            java.lang.String r11 = r14.A04
            X.3Z6 r2 = X.AnonymousClass3Z6.A02(r12, r11)
            X.3Rm r1 = r15.A02
            r1.A00 = r2
            X.2nE r1 = r15.A01
            boolean r0 = r1.A01(r14, r0, r13, r2)
            if (r0 == 0) goto L_0x0073
            java.util.Map r2 = r14.A07
            java.lang.String r0 = "bottom_sheet_max_height_percentage"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0885
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0885
            int r16 = r1.intValue()
        L_0x0855:
            java.lang.String r0 = "show_divider_under_nav_bar"
            java.lang.Object r1 = r2.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0882
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0882
            boolean r18 = r1.booleanValue()
        L_0x0868:
            X.7nZ r9 = r15.A07()
            boolean r0 = r14.A08
            X.7O0 r10 = r14.A02
            X.C626936e.A06(r10)
            X.C162457s7.A0D(r10)
            int r15 = r14.A00
            java.util.Map r14 = X.C29531iy.A00(r13)
            r17 = r0
            r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0882:
            r18 = 0
            goto L_0x0868
        L_0x0885:
            r16 = 100
            goto L_0x0855
        L_0x0888:
            boolean r0 = r8 instanceof X.C34361ux
            if (r0 == 0) goto L_0x08eb
            r4 = 0
            java.util.List r1 = r8.A00()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x08a3
            X.1jE r3 = r2.A01
            X.3d5 r1 = X.C72043d5.A00()
            X.4DK r0 = r2.A00
            r3.A07(r0, r1, r4)
            return
        L_0x08a3:
            boolean r0 = X.C18310x6.A1X(r1)
            if (r0 == 0) goto L_0x08e3
            java.lang.String r4 = X.AnonymousClass001.A0n(r1, r4)
            java.util.Map r3 = r8.A03
            java.lang.String r1 = "after"
            java.lang.Object r0 = r3.get(r1)
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x08d0
            java.lang.String r1 = X.AnonymousClass0x2.A0d(r1, r3)
            com.whatsapp.jid.UserJid r0 = r8.A01
            X.2l1 r5 = new X.2l1
            r5.<init>(r0, r4, r1)
            r0 = 4
            X.4Ho r4 = new X.4Ho
            r4.<init>(r8, r0, r2)
            X.2bQ r1 = r8.A00
            r0 = 40
            goto L_0x099b
        L_0x08d0:
            com.whatsapp.jid.UserJid r0 = r8.A01
            X.2jP r5 = new X.2jP
            r5.<init>(r0, r4)
            r0 = 5
            X.4Ho r4 = new X.4Ho
            r4.<init>(r8, r0, r2)
            X.2bQ r1 = r8.A00
            r0 = 36
            goto L_0x099b
        L_0x08e3:
            X.3d5 r0 = X.C72043d5.A00()
            r2.A00(r0)
            return
        L_0x08eb:
            boolean r0 = r8 instanceof X.C34351uw
            if (r0 == 0) goto L_0x0939
            r4 = 0
            java.util.List r3 = r8.A00()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0923
            java.util.Map r3 = r8.A02
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r0 = "prev_screen_name"
            java.lang.Object r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0917
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0917
            X.3d5 r0 = X.C72043d5.A00()
            r2.A00(r0)
            return
        L_0x0917:
            X.1jE r3 = r2.A01
            X.3d5 r1 = X.C72043d5.A00()
            X.4DK r0 = r2.A00
            r3.A07(r0, r1, r4)
            return
        L_0x0923:
            com.whatsapp.jid.UserJid r1 = r8.A01
            java.lang.String r0 = X.AnonymousClass001.A0n(r3, r4)
            X.2jR r5 = new X.2jR
            r5.<init>(r1, r0)
            r0 = 3
            X.4Ho r4 = new X.4Ho
            r4.<init>(r8, r0, r2)
            X.2bQ r1 = r8.A00
            r0 = 35
            goto L_0x099b
        L_0x0939:
            boolean r0 = r8 instanceof X.C34341uv
            if (r0 == 0) goto L_0x0970
            java.util.Map r3 = r8.A03
            java.lang.String r1 = "after"
            java.lang.Object r0 = r3.get(r1)
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x095e
            java.lang.String r1 = X.AnonymousClass0x2.A0d(r1, r3)
            com.whatsapp.jid.UserJid r0 = r8.A01
            X.2jS r5 = new X.2jS
            r5.<init>(r0, r1)
            X.4Ho r4 = new X.4Ho
            r4.<init>(r8, r6, r2)
            X.2bQ r1 = r8.A00
            r0 = 34
            goto L_0x099b
        L_0x095e:
            com.whatsapp.jid.UserJid r0 = r8.A01
            X.2ig r5 = new X.2ig
            r5.<init>(r0)
            r0 = 2
            X.4Ho r4 = new X.4Ho
            r4.<init>(r8, r0, r2)
            X.2bQ r1 = r8.A00
            r0 = 39
            goto L_0x099b
        L_0x0970:
            com.whatsapp.jid.UserJid r1 = r8.A01
            java.util.List r0 = r8.A00()
            java.util.Set r0 = X.C73723fy.A0P(r0)
            X.2jO r5 = new X.2jO
            r5.<init>(r1, r0)
            r0 = 0
            X.4Ho r4 = new X.4Ho
            r4.<init>(r8, r0, r2)
            X.2bQ r1 = r8.A00
            r0 = 38
            goto L_0x099b
        L_0x098a:
            com.whatsapp.jid.UserJid r0 = r8.A01
            X.2jQ r5 = new X.2jQ
            r5.<init>(r0, r1)
            r0 = 6
            X.4Ho r4 = new X.4Ho
            r4.<init>(r8, r0, r2)
            X.2bQ r1 = r8.A00
            r0 = 37
        L_0x099b:
            X.8Mj r3 = new X.8Mj
            r3.<init>(r1, r5, r4, r0)
            X.1VX r2 = r1.A04
            r1 = 3854(0xf0e, float:5.4E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x09b2
            r0 = 505(0x1f9, float:7.08E-43)
            r4.BSs(r5, r0)
            return
        L_0x09b2:
            r3.run()
            return
        L_0x09b6:
            X.3d5 r1 = X.C72043d5.A00()
            r15.A07(r0, r1, r9)
            return
        L_0x09be:
            java.lang.String r2 = "PaymentCardTokenizationNativeResource"
            java.lang.String r1 = "Invalid data input. Please make sure to provide the CEP, the full name and the CPF to this resource"
            java.lang.String r1 = X.C160757oG.A01(r2, r1)
            com.whatsapp.util.Log.e((java.lang.String) r1)
            java.lang.Integer r3 = X.AnonymousClass0x7.A0f()
            java.lang.String r2 = "ILLEGAL_ARGUMENTS"
            X.2z6 r1 = new X.2z6
            r1.<init>(r3, r2, r4)
            r0.BSv(r1, r4)
            return
        L_0x09d8:
            java.lang.String r0 = "PAY: FcsPaymentsDataEncryptionResource getProviderEncryptionKeyAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Rl r1 = r13.A01(r2, r14)
            X.3Re r0 = new X.3Re
            r0.<init>(r15, r4, r3)
            if (r1 != 0) goto L_0x09ec
            r8.A00(r0, r2)
            return
        L_0x09ec:
            r0.BZ4(r1)
            return
        L_0x09f0:
            r15.A01 = r0
            java.lang.String r8 = "full_name"
            java.lang.String r7 = X.C18310x6.A0o(r8, r13)
            java.lang.String r6 = "tax_id"
            java.lang.String r5 = X.C18310x6.A0o(r6, r13)
            java.lang.String r1 = "postal_code"
            java.lang.String r10 = X.C18310x6.A0o(r1, r13)
            if (r7 == 0) goto L_0x0a82
            if (r10 == 0) goto L_0x0a82
            if (r5 == 0) goto L_0x0a82
            java.lang.String r9 = r14.A05
            X.2oU r0 = r15.A04
            android.content.Context r2 = r0.A00
            java.lang.Class<com.whatsapp.payments.ui.BrazilPayBloksActivity> r0 = com.whatsapp.payments.ui.BrazilPayBloksActivity.class
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r2, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_user_address"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "p2m_context"
            X.AnonymousClass98s.A0a(r3, r1, r0)
            java.lang.String r13 = "#####-###"
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            r11 = 0
            r4 = 0
        L_0x0a36:
            int r0 = r13.length()
            if (r11 >= r0) goto L_0x0a5a
            int r0 = r10.length()
            if (r4 >= r0) goto L_0x0a5a
            char r1 = r13.charAt(r11)
            r0 = 45
            if (r1 != r0) goto L_0x0a50
            r12.append(r0)
        L_0x0a4d:
            int r11 = r11 + 1
            goto L_0x0a36
        L_0x0a50:
            char r0 = r10.charAt(r4)
            r12.append(r0)
            int r4 = r4 + 1
            goto L_0x0a4d
        L_0x0a5a:
            java.lang.String r1 = X.C18290x4.A0o(r12)
            java.lang.String r0 = "address_postal_code"
            X.AnonymousClass98s.A0a(r3, r0, r1)
            X.AnonymousClass98s.A0a(r3, r6, r5)
            X.AnonymousClass98s.A0a(r3, r8, r7)
            java.lang.String r0 = "fds_manager_id"
            X.AnonymousClass98s.A0a(r3, r0, r9)
            java.lang.String r1 = "fds_resource_id"
            java.lang.String r0 = "native_br_p2m_checkout_address"
            X.AnonymousClass98s.A0a(r3, r1, r0)
            java.lang.String r1 = r15.A02
            if (r1 != 0) goto L_0x0a9d
            java.lang.String r0 = "observerId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0a82:
            java.lang.String r1 = "FcsBRKycAddressCollectionResource/execute missing fullName, cpf or CEP input"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            java.lang.String r3 = "ILLEGAL_ARGUMENTS"
            java.lang.String r2 = "Invalid data input. Please make sure to provide the CEP, the full name and the CPF to this resource"
            X.2z6 r1 = new X.2z6
            r1.<init>(r4, r3, r2)
            r0.BSv(r1, r4)
            return
        L_0x0a94:
            java.lang.String r1 = "onLoadingFailure"
            java.lang.String r0 = ""
            r2.A01(r7, r1, r0, r4)
            return
        L_0x0a9d:
            java.lang.String r0 = "fds_observer_id"
            X.AnonymousClass98s.A0a(r3, r0, r1)
            r2.startActivity(r3)
            return
        L_0x0aa6:
            X.2or r2 = r2.A02(r1)
            X.3Wn r1 = new X.3Wn
            r1.<init>()
            r2.A01(r1)
            r0.BdH(r3)
            return
        L_0x0ab6:
            X.20M r1 = X.AnonymousClass20M.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x0b18 }
            int r2 = r1.ordinal()     // Catch:{ IllegalArgumentException -> 0x0b18 }
            r1 = 0
            if (r2 == r1) goto L_0x0ad8
            r1 = 1
            if (r2 != r1) goto L_0x0ad3
            X.5ZR r2 = r15.A02     // Catch:{ IllegalArgumentException -> 0x0b18 }
            java.lang.String r1 = "android.permission.SEND_SMS"
            int r1 = r2.A02(r1)     // Catch:{ IllegalArgumentException -> 0x0b18 }
            if (r1 != 0) goto L_0x0ae1
            boolean r1 = r2.A0F()     // Catch:{ IllegalArgumentException -> 0x0b18 }
            goto L_0x0ade
        L_0x0ad3:
            X.3f1 r1 = X.C73153f1.A00()     // Catch:{ IllegalArgumentException -> 0x0b18 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0b18 }
        L_0x0ad8:
            X.5ZR r1 = r15.A02     // Catch:{ IllegalArgumentException -> 0x0b18 }
            boolean r1 = r1.A0F()     // Catch:{ IllegalArgumentException -> 0x0b18 }
        L_0x0ade:
            if (r1 == 0) goto L_0x0ae1
            goto L_0x0ae4
        L_0x0ae1:
            X.20d r2 = X.C368920d.NOT_GRANTED     // Catch:{ IllegalArgumentException -> 0x0b18 }
            goto L_0x0ae6
        L_0x0ae4:
            X.20d r2 = X.C368920d.GRANTED     // Catch:{ IllegalArgumentException -> 0x0b18 }
        L_0x0ae6:
            X.20d r1 = X.C368920d.NOT_GRANTED     // Catch:{ IllegalArgumentException -> 0x0b18 }
            if (r2 != r1) goto L_0x0b0b
            X.2oU r1 = r15.A01     // Catch:{ IllegalArgumentException -> 0x0b18 }
            android.content.Context r8 = r1.A00     // Catch:{ IllegalArgumentException -> 0x0b18 }
            java.lang.String r7 = r14.A05     // Catch:{ IllegalArgumentException -> 0x0b18 }
            android.content.Intent r5 = X.C18320x8.A07()     // Catch:{ IllegalArgumentException -> 0x0b18 }
            java.lang.String r2 = r8.getPackageName()     // Catch:{ IllegalArgumentException -> 0x0b18 }
            java.lang.String r1 = "com.whatsapp.payments.phoenix.flowconfigurationservice.resource.permission.FcsRequestPermissionActivity"
            r5.setClassName(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0b18 }
            java.lang.String r1 = "extra_fds_manager_id"
            r5.putExtra(r1, r7)     // Catch:{ IllegalArgumentException -> 0x0b18 }
            java.lang.String r1 = "extra_permission"
            r5.putExtra(r1, r6)     // Catch:{ IllegalArgumentException -> 0x0b18 }
            X.C18280x3.A0n(r8, r5)     // Catch:{ IllegalArgumentException -> 0x0b18 }
            return
        L_0x0b0b:
            java.lang.String r2 = "permission_result"
            java.lang.String r1 = "GRANTED"
            java.util.Map r1 = X.C57692u3.A04(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0b18 }
            r0.BdH(r1)     // Catch:{ IllegalArgumentException -> 0x0b18 }
            return
        L_0x0b18:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "request_permission/execute: "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = " is not a valid permission to request"
            X.C18260x0.A1K(r2, r1)
            java.lang.String r2 = "permission string is not valid or supported"
            X.2z6 r1 = new X.2z6
            r1.<init>(r4, r3, r2)
            r0.BSv(r1, r4)
            return
        L_0x0b36:
            java.lang.String r1 = "config"
            java.lang.Object r6 = r13.get(r1)
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x0b9d
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0b9d
            X.20N[] r9 = X.AnonymousClass20N.values()
            int r4 = r9.length
            r3 = 0
        L_0x0b4a:
            if (r3 >= r4) goto L_0x0b92
            r5 = r9[r3]
            java.lang.String r2 = r5.name()
            java.lang.String r1 = "type"
            java.lang.String r1 = X.AnonymousClass0x2.A0c(r1, r13)
            if (r2 != 0) goto L_0x0b88
            if (r1 != 0) goto L_0x0b8f
        L_0x0b5d:
            java.lang.String r1 = "state"
            java.lang.String r4 = X.AnonymousClass0x2.A0c(r1, r13)
            java.lang.String r1 = "parameters"
            java.lang.Object r2 = r13.get(r1)
            boolean r1 = r2 instanceof java.util.Map
            if (r1 == 0) goto L_0x0b78
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0b78
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r2)
        L_0x0b78:
            X.2lm r3 = new X.2lm
            r3.<init>(r6, r4, r7)
            java.lang.String r2 = r3.A00
            X.3Ro r1 = new X.3Ro
            r1.<init>(r0, r8, r6)
            r8.A06(r1, r5, r3, r2)
            return
        L_0x0b88:
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0b8f
            goto L_0x0b5d
        L_0x0b8f:
            int r3 = r3 + 1
            goto L_0x0b4a
        L_0x0b92:
            java.lang.String r1 = "FdsIqResource/execute: type can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.2z6 r1 = X.C60752z6.A03
            r0.BSv(r1, r7)
            return
        L_0x0b9d:
            java.lang.String r1 = "FdsIqResource/execute: config can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.2z6 r1 = X.C60752z6.A03
            r0.BSv(r1, r7)
            return
        L_0x0ba8:
            X.2or r0 = r1.A02(r0)
            java.lang.String r2 = r14.A05
            X.3Ws r1 = new X.3Ws
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A01(r1)
            return
        L_0x0bb7:
            java.lang.String r1 = "NativeP2mLiteHppCheckoutResource/execute: paymentLink and successUrl can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.2z6 r1 = X.C60752z6.A03
            r0.BSv(r1, r2)
            return
        L_0x0bc2:
            X.2or r2 = r1.A02(r0)
            java.lang.String r1 = r14.A05
            X.3Wr r0 = new X.3Wr
            r0.<init>(r4, r1, r3)
            r2.A01(r0)
            return
        L_0x0bd1:
            java.lang.String r1 = "NativeP2mLiteDoComplianceResource/execute: inputComplianceStatus can't be null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.2z6 r1 = X.C60752z6.A03
            r0.BSv(r1, r2)
            return
        L_0x0bdc:
            java.lang.String r0 = "tel"
            android.net.Uri r2 = android.net.Uri.fromParts(r0, r4, r2)
            java.lang.String r0 = "android.intent.action.DIAL"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.setFlags(r0)
            X.2oU r0 = r15.A00
            android.content.Context r0 = r0.A00
            r0.startActivity(r1)
            return
        L_0x0bf7:
            X.4FS r3 = r15.A02
            r2 = 31
            X.3aM r1 = new X.3aM
            r1.<init>(r13, r15, r0, r2)
            r3.BkP(r1)
            return
        L_0x0c04:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55212pz.A06(X.2nw, X.4DK, X.2z6, java.util.Map):void");
    }
}
