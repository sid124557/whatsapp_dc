package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass4SG;
import X.AnonymousClass5ED;
import X.AnonymousClass5QM;
import X.AnonymousClass5U9;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C105625Vt;
import X.C107695bk;
import X.C18290x4;
import X.C18320x8;
import X.C64333Db;
import X.C88834as;
import X.C89644eZ;
import X.C96224w1;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryFrequentContactedViewModel;
import java.util.Map;

public class BusinessDirectoryFrequentContactedActivity extends C89644eZ {
    public AnonymousClass5U9 A00;
    public AnonymousClass5QM A01;
    public BusinessDirectoryFrequentContactedViewModel A02;
    public C96224w1 A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A03 = new C96224w1((AnonymousClass5ED) A2X.A2E.get());
            this.A01 = A2X.ABb();
            this.A00 = A2X.ABa();
        }
    }

    public BusinessDirectoryFrequentContactedActivity(int i) {
        this.A04 = false;
        AnonymousClass68W.A00(this, 13);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, AnonymousClass4SG.A2T(this));
        A2S.A0B(R.string.f11nameremoved);
        A2S.A0N(true);
        this.A02 = (BusinessDirectoryFrequentContactedViewModel) AnonymousClass0x9.A0H(this).A01(BusinessDirectoryFrequentContactedViewModel.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        C18320x8.A19(recyclerView, 1);
        C96224w1 r1 = this.A03;
        BusinessDirectoryFrequentContactedViewModel businessDirectoryFrequentContactedViewModel = this.A02;
        r1.A00 = businessDirectoryFrequentContactedViewModel;
        r1.A00 = businessDirectoryFrequentContactedViewModel;
        recyclerView.setAdapter(r1);
        AnonymousClass6C6.A01(this, this.A02.A00, 36);
        AnonymousClass6C6.A01(this, this.A02.A03, 37);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        BusinessDirectoryFrequentContactedViewModel businessDirectoryFrequentContactedViewModel = this.A02;
        businessDirectoryFrequentContactedViewModel.A01.A09((Integer) null, C18290x4.A0Z(), (Map) null, 12, 83, 1);
        businessDirectoryFrequentContactedViewModel.A03.A0G(new C105625Vt());
        return true;
    }

    public BusinessDirectoryFrequentContactedActivity() {
        this(0);
    }
}
