package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0GC;
import X.AnonymousClass0R4;
import X.AnonymousClass0R6;
import X.AnonymousClass0RF;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass30B;
import X.AnonymousClass4FS;
import X.AnonymousClass551;
import X.AnonymousClass5MZ;
import X.AnonymousClass5PE;
import X.AnonymousClass5W8;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZS;
import X.AnonymousClass5b1;
import X.AnonymousClass66R;
import X.AnonymousClass69E;
import X.AnonymousClass8UF;
import X.C003203q;
import X.C004705b;
import X.C04990Rl;
import X.C08270df;
import X.C08310eF;
import X.C106105Xq;
import X.C107275b2;
import X.C107335b8;
import X.C113975mI;
import X.C119695xO;
import X.C119705xP;
import X.C1220762z;
import X.C131666dx;
import X.C154517dI;
import X.C162457s7;
import X.C16870uA;
import X.C179198il;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C185038sx;
import X.C186058ug;
import X.C53492nB;
import X.C54292oU;
import X.C56422rx;
import X.C56612sH;
import X.C620633i;
import X.C620733j;
import X.C627736r;
import X.C635339p;
import X.C73783g4;
import X.C86604Kt;
import X.C86614Ku;
import X.C86644Kx;
import X.C86654Ky;
import X.C87484Tc;
import X.C87884Wm;
import X.C95814uZ;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.WaMediaThumbnailView;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class GalleryTabHostFragment extends Hilt_GalleryTabHostFragment implements C16870uA, C185038sx {
    public long A00;
    public View A01;
    public ViewGroup A02;
    public Toolbar A03;
    public RecyclerView A04;
    public ViewPager A05;
    public AnonymousClass30B A06;
    public C56422rx A07;
    public C620633i A08;
    public C56612sH A09;
    public C54292oU A0A;
    public C620733j A0B;
    public AnonymousClass1VX A0C;
    public AnonymousClass5MZ A0D;
    public C113975mI A0E;
    public AnonymousClass4FS A0F;
    public boolean A0G;
    public final Handler A0H = AnonymousClass000.A0A();
    public final C106105Xq A0I = new C106105Xq();
    public final AnonymousClass66R A0J = C154517dI.A01(new C119695xO(this));
    public final AnonymousClass66R A0K = C154517dI.A01(new C119705xP(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        Intent intent;
        boolean z;
        boolean z2;
        ViewPager viewPager;
        int intExtra;
        Intent intent2;
        C003203q A0Q;
        Intent intent3;
        C179198il r5;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        if (this.A09 != null) {
            this.A00 = System.currentTimeMillis();
            ViewPager viewPager2 = (ViewPager) view2.findViewById(R.id.gallery_view_pager);
            AnonymousClass0YZ.A0G(viewPager2, true);
            C003203q A0Q2 = A0Q();
            AnonymousClass5ZS r13 = null;
            if ((A0Q2 instanceof C179198il) && (r5 = (C179198il) A0Q2) != null) {
                r13 = ((CameraActivity) r5).A03;
            }
            C54292oU r4 = this.A0A;
            if (r4 != null) {
                Resources A002 = C54292oU.A00(r4);
                Bundle bundle2 = this.A06;
                int i = 7;
                if (bundle2 != null) {
                    i = bundle2.getInt("include", 7);
                }
                C08270df A0T = A0T();
                C003203q A0Q3 = A0Q();
                boolean z3 = false;
                if (!(A0Q3 == null || (intent2 = A0Q3.getIntent()) == null || !intent2.hasExtra("is_coming_from_chat") || (A0Q = A0Q()) == null || (intent3 = A0Q.getIntent()) == null)) {
                    z3 = C18310x6.A1W(intent3.getBooleanExtra("is_coming_from_chat", false) ? 1 : 0);
                }
                String A1N = A1N();
                C003203q A0Q4 = A0Q();
                Intent intent4 = null;
                if (A0Q4 != null) {
                    intent4 = A0Q4.getIntent();
                }
                String A0t = C86614Ku.A0t(intent4, "android.intent.extra.TEXT");
                boolean A1U = A1U();
                Intent A092 = C86604Kt.A09(this);
                boolean z4 = false;
                if (A092 != null) {
                    z4 = C18310x6.A1W(A092.hasExtra("quoted_message_row_id") ? 1 : 0);
                }
                long j = 0;
                if (z4) {
                    j = A092.getLongExtra("quoted_message_row_id", 0);
                }
                C003203q A0Q5 = A0Q();
                Intent intent5 = null;
                if (A0Q5 != null) {
                    intent = A0Q5.getIntent();
                } else {
                    intent = null;
                }
                String A0t2 = C86614Ku.A0t(intent, "quoted_group_jid");
                int A1J = A1J();
                boolean A1S = C86654Ky.A1S(C86604Kt.A09(this), "skip_max_items_new_limit");
                C003203q A0Q6 = A0Q();
                if (A0Q6 != null) {
                    intent5 = A0Q6.getIntent();
                }
                String A0t3 = C86614Ku.A0t(intent5, "mentions");
                Intent A093 = C86604Kt.A09(this);
                boolean z5 = false;
                if (A093 != null && A093.hasExtra("is_in_multi_select_mode_only")) {
                    z5 = C18310x6.A1W(A093.getBooleanExtra("is_in_multi_select_mode_only", false) ? 1 : 0);
                }
                Intent A094 = C86604Kt.A09(this);
                boolean z6 = false;
                if (A094 != null) {
                    z6 = C18310x6.A1W(A094.hasExtra("picker_open_time") ? 1 : 0);
                }
                long j2 = 0;
                if (z6) {
                    j2 = A094.getLongExtra("picker_open_time", 0);
                }
                Intent A095 = C86604Kt.A09(this);
                if (A095 == null || !A095.hasExtra("should_send_media")) {
                    z = true;
                } else {
                    z = A095.getBooleanExtra("should_send_media", true);
                }
                Intent A096 = C86604Kt.A09(this);
                if (A096 == null || !A096.hasExtra("should_hide_caption_view")) {
                    z2 = false;
                } else {
                    z2 = A096.getBooleanExtra("should_hide_caption_view", false);
                }
                boolean A1S2 = C86654Ky.A1S(C86604Kt.A09(this), "should_set_gallery_result");
                Intent A097 = C86604Kt.A09(this);
                int i2 = 1;
                if (A097 != null && A097.hasExtra("origin")) {
                    i2 = A097.getIntExtra("origin", 1);
                }
                boolean A1W = A1W();
                C162457s7.A0H(A002);
                Long valueOf = Long.valueOf(j);
                Integer valueOf2 = Integer.valueOf(A1J);
                Boolean valueOf3 = Boolean.valueOf(A1S);
                Boolean valueOf4 = Boolean.valueOf(z5);
                Boolean valueOf5 = Boolean.valueOf(A1W);
                Long valueOf6 = Long.valueOf(j2);
                Boolean valueOf7 = Boolean.valueOf(z);
                Boolean valueOf8 = Boolean.valueOf(z2);
                Boolean valueOf9 = Boolean.valueOf(A1S2);
                Integer valueOf10 = Integer.valueOf(i2);
                C162457s7.A0H(A0T);
                viewPager2.setAdapter(new C87484Tc(A002, A0T, r13, this, valueOf3, valueOf4, valueOf5, valueOf7, valueOf8, valueOf9, valueOf2, valueOf10, valueOf, valueOf6, A1N, A0t, A0t2, A0t3, i, z3, A1U));
                viewPager2.A0G(this);
                this.A05 = viewPager2;
                ((TabLayout) view2.findViewById(R.id.gallery_tab_layout)).setupWithViewPager(this.A05);
                this.A02 = C86644Kx.A0J(view2, R.id.gallery_selected_container);
                Toolbar toolbar = (Toolbar) C18290x4.A0M(view2, R.id.toolbar);
                this.A03 = toolbar;
                boolean z7 = A0R() instanceof GalleryPickerBottomSheetActivity;
                int i3 = R.drawable.ic_back;
                int i4 = R.string.f11nameremoved;
                if (z7) {
                    i3 = R.drawable.ic_close;
                    i4 = R.string.f11nameremoved;
                }
                String string = C08310eF.A09(this).getString(i4);
                C162457s7.A0D(string);
                Drawable A032 = C107335b8.A03(toolbar.getContext(), i3, AnonymousClass5Yj.A02(toolbar.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                C620733j r52 = this.A0B;
                if (r52 != null) {
                    toolbar.setNavigationIcon((Drawable) new C131666dx(A032, r52));
                    toolbar.setNavigationContentDescription((CharSequence) string);
                    toolbar.setNavigationOnClickListener(new C635339p((Object) this, 32));
                    toolbar.setTitleTextColor(AnonymousClass5Yj.A03(toolbar.getContext(), toolbar.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                    Menu menu = toolbar.getMenu();
                    C162457s7.A0D(menu);
                    SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
                    C162457s7.A0H(subMenu);
                    Bundle bundle3 = this.A06;
                    int i5 = 7;
                    if (bundle3 != null) {
                        i5 = bundle3.getInt("include", 7);
                    }
                    C54292oU r6 = this.A0A;
                    if (r6 != null) {
                        AnonymousClass551 r53 = new AnonymousClass551(this, r6, new C1220762z(subMenu, this), i5);
                        AnonymousClass4FS r1 = this.A0F;
                        if (r1 != null) {
                            C18270x1.A0w(r53, r1);
                            toolbar.A0R = new AnonymousClass69E(this, 4);
                            if (A0R() instanceof GalleryPickerBottomSheetActivity) {
                                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                                C162457s7.A0K(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                                toolbar.setLayoutParams(marginLayoutParams);
                                toolbar.requestLayout();
                            }
                            Intent A098 = C86604Kt.A09(this);
                            if (!((A098 != null && A098.hasExtra("origin") && ((intExtra = A098.getIntExtra("origin", 1)) == 2 || intExtra == 15 || intExtra == 18 || intExtra == 7 || intExtra == 8 || intExtra == 12 || intExtra == 13)) || (viewPager = this.A05) == null)) {
                                viewPager.A0F(1, false);
                            }
                            C162457s7.A0D(view2.getContext());
                            RecyclerView recyclerView = (RecyclerView) C18290x4.A0M(view2, R.id.gallery_selected_media);
                            this.A04 = recyclerView;
                            recyclerView.A0h = true;
                            recyclerView.setAdapter((AnonymousClass0R6) this.A0K.getValue());
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                            linearLayoutManager.A1X(0);
                            recyclerView.setLayoutManager(linearLayoutManager);
                            View A0M = C18290x4.A0M(view2, R.id.gallery_done_btn);
                            this.A01 = A0M;
                            C635339p.A00(A0M, this, 31);
                            return;
                        }
                        throw C18270x1.A0S("waWorkers");
                    }
                    throw C18270x1.A0S("waContext");
                }
                throw C18270x1.A0S("whatsAppLocale");
            }
            throw C18270x1.A0S("waContext");
        }
        throw C18270x1.A0S("time");
    }

    public final void A1Q(Activity activity, C95814uZ r11, List list) {
        Activity activity2 = activity;
        C56422rx r1 = this.A07;
        if (r1 != null) {
            C95814uZ r5 = r11;
            if (AnonymousClass5b1.A05(r1, r11, list.size())) {
                Intent A0J2 = C627736r.A0J(activity2, (Uri) list.get(0), r5, (String) null, (String) null, false);
                C162457s7.A0D(A0J2);
                activity.startActivityForResult(A0J2, 36);
            } else if (activity instanceof DocumentPickerActivity) {
                ((DocumentPickerActivity) activity2).A7B(AnonymousClass002.A0J(list));
            } else {
                Intent A0A2 = C86644Kx.A0A(this);
                A0A2.putParcelableArrayListExtra("android.intent.extra.STREAM", AnonymousClass002.A0J(list));
                AnonymousClass0x2.A0m(activity, A0A2);
            }
        } else {
            throw C18270x1.A0S("verifiedNameManager");
        }
    }

    public final C87484Tc A1M() {
        AnonymousClass0R4 r1;
        ViewPager viewPager = this.A05;
        if (viewPager != null) {
            r1 = viewPager.getAdapter();
        } else {
            r1 = null;
        }
        if (r1 instanceof C87484Tc) {
            return (C87484Tc) r1;
        }
        return null;
    }

    public void A1R(List list) {
        Uri uri;
        Bundle bundle;
        AnonymousClass5W8 A1L;
        View view;
        String str;
        C179198il r0;
        AnonymousClass5ZS r5;
        List A0s;
        boolean z;
        GalleryRecentsFragment galleryRecentsFragment;
        View view2;
        C95814uZ A052 = C95814uZ.A00.A05(A1N());
        if (A1W() && C18310x6.A1X(list) && A052 != null) {
            ArrayList A0c = C73783g4.A0c(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C86654Ky.A1Q(A0c, it);
            }
            A1Q(A0R(), A052, AnonymousClass002.A0J(A0c));
        } else if (A1U()) {
            C003203q A0Q = A0Q();
            if (!(A0Q instanceof C179198il) || (r0 = (C179198il) A0Q) == null || (r5 = ((CameraActivity) r0).A03) == null || r5.A0A == null) {
                if (A0Q == null || (view = (A1L = A1L(list)).A01) == null || (str = A1L.A03) == null) {
                    bundle = null;
                } else {
                    bundle = new C004705b(AnonymousClass0RF.A00(A0Q, view, str)).A00.toBundle();
                }
                ArrayList A0c2 = C73783g4.A0c(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C86654Ky.A1Q(A0c2, it2);
                }
                A0n(A1K(AnonymousClass002.A0J(A0c2)), 101, bundle);
            } else if (!list.isEmpty()) {
                AnonymousClass5W8 A1L2 = A1L(list);
                ArrayList A0c3 = C73783g4.A0c(list);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C86654Ky.A1Q(A0c3, it3);
                }
                String str2 = A1L2.A03;
                if (str2 == null || (view2 = A1L2.A01) == null) {
                    A0s = AnonymousClass001.A0s();
                } else {
                    A0s = AnonymousClass8UF.A0p(AnonymousClass0x9.A0G(view2, str2));
                }
                Bitmap bitmap = A1L2.A00;
                C186058ug r8 = A1L2.A02;
                C87484Tc A1M = A1M();
                if (A1M == null || (galleryRecentsFragment = (GalleryRecentsFragment) A1M.A0J.getValue()) == null) {
                    z = false;
                } else {
                    z = galleryRecentsFragment.A06;
                }
                r5.A0I(bitmap, this, r8, A0c3, A0s, 4, z);
            }
        } else {
            ArrayList A0c4 = C73783g4.A0c(list);
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                C86654Ky.A1Q(A0c4, it4);
            }
            ArrayList A0J2 = AnonymousClass002.A0J(A0c4);
            C003203q A0R = A0R();
            Intent A072 = C18320x8.A07();
            Intent intent = A0R.getIntent();
            Uri uri2 = null;
            if (intent != null) {
                uri = intent.getData();
            } else {
                uri = null;
            }
            A072.putExtra("bucket_uri", uri);
            A072.putParcelableArrayListExtra("android.intent.extra.STREAM", A0J2);
            if (A0J2.size() == 1) {
                uri2 = (Uri) AnonymousClass0x9.A0t(A0J2);
            }
            A072.setData(uri2);
            AnonymousClass0x2.A0m(A0R, A072);
        }
    }

    public void A0c() {
        List list;
        super.A0c();
        ((C53492nB) this.A0J.getValue()).A00();
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        ViewPager viewPager = this.A05;
        if (viewPager != null) {
            viewPager.setAdapter((AnonymousClass0R4) null);
        }
        ViewPager viewPager2 = this.A05;
        if (!(viewPager2 == null || (list = viewPager2.A0c) == null)) {
            list.remove(this);
        }
        this.A05 = null;
        this.A02 = null;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.setAdapter((AnonymousClass0R6) null);
        }
        this.A04 = null;
        this.A03 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            X.03q r1 = r7.A0Q()
            boolean r0 = r1 instanceof X.C179198il
            if (r0 == 0) goto L_0x0019
            X.8il r1 = (X.C179198il) r1
            if (r1 == 0) goto L_0x0019
            com.whatsapp.camera.CameraActivity r1 = (com.whatsapp.camera.CameraActivity) r1
            X.5ZS r1 = r1.A03
            if (r1 == 0) goto L_0x0019
            X.4ea r0 = r1.A0A
            if (r0 == 0) goto L_0x0019
            r1.A0H(r8, r9, r10)
        L_0x0019:
            r0 = 101(0x65, float:1.42E-43)
            r4 = -1
            if (r8 != r0) goto L_0x00e0
            if (r9 == r4) goto L_0x00a2
            if (r9 == 0) goto L_0x009e
            r0 = 1
            if (r9 != r0) goto L_0x0148
            if (r10 == 0) goto L_0x0148
            X.5Xq r1 = r7.A0I
            android.os.Bundle r0 = r10.getExtras()
            r1.A02(r0)
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r10.getParcelableArrayListExtra(r0)
            if (r0 == 0) goto L_0x004e
            java.util.ArrayList r2 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0040:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r1.next()
            X.AnonymousClass0x7.A1D(r0, r2)
            goto L_0x0040
        L_0x004e:
            r6 = 0
            goto L_0x0054
        L_0x0050:
            java.util.Set r6 = X.C73723fy.A0P(r2)
        L_0x0054:
            X.4Tc r0 = r7.A1M()
            if (r0 == 0) goto L_0x0148
            if (r6 == 0) goto L_0x0148
            X.66R r0 = r0.A0J
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.gallery.GalleryRecentsFragment r5 = (com.whatsapp.gallery.GalleryRecentsFragment) r5
            int r1 = r6.size()
            java.util.Map r4 = r5.A08
            int r0 = r4.size()
            if (r1 == r0) goto L_0x0148
            java.util.LinkedHashMap r3 = X.C18320x8.A0r()
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r4)
        L_0x0078:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0094
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r2)
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = r0.toString()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0078
            X.C18270x1.A1N(r3, r1)
            goto L_0x0078
        L_0x0094:
            r4.clear()
            r4.putAll(r3)
            r5.A1Y()
            return
        L_0x009e:
            r7.A1O()
            return
        L_0x00a2:
            X.03q r1 = r7.A0Q()
            boolean r0 = r1 instanceof com.whatsapp.camera.CameraActivity
            if (r0 == 0) goto L_0x00af
            if (r1 == 0) goto L_0x00af
            r1.finish()
        L_0x00af:
            android.content.Intent r5 = X.C86604Kt.A09(r7)
            java.lang.String r3 = "should_set_gallery_result"
            r2 = 0
            if (r5 == 0) goto L_0x00d2
            boolean r1 = r5.hasExtra(r3)
            r0 = 1
            if (r1 != r0) goto L_0x00d2
            boolean r0 = r5.getBooleanExtra(r3, r2)
            if (r0 == 0) goto L_0x00d2
            X.03q r1 = r7.A0Q()
            boolean r0 = r1 instanceof com.whatsapp.gallerypicker.GalleryPicker
            if (r0 == 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00d2
            r1.setResult(r4, r10)
        L_0x00d2:
            X.03q r1 = r7.A0Q()
            boolean r0 = r1 instanceof com.whatsapp.gallerypicker.GalleryPicker
            if (r0 == 0) goto L_0x0148
            if (r1 == 0) goto L_0x0148
            r1.finish()
            return
        L_0x00e0:
            r0 = 91
            if (r8 != r0) goto L_0x0128
            if (r9 != r4) goto L_0x0148
            boolean r0 = r7.A1U()
            if (r0 == 0) goto L_0x013e
            if (r10 == 0) goto L_0x0148
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r2 = r10.getParcelableArrayListExtra(r0)
            if (r2 != 0) goto L_0x0104
            android.net.Uri r1 = r10.getData()
            if (r1 == 0) goto L_0x0148
            r0 = 1
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r0)
            r2.add(r1)
        L_0x0104:
            X.5Yw r1 = X.C95814uZ.A00
            java.lang.String r0 = r7.A1N()
            X.4uZ r1 = r1.A05(r0)
            boolean r0 = r7.A1W()
            if (r0 == 0) goto L_0x011e
            if (r1 == 0) goto L_0x011e
            X.03q r0 = r7.A0R()
            r7.A1Q(r0, r1, r2)
            return
        L_0x011e:
            android.content.Intent r1 = r7.A1K(r2)
            r0 = 90
            r7.startActivityForResult(r1, r0)
            return
        L_0x0128:
            r0 = 90
            if (r8 != r0) goto L_0x0148
            if (r9 == r4) goto L_0x013e
            r1 = 2
            if (r9 != r1) goto L_0x0148
            X.03q r0 = r7.A0Q()
            if (r0 == 0) goto L_0x013a
            r0.setResult(r1)
        L_0x013a:
            X.C18300x5.A1A(r7)
            return
        L_0x013e:
            X.03q r0 = r7.A0Q()
            if (r0 == 0) goto L_0x013a
            r0.setResult(r4, r10)
            goto L_0x013a
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A0k(int, int, android.content.Intent):void");
    }

    public void A15(boolean z) {
        ViewPager viewPager;
        super.A15(z);
        if (this.A0L.A02.A00(AnonymousClass0GC.RESUMED) && (viewPager = this.A05) != null) {
            viewPager.setCurrentItem(0);
        }
    }

    public final int A1J() {
        Intent A092 = C86604Kt.A09(this);
        boolean z = false;
        if (A092 != null) {
            z = C18310x6.A1W(A092.hasExtra("max_items") ? 1 : 0);
        }
        AnonymousClass1VX r0 = this.A0C;
        if (z) {
            if (r0 != null) {
                return A092.getIntExtra("max_items", r0.A0N(2614));
            }
            throw C18270x1.A0R();
        } else if (r0 != null) {
            return r0.A0N(2614);
        } else {
            throw C18270x1.A0R();
        }
    }

    public final Intent A1K(ArrayList arrayList) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        Intent A092 = C86604Kt.A09(this);
        if (A092 == null || !A092.hasExtra("origin")) {
            i = 1;
        } else {
            i = A092.getIntExtra("origin", 1);
        }
        AnonymousClass5PE r3 = new AnonymousClass5PE(A0R());
        if (this.A09 != null) {
            r3.A04 = System.currentTimeMillis() - this.A00;
            r3.A0H = C86654Ky.A1S(C86604Kt.A09(this), "number_from_url");
            r3.A0C = A1N();
            r3.A01 = A1J() - ((C87884Wm) this.A0K.getValue()).A02.size();
            r3.A0N = C86654Ky.A1S(C86604Kt.A09(this), "skip_max_items_new_limit");
            r3.A02 = i;
            Intent A093 = C86604Kt.A09(this);
            boolean z4 = false;
            if (A093 != null) {
                z4 = C18310x6.A1W(A093.hasExtra("picker_open_time") ? 1 : 0);
            }
            long j = 0;
            if (z4) {
                j = A093.getLongExtra("picker_open_time", 0);
            }
            r3.A05 = j;
            C003203q A0Q = A0Q();
            Intent intent = null;
            if (A0Q != null) {
                intent = A0Q.getIntent();
            }
            r3.A0D = C86614Ku.A0t(intent, "quoted_group_jid");
            Intent A094 = C86604Kt.A09(this);
            boolean z5 = false;
            if (A094 != null) {
                z5 = C18310x6.A1W(A094.hasExtra("quoted_message_row_id") ? 1 : 0);
            }
            long j2 = 0;
            if (z5) {
                j2 = A094.getLongExtra("quoted_message_row_id", 0);
            }
            r3.A06 = j2;
            r3.A0J = AnonymousClass001.A1X(i, 20);
            Intent A095 = C86604Kt.A09(this);
            if (A095 == null || !A095.hasExtra("should_send_media")) {
                z = true;
            } else {
                z = A095.getBooleanExtra("should_send_media", true);
            }
            r3.A0M = z;
            Intent A096 = C86604Kt.A09(this);
            if (A096 == null || !A096.hasExtra("should_hide_caption_view")) {
                z2 = false;
            } else {
                z2 = A096.getBooleanExtra("should_hide_caption_view", false);
            }
            r3.A0L = z2;
            Intent A097 = C86604Kt.A09(this);
            if (A097 == null || !A097.hasExtra("send")) {
                z3 = true;
            } else {
                z3 = A097.getBooleanExtra("send", true);
            }
            r3.A0K = z3;
            r3.A0G = arrayList;
            C003203q A0Q2 = A0Q();
            Intent intent2 = null;
            if (A0Q2 != null) {
                intent2 = A0Q2.getIntent();
            }
            r3.A0B = C86614Ku.A0t(intent2, "android.intent.extra.TEXT");
            AnonymousClass5PE.A00(this.A0I, r3);
            return r3.A01();
        }
        throw C18270x1.A0S("time");
    }

    public final AnonymousClass5W8 A1L(List list) {
        RecyclerView recyclerView;
        View view;
        int size = list.size();
        if (!C107275b2.A00 || ((C87884Wm) this.A0K.getValue()).A02.size() != 1 || (recyclerView = this.A04) == null || recyclerView.getChildCount() != 1 || size != 1 || this.A0B == null) {
            return new AnonymousClass5W8((Bitmap) null, (View) null, (C186058ug) null, (String) null);
        }
        RecyclerView recyclerView2 = this.A04;
        if (recyclerView2 != null) {
            view = C04990Rl.A00(recyclerView2);
        } else {
            view = null;
        }
        C162457s7.A0K(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View A002 = C04990Rl.A00((ViewGroup) view);
        C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.WaMediaThumbnailView");
        WaMediaThumbnailView waMediaThumbnailView = (WaMediaThumbnailView) A002;
        String A0o = C18290x4.A0o(((C186058ug) list.get(0)).B3d());
        C162457s7.A0J(waMediaThumbnailView, 1);
        return new AnonymousClass5W8(waMediaThumbnailView.A00, waMediaThumbnailView, waMediaThumbnailView.A01, A0o);
    }

    public final String A1N() {
        C003203q A0Q = A0Q();
        Intent intent = null;
        if (A0Q != null) {
            intent = A0Q.getIntent();
        }
        return C86614Ku.A0t(intent, "jid");
    }

    public final void A1O() {
        C87484Tc A1M = A1M();
        if (A1M != null) {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) A1M.A0J.getValue();
            if (false != galleryRecentsFragment.A06) {
                galleryRecentsFragment.A08.clear();
            }
            galleryRecentsFragment.A06 = false;
            galleryRecentsFragment.A08.clear();
            galleryRecentsFragment.A1Y();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (((X.C87884Wm) r4.A0K.getValue()).A02.size() != 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1P(int r5) {
        /*
            r4 = this;
            boolean r0 = r4.A1V()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0021
            if (r5 != 0) goto L_0x0021
            boolean r0 = r4.A1T()
            if (r0 == 0) goto L_0x0021
            X.66R r0 = r4.A0K
            java.lang.Object r0 = r0.getValue()
            X.4Wm r0 = (X.C87884Wm) r0
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            r1 = 1
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            androidx.appcompat.widget.Toolbar r0 = r4.A03
            if (r0 == 0) goto L_0x0035
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L_0x0035
            android.view.MenuItem r0 = r0.getItem(r3)
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1)
        L_0x0035:
            androidx.appcompat.widget.Toolbar r0 = r4.A03
            if (r0 == 0) goto L_0x004e
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L_0x004e
            android.view.MenuItem r1 = r0.getItem(r2)
            if (r1 == 0) goto L_0x004e
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x004f
            if (r5 != r2) goto L_0x004f
        L_0x004b:
            r1.setVisible(r2)
        L_0x004e:
            return
        L_0x004f:
            r2 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A1P(int):void");
    }

    public final void A1S(boolean z) {
        C87484Tc A1M = A1M();
        if (A1M != null) {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) A1M.A0J.getValue();
            if (!z && z != galleryRecentsFragment.A06) {
                galleryRecentsFragment.A08.clear();
            }
            galleryRecentsFragment.A06 = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r1.A0X(5643) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1T() {
        /*
            r4 = this;
            java.lang.String r0 = r4.A1N()
            r3 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r4.A1N()
            com.whatsapp.jid.Jid r0 = X.AnonymousClass32W.A01(r0)
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0020
            X.1VX r1 = r4.A0C
            if (r1 == 0) goto L_0x0044
            r0 = 5643(0x160b, float:7.908E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            return r3
        L_0x0020:
            int r1 = r4.A1J()
            r0 = 1
            if (r1 <= r0) goto L_0x001f
            boolean r0 = r4.A1U()
            if (r0 != 0) goto L_0x0042
            android.content.Intent r2 = X.C86604Kt.A09(r4)
            java.lang.String r1 = "is_in_multi_select_mode_only"
            if (r2 == 0) goto L_0x001f
            boolean r0 = r2.hasExtra(r1)
            if (r0 == 0) goto L_0x001f
            boolean r1 = r2.getBooleanExtra(r1, r3)
            r0 = 1
            if (r1 != r0) goto L_0x001f
        L_0x0042:
            r3 = 1
            return r3
        L_0x0044:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A1T():boolean");
    }

    public final boolean A1U() {
        Intent intent;
        C003203q A0Q;
        Intent intent2;
        C003203q A0Q2 = A0Q();
        if (A0Q2 == null || (intent = A0Q2.getIntent()) == null || !intent.hasExtra("preview") || ((A0Q = A0Q()) != null && (intent2 = A0Q.getIntent()) != null && intent2.getBooleanExtra("preview", true))) {
            return true;
        }
        return false;
    }

    public final boolean A1V() {
        if (!A1T() || A1J() <= 1) {
            return false;
        }
        C113975mI r0 = this.A0E;
        if (r0 == null) {
            throw C18270x1.A0S("mediaTray");
        } else if (r0.A00.A0X(4261)) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A1W() {
        Intent intent;
        C003203q A0Q;
        Intent intent2;
        C003203q A0Q2 = A0Q();
        if (A0Q2 == null || (intent = A0Q2.getIntent()) == null || !intent.hasExtra("is_send_as_document") || (A0Q = A0Q()) == null || (intent2 = A0Q.getIntent()) == null) {
            return false;
        }
        return C18310x6.A1W(intent2.getBooleanExtra("is_send_as_document", false) ? 1 : 0);
    }

    public void BCe(C106105Xq r2, Collection collection) {
        C87484Tc A1M = A1M();
        if (A1M != null) {
            A1M.BCe(r2, collection);
        }
    }

    public void BXd(int i) {
    }

    public void BXf(int i) {
        String str;
        A1O();
        Toolbar toolbar = this.A03;
        if (toolbar != null) {
            Bundle bundle = this.A06;
            if (bundle != null) {
                str = bundle.getString("gallery_picker_title");
            } else {
                str = null;
            }
            toolbar.setTitle((CharSequence) str);
        }
        A1P(i);
    }

    public void BiW() {
        C87484Tc A1M = A1M();
        if (A1M != null) {
            A1M.BiW();
        }
    }

    public void BnK(C106105Xq r2, Collection collection, Collection collection2) {
        C87484Tc A1M = A1M();
        if (A1M != null) {
            A1M.BnK(r2, collection, collection2);
        }
    }

    public void BXe(int i, float f, int i2) {
    }
}
