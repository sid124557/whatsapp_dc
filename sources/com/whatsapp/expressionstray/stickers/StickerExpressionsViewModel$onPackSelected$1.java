package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass1U8;
import X.AnonymousClass1UB;
import X.AnonymousClass1UN;
import X.AnonymousClass1UO;
import X.AnonymousClass1UP;
import X.AnonymousClass1UQ;
import X.AnonymousClass2UW;
import X.AnonymousClass3Z0;
import X.AnonymousClass3Z9;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18260x0;
import X.C23501Tm;
import X.C23561Ts;
import X.C381826a;
import X.C50902ix;
import X.C57682u2;
import X.C59022wD;
import X.C73153f1;
import X.C73783g4;
import X.C75003pT;
import X.C832246p;
import X.C84814Du;
import X.C85524Gp;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onPackSelected$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onPackSelected$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $moveToSelectedStickerSection;
    public final /* synthetic */ AnonymousClass2UW $section;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onPackSelected$1(AnonymousClass2UW r2, StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r4, boolean z) {
        super(r4, 2);
        this.$section = r2;
        this.this$0 = stickerExpressionsViewModel;
        this.$moveToSelectedStickerSection = z;
    }

    public final Object A09(Object obj) {
        String str;
        Object obj2;
        Object r10;
        boolean z;
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (!(this.$section instanceof C23501Tm)) {
                C381826a r6 = (C381826a) this.this$0.A0g.getValue();
                if (r6 instanceof AnonymousClass1U8) {
                    AnonymousClass1U8 r62 = (AnonymousClass1U8) r6;
                    List<C50902ix> list = r62.A02;
                    AnonymousClass2UW r4 = this.$section;
                    ArrayList A0c = C73783g4.A0c(list);
                    for (C50902ix r8 : list) {
                        boolean A0P = C162457s7.A0P(r8.A00().A00(), r4.A00());
                        if (r8 instanceof AnonymousClass1UN) {
                            AnonymousClass1UN r82 = (AnonymousClass1UN) r8;
                            r10 = new AnonymousClass1UN(r82.A01, r82.A02, r82.A00, A0P);
                        } else if (r8 instanceof AnonymousClass1UP) {
                            AnonymousClass1UP r83 = (AnonymousClass1UP) r8;
                            r10 = new AnonymousClass1UP(r83.A01, r83.A02, r83.A03, r83.A00, A0P);
                        } else if (r8 instanceof AnonymousClass1UQ) {
                            AnonymousClass1UQ r84 = (AnonymousClass1UQ) r8;
                            if (A0P) {
                                z = false;
                            } else {
                                z = r84.A03;
                            }
                            r10 = new AnonymousClass1UQ(r84.A00, r84.A01, r84.A02, A0P, z);
                        } else if (r8 instanceof AnonymousClass1UO) {
                            AnonymousClass1UO r85 = (AnonymousClass1UO) r8;
                            r10 = new AnonymousClass1UO(r85.A00, r85.A01, r85.A02, A0P);
                        } else {
                            throw C73153f1.A00();
                        }
                        A0c.add(r10);
                    }
                    C85524Gp r42 = this.this$0.A0g;
                    List list2 = r62.A01;
                    if (this.$moveToSelectedStickerSection) {
                        str = this.$section.A00();
                    } else {
                        str = null;
                    }
                    ((C832246p) r42).A04((Object) null, new AnonymousClass1U8(str, A0c, list2));
                    AnonymousClass2UW r2 = this.$section;
                    if (r2 instanceof C23561Ts) {
                        try {
                            this.this$0.A0U.A01(((C23561Ts) r2).A00);
                            obj2 = C59022wD.A00;
                        } catch (Throwable th) {
                            obj2 = AnonymousClass3Z0.A01(th);
                        }
                        AnonymousClass2UW r22 = this.$section;
                        if (AnonymousClass3Z9.A00(obj2) != null) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("StickerExpressionViewModel/unable to mark pack as seen: ");
                            C18260x0.A1K(A0o, ((C23561Ts) r22).A00.A0G);
                        }
                    }
                } else if (r6 instanceof AnonymousClass1UB) {
                    ((C832246p) this.this$0.A0g).A04((Object) null, new AnonymousClass1UB(this.$section.A00()));
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        StickerExpressionsViewModel$onPackSelected$1 stickerExpressionsViewModel$onPackSelected$1 = new StickerExpressionsViewModel$onPackSelected$1(this.$section, this.this$0, r6, this.$moveToSelectedStickerSection);
        stickerExpressionsViewModel$onPackSelected$1.L$0 = obj;
        return stickerExpressionsViewModel$onPackSelected$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
