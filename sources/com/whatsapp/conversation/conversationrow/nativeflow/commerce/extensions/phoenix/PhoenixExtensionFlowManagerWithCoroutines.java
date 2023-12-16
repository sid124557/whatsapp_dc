package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Uc;
import X.AnonymousClass1VX;
import X.AnonymousClass2VM;
import X.AnonymousClass2z0;
import X.AnonymousClass30C;
import X.AnonymousClass395;
import X.AnonymousClass39C;
import X.AnonymousClass39P;
import X.AnonymousClass39W;
import X.AnonymousClass3ZH;
import X.AnonymousClass4B3;
import X.AnonymousClass4C6;
import X.AnonymousClass4DQ;
import X.AnonymousClass4DV;
import X.AnonymousClass4KM;
import X.C161447pg;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C183538qC;
import X.C23401Sx;
import X.C23631Ua;
import X.C23641Ub;
import X.C23651Ud;
import X.C29441ip;
import X.C370820w;
import X.C40292Fg;
import X.C41572Kt;
import X.C48182eU;
import X.C48622fC;
import X.C50312hy;
import X.C51052jC;
import X.C52912mF;
import X.C53412n3;
import X.C53832nk;
import X.C54052o6;
import X.C54292oU;
import X.C54402of;
import X.C55012pe;
import X.C55502qS;
import X.C55832qz;
import X.C56162rW;
import X.C56422rx;
import X.C56612sH;
import X.C57142tA;
import X.C58422vE;
import X.C59102wM;
import X.C60032xt;
import X.C60482yd;
import X.C613330g;
import X.C620433g;
import X.C620733j;
import X.C624134x;
import X.C625935s;
import X.C64773Ex;
import X.C66543Lv;
import X.C73853gB;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class PhoenixExtensionFlowManagerWithCoroutines {
    public int A00;
    public C161447pg A01;
    public final AnonymousClass2VM A02;
    public final C620433g A03;
    public final C29441ip A04;
    public final C64773Ex A05;
    public final C56422rx A06;
    public final C613330g A07;
    public final C60032xt A08;
    public final C40292Fg A09;
    public final C56612sH A0A;
    public final C54292oU A0B;
    public final C54402of A0C;
    public final C620733j A0D;
    public final C53412n3 A0E;
    public final C66543Lv A0F;
    public final C50312hy A0G;
    public final C56162rW A0H;
    public final C59102wM A0I;
    public final C48622fC A0J;
    public final C23401Sx A0K;
    public final AnonymousClass1Uc A0L;
    public final C23651Ud A0M;
    public final C23641Ub A0N;
    public final C23631Ua A0O;
    public final AnonymousClass1VX A0P;
    public final C48182eU A0Q;
    public final C60482yd A0R;
    public final C183538qC A0S;
    public final AtomicBoolean A0T = C18280x3.A0l();
    public final C73853gB A0U;
    public final C73853gB A0V;
    public final AnonymousClass4C6 A0W;

    public static final boolean A01(String str, String str2) {
        try {
            if (Long.parseLong(str) >= 3) {
                if (str2 == null || str2.length() == 0 || "navigate".equals(str2)) {
                    return true;
                }
                return false;
            }
        } catch (NumberFormatException e) {
            C18260x0.A17("SExtensionsLogger/PhoenixExtensionsFlowManager/isExtensionInitWithoutDataChannel()/Error - ", AnonymousClass001.A0o(), e);
        }
        return false;
    }

    public PhoenixExtensionFlowManagerWithCoroutines(AnonymousClass2VM r21, C620433g r22, C29441ip r23, C64773Ex r24, C56422rx r25, C613330g r26, C60032xt r27, C40292Fg r28, C56612sH r29, C54292oU r30, C54402of r31, C620733j r32, C53412n3 r33, C66543Lv r34, C50312hy r35, C56162rW r36, C59102wM r37, C48622fC r38, C23401Sx r39, AnonymousClass1Uc r40, C23651Ud r41, C23641Ub r42, C23631Ua r43, AnonymousClass1VX r44, C48182eU r45, C60482yd r46, C183538qC r47, C73853gB r48, C73853gB r49, AnonymousClass4C6 r50) {
        AnonymousClass1VX r0 = r44;
        C183538qC r3 = r47;
        C56612sH r15 = r29;
        C54292oU r11 = r30;
        AnonymousClass2VM r19 = r21;
        C18260x0.A0f(r15, r0, r11, r19, r3);
        C66543Lv r7 = r34;
        C162457s7.A0J(r7, 6);
        C60482yd r4 = r46;
        C620433g r18 = r22;
        C56422rx r14 = r25;
        C18260x0.A0X(r4, r14, r18);
        C29441ip r17 = r23;
        C162457s7.A0J(r17, 12);
        C40292Fg r12 = r28;
        C162457s7.A0J(r12, 14);
        C50312hy r6 = r35;
        C54402of r10 = r31;
        AnonymousClass0x2.A1C(r10, r6);
        C620733j r9 = r32;
        C162457s7.A0J(r9, 19);
        C48182eU r5 = r45;
        C162457s7.A0J(r5, 20);
        C613330g r13 = r26;
        C162457s7.A0J(r13, 23);
        C64773Ex r16 = r24;
        C162457s7.A0J(r16, 24);
        C73853gB r2 = r49;
        C162457s7.A0J(r2, 28);
        C53412n3 r8 = r33;
        C162457s7.A0J(r8, 30);
        this.A0A = r15;
        this.A0P = r0;
        this.A0B = r11;
        this.A02 = r19;
        this.A0S = r3;
        this.A0F = r7;
        this.A08 = r27;
        this.A0R = r4;
        this.A06 = r14;
        this.A03 = r18;
        this.A0H = r36;
        this.A04 = r17;
        this.A0J = r38;
        this.A09 = r12;
        this.A0O = r43;
        this.A0K = r39;
        this.A0C = r10;
        this.A0G = r6;
        this.A0D = r9;
        this.A0Q = r5;
        this.A0M = r41;
        this.A0L = r40;
        this.A07 = r13;
        this.A05 = r16;
        this.A0N = r42;
        this.A0I = r37;
        this.A0U = r48;
        this.A0V = r2;
        this.A0W = r50;
        this.A0E = r8;
    }

    public static void A00(C54052o6 r3, PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, C52912mF r5, int i) {
        if (r5.A03) {
            phoenixExtensionFlowManagerWithCoroutines.A0L.A08(new Integer(r3.A05.hashCode()));
            phoenixExtensionFlowManagerWithCoroutines.A0O.A08(new Integer(phoenixExtensionFlowManagerWithCoroutines.A00));
            return;
        }
        phoenixExtensionFlowManagerWithCoroutines.A0M.A0E(new Integer(i), r5.A01);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: X.4B3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C54052o6 r33, X.C53832nk r34, X.AnonymousClass4B3 r35, X.AnonymousClass4DQ r36, java.lang.String r37, X.C84814Du r38) {
        /*
            r32 = this;
            r7 = r38
            r5 = r33
            r19 = r37
            r20 = r35
            r3 = r36
            boolean r0 = r7 instanceof X.C74703hY
            r4 = r32
            if (r0 == 0) goto L_0x0263
            r2 = r7
            X.3hY r2 = (X.C74703hY) r2
            int r6 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r1
            if (r0 == 0) goto L_0x0263
            int r6 = r6 - r1
            r2.label = r6
        L_0x001e:
            java.lang.Object r1 = r2.result
            X.218 r21 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r2.label
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0077
            if (r0 == r8) goto L_0x0073
            if (r0 != r7) goto L_0x026a
            boolean r10 = r2.Z$0
            java.lang.Object r9 = r2.L$6
            X.2jC r9 = (X.C51052jC) r9
            java.lang.Object r6 = r2.L$5
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r3 = r2.L$4
            X.4DQ r3 = (X.AnonymousClass4DQ) r3
            java.lang.Object r0 = r2.L$3
            r20 = r0
            r0 = r20
            X.4B3 r0 = (X.AnonymousClass4B3) r0
            r20 = r0
            java.lang.Object r0 = r2.L$2
            r19 = r0
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            r19 = r0
            java.lang.Object r5 = r2.L$1
            X.2o6 r5 = (X.C54052o6) r5
            java.lang.Object r4 = r2.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r4 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines) r4
            X.C57682u2.A01(r1)
        L_0x0059:
            X.3Z6 r1 = (X.AnonymousClass3Z6) r1
            java.lang.Object r0 = r1.first
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 != 0) goto L_0x0256
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "UNKNOWN"
        L_0x006b:
            java.lang.String r0 = r5.A05
            r4.A09(r3, r1, r0)
        L_0x0070:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0073:
            X.C57682u2.A01(r1)
            goto L_0x0070
        L_0x0077:
            X.C57682u2.A01(r1)
            java.lang.String r0 = r5.A05
            r24 = r0
            X.2Fg r9 = r4.A09
            X.3Z6[] r10 = new X.AnonymousClass3Z6[r7]
            java.lang.String r1 = "chat_jid"
            com.whatsapp.jid.UserJid r0 = r5.A02
            r23 = r0
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r1, r0)
            r6 = 0
            r10[r6] = r0
            java.lang.String r1 = "key_msg_id"
            java.lang.String r0 = r5.A08
            r22 = r0
            X.AnonymousClass3Z6.A09(r1, r0, r10, r8)
            java.util.Map r1 = X.C73813g7.A0F(r10)
            java.util.HashMap r0 = r9.A00
            r0.clear()
            r0.putAll(r1)
            r0 = 17
            X.3Z6[] r9 = new X.AnonymousClass3Z6[r0]
            java.lang.String r10 = "action"
            java.lang.String r11 = r5.A06
            java.lang.String r1 = r5.A04
            boolean r0 = A01(r11, r1)
            if (r0 == 0) goto L_0x0211
            java.lang.String r0 = "navigate"
        L_0x00b7:
            X.AnonymousClass3Z6.A09(r10, r0, r9, r6)
            java.lang.String r18 = "action_payload"
            boolean r0 = A01(r11, r1)
            if (r0 == 0) goto L_0x0203
            java.util.Map r10 = r5.A0A
            java.lang.String r17 = "screen"
            r14 = 0
            if (r10 == 0) goto L_0x01ff
            r0 = r17
            java.lang.Object r16 = r10.get(r0)
        L_0x00d0:
            java.lang.String r13 = "data"
            if (r10 == 0) goto L_0x00d8
            java.lang.Object r14 = r10.get(r13)
        L_0x00d8:
            X.3Z6[] r12 = new X.AnonymousClass3Z6[r7]
            X.3Z6[] r15 = new X.AnonymousClass3Z6[r7]
            java.lang.String r0 = "name"
            r10 = r0
            r0 = r16
            X.AnonymousClass3Z6.A09(r10, r0, r15, r6)
            java.lang.String r0 = "type"
            r10 = r0
            r0 = r17
            X.AnonymousClass3Z6.A09(r10, r0, r15, r8)
            java.util.Map r0 = X.C73813g7.A0F(r15)
            java.lang.String r10 = "next"
            X.AnonymousClass3Z6.A09(r10, r0, r12, r6)
            X.AnonymousClass3Z6.A09(r13, r14, r12, r8)
            java.util.Map r10 = X.C73813g7.A0F(r12)
        L_0x00ff:
            r0 = r18
            X.AnonymousClass3Z6.A09(r0, r10, r9, r8)
            java.lang.String r10 = "message_id"
            r0 = r22
            X.AnonymousClass3Z6.A09(r10, r0, r9, r7)
            java.lang.String r10 = "session_id"
            java.lang.String r0 = r5.A09
            r16 = r0
            X.AnonymousClass3Z6.A07(r10, r0, r9)
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r10 = "wae"
            java.lang.String r0 = X.AnonymousClass000.A0V(r10, r0, r12)
            java.lang.String r10 = X.AnonymousClass26l.A00(r0)
            java.lang.String r0 = "product_qpl_session_id"
            X.AnonymousClass3Z6.A08(r0, r10, r9)
            r10 = r23
            r0 = r24
            X.C54052o6.A00(r5, r10, r11, r0, r9)
            r14 = r34
            java.lang.String r10 = r14.A00
            java.lang.String r0 = "extension_status"
            X.3Z6 r12 = X.AnonymousClass3Z6.A02(r0, r10)
            r0 = 11
            r9[r0] = r12
            X.33j r0 = r4.A0D
            java.lang.String r12 = r0.A08()
            java.lang.String r0 = "user_locale"
            X.3Z6 r12 = X.AnonymousClass3Z6.A02(r0, r12)
            r0 = 12
            r9[r0] = r12
            X.3Z6[] r13 = new X.AnonymousClass3Z6[r7]
            java.lang.String r0 = "type"
            java.lang.String r12 = "modal"
            X.AnonymousClass3Z6.A09(r0, r12, r13, r6)
            java.lang.String r6 = "modal_type"
            java.lang.String r0 = "bottom_sheet"
            X.AnonymousClass3Z6.A09(r6, r0, r13, r8)
            java.util.Map r6 = X.C73813g7.A0F(r13)
            java.lang.String r0 = "style"
            java.util.Map r6 = X.C57692u3.A04(r0, r6)
            java.lang.String r0 = "overwrite_first_screen_presentation"
            X.3Z6 r6 = X.AnonymousClass3Z6.A02(r0, r6)
            r0 = 13
            r9[r0] = r6
            java.lang.String r6 = "action_name"
            java.lang.String r0 = "galaxy_message"
            X.3Z6 r6 = X.AnonymousClass3Z6.A02(r6, r0)
            r0 = 14
            r9[r0] = r6
            java.lang.String r6 = "is_modal_on_screen"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            X.3Z6 r6 = X.AnonymousClass3Z6.A02(r6, r0)
            r0 = 15
            r9[r0] = r6
            int r0 = r14.A01
            java.lang.Integer r6 = X.AnonymousClass0x9.A0k(r0)
            java.lang.String r0 = "flow_json_version"
            X.3Z6 r6 = X.AnonymousClass3Z6.A02(r0, r6)
            r0 = 16
            r9[r0] = r6
            java.util.Map r6 = X.C73813g7.A0F(r9)
            java.lang.String r0 = "DRAFT"
            boolean r10 = X.C162457s7.A0P(r10, r0)
            r9 = r24
            r0 = r22
            X.2jC r9 = X.AnonymousClass25c.A00(r0, r9)
            X.2eU r15 = r4.A0Q
            java.lang.String r14 = r9.A00
            X.7Zw r0 = r15.A00(r14)
            if (r10 == 0) goto L_0x0218
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x0218
            X.1VX r0 = r4.A0P
            r13 = r0
            X.2vE r12 = X.C58422vE.A02
            r0 = 4819(0x12d3, float:6.753E-42)
            boolean r0 = r13.A0Y(r12, r0)
            if (r0 == 0) goto L_0x0215
            java.lang.String r7 = r5.A03
            X.3gB r1 = r4.A0V
            r31 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$startExtensionsFlow$2$1 r0 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$startExtensionsFlow$2$1
            r22 = r0
            r23 = r5
            r24 = r4
            r25 = r20
            r26 = r3
            r27 = r9
            r28 = r7
            r29 = r19
            r30 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.L$0 = r7
            r2.label = r8
            java.lang.Object r1 = X.C616131n.A00(r2, r1, r0)
            r0 = r21
            if (r1 != r0) goto L_0x0070
            return r21
        L_0x01ff:
            r16 = r14
            goto L_0x00d0
        L_0x0203:
            java.lang.String r0 = "INIT"
            java.util.Map r10 = X.C57692u3.A04(r10, r0)
            java.lang.String r0 = "business_payload"
            java.util.Map r10 = X.C57692u3.A04(r0, r10)
            goto L_0x00ff
        L_0x0211:
            java.lang.String r0 = "INIT"
            goto L_0x00b7
        L_0x0215:
            r15.A01(r14)
        L_0x0218:
            boolean r0 = A01(r11, r1)
            if (r0 == 0) goto L_0x0256
            X.2rW r8 = r4.A0H
            r2.L$0 = r4
            r2.L$1 = r5
            r0 = r19
            r2.L$2 = r0
            r0 = r20
            r2.L$3 = r0
            r2.L$4 = r3
            r2.L$5 = r6
            r2.L$6 = r9
            r2.Z$0 = r10
            r2.label = r7
            X.3dl r1 = X.C57702u4.A02(r2)
            X.45P r0 = new X.45P
            r0.<init>(r1)
            r11 = r8
            r12 = r23
            r13 = r24
            r14 = r22
            r15 = r16
            r16 = r0
            r11.A03(r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.A00()
            r0 = r21
            if (r1 != r0) goto L_0x0059
            return r21
        L_0x0256:
            r0 = r4
            r1 = r5
            r2 = r20
            r4 = r9
            r5 = r19
            r7 = r10
            r0.A07(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0070
        L_0x0263:
            X.3hY r2 = new X.3hY
            r2.<init>(r4, r7)
            goto L_0x001e
        L_0x026a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines.A02(X.2o6, X.2nk, X.4B3, X.4DQ, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        if (r1 == r6) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C54052o6 r25, X.C53832nk r26, X.AnonymousClass4B3 r27, X.AnonymousClass4DQ r28, X.C84814Du r29) {
        /*
            r24 = this;
            r3 = r29
            r12 = r25
            r11 = r26
            r10 = r27
            r9 = r28
            boolean r0 = r3 instanceof X.C74643hS
            r8 = r24
            if (r0 == 0) goto L_0x0037
            r7 = r3
            X.3hS r7 = (X.C74643hS) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r7.label = r2
        L_0x001e:
            java.lang.Object r1 = r7.result
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r7.label
            r13 = 4
            r5 = 3
            r4 = 1
            r3 = 2
            if (r0 == 0) goto L_0x003d
            if (r0 == r4) goto L_0x00b9
            if (r0 == r3) goto L_0x010f
            if (r0 == r5) goto L_0x010f
            if (r0 == r13) goto L_0x010f
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0037:
            X.3hS r7 = new X.3hS
            r7.<init>(r8, r3)
            goto L_0x001e
        L_0x003d:
            X.C57682u2.A01(r1)
            X.1Ub r0 = r8.A0N
            r23 = r0
            java.lang.String r2 = r12.A05
            int r1 = r2.hashCode()
            X.21n r16 = X.C372521n.USER_INTERACTION
            java.lang.String r15 = r12.A08
            java.lang.String r14 = r12.A09
            boolean r0 = r12.A0B
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r0)
            com.whatsapp.jid.UserJid r0 = r12.A02
            r21 = r14
            r22 = r1
            r17 = r0
            r19 = r2
            r20 = r15
            r15 = r23
            r15.A0D(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r14 = r11.A00
            java.lang.String r0 = "DRAFT"
            boolean r0 = X.C162457s7.A0P(r14, r0)
            if (r0 != 0) goto L_0x0086
            X.2fC r0 = r8.A0J
            r7.L$0 = r8
            r7.L$1 = r12
            r7.L$2 = r11
            r7.L$3 = r10
            r7.L$4 = r9
            r7.label = r4
            java.lang.Object r1 = r0.A01(r2, r7, r1)
            if (r1 != r6) goto L_0x00d0
        L_0x0085:
            return r6
        L_0x0086:
            X.1Uc r3 = r8.A0L
            r2 = 0
            java.lang.String r0 = "psl_cache_hit"
            r3.A05(r1, r0, r2)
            r7.label = r13
            goto L_0x009e
        L_0x0092:
            r7.L$0 = r1
            r7.L$1 = r1
            r7.L$2 = r1
            r7.L$3 = r1
            r7.L$4 = r1
            r7.label = r5
        L_0x009e:
            X.3gB r1 = r8.A0U
            r19 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2 r0 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$downloadPslAndStart$2
            r13 = r0
            r14 = r12
            r15 = r8
            r16 = r11
            r17 = r10
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.Object r0 = X.C616131n.A00(r7, r1, r0)
            if (r0 == r6) goto L_0x0085
            X.2wD r0 = X.C59022wD.A00
            goto L_0x010c
        L_0x00b9:
            java.lang.Object r9 = r7.L$4
            X.4DQ r9 = (X.AnonymousClass4DQ) r9
            java.lang.Object r10 = r7.L$3
            X.4B3 r10 = (X.AnonymousClass4B3) r10
            java.lang.Object r11 = r7.L$2
            X.2nk r11 = (X.C53832nk) r11
            java.lang.Object r12 = r7.L$1
            X.2o6 r12 = (X.C54052o6) r12
            java.lang.Object r8 = r7.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r8 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines) r8
            X.C57682u2.A01(r1)
        L_0x00d0:
            X.3Z6 r1 = (X.AnonymousClass3Z6) r1
            java.lang.Object r0 = r1.first
            boolean r13 = X.AnonymousClass001.A1Z(r0)
            java.lang.Object r4 = r1.second
            java.lang.String r4 = (java.lang.String) r4
            X.1Uc r1 = r8.A0L
            java.lang.String r0 = r12.A05
            int r2 = r0.hashCode()
            java.lang.String r0 = "psl_cache_hit"
            r1.A05(r2, r0, r13)
            r1 = 0
            if (r13 == 0) goto L_0x0092
            X.1Ub r0 = r8.A0N
            r0.A06(r2, r3)
            if (r4 == 0) goto L_0x0115
            r7.L$0 = r1
            r7.L$1 = r1
            r7.L$2 = r1
            r7.L$3 = r1
            r7.L$4 = r1
            r7.label = r3
            r13 = r11
            r14 = r10
            r15 = r9
            r16 = r4
            r17 = r7
            r11 = r8
            java.lang.Object r0 = r11.A02(r12, r13, r14, r15, r16, r17)
        L_0x010c:
            if (r0 != r6) goto L_0x0112
            return r6
        L_0x010f:
            X.C57682u2.A01(r1)
        L_0x0112:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0115:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines.A03(X.2o6, X.2nk, X.4B3, X.4DQ, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C54052o6 r18, X.AnonymousClass4B3 r19, X.AnonymousClass4DQ r20, X.C84814Du r21, int r22) {
        /*
            r17 = this;
            r9 = r21
            r7 = r18
            r6 = r19
            r5 = r20
            r4 = r22
            boolean r0 = r9 instanceof X.C74633hR
            r3 = r17
            if (r0 == 0) goto L_0x00d0
            r2 = r9
            X.3hR r2 = (X.C74633hR) r2
            int r8 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r8 & r1
            if (r0 == 0) goto L_0x00d0
            int r8 = r8 - r1
            r2.label = r8
        L_0x001e:
            java.lang.Object r12 = r2.result
            X.218 r1 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r9 = r2.label
            r0 = 2
            r8 = 1
            if (r9 == 0) goto L_0x0032
            if (r9 == r8) goto L_0x005e
            if (r9 != r0) goto L_0x00d7
            X.C57682u2.A01(r12)
        L_0x002f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0032:
            X.C57682u2.A01(r12)
            X.2rW r10 = r3.A0H
            java.lang.Integer r12 = X.AnonymousClass0x9.A0k(r4)
            com.whatsapp.jid.UserJid r11 = r7.A02
            java.lang.String r13 = r7.A08
            java.lang.String r14 = r7.A09
            r2.L$0 = r3
            r2.L$1 = r7
            r2.L$2 = r6
            r2.L$3 = r5
            r2.I$0 = r4
            r2.label = r8
            r16 = 0
            X.3gB r8 = r10.A0A
            r15 = 0
            com.whatsapp.extensions.network.metadata.ExtensionsMetadataManager$fetchExtensionsMetaData$2 r9 = new com.whatsapp.extensions.network.metadata.ExtensionsMetadataManager$fetchExtensionsMetaData$2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r12 = X.C616131n.A00(r2, r8, r9)
            if (r12 != r1) goto L_0x0073
            return r1
        L_0x005e:
            int r4 = r2.I$0
            java.lang.Object r5 = r2.L$3
            X.4DQ r5 = (X.AnonymousClass4DQ) r5
            java.lang.Object r6 = r2.L$2
            X.4B3 r6 = (X.AnonymousClass4B3) r6
            java.lang.Object r7 = r2.L$1
            X.2o6 r7 = (X.C54052o6) r7
            java.lang.Object r3 = r2.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines) r3
            X.C57682u2.A01(r12)
        L_0x0073:
            X.2mF r12 = (X.C52912mF) r12
            A00(r7, r3, r12, r4)
            X.2Kt r11 = r12.A00
            r10 = 0
            if (r11 == 0) goto L_0x00c0
            java.util.List r4 = r11.A01
            java.util.Iterator r12 = r4.iterator()
        L_0x0083:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x00be
            java.lang.Object r9 = r12.next()
            r4 = r9
            X.2nk r4 = (X.C53832nk) r4
            java.lang.String r8 = r4.A03
            java.lang.String r4 = r7.A05
            boolean r4 = X.C162457s7.A0P(r8, r4)
            if (r4 == 0) goto L_0x0083
        L_0x009a:
            X.2nk r9 = (X.C53832nk) r9
            if (r9 == 0) goto L_0x00c7
            java.lang.String r4 = r9.A02
            r7.A00 = r4
            boolean r4 = r3.A0A(r7, r9, r11, r5)
            if (r4 != 0) goto L_0x002f
            r2.L$0 = r10
            r2.L$1 = r10
            r2.L$2 = r10
            r2.L$3 = r10
            r2.label = r0
            r12 = r2
            r10 = r6
            r11 = r5
            r8 = r7
            r7 = r3
            java.lang.Object r0 = r7.A03(r8, r9, r10, r11, r12)
            if (r0 != r1) goto L_0x002f
            return r1
        L_0x00be:
            r9 = r10
            goto L_0x009a
        L_0x00c0:
            java.lang.String r1 = r12.A02
            if (r1 != 0) goto L_0x00c9
            java.lang.String r1 = "failure"
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r1 = "extensions-invalid-extensions-id"
        L_0x00c9:
            java.lang.String r0 = r7.A05
            r3.A09(r5, r1, r0)
            goto L_0x002f
        L_0x00d0:
            X.3hR r2 = new X.3hR
            r2.<init>(r3, r9)
            goto L_0x001e
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines.A04(X.2o6, X.4B3, X.4DQ, X.4Du, int):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (r12 == r5) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C54052o6 r19, X.AnonymousClass4B3 r20, X.AnonymousClass4DQ r21, X.C84814Du r22, int r23) {
        /*
            r18 = this;
            r9 = r22
            r0 = r19
            r7 = r20
            r4 = r21
            r8 = r23
            boolean r2 = r9 instanceof X.C74653hT
            r1 = r18
            if (r2 == 0) goto L_0x0129
            r6 = r9
            X.3hT r6 = (X.C74653hT) r6
            int r5 = r6.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5 & r3
            if (r2 == 0) goto L_0x0129
            int r5 = r5 - r3
            r6.label = r5
        L_0x001e:
            java.lang.Object r12 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r11 = r6.label
            r10 = 3
            r3 = 2
            r9 = 1
            r2 = 0
            if (r11 == 0) goto L_0x0036
            if (r11 == r9) goto L_0x0063
            if (r11 == r3) goto L_0x00c4
            if (r11 != r10) goto L_0x0130
            X.C57682u2.A01(r12)
        L_0x0033:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0036:
            X.C57682u2.A01(r12)
            X.2rW r11 = r1.A0H
            java.lang.Integer r13 = X.AnonymousClass0x9.A0k(r8)
            com.whatsapp.jid.UserJid r12 = r0.A02
            java.lang.String r14 = r0.A08
            java.lang.String r15 = r0.A09
            r6.L$0 = r1
            r6.L$1 = r0
            r6.L$2 = r7
            r6.L$3 = r4
            r6.I$0 = r8
            r6.label = r9
            r17 = 0
            X.3gB r9 = r11.A0A
            r16 = 0
            com.whatsapp.extensions.network.metadata.ExtensionsMetadataManager$fetchExtensionsMetaData$2 r10 = new com.whatsapp.extensions.network.metadata.ExtensionsMetadataManager$fetchExtensionsMetaData$2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r12 = X.C616131n.A00(r6, r9, r10)
            if (r12 != r5) goto L_0x0078
        L_0x0062:
            return r5
        L_0x0063:
            int r8 = r6.I$0
            java.lang.Object r4 = r6.L$3
            X.4DQ r4 = (X.AnonymousClass4DQ) r4
            java.lang.Object r7 = r6.L$2
            X.4B3 r7 = (X.AnonymousClass4B3) r7
            java.lang.Object r0 = r6.L$1
            X.2o6 r0 = (X.C54052o6) r0
            java.lang.Object r1 = r6.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r1 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines) r1
            X.C57682u2.A01(r12)
        L_0x0078:
            X.2mF r12 = (X.C52912mF) r12
            A00(r0, r1, r12, r8)
            X.2Kt r11 = r12.A00
            if (r11 == 0) goto L_0x00e9
            java.util.List r8 = r11.A01
            java.util.Iterator r13 = r8.iterator()
        L_0x0087:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x00c2
            java.lang.Object r10 = r13.next()
            r8 = r10
            X.2nk r8 = (X.C53832nk) r8
            java.lang.String r9 = r8.A03
            java.lang.String r8 = r0.A05
            boolean r8 = X.C162457s7.A0P(r9, r8)
            if (r8 == 0) goto L_0x0087
        L_0x009e:
            X.2nk r10 = (X.C53832nk) r10
            if (r10 == 0) goto L_0x00e9
            java.lang.String r8 = r10.A02
            r0.A00 = r8
            boolean r8 = r1.A0A(r0, r10, r11, r4)
            if (r8 != 0) goto L_0x0033
            r6.L$0 = r1
            r6.L$1 = r0
            r6.L$2 = r2
            r6.L$3 = r2
            r6.label = r3
            r11 = r7
            r12 = r4
            r13 = r6
            r8 = r1
            r9 = r0
            java.lang.Object r3 = r8.A03(r9, r10, r11, r12, r13)
            if (r3 != r5) goto L_0x00cf
            return r5
        L_0x00c2:
            r10 = r2
            goto L_0x009e
        L_0x00c4:
            java.lang.Object r0 = r6.L$1
            X.2o6 r0 = (X.C54052o6) r0
            java.lang.Object r1 = r6.L$0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r1 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines) r1
            X.C57682u2.A01(r12)
        L_0x00cf:
            r6.L$0 = r2
            r6.L$1 = r2
            r2 = 3
            r6.label = r2
            X.3gB r4 = r1.A0U
            r3 = 0
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2 r2 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2
            r2.<init>(r0, r1, r3)
            java.lang.Object r0 = X.C616131n.A00(r6, r4, r2)
            if (r0 == r5) goto L_0x0062
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r5) goto L_0x0033
            return r5
        L_0x00e9:
            r13 = 0
            java.lang.String r12 = r12.A02
            if (r12 != 0) goto L_0x00f0
            java.lang.String r12 = "failure"
        L_0x00f0:
            if (r11 == 0) goto L_0x0109
            java.lang.String r12 = "extensions-invalid-extensions-id"
            boolean r2 = r0.A0B
            if (r2 != 0) goto L_0x0109
            X.2of r7 = r1.A0C
            com.whatsapp.jid.UserJid r2 = r0.A02
            java.lang.String r6 = r2.user
            java.lang.String r5 = r0.A05
            X.2sH r2 = r1.A0A
            long r2 = r2.A0H()
            r7.A02(r2, r6, r5)
        L_0x0109:
            java.lang.String r9 = r0.A05
            r1.A09(r4, r12, r9)
            X.2xt r2 = r1.A08
            java.lang.String r8 = "galaxy_message"
            com.whatsapp.jid.UserJid r6 = r0.A02
            java.lang.String r10 = r0.A08
            java.lang.String r11 = r0.A09
            X.3Lv r4 = r1.A0F
            X.2rx r3 = r1.A06
            X.2hy r5 = r1.A0G
            boolean r0 = r0.A0C
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0033
        L_0x0129:
            X.3hT r6 = new X.3hT
            r6.<init>(r1, r9)
            goto L_0x001e
        L_0x0130:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines.A05(X.2o6, X.4B3, X.4DQ, X.4Du, int):java.lang.Object");
    }

    public final void A06(C54052o6 r18, int i, boolean z) {
        int i2;
        String str;
        C54052o6 r7 = r18;
        UserJid userJid = r7.A02;
        String str2 = r7.A08;
        int i3 = 0;
        C624134x A002 = C55832qz.A00(this.A0F, AnonymousClass2z0.A05(userJid, str2, false));
        JSONObject A1G = AnonymousClass0x9.A1G();
        String A003 = C57142tA.A00(str2);
        String A004 = C57142tA.A00(r7.A09);
        try {
            A1G.put("cta", "galaxy_message");
            A1G.put("flow_id", r7.A05);
            A1G.put("extensions_message_id", A003);
            A1G.put("session_id", A004);
            A1G.put("data_channel_navigation", z);
            if (r7.A0C) {
                i3 = 1;
            }
            A1G.put("extension_restored_from_cache", i3);
        } catch (JSONException e) {
            C18260x0.A17("SExtensionsLogger/PhoenixExtensionsFlowMessage/reportWamEvent()/Error - ", AnonymousClass001.A0o(), e);
        }
        int A005 = AnonymousClass30C.A00(this.A06.A00(userJid));
        C55012pe A012 = this.A0E.A01.A01(userJid);
        if (A002 != null) {
            i2 = C624134x.A05(A002);
        } else {
            i2 = 1;
        }
        C50312hy r8 = this.A0G;
        String A0o = C18290x4.A0o(A1G);
        Integer valueOf = Integer.valueOf(A005);
        String str3 = null;
        if (A012 != null) {
            str3 = A012.A06;
            str = A012.A05;
        } else {
            str = null;
        }
        r8.A01(userJid, A002, valueOf, A0o, str3, str, str2, i);
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("business_jid", userJid.user);
        A0t.put("ext_session_id", A004);
        A0t.put("ext_message_id", A003);
        A0t.put("biz_platform", valueOf);
        A0t.put("message_media_type", Integer.valueOf(i2));
        C161447pg r0 = this.A01;
        if (r0 == null) {
            throw C18270x1.A0S("fdsManager");
        }
        r0.A0E(A0t);
    }

    public final void A07(C54052o6 r11, AnonymousClass4B3 r12, AnonymousClass4DQ r13, C51052jC r14, String str, Map map, boolean z) {
        Bitmap bitmap;
        String str2;
        this.A01 = this.A02.A00(r14);
        UserJid userJid = r11.A02;
        HashMap A0t = AnonymousClass001.A0t();
        C55502qS A002 = this.A06.A00(userJid);
        if (!(A002 == null || (str2 = A002.A08) == null)) {
            A0t.put("business_name", str2);
        }
        if (this.A0P.A0Y(C58422vE.A02, 4078)) {
            AnonymousClass3ZH A072 = this.A05.A07(userJid);
            Context context = this.A0B.A00;
            float A012 = C18310x6.A01(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            if (A072 != null) {
                bitmap = this.A07.A01(context, A072, A012, dimensionPixelSize);
            } else {
                bitmap = null;
            }
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            if (bitmap != null) {
                C18310x6.A12(bitmap, A0e);
            }
            String encodeToString = Base64.encodeToString(A0e.toByteArray(), 0);
            if (encodeToString != null) {
                A0t.put("business_profile_logo", encodeToString);
            }
        }
        C161447pg r0 = this.A01;
        if (r0 == null) {
            throw C18270x1.A0S("fdsManager");
        }
        r0.A0E(A0t);
        A06(r11, 0, !A01(r11.A06, r11.A04));
        this.A0O.A09(Integer.valueOf(this.A00), "startFlow");
        AnonymousClass39C r4 = null;
        boolean z2 = z;
        if (z) {
            r4 = new AnonymousClass39C(1000, "PHOENIX", false);
        }
        C161447pg r1 = this.A01;
        if (r1 == null) {
            throw C18270x1.A0S("fdsManager");
        }
        r1.A0A(new AnonymousClass4KM(this, 1, r12), new C625935s(r11, r13, this, 3), r4, r11.A05, str, r11.A03, map, z2);
    }

    public final void A08(C54052o6 r8, boolean z) {
        AnonymousClass4DV r0;
        AnonymousClass39W B5s;
        AnonymousClass39P r02;
        AnonymousClass2z0 A032 = AnonymousClass2z0.A03(r8.A02, r8.A08);
        C66543Lv r6 = this.A0F;
        C624134x A002 = C55832qz.A00(r6, A032);
        Object obj = null;
        if ((A002 instanceof AnonymousClass4DV) && (r0 = (AnonymousClass4DV) A002) != null && (B5s = r0.B5s()) != null && B5s.A00 == 5 && (r02 = B5s.A03) != null) {
            List list = r02.A03;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AnonymousClass395.A00(next, "galaxy_message")) {
                        obj = next;
                        break;
                    }
                }
                AnonymousClass395 r3 = (AnonymousClass395) obj;
                if (r3 != null) {
                    r3.A00 = z;
                }
            }
            r6.A0Y(A002);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass4DQ r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r3 = "extensions-features-disabled"
            boolean r0 = X.C162457s7.A0P(r8, r3)
            X.1Ua r4 = r6.A0O
            if (r0 == 0) goto L_0x0068
            int r0 = r6.A00
            X.C56672sN.A00(r4, r0)
            X.1Uc r4 = r6.A0L
            int r0 = r9.hashCode()
            X.C56672sN.A00(r4, r0)
        L_0x0018:
            X.2oU r1 = r6.A0B
            r0 = 2131889283(0x7f120c83, float:1.9413225E38)
            java.lang.String r5 = X.C54292oU.A04(r1, r0)
            X.1ip r0 = r6.A04
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x004e
            r0 = 2131889282(0x7f120c82, float:1.9413223E38)
        L_0x002c:
            java.lang.String r5 = X.C54292oU.A04(r1, r0)
        L_0x0030:
            if (r7 == 0) goto L_0x0048
            X.21V r0 = X.AnonymousClass21V.A02
            java.lang.String r0 = r0.key
            java.util.Map r3 = X.C52632ln.A00(r0, r5)
            java.lang.Integer r2 = X.AnonymousClass0x7.A0f()
            java.lang.String r1 = "ExtensionError"
            X.2z6 r0 = new X.2z6
            r0.<init>(r2, r1, r5)
            r7.BSv(r0, r3)
        L_0x0048:
            X.8vZ r0 = r4.A05
            r0.Bko()
            return
        L_0x004e:
            java.lang.String r0 = "extensions-banned-id-error"
            boolean r0 = X.C162457s7.A0P(r8, r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = X.C162457s7.A0P(r8, r3)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "extensions-integrity-check-failed"
            boolean r0 = X.C162457s7.A0P(r8, r0)
            if (r0 == 0) goto L_0x0030
        L_0x0064:
            r0 = 2131889286(0x7f120c86, float:1.9413231E38)
            goto L_0x002c
        L_0x0068:
            int r1 = r6.A00
            java.lang.String r0 = "error_message"
            r4.A04(r1, r0, r8)
            int r0 = r6.A00
            r2 = 3
            r4.A06(r0, r2)
            X.1Uc r4 = r6.A0L
            int r1 = r9.hashCode()
            r0 = 0
            r4.A0C(r1, r8, r0)
            r4.A0D(r1, r2)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines.A09(X.4DQ, java.lang.String, java.lang.String):void");
    }

    public final boolean A0A(C54052o6 r15, C53832nk r16, C41572Kt r17, AnonymousClass4DQ r18) {
        String str;
        C370820w A012 = this.A0I.A01(r17.A00, r16, r15.A06);
        if (A012.ordinal() == 0) {
            return false;
        }
        if (A012 == C370820w.UNKNOWN_VERSION) {
            str = "extensions-metadata-unknown-version";
        } else {
            str = "extensions-metadata-not-compatible";
        }
        String str2 = r15.A05;
        A09(r18, str, str2);
        C60032xt r2 = this.A08;
        UserJid userJid = r15.A02;
        String str3 = r15.A08;
        String str4 = r15.A09;
        r2.A02(this.A06, this.A0F, this.A0G, userJid, Boolean.valueOf(r15.A0C), "galaxy_message", str2, str3, str4, str, (String) null);
        return true;
    }
}
