package com.whatsapp.productinfra.avatar.data.profilephoto;

import X.AnonymousClass001;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass2AD;
import X.AnonymousClass30R;
import X.AnonymousClass349;
import X.AnonymousClass3Z0;
import X.AnonymousClass3Z9;
import X.AnonymousClass46U;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C49662gt;
import X.C57682u2;
import X.C59022wD;
import X.C616031m;
import X.C616131n;
import X.C632138j;
import X.C72023d3;
import X.C72553du;
import X.C73723fy;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.profilephoto.AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1", f = "AvatarProfilePhotoPosesFetcher.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $failFast;
    public final /* synthetic */ boolean $invalidate;
    public final /* synthetic */ List $poses;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C49662gt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1(C49662gt r2, List list, C84814Du r4, boolean z, boolean z2) {
        super(r4, 2);
        this.$invalidate = z;
        this.this$0 = r2;
        this.$poses = list;
        this.$failFast = z2;
    }

    public final Object A09(Object obj) {
        Object obj2;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            if (this.$invalidate) {
                ((AnonymousClass30R) this.this$0.A02.A00.getValue()).A05(true);
            }
            AnonymousClass4C6 A02 = AnonymousClass349.A02(C616031m.A00(this.this$0.A03.A00(4), new AnonymousClass46U((C85474Gj) null)));
            List<C632138j> list = this.$poses;
            boolean z = this.$failFast;
            boolean z2 = this.$invalidate;
            C49662gt r8 = this.this$0;
            ArrayList A0c = C73783g4.A0c(list);
            for (C632138j avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1 : list) {
                A0c.add(C616131n.A01(C72553du.A00, new AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1(avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1$deferred$1$1, r8, (C84814Du) null, A02, z, z2), A02, AnonymousClass20D.DEFAULT));
            }
            try {
                this.label = 1;
                obj = AnonymousClass2AD.A00(A0c, this);
                if (obj == r4) {
                    return r4;
                }
            } catch (Throwable th) {
                obj2 = AnonymousClass3Z0.A01(th);
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        obj2 = C73723fy.A0C((List) obj);
        Throwable A00 = AnonymousClass3Z9.A00(obj2);
        if (A00 != null) {
            Log.e("AvatarProfilePhotoPosesFetcher/failed to download poses in parallel", A00);
        }
        if (AnonymousClass3Z9.A00(obj2) != null) {
            return C72023d3.A00;
        }
        return obj2;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        C84814Du r3 = r8;
        AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1 avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1 = new AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1(this.this$0, this.$poses, r3, this.$invalidate, this.$failFast);
        avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1.L$0 = obj;
        return avatarProfilePhotoPosesFetcher$fetchPosesInParallel$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
