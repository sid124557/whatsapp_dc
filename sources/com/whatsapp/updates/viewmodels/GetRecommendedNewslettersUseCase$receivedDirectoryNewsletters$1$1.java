package com.whatsapp.updates.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass1RL;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.AnonymousClass5SK;
import X.AnonymousClass649;
import X.C115065o3;
import X.C18260x0;
import X.C57682u2;
import X.C59022wD;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1", f = "GetRecommendedNewslettersUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass649 $listener;
    public final /* synthetic */ List $newsletters;
    public int label;
    public final /* synthetic */ C115065o3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1(AnonymousClass649 r2, C115065o3 r3, List list, C84814Du r5) {
        super(r5, 2);
        this.$newsletters = list;
        this.$listener = r2;
        this.this$0 = r3;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Recommended newsletters fetched = ");
            C18260x0.A1F(A0o, this.$newsletters.size());
            AnonymousClass649 r6 = this.$listener;
            List<AnonymousClass1RL> list = this.$newsletters;
            C115065o3 r5 = this.this$0;
            ArrayList A0c = C73783g4.A0c(list);
            for (AnonymousClass1RL r2 : list) {
                AnonymousClass3ZH A0A = r5.A03.A0A(r2.A05());
                AnonymousClass3ZH A0G = A0A.A0G();
                if (A0G != null) {
                    A0A = A0G;
                }
                A0c.add(new AnonymousClass5SK(r2, A0A));
            }
            C18260x0.A1A("UpdatesViewModel/onListRefreshed recommended newsletters = ", AnonymousClass001.A0o(), A0c);
            ((UpdatesViewModel) r6).A0U.A0G(A0c);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1(this.$listener, this.this$0, this.$newsletters, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
