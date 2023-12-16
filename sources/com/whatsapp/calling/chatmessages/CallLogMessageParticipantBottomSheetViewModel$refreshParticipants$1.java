package com.whatsapp.calling.chatmessages;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r0 != 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
        if (r8.equals(r2.A01) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r18) {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.label
            if (r0 != 0) goto L_0x01bc
            X.C57682u2.A01(r18)
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r4.this$0
            X.2rS r1 = r0.A0D
            X.39J r0 = r0.A0I
            X.3ZF r7 = r1.A03(r0)
            if (r7 == 0) goto L_0x01b9
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r2 = r4.this$0
            int r0 = r7.A0H
            r3 = 2
            boolean r0 = X.AnonymousClass000.A1U(r0, r3)
            r2.A04 = r0
            X.34o r0 = r2.A07
            com.whatsapp.jid.GroupJid r6 = r7.A05
            if (r6 == 0) goto L_0x0177
            X.1VX r5 = r0.A08
            X.2sr r1 = r0.A00
            X.2sj r0 = r0.A07
            X.33h r0 = r0.A09
            int r0 = r0.A04(r6)
            boolean r0 = X.C627436k.A0B(r1, r5, r0)
        L_0x0036:
            r2.A01 = r0
            boolean r5 = r7.A0L
            r2.A03 = r5
            r2.A00 = r7
            X.4Gp r1 = r2.A0L
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x016d
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x016d
            r0 = 2131887360(0x7f120500, float:1.9409325E38)
        L_0x004b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setValue(r0)
            X.4Gp r6 = r2.A0O
            X.3ZF r5 = r2.A00
            r1 = 1
            if (r5 == 0) goto L_0x015d
            boolean r0 = r5.A0M()
            if (r0 != r1) goto L_0x015d
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0151
            r5.A0A()
            int r0 = r5.A02
            r1 = 2131887355(0x7f1204fb, float:1.9409315E38)
            if (r0 == 0) goto L_0x0070
        L_0x006d:
            r1 = 2131887352(0x7f1204f8, float:1.9409309E38)
        L_0x0070:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.setValue(r0)
            int r12 = r7.A01
            int r11 = r7.A02()
            X.4Gp r8 = r2.A0N
            X.1VX r5 = r2.A0F
            r1 = 5579(0x15cb, float:7.818E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r0, r1)
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x013d
            X.2oU r10 = r2.A0B
            java.lang.Object[] r9 = new java.lang.Object[r3]
            X.33j r2 = r2.A0C
            long r0 = X.C18290x4.A0A(r12)
            java.lang.String r0 = X.C107565bW.A09(r2, r0)
            r9[r5] = r0
            X.AnonymousClass000.A1P(r9, r11, r6)
            r1 = 2131887361(0x7f120501, float:1.9409327E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r10)
            java.lang.String r0 = r0.getString(r1, r9)
        L_0x00ab:
            r8.setValue(r0)
            java.util.List r0 = r7.A08()
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r7 = r4.this$0
            java.util.ArrayList r1 = X.C73783g4.A0c(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x00bc:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x017a
            java.lang.Object r9 = r10.next()
            X.3ZE r9 = (X.AnonymousClass3ZE) r9
            X.3Ex r0 = r7.A09
            com.whatsapp.jid.UserJid r8 = r9.A02
            X.3ZH r12 = r0.A0A(r8)
            X.C162457s7.A0C(r8)
            X.3ZF r2 = r7.A00
            r13 = 0
            if (r2 == 0) goto L_0x0102
            X.39J r0 = r2.A0E
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00e6
            X.2sr r0 = r7.A05
            boolean r0 = r0.A0a(r8)
            if (r0 != 0) goto L_0x00f4
        L_0x00e6:
            X.39J r2 = r2.A0E
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0102
            com.whatsapp.jid.UserJid r0 = r2.A01
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0102
        L_0x00f4:
            boolean r2 = r7.A04
            r0 = 2131887356(0x7f1204fc, float:1.9409317E38)
            if (r2 == 0) goto L_0x00fe
            r0 = 2131887357(0x7f1204fd, float:1.9409319E38)
        L_0x00fe:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x0102:
            X.2sr r8 = r7.A05
            boolean r0 = X.C56972sr.A08(r8, r12)
            if (r0 == 0) goto L_0x0133
            X.2oU r0 = r7.A0B
            android.content.Context r2 = r0.A00
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r14 = r2.getString(r0)
        L_0x0115:
            if (r14 != 0) goto L_0x0119
            java.lang.String r14 = ""
        L_0x0119:
            int r2 = r9.A00
            r0 = 5
            if (r2 == r0) goto L_0x0125
            r0 = 100
            if (r2 == r0) goto L_0x0125
            r15 = 0
            if (r13 == 0) goto L_0x0126
        L_0x0125:
            r15 = 1
        L_0x0126:
            boolean r16 = X.C56972sr.A08(r8, r12)
            X.1N8 r11 = new X.1N8
            r11.<init>(r12, r13, r14, r15, r16)
            r1.add(r11)
            goto L_0x00bc
        L_0x0133:
            X.5ZU r2 = r7.A0A
            r0 = 7
            X.7HU r0 = r2.A0D(r12, r0, r5, r6)
            java.lang.String r14 = r0.A01
            goto L_0x0115
        L_0x013d:
            X.2oU r0 = r2.A0B
            java.lang.Object[] r2 = new java.lang.Object[r6]
            X.AnonymousClass000.A1P(r2, r11, r5)
            r1 = 2131887362(0x7f120502, float:1.9409329E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r0 = r0.getString(r1, r2)
            goto L_0x00ab
        L_0x0151:
            boolean r0 = r2.A03
            r1 = 2131887354(0x7f1204fa, float:1.9409313E38)
            if (r0 == 0) goto L_0x0070
            r1 = 2131887353(0x7f1204f9, float:1.940931E38)
            goto L_0x0070
        L_0x015d:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x006d
            boolean r0 = r2.A03
            r1 = 2131887351(0x7f1204f7, float:1.9409307E38)
            if (r0 == 0) goto L_0x0070
            r1 = 2131887350(0x7f1204f6, float:1.9409305E38)
            goto L_0x0070
        L_0x016d:
            r0 = 2131887359(0x7f1204ff, float:1.9409323E38)
            if (r5 == 0) goto L_0x004b
            r0 = 2131887358(0x7f1204fe, float:1.940932E38)
            goto L_0x004b
        L_0x0177:
            r0 = 0
            goto L_0x0036
        L_0x017a:
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r4.this$0
            X.4Gp r6 = r0.A0P
            r8 = 1
            r7 = 3
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r1.iterator()
        L_0x0188:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1N8 r0 = (X.AnonymousClass1N8) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0188
            r4.add(r1)
            goto L_0x0188
        L_0x019d:
            X.4GQ[] r2 = new X.AnonymousClass4GQ[r7]
            X.44a r0 = X.C825544a.A00
            r2[r5] = r0
            X.44b r0 = X.C825644b.A00
            r2[r8] = r0
            X.44c r0 = X.C825744c.A00
            r2[r3] = r0
            r1 = 9
            X.4IS r0 = new X.4IS
            r0.<init>((java.lang.Object) r2, (int) r1)
            java.util.List r0 = X.C73723fy.A0L(r4, r0)
            r6.setValue(r0)
        L_0x01b9:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x01bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, (C84814Du) obj2));
    }
}
