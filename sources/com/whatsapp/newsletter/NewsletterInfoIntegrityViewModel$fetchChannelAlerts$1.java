package com.whatsapp.newsletter;

import X.AnonymousClass001;
import X.AnonymousClass10Y;
import X.AnonymousClass3RJ;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C28491gy;
import X.C56842se;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterInfoIntegrityViewModel$fetchChannelAlerts$1", f = "NewsletterInfoIntegrityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterInfoIntegrityViewModel$fetchChannelAlerts$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass10Y this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoIntegrityViewModel$fetchChannelAlerts$1(AnonymousClass10Y r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass10Y r1 = this.this$0;
            C56842se r0 = r1.A06;
            C95804uY r2 = r1.A03;
            AnonymousClass3RJ r3 = new AnonymousClass3RJ(r1);
            C162457s7.A0J(r2, 0);
            r0.A07.A02(new C28491gy(r2, r3, true, true, false));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterInfoIntegrityViewModel$fetchChannelAlerts$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterInfoIntegrityViewModel$fetchChannelAlerts$1(this.this$0, (C84814Du) obj2));
    }
}
