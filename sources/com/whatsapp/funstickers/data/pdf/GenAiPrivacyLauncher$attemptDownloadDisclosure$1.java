package com.whatsapp.funstickers.data.pdf;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass21D;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C45992au;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import X.C89654ea;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$attemptDownloadDisclosure$1", f = "GenAiPrivacyLauncher.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class GenAiPrivacyLauncher$attemptDownloadDisclosure$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GQ $callback;
    public final /* synthetic */ C89654ea $dialogActivity;
    public final /* synthetic */ int $noticeId;
    public int label;
    public final /* synthetic */ C45992au this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenAiPrivacyLauncher$attemptDownloadDisclosure$1(C89654ea r2, C45992au r3, C84814Du r4, AnonymousClass4GQ r5, int i) {
        super(r4, 2);
        this.$dialogActivity = r2;
        this.this$0 = r3;
        this.$noticeId = i;
        this.$callback = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass4GQ r1;
        AnonymousClass21D r0;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.$dialogActivity.Bp9(R.string.f11nameremoved);
            C45992au r4 = this.this$0;
            int i2 = this.$noticeId;
            this.label = 1;
            obj = C616131n.A00(this, r4.A03, new GenAiPrivacyLauncher$downloadDisclosure$2(r4, (C84814Du) null, i2));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        String str = (String) obj;
        this.$dialogActivity.BjL();
        if (str == null || str.length() == 0) {
            Log.i("GenAiPrivacyLauncher/isAccepted error downloading disclosure");
            r1 = this.$callback;
            r0 = AnonymousClass21D.ERROR;
        } else {
            Log.i("GenAiPrivacyLauncher/isAccepted disclosure state downloaded");
            r1 = this.$callback;
            r0 = AnonymousClass21D.DOWNLOADED;
        }
        r1.invoke(r0);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new GenAiPrivacyLauncher$attemptDownloadDisclosure$1(this.$dialogActivity, this.this$0, r8, this.$callback, this.$noticeId);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
