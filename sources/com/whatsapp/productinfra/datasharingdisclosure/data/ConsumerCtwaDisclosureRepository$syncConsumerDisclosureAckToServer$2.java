package com.whatsapp.productinfra.datasharingdisclosure.data;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C30161lx;
import X.C30171ly;
import X.C46522bm;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.content.SharedPreferences;
import com.whatsapp.productinfra.datasharingdisclosure.data.network.ConsumerCtwaDisclosureProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.datasharingdisclosure.data.ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2", f = "ConsumerCtwaDisclosureRepository.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C46522bm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(C46522bm r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        SharedPreferences.Editor putBoolean;
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            long A0A = AnonymousClass0x2.A0A(C18310x6.A0F(this.this$0.A02.A01), "consumer_disclosure");
            boolean A1W = C18280x3.A1W(C18310x6.A0F(this.this$0.A02.A01), "ack_synced");
            if (A0A != -1 && !A1W) {
                ConsumerCtwaDisclosureProtocolHelper consumerCtwaDisclosureProtocolHelper = this.this$0.A01;
                this.label = 1;
                obj = consumerCtwaDisclosureProtocolHelper.A00(this, A0A);
                if (obj == r7) {
                    return r7;
                }
            }
            return C59022wD.A00;
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (C162457s7.A0P(obj, C30171ly.A00)) {
            putBoolean = C18270x1.A04(this.this$0.A02.A01).putBoolean("ack_synced", true);
        } else {
            if (C162457s7.A0P(obj, C30161lx.A00)) {
                putBoolean = C18270x1.A04(this.this$0.A02.A01).putBoolean("ack_synced", false);
            }
            return C59022wD.A00;
        }
        putBoolean.apply();
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(this.this$0, (C84814Du) obj2));
    }
}
