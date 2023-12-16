package com.whatsapp.storage;

import X.AnonymousClass0AR;
import X.AnonymousClass0x9;
import X.AnonymousClass35V;
import X.AnonymousClass5V0;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C1231967m;
import X.C18300x5;
import X.C19340zH;
import X.C620733j;
import X.C626936e;
import X.C69263Wi;
import X.C86604Kt;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public class StorageUsageDeleteCompleteDialogFragment extends Hilt_StorageUsageDeleteCompleteDialogFragment {
    public C69263Wi A00;

    public void A1O(C08270df r2, String str) {
        C08240dc r0 = new C08240dc(r2);
        r0.A0C(this, str);
        r0.A02();
    }

    public void A0f() {
        super.A0f();
        this.A03.getWindow().setLayout(C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved), -2);
    }

    public Dialog A1J(Bundle bundle) {
        Context A1D = A1D();
        Bundle A0H = A0H();
        View A0F = C86604Kt.A0F(LayoutInflater.from(A1D), R.layout.f8nameremoved);
        ImageView A0E = AnonymousClass0x9.A0E(A0F, R.id.check_mark_image_view);
        AnonymousClass0AR A04 = AnonymousClass0AR.A04(A1D, R.drawable.vec_storage_usage_check_mark_icon);
        C626936e.A06(A04);
        A0E.setImageDrawable(A04);
        A04.start();
        A04.A09(new C1231967m(this, 2));
        TextView A0G = C18300x5.A0G(A0F, R.id.title_text_view);
        C620733j r6 = this.A01;
        Pair A002 = AnonymousClass35V.A00(r6, A0H.getLong("deleted_disk_size"), true, false);
        A0G.setText(r6.A0J((String) A002.second, new Object[]{A002.first}, R.plurals.f9nameremoved));
        C19340zH A02 = AnonymousClass5V0.A02(A1D, A0F);
        A02.A0i(true);
        return A02.create();
    }
}
