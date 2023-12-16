package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass218;
import X.AnonymousClass2C4;
import X.AnonymousClass4FS;
import X.AnonymousClass4GR;
import X.AnonymousClass4U2;
import X.AnonymousClass5EG;
import X.AnonymousClass5ZI;
import X.AnonymousClass5ZO;
import X.AnonymousClass74Z;
import X.AnonymousClass7ZC;
import X.C107695bk;
import X.C134606jJ;
import X.C134616jK;
import X.C162457s7;
import X.C166477yk;
import X.C55682qk;
import X.C57682u2;
import X.C59022wD;
import X.C59722xN;
import X.C620733j;
import X.C64333Db;
import X.C75003pT;
import X.C84814Du;
import X.C86624Kv;
import X.C86634Kw;
import X.C90714i5;
import X.C91824lC;
import X.C95454th;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryMapViewModel$startBusinessRequestWithCoroutines$1", f = "BusinessDirectoryMapViewModel.kt", i = {}, l = {1097}, m = "invokeSuspend", n = {}, s = {})
public final class BusinessDirectoryMapViewModel$startBusinessRequestWithCoroutines$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass5ZO $searchLocation;
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4U2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryMapViewModel$startBusinessRequestWithCoroutines$1(AnonymousClass5ZO r2, AnonymousClass4U2 r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$searchLocation = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass4U2 r3;
        String str;
        Object obj2 = obj;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj2);
            r3 = this.this$0;
            C166477yk r11 = r3.A02;
            if (r11 != null) {
                AnonymousClass5ZO r9 = this.$searchLocation;
                r3.A0P.A0H(new Integer(2));
                double A0D = r3.A0D();
                Double d = r9.A06;
                C162457s7.A0H(d);
                double max = Math.max(A0D, d.doubleValue());
                AnonymousClass5ZI r7 = r3.A0A;
                r7.A08();
                C90714i5 r10 = r3.A0Y;
                int i2 = (int) r11.A02;
                C91824lC r0 = r3.A09;
                if (r0 != null) {
                    str = r0.A00;
                } else {
                    str = null;
                }
                AnonymousClass5ZO A05 = r9.A05(max);
                this.L$0 = r3;
                this.label = 1;
                AnonymousClass5EG r2 = r10.A00;
                C59722xN r1 = r10.A0T.A00;
                C162457s7.A0D(r1);
                C64333Db r8 = r2.A00.A03;
                C55682qk A01 = C64333Db.A01(r8);
                AnonymousClass4FS A8y = C64333Db.A8y(r8);
                AnonymousClass1VX A4B = C64333Db.A4B(r8);
                C620733j A2t = C64333Db.A2t(r8);
                C107695bk r22 = r8.A00;
                C59722xN r16 = r1;
                obj2 = new C95454th(A01, r22.AIq(), C107695bk.A0d(r22), A05, C86624Kv.A0R(r8), A2t, A4B, r16, C107695bk.A2m(r22), r7, A8y, str, i2).A0N(this, AnonymousClass2C4.A01);
                if (obj2 == r5) {
                    return r5;
                }
            }
            return C59022wD.A00;
        } else if (i == 1) {
            r3 = (AnonymousClass4U2) this.L$0;
            C57682u2.A01(obj2);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass74Z r23 = (AnonymousClass74Z) obj2;
        if (r23 instanceof C134606jJ) {
            r3.A0b.A00((AnonymousClass7ZC) ((C134606jJ) r23).A00);
        } else if (r23 instanceof C134616jK) {
            C86634Kw.A1M(r3.A0b.A02, "unknown", 3);
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new BusinessDirectoryMapViewModel$startBusinessRequestWithCoroutines$1(this.$searchLocation, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
