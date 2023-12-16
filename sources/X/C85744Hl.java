package X;

/* renamed from: X.4Hl  reason: invalid class name and case insensitive filesystem */
public class C85744Hl implements C84114Bb {
    public Object A00;
    public final int A01;

    public C85744Hl(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x042c, code lost:
        X.C18270x1.A0p(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x042f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r2.A09(java.lang.Integer.valueOf(r0), "renderScreen");
        r4.set(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015c, code lost:
        r4.A04.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0161, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0194, code lost:
        r0.A07(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0197, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BSV(java.lang.Object r19) {
        /*
            r18 = this;
            r2 = r19
            r1 = r18
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x032c;
                case 1: goto L_0x0047;
                case 2: goto L_0x0078;
                case 3: goto L_0x0334;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00ce;
                case 6: goto L_0x01ba;
                case 7: goto L_0x033c;
                case 8: goto L_0x0218;
                case 9: goto L_0x02c7;
                case 10: goto L_0x03fa;
                case 11: goto L_0x02fd;
                case 12: goto L_0x0417;
                case 13: goto L_0x0426;
                case 14: goto L_0x0311;
                case 15: goto L_0x0430;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r1.A00
            X.0eF r1 = (X.C08310eF) r1
            X.3Wt r2 = (X.C69373Wt) r2
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            X.03q r5 = r1.A0Q()
            if (r5 == 0) goto L_0x0046
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x0046
            X.0zH r4 = X.AnonymousClass5V0.A00(r5)
            java.lang.String r0 = r2.A00
            r4.A0g(r0)
            java.lang.String r3 = r2.A02
            r1 = 203(0xcb, float:2.84E-43)
            X.4K2 r0 = new X.4K2
            r0.<init>(r2, r1)
            r4.A0f(r5, r0, r3)
            java.lang.String r3 = r2.A01
            r1 = 204(0xcc, float:2.86E-43)
            X.4K2 r0 = new X.4K2
            r0.<init>(r2, r1)
            r4.A0e(r5, r0, r3)
            r4.create()
            r4.A0S()
        L_0x0046:
            return
        L_0x0047:
            java.lang.Object r3 = r1.A00
            X.30j r3 = (X.C613530j) r3
            X.3Wv r2 = (X.C69393Wv) r2
            r5 = 1
            X.C162457s7.A0J(r2, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.A0V
            boolean r0 = r4.get()
            if (r0 != 0) goto L_0x0046
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "open_bloks_screen_graphql"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "open_bloks_screen"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0046
        L_0x006d:
            X.21K r1 = r2.A00
            X.21K r0 = X.AnonymousClass21K.ON_START
            if (r1 != r0) goto L_0x0046
            X.1Ua r2 = r3.A0P
            int r0 = r3.A00
            goto L_0x00a8
        L_0x0078:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines) r3
            X.3Wv r2 = (X.C69393Wv) r2
            r5 = 1
            X.C162457s7.A0J(r2, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.A0T
            boolean r0 = r4.get()
            if (r0 != 0) goto L_0x0046
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "open_bloks_screen_graphql"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "open_bloks_screen"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0046
        L_0x009e:
            X.21K r1 = r2.A00
            X.21K r0 = X.AnonymousClass21K.ON_START
            if (r1 != r0) goto L_0x0046
            X.1Ua r2 = r3.A0O
            int r0 = r3.A00
        L_0x00a8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "renderScreen"
            r2.A09(r1, r0)
            r4.set(r5)
            return
        L_0x00b6:
            java.lang.Object r2 = r1.A00
            com.whatsapp.extensions.phoenix.PhoenixExtensionsBottomSheetActivity r2 = (com.whatsapp.extensions.phoenix.PhoenixExtensionsBottomSheetActivity) r2
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r0 = "extra_error_message"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0046
        L_0x00ca:
            r2.finish()
            return
        L_0x00ce:
            java.lang.Object r4 = r1.A00
            X.2nE r4 = (X.C53522nE) r4
            X.3Wu r2 = (X.C69383Wu) r2
            java.lang.String r6 = r2.A00
            X.C162457s7.A0C(r6)
            java.util.Map r5 = r2.A02
            java.lang.String r0 = r2.A01
            X.C162457s7.A0C(r0)
            int r3 = java.lang.Integer.parseInt(r0)
            int r0 = r6.hashCode()
            java.lang.String r1 = "prefetchResponse"
            switch(r0) {
                case -2060681962: goto L_0x00ef;
                case -1448417750: goto L_0x00fa;
                case -330036277: goto L_0x011c;
                case -226946541: goto L_0x012e;
                case -20769540: goto L_0x0139;
                case 427609089: goto L_0x0151;
                case 450559314: goto L_0x0162;
                case 499865650: goto L_0x0198;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            return
        L_0x00ef:
            java.lang.String r0 = "CACHE_HIT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "bloksCacheHit"
            goto L_0x015c
        L_0x00fa:
            java.lang.String r0 = "PREFETCH_REQUEST_START"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.1j1 r2 = r4.A03
            java.lang.String r0 = "prefetchPerfTracker"
            r2.A01(r3, r0)
            java.lang.String r0 = "start"
            r2.A00(r3, r0)
            java.lang.String r0 = "EVENT_PARAM_APP_ID"
            java.lang.String r1 = X.C18290x4.A0p(r0, r5)
            java.lang.String r0 = "app_id"
            r2.A03(r3, r0, r1)
            return
        L_0x011c:
            java.lang.String r0 = "PREFETCH_REQUEST_SUCCESS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.1j1 r0 = r4.A03
            r0.A00(r3, r1)
            r1 = 467(0x1d3, float:6.54E-43)
            X.316 r0 = r0.A03
            goto L_0x0194
        L_0x012e:
            java.lang.String r0 = "REQUEST_SUCCESS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "bloksPayloadResponse"
            goto L_0x015c
        L_0x0139:
            java.lang.String r0 = "DROP_QPL_LOGGING_MARKER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.1j1 r2 = r4.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x0046
            X.8vZ r1 = r2.A04
            int r0 = r2.A00
            r1.markerDrop(r0, r3)
            return
        L_0x0151:
            java.lang.String r0 = "OPEN_SCREEN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "openScreen"
        L_0x015c:
            X.1j2 r0 = r4.A04
            r0.A00(r3, r1)
            return
        L_0x0162:
            java.lang.String r0 = "PREFETCH_REQUEST_FAILURE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.1j1 r2 = r4.A03
            r2.A00(r3, r1)
            java.lang.String r1 = "EVENT_PARAM_ERROR_CODE"
            java.lang.Object r0 = r5.get(r1)
            if (r0 == 0) goto L_0x0180
            java.lang.String r1 = X.C18290x4.A0p(r1, r5)
            java.lang.String r0 = "error_code"
            r2.A03(r3, r0, r1)
        L_0x0180:
            java.lang.String r1 = "EVENT_PARAM_ERROR_MESSAGE"
            java.lang.Object r0 = r5.get(r1)
            if (r0 == 0) goto L_0x0191
            java.lang.String r1 = X.C18290x4.A0p(r1, r5)
            java.lang.String r0 = "error_message"
            r2.A03(r3, r0, r1)
        L_0x0191:
            r1 = 3
            X.316 r0 = r2.A03
        L_0x0194:
            r0.A07(r3, r1)
            return
        L_0x0198:
            java.lang.String r0 = "PAYLOAD_SIZE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "EVENT_PARAM_UNCOMPRESSED_SIZE"
            java.lang.String r0 = X.C18310x6.A0o(r0, r5)
            if (r0 == 0) goto L_0x0046
            long r5 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r1 = "blok_payload_size"
            if (r0 == 0) goto L_0x0046
            X.1j2 r0 = r4.A04
            r0.A02(r3, r1, r5)
            return
        L_0x01ba:
            java.lang.Object r4 = r1.A00
            X.2Ok r4 = (X.C42502Ok) r4
            X.3Wv r2 = (X.C69393Wv) r2
            boolean r3 = X.C18290x4.A1W(r2)
            java.lang.String r1 = "native_flow_npci_common_library"
            java.lang.String r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            X.21K r0 = r2.A00
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0046
            r0 = 3
            if (r1 == r0) goto L_0x01ff
            r0 = 4
            if (r1 != r0) goto L_0x0046
            X.2eT r3 = r4.A00
            java.lang.String r1 = r2.A03
            X.2z6 r2 = r2.A01
            java.lang.String r0 = "send_fds_iq"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0046
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r1 = r3.A00
            r1.BjL()
            if (r2 == 0) goto L_0x0046
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x0046
            int r0 = r0.intValue()
            r1.A7m(r0)
            return
        L_0x01ff:
            X.2eT r3 = r4.A00
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "send_fds_iq"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0046
            com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = r3.A00
            r0.BjL()
            r0.A7H()
            r0.finish()
            return
        L_0x0218:
            java.lang.Object r5 = r1.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r5 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r5
            X.3Wr r2 = (X.C69353Wr) r2
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            java.lang.String r3 = r2.A01
            java.lang.String r10 = r2.A02
            X.1n7 r7 = X.AnonymousClass1Ha.A1o(r5)
            java.lang.String r2 = r2.A00
            int r1 = r2.hashCode()
            r0 = 35394935(0x21c1577, float:1.146723E-37)
            if (r1 == r0) goto L_0x025b
            r0 = 312640649(0x12a28489, float:1.025631E-27)
            if (r1 == r0) goto L_0x024e
            r0 = 696544716(0x29846dcc, float:5.881024E-14)
            if (r1 != r0) goto L_0x0046
            java.lang.String r0 = "BLOCKED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "order_details"
            r5.A78(r7, r0)
            return
        L_0x024e:
            java.lang.String r0 = "DOB_CHALLENGED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            r5.A77(r0, r7, r3, r10)
            return
        L_0x025b:
            java.lang.String r0 = "PENDING"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0046
            r11 = 0
            r8 = 0
            java.lang.String r9 = "enter_name"
            X.303 r6 = X.C57062t0.A00()
            r5.A76(r6, r7, r8, r9, r10, r11)
            r4 = 0
            if (r7 == 0) goto L_0x0281
            X.39W r0 = r7.A00
            if (r0 == 0) goto L_0x0281
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x0281
            int r0 = r0.A02()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x0281:
            java.lang.String r2 = X.C57062t0.A01(r8)
            if (r7 == 0) goto L_0x0293
            X.39W r0 = r7.A00
            if (r0 == 0) goto L_0x0293
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x0293
            java.lang.String r4 = r0.A04()
        L_0x0293:
            com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment r12 = new com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment
            r12.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "extra_payment_config_id"
            r1.putString(r0, r4)
            java.lang.String r0 = "extra_order_type"
            r1.putString(r0, r2)
            r12.A0u(r1)
            com.whatsapp.payments.ui.PaymentBottomSheet r14 = com.whatsapp.payments.ui.PaymentBottomSheet.A00()
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r14)
            r5.A0T = r0
            X.3Rq r11 = new X.3Rq
            r13 = r5
            r15 = r7
            r16 = r10
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r12.A0A = r11
            r14.A1c(r12)
            r5.Boo(r14)
            return
        L_0x02c7:
            java.lang.Object r4 = r1.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r4 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r4
            X.3Wv r2 = (X.C69393Wv) r2
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "send_fds_iq"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            java.lang.ref.WeakReference r0 = r4.A0T
            if (r0 == 0) goto L_0x02fb
            java.lang.Object r3 = r0.get()
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
        L_0x02e6:
            X.21K r1 = r2.A00
            X.21K r0 = X.AnonymousClass21K.ON_START
            if (r1 != r0) goto L_0x043f
            if (r3 == 0) goto L_0x02f4
            boolean r0 = r3.A19()
            if (r0 != 0) goto L_0x0046
        L_0x02f4:
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r4.Bp9(r0)
            return
        L_0x02fb:
            r3 = 0
            goto L_0x02e6
        L_0x02fd:
            java.lang.Object r1 = r1.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r1 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r1
            X.9e8 r2 = (X.C197949e8) r2
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            com.whatsapp.WaTextView r1 = r1.A08
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            return
        L_0x0311:
            java.lang.Object r4 = r1.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r4 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r4
            X.3Wq r2 = (X.C69343Wq) r2
            boolean r3 = X.C18290x4.A1W(r2)
            com.whatsapp.WaTextView r1 = r4.A09
            if (r1 == 0) goto L_0x0324
            java.lang.String r0 = r2.A00
            r1.setText(r0)
        L_0x0324:
            android.view.ViewGroup r0 = r4.A01
            if (r0 == 0) goto L_0x0046
            r0.setVisibility(r3)
            return
        L_0x032c:
            java.lang.Object r0 = r1.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x0334:
            java.lang.Object r1 = r1.A00
            com.whatsapp.extensions.phoenix.PhoenixExtensionsBottomSheetActivity r1 = (com.whatsapp.extensions.phoenix.PhoenixExtensionsBottomSheetActivity) r1
            r0 = 1
            r1.A02 = r0
            return
        L_0x033c:
            java.lang.Object r9 = r1.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r9 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r9
            X.3Ws r2 = (X.C69363Ws) r2
            boolean r15 = X.C18290x4.A1W(r2)
            java.lang.ref.WeakReference r0 = r9.A0T
            if (r0 == 0) goto L_0x0355
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            if (r0 == 0) goto L_0x0355
            r0.A1K()
        L_0x0355:
            X.1n7 r11 = X.AnonymousClass1Ha.A1o(r9)
            r12 = 0
            java.lang.String r13 = "in_app_browser_checkout"
            java.lang.String r14 = r2.A03
            X.303 r10 = X.C57062t0.A00()
            r9.A76(r10, r11, r12, r13, r14, r15)
            r1 = 0
            java.lang.String r7 = r2.A01
            java.lang.String r8 = r2.A02
            java.lang.String r6 = r2.A04
            java.lang.String r5 = r2.A00
            r2 = 0
            if (r11 == 0) goto L_0x0381
            X.39W r0 = r11.A00
            if (r0 == 0) goto L_0x0381
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x0381
            int r0 = r0.A02()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0381:
            java.lang.String r3 = X.C57062t0.A01(r1)
            if (r11 == 0) goto L_0x0393
            X.39W r0 = r11.A00
            if (r0 == 0) goto L_0x0393
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x0393
            java.lang.String r2 = r0.A04()
        L_0x0393:
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r4 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.P2mLiteWebViewActivity"
            r1.setClassName(r4, r0)
            X.C626936e.A06(r8)
            java.lang.String r0 = "webview_url"
            r1.putExtra(r0, r8)
            java.lang.String r0 = "webview_javascript_enabled"
            r4 = 1
            r1.putExtra(r0, r4)
            java.lang.String r0 = "extra_fds_manager_id"
            r1.putExtra(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x03c1
            java.lang.String r0 = "webview_callback"
            r1.putExtra(r0, r6)
        L_0x03c1:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x03cd
            java.lang.String r0 = "webview_cancel_callback"
            r1.putExtra(r0, r5)
        L_0x03cd:
            java.lang.String r0 = "webview_hide_url"
            r1.putExtra(r0, r15)
            java.lang.String r0 = "webview_open_new_tab_in_external_browser"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "webview_title_show_domain_only"
            r1.putExtra(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x03eb
            java.lang.String r0 = "referral_screen"
            r1.putExtra(r0, r14)
        L_0x03eb:
            java.lang.String r0 = "order_type"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "config_id"
            r1.putExtra(r0, r2)
            r9.startActivity(r1)
            return
        L_0x03fa:
            java.lang.Object r4 = r1.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r4 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r4
            X.9eD r2 = (X.C197999eD) r2
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            java.lang.String r3 = r2.A01
            java.lang.String r1 = r2.A00
            X.C162457s7.A0C(r1)
            java.lang.String r0 = r2.A02
            r4.A0K = r3
            r4.A0J = r1
            r4.A0M = r0
            r4.A1Y()
            return
        L_0x0417:
            java.lang.Object r2 = r1.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r2 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r2
            r1 = 0
            android.widget.FrameLayout r0 = r2.A02
            if (r0 == 0) goto L_0x0423
            r0.setVisibility(r1)
        L_0x0423:
            android.view.ViewGroup r0 = r2.A01
            goto L_0x042c
        L_0x0426:
            java.lang.Object r0 = r1.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r0 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r0
            android.widget.FrameLayout r0 = r0.A02
        L_0x042c:
            X.C18270x1.A0p(r0)
            return
        L_0x0430:
            java.lang.Object r1 = r1.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r1 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r1
            X.3Wp r2 = (X.C69333Wp) r2
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            boolean r0 = r2.A00
            r1.A0P = r0
            return
        L_0x043f:
            if (r3 == 0) goto L_0x0444
            r3.A1K()
        L_0x0444:
            r4.BjL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85744Hl.BSV(java.lang.Object):void");
    }
}
