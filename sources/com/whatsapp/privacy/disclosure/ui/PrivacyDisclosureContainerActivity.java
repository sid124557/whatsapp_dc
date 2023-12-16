package com.whatsapp.privacy.disclosure.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass1t0;
import X.AnonymousClass3DZ;
import X.AnonymousClass5SG;
import X.AnonymousClass5W0;
import X.AnonymousClass66R;
import X.AnonymousClass6C6;
import X.C08240dc;
import X.C08310eF;
import X.C104625Rs;
import X.C120065xz;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C633638y;
import X.C64333Db;
import X.C73153f1;
import X.C822242t;
import X.C86484Kh;
import X.C89654ea;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureBottomSheetFragment;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureFullscreenFragment;
import java.util.List;

public final class PrivacyDisclosureContainerActivity extends C89654ea {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass66R A02;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            AnonymousClass1Hf.A2F(A002, this);
        }
    }

    public final boolean A6l() {
        C104625Rs r0;
        C633638y r4;
        C104625Rs r02;
        C08310eF privacyDisclosureBottomSheetFragment;
        int i;
        AnonymousClass66R r6 = this.A02;
        PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) r6.getValue();
        AnonymousClass5SG r03 = (AnonymousClass5SG) privacyDisclosureContainerViewModel.A03.A07();
        if (r03 == null || (r0 = (C104625Rs) r03.A02) == null) {
            return false;
        }
        List list = r0.A01;
        int i2 = privacyDisclosureContainerViewModel.A00;
        if (i2 < 0 || i2 >= list.size() || (r4 = (C633638y) list.get(privacyDisclosureContainerViewModel.A00)) == null) {
            return false;
        }
        AnonymousClass5SG r04 = (AnonymousClass5SG) ((PrivacyDisclosureContainerViewModel) r6.getValue()).A02.A07();
        if (r04 == null || (r02 = (C104625Rs) r04.A02) == null) {
            throw AnonymousClass001.A0g("No data from view model");
        }
        int i3 = r02.A00;
        if (getSupportFragmentManager().A0D(A6j()) == null) {
            int i4 = ((PrivacyDisclosureContainerViewModel) r6.getValue()).A00;
            int ordinal = r4.A04.ordinal();
            if (ordinal == 2 || ordinal == 0 || ordinal == 1) {
                privacyDisclosureBottomSheetFragment = new PrivacyDisclosureBottomSheetFragment();
            } else if (ordinal == 3) {
                privacyDisclosureBottomSheetFragment = new PrivacyDisclosureFullscreenFragment();
            } else {
                throw C73153f1.A00();
            }
            Bundle A08 = AnonymousClass002.A08();
            A08.putInt("argDisclosureId", i3);
            A08.putInt("argPromptIndex", i4);
            A08.putParcelable("argPrompt", r4);
            privacyDisclosureBottomSheetFragment.A0u(A08);
            if (privacyDisclosureBottomSheetFragment instanceof DialogFragment) {
                Bon((DialogFragment) privacyDisclosureBottomSheetFragment, A6j());
            } else {
                C08240dc A0J = AnonymousClass0x2.A0J(this);
                A0J.A02 = R.anim.f0nameremoved;
                A0J.A03 = R.anim.f0nameremoved;
                A0J.A05 = R.anim.f0nameremoved;
                A0J.A06 = R.anim.f0nameremoved;
                A0J.A0E(privacyDisclosureBottomSheetFragment, A6j(), R.id.fragment_container);
                A0J.A02();
            }
            switch (((PrivacyDisclosureContainerViewModel) r6.getValue()).A00) {
                case 0:
                    i = 105;
                    break;
                case 1:
                    i = 111;
                    break;
                case 2:
                    i = 112;
                    break;
                case 3:
                    i = 113;
                    break;
                case 4:
                    i = 114;
                    break;
                case 5:
                    i = 115;
                    break;
                case 6:
                    i = 116;
                    break;
                case 7:
                    i = 117;
                    break;
                case 8:
                    i = 118;
                    break;
                case 9:
                    i = 119;
                    break;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                ((PrivacyDisclosureContainerViewModel) r6.getValue()).A0D(valueOf.intValue());
                return true;
            }
        }
        return true;
    }

    public PrivacyDisclosureContainerActivity(int i) {
        this.A00 = false;
        AnonymousClass1Hf.A2D(this, 71);
    }

    public final String A6j() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("pdf_");
        return AnonymousClass000.A0h(A0o, ((PrivacyDisclosureContainerViewModel) this.A02.getValue()).A00);
    }

    public final void A6k() {
        AnonymousClass5W0 r3;
        int intExtra = getIntent().getIntExtra("disclosure_id", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        if (intExtra == -1) {
            valueOf = null;
        }
        String stringExtra = getIntent().getStringExtra("surface");
        Intent intent = getIntent();
        C162457s7.A0D(intent);
        int intExtra2 = intent.getIntExtra("trigger", -1);
        if (intExtra2 == 0) {
            r3 = AnonymousClass5W0.A02;
        } else if (intExtra2 == 1) {
            r3 = AnonymousClass5W0.A03;
        } else if (intExtra2 == 2) {
            r3 = AnonymousClass5W0.A04;
        } else if (intExtra2 != 3) {
            r3 = AnonymousClass5W0.A06;
        } else {
            r3 = AnonymousClass5W0.A05;
        }
        PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) this.A02.getValue();
        StringBuilder A0g = C18280x3.A0g(r3, 2);
        A0g.append("PrivacyDisclosureContainerViewModel: loadDisclosureData: id=");
        A0g.append(valueOf);
        C18260x0.A0q(", surf=", stringExtra, A0g);
        privacyDisclosureContainerViewModel.A01 = r3;
        C18270x1.A0w(new AnonymousClass1t0(privacyDisclosureContainerViewModel, valueOf, stringExtra), privacyDisclosureContainerViewModel.A08);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        ((PrivacyDisclosureContainerViewModel) this.A02.getValue()).A02.A0B(this, new AnonymousClass6C6(new C822242t(this), 271));
        getSupportFragmentManager().A0j(new C86484Kh(this, 2), this, "fragResultRequestKey");
        A6k();
    }

    public PrivacyDisclosureContainerActivity() {
        this(0);
        this.A02 = C154517dI.A01(new C120065xz(this));
    }
}
