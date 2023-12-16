package X;

import android.webkit.WebMessagePort;
import org.json.JSONObject;

/* renamed from: X.2ok  reason: invalid class name and case insensitive filesystem */
public abstract class C54452ok {
    public WebMessagePort A00;
    public JSONObject A01 = AnonymousClass0x9.A1G();

    public final void A03(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        Object obj = this.A01.get("method");
        C18260x0.A1P(AnonymousClass001.A0o(), "ExtensionsLogger/FlowsWebBridgeCallable/postWebMessage -- ", obj);
        jSONObject.put("method", obj).put("callbackID", this.A01.get("callbackID"));
        AnonymousClass26o.A00(new C80633yY(this, jSONObject));
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.C84814Du r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass1Us
            if (r0 == 0) goto L_0x0021
            r2 = r12
            X.1Us r2 = (X.AnonymousClass1Us) r2
            java.lang.String r0 = r2.A04
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x001e
            X.4FS r1 = r2.A01
            r0 = 20
            X.C69993Zl.A00(r1, r2, r0)
        L_0x001e:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0021:
            boolean r0 = r12 instanceof X.C23771Uq
            if (r0 == 0) goto L_0x004f
            r3 = r12
            X.1Uq r3 = (X.C23771Uq) r3
            org.json.JSONObject r1 = r3.A01
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "name"
            java.lang.String r0 = "UNKNOWN"
            r2.optString(r1, r0)
            X.2n9 r0 = r3.A01
            if (r0 == 0) goto L_0x001e
            X.1Uc r1 = r3.A00
            java.lang.String r3 = r0.A02
            java.lang.String r4 = r0.A04
            java.lang.String r5 = r0.A05
            com.whatsapp.jid.UserJid r2 = r0.A01
            java.lang.String r6 = "bloks_cta"
            java.lang.String r7 = "web"
            r1.A0E(r2, r3, r4, r5, r6, r7)
            goto L_0x001e
        L_0x004f:
            boolean r0 = r12 instanceof X.C23761Up
            if (r0 == 0) goto L_0x0076
            r3 = r12
            X.1Up r3 = (X.C23761Up) r3
            org.json.JSONObject r1 = r3.A01
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "name"
            java.lang.String r0 = "UNKNOWN"
            java.lang.String r2 = r2.optString(r1, r0)
            X.1Uc r1 = r3.A01
            int r0 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r0)
            X.C162457s7.A0H(r2)
            r1.A09(r0, r2)
            goto L_0x001e
        L_0x0076:
            boolean r0 = r12 instanceof X.C23751Uo
            if (r0 == 0) goto L_0x0095
            r3 = r12
            X.1Uo r3 = (X.C23751Uo) r3
            org.json.JSONObject r1 = r3.A01
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r1.getJSONObject(r0)
            java.lang.String r1 = "action"
            r0 = 3
            int r0 = r2.optInt(r1, r0)
            short r2 = (short) r0
            X.1Uc r1 = r3.A01
            int r0 = r3.A00
            r1.A0D(r0, r2)
            goto L_0x001e
        L_0x0095:
            boolean r0 = r12 instanceof X.C23741Un
            if (r0 == 0) goto L_0x0193
            r9 = r12
            X.1Un r9 = (X.C23741Un) r9
            org.json.JSONObject r1 = r9.A01
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            java.util.Map r1 = X.AnonymousClass31O.A02(r0)
            int r0 = r1.size()
            int r0 = X.AnonymousClass8UG.A0I(r0)
            java.util.LinkedHashMap r8 = X.C18330xA.A0C(r0)
            java.util.Iterator r10 = X.AnonymousClass0x9.A16(r1)
        L_0x00b8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x001e
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r10)
            java.lang.Object r7 = r0.getKey()
            java.lang.String r3 = X.C18310x6.A0q(r0)
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L_0x018c
            if (r3 == 0) goto L_0x018c
            int r1 = r3.hashCode()
            r0 = -958754891(0xffffffffc6da8fb5, float:-27975.854)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            if (r1 == r0) goto L_0x0154
            r0 = -655245741(0xffffffffd8f1be53, float:-2.12639791E15)
            if (r1 == r0) goto L_0x0121
            r0 = 687985114(0x2901d1da, float:2.882577E-14)
            if (r1 != r0) goto L_0x018c
            java.lang.String r0 = "boolAnnotations"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x018c
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r2)
        L_0x00f8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x018c
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            X.1Uc r2 = r9.A01
            int r1 = r9.A00
            X.C162457s7.A0K(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C162457s7.A0K(r3, r0)
            boolean r0 = X.AnonymousClass001.A1Z(r3)
            r2.A05(r1, r4, r0)
            goto L_0x00f8
        L_0x0121:
            java.lang.String r0 = "stringAnnotations"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x018c
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r2)
        L_0x0130:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x018c
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r4)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            X.1Uc r1 = r9.A01
            int r0 = r9.A00
            X.C162457s7.A0K(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            X.C162457s7.A0K(r2, r6)
            java.lang.String r2 = (java.lang.String) r2
            r1.A04(r0, r3, r2)
            goto L_0x0130
        L_0x0154:
            java.lang.String r0 = "intAnnotations"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x018c
            java.util.Map r2 = (java.util.Map) r2
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r2)
        L_0x0162:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x018c
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            X.1Uc r3 = r9.A01
            int r2 = r9.A00
            X.C162457s7.A0K(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C162457s7.A0K(r1, r0)
            int r0 = X.AnonymousClass001.A0K(r1)
            long r0 = (long) r0
            r3.A03(r2, r4, r0)
            goto L_0x0162
        L_0x018c:
            X.2wD r0 = X.C59022wD.A00
            r8.put(r7, r0)
            goto L_0x00b8
        L_0x0193:
            boolean r0 = r12 instanceof X.C23731Um
            if (r0 == 0) goto L_0x01ee
            r2 = r12
            X.1Um r2 = (X.C23731Um) r2
            org.json.JSONObject r1 = r2.A01
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r1.getJSONObject(r0)
            java.lang.String r0 = "disable_cta"
            boolean r0 = r1.optBoolean(r0)
            if (r0 == 0) goto L_0x001e
            X.34x r6 = r2.A01
            X.3Lv r7 = r2.A00
        L_0x01ae:
            r5 = 1
            java.lang.String r4 = "galaxy_message"
            boolean r0 = r6 instanceof X.AnonymousClass4DV
            r3 = 0
            if (r0 == 0) goto L_0x001e
            r0 = r6
            X.4DV r0 = (X.AnonymousClass4DV) r0
            if (r0 == 0) goto L_0x001e
            X.39W r2 = r0.B5s()
            if (r2 == 0) goto L_0x001e
            int r1 = r2.A00
            r0 = 5
            if (r1 != r0) goto L_0x001e
            X.39P r0 = r2.A03
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x01e9
            java.util.Iterator r2 = r0.iterator()
        L_0x01d2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AnonymousClass395.A00(r1, r4)
            if (r0 == 0) goto L_0x01d2
            r3 = r1
        L_0x01e3:
            X.395 r3 = (X.AnonymousClass395) r3
            if (r3 == 0) goto L_0x01e9
            r3.A00 = r5
        L_0x01e9:
            r7.A0Y(r6)
            goto L_0x001e
        L_0x01ee:
            boolean r0 = r12 instanceof com.whatsapp.extensions.webview.bridge.factory.FlowsGetPublicKey
            if (r0 == 0) goto L_0x0279
            r6 = r12
            com.whatsapp.extensions.webview.bridge.factory.FlowsGetPublicKey r6 = (com.whatsapp.extensions.webview.bridge.factory.FlowsGetPublicKey) r6
            boolean r0 = r13 instanceof X.C74463hA
            if (r0 == 0) goto L_0x0273
            r9 = r13
            X.3hA r9 = (X.C74463hA) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0273
            int r2 = r2 - r1
            r9.label = r2
        L_0x0207:
            java.lang.Object r3 = r9.result
            X.218 r8 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L_0x024d
            if (r0 != r1) goto L_0x0414
            java.lang.Object r7 = r9.L$1
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r6 = r9.L$0
            X.2ok r6 = (X.C54452ok) r6
            X.C57682u2.A01(r3)
        L_0x021d:
            X.26m r3 = (X.AnonymousClass26m) r3
            boolean r0 = r3 instanceof X.C23671Uf
            java.lang.String r2 = "responseData"
            if (r0 == 0) goto L_0x023e
            X.1Uf r3 = (X.C23671Uf) r3
            java.lang.Object r1 = r3.A00
            java.lang.String r0 = "public_key"
        L_0x022d:
            org.json.JSONObject r0 = X.C18300x5.A0z(r1, r0, r7)
            org.json.JSONObject r0 = r0.put(r2, r7)
            X.C162457s7.A0H(r0)
            r6.A03(r0)
        L_0x023b:
            X.2wD r8 = X.C59022wD.A00
            return r8
        L_0x023e:
            boolean r0 = r3 instanceof X.C23661Ue
            if (r0 == 0) goto L_0x023b
            X.1Ue r3 = (X.C23661Ue) r3
            java.lang.String r1 = r3.A00
            if (r1 != 0) goto L_0x024a
            java.lang.String r1 = "UNKNOWN"
        L_0x024a:
            java.lang.String r0 = "error_key"
            goto L_0x022d
        L_0x024d:
            X.C57682u2.A01(r3)
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository r5 = r6.A00
            X.2n9 r0 = r5.A00
            if (r0 == 0) goto L_0x023b
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1G()
            com.whatsapp.jid.UserJid r4 = r0.A01
            boolean r3 = r6.A01
            r9.L$0 = r6
            r9.L$1 = r7
            r9.label = r1
            X.3gB r2 = r5.A0I
            r1 = 0
            com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2 r0 = new com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository$getPublicKey$2
            r0.<init>(r5, r4, r1, r3)
            java.lang.Object r3 = X.C616131n.A00(r9, r2, r0)
            if (r3 != r8) goto L_0x021d
            return r8
        L_0x0273:
            X.3hA r9 = new X.3hA
            r9.<init>(r6, r13)
            goto L_0x0207
        L_0x0279:
            boolean r0 = r12 instanceof X.C23721Uk
            if (r0 == 0) goto L_0x0295
            r3 = r12
            X.1Uk r3 = (X.C23721Uk) r3
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "responseData"
            org.json.JSONObject r0 = r3.A00
            org.json.JSONObject r0 = r2.put(r1, r0)
            X.C162457s7.A0H(r0)
            r3.A03(r0)
            goto L_0x001e
        L_0x0295:
            boolean r0 = r12 instanceof X.C23711Uj
            if (r0 == 0) goto L_0x038e
            r5 = r12
            X.1Uj r5 = (X.C23711Uj) r5
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1G()
            org.json.JSONObject r1 = r5.A01
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            if (r0 == 0) goto L_0x03ea
            java.util.Map r1 = X.AnonymousClass31O.A02(r0)
            int r0 = r1.size()
            int r0 = X.AnonymousClass8UG.A0I(r0)
            java.util.LinkedHashMap r7 = X.C18330xA.A0C(r0)
            java.util.Iterator r11 = X.AnonymousClass0x9.A16(r1)
        L_0x02be:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03e4
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r11)
            java.lang.Object r8 = r0.getKey()
            java.lang.String r9 = X.C18310x6.A0q(r0)
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L_0x0389
            java.util.Map r2 = (java.util.Map) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r2)
            java.lang.String r0 = "type"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "defaultValue"
            java.lang.Object r10 = r2.get(r3)
            if (r10 != 0) goto L_0x02f8
            java.lang.String r10 = ""
        L_0x02f8:
            X.C162457s7.A0H(r9)
            int r9 = java.lang.Integer.parseInt(r9)
            int r0 = r1.hashCode()     // Catch:{ IllegalArgumentException -> 0x0369 }
            switch(r0) {
                case -891985903: goto L_0x0307;
                case 104431: goto L_0x0319;
                case 3029738: goto L_0x032e;
                case 3271912: goto L_0x0343;
                case 97526364: goto L_0x0354;
                default: goto L_0x0306;
            }     // Catch:{ IllegalArgumentException -> 0x0369 }
        L_0x0306:
            goto L_0x037b
        L_0x0307:
            java.lang.String r0 = "string"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0369 }
            if (r0 == 0) goto L_0x037b
            X.1VX r1 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0369 }
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IllegalArgumentException -> 0x0369 }
            java.lang.String r10 = r1.A0R(r0, r9)     // Catch:{ IllegalArgumentException -> 0x0369 }
            goto L_0x037b
        L_0x0319:
            java.lang.String r0 = "int"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0369 }
            if (r0 == 0) goto L_0x037b
            X.1VX r1 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0369 }
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IllegalArgumentException -> 0x0369 }
            int r0 = r1.A0O(r0, r9)     // Catch:{ IllegalArgumentException -> 0x0369 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0369 }
            goto L_0x037b
        L_0x032e:
            java.lang.String r0 = "bool"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0369 }
            if (r0 == 0) goto L_0x037b
            X.1VX r1 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0369 }
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IllegalArgumentException -> 0x0369 }
            boolean r0 = r1.A0Y(r0, r9)     // Catch:{ IllegalArgumentException -> 0x0369 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0369 }
            goto L_0x037b
        L_0x0343:
            java.lang.String r0 = "json"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0369 }
            if (r0 == 0) goto L_0x037b
            X.1VX r1 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0369 }
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IllegalArgumentException -> 0x0369 }
            org.json.JSONObject r10 = r1.A0T(r0, r9)     // Catch:{ IllegalArgumentException -> 0x0369 }
            goto L_0x037b
        L_0x0354:
            java.lang.String r0 = "float"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0369 }
            if (r0 == 0) goto L_0x037b
            X.1VX r1 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0369 }
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IllegalArgumentException -> 0x0369 }
            float r0 = r1.A0M(r0, r9)     // Catch:{ IllegalArgumentException -> 0x0369 }
            java.lang.Float r10 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0369 }
            goto L_0x037b
        L_0x0369:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/FlowsGetClientAbProps/getABPropVal - ABProp field doesn't exists with code = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " - "
            X.C18260x0.A16(r0, r1, r2)
        L_0x037b:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "value"
            r4.put(r0, r1)
            r4.remove(r3)
            r2 = r4
        L_0x0389:
            r7.put(r8, r2)
            goto L_0x02be
        L_0x038e:
            boolean r0 = r12 instanceof X.C23781Ur
            if (r0 == 0) goto L_0x03fd
            r3 = r12
            X.1Ur r3 = (X.C23781Ur) r3
            org.json.JSONObject r1 = r3.A01
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r1.getJSONObject(r0)
            java.lang.String r0 = "extension_message_response"
            org.json.JSONObject r1 = r1.getJSONObject(r0)
            java.lang.String r0 = "params"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 != 0) goto L_0x03b0
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
        L_0x03b0:
            X.2n9 r2 = r3.A02
            long r10 = r2.A00
            java.lang.String r9 = r2.A02
            java.lang.String r0 = "ACTION_NAME"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            r0 = 0
            if (r1 == 0) goto L_0x03e2
            java.lang.String r0 = "BODY"
            java.lang.String r6 = r1.optString(r0)
            java.lang.String r0 = "PARAMS"
            org.json.JSONObject r0 = r1.optJSONObject(r0)
        L_0x03cb:
            X.33m r4 = r3.A00
            com.whatsapp.jid.UserJid r5 = r2.A01
            if (r6 != 0) goto L_0x03d3
            java.lang.String r6 = ""
        L_0x03d3:
            java.lang.String r7 = "galaxy_message"
            java.lang.String r8 = java.lang.String.valueOf(r0)
            r4.A0J(r5, r6, r7, r8, r9, r10)
            X.34x r6 = r3.A03
            X.3Lv r7 = r3.A01
            goto L_0x01ae
        L_0x03e2:
            r6 = r0
            goto L_0x03cb
        L_0x03e4:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r7)
            goto L_0x03ee
        L_0x03ea:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
        L_0x03ee:
            java.lang.String r0 = "responseData"
            org.json.JSONObject r0 = r6.put(r0, r1)
            X.C162457s7.A0H(r0)
            r5.A03(r0)
            goto L_0x001e
        L_0x03fd:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/FlowsWebBridgeCallable/execute() method not implemented -- "
            r2.append(r0)
            org.json.JSONObject r1 = r12.A01
            java.lang.String r0 = "method"
            java.lang.Object r0 = r1.opt(r0)
            X.C18260x0.A0n(r0, r2)
            goto L_0x001e
        L_0x0414:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54452ok.A01(X.4Du):java.lang.Object");
    }

    public final void A02(WebMessagePort webMessagePort) {
        this.A00 = webMessagePort;
    }

    public final WebMessagePort A00() {
        return this.A00;
    }
}
