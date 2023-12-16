package com.whatsapp.stickers.avatars;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass295;
import X.AnonymousClass2TT;
import X.AnonymousClass2UB;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C51042jB;
import X.C57682u2;
import X.C59022wD;
import X.C67573Pu;
import X.C73723fy;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2", f = "AvatarStickerLocatorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass2TT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(AnonymousClass2TT r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            List<AnonymousClass2UB> A01 = this.this$0.A05.A01(Integer.MAX_VALUE, 2);
            AnonymousClass2TT r5 = this.this$0;
            ArrayList A0s = AnonymousClass001.A0s();
            for (AnonymousClass2UB r2 : A01) {
                C162457s7.A0H(r2);
                AnonymousClass39M A00 = AnonymousClass295.A00(r5.A01, r5.A02, r2);
                if (A00 != null) {
                    A0s.add(A00);
                }
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                String str = AnonymousClass0x7.A0b(it).A05;
                if (str != null) {
                    A0s2.add(str);
                }
            }
            ArrayList A0d = C73783g4.A0d(A0s2);
            Iterator it2 = A0s2.iterator();
            while (it2.hasNext()) {
                A0d.add(new C51042jB(AnonymousClass001.A0m(it2)));
            }
            List<C67573Pu> A012 = this.this$0.A04.A01();
            ArrayList A0s3 = AnonymousClass001.A0s();
            for (C67573Pu r0 : A012) {
                String str2 = r0.A01.A04.A05;
                if (str2 != null) {
                    A0s3.add(str2);
                }
            }
            ArrayList A0d2 = C73783g4.A0d(A0s3);
            Iterator it3 = A0s3.iterator();
            while (it3.hasNext()) {
                A0d2.add(new C51042jB(AnonymousClass001.A0m(it3)));
            }
            return C73723fy.A0P(C73723fy.A0K(A0d2, A0d));
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(this.this$0, (C84814Du) obj2));
    }
}
