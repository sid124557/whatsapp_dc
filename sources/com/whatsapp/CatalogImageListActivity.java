package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass4N7;
import X.AnonymousClass4SG;
import X.AnonymousClass4WL;
import X.AnonymousClass4XV;
import X.AnonymousClass5MG;
import X.AnonymousClass6B8;
import X.AnonymousClass7SV;
import X.C107275b2;
import X.C107405bG;
import X.C107695bk;
import X.C109015dw;
import X.C151257Ua;
import X.C152967aS;
import X.C18320x8;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C88044Xc;
import X.C89644eZ;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.MenuItem;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;

public class CatalogImageListActivity extends C89644eZ {
    public int A00;
    public int A01;
    public LinearLayoutManager A02;
    public RecyclerView A03;
    public AnonymousClass4XV A04;
    public C109015dw A05;
    public C151257Ua A06;
    public C152967aS A07;
    public UserJid A08;
    public AnonymousClass7SV A09;
    public boolean A0A;

    public void A5r() {
        if (!this.A0A) {
            this.A0A = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A06 = (C151257Ua) r1.A2I.get();
            this.A09 = (AnonymousClass7SV) r1.A2J.get();
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = C107275b2.A00;
        if (z) {
            C86634Kw.A1F(getWindow());
        }
        super.onCreate(bundle);
        AnonymousClass5MG r4 = new AnonymousClass5MG(this);
        if (z) {
            Window window = getWindow();
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            ChangeBounds changeBounds = new ChangeBounds();
            ChangeBounds changeBounds2 = new ChangeBounds();
            changeBounds.excludeTarget(r4.A03(R.string.f11nameremoved), true);
            changeBounds.excludeTarget(r4.A03(R.string.f11nameremoved), true);
            changeBounds2.excludeTarget(r4.A03(R.string.f11nameremoved), true);
            changeBounds2.excludeTarget(r4.A03(R.string.f11nameremoved), true);
            AnonymousClass4N7 r2 = new AnonymousClass4N7(this, r4, true);
            AnonymousClass4N7 r6 = new AnonymousClass4N7(this, r4, false);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setDuration(220);
            transitionSet.setInterpolator(accelerateDecelerateInterpolator);
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(r2);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setInterpolator(accelerateDecelerateInterpolator);
            transitionSet2.setDuration(240);
            transitionSet2.addTransition(changeBounds2);
            transitionSet2.addTransition(r6);
            window.setSharedElementEnterTransition(transitionSet);
            window.setSharedElementReturnTransition(transitionSet2);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade.setDuration(220);
            fade2.setDuration(240);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
            if (bundle == null) {
                A5U();
            }
        }
        AnonymousClass001.A0Q(this).setSystemUiVisibility(1792);
        C107405bG.A04(this);
        this.A08 = C86624Kv.A0U(getIntent().getStringExtra("cached_jid"));
        this.A05 = (C109015dw) getIntent().getParcelableExtra("product");
        this.A00 = C18320x8.A01(getIntent(), "image_index");
        setContentView((int) R.layout.f8nameremoved);
        this.A03 = (RecyclerView) findViewById(R.id.catalog_image_list);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, (Toolbar) findViewById(R.id.catalog_image_list_toolbar));
        A2S.A0N(true);
        A2S.A0J(this.A05.A05);
        this.A07 = new C152967aS(this.A06, this.A09);
        AnonymousClass4WL r1 = new AnonymousClass4WL(this, new AnonymousClass5MG(this));
        this.A02 = new LinearLayoutManager(1);
        this.A03.setAdapter(r1);
        this.A03.setLayoutManager(this.A02);
        AnonymousClass4XV r12 = new AnonymousClass4XV(this.A05.A07.size(), C86614Ku.A03(this));
        this.A04 = r12;
        this.A03.A0o(r12);
        AnonymousClass6B8.A00(this.A03, this, 1);
        int A032 = C86634Kw.A03(this);
        int A033 = C86634Kw.A03(this);
        this.A03.A0q(new C88044Xc(A2S, this, A032, AnonymousClass0Y8.A04(this, R.color.f5nameremoved), A033));
    }

    public void onDestroy() {
        this.A07.A00();
        super.onDestroy();
    }

    public CatalogImageListActivity(int i) {
        this.A0A = false;
        C86604Kt.A1K(this, 0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public CatalogImageListActivity() {
        this(0);
    }
}
