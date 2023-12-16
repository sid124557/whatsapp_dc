package com.facebook.avatar.autogen.facetracker;

import X.AnonymousClass001;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass349;
import X.AnonymousClass34M;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass7H4;
import X.AnonymousClass82E;
import X.AnonymousClass9U3;
import X.C142476xG;
import X.C143086yJ;
import X.C154237cq;
import X.C162457s7;
import X.C162477s9;
import X.C166367yZ;
import X.C180338ks;
import X.C202289li;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C616331p;
import X.C72553du;
import X.C73463fX;
import X.C75003pT;
import X.C84814Du;
import X.C85494Gl;
import android.content.Context;
import com.facebook.jni.HybridData;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class AEFaceTrackerManager implements C202289li {
    public final Context A00;
    public final C180338ks A01;
    public final C166367yZ A02;
    public HybridData mHybridData;

    @DebugMetadata(c = "com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$1", f = "AEFaceTrackerManager.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            C142476xG r2;
            C180338ks r0;
            AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                AEFaceTrackerManager aEFaceTrackerManager = AEFaceTrackerManager.this;
                this.label = 1;
                AnonymousClass4C6 A02 = AnonymousClass349.A02(AnonymousClass34M.A01);
                if (C616331p.A00(this, new AEFaceTrackerManager$getModels$2((C84814Du) null, C616131n.A01(C72553du.A00, new AEFaceTrackerManager$getModels$modelFetching$1(aEFaceTrackerManager, (C84814Du) null), A02, AnonymousClass20D.DEFAULT)), 8000) == r6 || C59022wD.A00 == r6) {
                    return r6;
                }
            } else if (i == 1) {
                try {
                    C57682u2.A01(obj);
                } catch (C143086yJ e) {
                    C162477s9.A0A("AEFaceTrackerManager", "Failed to fetch facetracker models", e);
                    r0 = AEFaceTrackerManager.this.A01;
                    r2 = C142476xG.MODEL_FETCH;
                } catch (C73463fX e2) {
                    C162477s9.A0A("AEFaceTrackerManager", "Timeout fetching facetracker models", e2);
                    r0 = AEFaceTrackerManager.this.A01;
                    r2 = C142476xG.MODEL_FETCH_TIMEOUT;
                }
            } else {
                throw AnonymousClass001.A0d();
            }
            return C59022wD.A00;
            C162457s7.A0J(r2, 0);
            AnonymousClass7H4 r02 = ((AnonymousClass82E) r0).A04.A08;
            String str = r2.key;
            C162457s7.A0J(str, 0);
            C154237cq.A00(r02.A00, r02.A01, str, 36);
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C84814Du) obj2).A09(C59022wD.A00);
        }
    }

    private final native HybridData initHybrid(Map map);

    private final native AEFaceTrackerResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, int i8);

    public void BYq(AnonymousClass9U3 r1) {
    }

    public AEFaceTrackerManager(Context context, C180338ks r6, C166367yZ r7) {
        this.A00 = context;
        this.A02 = r7;
        this.A01 = r6;
        C616131n.A02((C85494Gl) null, new AnonymousClass1((C84814Du) null), AnonymousClass349.A02(AnonymousClass34M.A01), (AnonymousClass20D) null, 3);
    }
}
