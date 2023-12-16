package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass349;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C18290x4;
import X.C18310x6;
import X.C57682u2;
import X.C59022wD;
import X.C60122y2;
import X.C614130p;
import X.C64773Ex;
import X.C73723fy;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import android.os.SystemClock;
import com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$loadSuggestions$1", f = "GroupCallParticipantSuggestionsViewModel.kt", i = {0}, l = {61}, m = "invokeSuspend", n = {"selectedJids"}, s = {"L$0"})
public final class GroupCallParticipantSuggestionsViewModel$loadSuggestions$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $selectedContacts;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ GroupCallParticipantSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel, List list, C84814Du r4) {
        super(r4, 2);
        this.this$0 = groupCallParticipantSuggestionsViewModel;
        this.$selectedContacts = list;
    }

    public final Object A09(Object obj) {
        Set A0P;
        GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel2 = this.this$0;
            long uptimeMillis = SystemClock.uptimeMillis();
            groupCallParticipantSuggestionsViewModel2.A01 = ((C614130p) groupCallParticipantSuggestionsViewModel2.A07.getValue()).A01(AnonymousClass001.A0s());
            this.this$0.A00 = C18310x6.A0A(uptimeMillis);
            List list = this.$selectedContacts;
            ArrayList A0c = C73783g4.A0c(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0c.add(C18310x6.A0R(it).A0I(C95814uZ.class));
            }
            A0P = C73723fy.A0P(A0c);
            groupCallParticipantSuggestionsViewModel = this.this$0;
            C60122y2 r0 = groupCallParticipantSuggestionsViewModel.A01;
            if (r0 != null) {
                List list2 = r0.A00;
                C64773Ex r2 = groupCallParticipantSuggestionsViewModel.A05;
                this.L$0 = A0P;
                this.L$1 = groupCallParticipantSuggestionsViewModel;
                this.label = 1;
                obj = AnonymousClass349.A00(this, new ContactManagerExtKt$asWaContacts$2(r2, list2, (C84814Du) null));
                if (obj == r4) {
                    return r4;
                }
            } else {
                throw C18290x4.A0Y();
            }
        } else if (i == 1) {
            groupCallParticipantSuggestionsViewModel = (GroupCallParticipantSuggestionsViewModel) this.L$1;
            A0P = (Set) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        Iterable iterable = (Iterable) obj;
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it2);
            A0R.A0y = A0P.contains(A0R.A0I(C95814uZ.class));
        }
        groupCallParticipantSuggestionsViewModel.A02 = (List) iterable;
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(this.this$0, this.$selectedContacts, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
