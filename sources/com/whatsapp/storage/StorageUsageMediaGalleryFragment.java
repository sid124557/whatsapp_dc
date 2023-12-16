package com.whatsapp.storage;

import X.AnonymousClass001;
import X.AnonymousClass0YZ;
import X.AnonymousClass319;
import X.AnonymousClass4FW;
import X.AnonymousClass677;
import X.AnonymousClass8GZ;
import X.C105025Tg;
import X.C106405Yw;
import X.C111095hX;
import X.C124166Bf;
import X.C18300x5;
import X.C186058ug;
import X.C187958y5;
import X.C29431io;
import X.C30471mV;
import X.C33141sV;
import X.C48042eF;
import X.C55682qk;
import X.C55832qz;
import X.C626936e;
import X.C66543Lv;
import X.C95294tG;
import X.C95804uY;
import X.C95814uZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class StorageUsageMediaGalleryFragment extends Hilt_StorageUsageMediaGalleryFragment {
    public int A00;
    public C111095hX A01;
    public C55682qk A02;
    public C66543Lv A03;
    public AnonymousClass319 A04;
    public C29431io A05;
    public C48042eF A06;
    public C95814uZ A07;
    public C55832qz A08;
    public C105025Tg A09;
    public C33141sV A0A;
    public C187958y5 A0B;
    public final AnonymousClass4FW A0C = new C124166Bf(this, 26);

    public void A0o(Bundle bundle) {
        this.A0X = true;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("storage_media_gallery_fragment_gallery_type", 0);
            TextView A0G = C18300x5.A0G(this.A0B, R.id.no_media_text);
            if (this.A00 == 0) {
                C95814uZ A022 = C106405Yw.A02(bundle2, "storage_media_gallery_fragment_jid");
                C626936e.A06(A022);
                this.A07 = A022;
                boolean z = A022 instanceof C95804uY;
                int i = R.string.f11nameremoved;
                if (z) {
                    i = R.string.f11nameremoved;
                }
                A0G.setText(i);
            } else {
                A0G.setVisibility(8);
            }
        }
        AnonymousClass0YZ.A0G(this.A0C, true);
        AnonymousClass0YZ.A0G(A0J().findViewById(R.id.no_media), true);
        A1T(false);
        this.A05.A06(this.A0C);
    }

    public boolean A1X(C186058ug r5, C95294tG r6) {
        C30471mV r3 = ((AnonymousClass8GZ) r5).A03;
        boolean A1V = A1V();
        AnonymousClass677 r0 = (AnonymousClass677) A0R();
        if (A1V) {
            r6.setChecked(r0.Bqw(r3));
            return true;
        }
        r0.Bpx(r3);
        r6.setChecked(true);
        return true;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0a() {
        super.A0a();
        this.A05.A07(this.A0C);
    }
}
