package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Q1;
import X.AnonymousClass0YG;
import X.AnonymousClass1VX;
import X.AnonymousClass30V;
import X.AnonymousClass4FS;
import X.AnonymousClass4WM;
import X.AnonymousClass64B;
import X.AnonymousClass69E;
import X.C04870Qz;
import X.C06130Wj;
import X.C08310eF;
import X.C108905dk;
import X.C117645sG;
import X.C55862r2;
import X.C58422vE;
import X.C626936e;
import X.C86614Ku;
import X.C86644Kx;
import X.C86664Kz;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public class IntentChooserBottomSheetDialogFragment extends Hilt_IntentChooserBottomSheetDialogFragment implements AnonymousClass64B {
    public int A00;
    public int A01;
    public GridLayoutManager A02;
    public RecyclerView A03;
    public AnonymousClass1VX A04;
    public C55862r2 A05;
    public AnonymousClass30V A06;
    public AnonymousClass4FS A07;
    public Integer A08;
    public ArrayList A09;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean A0X = this.A04.A0X(689);
        int i = R.layout.f8nameremoved;
        if (A0X) {
            i = R.layout.f8nameremoved;
        }
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, i);
        Bundle A0H = A0H();
        this.A00 = A0H.getInt("request_code");
        ArrayList parcelableArrayList = A0H.getParcelableArrayList("choosable_intents");
        C626936e.A06(parcelableArrayList);
        this.A09 = AnonymousClass002.A0J(parcelableArrayList);
        this.A01 = A0H.getInt("title_resource");
        if (A0H.containsKey("parent_fragment")) {
            this.A08 = Integer.valueOf(A0H.getInt("parent_fragment"));
        }
        TextView A0I = C86614Ku.A0I(A0R);
        this.A03 = C86664Kz.A0w(A0R, R.id.intent_recycler);
        A0G();
        AnonymousClass1 r1 = new GridLayoutManager() {
            public int A00 = 0;

            public void A0v(C04870Qz r6, AnonymousClass0Q1 r7) {
                int dimensionPixelSize;
                int i = this.A03;
                if (i > 0 && i != this.A00) {
                    this.A00 = i;
                    IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = IntentChooserBottomSheetDialogFragment.this;
                    if (intentChooserBottomSheetDialogFragment.A04.A0Y(C58422vE.A02, 689) && (dimensionPixelSize = C08310eF.A09(intentChooserBottomSheetDialogFragment).getDimensionPixelSize(R.dimen.f6nameremoved)) > 0) {
                        A1o(Math.max(1, ((i - A0C()) - A0B()) / dimensionPixelSize));
                    }
                }
                super.A0v(r6, r7);
            }
        };
        this.A02 = r1;
        this.A03.setLayoutManager(r1);
        ArrayList arrayList = this.A09;
        ArrayList A0I2 = AnonymousClass002.A0I(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C108905dk r12 = (C108905dk) it.next();
            if (r12.A04) {
                A0I2.add(r12);
                it.remove();
            }
        }
        Toolbar A0K = C86644Kx.A0K(A0R);
        if (A0K != null) {
            Iterator it2 = A0I2.iterator();
            while (it2.hasNext()) {
                C108905dk r7 = (C108905dk) it2.next();
                Drawable drawable = C08310eF.A09(this).getDrawable(r7.A05);
                if (r7.A02 != null) {
                    drawable = C06130Wj.A01(drawable);
                    AnonymousClass0YG.A06(drawable, r7.A02.intValue());
                }
                A0K.getMenu().add(0, r7.A00, 0, r7.A06).setIcon(drawable).setIntent(r7.A07).setShowAsAction(r7.A01);
            }
            A0K.A0R = new AnonymousClass69E(this, 0);
        }
        this.A03.setAdapter(new AnonymousClass4WM(this, this.A09));
        A0I.setText(this.A01);
        if (A1Y()) {
            A0R.setBackground((Drawable) null);
        }
        return A0R;
    }

    public void A0g() {
        if (this.A04.A0X(6849) && this.A00 == 14) {
            this.A07.BkM(new C117645sG((Object) this, 42));
        }
        super.A0g();
    }
}
