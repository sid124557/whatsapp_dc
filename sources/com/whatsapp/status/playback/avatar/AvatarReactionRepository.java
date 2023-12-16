package com.whatsapp.status.playback.avatar;

import X.AnonymousClass0x9;
import X.AnonymousClass10E;
import X.AnonymousClass8UF;
import X.C18260x0;
import X.C49942hL;
import X.C55862r2;
import X.C73853gB;
import X.C984951c;
import java.io.File;
import java.util.List;

public final class AvatarReactionRepository {
    public static final List A07 = AnonymousClass8UF.A0o("8724517617588544", "5867824533312508", "5749495891784144", "8426096200765561", "5831572750195307", "9138357339511510");
    public static final List A08 = AnonymousClass8UF.A0o("770347478", "8952361871444313", "5336107443145802", "4706129709419993", "1747509846", "5694722353875618");
    public static final List A09;
    public File A00;
    public List A01 = A09;
    public final C55862r2 A02;
    public final AnonymousClass10E A03;
    public final C49942hL A04;
    public final C73853gB A05;
    public final C73853gB A06;

    static {
        C984951c[] r2 = new C984951c[6];
        C984951c r1 = C984951c.A00;
        r2[0] = r1;
        r2[1] = r1;
        r2[2] = r1;
        r2[3] = r1;
        r2[4] = r1;
        A09 = AnonymousClass0x9.A19(r1, r2, 5);
    }

    public AvatarReactionRepository(C55862r2 r2, AnonymousClass10E r3, C49942hL r4, C73853gB r5, C73853gB r6) {
        C18260x0.A0a(r2, r4, r5, 1);
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r5;
        this.A05 = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.ref.WeakReference r18, X.C84814Du r19, X.AnonymousClass4C6 r20, boolean r21) {
        /*
            r17 = this;
            r4 = r19
            r14 = r18
            r2 = r21
            boolean r0 = r4 instanceof X.C118745u2
            r12 = r17
            if (r0 == 0) goto L_0x00f2
            r6 = r4
            X.5u2 r6 = (X.C118745u2) r6
            int r3 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00f2
            int r3 = r3 - r1
            r6.label = r3
        L_0x001a:
            java.lang.Object r9 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r3) goto L_0x007e
            if (r0 != r4) goto L_0x00f9
            X.C57682u2.A01(r9)
        L_0x002b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0030:
            X.C57682u2.A01(r9)
            if (r21 == 0) goto L_0x006c
            java.util.List r0 = A07
        L_0x0037:
            java.util.ArrayList r8 = X.C73783g4.A0c(r0)
            java.util.Iterator r9 = r0.iterator()
            r16 = 0
        L_0x0041:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r13 = r9.next()
            int r7 = r16 + 1
            if (r16 >= 0) goto L_0x0054
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x0054:
            java.lang.String r13 = (java.lang.String) r13
            r15 = 0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1 r11 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1
            r11.<init>(r12, r13, r14, r15, r16)
            X.3du r1 = X.C72553du.A00
            X.20D r0 = X.AnonymousClass20D.DEFAULT
            r10 = r20
            X.4Gi r0 = X.C616131n.A01(r1, r11, r10, r0)
            r8.add(r0)
            r16 = r7
            goto L_0x0041
        L_0x006c:
            java.util.List r0 = A08
            goto L_0x0037
        L_0x006f:
            r6.L$0 = r12
            r6.L$1 = r14
            r6.Z$0 = r2
            r6.label = r3
            java.lang.Object r9 = X.AnonymousClass2AD.A00(r8, r6)
            if (r9 != r5) goto L_0x008b
            return r5
        L_0x007e:
            boolean r2 = r6.Z$0
            java.lang.Object r14 = r6.L$1
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            java.lang.Object r12 = r6.L$0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r12 = (com.whatsapp.status.playback.avatar.AvatarReactionRepository) r12
            X.C57682u2.A01(r9)
        L_0x008b:
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00ac
        L_0x0097:
            X.3gB r2 = r12.A06
            r1 = 0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2 r0 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2
            r0.<init>(r12, r14, r9, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r4
            java.lang.Object r0 = X.C616131n.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x00ac:
            java.util.Iterator r1 = r9.iterator()
            r8 = 0
        L_0x00b1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C984751a
            if (r0 == 0) goto L_0x00b1
            int r8 = r8 + 1
            if (r8 >= 0) goto L_0x00b1
            X.AnonymousClass8UF.A0q()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x00cb:
            if (r8 <= 0) goto L_0x0097
            X.2r2 r7 = r12.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "isAnimated="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ",errorCount="
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r1, r8)
            r1 = 4
            java.lang.String r0 = "error_avatar_reaction_returned"
            r7.A02(r1, r0, r2)
            int r0 = r9.size()
            if (r8 != r0) goto L_0x0097
            java.lang.Boolean r0 = X.C18320x8.A0U()
            return r0
        L_0x00f2:
            X.5u2 r6 = new X.5u2
            r6.<init>(r12, r4)
            goto L_0x001a
        L_0x00f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.avatar.AvatarReactionRepository.A00(java.lang.ref.WeakReference, X.4Du, X.4C6, boolean):java.lang.Object");
    }
}
