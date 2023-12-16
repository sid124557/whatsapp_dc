package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass0IV;
import X.AnonymousClass0x9;
import X.AnonymousClass107;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass4GP;
import X.AnonymousClass4GR;
import X.AnonymousClass4L0;
import X.AnonymousClass4UC;
import X.AnonymousClass59B;
import X.AnonymousClass5NO;
import X.AnonymousClass5WT;
import X.C05550Ty;
import X.C103425Mx;
import X.C18270x1;
import X.C18320x8;
import X.C185408tb;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import X.C86634Kw;
import com.whatsapp.calling.avatar.CallAvatarFLMConsentManager;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class SettingsPrivacyCameraEffectsViewModel extends C05550Ty implements C185408tb {
    public C85474Gj A00;
    public boolean A01;
    public final CallAvatarFLMConsentManager A02;
    public final AnonymousClass5NO A03;
    public final C103425Mx A04;
    public final AnonymousClass5WT A05;
    public final AnonymousClass107 A06 = AnonymousClass4L0.A0O(Boolean.TRUE);
    public final AnonymousClass107 A07 = AnonymousClass4L0.A0O(Boolean.FALSE);
    public final AnonymousClass4UC A08 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A09 = AnonymousClass0x9.A0b();
    public final C73853gB A0A;

    @DebugMetadata(c = "com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$1", f = "SettingsPrivacyCameraEffectsViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                CallAvatarFLMConsentManager callAvatarFLMConsentManager = SettingsPrivacyCameraEffectsViewModel.this.A02;
                this.label = 1;
                if (callAvatarFLMConsentManager.A02(this) == r2) {
                    return r2;
                }
            } else if (i == 1) {
                C57682u2.A01(obj);
            } else {
                throw AnonymousClass001.A0d();
            }
            SettingsPrivacyCameraEffectsViewModel.this.A0D();
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass1((C84814Du) obj2));
        }
    }

    public SettingsPrivacyCameraEffectsViewModel(CallAvatarFLMConsentManager callAvatarFLMConsentManager, AnonymousClass5NO r6, C103425Mx r7, AnonymousClass5WT r8, C73853gB r9) {
        C18270x1.A11(callAvatarFLMConsentManager, 3, r7);
        this.A05 = r8;
        this.A03 = r6;
        this.A02 = callAvatarFLMConsentManager;
        this.A04 = r7;
        this.A0A = r9;
        C616131n.A02((C85494Gl) null, new AnonymousClass1((C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    public final void A0D() {
        C18320x8.A18(this.A06, this.A03.A00());
        C18320x8.A18(this.A07, AnonymousClass0x9.A1Q(this.A02.A00));
    }

    public AnonymousClass59B B7k() {
        return this.A02.A00();
    }

    public void BSf(AnonymousClass4GP r5, AnonymousClass4GP r6) {
        if (AnonymousClass001.A1Z(C86634Kw.A0v(this.A07))) {
            Log.e("SettingsPrivacyCameraEffectsViewModelonFLMConsentBottomSheetPrimaryButtonClicked isSwitchChecked is expected to be false but is true");
        }
        if (AnonymousClass0x9.A1Q(this.A02.A00)) {
            Log.e("SettingsPrivacyCameraEffectsViewModelonFLMConsentBottomSheetPrimaryButtonClicked Camera effects on calls are already enabled");
            r5.invoke();
            return;
        }
        this.A00 = C616131n.A02((C85494Gl) null, new SettingsPrivacyCameraEffectsViewModel$onFLMConsentBottomSheetPrimaryButtonClicked$1(this, (C84814Du) null, r5, r6), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    public void BSg(AnonymousClass4GP r5, AnonymousClass4GP r6) {
        if (AnonymousClass001.A1Z(C86634Kw.A0v(this.A07))) {
            Log.e("SettingsPrivacyCameraEffectsViewModelonFLMConsentBottomSheetSecondaryButtonClicked isSwitchChecked is expected to be false but is true");
        }
        if (AnonymousClass0x9.A1Q(this.A02.A00)) {
            Log.e("SettingsPrivacyCameraEffectsViewModelonFLMConsentBottomSheetSecondaryButtonClicked Camera effects on calls are already enabled");
        }
        this.A00 = C616131n.A02((C85494Gl) null, new SettingsPrivacyCameraEffectsViewModel$onFLMConsentBottomSheetSecondaryButtonClicked$1(this, (C84814Du) null, r5, r6), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    public void BSe() {
        C616131n.A02((C85494Gl) null, new SettingsPrivacyCameraEffectsViewModel$onFLMConsentBottomSheetDismissed$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }
}
