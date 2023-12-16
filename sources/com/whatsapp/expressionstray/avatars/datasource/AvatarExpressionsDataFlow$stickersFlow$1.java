package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass291;
import X.AnonymousClass292;
import X.AnonymousClass2UA;
import X.AnonymousClass2UW;
import X.AnonymousClass4GU;
import X.AnonymousClass8U9;
import X.C159507lx;
import X.C162457s7;
import X.C18310x6;
import X.C23461Ti;
import X.C23491Tl;
import X.C23551Tr;
import X.C29901lX;
import X.C29921lZ;
import X.C30131lu;
import X.C30141lv;
import X.C30151lw;
import X.C32751rZ;
import X.C32761ra;
import X.C32781rc;
import X.C32791rd;
import X.C47712dh;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C60582yn;
import X.C72023d3;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$stickersFlow$1", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$stickersFlow$1 extends C75003pT implements AnonymousClass4GU {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public int label;
    public final /* synthetic */ AnonymousClass2UA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$stickersFlow$1(AnonymousClass2UA r2, C84814Du r3) {
        super(r3, 5);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        Collection collection;
        Iterable iterable;
        AnonymousClass8U9 r1;
        if (this.label == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass291 r9 = (AnonymousClass291) this.L$1;
            AnonymousClass292 r6 = (AnonymousClass292) this.L$2;
            Iterable iterable2 = (Iterable) this.L$3;
            C60582yn r11 = this.this$0.A02;
            boolean A1Y = AnonymousClass0x2.A1Y(r9, obj2);
            C29901lX r8 = C29901lX.A00;
            C23551Tr r3 = new C23551Tr(r8, r8.toString());
            boolean z = obj2 instanceof C30151lw;
            if (z || (r9 instanceof C32761ra)) {
                collection = C72023d3.A00;
            } else if (!(obj2 instanceof C30131lu) || !(r9 instanceof C32751rZ)) {
                if (!(obj2 instanceof C30141lv) || !(r9 instanceof C32751rZ)) {
                    r1 = new AnonymousClass8U9();
                    if (!r11.A01.A0Y(C58422vE.A02, 6632)) {
                        C75003pT.A03(r11, r3, r8, r1);
                    }
                    C23461Ti.A00(r3, C60582yn.A00(r8, 0), r1);
                    C23461Ti.A00(r3, C60582yn.A00(r8, A1Y ? 1 : 0), r1);
                    C23461Ti.A00(r3, C60582yn.A00(r8, 2), r1);
                    C23461Ti.A00(r3, C60582yn.A00(r8, 3), r1);
                } else {
                    r1 = new AnonymousClass8U9();
                    List list = ((C32751rZ) r9).A00;
                    if (C18310x6.A1X(list)) {
                        if (!r11.A01.A0Y(C58422vE.A02, 6632)) {
                            C75003pT.A03(r11, r3, r8, r1);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str = AnonymousClass0x7.A0b(it).A05;
                            if (str == null) {
                                str = "sticker-without-stable-id";
                            }
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("avatar-sticker-");
                            A0o.append(r8);
                            C23461Ti.A00(r3, AnonymousClass0x2.A0e(str, A0o, '-'), r1);
                        }
                    }
                }
                collection = C159507lx.A0h(r1);
            } else {
                collection = r11.A03(r8, r11.A01(r8), ((C32751rZ) r9).A00);
            }
            C60582yn r112 = this.this$0.A02;
            C162457s7.A0J(r6, 0);
            C29921lZ r92 = C29921lZ.A00;
            C23551Tr r82 = new C23551Tr(r92, r92.toString());
            if (z || (r6 instanceof C32791rd)) {
                iterable = C72023d3.A00;
            } else if ((obj2 instanceof C30131lu) && (r6 instanceof C32781rc)) {
                iterable = r112.A03(r92, r112.A01(r92), ((C32781rc) r6).A00);
            } else if (!(obj2 instanceof C30141lv) || !(r6 instanceof C32781rc)) {
                C47712dh[] r2 = new C47712dh[5];
                r2[0] = new C23491Tl((AnonymousClass2UW) r82, (Integer) null, r112.A01(r92), 10);
                r2[1] = new C23461Ti(r82, C60582yn.A00(r92, 0));
                r2[2] = new C23461Ti(r82, C60582yn.A00(r92, 1));
                r2[3] = new C23461Ti(r82, C60582yn.A00(r92, 2));
                iterable = AnonymousClass0x9.A19(new C23461Ti(r82, C60582yn.A00(r92, 3)), r2, 4);
            } else {
                AnonymousClass8U9 r7 = new AnonymousClass8U9();
                List list2 = ((C32781rc) r6).A00;
                if (C18310x6.A1X(list2)) {
                    C75003pT.A03(r112, r82, r92, r7);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String str2 = AnonymousClass0x7.A0b(it2).A05;
                        if (str2 == null) {
                            str2 = "sticker-without-stable-id";
                        }
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("avatar-sticker-");
                        A0o2.append(r92);
                        C23461Ti.A00(r82, AnonymousClass0x2.A0e(str2, A0o2, '-'), r7);
                    }
                }
                iterable = C159507lx.A0h(r7);
            }
            return C73723fy.A0K(iterable2, C73723fy.A0K(iterable, collection));
        }
        throw AnonymousClass001.A0d();
    }

    public /* bridge */ /* synthetic */ Object BGl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        AvatarExpressionsDataFlow$stickersFlow$1 avatarExpressionsDataFlow$stickersFlow$1 = new AvatarExpressionsDataFlow$stickersFlow$1(this.this$0, (C84814Du) obj5);
        avatarExpressionsDataFlow$stickersFlow$1.L$0 = obj;
        avatarExpressionsDataFlow$stickersFlow$1.L$1 = obj2;
        avatarExpressionsDataFlow$stickersFlow$1.L$2 = obj3;
        avatarExpressionsDataFlow$stickersFlow$1.L$3 = obj4;
        return C59022wD.A01(avatarExpressionsDataFlow$stickersFlow$1);
    }
}
