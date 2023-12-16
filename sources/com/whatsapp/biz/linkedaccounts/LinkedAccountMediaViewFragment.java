package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass000;
import X.AnonymousClass1VX;
import X.AnonymousClass2XT;
import X.AnonymousClass5ZR;
import X.C06560Yg;
import X.C08310eF;
import X.C106185Xy;
import X.C107565bW;
import X.C108855df;
import X.C108915dl;
import X.C110755gz;
import X.C111095hX;
import X.C114865nj;
import X.C153127ai;
import X.C18310x6;
import X.C55502qS;
import X.C56422rx;
import X.C56612sH;
import X.C620733j;
import X.C626936e;
import X.C64773Ex;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class LinkedAccountMediaViewFragment extends Hilt_LinkedAccountMediaViewFragment {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C111095hX A04;
    public AnonymousClass2XT A05;
    public C106185Xy A06;
    public C108915dl A07;
    public C64773Ex A08;
    public C56422rx A09;
    public C56612sH A0A;
    public AnonymousClass5ZR A0B;
    public C620733j A0C;
    public AnonymousClass1VX A0D;
    public UserJid A0E;
    public C153127ai A0F;
    public List A0G;
    public boolean A0H = false;
    public boolean A0I;

    public void A0y(Menu menu, MenuInflater menuInflater) {
        menu.add(0, 1, 0, R.string.f11nameremoved);
    }

    public void A0q(Bundle bundle) {
        bundle.putInt("extra_target_post_index", this.A09.getCurrentItem());
    }

    public final void A1a(long j) {
        String charSequence = C107565bW.A00(this.A0A, this.A0C, j).toString();
        int i = this.A00;
        int i2 = R.string.f11nameremoved;
        if (i == 0) {
            i2 = R.string.f11nameremoved;
        }
        StringBuilder A0l = AnonymousClass000.A0l(C08310eF.A09(this).getString(i2));
        A0l.append(" ");
        A0l.append(8226);
        String A0V = AnonymousClass000.A0V(" ", charSequence, A0l);
        TextView textView = this.A05;
        if (textView != null) {
            textView.setText(A0V);
        }
    }

    public void A0p(Bundle bundle) {
        int i;
        super.A0p(bundle);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("extra_business_jid");
            C626936e.A06(parcelable);
            this.A0E = (UserJid) parcelable;
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("extra_post_list");
            C626936e.A06(parcelableArrayList);
            this.A0G = parcelableArrayList;
            this.A00 = bundle2.getInt("extra_account_type");
            this.A0I = bundle2.getBoolean("extra_is_v2_5_enabled", false);
            if (bundle != null) {
                i = bundle.getInt("extra_target_post_index", 0);
            } else {
                i = bundle2.getInt("extra_target_post_index", 0);
            }
            this.A03 = i;
            this.A01 = i;
            this.A07 = (C108915dl) bundle2.getParcelable("extra_common_fields_for_analytics");
            this.A02 = bundle2.getInt("extra_entry_point");
            A1U(new C114865nj(this));
            this.A09.A0F(this.A03, false);
            this.A09.A0G(new C110755gz(this));
            this.A09.setScrollEnabled(this.A0I);
            if (this.A02 == 1) {
                A13(true);
            }
        }
    }

    public void A0w(Bundle bundle, View view) {
        Bundle bundle2;
        super.A0w(bundle, view);
        if (bundle == null && (bundle2 = this.A00) != null) {
            this.A0F = true;
            this.A0B.A0D(bundle2, this);
        }
        this.A01.setVisibility(8);
        C06560Yg.A02(view, R.id.title_holder).setClickable(false);
        C55502qS A012 = this.A09.A01(this.A0E);
        if (A012 != null) {
            this.A06.setText(A012.A08);
        }
        A1a(((C108855df) this.A0G.get(this.A03)).A00);
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return false;
        }
        Uri parse = Uri.parse("https://help.instagram.com/contact/383679321740945");
        String str = ((C108855df) this.A0G.get(this.A01)).A04;
        if (!TextUtils.isEmpty(str)) {
            parse = Uri.parse(str);
        }
        if (A1D() != null) {
            this.A04.A0A(A1D(), C18310x6.A0D(parse));
        }
        return true;
    }
}
