package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass1U3;
import X.AnonymousClass1U4;
import X.AnonymousClass290;
import X.AnonymousClass291;
import X.AnonymousClass292;
import X.AnonymousClass4GU;
import X.C32671rQ;
import X.C32681rR;
import X.C32751rZ;
import X.C32761ra;
import X.C32771rb;
import X.C32781rc;
import X.C32791rd;
import X.C32801re;
import X.C382026d;
import X.C57682u2;
import X.C59022wD;
import X.C72023d3;
import X.C73153f1;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsDataSource$createStickersFlow$1", f = "StickerExpressionsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsDataSource$createStickersFlow$1 extends C75003pT implements AnonymousClass4GU {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public int label;

    public StickerExpressionsDataSource$createStickersFlow$1(C84814Du r2) {
        super(r2, 5);
    }

    public final Object A09(Object obj) {
        List list;
        List list2;
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass290 r5 = (AnonymousClass290) this.L$0;
            C382026d r4 = (C382026d) this.L$1;
            AnonymousClass291 r1 = (AnonymousClass291) this.L$2;
            AnonymousClass292 r3 = (AnonymousClass292) this.L$3;
            if ((r5 instanceof C32681rR) && (r3 instanceof C32801re) && (r1 instanceof C32771rb)) {
                return AnonymousClass1U4.A00;
            }
            List list3 = null;
            if (r1 instanceof C32751rZ) {
                list = ((C32751rZ) r1).A00;
            } else if (r1 instanceof C32761ra) {
                list = C72023d3.A00;
            } else if (r1 instanceof C32771rb) {
                list = null;
            } else {
                throw C73153f1.A00();
            }
            if (r3 instanceof C32781rc) {
                list3 = ((C32781rc) r3).A00;
            } else if (r3 instanceof C32791rd) {
                list3 = C72023d3.A00;
            } else if (!(r3 instanceof C32801re)) {
                throw C73153f1.A00();
            }
            if (r5 instanceof C32671rQ) {
                list2 = ((C32671rQ) r5).A00;
            } else {
                list2 = C72023d3.A00;
            }
            return new AnonymousClass1U3(r4, list, list3, list2);
        }
        throw AnonymousClass001.A0d();
    }

    public /* bridge */ /* synthetic */ Object BGl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        StickerExpressionsDataSource$createStickersFlow$1 stickerExpressionsDataSource$createStickersFlow$1 = new StickerExpressionsDataSource$createStickersFlow$1((C84814Du) obj5);
        stickerExpressionsDataSource$createStickersFlow$1.L$0 = obj;
        stickerExpressionsDataSource$createStickersFlow$1.L$1 = obj2;
        stickerExpressionsDataSource$createStickersFlow$1.L$2 = obj3;
        stickerExpressionsDataSource$createStickersFlow$1.L$3 = obj4;
        return C59022wD.A01(stickerExpressionsDataSource$createStickersFlow$1);
    }
}
