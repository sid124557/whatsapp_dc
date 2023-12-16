package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2PZ;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C174178Tg;
import X.C18310x6;
import X.C57682u2;
import X.C59022wD;
import X.C72943eY;
import X.C75003pT;
import X.C84814Du;
import X.C85504Gn;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$fbJob$1", f = "WfsNativeAuthManager.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$1$fbJob$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C85504Gn $resultChannel;
    public int label;
    public final /* synthetic */ AnonymousClass2PZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$1$fbJob$1(Context context, AnonymousClass2PZ r3, C84814Du r4, C85504Gn r5) {
        super(r4, 2);
        this.this$0 = r3;
        this.$context = context;
        this.$resultChannel = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            List A01 = this.this$0.A01.A00("wa_android_wfs_native_auth", new C72943eY(), true).A01(this.$context.getApplicationContext(), new C174178Tg(), true);
            C162457s7.A0D(A01);
            if (C18310x6.A1X(A01)) {
                C85504Gn r0 = this.$resultChannel;
                this.label = 1;
                if (r0.BlD(A01, this) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new WfsNativeAuthManager$getSsoList$1$fbJob$1(this.$context, this.this$0, r6, this.$resultChannel);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
