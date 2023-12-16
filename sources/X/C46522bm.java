package X;

import com.whatsapp.productinfra.datasharingdisclosure.data.network.ConsumerCtwaDisclosureProtocolHelper;

/* renamed from: X.2bm  reason: invalid class name and case insensitive filesystem */
public final class C46522bm {
    public final C56612sH A00;
    public final ConsumerCtwaDisclosureProtocolHelper A01;
    public final C41782Lo A02;
    public final C73853gB A03;
    public final AnonymousClass4C6 A04;

    public C46522bm(C56612sH r2, ConsumerCtwaDisclosureProtocolHelper consumerCtwaDisclosureProtocolHelper, C41782Lo r4, C73853gB r5, AnonymousClass4C6 r6) {
        C18270x1.A11(r2, 1, r4);
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = consumerCtwaDisclosureProtocolHelper;
    }

    public final boolean A00() {
        return AnonymousClass000.A1S((C18310x6.A0F(this.A02.A01).getLong("consumer_disclosure", -1) > -1 ? 1 : (C18310x6.A0F(this.A02.A01).getLong("consumer_disclosure", -1) == -1 ? 0 : -1)));
    }
}
