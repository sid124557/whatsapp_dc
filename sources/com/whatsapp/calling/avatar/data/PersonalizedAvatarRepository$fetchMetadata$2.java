package com.whatsapp.calling.avatar.data;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2SI;
import X.AnonymousClass305;
import X.AnonymousClass4GR;
import X.C41292Jr;
import X.C50762ij;
import X.C50812io;
import X.C50822ip;
import X.C57682u2;
import X.C59022wD;
import X.C67293Os;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import X.C86524Kl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchMetadata$2", f = "PersonalizedAvatarRepository.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class PersonalizedAvatarRepository$fetchMetadata$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ PersonalizedAvatarRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizedAvatarRepository$fetchMetadata$2(PersonalizedAvatarRepository personalizedAvatarRepository, C84814Du r3) {
        super(r3, 2);
        this.this$0 = personalizedAvatarRepository;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r1 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C41292Jr r4 = this.this$0.A02;
            C67293Os B03 = r4.A01.B03(new C86524Kl(r4, 0));
            PersonalizedAvatarRepository personalizedAvatarRepository = this.this$0;
            this.label = 1;
            obj = personalizedAvatarRepository.A00(B03, "PersonalizedAvatarRepository/fetchMetadata", this);
            if (obj == r1) {
                return r1;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C50822ip r0 = (C50822ip) this.this$0.A01((AnonymousClass2SI) obj, "PersonalizedAvatarRepository/fetchMetadata");
        AnonymousClass305 r12 = null;
        if (r0 == null) {
            return null;
        }
        C50812io r02 = (C50812io) C73723fy.A04(r0.A00);
        if (r02 != null) {
            r12 = (AnonymousClass305) C73723fy.A04(r02.A00.A01);
        }
        return new C50762ij(r12);
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new PersonalizedAvatarRepository$fetchMetadata$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new PersonalizedAvatarRepository$fetchMetadata$2(this.this$0, (C84814Du) obj2));
    }
}
