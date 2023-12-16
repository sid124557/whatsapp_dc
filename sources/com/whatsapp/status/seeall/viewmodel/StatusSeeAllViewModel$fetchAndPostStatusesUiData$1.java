package com.whatsapp.status.seeall.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass532;
import X.AnonymousClass8U9;
import X.C103475Nc;
import X.C105765Wh;
import X.C159507lx;
import X.C18310x6;
import X.C57682u2;
import X.C59022wD;
import X.C73153f1;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$fetchAndPostStatusesUiData$1", f = "StatusSeeAllViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusSeeAllViewModel$fetchAndPostStatusesUiData$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C105765Wh $statuses;
    public int label;
    public final /* synthetic */ StatusSeeAllViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusSeeAllViewModel$fetchAndPostStatusesUiData$1(C105765Wh r2, StatusSeeAllViewModel statusSeeAllViewModel, C84814Du r4) {
        super(r4, 2);
        this.this$0 = statusSeeAllViewModel;
        this.$statuses = r2;
    }

    public final Object A09(Object obj) {
        List A0h;
        List list;
        if (this.label == 0) {
            C57682u2.A01(obj);
            StatusSeeAllViewModel statusSeeAllViewModel = this.this$0;
            C103475Nc r6 = new C103475Nc(this.$statuses, statusSeeAllViewModel.A02, statusSeeAllViewModel.A05.A00.A03.A00.APz());
            ArrayList A0s = AnonymousClass001.A0s();
            int ordinal = r6.A01.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    list = r6.A00.A02;
                } else if (ordinal == 2) {
                    list = r6.A00.A03;
                } else if (ordinal == 3) {
                    A0h = r6.A00(r6.A00.A01, true);
                } else {
                    throw C73153f1.A00();
                }
                A0h = r6.A00(list, false);
            } else {
                AnonymousClass8U9 r3 = new AnonymousClass8U9();
                C105765Wh r7 = r6.A00;
                List list2 = r7.A02;
                if (C18310x6.A1X(list2)) {
                    r3.add(new AnonymousClass532(R.string.f11nameremoved));
                    r3.addAll(r6.A00(list2, false));
                }
                List list3 = r7.A03;
                if (C18310x6.A1X(list3)) {
                    r3.add(new AnonymousClass532(R.string.f11nameremoved));
                    r3.addAll(r6.A00(list3, false));
                }
                List list4 = r7.A01;
                if (C18310x6.A1X(list4)) {
                    r3.add(new AnonymousClass532(R.string.f11nameremoved));
                    r3.addAll(r6.A00(list4, true));
                }
                A0h = C159507lx.A0h(r3);
            }
            A0s.addAll(A0h);
            StatusSeeAllViewModel statusSeeAllViewModel2 = this.this$0;
            statusSeeAllViewModel2.A01.A0G(statusSeeAllViewModel2.A0D((String) null, A0s));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new StatusSeeAllViewModel$fetchAndPostStatusesUiData$1(this.$statuses, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
