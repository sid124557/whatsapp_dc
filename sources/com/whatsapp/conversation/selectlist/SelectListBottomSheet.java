package com.whatsapp.conversation.selectlist;

import X.AnonymousClass001;
import X.AnonymousClass37D;
import X.AnonymousClass39W;
import X.AnonymousClass4XS;
import X.AnonymousClass7HX;
import X.C06560Yg;
import X.C108725dS;
import X.C108785dY;
import X.C109475eg;
import X.C1231767k;
import X.C156427gb;
import X.C182328oE;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C626936e;
import X.C86604Kt;
import X.C86644Kx;
import X.C86664Kz;
import X.C87864Wk;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class SelectListBottomSheet extends Hilt_SelectListBottomSheet {
    public C182328oE A00;
    public AnonymousClass39W A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0c() {
        super.A0c();
        this.A00 = null;
    }

    public void A0w(Bundle bundle, View view) {
        String str;
        super.A0w(bundle, view);
        AnonymousClass39W r0 = (AnonymousClass39W) A0H().getParcelable("arg_select_list_content");
        this.A01 = r0;
        if (r0 == null) {
            A1K();
            return;
        }
        if (A1Y()) {
            view.setBackground((Drawable) null);
        }
        C18290x4.A1G(view.findViewById(R.id.close), this, 17);
        if (this.A01.A00 == 8) {
            C18300x5.A0G(view, R.id.select_list_button).setText(R.string.f11nameremoved);
        }
        C86644Kx.A0M(view, R.id.select_list_title).A0K((List) null, this.A01.A07);
        RecyclerView A0w = C86664Kz.A0w(view, R.id.select_list_items);
        C1231767k.A00(A0w, this, 7);
        A0w.setNestedScrollingEnabled(true);
        A0w.A0o(new AnonymousClass4XS());
        C87864Wk r2 = new C87864Wk();
        A0w.setAdapter(r2);
        AnonymousClass39W r02 = this.A01;
        C626936e.A06(r02);
        List<C108725dS> list = r02.A0B;
        ArrayList A0s = AnonymousClass001.A0s();
        for (C108725dS r6 : list) {
            String str2 = r6.A01;
            if (!TextUtils.isEmpty(str2)) {
                A0s.add(new C156427gb(str2));
            }
            int i = 0;
            while (true) {
                List list2 = r6.A02;
                if (i < list2.size()) {
                    C108785dY r4 = (C108785dY) list2.get(i);
                    if (i == 0) {
                        str = r6.A00;
                    } else {
                        str = null;
                    }
                    A0s.add(new C156427gb(r4, str));
                    i++;
                }
            }
        }
        if (this.A01.A00 == 8) {
            int i2 = 0;
            while (true) {
                if (i2 >= A0s.size()) {
                    break;
                } else if (C18320x8.A1U(((C156427gb) A0s.get(i2)).A02)) {
                    i2++;
                } else if (i2 != -1) {
                    r2.A00 = i2;
                    C06560Yg.A02(view, R.id.select_list_button).setVisibility(0);
                    C86604Kt.A1B(view, R.id.tab_to_select);
                }
            }
        }
        C86644Kx.A1F(r2, A0s, r2.A02);
        C109475eg.A00(view.findViewById(R.id.select_list_button), this, r2, 40);
        r2.A01 = new AnonymousClass7HX(view, this);
        this.A03.setOnShowListener(new AnonymousClass37D());
    }
}
