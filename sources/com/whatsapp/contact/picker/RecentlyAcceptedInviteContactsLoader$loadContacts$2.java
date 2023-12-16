package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C1215460y;
import X.C1221263e;
import X.C57682u2;
import X.C59022wD;
import X.C73723fy;
import X.C75003pT;
import X.C829345m;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader$loadContacts$2", f = "RecentlyAcceptedInviteContactsLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentlyAcceptedInviteContactsLoader$loadContacts$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ RecentlyAcceptedInviteContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentlyAcceptedInviteContactsLoader$loadContacts$2(RecentlyAcceptedInviteContactsLoader recentlyAcceptedInviteContactsLoader, C84814Du r3) {
        super(r3, 2);
        this.this$0 = recentlyAcceptedInviteContactsLoader;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return C829345m.A03(C829345m.A04(C1221263e.A00, C829345m.A05(new C1215460y(this.this$0), C73723fy.A0R(this.this$0.A01.A00()))));
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this.this$0, (C84814Du) obj2));
    }
}
