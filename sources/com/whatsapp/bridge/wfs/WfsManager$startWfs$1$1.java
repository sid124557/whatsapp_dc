package com.whatsapp.bridge.wfs;

import X.AnonymousClass001;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass356;
import X.AnonymousClass4C6;
import X.AnonymousClass4CV;
import X.AnonymousClass4GR;
import X.C117125rQ;
import X.C18290x4;
import X.C43842Tr;
import X.C53652nR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C616331p;
import X.C72553du;
import X.C73463fX;
import X.C75003pT;
import X.C84814Du;
import X.C85464Gi;
import android.content.Context;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1", f = "WfsManager.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
public final class WfsManager$startWfs$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C53652nR $abOfflineProps;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass4CV $listener;
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ int $purposePolicyId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C43842Tr this$0;

    @DebugMetadata(c = "com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1$1", f = "WfsManager.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bridge.wfs.WfsManager$startWfs$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                C85464Gi r0 = A01;
                this.label = 1;
                if (r0.Axa(this) == r2) {
                    return r2;
                }
            } else if (i == 1) {
                C57682u2.A01(obj);
            } else {
                throw AnonymousClass001.A0d();
            }
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4, A01);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass1((C84814Du) obj2, A01));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsManager$startWfs$1$1(Context context, AnonymousClass4CV r3, C43842Tr r4, C53652nR r5, String str, C84814Du r7, int i) {
        super(r7, 2);
        this.$abOfflineProps = r5;
        this.this$0 = r4;
        this.$context = context;
        this.$purposePolicyId = i;
        this.$purpose = str;
        this.$listener = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C43842Tr r8 = this.this$0;
            Context context = this.$context;
            C53652nR r9 = this.$abOfflineProps;
            int i2 = this.$purposePolicyId;
            WfsManager$startWfs$1$1$wfsJob$1 wfsManager$startWfs$1$1$wfsJob$1 = new WfsManager$startWfs$1$1$wfsJob$1(context, this.$listener, r8, r9, this.$purpose, (C84814Du) null, i2);
            final C85464Gi A01 = C616131n.A01(C72553du.A00, wfsManager$startWfs$1$1$wfsJob$1, (AnonymousClass4C6) this.L$0, AnonymousClass20D.DEFAULT);
            long A0A = C18290x4.A0A(this.$abOfflineProps.A00(6982));
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616331p.A00(this, r0, A0A) == r3) {
                return r3;
            }
        } else if (i == 1) {
            try {
                C57682u2.A01(obj);
            } catch (C73463fX unused) {
                Log.w(AnonymousClass356.A00("WfsManager launchWfsFlow timeout"));
                this.this$0.A00.BkS(new C117125rQ(this.$listener, 16));
            }
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r10) {
        C53652nR r4 = this.$abOfflineProps;
        C43842Tr r3 = this.this$0;
        Context context = this.$context;
        int i = this.$purposePolicyId;
        WfsManager$startWfs$1$1 wfsManager$startWfs$1$1 = new WfsManager$startWfs$1$1(context, this.$listener, r3, r4, this.$purpose, r10, i);
        wfsManager$startWfs$1$1.L$0 = obj;
        return wfsManager$startWfs$1$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
