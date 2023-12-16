package com.whatsapp.status.seeall.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass349;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass6A5;
import X.C101205Dw;
import X.C103465Nb;
import X.C105765Wh;
import X.C162457s7;
import X.C175728Zm;
import X.C175738Zn;
import X.C57682u2;
import X.C59022wD;
import X.C72023d3;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import X.C986452r;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$onSearchQueryTextChanged$1$1", f = "StatusSeeAllViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusSeeAllViewModel$onSearchQueryTextChanged$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $queryText;
    public final /* synthetic */ C105765Wh $statuses;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StatusSeeAllViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusSeeAllViewModel$onSearchQueryTextChanged$1$1(C105765Wh r2, StatusSeeAllViewModel statusSeeAllViewModel, String str, C84814Du r5) {
        super(r5, 2);
        this.this$0 = statusSeeAllViewModel;
        this.$statuses = r2;
        this.$queryText = str;
    }

    public final Object A09(Object obj) {
        List A00;
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (AnonymousClass349.A04((AnonymousClass4C6) this.L$0)) {
                StatusSeeAllViewModel statusSeeAllViewModel = this.this$0;
                if (statusSeeAllViewModel.A04) {
                    C101205Dw r0 = statusSeeAllViewModel.A06;
                    C105765Wh r2 = this.$statuses;
                    C162457s7.A0C(r2);
                    C103465Nb r5 = new C103465Nb(r2, r0.A00.A03.A00.APz(), this.$queryText);
                    String str = r5.A02;
                    if (C175738Zn.A0V(str)) {
                        A00 = C72023d3.A00;
                    } else {
                        C105765Wh r3 = r5.A00;
                        List A0K = C73723fy.A0K(r5.A00(r3.A01, true), C73723fy.A0K(r5.A00(r3.A03, false), r5.A00(r3.A02, false)));
                        ArrayList A0s = AnonymousClass001.A0s();
                        for (Object next : A0K) {
                            String A0J = ((C986452r) next).A00.A0J();
                            if (A0J != null && C175728Zm.A0S(A0J, str, true)) {
                                A0s.add(next);
                            }
                        }
                        A00 = AnonymousClass6A5.A00(A0s, r5, 8);
                    }
                    StatusSeeAllViewModel statusSeeAllViewModel2 = this.this$0;
                    statusSeeAllViewModel2.A01.A0G(statusSeeAllViewModel2.A0D(this.$queryText, A00));
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        StatusSeeAllViewModel$onSearchQueryTextChanged$1$1 statusSeeAllViewModel$onSearchQueryTextChanged$1$1 = new StatusSeeAllViewModel$onSearchQueryTextChanged$1$1(this.$statuses, this.this$0, this.$queryText, r6);
        statusSeeAllViewModel$onSearchQueryTextChanged$1$1.L$0 = obj;
        return statusSeeAllViewModel$onSearchQueryTextChanged$1$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
