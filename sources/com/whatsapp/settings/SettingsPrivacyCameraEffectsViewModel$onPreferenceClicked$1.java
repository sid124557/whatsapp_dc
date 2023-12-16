package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass5WT;
import X.C118255tF;
import X.C18270x1;
import X.C18320x8;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.calling.avatar.CallAvatarFLMConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1", f = "SettingsPrivacyCameraEffectsViewModel.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SettingsPrivacyCameraEffectsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1$1", f = "SettingsPrivacyCameraEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                SettingsPrivacyCameraEffectsViewModel.this.A05.A00(AnonymousClass5WT.A02);
                SettingsPrivacyCameraEffectsViewModel.this.A05.A00(AnonymousClass5WT.A01);
                C18270x1.A0g(C18270x1.A04(SettingsPrivacyCameraEffectsViewModel.this.A04.A01).remove("pref_last_avatar_calling_use_time"), "pref_last_upsell_banner_shown_time");
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass1((C84814Du) obj2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1(SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = settingsPrivacyCameraEffectsViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass4C6 r4;
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r4 = (AnonymousClass4C6) this.L$0;
            SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel = this.this$0;
            settingsPrivacyCameraEffectsViewModel.A01 = true;
            try {
                CallAvatarFLMConsentManager callAvatarFLMConsentManager = settingsPrivacyCameraEffectsViewModel.A02;
                this.L$0 = r4;
                this.label = 1;
                if (callAvatarFLMConsentManager.A01(false, this) == r3) {
                    return r3;
                }
            } catch (C118255tF unused) {
                SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel2 = this.this$0;
                settingsPrivacyCameraEffectsViewModel2.A01 = false;
                settingsPrivacyCameraEffectsViewModel2.A09.A0H((Object) null);
            }
        } else if (i == 1) {
            r4 = (AnonymousClass4C6) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        final SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel3 = this.this$0;
        C616131n.A02(settingsPrivacyCameraEffectsViewModel3.A0A, new AnonymousClass1((C84814Du) null), r4, (AnonymousClass20D) null, 2);
        SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel4 = this.this$0;
        settingsPrivacyCameraEffectsViewModel4.A01 = false;
        C18320x8.A18(settingsPrivacyCameraEffectsViewModel4.A07, false);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1 settingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1 = new SettingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1(this.this$0, r4);
        settingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1.L$0 = obj;
        return settingsPrivacyCameraEffectsViewModel$onPreferenceClicked$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
