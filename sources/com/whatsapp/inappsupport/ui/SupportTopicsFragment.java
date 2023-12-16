package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C108955dq;
import X.C111095hX;
import X.C19160yr;
import X.C626936e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.whatsapp.R;
import java.util.ArrayList;

public class SupportTopicsFragment extends Hilt_SupportTopicsFragment {
    public C108955dq A00;
    public SupportTopicsActivity A01;
    public ArrayList A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.topic_list_header);
        if (this.A01.A01 != 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((AbsListView) inflate.findViewById(R.id.topic_list)).setAdapter(new C19160yr(this.A01, this.A02));
        return inflate;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A00 = (C108955dq) A0H().getParcelable("parent_topic");
        ArrayList parcelableArrayList = A0H().getParcelableArrayList("topics");
        C626936e.A06(parcelableArrayList);
        this.A02 = parcelableArrayList;
    }

    public void A1G(Context context) {
        if (C111095hX.A02(context) instanceof SupportTopicsActivity) {
            this.A01 = (SupportTopicsActivity) C111095hX.A02(context);
            super.A1G(context);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(SupportTopicsFragment.class.getSimpleName());
        A0o.append(" can only be used with ");
        throw AnonymousClass000.A0I(SupportTopicsActivity.class.getSimpleName(), A0o);
    }
}
