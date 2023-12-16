package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass28M;
import X.AnonymousClass4C8;
import X.AnonymousClass4C9;
import X.AnonymousClass4GS;
import X.AnonymousClass4J5;
import X.C29961ld;
import X.C29971le;
import X.C29981lf;
import X.C30131lu;
import X.C30141lv;
import X.C30151lw;
import X.C51042jB;
import X.C57682u2;
import X.C59022wD;
import X.C73153f1;
import X.C73783g4;
import X.C75003pT;
import X.C831846l;
import X.C84814Du;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 extends C75003pT implements AnonymousClass4GS {
    public final /* synthetic */ Integer $qplInstanceKey$inlined;
    public final /* synthetic */ AnonymousClass28M $searchType$inlined;
    public final /* synthetic */ List $stableIds$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        Integer num = this.$qplInstanceKey$inlined;
        AvatarOnDemandStickers avatarOnDemandStickers = this.this$0;
        AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 = new AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1(this.$searchType$inlined, avatarOnDemandStickers, num, this.$stableIds$inlined, (C84814Du) obj3);
        avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1.L$0 = obj;
        avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1.L$1 = obj2;
        return C59022wD.A01(avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1(AnonymousClass28M r2, AvatarOnDemandStickers avatarOnDemandStickers, Integer num, List list, C84814Du r6) {
        super(r6, 3);
        this.$qplInstanceKey$inlined = num;
        this.this$0 = avatarOnDemandStickers;
        this.$searchType$inlined = r2;
        this.$stableIds$inlined = list;
    }

    public final Object A09(Object obj) {
        Object obj2;
        AnonymousClass4C8 r1;
        int A00;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C9 r3 = (AnonymousClass4C9) this.L$0;
            Object obj3 = this.L$1;
            if (obj3 instanceof C30131lu) {
                Integer num = this.$qplInstanceKey$inlined;
                if (num != null) {
                    A00 = num.intValue();
                } else {
                    A00 = this.this$0.A02.A00();
                    this.this$0.A02.A01(A00, "sticker_category_fetch_initiated");
                }
                r1 = new C831846l(new AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(this.$searchType$inlined, this.this$0, this.$stableIds$inlined, (C84814Du) null, A00));
            } else {
                if (obj3 instanceof C30141lv) {
                    Integer num2 = this.$qplInstanceKey$inlined;
                    if (num2 != null) {
                        this.this$0.A02.A01(num2.intValue(), "sticker_pack_loading");
                    }
                    AnonymousClass28M r7 = this.$searchType$inlined;
                    List<C51042jB> list = this.$stableIds$inlined;
                    ArrayList A0c = C73783g4.A0c(list);
                    for (C51042jB r0 : list) {
                        A0c.add(new C29981lf(r0.A00));
                    }
                    obj2 = new C29971le(r7, A0c);
                } else if (obj3 instanceof C30151lw) {
                    this.this$0.A01.A02(3, "observe_stickers_failed", "avatar sticker pack not available");
                    Integer num3 = this.$qplInstanceKey$inlined;
                    if (num3 != null) {
                        this.this$0.A02.A01(num3.intValue(), "sticker_pack_unavailable");
                    }
                    obj2 = new C29961ld(this.$searchType$inlined, AnonymousClass001.A0e("Avatar sticker pack not available"));
                } else {
                    throw C73153f1.A00();
                }
                r1 = new AnonymousClass4J5(obj2, 1);
            }
            this.label = 1;
            if (r1.Az8(this, r3) == r5 || C59022wD.A00 == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }
}
