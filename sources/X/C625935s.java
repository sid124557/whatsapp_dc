package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.35s  reason: invalid class name and case insensitive filesystem */
public class C625935s implements AnonymousClass4DQ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C625935s(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj3;
        this.A01 = obj2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r6.containsKey(X.AnonymousClass21V.A02.key) == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSv(X.C60752z6 r5, java.util.Map r6) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x004c;
                case 2: goto L_0x00aa;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            if (r6 == 0) goto L_0x0022
            java.lang.Object r3 = r4.A02
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines) r3
            java.lang.Object r2 = r4.A00
            X.2o6 r2 = (X.C54052o6) r2
            java.lang.String r1 = "disable_nfm_cta"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x0022
            boolean r0 = X.AnonymousClass0x2.A1Z(r6, r1)
            r3.A08(r2, r0)
        L_0x0022:
            java.lang.Object r0 = r4.A01
            X.4DQ r0 = (X.AnonymousClass4DQ) r0
            if (r0 == 0) goto L_0x002b
            r0.BSv(r5, r6)
        L_0x002b:
            java.lang.Object r3 = r4.A02
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r3 = (com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines) r3
            X.2Fg r0 = r3.A09
            java.util.HashMap r0 = r0.A00
            r0.clear()
            X.1Ua r2 = r3.A0O
            int r1 = r3.A00
            r0 = 3
            r2.A06(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0T
            r0 = 0
            r1.set(r0)
            X.1Uc r0 = r3.A0L
        L_0x0046:
            X.8vZ r0 = r0.A05
            r0.Bko()
        L_0x004b:
            return
        L_0x004c:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsV2Action/execute()/onFailure() - Flow terminated with failure. Error present: "
            r3.append(r0)
            r2 = 0
            if (r6 == 0) goto L_0x0063
            X.21V r0 = X.AnonymousClass21V.A02
            java.lang.String r0 = r0.key
            boolean r1 = r6.containsKey(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            X.C18260x0.A1V(r3, r0)
            java.lang.Object r0 = r4.A02
            X.1QO r0 = (X.AnonymousClass1QO) r0
            X.2nj r1 = r0.A09
            java.lang.String r0 = "flow_error"
            r1.A02(r0, r2)
            if (r6 == 0) goto L_0x00a8
            X.21V r0 = X.AnonymousClass21V.A02
            java.lang.String r0 = r0.key
            java.lang.Object r0 = r6.get(r0)
        L_0x007c:
            boolean r0 = r0 instanceof X.C52632ln
            if (r0 == 0) goto L_0x004b
            X.21V r0 = X.AnonymousClass21V.A02
            java.lang.String r0 = r0.key
            java.lang.Object r3 = r6.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.productinfra.phoenix.api.error.FdsError"
            X.C162457s7.A0K(r3, r0)
            X.2ln r3 = (X.C52632ln) r3
            java.lang.Object r0 = r4.A01
            android.content.Intent r0 = (android.content.Intent) r0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = "extra_error_message"
            java.lang.String r0 = r3.A01
            r2.putExtra(r1, r0)
            java.lang.Object r0 = r4.A00
            android.content.Context r0 = (android.content.Context) r0
            r0.startActivity(r2)
            return
        L_0x00a8:
            r0 = 0
            goto L_0x007c
        L_0x00aa:
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            if (r6 == 0) goto L_0x00c7
            java.lang.Object r3 = r4.A02
            X.30j r3 = (X.C613530j) r3
            java.lang.Object r2 = r4.A00
            X.2o6 r2 = (X.C54052o6) r2
            java.lang.String r1 = "disable_nfm_cta"
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x00c7
            boolean r0 = X.AnonymousClass0x2.A1Z(r6, r1)
            r3.A05(r2, r0)
        L_0x00c7:
            java.lang.Object r0 = r4.A01
            X.4DQ r0 = (X.AnonymousClass4DQ) r0
            if (r0 == 0) goto L_0x00d0
            r0.BSv(r5, r6)
        L_0x00d0:
            java.lang.Object r3 = r4.A02
            X.30j r3 = (X.C613530j) r3
            X.2Fg r0 = r3.A0A
            java.util.HashMap r0 = r0.A00
            r0.clear()
            X.1Ua r2 = r3.A0P
            int r1 = r3.A00
            r0 = 3
            r2.A06(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A0V
            r0 = 0
            r1.set(r0)
            X.1Uc r0 = r3.A0M
            goto L_0x0046
        L_0x00ed:
            r0 = 1
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r5, r0)
            java.lang.String r0 = "bonsaiblokslauncher/flow failure: error="
            X.C18260x0.A1Q(r1, r0, r5)
            java.lang.Object r0 = r4.A00
            X.2NB r0 = (X.AnonymousClass2NB) r0
            X.2hm r0 = r0.A01
            X.3Wi r0 = r0.A00
            r0.A0D()
            java.lang.Object r0 = r4.A02
            X.2PY r0 = (X.AnonymousClass2PY) r0
            X.3Wi r2 = r0.A01
            r1 = 2131892618(0x7f12198a, float:1.941999E38)
            r0 = 0
            r2.A0H(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625935s.BSv(X.2z6, java.util.Map):void");
    }

    public void BdH(Map map) {
        boolean z;
        short s;
        AnonymousClass1Uc r2;
        String str;
        AnonymousClass1Uc r22;
        AtomicBoolean atomicBoolean;
        Map map2;
        Object obj;
        Map map3;
        Object obj2;
        String str2;
        Object obj3;
        Boolean bool;
        AnonymousClass2XY r4;
        long j;
        short s2;
        String str3;
        Map map4;
        Object obj4;
        Map map5;
        Object obj5;
        String str4;
        Object obj6;
        Boolean bool2;
        switch (this.A03) {
            case 0:
                if (map == null) {
                    AnonymousClass4FV r3 = ((AnonymousClass2PY) this.A02).A02;
                    AnonymousClass1ZN r23 = new AnonymousClass1ZN();
                    r23.A00 = 34;
                    r23.A02 = 36;
                    r23.A01 = (Integer) this.A01;
                    r3.BhD(r23);
                    AnonymousClass2NB r1 = (AnonymousClass2NB) this.A00;
                    C54862pP r5 = r1.A01.A03;
                    int A022 = C18320x8.A02(r1.A02, 0);
                    if (A022 != 0) {
                        if (A022 == 1 && r5.A01() && !r5.A00()) {
                            r4 = null;
                            j = 20230901;
                        } else {
                            return;
                        }
                    } else if (r5.A00() && !r5.A01()) {
                        r4 = null;
                        j = 20230902;
                    } else {
                        return;
                    }
                    r5.A01.A00(new AnonymousClass3EQ(r4, r5, j), j);
                    return;
                } else if (map.get("bonsai_tos_accepted_type") != null) {
                    AnonymousClass4FV r32 = ((AnonymousClass2PY) this.A02).A02;
                    AnonymousClass1ZN r24 = new AnonymousClass1ZN();
                    r24.A00 = 33;
                    r24.A02 = 36;
                    r24.A01 = (Integer) this.A01;
                    r32.BhD(r24);
                    ((AnonymousClass2NB) this.A00).A00.BeE(true);
                    return;
                } else {
                    Object obj7 = map.get(AnonymousClass21V.A02.key);
                    if (obj7 instanceof C52632ln) {
                        C52632ln r42 = (C52632ln) obj7;
                        BSv(new C60752z6(Integer.valueOf((int) r42.A00), "IQ_ERROR", r42.A01), map);
                        return;
                    }
                    return;
                }
            case 1:
                Log.i("ExtensionsLogger/ExtensionsV2Action/execute()/onSuccess() - Flow terminated successfully");
                if (map == null) {
                    ((AnonymousClass1QO) this.A02).A09.A02("user_interrupted", true);
                    return;
                }
                return;
            case 2:
                AnonymousClass4DQ r0 = (AnonymousClass4DQ) this.A01;
                if (r0 != null) {
                    r0.BdH(map);
                }
                C613530j r43 = (C613530j) this.A02;
                r43.A0A.A00.clear();
                z = false;
                boolean z2 = true;
                if (map != null && !map.isEmpty() && map.containsKey("data")) {
                    Object obj8 = map.get("data");
                    if ((obj8 instanceof Map) && (map2 = (Map) obj8) != null && map2.containsKey("extension_message_response") && (map2.get("extension_message_response") instanceof Map) && AnonymousClass0x7.A0z("extension_message_response", map2).containsKey("params")) {
                        Object obj9 = map.get("data_channel_navigation");
                        if ((obj9 instanceof Boolean) && (bool = (Boolean) obj9) != null) {
                            z2 = bool.booleanValue();
                        }
                        C54052o6 r33 = (C54052o6) this.A00;
                        Map A1B = AnonymousClass0x9.A1B("data", map);
                        Map map6 = null;
                        if (A1B != null) {
                            obj = A1B.get("extension_message_response");
                        } else {
                            obj = null;
                        }
                        if (obj instanceof Map) {
                            map3 = (Map) obj;
                            if (map3 != null) {
                                obj2 = map3.get("body");
                            }
                            obj2 = null;
                        } else {
                            map3 = null;
                            obj2 = null;
                        }
                        if (obj2 instanceof String) {
                            str2 = (String) obj2;
                        } else {
                            str2 = null;
                        }
                        if (map3 != null) {
                            obj3 = map3.get("params");
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof Map) {
                            map6 = (Map) obj3;
                        }
                        JSONObject jSONObject = new JSONObject(map6);
                        C621033m r6 = (C621033m) r43.A0U.get();
                        UserJid userJid = r33.A02;
                        long j2 = r33.A01;
                        if (str2 == null) {
                            str2 = "";
                        }
                        r6.A0J(userJid, str2, "galaxy_message", jSONObject.toString(), r33.A06, j2);
                        r43.A0T.BkM(new C117665sI(r43, r33, 17, z2));
                        s = 2;
                        r43.A0P.A06(r43.A00, 2);
                        r2 = r43.A0M;
                        str = r33.A05;
                        r22.A0D(str.hashCode(), s);
                        atomicBoolean = r43.A0V;
                        break;
                    }
                }
                s = 22;
                r43.A0P.A06(r43.A00, 22);
                r2 = r43.A0M;
                str = ((C54052o6) this.A00).A05;
                r22.A0D(str.hashCode(), s);
                atomicBoolean = r43.A0V;
            default:
                AnonymousClass4DQ r02 = (AnonymousClass4DQ) this.A01;
                if (r02 != null) {
                    r02.BdH(map);
                }
                PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = (PhoenixExtensionFlowManagerWithCoroutines) this.A02;
                phoenixExtensionFlowManagerWithCoroutines.A09.A00.clear();
                z = false;
                boolean z3 = true;
                if (map != null && !map.isEmpty() && map.containsKey("data")) {
                    Object obj10 = map.get("data");
                    if ((obj10 instanceof Map) && (map4 = (Map) obj10) != null && map4.containsKey("extension_message_response") && (map4.get("extension_message_response") instanceof Map) && AnonymousClass0x7.A0z("extension_message_response", map4).containsKey("params")) {
                        Object obj11 = map.get("data_channel_navigation");
                        if ((obj11 instanceof Boolean) && (bool2 = (Boolean) obj11) != null) {
                            z3 = bool2.booleanValue();
                        }
                        C54052o6 r34 = (C54052o6) this.A00;
                        Map A1B2 = AnonymousClass0x9.A1B("data", map);
                        Map map7 = null;
                        if (A1B2 != null) {
                            obj4 = A1B2.get("extension_message_response");
                        } else {
                            obj4 = null;
                        }
                        if (obj4 instanceof Map) {
                            map5 = (Map) obj4;
                            if (map5 != null) {
                                obj5 = map5.get("body");
                            }
                            obj5 = null;
                        } else {
                            map5 = null;
                            obj5 = null;
                        }
                        if (obj5 instanceof String) {
                            str4 = (String) obj5;
                        } else {
                            str4 = null;
                        }
                        if (map5 != null) {
                            obj6 = map5.get("params");
                        } else {
                            obj6 = null;
                        }
                        if (obj6 instanceof Map) {
                            map7 = (Map) obj6;
                        }
                        JSONObject jSONObject2 = new JSONObject(map7);
                        C621033m r62 = (C621033m) phoenixExtensionFlowManagerWithCoroutines.A0S.get();
                        UserJid userJid2 = r34.A02;
                        long j3 = r34.A01;
                        if (str4 == null) {
                            str4 = "";
                        }
                        r62.A0J(userJid2, str4, "galaxy_message", jSONObject2.toString(), r34.A06, j3);
                        phoenixExtensionFlowManagerWithCoroutines.A06(r34, 2, z3);
                        phoenixExtensionFlowManagerWithCoroutines.A08(r34, true);
                        s2 = 2;
                        phoenixExtensionFlowManagerWithCoroutines.A0O.A06(phoenixExtensionFlowManagerWithCoroutines.A00, 2);
                        r22 = phoenixExtensionFlowManagerWithCoroutines.A0L;
                        str3 = r34.A05;
                        r22.A0D(str3.hashCode(), s2);
                        atomicBoolean = phoenixExtensionFlowManagerWithCoroutines.A0T;
                        break;
                    }
                }
                s2 = 22;
                phoenixExtensionFlowManagerWithCoroutines.A0O.A06(phoenixExtensionFlowManagerWithCoroutines.A00, 22);
                r22 = phoenixExtensionFlowManagerWithCoroutines.A0L;
                str3 = ((C54052o6) this.A00).A05;
                r22.A0D(str3.hashCode(), s2);
                atomicBoolean = phoenixExtensionFlowManagerWithCoroutines.A0T;
        }
        atomicBoolean.set(z);
        r22.A05.Bko();
    }
}
