package com.whatsapp.extensions.bloks.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass1Uc;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.C05550Ty;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18320x8;
import X.C23651Ud;
import X.C29441ip;
import X.C54402of;
import X.C56162rW;
import X.C56612sH;
import X.C59652xG;
import X.C620433g;
import X.C621033m;
import X.C66543Lv;
import X.C73853gB;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;

public final class WaFlowsViewModel extends C05550Ty {
    public final AnonymousClass08M A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02;
    public final AnonymousClass08M A03;
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final AnonymousClass08M A05 = AnonymousClass08M.A01();
    public final C621033m A06;
    public final C620433g A07;
    public final C56612sH A08;
    public final C54402of A09;
    public final AnonymousClass33p A0A;
    public final C66543Lv A0B;
    public final C59652xG A0C;
    public final C56162rW A0D;
    public final AnonymousClass1Uc A0E;
    public final C23651Ud A0F;
    public final FlowsWebViewDataRepository A0G;
    public final AnonymousClass1VX A0H;
    public final AnonymousClass4FS A0I;
    public final C73853gB A0J;

    public WaFlowsViewModel(C621033m r3, C620433g r4, C29441ip r5, C56612sH r6, C54402of r7, AnonymousClass33p r8, C66543Lv r9, C59652xG r10, C56162rW r11, AnonymousClass1Uc r12, C23651Ud r13, FlowsWebViewDataRepository flowsWebViewDataRepository, AnonymousClass1VX r15, AnonymousClass4FS r16, C73853gB r17) {
        C18260x0.A0a(r4, r8, r7, 1);
        C162457s7.A0J(r6, 5);
        AnonymousClass4FS r1 = r16;
        C18260x0.A0U(r15, r1);
        C162457s7.A0J(r5, 10);
        C18270x1.A15(r10, r3, r9, 11);
        this.A07 = r4;
        this.A0D = r11;
        this.A0A = r8;
        this.A09 = r7;
        this.A08 = r6;
        this.A0H = r15;
        this.A0I = r1;
        this.A0F = r13;
        this.A0J = r17;
        this.A0C = r10;
        this.A0G = flowsWebViewDataRepository;
        this.A06 = r3;
        this.A0B = r9;
        this.A0E = r12;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A03 = A012;
        this.A02 = AnonymousClass08M.A01();
        this.A00 = AnonymousClass08M.A01();
        C18320x8.A18(A012, r5.A0F());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(android.webkit.WebMessagePort r18, X.C84814Du r19, org.json.JSONObject r20) {
        /*
            r17 = this;
            r4 = r19
            boolean r0 = r4 instanceof X.C74443h8
            r2 = r17
            if (r0 == 0) goto L_0x0162
            r6 = r4
            X.3h8 r6 = (X.C74443h8) r6
            int r3 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0162
            int r3 = r3 - r1
            r6.label = r3
        L_0x0016:
            java.lang.Object r1 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r4) goto L_0x0169
            java.lang.Object r3 = r6.L$1
            java.lang.Object r2 = r6.L$0
            com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel r2 = (com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel) r2
            X.C57682u2.A01(r1)
        L_0x002a:
            java.lang.String r0 = "WAExtensionsComplete"
            boolean r0 = X.C162457s7.A0P(r3, r0)
            if (r0 == 0) goto L_0x003c
            X.08M r1 = r2.A02
            r0 = 2
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r0)
            r1.A0G(r0)
        L_0x003c:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x003f:
            X.C57682u2.A01(r1)
            java.lang.String r0 = "method"
            r7 = r20
            java.lang.String r3 = r7.getString(r0)
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r7.optJSONObject(r0)
            if (r1 != 0) goto L_0x0057
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
        L_0x0057:
            X.C162457s7.A0H(r3)
            int r0 = r3.hashCode()
            r15 = 0
            switch(r0) {
                case -1943398688: goto L_0x007b;
                case -1291933730: goto L_0x008f;
                case -1065806377: goto L_0x00b4;
                case -19964313: goto L_0x00ce;
                case 63780460: goto L_0x00e2;
                case 665045520: goto L_0x00f3;
                case 714831445: goto L_0x010c;
                case 717743399: goto L_0x0121;
                case 1636133391: goto L_0x0136;
                case 2113914398: goto L_0x014b;
                default: goto L_0x0062;
            }
        L_0x0062:
            X.1Ui r10 = new X.1Ui
            r10.<init>()
        L_0x0067:
            r0 = r18
            r10.A02(r0)
            r10.A01 = r7
            r6.L$0 = r2
            r6.L$1 = r3
            r6.label = r4
            java.lang.Object r0 = r10.A01(r6)
            if (r0 != r5) goto L_0x002a
            return r5
        L_0x007b:
            java.lang.String r0 = "WAQPLLogger.end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.1Uc r1 = r2.A0E
            int r0 = com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A00(r2)
            X.1Uo r10 = new X.1Uo
            r10.<init>(r1, r0)
            goto L_0x0067
        L_0x008f:
            java.lang.String r0 = "WAExtensionsDataChannelExchange"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.4FS r12 = r2.A0I
            X.2xG r11 = r2.A0C
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r2.A0G
            X.2n9 r0 = r0.A00
            if (r0 == 0) goto L_0x00b1
            java.lang.String r13 = r0.A04
            java.lang.String r14 = r0.A05
            java.lang.String r15 = r0.A02
        L_0x00a7:
            java.lang.String r16 = r1.toString()
            X.1Us r10 = new X.1Us
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x0067
        L_0x00b1:
            r13 = r15
            r14 = r15
            goto L_0x00a7
        L_0x00b4:
            java.lang.String r0 = "WAExtensionsComplete"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r2.A0G
            X.2n9 r9 = r0.A00
            if (r9 == 0) goto L_0x0062
            X.33m r8 = r2.A06
            X.34x r1 = r0.A01
            X.3Lv r0 = r2.A0B
            X.1Ur r10 = new X.1Ur
            r10.<init>(r8, r0, r9, r1)
            goto L_0x0067
        L_0x00ce:
            java.lang.String r0 = "WAQPLLogger.annotate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.1Uc r1 = r2.A0E
            int r0 = com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A00(r2)
            X.1Un r10 = new X.1Un
            r10.<init>(r1, r0)
            goto L_0x0067
        L_0x00e2:
            java.lang.String r0 = "WAExtensionsGetClientAbProps"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.1VX r0 = r2.A0H
            X.1Uj r10 = new X.1Uj
            r10.<init>(r0)
            goto L_0x0067
        L_0x00f3:
            java.lang.String r0 = "WAExtensionsGetFlowData"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r2.A0G
            org.json.JSONObject r0 = r0.A02
            if (r0 != 0) goto L_0x0105
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1G()
        L_0x0105:
            X.1Uk r10 = new X.1Uk
            r10.<init>(r0)
            goto L_0x0067
        L_0x010c:
            java.lang.String r0 = "WAQPLLogger.point"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.1Uc r1 = r2.A0E
            int r0 = com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository.A00(r2)
            X.1Up r10 = new X.1Up
            r10.<init>(r1, r0)
            goto L_0x0067
        L_0x0121:
            java.lang.String r0 = "WAQPLLogger.start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.1Uc r1 = r2.A0E
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r2.A0G
            X.2n9 r0 = r0.A00
            X.1Uq r10 = new X.1Uq
            r10.<init>(r1, r0)
            goto L_0x0067
        L_0x0136:
            java.lang.String r0 = "WAExtensionsNavigate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r0 = r2.A0G
            X.34x r1 = r0.A01
            X.3Lv r0 = r2.A0B
            X.1Um r10 = new X.1Um
            r10.<init>(r0, r1)
            goto L_0x0067
        L_0x014b:
            java.lang.String r0 = "WAExtensionsGetPublicKey"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r8 = r2.A0G
            java.lang.String r0 = "force_refresh"
            boolean r0 = r1.optBoolean(r0)
            com.whatsapp.extensions.webview.bridge.factory.FlowsGetPublicKey r10 = new com.whatsapp.extensions.webview.bridge.factory.FlowsGetPublicKey
            r10.<init>(r8, r0)
            goto L_0x0067
        L_0x0162:
            X.3h8 r6 = new X.3h8
            r6.<init>(r2, r4)
            goto L_0x0016
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel.A0D(android.webkit.WebMessagePort, X.4Du, org.json.JSONObject):java.lang.Object");
    }
}
