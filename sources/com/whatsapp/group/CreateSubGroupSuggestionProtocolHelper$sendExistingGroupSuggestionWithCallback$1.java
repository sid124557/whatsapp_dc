package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass27D;
import X.AnonymousClass360;
import X.AnonymousClass48C;
import X.AnonymousClass4GR;
import X.AnonymousClass4GW;
import X.C138676qo;
import X.C138956rH;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C18310x6;
import X.C27381dj;
import X.C27391dk;
import X.C27631eF;
import X.C27641eG;
import X.C27991fJ;
import X.C57682u2;
import X.C59022wD;
import X.C67323Ov;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1", f = "CreateSubGroupSuggestionProtocolHelper.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
public final class CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass48C $createExistingGroupSuggestionCallback;
    public final /* synthetic */ List $groupJids;
    public final /* synthetic */ C27991fJ $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ CreateSubGroupSuggestionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1(AnonymousClass48C r2, CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper, C27991fJ r4, List list, C84814Du r6) {
        super(r6, 2);
        this.this$0 = createSubGroupSuggestionProtocolHelper;
        this.$linkedParentGroupJid = r4;
        this.$groupJids = list;
        this.$createExistingGroupSuggestionCallback = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass48C r4;
        int i;
        AnonymousClass4GW r1;
        Object obj2;
        C138676qo r0;
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C57682u2.A01(obj);
            CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper = this.this$0;
            C27991fJ r42 = this.$linkedParentGroupJid;
            List list = this.$groupJids;
            ArrayList A0c = C73783g4.A0c(list);
            for (Object next : list) {
                C162457s7.A0K(next, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                A0c.add(next);
            }
            List A01 = AnonymousClass360.A01(A0c);
            this.label = 1;
            obj = createSubGroupSuggestionProtocolHelper.A01(r42, A01, this);
            if (obj == r7) {
                return r7;
            }
        } else if (i2 == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass27D r9 = (AnonymousClass27D) obj;
        if (r9 instanceof C27381dj) {
            List list2 = ((C27381dj) r9).A00;
            if (C18310x6.A1X(list2)) {
                int size = this.$groupJids.size();
                r4 = this.$createExistingGroupSuggestionCallback;
                if (size == 1) {
                    C138956rH r02 = (C138956rH) C18290x4.A0k(list2);
                    if (!(r02 == null || (r0 = (C138676qo) r02.A01) == null)) {
                        int i3 = r0.A00;
                        if (i3 == 1) {
                            i = R.string.f11nameremoved;
                        } else if (i3 == 4) {
                            i = R.string.f11nameremoved;
                        } else if (i3 == 3) {
                            i = R.string.f11nameremoved;
                        } else {
                            Log.e("CreateSubFroupSuggestionProcotolHendler/unknown error");
                        }
                    }
                    i = R.string.f11nameremoved;
                } else {
                    C67323Ov r43 = (C67323Ov) r4;
                    int size2 = r43.A01.size();
                    int size3 = size2 - list2.size();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("LinkExistingGroupsUseCase/partial success adding existing groups to ");
                    A0o.append(r43.A00);
                    A0o.append(": ");
                    A0o.append(size3);
                    C18260x0.A0w(" out of ", A0o, size2);
                    r1 = r43.A02;
                    obj2 = new C27641eG(size2, size3);
                    r1.BkD(obj2);
                    return C59022wD.A00;
                }
            } else {
                C67323Ov r03 = (C67323Ov) this.$createExistingGroupSuggestionCallback;
                AnonymousClass4GW r3 = r03.A02;
                List list3 = r03.A01;
                r3.BkD(new C27641eG(list3.size(), list3.size()));
                return C59022wD.A00;
            }
        } else {
            if (r9 instanceof C27391dk) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("sendExistingGroupSuggestionWrapperForJavaCaller/Request failed for suggested existing group ");
                C18260x0.A0n(this.$groupJids, A0o2);
                r4 = this.$createExistingGroupSuggestionCallback;
                i = R.string.f11nameremoved;
            }
            return C59022wD.A00;
        }
        C67323Ov r44 = (C67323Ov) r4;
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("LinkExistingGroupsUseCase/error adding existing groups to ");
        C18260x0.A0m(r44.A00, A0o3);
        r1 = r44.A02;
        obj2 = new C27631eF(i);
        r1.BkD(obj2);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1(this.$createExistingGroupSuggestionCallback, this.this$0, this.$linkedParentGroupJid, this.$groupJids, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
