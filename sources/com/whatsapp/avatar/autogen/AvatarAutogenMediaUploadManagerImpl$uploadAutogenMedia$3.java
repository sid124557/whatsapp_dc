package com.whatsapp.avatar.autogen;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2QG;
import X.AnonymousClass32B;
import X.AnonymousClass32J;
import X.AnonymousClass330;
import X.AnonymousClass3GE;
import X.AnonymousClass3LU;
import X.AnonymousClass3QO;
import X.AnonymousClass46G;
import X.AnonymousClass4GR;
import X.AnonymousClass9GA;
import X.AnonymousClass9GB;
import X.C117165rU;
import X.C135646l0;
import X.C149897Oi;
import X.C157497iO;
import X.C204989qF;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C633138t;
import X.C75003pT;
import X.C84814Du;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3", f = "AvatarAutogenMediaUploadManagerImpl.kt", i = {0}, l = {76}, m = "invokeSuspend", n = {"mediaJob"}, s = {"L$0"})
public final class AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ File $file;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass3LU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(AnonymousClass3LU r2, File file, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$file = file;
    }

    public final Object A09(Object obj) {
        AnonymousClass3QO A02;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C633138t r10 = C633138t.A06;
            A02 = this.this$0.A01.A02(new AnonymousClass3GE(r10), AnonymousClass32J.A00(Uri.fromFile(this.$file), (AnonymousClass32B) null, new C135646l0(this.this$0.A00), new C157497iO(true, false, false), r10, (AnonymousClass330) null, (String) null, 16, false, false, false), true);
            A02.A0W = "metaverse";
            AnonymousClass3LU r4 = this.this$0;
            this.L$0 = A02;
            this.label = 1;
            AnonymousClass46G r3 = new AnonymousClass46G(C57702u4.A01(this), 1);
            r3.A0A();
            r4.A02.BkP(new C117165rU(A02, 26, r4));
            A02.A04(new C204989qF(r3, 0), (Executor) null);
            if (r3.A06() == r5) {
                return r5;
            }
        } else if (i == 1) {
            A02 = (AnonymousClass3QO) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass2QG r1 = (AnonymousClass2QG) A02.A09.A01();
        if (r1 != null && !r1.A02.get()) {
            r1.A01.delete();
        }
        C149897Oi A022 = A02.A02();
        if (A022 == null || A022.A00 != 0) {
            return AnonymousClass9GB.A00;
        }
        String A04 = A022.A02.A04();
        if (A04 == null) {
            return AnonymousClass9GB.A00;
        }
        return new AnonymousClass9GA(A04);
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(this.this$0, this.$file, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
