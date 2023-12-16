package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1us  reason: invalid class name and case insensitive filesystem */
public final class C34311us extends C47762dm {
    public final C54292oU A00;
    public final C59652xG A01;
    public final AnonymousClass2WJ A02;
    public final AnonymousClass1Uc A03;
    public final AnonymousClass2GN A04;
    public final AnonymousClass4FS A05;

    public void A00(C84714Dk r29, Map map) {
        String str;
        int i;
        Map map2;
        List list;
        String str2;
        String str3;
        AbstractMap abstractMap;
        Object obj;
        C84714Dk r5 = r29;
        Log.d("FlowNavigateActionHandler/handleAction: Flow navigate action handler invoked.");
        HashMap A0t = AnonymousClass001.A0t();
        Map map3 = map;
        Object obj2 = map3.get("action_payload");
        C162457s7.A0K(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map map4 = (Map) obj2;
        C162457s7.A0J(map4, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map4);
        Object obj3 = linkedHashMap.get("next");
        C162457s7.A0K(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Object obj4 = ((Map) obj3).get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        Object obj5 = linkedHashMap.get("next");
        C162457s7.A0K(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        boolean A0P = C162457s7.A0P(((Map) obj5).get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "plugin");
        Object obj6 = linkedHashMap.get("next");
        C162457s7.A0K(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        boolean A0P2 = C162457s7.A0P(((Map) obj6).get(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "screen");
        String A0d = AnonymousClass0x2.A0d("extension_id", map3);
        boolean A1Q = AnonymousClass0x9.A1Q(map3.get("is_draft"));
        Object obj7 = map3.get("message_id");
        if (obj7 instanceof String) {
            str = (String) obj7;
        } else {
            str = null;
        }
        String A0c = AnonymousClass0x2.A0c("session_id", map3);
        if (A0P) {
            AnonymousClass2GN r11 = this.A04;
            String valueOf = String.valueOf(obj4);
            C162457s7.A0J(valueOf, 0);
            r11.A00.A01(AnonymousClass0x2.A0T(), "plugin", "plugin_start", valueOf, (String) null);
        }
        Object obj8 = linkedHashMap.get("data");
        if (!(!(obj8 instanceof HashMap) || (abstractMap = (AbstractMap) obj8) == null || (obj = abstractMap.get("external_data")) == null)) {
            A0t.put("external_data", obj);
        }
        if (A0P2) {
            Object obj9 = linkedHashMap.get("data");
            if (!(obj9 instanceof HashMap)) {
                obj9 = null;
            }
            A0t.put("data", obj9);
        } else {
            A0t.put("action_payload", linkedHashMap);
        }
        A0t.put("screen", obj4);
        A0t.put("action_name", map3.get("action"));
        Object obj10 = map3.get("current_screen");
        if (obj10 != null) {
            A0t.put("prev_screen_name", obj10);
        }
        if (A0P2) {
            AnonymousClass1Uc r8 = this.A03;
            int hashCode = A0d.hashCode();
            r8.A05(hashCode, "data_channel_navigation", false);
            Object obj11 = linkedHashMap.get("data");
            if (!(obj11 instanceof HashMap) || obj11 == null) {
                obj11 = C72043d5.A00();
            }
            AnonymousClass3Z6[] r0 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A09("screen", obj4, r0, 0);
            r0[1] = AnonymousClass3Z6.A02("data", obj11);
            Map A0F = C73813g7.A0F(r0);
            if (str == null || A0c == null) {
                i = 2;
            } else {
                i = 2;
                this.A05.BkM(new C70673as(this, A0F, str, A0c, A0d, 1));
            }
            Object obj12 = map3.get("routing_model");
            if (obj12 instanceof Map) {
                map2 = (Map) obj12;
            } else {
                map2 = null;
            }
            String A0c2 = AnonymousClass0x2.A0c("current_screen", map3);
            Object obj13 = map3.get("entry_screens");
            if (obj13 instanceof List) {
                list = (List) obj13;
            } else {
                list = null;
            }
            AnonymousClass2WJ r112 = this.A02;
            if (obj4 != null) {
                str2 = obj4.toString();
            } else {
                str2 = null;
            }
            C370720v A002 = r112.A00(A0c2, str2, A0d, list, map2);
            if (A002 != C370720v.VALID) {
                C54292oU r82 = this.A00;
                String A042 = C54292oU.A04(r82, R.string.f11nameremoved);
                if (A1Q && A002 == C370720v.INVALID_ENTRY_SCREEN) {
                    Object[] objArr = new Object[i];
                    if (obj4 == null || (str3 = obj4.toString()) == null) {
                        str3 = "";
                    }
                    objArr[0] = str3;
                    if (list == null) {
                        list = "";
                    }
                    A042 = C54292oU.A05(r82, list, objArr, 1, R.string.f11nameremoved);
                    C162457s7.A0D(A042);
                }
                Map A003 = C52632ln.A00(AnonymousClass21V.A02.key, A042);
                AnonymousClass3XP r52 = (AnonymousClass3XP) r5;
                C162457s7.A0J("extensions-invalid-screen-transition-error", 0);
                r52.A02.A0A(r52.A01, "extensions-invalid-screen-transition-error", (String) null, A003, r52.A00.A07, false);
                return;
            }
            if (A0c2 == null) {
                A0c2 = "UNKNOWN";
            }
            r8.A04(hashCode, "source_screen_id", A0c2);
            String str4 = (String) obj4;
            if (str4 == null) {
                str4 = "UNKNOWN";
            }
            r8.A04(hashCode, "destination_screen_id", str4);
        }
        AnonymousClass3XP r53 = (AnonymousClass3XP) r5;
        C69263Wi.A07(r53.A02.A05, r53.A01, A0t, 23);
    }

    public C34311us(C54292oU r2, C59652xG r3, AnonymousClass2WJ r4, AnonymousClass1Uc r5, AnonymousClass2GN r6, AnonymousClass4FS r7) {
        C18260x0.A0Q(r7, r2);
        C162457s7.A0J(r3, 5);
        this.A05 = r7;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
    }
}
