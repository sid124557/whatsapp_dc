package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass4GR;
import X.AnonymousClass5AG;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$enableEffect$1", f = "CallAvatarViewModel.kt", i = {0, 1}, l = {743, 751, 761}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
public final class CallAvatarViewModel$enableEffect$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $productSessionId;
    public final /* synthetic */ boolean $shouldApplyLoadingState;
    public final /* synthetic */ AnonymousClass5AG $stateBeforeEnabling;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CallAvatarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallAvatarViewModel$enableEffect$1(CallAvatarViewModel callAvatarViewModel, AnonymousClass5AG r3, String str, C84814Du r5, boolean z) {
        super(r5, 2);
        this.this$0 = callAvatarViewModel;
        this.$shouldApplyLoadingState = z;
        this.$productSessionId = str;
        this.$stateBeforeEnabling = r3;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object A09(java.lang.Object r18) {
        /*
            r17 = this;
            r2 = r18
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            r5 = r17
            int r0 = r5.label
            r8 = 3
            r9 = 2
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r6) goto L_0x0020
            if (r0 == r9) goto L_0x001b
            if (r0 != r8) goto L_0x0016
            goto L_0x00a5
        L_0x0016:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x001b:
            java.lang.Object r3 = r5.L$0
            X.4C6 r3 = (X.AnonymousClass4C6) r3
            goto L_0x0050
        L_0x0020:
            java.lang.Object r3 = r5.L$0
            X.4C6 r3 = (X.AnonymousClass4C6) r3
            X.C57682u2.A01(r2)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            goto L_0x003d
        L_0x0028:
            X.C57682u2.A01(r2)
            java.lang.Object r3 = r5.L$0
            X.4C6 r3 = (X.AnonymousClass4C6) r3
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.107 r2 = r0.A0K     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            boolean r1 = r5.$shouldApplyLoadingState     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.4j0 r0 = new X.4j0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r0.<init>(r1)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r2.A0H(r0)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
        L_0x003d:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase r2 = r0.A0D     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.String r1 = r5.$productSessionId     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.5Fx r0 = r0.A0E     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r5.L$0 = r3     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r5.label = r9     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.Object r2 = r2.A01(r0, r1, r5)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            if (r2 != r7) goto L_0x0053
            return r7
        L_0x0050:
            X.C57682u2.A01(r2)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
        L_0x0053:
            X.5Xg r2 = (X.C106005Xg) r2     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect Effect fetched"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.5MN r1 = r0.A0B     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r0 = 0
            X.C162457s7.A0J(r2, r0)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.2p0 r0 = r1.A00     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.2yH r1 = r0.A00()     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.9Te r10 = r2.A00     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.String r13 = r2.A03     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.String r14 = r2.A05     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.String r15 = r2.A04     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.String r0 = r2.A06     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r12 = 0
            if (r1 == 0) goto L_0x00a2
            X.7yt r11 = r1.A04     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.7yt r12 = r1.A02     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
        L_0x0079:
            X.5Xg r9 = new X.5Xg     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect FB credentials added"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.107 r1 = r0.A0K     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.4iw r0 = X.C91114iw.A00     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r1.A0H(r0)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r2 = r5.this$0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase r1 = r2.A0A     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.5HR r0 = new X.5HR     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r0.<init>(r2, r3)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r5.L$0 = r4     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r5.label = r8     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            java.lang.Object r0 = r1.A00(r0, r9, r5)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            if (r0 != r7) goto L_0x00a8
            goto L_0x00a4
        L_0x00a2:
            r11 = r4
            goto L_0x0079
        L_0x00a4:
            return r7
        L_0x00a5:
            X.C57682u2.A01(r2)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
        L_0x00a8:
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect Assets loaded"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.5ZG r3 = r0.A08     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            monitor-enter(r3)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.4sm r9 = r3.A01     // Catch:{ all -> 0x0115 }
            if (r9 != 0) goto L_0x00bc
            java.lang.String r0 = "CallAvatarLogger/onEffectEnabled No session"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0115 }
            goto L_0x00f7
        L_0x00bc:
            X.594 r0 = X.AnonymousClass594.EFFECT_ENABLED     // Catch:{ all -> 0x0115 }
            boolean r0 = r3.A06(r0, r9)     // Catch:{ all -> 0x0115 }
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "CallAvatarLogger/onEffectInitialized Session has unexpected fields"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0115 }
            goto L_0x00f7
        L_0x00ca:
            X.2sH r0 = r3.A02     // Catch:{ all -> 0x0115 }
            long r7 = r0.A0H()     // Catch:{ all -> 0x0115 }
            java.lang.Long r0 = r9.A0F     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x010b
            long r0 = r0.longValue()     // Catch:{ all -> 0x0115 }
            long r7 = r7 - r0
            java.lang.Long r0 = r9.A0E     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x0110
            long r1 = r0.longValue()     // Catch:{ all -> 0x0115 }
            long r7 = r7 - r1
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0115 }
            r9.A0D = r0     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x0106
            long r1 = r1 + r7
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0115 }
            r9.A0G = r0     // Catch:{ all -> 0x0115 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0115 }
            r9.A03 = r0     // Catch:{ all -> 0x0115 }
        L_0x00f7:
            monitor-exit(r3)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.107 r1 = r0.A0K     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            X.4iz r0 = new X.4iz     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r0.<init>(r6)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            r1.A0H(r0)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            goto L_0x01b2
        L_0x0106:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0115 }
            goto L_0x0114
        L_0x010b:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0115 }
            goto L_0x0114
        L_0x0110:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x0115 }
        L_0x0114:
            throw r0     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
            throw r0     // Catch:{ CancellationException -> 0x01b9, 5tF -> 0x012c, all -> 0x0118 }
        L_0x0118:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect Unexpected error occurred="
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x01d9 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ all -> 0x01d9 }
            X.5ZG r1 = r0.A08     // Catch:{ all -> 0x01d9 }
            r0 = 99
            r1.A03(r0)     // Catch:{ all -> 0x01d9 }
            throw r2     // Catch:{ all -> 0x01d9 }
        L_0x012c:
            r7 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect Error occurred="
            X.C18260x0.A1Q(r1, r0, r7)     // Catch:{ all -> 0x01d9 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ all -> 0x01d9 }
            X.5ZG r1 = r0.A08     // Catch:{ all -> 0x01d9 }
            X.4ih r0 = X.C90974ih.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x0144
            r0 = 5
            goto L_0x018f
        L_0x0144:
            X.4il r0 = X.C91014il.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x018e
            X.4ij r0 = X.C90994ij.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x018e
            boolean r0 = r7 instanceof X.C90944ie     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x015a
            r0 = 1
            goto L_0x018f
        L_0x015a:
            X.4ik r0 = X.C91004ik.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x018c
            boolean r0 = r7 instanceof X.C90934id     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x018c
            X.4ii r0 = X.C90984ii.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x0171
            r0 = 10
            goto L_0x018f
        L_0x0171:
            X.4if r0 = X.C90954if.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x017c
            r0 = 11
            goto L_0x018f
        L_0x017c:
            X.4ig r0 = X.C90964ig.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x0187
            r0 = 99
            goto L_0x018f
        L_0x0187:
            X.3f1 r0 = X.C73153f1.A00()     // Catch:{ all -> 0x01d9 }
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x018c:
            r0 = 7
            goto L_0x018f
        L_0x018e:
            r0 = 2
        L_0x018f:
            r1.A03(r0)     // Catch:{ all -> 0x01d9 }
            X.5AG r1 = r5.$stateBeforeEnabling     // Catch:{ all -> 0x01d9 }
            boolean r0 = r1 instanceof X.C91104iv     // Catch:{ all -> 0x01d9 }
            r3 = 0
            if (r0 == 0) goto L_0x01a2
            X.4iv r1 = (X.C91104iv) r1     // Catch:{ all -> 0x01d9 }
            X.5AF r0 = r1.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r0 instanceof X.C91064ir     // Catch:{ all -> 0x01d9 }
            r2 = 1
            if (r0 != 0) goto L_0x01a3
        L_0x01a2:
            r2 = 0
        L_0x01a3:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ all -> 0x01d9 }
            X.107 r1 = r0.A0K     // Catch:{ all -> 0x01d9 }
            if (r2 == 0) goto L_0x01aa
            r3 = 1
        L_0x01aa:
            X.4j1 r0 = new X.4j1     // Catch:{ all -> 0x01d9 }
            r0.<init>(r7, r3, r6)     // Catch:{ all -> 0x01d9 }
            r1.A0H(r0)     // Catch:{ all -> 0x01d9 }
        L_0x01b2:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0
            r0.A01 = r4
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x01b9:
            r7 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "voip/CallAvatarViewModel/enableEffect Canceled="
            X.C18260x0.A1P(r1, r0, r7)     // Catch:{ all -> 0x01d9 }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0     // Catch:{ all -> 0x01d9 }
            X.107 r3 = r0.A0K     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7 instanceof X.C118485tc     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x01d7
            X.4ig r2 = X.C90964ig.A00     // Catch:{ all -> 0x01d9 }
        L_0x01cd:
            r1 = 0
            X.4j1 r0 = new X.4j1     // Catch:{ all -> 0x01d9 }
            r0.<init>(r2, r1, r6)     // Catch:{ all -> 0x01d9 }
            r3.A0H(r0)     // Catch:{ all -> 0x01d9 }
            throw r7     // Catch:{ all -> 0x01d9 }
        L_0x01d7:
            r2 = r4
            goto L_0x01cd
        L_0x01d9:
            r1 = move-exception
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r5.this$0
            r0.A01 = r4
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$enableEffect$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        CallAvatarViewModel callAvatarViewModel = this.this$0;
        boolean z = this.$shouldApplyLoadingState;
        CallAvatarViewModel$enableEffect$1 callAvatarViewModel$enableEffect$1 = new CallAvatarViewModel$enableEffect$1(callAvatarViewModel, this.$stateBeforeEnabling, this.$productSessionId, r8, z);
        callAvatarViewModel$enableEffect$1.L$0 = obj;
        return callAvatarViewModel$enableEffect$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
