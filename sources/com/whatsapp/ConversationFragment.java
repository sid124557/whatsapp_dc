package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass3ZH;
import X.AnonymousClass5Yj;
import X.AnonymousClass6A0;
import X.AnonymousClass6BG;
import X.AnonymousClass8s7;
import X.C07890cz;
import X.C08310eF;
import X.C109275eM;
import X.C113245l7;
import X.C16460tR;
import X.C184308ra;
import X.C185008su;
import X.C835949a;
import X.C84524Cr;
import X.C86624Kv;
import X.C89174bs;
import X.C93064np;
import X.C95814uZ;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.List;

public class ConversationFragment extends Hilt_ConversationFragment implements C84524Cr, C184308ra, AnonymousClass8s7, C835949a {
    public Bundle A00;
    public FrameLayout A01;
    public C93064np A02;
    public final C16460tR A03 = new AnonymousClass6A0(this, 1);

    public final void A1J(Menu menu, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            item.setOnMenuItemClickListener(onMenuItemClickListener);
            if (item.getSubMenu() != null) {
                A1J(item.getSubMenu(), onMenuItemClickListener);
            }
        }
    }

    public void A0a() {
        C93064np r0 = this.A02;
        if (r0 != null) {
            Toolbar toolbar = r0.A03.A0r;
            if (toolbar != null) {
                Menu menu = toolbar.getMenu();
                for (int i = 0; i < menu.size(); i++) {
                    menu.getItem(i).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener) null);
                }
            }
            C93064np r1 = this.A02;
            r1.A03.A0k();
            r1.A08.clear();
            r1.A00.A06();
            r1.A01.clear();
        }
        super.A0a();
    }

    public void A0b() {
        Toolbar toolbar;
        C93064np r0 = this.A02;
        if (r0 != null && (toolbar = r0.A03.A0r) != null) {
            Menu menu = toolbar.getMenu();
            if (menu != null) {
                A1J(menu, (MenuItem.OnMenuItemClickListener) null);
            }
            if (menu instanceof C07890cz) {
                ((C07890cz) menu).A0D((C16460tR) null);
            }
        }
    }

    public void A0x(Menu menu) {
        Toolbar toolbar;
        C93064np r0 = this.A02;
        if (r0 != null && (toolbar = r0.A03.A0r) != null) {
            Menu menu2 = toolbar.getMenu();
            C113245l7 r2 = this.A02.A03;
            for (C185008su BYj : r2.A7M) {
                BYj.BYj(menu2);
            }
            r2.A2z.Bdc(menu2);
        }
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        Toolbar toolbar;
        C93064np r0 = this.A02;
        if (r0 != null && (toolbar = r0.A03.A0r) != null) {
            Menu menu2 = toolbar.getMenu();
            menu2.clear();
            C113245l7 r2 = this.A02.A03;
            for (C185008su BQQ : r2.A7M) {
                BQQ.BQQ(menu2);
            }
            r2.A2z.BdY(menu2);
            A1J(menu2, new C109275eM(this.A02));
            if (menu2 instanceof C07890cz) {
                ((C07890cz) menu2).A0D(this.A03);
            }
        }
    }

    public void A1I(AssistContent assistContent) {
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.A02(assistContent);
        }
    }

    public void Awp(AnonymousClass3ZH r2, C95814uZ r3) {
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.Awp(r2, r3);
        }
    }

    public void BMB(long j, boolean z) {
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.BMB(j, z);
        }
    }

    public void BMl() {
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.BMl();
        }
    }

    public void BQP(long j, boolean z) {
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.BQP(j, z);
        }
    }

    public void BY7(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.BY7(pickerSearchDialogFragment);
        }
    }

    public void BfD() {
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.BfD();
        }
    }

    public void Bom(DialogFragment dialogFragment) {
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.Bom(dialogFragment);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(A1D());
        this.A01 = frameLayout;
        C86624Kv.A0x(frameLayout, -1);
        this.A00 = bundle;
        return this.A01;
    }

    public void A0e() {
        super.A0e();
        C93064np r1 = this.A02;
        if (r1 != null) {
            r1.A00.A07();
            r1.A03.A0m();
        }
    }

    public void A0f() {
        super.A0f();
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.A03.A0o();
        }
    }

    public void A0g() {
        super.A0g();
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.A03.A0p();
        }
    }

    public void A0h() {
        super.A0h();
        C93064np r0 = this.A02;
        if (r0 != null) {
            r0.A03.A0q();
        }
    }

    public void A0k(int i, int i2, Intent intent) {
        super.A0k(i, i2, intent);
        C93064np r1 = this.A02;
        if (r1 != null) {
            r1.A00.A0B(i, i2, intent);
            r1.A03.A1Y(i, i2, intent);
        }
    }

    public void A0w(Bundle bundle, View view) {
        C93064np r1 = new C93064np(A1D());
        this.A02 = r1;
        r1.A00 = this;
        r1.A01 = this;
        r1.setCustomActionBarEnabled(true);
        r1.A00 = this;
        C86624Kv.A0x(r1, -1);
        this.A01.addView(this.A02);
        A13(true);
        C93064np r0 = this.A02;
        C89174bs.A00(r0);
        r0.A01.A00();
        C93064np r4 = this.A02;
        Bundle bundle2 = this.A00;
        C113245l7 r02 = r4.A03;
        if (r02 != null) {
            r02.A2z = r4;
            List list = r4.A08;
            if (list == null || 0 >= list.size()) {
                r4.A03.A1d(bundle2);
            } else {
                list.get(0);
                throw AnonymousClass001.A0g("onCreate");
            }
        }
        AnonymousClass6BG.A00(this.A02.getViewTreeObserver(), this, 0);
        Toolbar toolbar = this.A02.A03.A0r;
        if (toolbar != null) {
            C86624Kv.A0l(C08310eF.A09(this), toolbar, AnonymousClass5Yj.A02(A1D(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
    }
}
