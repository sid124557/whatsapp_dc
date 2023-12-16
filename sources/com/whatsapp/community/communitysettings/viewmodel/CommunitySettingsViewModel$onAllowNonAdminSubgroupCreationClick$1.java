package com.whatsapp.community.communitysettings.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel$onAllowNonAdminSubgroupCreationClick$1", f = "CommunitySettingsViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
public final class CommunitySettingsViewModel$onAllowNonAdminSubgroupCreationClick$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $allow;
    public int label;
    public final /* synthetic */ CommunitySettingsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel$onAllowNonAdminSubgroupCreationClick$1$1", f = "CommunitySettingsViewModel.kt", i = {0, 0, 0}, l = {191}, m = "invokeSuspend", n = {"desiredSetting", "it", "currentSetting"}, s = {"L$0", "L$2", "L$3"})
    /* renamed from: com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel$onAllowNonAdminSubgroupCreationClick$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A09(java.lang.Object r11) {
            /*
                r10 = this;
                X.218 r9 = X.AnonymousClass218.COROUTINE_SUSPENDED
                int r0 = r10.label
                r8 = 1
                if (r0 == 0) goto L_0x006d
                if (r0 != r8) goto L_0x00b1
                boolean r3 = r10.Z$0
                java.lang.Object r7 = r10.L$3
                X.20R r7 = (X.AnonymousClass20R) r7
                java.lang.Object r5 = r10.L$2
                X.1fJ r5 = (X.C27991fJ) r5
                java.lang.Object r6 = r10.L$1
                com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r6 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r6
                java.lang.Object r4 = r10.L$0
                X.20R r4 = (X.AnonymousClass20R) r4
                X.C57682u2.A01(r11)
            L_0x001e:
                X.1Ni r0 = X.C22421Ni.A00
                boolean r0 = X.C162457s7.A0P(r11, r0)
                if (r0 == 0) goto L_0x005b
                X.107 r2 = r6.A0F
                X.21C r0 = X.AnonymousClass21C.SUCCESS
                X.2jh r1 = new X.2jh
                r1.<init>(r4, r0)
            L_0x002f:
                r2.A0G(r1)
            L_0x0032:
                X.33U r4 = r6.A09
                X.4Cd r0 = r6.A07
                int r0 = r0.B9t(r5)
                java.lang.Integer r0 = X.AnonymousClass33U.A01(r0)
                if (r3 == 0) goto L_0x0050
                if (r0 == 0) goto L_0x004d
                r2 = 8
                int r1 = r0.intValue()
                r0 = 19
            L_0x004a:
                r4.A03(r0, r2, r1)
            L_0x004d:
                X.2wD r0 = X.C59022wD.A00
                return r0
            L_0x0050:
                if (r0 == 0) goto L_0x004d
                r2 = 8
                int r1 = r0.intValue()
                r0 = 18
                goto L_0x004a
            L_0x005b:
                X.1Nh r0 = X.AnonymousClass1Nh.A00
                boolean r0 = X.C162457s7.A0P(r11, r0)
                if (r0 == 0) goto L_0x0032
                X.107 r2 = r6.A0F
                X.21C r0 = X.AnonymousClass21C.FAILED
                X.2jh r1 = new X.2jh
                r1.<init>(r7, r0)
                goto L_0x002f
            L_0x006d:
                X.C57682u2.A01(r11)
                boolean r3 = r2
                if (r3 == 0) goto L_0x00ae
                X.20R r4 = X.AnonymousClass20R.EVERYONE
            L_0x0076:
                com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r6 = r4
                X.1fJ r5 = r6.A03
                if (r5 == 0) goto L_0x004d
                X.3Ex r0 = r6.A0A
                X.3ZH r0 = r0.A07(r5)
                if (r0 == 0) goto L_0x00ab
                boolean r0 = r0.A0d
                if (r0 != r8) goto L_0x00ab
                X.20R r7 = X.AnonymousClass20R.EVERYONE
            L_0x008a:
                X.107 r2 = r6.A0F
                X.21C r1 = X.AnonymousClass21C.REQUESTING
                X.2jh r0 = new X.2jh
                r0.<init>(r4, r1)
                r2.A0G(r0)
                com.whatsapp.community.AllowNonAdminSubGroupCreationProtocolHelper r0 = r6.A05
                r10.L$0 = r4
                r10.L$1 = r6
                r10.L$2 = r5
                r10.L$3 = r7
                r10.Z$0 = r3
                r10.label = r8
                java.lang.Object r11 = r0.A00(r5, r10, r3)
                if (r11 != r9) goto L_0x001e
                return r9
            L_0x00ab:
                X.20R r7 = X.AnonymousClass20R.ADMINS
                goto L_0x008a
            L_0x00ae:
                X.20R r4 = X.AnonymousClass20R.ADMINS
                goto L_0x0076
            L_0x00b1:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel$onAllowNonAdminSubgroupCreationClick$1.AnonymousClass1.A09(java.lang.Object):java.lang.Object");
        }

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(communitySettingsViewModel, r5, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySettingsViewModel$onAllowNonAdminSubgroupCreationClick$1(CommunitySettingsViewModel communitySettingsViewModel, C84814Du r3, boolean z) {
        super(r3, 2);
        this.this$0 = communitySettingsViewModel;
        this.$allow = z;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final CommunitySettingsViewModel communitySettingsViewModel = this.this$0;
            C73853gB r3 = communitySettingsViewModel.A0I;
            final boolean z = this.$allow;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CommunitySettingsViewModel$onAllowNonAdminSubgroupCreationClick$1(this.this$0, r5, this.$allow);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
