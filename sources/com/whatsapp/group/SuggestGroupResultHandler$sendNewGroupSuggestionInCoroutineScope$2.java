package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass27E;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18260x0;
import X.C27401dl;
import X.C27411dm;
import X.C27991fJ;
import X.C43742Th;
import X.C53782nf;
import X.C57682u2;
import X.C59022wD;
import X.C70003Zm;
import X.C71603cN;
import X.C75003pT;
import X.C84814Du;
import X.C89654ea;
import android.app.Activity;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2", f = "SuggestGroupResultHandler.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $groupDescription;
    public final /* synthetic */ String $groupName;
    public final /* synthetic */ C27991fJ $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ C43742Th this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(C43742Th r2, C27991fJ r3, String str, String str2, C84814Du r6) {
        super(r6, 2);
        this.this$0 = r2;
        this.$linkedParentGroupJid = r3;
        this.$groupName = str;
        this.$groupDescription = str2;
    }

    public final Object A09(Object obj) {
        String quantityString;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper = this.this$0.A07;
            C27991fJ r2 = this.$linkedParentGroupJid;
            String str = this.$groupName;
            String str2 = this.$groupDescription;
            this.label = 1;
            obj = createSubGroupSuggestionProtocolHelper.A00(r2, str, str2, this);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass27E r11 = (AnonymousClass27E) obj;
        if (r11 instanceof C27401dl) {
            C53782nf r22 = ((C27401dl) r11).A00;
            this.this$0.A05.A04(r22, this.$linkedParentGroupJid);
            Activity activity = this.this$0.A01;
            C162457s7.A0K(activity, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            ((C89654ea) activity).BjL();
            C43742Th r52 = this.this$0;
            C27991fJ r7 = this.$linkedParentGroupJid;
            C27991fJ r6 = r22.A02;
            Activity activity2 = r52.A01;
            if (activity2.isFinishing() || activity2.isDestroyed()) {
                Log.w("SuggestGroupResultHandler/skipping result snackbar as hosting activity state changed");
            } else {
                Resources resources = activity2.getResources();
                if (!(resources == null || (quantityString = resources.getQuantityString(R.plurals.f9nameremoved, 1)) == null)) {
                    r52.A04.A0S(new C71603cN(r52, r6, r7, quantityString, 21));
                }
            }
        } else if (r11 instanceof C27411dm) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SuggestGroupResultHandler/Request failed for suggested group ");
            C18260x0.A1K(A0o, this.$groupName);
            Activity activity3 = this.this$0.A01;
            C162457s7.A0K(activity3, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            ((C89654ea) activity3).BjL();
            C43742Th r23 = this.this$0;
            r23.A04.A0S(C70003Zm.A00(r23, 15));
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(this.this$0, this.$linkedParentGroupJid, this.$groupName, this.$groupDescription, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
