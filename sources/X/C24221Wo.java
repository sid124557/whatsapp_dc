package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1Wo  reason: invalid class name and case insensitive filesystem */
public final class C24221Wo extends AnonymousClass3ZG {
    public Boolean A00;

    public void serialize(AnonymousClass4AD r3) {
        C162457s7.A0J(r3, 0);
        r3.Blb(1, this.A00);
    }

    public C24221Wo() {
        super(2098, AnonymousClass0x9.A0T(1, 10, SearchActionVerificationClientService.NOTIFICATION_ID), 1, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(AnonymousClass001.A0f(), this.A00);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamUiActionRealTime {");
        return AnonymousClass3ZG.A0G(this.A00, "chatdInternetConnectivity", A0o);
    }
}
