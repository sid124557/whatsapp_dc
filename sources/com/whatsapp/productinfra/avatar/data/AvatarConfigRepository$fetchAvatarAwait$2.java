package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass001;
import X.AnonymousClass1kp;
import X.AnonymousClass218;
import X.AnonymousClass28L;
import X.AnonymousClass2C4;
import X.AnonymousClass2SI;
import X.AnonymousClass3Z0;
import X.AnonymousClass3Z9;
import X.AnonymousClass4GR;
import X.C29651ks;
import X.C29721kz;
import X.C41712Lh;
import X.C49652gs;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C67293Os;
import X.C75003pT;
import X.C84814Du;
import X.C86524Kl;
import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$fetchAvatarAwait$2", f = "AvatarConfigRepository.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarConfigRepository$fetchAvatarAwait$2 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C49652gs this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarConfigRepository$fetchAvatarAwait$2(C49652gs r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        Object obj2;
        Object r0;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            try {
                C41712Lh r2 = (C41712Lh) this.this$0.A00.get();
                C67293Os B03 = r2.A01.B03(new C86524Kl(r2, 1));
                this.label = 1;
                obj = C616131n.A00(this, AnonymousClass2C4.A01, new GraphqlRequest$postAwait$2(B03, (C84814Du) null));
                if (obj == r5) {
                    return r5;
                }
            } catch (Throwable th) {
                obj2 = AnonymousClass3Z0.A01(th);
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        obj2 = AnonymousClass28L.A00((AnonymousClass2SI) obj);
        Throwable A00 = AnonymousClass3Z9.A00(obj2);
        if (A00 == null) {
            return obj2;
        }
        if (A00 instanceof IOException) {
            r0 = new AnonymousClass1kp(A00);
        } else {
            r0 = new C29651ks(A00);
        }
        return new C29721kz(r0);
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarConfigRepository$fetchAvatarAwait$2 avatarConfigRepository$fetchAvatarAwait$2 = new AvatarConfigRepository$fetchAvatarAwait$2(this.this$0, r4);
        avatarConfigRepository$fetchAvatarAwait$2.L$0 = obj;
        return avatarConfigRepository$fetchAvatarAwait$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
