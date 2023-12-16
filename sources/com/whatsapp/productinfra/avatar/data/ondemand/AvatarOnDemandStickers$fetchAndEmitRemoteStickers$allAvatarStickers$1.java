package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass001;
import X.AnonymousClass28O;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C18260x0;
import X.C18330xA;
import X.C29991lg;
import X.C30001lh;
import X.C30011li;
import X.C30021lj;
import X.C55862r2;
import X.C57682u2;
import X.C57692u3;
import X.C59022wD;
import X.C73153f1;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $remoteStickerList;
    public final /* synthetic */ List $stickerLocations;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1(AvatarOnDemandStickers avatarOnDemandStickers, List list, List list2, C84814Du r5) {
        super(r5, 2);
        this.$remoteStickerList = list;
        this.$stickerLocations = list2;
        this.this$0 = avatarOnDemandStickers;
    }

    public final Object A09(Object obj) {
        String str;
        Object r0;
        if (this.label == 0) {
            C57682u2.A01(obj);
            List list = this.$remoteStickerList;
            LinkedHashMap A0C = C18330xA.A0C(C57692u3.A01(list));
            for (Object next : list) {
                A0C.put(((AnonymousClass39M) next).A05, next);
            }
            List<AnonymousClass28O> list2 = this.$stickerLocations;
            AvatarOnDemandStickers avatarOnDemandStickers = this.this$0;
            ArrayList A0s = AnonymousClass001.A0s();
            for (AnonymousClass28O r1 : list2) {
                if (r1 instanceof C30011li) {
                    r0 = new C29991lg(((C30011li) r1).A00);
                } else if (r1 instanceof C30021lj) {
                    String str2 = ((C30021lj) r1).A00.A00;
                    AnonymousClass39M r2 = (AnonymousClass39M) A0C.get(str2);
                    if (r2 != null) {
                        String str3 = r2.A05;
                        String str4 = r2.A0G;
                        if (str3 == null) {
                            str = "sticker stable id is null";
                        } else if (str4 != null) {
                            r0 = new C30001lh(r2, str3);
                        } else {
                            str = "sticker url is null";
                        }
                    } else {
                        str = "sticker is null";
                    }
                    C55862r2 r3 = avatarOnDemandStickers.A01;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("invalid / null data for sticker (");
                    r3.A02(3, "observe_stickers_failed", C18260x0.A07(str, A0o));
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("AvatarOnDemandStickers/unable to fetch remote sticker for id ");
                    A0o2.append(str2);
                    C18260x0.A1K(A0o2, ", invalid / null data");
                } else {
                    throw C73153f1.A00();
                }
                A0s.add(r0);
            }
            return A0s;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1(this.this$0, this.$remoteStickerList, this.$stickerLocations, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
