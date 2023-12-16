package com.whatsapp.calling.avatar.data;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass305;
import X.AnonymousClass32L;
import X.AnonymousClass44V;
import X.AnonymousClass46G;
import X.AnonymousClass4GR;
import X.AnonymousClass5MH;
import X.C18290x4;
import X.C195349Xk;
import X.C46262bL;
import X.C51252jW;
import X.C53392n1;
import X.C53772ne;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C63753Am;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$loadEffect$2", f = "PersonalizedAvatarRepository.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
public final class PersonalizedAvatarRepository$loadEffect$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass305 $arEffect;
    public final /* synthetic */ String $productSessionId;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ PersonalizedAvatarRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizedAvatarRepository$loadEffect$2(PersonalizedAvatarRepository personalizedAvatarRepository, AnonymousClass305 r3, String str, C84814Du r5) {
        super(r5, 2);
        this.$arEffect = r3;
        this.$productSessionId = str;
        this.this$0 = personalizedAvatarRepository;
    }

    public final Object A09(Object obj) {
        Object obj2 = obj;
        AnonymousClass218 r13 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj2);
            AnonymousClass305 r1 = this.$arEffect;
            String str = this.$productSessionId;
            PersonalizedAvatarRepository personalizedAvatarRepository = this.this$0;
            this.L$0 = r1;
            this.L$1 = str;
            this.L$2 = personalizedAvatarRepository;
            this.label = 1;
            AnonymousClass46G A04 = C57702u4.A04(this);
            String str2 = r1.A03;
            C53392n1 r9 = r1.A01;
            C53772ne r12 = r9.A00;
            String str3 = r12.A02;
            String str4 = r12.A07;
            String str5 = r12.A06;
            String str6 = r9.A04;
            long j = (long) r12.A00;
            long j2 = (long) r12.A01;
            ARRequestAsset$CompressionMethod fromString = ARRequestAsset$CompressionMethod.fromString(r12.A03);
            ArrayList A0s = AnonymousClass001.A0s();
            List list = r9.A05;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C51252jW r0 = (C51252jW) list.get(i2);
                VersionedCapability fromServerValue = VersionedCapability.fromServerValue(r0.A01);
                if (fromServerValue != null) {
                    A0s.add(new ARCapabilityMinVersionModeling(fromServerValue, r0.A00));
                }
            }
            String str7 = str2;
            String str8 = str3;
            C195349Xk A01 = C195349Xk.A01(fromString, str7, str8, str4, str5, str6, str3, r9.A02, C73723fy.A0F(A0s), j, j2);
            C46262bL r14 = new C46262bL();
            r14.A03 = str;
            r14.A02 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
            AnonymousClass32L A00 = r14.A00();
            A04.BGs(new AnonymousClass44V(((AnonymousClass5MH) personalizedAvatarRepository.A03.get()).A00().A02(new C63753Am(A04), A00, C18290x4.A12(A01))));
            obj2 = A04.A06();
            if (obj2 == r13) {
                return r13;
            }
        } else if (i == 1) {
            C57682u2.A01(obj2);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj2;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new PersonalizedAvatarRepository$loadEffect$2(this.this$0, this.$arEffect, this.$productSessionId, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
