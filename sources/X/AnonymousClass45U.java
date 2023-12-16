package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.45U  reason: invalid class name */
public final class AnonymousClass45U extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ C84714Dk $callback;
    public final /* synthetic */ String $currentScreen;
    public final /* synthetic */ Map $input;
    public final /* synthetic */ C34301ur this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String A01;
        Map map;
        Object obj3;
        String str = (String) obj2;
        if (AnonymousClass001.A1Z(obj)) {
            Object obj4 = this.$input.get("flow_token");
            C162457s7.A0K(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = AnonymousClass0x7.A0z("action_payload", this.$input).get("business_payload");
            Map map2 = null;
            if (obj5 instanceof Map) {
                map = (Map) obj5;
            } else {
                map = null;
            }
            if (map != null) {
                obj3 = map.get("data");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof Map) {
                map2 = (Map) obj3;
            }
            Map A0G = C73813g7.A0G(AnonymousClass3Z6.A02("flow_token", obj4));
            if (map2 != null) {
                A0G.putAll(map2);
            }
            AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[3];
            AnonymousClass3Z6.A09("data", C57692u3.A04("extension_message_response", C57692u3.A04("params", A0G)), r2, 0);
            AnonymousClass3Z6.A09("data_channel_navigation", Boolean.FALSE, r2, 1);
            AnonymousClass3Z6.A06("screen", "SUCCESS", r2);
            Map A0F = C73813g7.A0F(r2);
            C84714Dk r1 = this.$callback;
            if (r1 != null) {
                AnonymousClass3XP r12 = (AnonymousClass3XP) r1;
                C69263Wi.A07(r12.A02.A05, r12.A01, A0F, 23);
            }
        } else {
            boolean A0P = C162457s7.A0P(str, "extensions-integrity-check-failed");
            C34301ur r0 = this.this$0;
            if (A0P) {
                A01 = C54292oU.A00(r0.A00).getString(R.string.f11nameremoved);
            } else {
                A01 = r0.A03.A01();
            }
            C162457s7.A0H(A01);
            C84714Dk r13 = this.$callback;
            if (r13 != null) {
                if (str == null) {
                    str = "";
                }
                Map A00 = C59582x9.A00(A01, this.$currentScreen);
                AnonymousClass3XP r14 = (AnonymousClass3XP) r13;
                C162457s7.A0J(str, 0);
                r14.A02.A0A(r14.A01, str, A01, A00, r14.A00.A07, false);
            }
        }
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass45U(C84714Dk r2, C34301ur r3, String str, Map map) {
        super(2);
        this.$input = map;
        this.$callback = r2;
        this.this$0 = r3;
        this.$currentScreen = str;
    }
}
