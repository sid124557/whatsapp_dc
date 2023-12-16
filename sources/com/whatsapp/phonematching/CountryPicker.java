package com.whatsapp.phonematching;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass4L0;
import X.AnonymousClass4OM;
import X.AnonymousClass4SG;
import X.AnonymousClass4UM;
import X.AnonymousClass6C6;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C106175Xx;
import X.C106675Zy;
import X.C107335b8;
import X.C107405bG;
import X.C107695bk;
import X.C18260x0;
import X.C18310x6;
import X.C184008r6;
import X.C64333Db;
import X.C86604Kt;
import X.C86624Kv;
import X.C89164br;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.base.WDSSearchViewFragment;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public class CountryPicker extends C89164br implements C184008r6 {
    public View A00;
    public View A01;
    public Toolbar A02;
    public C106175Xx A03;
    public AnonymousClass4OM A04;
    public C106675Zy A05;
    public AnonymousClass4UM A06;
    public boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
        if (r2.A00(r1) == false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r10 = r15
            r0 = r16
            super.onCreate(r0)
            X.C107405bG.A05(r15)
            r2 = 2131892577(0x7f121961, float:1.9419906E38)
            r15.setTitle(r2)
            r0 = 2131624699(0x7f0e02fb, float:1.8876585E38)
            r15.setContentView((int) r0)
            X.C107405bG.A05(r15)
            r0 = 2131434319(0x7f0b1b4f, float:1.8490449E38)
            android.view.View r0 = r15.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r15.A02 = r0
            android.content.Context r0 = r15.getApplicationContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r1 = r0.hasPermanentMenuKey()
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r15.setSupportActionBar(r0)
            r5 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0042
            X.0R8 r0 = X.C86634Kw.A0R(r15)
            r0.A0N(r3)
            r0.A0Q(r5)
        L_0x0042:
            X.33j r1 = r15.A00
            r0 = 2131231896(0x7f080498, float:1.8079886E38)
            X.6dx r1 = X.AnonymousClass0x7.A0J(r15, r1, r0)
            r0 = 2131101305(0x7f060679, float:1.7815016E38)
            android.graphics.drawable.Drawable r1 = X.C107335b8.A07(r15, r1, r0)
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r0.setNavigationIcon((android.graphics.drawable.Drawable) r1)
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r0.setTitle((int) r2)
            X.5Zy r1 = r15.A05
            X.33j r0 = r15.A00
            java.util.Locale r0 = X.C620733j.A02(r0)
            java.lang.String r0 = X.C162307rf.A04(r0)
            java.util.List r1 = r1.A03(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x007e
            X.5Zy r1 = r15.A05
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = X.C162307rf.A04(r0)
            java.util.List r1 = r1.A03(r0)
        L_0x007e:
            java.util.ArrayList r14 = X.AnonymousClass000.A0p(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x0086:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r2 = r9.next()
            X.7IS r2 = (X.AnonymousClass7IS) r2
            X.5Xx r0 = r15.A03
            java.lang.String r7 = r2.A00
            X.5Ow r8 = r0.A01(r7)
            if (r8 != 0) goto L_0x00b3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "countrypicker/oncreate saw unknown country "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            X.C18260x0.A1M(r1, r0)
            goto L_0x0086
        L_0x00b3:
            java.lang.String r6 = r2.A01
            java.lang.String r4 = r8.A03
            boolean r0 = r6.equals(r4)
            if (r0 != 0) goto L_0x00d7
            int r1 = r4.codePointAt(r5)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 <= r0) goto L_0x00d8
            X.7jS r2 = X.C158117jS.A05
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto L_0x00e7
            char r0 = (char) r1
            java.lang.String r1 = java.lang.Character.toString(r0)
        L_0x00d1:
            boolean r0 = r2.A00(r1)
            if (r0 != 0) goto L_0x00d8
        L_0x00d7:
            r4 = 0
        L_0x00d8:
            int r0 = r8.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.5OC r0 = new X.5OC
            r0.<init>(r6, r4, r1, r7)
            r14.add(r0)
            goto L_0x0086
        L_0x00e7:
            char[] r0 = java.lang.Character.toChars(r1)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x00d1
        L_0x00f1:
            X.33j r0 = r15.A00
            java.util.Locale r1 = X.C620733j.A02(r0)
            X.5sa r0 = new X.5sa
            r0.<init>(r15, r1)
            java.util.Collections.sort(r14, r0)
            X.33i r0 = r15.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            if (r0 == 0) goto L_0x012b
            java.lang.String r4 = r0.getSimCountryIso()
            if (r4 == 0) goto L_0x012b
            java.util.Iterator r2 = r14.iterator()
        L_0x0111:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r1 = r2.next()
            X.5OC r1 = (X.AnonymousClass5OC) r1
            java.lang.String r0 = r1.A03
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0111
            r2.remove()
            r14.add(r5, r1)
        L_0x012b:
            android.widget.ListView r2 = r15.getListView()
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "country_iso"
            java.lang.String r12 = r1.getStringExtra(r0)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "country_display_name"
            java.lang.String r13 = r1.getStringExtra(r0)
            X.4OM r9 = new X.4OM
            r11 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            r15.A04 = r9
            r15.A74(r9)
            r0 = 10
            X.AnonymousClass696.A00(r2, r15, r0)
            r2.setFastScrollEnabled(r3)
            r2.setScrollbarFadingEnabled(r3)
            r2.setFastScrollAlwaysVisible(r3)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r2.setScrollBarStyle(r0)
            X.33j r0 = r15.A00
            boolean r0 = X.C102805Ki.A00(r0)
            if (r0 == 0) goto L_0x017c
            r2.setVerticalScrollbarPosition(r3)
        L_0x016c:
            android.view.View r0 = X.AnonymousClass4SG.A2R(r15)
            r15.A01 = r0
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            android.view.View r0 = r15.findViewById(r0)
            r15.A00 = r0
            return
        L_0x017c:
            r0 = 2
            r2.setVerticalScrollbarPosition(r0)
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.phonematching.CountryPicker.onCreate(android.os.Bundle):void");
    }

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            AnonymousClass4SG.A3i(this);
            this.A05 = C86624Kv.A0W(A2Y);
            this.A03 = C86604Kt.A0N(A2Y);
        }
    }

    public AnonymousClass4UM BCX() {
        return this.A06;
    }

    public CountryPicker(int i) {
        this.A07 = false;
        C86604Kt.A1K(this, 73);
    }

    public final void A75() {
        C08270df supportFragmentManager = getSupportFragmentManager();
        if (!supportFragmentManager.A0t()) {
            C08310eF A0D = supportFragmentManager.A0D("search_fragment");
            if (A0D != null) {
                ((WDSSearchViewFragment) A0D).A1I();
            }
            getSupportFragmentManager().A0m("search_fragment", 1);
            C86604Kt.A1A(this.A01);
            this.A02.setVisibility(0);
            this.A00.setVisibility(0);
            C107405bG.A05(this);
        }
    }

    public final boolean A76() {
        return AnonymousClass4SG.A3z(this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onBackPressed() {
        if (AnonymousClass4SG.A3z(this)) {
            A75();
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, R.id.menuitem_search, 0, R.string.f11nameremoved).setIcon(C107335b8.A07(this, C18310x6.A0G(this, R.drawable.ic_action_search_teal), R.color.f5nameremoved)).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("item.getItemId()");
        A0o.append(menuItem.getItemId());
        C18260x0.A1V(A0o, AnonymousClass000.A1U(menuItem.getItemId(), R.id.menuitem_search));
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
        } else if (itemId == R.id.menuitem_search) {
            if (!AnonymousClass4SG.A3z(this)) {
                if (this.A06 == null) {
                    AnonymousClass4UM r2 = (AnonymousClass4UM) AnonymousClass0x9.A0H(this).A01(AnonymousClass4UM.class);
                    this.A06 = r2;
                    r2.A00.A0B(this, AnonymousClass6C6.A00(this, 266));
                    AnonymousClass4UM r22 = this.A06;
                    r22.A01.A0B(this, AnonymousClass4L0.A0G(this, 311));
                }
                this.A02.setVisibility(8);
                this.A00.setVisibility(8);
                View view = this.A01;
                if (view != null) {
                    view.setVisibility(0);
                    this.A01.setElevation(0.0f);
                }
                C08270df supportFragmentManager = getSupportFragmentManager();
                WDSSearchViewFragment wDSSearchViewFragment = (WDSSearchViewFragment) supportFragmentManager.A0D("search_fragment");
                if (wDSSearchViewFragment == null) {
                    wDSSearchViewFragment = new WDSSearchViewFragment();
                    C08240dc r1 = new C08240dc(supportFragmentManager);
                    r1.A0H = true;
                    r1.A0E(wDSSearchViewFragment, "search_fragment", R.id.search_holder);
                    r1.A0I("search_fragment");
                    r1.A01();
                    supportFragmentManager.A0K();
                }
                WDSConversationSearchView wDSConversationSearchView = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A00();
                }
                WDSConversationSearchView wDSConversationSearchView2 = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView2 != null) {
                    wDSConversationSearchView2.setHint((int) R.string.f11nameremoved);
                }
                return true;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.A02.getHeight()), 0.0f);
            translateAnimation.setDuration(250);
            this.A01.clearAnimation();
            this.A01.startAnimation(translateAnimation);
            return true;
        }
        return false;
    }

    public CountryPicker() {
        this(0);
    }
}
