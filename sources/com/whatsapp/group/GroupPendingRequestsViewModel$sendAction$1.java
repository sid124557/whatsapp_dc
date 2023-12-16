package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass4V4;
import X.C142636xW;
import X.C171398Gx;
import X.C57682u2;
import X.C59022wD;
import X.C616331p;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1", f = "GroupPendingRequestsViewModel.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class GroupPendingRequestsViewModel$sendAction$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C142636xW $action;
    public final /* synthetic */ int $position;
    public final /* synthetic */ C171398Gx $row;
    public int label;
    public final /* synthetic */ AnonymousClass4V4 this$0;

    @DebugMetadata(c = "com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1$1", f = "GroupPendingRequestsViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A09(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r20
                X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
                r4 = r19
                int r0 = r4.label
                r7 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0014
                if (r0 != r7) goto L_0x000f
                goto L_0x0084
            L_0x000f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
                throw r0
            L_0x0014:
                X.C57682u2.A01(r1)
                X.4V4 r0 = r6     // Catch:{ 3fX -> 0x01ec }
                X.2RH r8 = r0.A0D     // Catch:{ 3fX -> 0x01ec }
                X.8Gx r0 = r5     // Catch:{ 3fX -> 0x01ec }
                X.2n0 r6 = r0.A05     // Catch:{ 3fX -> 0x01ec }
                X.6xW r3 = r4     // Catch:{ 3fX -> 0x01ec }
                r4.label = r7     // Catch:{ 3fX -> 0x01ec }
                X.31C r12 = r8.A02     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r15 = r12.A03()     // Catch:{ 3fX -> 0x01ec }
                X.39V[] r10 = new X.AnonymousClass39V[r7]     // Catch:{ 3fX -> 0x01ec }
                com.whatsapp.jid.UserJid r9 = r6.A04     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r1 = "jid"
                X.39V r0 = new X.39V     // Catch:{ 3fX -> 0x01ec }
                r0.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r1)     // Catch:{ 3fX -> 0x01ec }
                r11 = 0
                r10[r11] = r0     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r0 = "participant"
                X.36K r9 = new X.36K     // Catch:{ 3fX -> 0x01ec }
                r9.<init>(r0, r10)     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r0 = r3.value     // Catch:{ 3fX -> 0x01ec }
                X.36K r1 = new X.36K     // Catch:{ 3fX -> 0x01ec }
                r1.<init>((X.AnonymousClass36K) r9, (java.lang.String) r0, (X.AnonymousClass39V[]) r2)     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r0 = "membership_requests_action"
                X.36K r10 = new X.36K     // Catch:{ 3fX -> 0x01ec }
                r10.<init>((X.AnonymousClass36K) r1, (java.lang.String) r0, (X.AnonymousClass39V[]) r2)     // Catch:{ 3fX -> 0x01ec }
                r0 = 4
                X.39V[] r9 = new X.AnonymousClass39V[r0]     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r1 = "xmlns"
                java.lang.String r0 = "w:g2"
                X.AnonymousClass39V.A0B(r1, r0, r9, r11)     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r0 = "id"
                X.AnonymousClass39V.A0B(r0, r15, r9, r7)     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r1 = "type"
                java.lang.String r0 = "set"
                X.AnonymousClass39V.A06(r1, r0, r9)     // Catch:{ 3fX -> 0x01ec }
                X.1fJ r0 = r6.A01     // Catch:{ 3fX -> 0x01ec }
                X.36K r14 = X.AnonymousClass36K.A0C(r0, r10, r9)     // Catch:{ 3fX -> 0x01ec }
                X.4Du r1 = X.C57702u4.A01(r4)     // Catch:{ 3fX -> 0x01ec }
                X.3dl r0 = new X.3dl     // Catch:{ 3fX -> 0x01ec }
                r0.<init>(r1)     // Catch:{ 3fX -> 0x01ec }
                r16 = 351(0x15f, float:4.92E-43)
                X.5oR r13 = new X.5oR     // Catch:{ 3fX -> 0x01ec }
                r13.<init>(r3, r6, r8, r0)     // Catch:{ 3fX -> 0x01ec }
                r17 = 2000(0x7d0, double:9.88E-321)
                r12.A0K(r13, r14, r15, r16, r17)     // Catch:{ 3fX -> 0x01ec }
                java.lang.Object r1 = r0.A00()     // Catch:{ 3fX -> 0x01ec }
                if (r1 != r5) goto L_0x0087
                return r5
            L_0x0084:
                X.C57682u2.A01(r1)     // Catch:{ 3fX -> 0x01ec }
            L_0x0087:
                X.8j2 r1 = (X.C179368j2) r1     // Catch:{ 3fX -> 0x01ec }
                boolean r0 = r1 instanceof X.AnonymousClass8H3     // Catch:{ 3fX -> 0x01ec }
                if (r0 == 0) goto L_0x00c8
                X.4V4 r9 = r6     // Catch:{ 3fX -> 0x01ec }
                X.8Gx r8 = r5     // Catch:{ 3fX -> 0x01ec }
                X.6xW r0 = r4     // Catch:{ 3fX -> 0x01ec }
                int r10 = r8     // Catch:{ 3fX -> 0x01ec }
                int r7 = r0.statusOnSuccess     // Catch:{ 3fX -> 0x01ec }
                X.598[] r6 = X.AnonymousClass598.values()     // Catch:{ 3fX -> 0x01ec }
                int r5 = r6.length     // Catch:{ 3fX -> 0x01ec }
                r3 = 0
            L_0x009d:
                if (r3 >= r5) goto L_0x00c3
                r1 = r6[r3]     // Catch:{ 3fX -> 0x01ec }
                int r0 = r1.value     // Catch:{ 3fX -> 0x01ec }
                if (r0 != r7) goto L_0x00c0
                r8.A03 = r1     // Catch:{ 3fX -> 0x01ec }
                X.4UC r0 = r9.A0H     // Catch:{ 3fX -> 0x01ec }
                X.C06270Wx.A04(r0, r10)     // Catch:{ 3fX -> 0x01ec }
                X.08M r0 = r9.A04     // Catch:{ 3fX -> 0x01ec }
                r0.A0G(r2)     // Catch:{ 3fX -> 0x01ec }
                X.2n0 r3 = r8.A05     // Catch:{ 3fX -> 0x01ec }
                X.4FS r1 = r9.A0J     // Catch:{ 3fX -> 0x01ec }
                r0 = 27
                X.C86644Kx.A1S(r1, r9, r3, r0)     // Catch:{ 3fX -> 0x01ec }
                r0 = 1
                r9.A0D(r8, r0)     // Catch:{ 3fX -> 0x01ec }
                goto L_0x01fd
            L_0x00c0:
                int r3 = r3 + 1
                goto L_0x009d
            L_0x00c3:
                java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ 3fX -> 0x01ec }
                throw r0     // Catch:{ 3fX -> 0x01ec }
            L_0x00c8:
                boolean r0 = r1 instanceof X.AnonymousClass8H1     // Catch:{ 3fX -> 0x01ec }
                if (r0 == 0) goto L_0x017f
                X.4V4 r9 = r6     // Catch:{ 3fX -> 0x01ec }
                X.8Gx r8 = r5     // Catch:{ 3fX -> 0x01ec }
                X.8H1 r1 = (X.AnonymousClass8H1) r1     // Catch:{ 3fX -> 0x01ec }
                int r11 = r8     // Catch:{ 3fX -> 0x01ec }
                X.59I r12 = r1.A00     // Catch:{ 3fX -> 0x01ec }
                r8.A02 = r12     // Catch:{ 3fX -> 0x01ec }
                int r10 = r12.statusMapping     // Catch:{ 3fX -> 0x01ec }
                X.598[] r6 = X.AnonymousClass598.values()     // Catch:{ 3fX -> 0x01ec }
                int r5 = r6.length     // Catch:{ 3fX -> 0x01ec }
                r3 = 0
            L_0x00e0:
                if (r3 >= r5) goto L_0x017a
                r1 = r6[r3]     // Catch:{ 3fX -> 0x01ec }
                int r0 = r1.value     // Catch:{ 3fX -> 0x01ec }
                if (r0 != r10) goto L_0x00f5
                r8.A03 = r1     // Catch:{ 3fX -> 0x01ec }
                X.59I r0 = X.AnonymousClass59I.A05     // Catch:{ 3fX -> 0x01ec }
                if (r12 != r0) goto L_0x00fb
                X.08M r0 = r9.A02     // Catch:{ 3fX -> 0x01ec }
                java.util.List r0 = X.C86644Kx.A0h(r0)     // Catch:{ 3fX -> 0x01ec }
                goto L_0x00f8
            L_0x00f5:
                int r3 = r3 + 1
                goto L_0x00e0
            L_0x00f8:
                if (r0 == 0) goto L_0x0101
                goto L_0x00fe
            L_0x00fb:
                X.4UC r0 = r9.A0H     // Catch:{ 3fX -> 0x01ec }
                goto L_0x0103
            L_0x00fe:
                r0.remove(r11)     // Catch:{ 3fX -> 0x01ec }
            L_0x0101:
                X.4UC r0 = r9.A0G     // Catch:{ 3fX -> 0x01ec }
            L_0x0103:
                X.C06270Wx.A04(r0, r11)     // Catch:{ 3fX -> 0x01ec }
                X.08M r0 = r9.A04     // Catch:{ 3fX -> 0x01ec }
                r0.A0G(r2)     // Catch:{ 3fX -> 0x01ec }
                X.3ZH r1 = r8.A07     // Catch:{ 3fX -> 0x01ec }
                X.5ZU r0 = r9.A07     // Catch:{ 3fX -> 0x01ec }
                java.lang.String r10 = r0.A0J(r1)     // Catch:{ 3fX -> 0x01ec }
                if (r10 == 0) goto L_0x011f
                X.59I r0 = r8.A02     // Catch:{ 3fX -> 0x01ec }
                int r0 = r0.ordinal()     // Catch:{ 3fX -> 0x01ec }
                r6 = 0
                switch(r0) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x0142;
                    case 3: goto L_0x0142;
                    case 4: goto L_0x0162;
                    case 5: goto L_0x014e;
                    case 6: goto L_0x0154;
                    case 7: goto L_0x015a;
                    case 8: goto L_0x013c;
                    default: goto L_0x011f;
                }     // Catch:{ 3fX -> 0x01ec }
            L_0x011f:
                X.598 r1 = r8.A03     // Catch:{ 3fX -> 0x01ec }
                X.598 r0 = X.AnonymousClass598.APPROVED     // Catch:{ 3fX -> 0x01ec }
                if (r1 == r0) goto L_0x012d
                X.598 r0 = X.AnonymousClass598.REJECTED     // Catch:{ 3fX -> 0x01ec }
                if (r1 == r0) goto L_0x012d
                X.598 r0 = X.AnonymousClass598.CANCELED     // Catch:{ 3fX -> 0x01ec }
                if (r1 != r0) goto L_0x0136
            L_0x012d:
                X.2n0 r3 = r8.A05     // Catch:{ 3fX -> 0x01ec }
                X.4FS r1 = r9.A0J     // Catch:{ 3fX -> 0x01ec }
                r0 = 27
                X.C86644Kx.A1S(r1, r9, r3, r0)     // Catch:{ 3fX -> 0x01ec }
            L_0x0136:
                r0 = 0
                r9.A0D(r8, r0)     // Catch:{ 3fX -> 0x01ec }
                goto L_0x01fd
            L_0x013c:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r3 = 2131889947(0x7f120f1b, float:1.9414572E38)
                goto L_0x015f
            L_0x0142:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r3 = 2131889942(0x7f120f16, float:1.9414562E38)
                goto L_0x016d
            L_0x0148:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r3 = 2131889946(0x7f120f1a, float:1.941457E38)
                goto L_0x016d
            L_0x014e:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r3 = 2131889924(0x7f120f04, float:1.9414525E38)
                goto L_0x016d
            L_0x0154:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r3 = 2131886446(0x7f12016e, float:1.9407471E38)
                goto L_0x015f
            L_0x015a:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r3 = 2131889930(0x7f120f0a, float:1.9414537E38)
            L_0x015f:
                java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ 3fX -> 0x01ec }
                goto L_0x0171
            L_0x0162:
                X.6xW r1 = r8.A04     // Catch:{ 3fX -> 0x01ec }
                X.6xW r0 = X.C142636xW.A02     // Catch:{ 3fX -> 0x01ec }
                if (r1 != r0) goto L_0x011f
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r3 = 2131889925(0x7f120f05, float:1.9414527E38)
            L_0x016d:
                java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ 3fX -> 0x01ec }
                r1[r6] = r10     // Catch:{ 3fX -> 0x01ec }
            L_0x0171:
                X.7Ks r0 = new X.7Ks     // Catch:{ 3fX -> 0x01ec }
                r0.<init>(r1, r3, r6)     // Catch:{ 3fX -> 0x01ec }
                r5.A0G(r0)     // Catch:{ 3fX -> 0x01ec }
                goto L_0x011f
            L_0x017a:
                java.util.NoSuchElementException r0 = X.C18320x8.A0t()     // Catch:{ 3fX -> 0x01ec }
                throw r0     // Catch:{ 3fX -> 0x01ec }
            L_0x017f:
                boolean r0 = r1 instanceof X.AnonymousClass8H0     // Catch:{ 3fX -> 0x01ec }
                if (r0 == 0) goto L_0x01cb
                X.4V4 r9 = r6     // Catch:{ 3fX -> 0x01ec }
                X.8Gx r8 = r5     // Catch:{ 3fX -> 0x01ec }
                X.8H0 r1 = (X.AnonymousClass8H0) r1     // Catch:{ 3fX -> 0x01ec }
                X.08M r0 = r9.A04     // Catch:{ 3fX -> 0x01ec }
                r0.A0G(r2)     // Catch:{ 3fX -> 0x01ec }
                X.6xR r0 = r1.A00     // Catch:{ 3fX -> 0x01ec }
                int r0 = r0.ordinal()     // Catch:{ 3fX -> 0x01ec }
                r6 = 0
                switch(r0) {
                    case 0: goto L_0x019c;
                    case 1: goto L_0x01a2;
                    case 2: goto L_0x01a8;
                    case 3: goto L_0x01b5;
                    case 4: goto L_0x01bb;
                    case 5: goto L_0x01bb;
                    default: goto L_0x0198;
                }     // Catch:{ 3fX -> 0x01ec }
            L_0x0198:
                r9.A0D(r8, r6)     // Catch:{ 3fX -> 0x01ec }
                goto L_0x01fd
            L_0x019c:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r1 = 2131889945(0x7f120f19, float:1.9414568E38)
                goto L_0x01ad
            L_0x01a2:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r1 = 2131889943(0x7f120f17, float:1.9414564E38)
                goto L_0x01ad
            L_0x01a8:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r1 = 2131889944(0x7f120f18, float:1.9414566E38)
            L_0x01ad:
                java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ 3fX -> 0x01ec }
                X.7Ks r3 = new X.7Ks     // Catch:{ 3fX -> 0x01ec }
                r3.<init>(r0, r1, r7)     // Catch:{ 3fX -> 0x01ec }
                goto L_0x01c7
            L_0x01b5:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r1 = 2131889948(0x7f120f1c, float:1.9414574E38)
                goto L_0x01c0
            L_0x01bb:
                X.4UC r5 = r9.A0F     // Catch:{ 3fX -> 0x01ec }
                r1 = 2131889947(0x7f120f1b, float:1.9414572E38)
            L_0x01c0:
                java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ 3fX -> 0x01ec }
                X.7Ks r3 = new X.7Ks     // Catch:{ 3fX -> 0x01ec }
                r3.<init>(r0, r1, r6)     // Catch:{ 3fX -> 0x01ec }
            L_0x01c7:
                r5.A0G(r3)     // Catch:{ 3fX -> 0x01ec }
                goto L_0x0198
            L_0x01cb:
                boolean r0 = r1 instanceof X.AnonymousClass8H2     // Catch:{ 3fX -> 0x01ec }
                if (r0 == 0) goto L_0x01fd
                X.4V4 r8 = r6     // Catch:{ 3fX -> 0x01ec }
                X.8Gx r7 = r5     // Catch:{ 3fX -> 0x01ec }
                X.08M r0 = r8.A04     // Catch:{ 3fX -> 0x01ec }
                r0.A0G(r2)     // Catch:{ 3fX -> 0x01ec }
                X.4UC r6 = r8.A0F     // Catch:{ 3fX -> 0x01ec }
                r5 = 2131889947(0x7f120f1b, float:1.9414572E38)
                r3 = 0
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ 3fX -> 0x01ec }
                X.7Ks r0 = new X.7Ks     // Catch:{ 3fX -> 0x01ec }
                r0.<init>(r1, r5, r3)     // Catch:{ 3fX -> 0x01ec }
                r6.A0G(r0)     // Catch:{ 3fX -> 0x01ec }
                r8.A0D(r7, r3)     // Catch:{ 3fX -> 0x01ec }
                goto L_0x01fd
            L_0x01ec:
                r3 = move-exception
                java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0207 }
                java.lang.String r0 = "GroupPendingRequestsViewModel/SendAction timeout on "
                r1.append(r0)     // Catch:{ all -> 0x0207 }
                X.6xW r0 = r4     // Catch:{ all -> 0x0207 }
                java.lang.String r0 = r0.value     // Catch:{ all -> 0x0207 }
                X.C18260x0.A15(r0, r1, r3)     // Catch:{ all -> 0x0207 }
            L_0x01fd:
                X.4V4 r0 = r6
                X.08M r0 = r0.A04
                r0.A0G(r2)
                X.2wD r0 = X.C59022wD.A00
                return r0
            L_0x0207:
                r1 = move-exception
                X.4V4 r0 = r6
                X.08M r0 = r0.A04
                r0.A0G(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1.AnonymousClass1.A09(java.lang.Object):java.lang.Object");
        }

        public final C84814Du A0A(Object obj, C84814Du r8) {
            AnonymousClass4V4 r3 = r6;
            return new AnonymousClass1(r4, r5, r3, r8, i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPendingRequestsViewModel$sendAction$1(C142636xW r2, C171398Gx r3, AnonymousClass4V4 r4, C84814Du r5, int i) {
        super(r5, 2);
        this.this$0 = r4;
        this.$row = r3;
        this.$action = r2;
        this.$position = i;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final AnonymousClass4V4 r6 = this.this$0;
            final C171398Gx r5 = this.$row;
            final C142636xW r4 = this.$action;
            final int i2 = this.$position;
            AnonymousClass1 r3 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616331p.A00(this, r3, 2000) == r2) {
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
        AnonymousClass4V4 r3 = this.this$0;
        return new GroupPendingRequestsViewModel$sendAction$1(this.$action, this.$row, r3, r8, this.$position);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
