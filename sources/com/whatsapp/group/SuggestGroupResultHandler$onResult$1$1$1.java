package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C43742Th;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import X.C89654ea;
import android.app.Activity;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$onResult$1$1$1", f = "SuggestGroupResultHandler.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$onResult$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $groupDescription;
    public final /* synthetic */ String $groupName;
    public final /* synthetic */ C27991fJ $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ C43742Th this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$onResult$1$1$1(C43742Th r2, C27991fJ r3, String str, String str2, C84814Du r6) {
        super(r6, 2);
        this.this$0 = r2;
        this.$linkedParentGroupJid = r3;
        this.$groupName = str;
        this.$groupDescription = str2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C43742Th r4 = this.this$0;
            C27991fJ r5 = this.$linkedParentGroupJid;
            String str = this.$groupName;
            String str2 = this.$groupDescription;
            this.label = 1;
            Activity activity = r4.A01;
            AnonymousClass0x9.A1L(activity);
            ((C89654ea) activity).Bp9(R.string.f11nameremoved);
            if (C616131n.A00(this, r4.A08, new SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(r4, r5, str, str2, (C84814Du) null)) == r2 || C59022wD.A00 == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new SuggestGroupResultHandler$onResult$1$1$1(this.this$0, this.$linkedParentGroupJid, this.$groupName, this.$groupDescription, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
