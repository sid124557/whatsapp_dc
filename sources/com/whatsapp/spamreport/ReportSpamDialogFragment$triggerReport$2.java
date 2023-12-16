package com.whatsapp.spamreport;

import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C624134x;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$triggerReport$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$triggerReport$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZH $contact;
    public final /* synthetic */ boolean $extraActionChecked;
    public final /* synthetic */ C624134x $selectedMessage;
    public final /* synthetic */ AnonymousClass3ZH $senderContact;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$triggerReport$2(AnonymousClass3ZH r2, AnonymousClass3ZH r3, C624134x r4, ReportSpamDialogFragment reportSpamDialogFragment, C84814Du r6, boolean z) {
        super(r6, 2);
        this.$contact = r2;
        this.this$0 = reportSpamDialogFragment;
        this.$selectedMessage = r4;
        this.$extraActionChecked = z;
        this.$senderContact = r3;
    }

    public static String A00(ReportSpamDialogFragment$triggerReport$2 reportSpamDialogFragment$triggerReport$2) {
        return (String) reportSpamDialogFragment$triggerReport$2.this$0.A0M.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r2.A02.A0X(3369) == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r16) {
        /*
            r15 = this;
            int r0 = r15.label
            if (r0 != 0) goto L_0x025d
            X.C57682u2.A01(r16)
            X.3ZH r0 = r15.$contact
            com.whatsapp.jid.Jid r5 = X.AnonymousClass3ZH.A04(r0)
            X.1fJ r5 = (X.C27991fJ) r5
            r4 = 1
            if (r5 == 0) goto L_0x003f
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.2ss r0 = r0.A0A
            if (r0 == 0) goto L_0x0256
            int r0 = r0.A06(r5)
            if (r0 != r4) goto L_0x003f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "reportSpamDialogFragment/sendingParent/"
            r1.append(r0)
            X.3ZH r0 = r15.$contact
            X.4uZ r0 = r0.A0H
            X.C18260x0.A0n(r0, r1)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.2qk r2 = r0.A00
            if (r2 == 0) goto L_0x024f
            X.66R r0 = r0.A0M
            java.lang.String r1 = X.AnonymousClass0x9.A13(r0)
            java.lang.String r0 = "reportSpamDialogFragment/sendingParent"
            r2.A0A(r0, r4, r1)
        L_0x003f:
            X.34x r0 = r15.$selectedMessage
            r8 = 0
            if (r0 == 0) goto L_0x01f9
            java.util.List r13 = X.C18290x4.A12(r0)
        L_0x0048:
            com.whatsapp.spamreport.ReportSpamDialogFragment r2 = r15.this$0
            X.3ZH r1 = r15.$contact
            boolean r0 = r15.$extraActionChecked
            if (r0 == 0) goto L_0x0061
            boolean r0 = r1.A0R()
            if (r0 == 0) goto L_0x0061
            X.1VX r1 = r2.A02
            r0 = 3369(0xd29, float:4.721E-42)
            boolean r0 = r1.A0X(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0062
        L_0x0061:
            r7 = 0
        L_0x0062:
            com.whatsapp.spamreport.ReportSpamDialogFragment r6 = r15.this$0
            X.3Wi r4 = r6.A1W()
            com.whatsapp.spamreport.ReportSpamDialogFragment r2 = r15.this$0
            X.2oU r1 = r2.A07
            if (r1 == 0) goto L_0x0248
            X.5ZU r0 = r2.A05
            if (r0 == 0) goto L_0x0241
            X.5kc r9 = new X.5kc
            r9.<init>(r4, r0, r1, r6)
            X.66R r0 = r2.A0Q
            int r1 = X.AnonymousClass0x2.A09(r0)
            r0 = 2
            java.lang.String r6 = "Required value was null."
            if (r1 != r0) goto L_0x00b1
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.30W r7 = r0.A06
            if (r7 == 0) goto L_0x0201
            X.3ZH r1 = r15.$contact
            boolean r0 = r15.$extraActionChecked
            java.lang.String r10 = A00(r15)
            r8 = r9
            r9 = r1
            r11 = r13
            r12 = r0
            r7.A02(r8, r9, r10, r11, r12)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.2p7 r4 = r0.A1Y()
            java.lang.String r2 = A00(r15)
            X.C162457s7.A0D(r2)
            X.3ZH r0 = r15.$contact
            X.4uZ r1 = r0.A0H
            if (r1 == 0) goto L_0x01fc
            r0 = 6
        L_0x00ab:
            r4.A01(r1, r2, r0)
        L_0x00ae:
            X.2wD r8 = X.C59022wD.A00
        L_0x00b0:
            return r8
        L_0x00b1:
            if (r7 != 0) goto L_0x01b4
            boolean r0 = r15.$extraActionChecked
            if (r0 == 0) goto L_0x01b4
            X.3ZH r0 = r15.$senderContact
            if (r0 == 0) goto L_0x00fd
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.66R r0 = r0.A0Q
            int r0 = X.AnonymousClass0x2.A09(r0)
            if (r0 != 0) goto L_0x00fd
            X.3ZH r11 = r15.$senderContact
        L_0x00c7:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.30W r7 = r0.A06
            if (r7 == 0) goto L_0x0208
            X.03q r8 = r0.A0R()
            X.3ZH r10 = r15.$contact
            X.C626936e.A06(r11)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.66R r0 = r0.A0O
            boolean r14 = X.C18270x1.A1V(r0)
            java.lang.String r12 = A00(r15)
            r7.A01(r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.2p7 r4 = r0.A1Y()
            java.lang.String r2 = A00(r15)
            X.C162457s7.A0D(r2)
            X.3ZH r0 = r15.$contact
            X.4uZ r1 = r0.A0H
            if (r1 != 0) goto L_0x01f1
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r6)
            throw r0
        L_0x00fd:
            X.3ZH r0 = r15.$contact
            boolean r0 = r0.A0U()
            if (r0 != 0) goto L_0x0108
            X.3ZH r11 = r15.$contact
            goto L_0x00c7
        L_0x0108:
            if (r5 == 0) goto L_0x0182
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r15.this$0
            X.2so r0 = r1.A1X()
            X.1fJ r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x0182
            X.2ss r0 = r1.A0A
            if (r0 == 0) goto L_0x0222
            boolean r0 = r0.A0N(r5)
            if (r0 == 0) goto L_0x0182
            X.2sj r0 = r1.A0B
            if (r0 == 0) goto L_0x021b
            boolean r0 = r0.A0C(r5)
            if (r0 == 0) goto L_0x0182
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.30W r2 = r0.A06
            if (r2 == 0) goto L_0x0214
            X.3ZH r1 = r15.$contact
            java.lang.String r0 = A00(r15)
            r2.A04(r1, r0, r13)
            com.whatsapp.spamreport.ReportSpamDialogFragment r4 = r15.this$0
            boolean r0 = r4.A0J
            if (r0 != 0) goto L_0x014d
            X.3Wi r2 = r4.A1W()
            r1 = 29
            X.3bs r0 = new X.3bs
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.A0S(r0)
        L_0x014d:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.2p7 r4 = r0.A1Y()
            java.lang.String r2 = A00(r15)
            X.C162457s7.A0D(r2)
            X.3ZH r0 = r15.$contact
            X.4uZ r1 = r0.A0H
            if (r1 == 0) goto L_0x020f
            r0 = 4
            r4.A01(r1, r2, r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.2so r0 = r0.A1X()
            X.1fJ r4 = r0.A01(r5)
            if (r4 == 0) goto L_0x00b0
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = r15.this$0
            X.3Wi r2 = r3.A1W()
            r1 = 44
            X.3a1 r0 = new X.3a1
            r0.<init>(r3, r1, r4)
            r2.A0S(r0)
            goto L_0x00ae
        L_0x0182:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.30W r5 = r0.A06
            if (r5 == 0) goto L_0x022e
            X.3ZH r4 = r15.$contact
            X.66R r0 = r0.A0O
            boolean r2 = X.C18270x1.A1V(r0)
            java.lang.String r1 = A00(r15)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            boolean r0 = r0.A0J
            r5.A04(r4, r1, r13)
            r5.A03(r9, r4, r2, r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.2p7 r4 = r0.A1Y()
            java.lang.String r2 = A00(r15)
            X.C162457s7.A0D(r2)
            X.3ZH r0 = r15.$contact
            X.4uZ r1 = r0.A0H
            if (r1 == 0) goto L_0x0229
            r0 = 5
            goto L_0x00ab
        L_0x01b4:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.30W r2 = r0.A06
            if (r2 == 0) goto L_0x023a
            X.3ZH r1 = r15.$contact
            java.lang.String r0 = A00(r15)
            r2.A04(r1, r0, r13)
            com.whatsapp.spamreport.ReportSpamDialogFragment r4 = r15.this$0
            boolean r0 = r4.A0J
            if (r0 != 0) goto L_0x01d7
            X.3Wi r2 = r4.A1W()
            r1 = 29
            X.3bs r0 = new X.3bs
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.A0S(r0)
        L_0x01d7:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r15.this$0
            X.2p7 r4 = r0.A1Y()
            java.lang.String r2 = A00(r15)
            X.C162457s7.A0D(r2)
            X.3ZH r0 = r15.$contact
            X.4uZ r1 = r0.A0H
            if (r7 == 0) goto L_0x01f4
            if (r1 != 0) goto L_0x01f1
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r6)
            throw r0
        L_0x01f1:
            r0 = 3
            goto L_0x00ab
        L_0x01f4:
            if (r1 == 0) goto L_0x0235
            r0 = 1
            goto L_0x00ab
        L_0x01f9:
            r13 = r8
            goto L_0x0048
        L_0x01fc:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r6)
            throw r0
        L_0x0201:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0208:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x020f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r6)
            throw r0
        L_0x0214:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x021b:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0222:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0229:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r6)
            throw r0
        L_0x022e:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0235:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r6)
            throw r0
        L_0x023a:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0241:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0248:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x024f:
            java.lang.String r0 = "crashLogs"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0256:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x025d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment$triggerReport$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        AnonymousClass3ZH r1 = this.$contact;
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        return new ReportSpamDialogFragment$triggerReport$2(r1, this.$senderContact, this.$selectedMessage, reportSpamDialogFragment, r9, this.$extraActionChecked);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
