package com.whatsapp.bloks.binder.avatars;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass84O;
import X.C153427bI;
import X.C157967jD;
import X.C159377lj;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C835248t;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bloks.binder.avatars.WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1", f = "WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C157967jD $args;
    public final /* synthetic */ C153427bI $bloksContext;
    public final /* synthetic */ AnonymousClass84O $component;
    public final /* synthetic */ C835248t $expression;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1(C153427bI r2, AnonymousClass84O r3, C157967jD r4, C835248t r5, C84814Du r6) {
        super(r6, 2);
        this.$component = r3;
        this.$expression = r5;
        this.$args = r4;
        this.$bloksContext = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass84O r3 = this.$component;
            C835248t r2 = this.$expression;
            C159377lj.A01(this.$bloksContext, r3, this.$args, r2);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        AnonymousClass84O r2 = this.$component;
        C835248t r4 = this.$expression;
        return new WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1(this.$bloksContext, r2, this.$args, r4, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
