package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass2A4;
import X.AnonymousClass2UA;
import X.AnonymousClass4GR;
import X.AnonymousClass4JB;
import X.C18260x0;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$stickersFlow$2", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$stickersFlow$2 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2UA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$stickersFlow$2(AnonymousClass2UA r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            Iterable iterable = (Iterable) this.L$0;
            if (this.this$0.A03.A0Y(C58422vE.A02, 6970)) {
                Map A00 = AnonymousClass2A4.A00(new AnonymousClass4JB(iterable, 0));
                LinkedHashMap A0r = C18320x8.A0r();
                Iterator A0q = AnonymousClass000.A0q(A00);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    if (AnonymousClass0x2.A08(A0w) > 1) {
                        C18270x1.A1N(A0r, A0w);
                    }
                }
                if (!A0r.isEmpty()) {
                    AnonymousClass2UA r5 = this.this$0;
                    Iterator A0q2 = AnonymousClass000.A0q(A0r);
                    while (A0q2.hasNext()) {
                        Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                        String A0q3 = C18310x6.A0q(A0w2);
                        int A08 = AnonymousClass0x2.A08(A0w2);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Duplicate item ID detected: ");
                        A0o.append(A0q3);
                        A0o.append(" (");
                        A0o.append(A08);
                        C18260x0.A1K(A0o, " x)");
                        r5.A04.A02(2, "duplicate_ui_item_id", AnonymousClass000.A0V("Duplicated ID: ", A0q3, AnonymousClass001.A0o()));
                    }
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarExpressionsDataFlow$stickersFlow$2 avatarExpressionsDataFlow$stickersFlow$2 = new AvatarExpressionsDataFlow$stickersFlow$2(this.this$0, r4);
        avatarExpressionsDataFlow$stickersFlow$2.L$0 = obj;
        return avatarExpressionsDataFlow$stickersFlow$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
