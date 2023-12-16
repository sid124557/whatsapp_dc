package com.whatsapp.calling.screenshare;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass58J;
import X.AnonymousClass59E;
import X.C57682u2;
import X.C59022wD;
import X.C73153f1;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$toggleScreenSharing$1", f = "ScreenShareViewModel.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$toggleScreenSharing$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass58J $entryPoint;
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$toggleScreenSharing$1(AnonymousClass58J r2, ScreenShareViewModel screenShareViewModel, C84814Du r4) {
        super(r4, 2);
        this.this$0 = screenShareViewModel;
        this.$entryPoint = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass59E r0;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            ScreenShareViewModel screenShareViewModel = this.this$0;
            int ordinal = this.$entryPoint.ordinal();
            if (ordinal == 0) {
                r0 = AnonymousClass59E.STOP_FROM_BOTTOM_SHEET;
            } else if (ordinal == 1) {
                r0 = AnonymousClass59E.STOP_FROM_GRID_TILE;
            } else if (ordinal == 2) {
                r0 = AnonymousClass59E.DISPLAY_PENDING_CALL;
            } else if (ordinal == 3) {
                r0 = AnonymousClass59E.CALL_ENDED;
            } else {
                throw C73153f1.A00();
            }
            this.label = 1;
            if (screenShareViewModel.A0G(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ScreenShareViewModel$toggleScreenSharing$1(this.$entryPoint, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
