package com.whatsapp.conversation;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C05100Ry;
import X.C194410o;
import X.C57682u2;
import X.C59022wD;
import X.C73143f0;
import X.C75003pT;
import X.C84814Du;
import X.C85564Gt;
import X.C86054Iq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CustomStickerConfirmationDialog$onViewCreated$1", f = "CustomStickerConfirmationDialog.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class CustomStickerConfirmationDialog$onViewCreated$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ CustomStickerConfirmationDialog this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.CustomStickerConfirmationDialog$onViewCreated$1$1", f = "CustomStickerConfirmationDialog.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.CustomStickerConfirmationDialog$onViewCreated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                C85564Gt r3 = ((C194410o) CustomStickerConfirmationDialog.this.A03.getValue()).A0A;
                C86054Iq r0 = new C86054Iq(CustomStickerConfirmationDialog.this, 9);
                this.label = 1;
                if (r3.Az8(this, r0) == r5) {
                    return r5;
                }
            } else if (i != 1) {
                throw AnonymousClass001.A0d();
            } else {
                C57682u2.A01(obj);
            }
            throw new C73143f0();
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass1((C84814Du) obj2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomStickerConfirmationDialog$onViewCreated$1(CustomStickerConfirmationDialog customStickerConfirmationDialog, C84814Du r3) {
        super(r3, 2);
        this.this$0 = customStickerConfirmationDialog;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final CustomStickerConfirmationDialog customStickerConfirmationDialog = this.this$0;
            AnonymousClass0GC r2 = AnonymousClass0GC.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C05100Ry.A01(r2, customStickerConfirmationDialog, this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CustomStickerConfirmationDialog$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CustomStickerConfirmationDialog$onViewCreated$1(this.this$0, (C84814Du) obj2));
    }
}
