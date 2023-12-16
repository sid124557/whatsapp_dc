package com.whatsapp.conversation.selection;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass2z0;
import X.AnonymousClass4SG;
import X.AnonymousClass5R7;
import X.AnonymousClass5ZU;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C1001359q;
import X.C103175Lv;
import X.C107395bF;
import X.C107695bk;
import X.C18270x1;
import X.C18290x4;
import X.C30471mV;
import X.C624134x;
import X.C64333Db;
import X.C64773Ex;
import X.C86644Kx;
import X.C88834as;
import X.C93714pB;
import X.C94084pr;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SelectedImageAndVideoAlbumActivity extends C94084pr {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;
    public C93714pB A02;
    public SelectedImageAlbumViewModel A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A05 = (AnonymousClass5R7) r1.A2p.get();
            this.A02 = (C103175Lv) A2W.A0j.get();
            this.A00 = C64333Db.A26(r2);
            this.A01 = C64333Db.A28(r2);
            this.A02 = A2W.ACE();
        }
    }

    public final C30471mV A7A() {
        SelectedImageAlbumViewModel selectedImageAlbumViewModel = this.A03;
        if (selectedImageAlbumViewModel == null) {
            throw C18270x1.A0S("selectedImageAlbumViewModel");
        }
        List A0h = C86644Kx.A0h(selectedImageAlbumViewModel.A00);
        if (A0h == null || A0h.isEmpty()) {
            return null;
        }
        return (C30471mV) C18290x4.A0k(A0h);
    }

    public SelectedImageAndVideoAlbumActivity(int i) {
        this.A04 = false;
        AnonymousClass68W.A00(this, 48);
    }

    public void onCreate(Bundle bundle) {
        List A042;
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("fMessageKeyBundle");
        if (bundleExtra == null) {
            A042 = null;
        } else {
            A042 = C107395bF.A04(bundleExtra);
        }
        if (A042 == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        SelectedImageAlbumViewModel selectedImageAlbumViewModel = (SelectedImageAlbumViewModel) AnonymousClass0x9.A0H(this).A01(SelectedImageAlbumViewModel.class);
        this.A03 = selectedImageAlbumViewModel;
        if (selectedImageAlbumViewModel == null) {
            throw C18270x1.A0S("selectedImageAlbumViewModel");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A042.iterator();
        while (true) {
            if (!it.hasNext()) {
                selectedImageAlbumViewModel.A00.A0H(A0s);
                selectedImageAlbumViewModel.A01.A06(selectedImageAlbumViewModel.A03.getValue());
                break;
            }
            C624134x A05 = selectedImageAlbumViewModel.A02.A05((AnonymousClass2z0) it.next());
            if (!(A05 instanceof C30471mV)) {
                break;
            }
            A0s.add(A05);
        }
        SelectedImageAlbumViewModel selectedImageAlbumViewModel2 = this.A03;
        if (selectedImageAlbumViewModel2 == null) {
            throw C18270x1.A0S("selectedImageAlbumViewModel");
        }
        AnonymousClass6C6.A02(this, selectedImageAlbumViewModel2.A00, C1001359q.A00(this, 24), 226);
    }

    public SelectedImageAndVideoAlbumActivity() {
        this(0);
    }
}
