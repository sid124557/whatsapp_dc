package com.whatsapp.inappbugreporting;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass5N4;
import X.C134726jW;
import X.C134736jX;
import X.C135026k0;
import X.C135036k1;
import X.C1451274g;
import X.C57682u2;
import X.C59022wD;
import X.C73703fw;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.InAppBugReportingViewModel$reportBug$1", f = "InAppBugReportingViewModel.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
public final class InAppBugReportingViewModel$reportBug$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $bugCategory;
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $title;
    public int label;
    public final /* synthetic */ InAppBugReportingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppBugReportingViewModel$reportBug$1(InAppBugReportingViewModel inAppBugReportingViewModel, String str, String str2, String str3, C84814Du r6) {
        super(r6, 2);
        this.this$0 = inAppBugReportingViewModel;
        this.$title = str;
        this.$description = str2;
        this.$bugCategory = str3;
    }

    public final Object A09(Object obj) {
        List list;
        AnonymousClass5N4 r0;
        short s;
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            InAppBugReportingViewModel inAppBugReportingViewModel = this.this$0;
            ReportBugProtocolHelper reportBugProtocolHelper = inAppBugReportingViewModel.A0G;
            String str = this.$title;
            String str2 = this.$description;
            String str3 = inAppBugReportingViewModel.A03;
            String str4 = inAppBugReportingViewModel.A04;
            if (inAppBugReportingViewModel.A0A.A0X(4697)) {
                list = C73723fy.A0F(C73703fw.A03(inAppBugReportingViewModel.A06));
            } else {
                list = inAppBugReportingViewModel.A05;
            }
            String str5 = this.$bugCategory;
            this.label = 1;
            obj = reportBugProtocolHelper.A00(str, str2, str3, str4, str5, list, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C1451274g r13 = (C1451274g) obj;
        if (r13 instanceof C135036k1) {
            this.this$0.A09.A0H(new C134736jX(((C135036k1) r13).A00));
            r0 = this.this$0.A0E;
            s = 2;
        } else {
            if (r13 instanceof C135026k0) {
                this.this$0.A09.A0H(new C134726jW(((C135026k0) r13).A00));
                r0 = this.this$0.A0E;
                s = 87;
            }
            return C59022wD.A00;
        }
        r0.A01.markerEnd(476715896, s);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new InAppBugReportingViewModel$reportBug$1(this.this$0, this.$title, this.$description, this.$bugCategory, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
