package com.whatsapp.audiopicker;

import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0WA;
import X.AnonymousClass0YY;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass30B;
import X.AnonymousClass33p;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5CM;
import X.AnonymousClass5RC;
import X.AnonymousClass5U6;
import X.AnonymousClass5VQ;
import X.AnonymousClass5XO;
import X.AnonymousClass5ZU;
import X.C04740Ql;
import X.C06560Yg;
import X.C105025Tg;
import X.C105225Ub;
import X.C105365Uq;
import X.C106035Xj;
import X.C106405Yw;
import X.C107465bM;
import X.C113895mA;
import X.C114015mM;
import X.C116095pj;
import X.C154437dA;
import X.C16850u7;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C53492nB;
import X.C56972sr;
import X.C620733j;
import X.C626936e;
import X.C64773Ex;
import X.C69263Wi;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import X.C87224Om;
import X.C87724Vh;
import X.C89594eP;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class AudioPickerActivity extends C89594eP implements C16850u7 {
    public AudioManager A00;
    public Menu A01;
    public View A02;
    public ImageButton A03;
    public ListView A04;
    public RelativeLayout A05;
    public RelativeLayout A06;
    public TextView A07;
    public BottomSheetBehavior A08;
    public C87224Om A09;
    public AnonymousClass30B A0A;
    public C64773Ex A0B;
    public AnonymousClass5ZU A0C;
    public C105365Uq A0D;
    public C114015mM A0E;
    public AnonymousClass5U6 A0F;
    public AnonymousClass5RC A0G;
    public C113895mA A0H;
    public AnonymousClass3ZH A0I;
    public C53492nB A0J;
    public C105225Ub A0K;
    public C105025Tg A0L;
    public AnonymousClass5XO A0M;
    public C183538qC A0N;
    public C183538qC A0O;
    public String A0P;
    public ArrayList A0Q;
    public LinkedHashMap A0R;
    public boolean A0S;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A002 = C154437dA.A00(this.A0D);
        this.A0S = A002;
        int i = R.layout.f8nameremoved;
        if (A002) {
            i = R.layout.f8nameremoved;
        }
        setContentView(i);
        this.A0R = C18320x8.A0r();
        this.A0J = new C53492nB(new Handler(), this.A0A, this.A08, "audio-picker");
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        setSupportActionBar(A28);
        this.A0K = new C105225Ub(this, AnonymousClass4SG.A2R(this), new AnonymousClass5CM(this, 1), A28, this.A00);
        this.A0I = C64773Ex.A00(this.A0B, C106405Yw.A00(this));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        C626936e.A07(supportActionBar, "supportActionBar is null");
        supportActionBar.A0N(true);
        supportActionBar.A0J(AnonymousClass002.A0F(this, this.A0C.A0H(this.A0I), new Object[1], 0, R.string.f11nameremoved));
        this.A06 = (RelativeLayout) findViewById(R.id.no_audio_layout);
        this.A05 = (RelativeLayout) findViewById(R.id.loading_audio_layout);
        this.A07 = C18310x6.A0L(this, R.id.empty);
        ListView listView = getListView();
        this.A04 = listView;
        AnonymousClass0YY.A04((Drawable) null, listView);
        ImageButton imageButton = (ImageButton) findViewById(R.id.fab);
        this.A03 = imageButton;
        AnonymousClass5VQ.A01(imageButton, false, false);
        C18280x3.A0p(this.A03, this, 36);
        C18300x5.A13(this, this.A03, R.string.f11nameremoved);
        C87224Om r0 = new C87224Om(this, this);
        this.A09 = r0;
        A74(r0);
        this.A00 = this.A08.A0G();
        if (this.A0S) {
            View A022 = C06560Yg.A02(this.A00, R.id.audio_picker_layout);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A08 = bottomSheetBehavior;
            this.A0M.A02(A022, bottomSheetBehavior, this, this.A0B);
            AnonymousClass5XO.A00(this, supportActionBar);
        }
    }

    public C04740Ql BQO(Bundle bundle, int i) {
        return new C87724Vh(this, this.A08.A0R(), this.A0Q);
    }

    public /* bridge */ /* synthetic */ void BVX(C04740Ql r2, Object obj) {
        this.A09.swapCursor((Cursor) obj);
        A75();
    }

    public void BVf(C04740Ql r3) {
        this.A09.swapCursor((Cursor) null);
        A75();
    }

    public void onBackPressed() {
        this.A0N.get();
        if (C86604Kt.A1Y(this.A0K.A04)) {
            if (!this.A0R.isEmpty()) {
                AnonymousClass5VQ.A01(this.A03, true, true);
            }
            this.A0K.A01(true);
            return;
        }
        super.onBackPressed();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AudioManager audioManager = this.A00;
        if (audioManager != null) {
            if (i == 24) {
                audioManager.adjustStreamVolume(3, 1, 1);
                return true;
            } else if (i == 25) {
                audioManager.adjustStreamVolume(3, -1, 1);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        boolean z = C86664Kz.A1G(this.A0N).A03;
        View view = this.A00;
        if (z) {
            AnonymousClass1VX r15 = this.A0D;
            C69263Wi r13 = this.A05;
            C56972sr r12 = this.A01;
            AnonymousClass4FS r11 = this.A04;
            C114015mM r10 = this.A0E;
            C64773Ex r9 = this.A0B;
            AnonymousClass5ZU r8 = this.A0C;
            C620733j r7 = this.A00;
            AnonymousClass5RC r6 = this.A0G;
            C113895mA r5 = this.A0H;
            C183538qC r4 = this.A0N;
            C183538qC r3 = this.A0O;
            View view2 = this.A02;
            C105365Uq r1 = this.A0D;
            AnonymousClass33p r25 = this.A09;
            C113895mA r24 = r5;
            AnonymousClass5RC r23 = r6;
            C114015mM r22 = r10;
            C105365Uq r21 = r1;
            AnonymousClass5ZU r20 = r8;
            C64773Ex r19 = r9;
            C56972sr r18 = r12;
            C69263Wi r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = C107465bM.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "audio-picker-activity");
            this.A02 = (View) A002.first;
            this.A0D = (C105365Uq) A002.second;
        } else if (C106035Xj.A01(view)) {
            C107465bM.A04(this.A00, this.A0H, this.A0N);
        }
        C106035Xj.A00(this.A0N);
    }

    public boolean onSearchRequested() {
        AnonymousClass5VQ.A01(this.A03, false, true);
        this.A0K.A02(this.A0S);
        C18280x3.A0p(findViewById(R.id.search_back), this, 35);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A75() {
        /*
            r10 = this;
            X.0R8 r9 = r10.getSupportActionBar()
            java.lang.String r0 = "supportActionBar is null"
            X.C626936e.A07(r9, r0)
            java.util.LinkedHashMap r0 = r10.A0R
            java.util.Iterator r1 = X.C18290x4.A10(r0)
        L_0x000f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()
            X.5Kq r0 = (X.C102885Kq) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0029
            java.io.File r0 = X.AnonymousClass002.A0B(r0)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000f
        L_0x0029:
            r1.remove()
            goto L_0x000f
        L_0x002d:
            X.4Om r0 = r10.A09
            android.database.Cursor r0 = r0.getCursor()
            java.lang.String r4 = ""
            r7 = 1
            r2 = 8
            r6 = 0
            if (r0 != 0) goto L_0x0086
            android.widget.ListView r0 = r10.A04
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r10.A06
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r10.A05
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r2)
            X.5mA r0 = r10.A0H
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x005c
            X.5mA r0 = r10.A0H
            r0.A06()
        L_0x005c:
            r9.A0I(r4)
        L_0x005f:
            android.view.Menu r1 = r10.A01
            if (r1 == 0) goto L_0x0083
            r0 = 2131431467(0x7f0b102b, float:1.8484664E38)
            android.view.MenuItem r1 = r1.findItem(r0)
            if (r1 == 0) goto L_0x0083
            X.4Om r0 = r10.A09
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L_0x0084
            X.4Om r0 = r10.A09
            android.database.Cursor r0 = r0.getCursor()
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x0084
        L_0x0080:
            r1.setVisible(r7)
        L_0x0083:
            return
        L_0x0084:
            r7 = 0
            goto L_0x0080
        L_0x0086:
            android.widget.RelativeLayout r0 = r10.A05
            r0.setVisibility(r2)
            X.4Om r0 = r10.A09
            android.database.Cursor r0 = r0.getCursor()
            int r1 = r0.getCount()
            android.widget.ListView r0 = r10.A04
            if (r1 != 0) goto L_0x00d2
            r0.setVisibility(r2)
            android.widget.ImageButton r0 = r10.A03
            X.AnonymousClass5VQ.A01(r0, r6, r6)
            X.5Ub r0 = r10.A0K
            android.view.View r0 = r0.A04
            boolean r1 = X.C86604Kt.A1Y(r0)
            android.widget.RelativeLayout r0 = r10.A06
            if (r1 == 0) goto L_0x00c4
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r6)
            android.widget.TextView r3 = r10.A07
            r2 = 2131886495(0x7f12019f, float:1.940757E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r10.A0P
            r1[r6] = r0
            X.AnonymousClass001.A0y(r10, r3, r1, r2)
            goto L_0x005c
        L_0x00c4:
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r2)
            java.util.LinkedHashMap r0 = r10.A0R
            r0.clear()
            goto L_0x005c
        L_0x00d2:
            r0.setVisibility(r6)
            android.widget.RelativeLayout r0 = r10.A06
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r2)
            java.util.LinkedHashMap r8 = r10.A0R
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00fc
            r0 = 2131894310(0x7f122026, float:1.9423421E38)
            r9.A0A(r0)
        L_0x00ed:
            java.util.LinkedHashMap r0 = r10.A0R
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            android.widget.ImageButton r0 = r10.A03
            X.AnonymousClass5VQ.A01(r0, r1, r6)
            goto L_0x005f
        L_0x00fc:
            X.33j r5 = r10.A00
            r4 = 2131755218(0x7f1000d2, float:1.914131E38)
            int r0 = r8.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = r8.size()
            X.AnonymousClass000.A1P(r1, r0, r6)
            java.lang.String r0 = r5.A0L(r1, r4, r2)
            r9.A0I(r0)
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.audiopicker.AudioPickerActivity.A75():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z = false;
        MenuItem A0L2 = C86634Kw.A0L(menu);
        if (this.A0S) {
            A0L2.setIcon(R.drawable.ic_search_normal);
        }
        A0L2.setShowAsAction(10);
        this.A01 = menu;
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        if (findItem != null) {
            if (this.A04.getCount() > 0) {
                z = true;
            }
            findItem.setVisible(z);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0J.A00();
        this.A0J = null;
        C107465bM.A02(this.A02, this.A0H);
        C105365Uq r0 = this.A0D;
        if (r0 != null) {
            r0.A00();
            this.A0D = null;
        }
        this.A0F.A02(7);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        C107465bM.A07(this.A0H);
        AnonymousClass4SG.A3g(this, this.A0N);
    }

    public void onStart() {
        A75();
        AnonymousClass0WA.A00(this).A01((Bundle) null, this);
        super.onStart();
        if (this.A0S) {
            this.A0M.A03(this.A08, this);
        }
    }

    public void onStop() {
        C116095pj A002;
        super.onStop();
        if (!this.A0H.A0C() && (A002 = this.A0H.A00()) != null) {
            A002.A0H(true, false);
            this.A0H.A08((C116095pj) null);
        }
    }
}
