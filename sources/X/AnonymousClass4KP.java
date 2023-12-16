package X;

/* renamed from: X.4KP  reason: invalid class name */
public class AnonymousClass4KP implements C15530rW {
    public Object A00;
    public final int A01;

    public AnonymousClass4KP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0303, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0306, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0336, code lost:
        if (r4.A00 != -1) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x020e, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0211, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BM2(java.lang.Object r21) {
        /*
            r20 = this;
            r4 = r21
            r1 = r20
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x009e;
                case 2: goto L_0x00ff;
                case 3: goto L_0x0127;
                case 4: goto L_0x01b1;
                case 5: goto L_0x021a;
                case 6: goto L_0x0233;
                case 7: goto L_0x028f;
                case 8: goto L_0x02c7;
                case 9: goto L_0x030f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r6 = r1.A00
            com.whatsapp.webview.ui.WaInAppBrowsingActivity r6 = (com.whatsapp.webview.ui.WaInAppBrowsingActivity) r6
            X.0Zg r4 = (X.C06800Zg) r4
            android.webkit.ValueCallback r0 = r6.A01
            r5 = 0
            if (r0 == 0) goto L_0x028c
            android.content.Intent r3 = r4.A01
            int r1 = r4.A00
            r0 = -1
            if (r1 != r0) goto L_0x0286
            if (r3 == 0) goto L_0x0286
            java.lang.String r1 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r3.getParcelableArrayListExtra(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0035
            java.util.ArrayList r1 = r3.getParcelableArrayListExtra(r1)
            android.net.Uri[] r0 = new android.net.Uri[r2]
            java.lang.Object[] r8 = r1.toArray(r0)
            android.net.Uri[] r8 = (android.net.Uri[]) r8
            if (r8 == 0) goto L_0x0287
            goto L_0x0044
        L_0x0035:
            android.net.Uri r0 = r3.getData()
            if (r0 == 0) goto L_0x0286
            r0 = 1
            android.net.Uri[] r8 = new android.net.Uri[r0]
            android.net.Uri r0 = r3.getData()
            r8[r2] = r0
        L_0x0044:
            int r7 = r8.length     // Catch:{ Exception -> 0x027c }
            r4 = 0
        L_0x0046:
            if (r4 >= r7) goto L_0x0287
            r3 = r8[r4]     // Catch:{ Exception -> 0x027c }
            if (r3 == 0) goto L_0x0069
            X.306 r2 = r6.A07     // Catch:{ Exception -> 0x027c }
            X.33i r0 = r6.A08     // Catch:{ Exception -> 0x027c }
            X.5UR r1 = r0.A0R()     // Catch:{ Exception -> 0x027c }
            r2.A01(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r0 = r1.A05(r3, r0)     // Catch:{ Exception -> 0x027c }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x027c }
            r2.A02(r0)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0069
            r0.close()     // Catch:{ Exception -> 0x027c }
        L_0x0069:
            int r4 = r4 + 1
            goto L_0x0046
        L_0x006c:
            r1 = move-exception
            if (r0 == 0) goto L_0x0077
            r0.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x027c }
        L_0x0077:
            throw r1     // Catch:{ Exception -> 0x027c }
        L_0x0078:
            java.lang.Object r3 = r1.A00
            X.07r r3 = (X.C009707r) r3
            X.0Zg r4 = (X.C06800Zg) r4
            boolean r2 = X.C18290x4.A1W(r4)
            int r1 = r4.A00
            r0 = -1
            if (r1 != r0) goto L_0x028e
            android.content.Intent r1 = r4.A01
            if (r1 == 0) goto L_0x028e
            java.lang.String r0 = "extra_rate_limited"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x028e
            r0 = 2131431813(0x7f0b1185, float:1.8485366E38)
            android.view.View r0 = r3.findViewById(r0)
            r0.setEnabled(r2)
            return
        L_0x009e:
            java.lang.Object r3 = r1.A00
            com.whatsapp.events.EventCreationFragment r3 = (com.whatsapp.events.EventCreationFragment) r3
            X.0Zg r4 = (X.C06800Zg) r4
            int r1 = r4.A00
            r0 = -1
            if (r1 != r0) goto L_0x028e
            android.content.Intent r0 = r4.A01
            if (r0 == 0) goto L_0x028e
            android.os.Bundle r2 = r0.getExtras()
            if (r2 == 0) goto L_0x028e
            X.66R r0 = r3.A0T
            java.lang.Object r1 = r0.getValue()
            X.11J r1 = (X.AnonymousClass11J) r1
            java.lang.String r0 = "locations_string"
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r0 = "latitude"
            double r13 = r2.getDouble(r0)
            java.lang.String r0 = "longitude"
            double r15 = r2.getDouble(r0)
            java.lang.String r0 = "vicinity"
            java.lang.String r6 = r2.getString(r0)
            java.lang.String r0 = "address"
            java.lang.String r10 = r2.getString(r0)
            r7 = 0
            r17 = 0
            r19 = 0
            com.whatsapp.location.PlaceInfo r4 = new com.whatsapp.location.PlaceInfo
            r9 = r7
            r11 = r7
            r12 = r7
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19)
            X.4Gp r3 = r1.A0B
        L_0x00ea:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.2yl r0 = (X.C60562yl) r0
            X.20W r1 = r0.A00
            X.2yl r0 = new X.2yl
            r0.<init>(r1, r4)
            boolean r0 = r3.AzD(r2, r0)
            if (r0 == 0) goto L_0x00ea
            return
        L_0x00ff:
            java.lang.Object r3 = r1.A00
            X.2dW r3 = (X.C47602dW) r3
            X.0Zg r4 = (X.C06800Zg) r4
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            int r1 = r4.A00
            r0 = -1
            if (r1 != r0) goto L_0x028e
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            android.content.Intent r1 = r4.A01
            if (r1 == 0) goto L_0x0124
            java.lang.String r0 = "contacts"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x0124
        L_0x011c:
            java.util.List r0 = X.C627336j.A0B(r2, r0)
            r3.A00(r0)
            return
        L_0x0124:
            X.3d3 r0 = X.C72023d3.A00
            goto L_0x011c
        L_0x0127:
            java.lang.Object r3 = r1.A00
            X.2SJ r3 = (X.AnonymousClass2SJ) r3
            X.0Zg r4 = (X.C06800Zg) r4
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            int r0 = r4.A00
            r2 = -1
            if (r0 != r2) goto L_0x028e
            android.content.Intent r4 = r4.A01
            if (r4 == 0) goto L_0x01a7
            X.34R r1 = X.C27991fJ.A01
            java.lang.String r0 = "group_jid"
            java.lang.String r0 = r4.getStringExtra(r0)
            X.1fJ r6 = X.AnonymousClass34R.A05(r0)
            java.lang.String r0 = "parent_group_jid_to_link"
            java.lang.String r0 = r4.getStringExtra(r0)
            X.1fJ r7 = r1.A07(r0)
            java.lang.String r0 = "entry_point"
            int r2 = r4.getIntExtra(r0, r2)
            java.lang.String r5 = "new_group_result_bundle"
            android.os.Bundle r4 = r4.getBundleExtra(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CreateGroupResultHandler/group created "
            X.C18260x0.A1R(r1, r0, r6)
            X.2ss r0 = r3.A05
            boolean r0 = r0.A0L(r6)
            if (r0 == 0) goto L_0x028e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CreateGroupResultHandler/opening conversation"
            X.C18260x0.A1R(r1, r0, r6)
            if (r7 == 0) goto L_0x019a
            r0 = 10
            if (r2 == r0) goto L_0x019a
            X.36r r0 = new X.36r
            r0.<init>()
            android.content.Context r2 = r3.A02
            r0 = 0
            android.content.Intent r1 = X.C627336j.A01(r2, r6, r0)
        L_0x018a:
            X.C162457s7.A0H(r1)
            if (r4 == 0) goto L_0x0192
            r1.putExtra(r5, r4)
        L_0x0192:
            X.5hX r0 = r3.A04
            r0.A0B(r2, r1)
        L_0x0197:
            android.app.Activity r0 = r3.A01
            goto L_0x020e
        L_0x019a:
            X.36r r1 = new X.36r
            r1.<init>()
            android.content.Context r2 = r3.A02
            r0 = 0
            android.content.Intent r1 = r1.A1O(r2, r6, r0)
            goto L_0x018a
        L_0x01a7:
            android.content.Context r1 = r3.A02
            android.content.Intent r0 = X.C627736r.A02(r1)
            r1.startActivity(r0)
            goto L_0x0197
        L_0x01b1:
            java.lang.Object r3 = r1.A00
            X.2Th r3 = (X.C43742Th) r3
            X.0Zg r4 = (X.C06800Zg) r4
            java.lang.StringBuilder r2 = X.C18270x1.A0X(r4)
            java.lang.String r0 = "SuggestGroupResultHandler/onResult/result code:"
            r2.append(r0)
            int r1 = r4.A00
            X.C18260x0.A1F(r2, r1)
            r0 = -1
            if (r1 != r0) goto L_0x0212
            android.content.Intent r1 = r4.A01
            if (r1 == 0) goto L_0x0203
            java.lang.String r0 = "group_suggested"
            android.os.Bundle r2 = r1.getBundleExtra(r0)
            if (r2 == 0) goto L_0x028e
            java.lang.String r0 = "extra_group_name"
            java.lang.String r5 = r2.getString(r0)
            X.34R r1 = X.C27991fJ.A01
            java.lang.String r0 = "extra_parent_group_jid"
            java.lang.String r0 = r2.getString(r0)
            X.1fJ r4 = r1.A07(r0)
            if (r4 == 0) goto L_0x01fd
            if (r5 == 0) goto L_0x01fd
            java.lang.String r0 = "extra_group_description"
            java.lang.String r6 = r2.getString(r0)
            X.4C6 r1 = r3.A09
            r7 = 0
            com.whatsapp.group.SuggestGroupResultHandler$onResult$1$1$1 r2 = new com.whatsapp.group.SuggestGroupResultHandler$onResult$1$1$1
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.C616131n.A02(r7, r2, r1, r7, r0)
            return
        L_0x01fd:
            java.lang.String r0 = "SuggestGroupResultHandler/onResult/unexpected parent group or subject null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0203:
            android.content.Context r1 = r3.A02
            android.content.Intent r0 = X.C627736r.A02(r1)
            r1.startActivity(r0)
            android.app.Activity r0 = r3.A01
        L_0x020e:
            r0.finish()
            return
        L_0x0212:
            if (r1 != 0) goto L_0x028e
            java.lang.String r0 = "SuggestGroupResultHandler/Suggest group result canceled!"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x021a:
            java.lang.Object r2 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r2 = (com.whatsapp.group.newgroup.NewGroup) r2
            X.0Zg r4 = (X.C06800Zg) r4
            int r1 = r4.A00
            r0 = -1
            if (r1 != r0) goto L_0x028e
            android.content.Intent r1 = r4.A01
            java.lang.String r0 = "setting_values"
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            if (r0 == 0) goto L_0x028e
            r2.A04 = r0
            return
        L_0x0233:
            java.lang.Object r2 = r1.A00
            X.1gh r2 = (X.C28341gh) r2
            X.0Zg r4 = (X.C06800Zg) r4
            int r1 = r4.A00
            if (r1 != 0) goto L_0x0244
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r1 = r2.A09
            r0 = 1
            r1.A0J(r0)
            return
        L_0x0244:
            r0 = -1
            if (r1 != r0) goto L_0x0250
            android.content.Intent r1 = r4.A01
            if (r1 != 0) goto L_0x026d
            java.lang.String r0 = "fpm/P2pTransferActivity/qr code scanner result is null but result code is ok"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0250:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r1 = r2.A09
            r6 = 2131887716(0x7f120664, float:1.9410047E38)
            r5 = 2131887717(0x7f120665, float:1.9410049E38)
            r7 = 2131894489(0x7f1220d9, float:1.9423784E38)
            r8 = 0
            r0 = 4
            X.4Hd r4 = new X.4Hd
            r4.<init>(r1, r0)
            r10 = 1
            X.2T5 r3 = new X.2T5
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.A7A(r3)
            return
        L_0x026d:
            java.lang.String r0 = "qr_code_key"
            java.lang.String r1 = r1.getStringExtra(r0)
            if (r1 == 0) goto L_0x028e
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r2.A09
            r0.A0M(r1)
            return
        L_0x027c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WaInappBrowsingActivity/areFileUrisExternal: Internal file provided for image upload in web view"
            X.C18260x0.A1Q(r1, r0, r2)
        L_0x0286:
            r8 = r5
        L_0x0287:
            android.webkit.ValueCallback r0 = r6.A01
            r0.onReceiveValue(r8)
        L_0x028c:
            r6.A01 = r5
        L_0x028e:
            return
        L_0x028f:
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity r3 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity) r3
            X.2Wj r1 = r3.A02
            if (r1 == 0) goto L_0x02bf
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x02a2
            java.lang.String r0 = "fdsManagerId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02a2:
            X.7pg r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0303
            X.7lA r1 = r0.A00
            if (r1 == 0) goto L_0x0303
            java.lang.String r0 = "native_upi_add_payment_method"
            X.48Q r1 = r1.A00(r0)
            X.4G9 r1 = (X.AnonymousClass4G9) r1
            if (r1 == 0) goto L_0x0303
            X.3d5 r0 = X.C72043d5.A00()
            r1.B3J(r0)
            goto L_0x0303
        L_0x02bf:
            java.lang.String r0 = "phoenixManagerRegistry"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02c7:
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity r3 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity) r3
            X.99l r0 = r3.A0I
            boolean r0 = r0.A0C()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "onboarding_success"
            java.util.Map r2 = X.C57692u3.A04(r0, r1)
            X.2Wj r1 = r3.A02
            if (r1 == 0) goto L_0x0307
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x02eb
            java.lang.String r0 = "fdsManagerId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02eb:
            X.7pg r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0303
            X.7lA r1 = r0.A00
            if (r1 == 0) goto L_0x0303
            java.lang.String r0 = "native_upi_consumer_onboarding"
            X.48Q r0 = r1.A00(r0)
            X.4G9 r0 = (X.AnonymousClass4G9) r0
            if (r0 == 0) goto L_0x0303
            r0.B3J(r2)
        L_0x0303:
            r3.finish()
            return
        L_0x0307:
            java.lang.String r0 = "phoenixManagerRegistry"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x030f:
            java.lang.Object r5 = r1.A00
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsResetPinActivity r5 = (com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsResetPinActivity) r5
            X.0Zg r4 = (X.C06800Zg) r4
            X.2Wj r1 = r5.A02
            if (r1 == 0) goto L_0x0356
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x034f
            X.7pg r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x034d
            X.7lA r1 = r0.A00
            if (r1 == 0) goto L_0x034d
            java.lang.String r0 = "native_upi_reset_pin"
            X.48Q r3 = r1.A00(r0)
            X.4G9 r3 = (X.AnonymousClass4G9) r3
        L_0x0330:
            if (r4 == 0) goto L_0x0338
            int r2 = r4.A00
            r1 = -1
            r0 = 1
            if (r2 == r1) goto L_0x0339
        L_0x0338:
            r0 = 0
        L_0x0339:
            java.lang.String r1 = "was_pin_set"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.util.Map r0 = X.C57692u3.A04(r1, r0)
            if (r3 == 0) goto L_0x0349
            r3.B3J(r0)
        L_0x0349:
            r5.finish()
            return
        L_0x034d:
            r3 = 0
            goto L_0x0330
        L_0x034f:
            java.lang.String r0 = "fdsManagerId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0356:
            java.lang.String r0 = "phoenixManagerRegistry"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KP.BM2(java.lang.Object):void");
    }
}
