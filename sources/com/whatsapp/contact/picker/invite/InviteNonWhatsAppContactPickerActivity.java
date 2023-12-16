package com.whatsapp.contact.picker.invite;

import X.AnonymousClass001;
import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass4SG;
import X.AnonymousClass54F;
import X.AnonymousClass5UX;
import X.AnonymousClass5V7;
import X.AnonymousClass5Yj;
import X.AnonymousClass610;
import X.AnonymousClass611;
import X.AnonymousClass612;
import X.AnonymousClass613;
import X.AnonymousClass681;
import X.AnonymousClass696;
import X.AnonymousClass69F;
import X.AnonymousClass6AS;
import X.AnonymousClass6C6;
import X.C06270Wx;
import X.C06560Yg;
import X.C103315Mk;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C1215560z;
import X.C1220262u;
import X.C140036t3;
import X.C162457s7;
import X.C179638jT;
import X.C182148nw;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C25351aN;
import X.C29421in;
import X.C44772Xk;
import X.C47122ck;
import X.C48852fa;
import X.C49762h3;
import X.C53802nh;
import X.C56602sG;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C89164br;
import X.C91934lp;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import org.wawebrtc.MediaCodecVideoEncoder;

public final class InviteNonWhatsAppContactPickerActivity extends C89164br implements C182148nw, C179638jT {
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public Button A06;
    public TextView A07;
    public Toolbar A08;
    public C48852fa A09;
    public C44772Xk A0A;
    public AnonymousClass5UX A0B;
    public C29421in A0C;
    public C105365Uq A0D;
    public C114015mM A0E;
    public C53802nh A0F;
    public C49762h3 A0G;
    public C91934lp A0H;
    public InviteNonWhatsAppContactPickerViewModel A0I;
    public WDSSearchBar A0J;
    public boolean A0K;
    public final C56602sG A0L;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        View findViewById = findViewById(R.id.toolbar);
        C162457s7.A0K(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        Toolbar toolbar = (Toolbar) findViewById;
        this.A08 = toolbar;
        if (toolbar == null) {
            throw C18270x1.A0S("toolbar");
        }
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, toolbar);
        A2S.A0N(true);
        A2S.A0O(true);
        View findViewById2 = findViewById(R.id.wds_search_bar);
        C162457s7.A0K(findViewById2, "null cannot be cast to non-null type com.whatsapp.wds.components.search.WDSSearchBar");
        WDSSearchBar wDSSearchBar = (WDSSearchBar) findViewById2;
        this.A0J = wDSSearchBar;
        if (wDSSearchBar == null) {
            throw C18270x1.A0S("wdsSearchBar");
        }
        wDSSearchBar.A07.setOnQueryTextChangeListener(new AnonymousClass69F(this, 1));
        WDSSearchBar wDSSearchBar2 = this.A0J;
        if (wDSSearchBar2 == null) {
            throw C18270x1.A0S("wdsSearchBar");
        }
        wDSSearchBar2.A07.setTrailingButtonIcon(C140036t3.A00);
        C114015mM r1 = this.A0E;
        if (r1 != null) {
            C105365Uq A062 = r1.A06(this, "invite-non-wa-contact-picker");
            this.A0D = A062;
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass5UX r8 = this.A0B;
            if (r8 != null) {
                C91934lp r6 = new C91934lp(this, r8, A062, this.A00, A0s);
                this.A0H = r6;
                View A0F2 = C86604Kt.A0F(getLayoutInflater(), R.layout.f8nameremoved);
                AnonymousClass5V7.A01(A0F2, R.drawable.ic_action_share, AnonymousClass5Yj.A06(A0F2), R.drawable.green_circle, R.string.f11nameremoved);
                AnonymousClass54F.A00(A0F2, this, 9);
                this.A02 = A0F2;
                this.A03 = A0F2;
                ListView listView = getListView();
                View view = this.A03;
                if (view == null) {
                    throw C18270x1.A0S("listViewHeader");
                }
                listView.addHeaderView(view);
                getListView().setAdapter(r6);
                registerForContextMenu(getListView());
                AnonymousClass696.A00(getListView(), this, 5);
                View A0L2 = C18290x4.A0L(this, R.id.init_contacts_progress);
                this.A01 = C18290x4.A0L(this, R.id.empty_view);
                this.A05 = (ViewGroup) C18290x4.A0L(this, R.id.share_link_header);
                this.A04 = (ViewGroup) C18290x4.A0L(this, R.id.contacts_section);
                this.A07 = (TextView) C18290x4.A0L(this, R.id.invite_empty_description);
                Button button = (Button) C18290x4.A0L(this, R.id.button_open_permission_settings);
                this.A06 = button;
                if (button == null) {
                    throw C18270x1.A0S("openPermissionsButton");
                }
                AnonymousClass54F.A00(button, this, 10);
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = (InviteNonWhatsAppContactPickerViewModel) AnonymousClass0x9.A0H(this).A01(InviteNonWhatsAppContactPickerViewModel.class);
                this.A0I = inviteNonWhatsAppContactPickerViewModel;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C06270Wx.A03(inviteNonWhatsAppContactPickerViewModel.A08, 0);
                AnonymousClass08M r3 = inviteNonWhatsAppContactPickerViewModel.A06;
                r3.A0H(AnonymousClass001.A0s());
                C103315Mk r12 = inviteNonWhatsAppContactPickerViewModel.A0C;
                AnonymousClass08J r2 = inviteNonWhatsAppContactPickerViewModel.A02;
                C103315Mk.A00(r3, r2, r12, inviteNonWhatsAppContactPickerViewModel, 3);
                AnonymousClass6C6.A03(r2, inviteNonWhatsAppContactPickerViewModel.A03, inviteNonWhatsAppContactPickerViewModel, 168);
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel2 = this.A0I;
                if (inviteNonWhatsAppContactPickerViewModel2 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(this, inviteNonWhatsAppContactPickerViewModel2.A0D, new C1215560z(this), 175);
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel3 = this.A0I;
                if (inviteNonWhatsAppContactPickerViewModel3 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(this, inviteNonWhatsAppContactPickerViewModel3.A08, new C1220262u(A0L2, this), MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel4 = this.A0I;
                if (inviteNonWhatsAppContactPickerViewModel4 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(this, inviteNonWhatsAppContactPickerViewModel4.A07, new AnonymousClass610(this), 177);
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel5 = this.A0I;
                if (inviteNonWhatsAppContactPickerViewModel5 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(this, inviteNonWhatsAppContactPickerViewModel5.A05, new AnonymousClass611(this), 178);
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel6 = this.A0I;
                if (inviteNonWhatsAppContactPickerViewModel6 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C86604Kt.A1N(this, inviteNonWhatsAppContactPickerViewModel6.A04, new AnonymousClass612(this), 179);
                C29421in r13 = this.A0C;
                if (r13 != null) {
                    r13.A06(this.A0L);
                    AnonymousClass4SG.A3d(this);
                    return;
                }
                throw C18270x1.A0S("contactObservers");
            }
            throw C18270x1.A0S("contactAvatars");
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        WDSSearchBar wDSSearchBar = this.A0J;
        if (wDSSearchBar == null) {
            throw C18270x1.A0S("wdsSearchBar");
        }
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, wDSSearchBar.getResources().getString(R.string.f11nameremoved)).setIcon(R.drawable.ic_action_search);
        C162457s7.A0D(icon);
        icon.setShowAsAction(10);
        icon.setOnActionExpandListener(new AnonymousClass6AS(this, 2));
        this.A00 = icon;
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0I;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C86604Kt.A0j();
        }
        C86604Kt.A1N(this, inviteNonWhatsAppContactPickerViewModel.A03, new AnonymousClass613(this), 180);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C162457s7.A0J(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0I;
            if (inviteNonWhatsAppContactPickerViewModel == null) {
                throw C86604Kt.A0j();
            }
            C18320x8.A18(inviteNonWhatsAppContactPickerViewModel.A07, true);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            AnonymousClass4SG.A3i(this);
            this.A0E = C64333Db.A29(A2Y);
            this.A09 = (C48852fa) r1.ABc.get();
            this.A0B = C86614Ku.A0R(A2Y);
            this.A0C = C86614Ku.A0S(A2Y);
            this.A0G = (C49762h3) r1.A6f.get();
            this.A0F = (C53802nh) r1.A6e.get();
            this.A0A = C86614Ku.A0P(A2Y);
        }
    }

    public boolean A64() {
        return true;
    }

    public void BXG(String str) {
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0I;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C86604Kt.A0j();
        }
        inviteNonWhatsAppContactPickerViewModel.A0D.A0H(str);
    }

    public void onBackPressed() {
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0I;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        AnonymousClass08M r1 = inviteNonWhatsAppContactPickerViewModel.A07;
        if (r1.A07() == null || !C86604Kt.A1Z(r1)) {
            super.onBackPressed();
            return;
        }
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel2 = this.A0I;
        if (inviteNonWhatsAppContactPickerViewModel2 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C18320x8.A18(inviteNonWhatsAppContactPickerViewModel2.A07, false);
    }

    public InviteNonWhatsAppContactPickerActivity(int i) {
        this.A0K = false;
        C86604Kt.A1K(this, 36);
    }

    public static final /* synthetic */ void A0C(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity, boolean z) {
        View A0F2 = C86604Kt.A0F(inviteNonWhatsAppContactPickerActivity.getLayoutInflater(), R.layout.f8nameremoved);
        AnonymousClass5V7.A01(A0F2, R.drawable.ic_action_share, AnonymousClass5Yj.A06(A0F2), R.drawable.green_circle, R.string.f11nameremoved);
        AnonymousClass54F.A00(A0F2, inviteNonWhatsAppContactPickerActivity, 9);
        ViewGroup viewGroup = inviteNonWhatsAppContactPickerActivity.A05;
        if (viewGroup == null) {
            throw C18270x1.A0S("shareActionContainer");
        }
        viewGroup.addView(A0F2);
        ViewGroup viewGroup2 = inviteNonWhatsAppContactPickerActivity.A05;
        if (viewGroup2 == null) {
            throw C18270x1.A0S("shareActionContainer");
        }
        viewGroup2.setVisibility(0);
        View inflate = inviteNonWhatsAppContactPickerActivity.getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        View A022 = C06560Yg.A02(inflate, R.id.title);
        C162457s7.A0K(A022, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) A022).setText(R.string.f11nameremoved);
        ViewGroup viewGroup3 = inviteNonWhatsAppContactPickerActivity.A04;
        if (viewGroup3 == null) {
            throw C18270x1.A0S("contactsSectionContainer");
        }
        viewGroup3.addView(inflate);
        ViewGroup viewGroup4 = inviteNonWhatsAppContactPickerActivity.A04;
        if (viewGroup4 == null) {
            throw C18270x1.A0S("contactsSectionContainer");
        }
        viewGroup4.setVisibility(0);
        View view = inviteNonWhatsAppContactPickerActivity.A01;
        if (view == null) {
            throw C18270x1.A0S("emptyView");
        }
        view.setVisibility(0);
        if (z || AnonymousClass4SG.A44(inviteNonWhatsAppContactPickerActivity)) {
            TextView textView = inviteNonWhatsAppContactPickerActivity.A07;
            if (textView == null) {
                throw C18270x1.A0S("emptyViewDescription");
            }
            textView.setText(R.string.f11nameremoved);
            Button button = inviteNonWhatsAppContactPickerActivity.A06;
            if (button == null) {
                throw C18270x1.A0S("openPermissionsButton");
            }
            button.setVisibility(8);
            return;
        }
        C49762h3 r3 = inviteNonWhatsAppContactPickerActivity.A0G;
        if (r3 != null) {
            Integer A75 = inviteNonWhatsAppContactPickerActivity.A75();
            C25351aN r1 = new C25351aN();
            r1.A03 = AnonymousClass001.A0f();
            r1.A04 = A75;
            r1.A00 = Boolean.TRUE;
            r3.A03.BhD(r1);
            TextView textView2 = inviteNonWhatsAppContactPickerActivity.A07;
            if (textView2 == null) {
                throw C18270x1.A0S("emptyViewDescription");
            }
            textView2.setText(R.string.f11nameremoved);
            Button button2 = inviteNonWhatsAppContactPickerActivity.A06;
            if (button2 == null) {
                throw C18270x1.A0S("openPermissionsButton");
            }
            button2.setVisibility(0);
            return;
        }
        throw C18270x1.A0S("inviteFlowLogger");
    }

    public C47122ck A5u() {
        C47122ck r1 = new C47122ck(78318969);
        r1.A05 = r1.A05;
        return r1;
    }

    public final Integer A75() {
        int A012 = C18320x8.A01(getIntent(), "invite_source");
        if (A012 == 0) {
            return null;
        }
        return Integer.valueOf(A012);
    }

    public void onDestroy() {
        super.onDestroy();
        C29421in r1 = this.A0C;
        if (r1 != null) {
            r1.A07(this.A0L);
            C105365Uq r0 = this.A0D;
            if (r0 == null) {
                throw C18270x1.A0S("contactPhotoLoader");
            }
            r0.A00();
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0I;
            if (inviteNonWhatsAppContactPickerViewModel == null) {
                throw C86604Kt.A0j();
            }
            AnonymousClass08J r12 = inviteNonWhatsAppContactPickerViewModel.A02;
            r12.A0I(inviteNonWhatsAppContactPickerViewModel.A06);
            inviteNonWhatsAppContactPickerViewModel.A03.A0I(r12);
            return;
        }
        throw C18270x1.A0S("contactObservers");
    }

    public void onResume() {
        super.onResume();
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0I;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C86604Kt.A0j();
        }
        C44772Xk r0 = this.A0A;
        if (r0 != null) {
            C18320x8.A18(inviteNonWhatsAppContactPickerViewModel.A05, r0.A00());
            return;
        }
        throw C18270x1.A0S("contactAccessHelper");
    }

    public int A5t() {
        return 78318969;
    }

    public InviteNonWhatsAppContactPickerActivity() {
        this(0);
        this.A0L = AnonymousClass681.A00(this, 15);
    }
}
