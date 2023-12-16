package com.whatsapp.calling.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass2SI;
import X.AnonymousClass4GR;
import X.C22391Mx;
import X.C27161dN;
import X.C50792im;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchARClass$2", f = "PersonalizedAvatarRepository.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class PersonalizedAvatarRepository$fetchARClass$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ PersonalizedAvatarRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizedAvatarRepository$fetchARClass$2(PersonalizedAvatarRepository personalizedAvatarRepository, C84814Du r3) {
        super(r3, 2);
        this.this$0 = personalizedAvatarRepository;
    }

    public final Object A09(Object obj) {
        int i;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C57682u2.A01(obj);
            PersonalizedAvatarRepository personalizedAvatarRepository = this.this$0;
            C27161dN r0 = personalizedAvatarRepository.A00;
            this.label = 1;
            obj = personalizedAvatarRepository.A00(r0, "PersonalizedAvatarRepository/fetchARClass", this);
            if (obj == r4) {
                return r4;
            }
        } else if (i2 == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C50792im r02 = (C50792im) this.this$0.A01((AnonymousClass2SI) obj, "PersonalizedAvatarRepository/fetchARClass");
        if (r02 != null) {
            List list = r02.A00.A00;
            if (list.size() > 1) {
                i = AnonymousClass000.A09(list, 1);
            } else {
                i = 0;
            }
            return AnonymousClass0x9.A0k(i);
        }
        throw C22391Mx.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new PersonalizedAvatarRepository$fetchARClass$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new PersonalizedAvatarRepository$fetchARClass$2(this.this$0, (C84814Du) obj2));
    }
}
