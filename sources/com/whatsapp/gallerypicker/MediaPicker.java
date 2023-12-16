package com.whatsapp.gallerypicker;

import X.AnonymousClass0R2;
import X.AnonymousClass0R8;
import X.AnonymousClass0X0;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass1Fq;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZC;
import X.C08240dc;
import X.C08310eF;
import X.C107275b2;
import X.C107405bG;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C183538qC;
import X.C58152un;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

public class MediaPicker extends AnonymousClass1Fq {
    public C183538qC A00;

    public void Bdh(AnonymousClass0R2 r2) {
        C162457s7.A0J(r2, 0);
        super.Bdh(r2);
        AnonymousClass1Hf.A2A(this);
    }

    public void Bdi(AnonymousClass0R2 r3) {
        C162457s7.A0J(r3, 0);
        super.Bdi(r3);
        C107405bG.A0C(getWindow(), false);
        C107405bG.A07(this, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void onCreate(Bundle bundle) {
        A5j(5);
        if (C107275b2.A00) {
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.requestFeature(13);
            window.requestFeature(12);
            window.setEnterTransition(inflateTransition);
            window.setReturnTransition(inflateTransition2);
            A5U();
        }
        AnonymousClass1Hf.A2A(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar toolbar = (Toolbar) C18290x4.A0L(this, R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        AnonymousClass0R8 A1l = AnonymousClass1Ha.A1l(this, R.string.f11nameremoved);
        if (A1l != null) {
            A1l.A0N(true);
        }
        ViewGroup viewGroup = (ViewGroup) C18290x4.A0L(this, R.id.mainLayout);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.content);
        if (bundle == null) {
            viewGroup.addView(frameLayout, new LinearLayout.LayoutParams(-1, -1));
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            int id = frameLayout.getId();
            C183538qC r0 = this.A00;
            if (r0 != null) {
                A0J.A09((C08310eF) r0.get(), id);
                A0J.A01();
                View view = new View(this);
                view.setBackgroundColor(AnonymousClass0Y8.A04(view.getContext(), R.color.f5nameremoved));
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) Math.ceil((double) (view.getResources().getDisplayMetrics().density / ((float) 2)))));
                frameLayout.addView(view);
                return;
            }
            throw C18270x1.A0S("mediaPickerFragment");
        }
    }

    public AnonymousClass5ZC BCP() {
        AnonymousClass5ZC r0 = C58152un.A02;
        C162457s7.A0F(r0);
        return r0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C08310eF A0B = getSupportFragmentManager().A0B(R.id.content);
        if (A0B != null) {
            A0B.A0k(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C107275b2.A07(this, this.A0D);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass0X0.A00(this);
        return true;
    }
}
