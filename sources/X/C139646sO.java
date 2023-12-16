package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.6sO  reason: invalid class name and case insensitive filesystem */
public final class C139646sO extends C41032Ir {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"business", "business_search", "calling", "channels", "cross_app_integrations", "data_management", "growth_broadcast", "infra", "integrity", "messaging", "new_devices", "other", "platforms_delivery", "privacy", "rich_messaging", "sharing", "support_experience", "ui_redesign", "whatsapp_ai_agents", "whatsapp_vr"});

    public C139646sO(String str) {
        C56052rL r3 = new C56052rL("category");
        ArrayList arrayList = A00;
        if (!arrayList.contains(str)) {
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = TextUtils.join(", ", arrayList);
            C626936e.A0D(false, String.format("String was expected to be one of '%s'.", A0L));
        }
        r3.A0J(str);
        this.A00 = r3.A0F();
    }
}
