package X;

import com.whatsapp.bonsai.sync.discovery.DiscoveryBots;
import com.whatsapp.bonsai.sync.discovery.DiscoveryBotsSerializer;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.2Xa  reason: invalid class name and case insensitive filesystem */
public final class C44672Xa {
    public final AnonymousClass7KQ A00;
    public volatile DiscoveryBots A01;

    public C44672Xa(AnonymousClass7KQ r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final DiscoveryBots A00() {
        if (this.A01 != null) {
            return this.A01;
        }
        String A0v = AnonymousClass0x9.A0v(AnonymousClass0x2.A0F(this.A00.A00), "bonsai_bots_response");
        C162457s7.A0D(A0v);
        if (AnonymousClass000.A1T(A0v.length())) {
            return null;
        }
        try {
            this.A01 = DiscoveryBotsSerializer.A00.B3a(AnonymousClass0x9.A1H(A0v));
            return this.A01;
        } catch (JSONException e) {
            Log.d("discoverybotstore/getdiscoverybots exception", e);
            return null;
        }
    }
}
