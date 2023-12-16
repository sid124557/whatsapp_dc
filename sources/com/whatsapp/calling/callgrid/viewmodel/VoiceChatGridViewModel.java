package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass7DG;
import X.C44382Vv;

public final class VoiceChatGridViewModel extends CallGridViewModel {
    public AnonymousClass7DG A00;
    public final C44382Vv A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VoiceChatGridViewModel(X.C111095hX r46, X.C56972sr r47, X.AnonymousClass5NO r48, X.C97174xk r49, X.AnonymousClass8GN r50, X.AnonymousClass5QX r51, X.AnonymousClass5TU r52, X.C118405tU r53, X.C91444jd r54, X.C116655qe r55, X.C64773Ex r56, X.AnonymousClass5ZU r57, X.C44382Vv r58, X.C54292oU r59, X.C620733j r60, X.C56892sj r61, X.C52412lR r62, X.AnonymousClass1VX r63, X.C66493Lq r64, X.C56572sD r65, X.C187958y5 r66, X.AnonymousClass4FS r67, com.whatsapp.voipcalling.camera.VoipCameraManager r68, X.AnonymousClass4C1 r69, X.AnonymousClass4C1 r70, X.AnonymousClass4C1 r71) {
        /*
            r45 = this;
            r43 = r47
            r3 = r67
            r5 = r65
            r6 = r63
            r7 = r59
            r0 = r43
            X.C18260x0.A0f(r6, r0, r7, r3, r5)
            r1 = 7
            r44 = r46
            r0 = r44
            X.C162457s7.A0J(r0, r1)
            r21 = r50
            r42 = r49
            r4 = r66
            r1 = r21
            r0 = r42
            X.C18260x0.A0X(r0, r1, r4)
            r0 = 11
            r11 = r56
            X.C162457s7.A0J(r11, r0)
            r10 = r57
            r16 = r55
            r17 = r54
            r8 = r64
            r9 = r60
            r1 = r17
            r0 = r16
            X.C18260x0.A0h(r10, r9, r1, r8, r0)
            r0 = 17
            r12 = r68
            X.C162457s7.A0J(r12, r0)
            r20 = r52
            r2 = r69
            r13 = r61
            r0 = r20
            X.C18290x4.A1N(r13, r0, r2)
            r18 = r53
            r1 = r71
            r14 = r70
            r0 = r18
            X.C86604Kt.A1T(r14, r1, r0)
            r0 = 26
            r15 = r58
            X.C162457s7.A0J(r15, r0)
            r0 = r45
            r22 = r51
            r19 = r48
            r32 = r62
            r33 = r6
            r34 = r8
            r35 = r5
            r36 = r4
            r37 = r3
            r38 = r12
            r39 = r2
            r40 = r14
            r41 = r1
            r23 = r20
            r24 = r18
            r25 = r17
            r26 = r16
            r27 = r11
            r28 = r10
            r29 = r7
            r30 = r9
            r31 = r13
            r16 = r0
            r17 = r44
            r18 = r43
            r20 = r42
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0.A01 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel.<init>(X.5hX, X.2sr, X.5NO, X.4xk, X.8GN, X.5QX, X.5TU, X.5tU, X.4jd, X.5qe, X.3Ex, X.5ZU, X.2Vv, X.2oU, X.33j, X.2sj, X.2lR, X.1VX, X.3Lq, X.2sD, X.8y5, X.4FS, com.whatsapp.voipcalling.camera.VoipCameraManager, X.4C1, X.4C1, X.4C1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C998058g A0J(X.AnonymousClass5XK r8) {
        /*
            r7 = this;
            com.whatsapp.voipcalling.CallState r3 = r8.A07
            X.C162457s7.A0C(r3)
            com.whatsapp.voipcalling.CallState r6 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r3 != r6) goto L_0x0034
            X.1VX r5 = r7.A0f
            X.8OQ r0 = r8.A02
            int r4 = r0.size()
            boolean r2 = r8.A0I
            r0 = 6359(0x18d7, float:8.911E-42)
            boolean r1 = r5.A0X(r0)
            r0 = 5241(0x1479, float:7.344E-42)
            int r0 = r5.A0N(r0)
            if (r4 > r0) goto L_0x0034
            if (r2 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x0034
        L_0x0025:
            r2 = 1
        L_0x0026:
            X.8VR r0 = new X.8VR
            r0.<init>(r7)
            X.66R r1 = X.C154517dI.A01(r0)
            if (r2 == 0) goto L_0x0036
            X.58g r0 = X.C998058g.NO_ONE_HERE
            return r0
        L_0x0034:
            r2 = 0
            goto L_0x0026
        L_0x0036:
            if (r3 != r6) goto L_0x003b
            X.58g r0 = X.C998058g.GO_TO_CHAT_WITHOUT_PARTICIPANT_LIST
            return r0
        L_0x003b:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r3 == r0) goto L_0x0043
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r3 != r0) goto L_0x004c
        L_0x0043:
            boolean r0 = X.C18270x1.A1V(r1)
            if (r0 == 0) goto L_0x004c
            X.58g r0 = X.C998058g.NONE
            return r0
        L_0x004c:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 == r0) goto L_0x0057
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r3 == r0) goto L_0x0057
            X.58g r0 = X.C998058g.CONNECTING
            return r0
        L_0x0057:
            X.58g r0 = super.A0J(r8)
            X.C162457s7.A0D(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel.A0J(X.5XK):X.58g");
    }
}
