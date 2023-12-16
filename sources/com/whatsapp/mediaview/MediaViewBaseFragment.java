package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0XU;
import X.AnonymousClass0Y8;
import X.AnonymousClass0Y9;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass57A;
import X.AnonymousClass5MG;
import X.AnonymousClass5NH;
import X.AnonymousClass5ZR;
import X.AnonymousClass6B8;
import X.C003203q;
import X.C009707r;
import X.C06560Yg;
import X.C1001059l;
import X.C106235Yd;
import X.C107275b2;
import X.C107385bE;
import X.C108855df;
import X.C109365eV;
import X.C111095hX;
import X.C114305mp;
import X.C1229866p;
import X.C134346ir;
import X.C162457s7;
import X.C18260x0;
import X.C182718os;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C185718u8;
import X.C185918uS;
import X.C30471mV;
import X.C626936e;
import X.C627336j;
import X.C71643cR;
import X.C86604Kt;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C89074bR;
import X.C95814uZ;
import X.C96014vU;
import X.C96024vV;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaFragment;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.whatsapp.components.InsetsDrawingView;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.util.Log;

public abstract class MediaViewBaseFragment extends WaFragment implements C182718os {
    public Bundle A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public TextView A05;
    public TextEmojiLabel A06;
    public InsetsDrawingView A07;
    public C89074bR A08;
    public C134346ir A09;
    public C182718os A0A;
    public C107275b2 A0B;
    public AnonymousClass5NH A0C;
    public OutOfMemoryError A0D;
    public Runnable A0E;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = true;

    public PhotoView A1I(ViewGroup viewGroup) {
        PhotoView A1I;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof PhotoView) {
                return (PhotoView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (A1I = A1I((ViewGroup) childAt)) != null) {
                return A1I;
            }
        }
        return null;
    }

    public PhotoView A1J(Object obj) {
        if (obj != null) {
            View findViewWithTag = this.A09.findViewWithTag(obj);
            if (findViewWithTag instanceof ViewGroup) {
                return A1I((ViewGroup) findViewWithTag);
            }
        }
        return null;
    }

    public static void A00(Activity activity) {
        if (C107275b2.A00) {
            C86634Kw.A1F(activity.getWindow());
        }
    }

    public void A0a() {
        if (this.A09 != null) {
            for (int i = 0; i < this.A09.getChildCount(); i++) {
                View childAt = this.A09.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i2 >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).A02();
                        }
                        i2++;
                    }
                }
            }
        }
        super.A0a();
    }

    public void A0c() {
        this.A04.removeView(this.A09);
        this.A04 = null;
        this.A03 = null;
        this.A06 = null;
        this.A05 = null;
        this.A01 = null;
        this.A02 = null;
        this.A07 = null;
        super.A0c();
    }

    public Object A1K() {
        if (this instanceof MediaViewFragment) {
            C30471mV r0 = ((MediaViewFragment) this).A1S;
            if (r0 == null) {
                return null;
            }
            return r0.A1J;
        } else if (!(this instanceof LinkedAccountMediaViewFragment)) {
            return ((CatalogMediaViewFragment) this).A0A;
        } else {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            return ((C108855df) linkedAccountMediaViewFragment.A0G.get(linkedAccountMediaViewFragment.A03)).A01.A04;
        }
    }

    public Object A1L() {
        if (this instanceof MediaViewFragment) {
            return ((MediaViewFragment) this).A1R;
        }
        if (this instanceof LinkedAccountMediaViewFragment) {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            return ((C108855df) linkedAccountMediaViewFragment.A0G.get(linkedAccountMediaViewFragment.A03)).A01.A04;
        }
        CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this;
        String str = catalogMediaViewFragment.A02.A0F;
        return AnonymousClass000.A0Y("_", AnonymousClass000.A0l(str), catalogMediaViewFragment.A00);
    }

    public Object A1M(int i) {
        if (this instanceof MediaViewFragment) {
            C30471mV A1a = ((MediaViewFragment) this).A1a(i);
            if (A1a != null) {
                return A1a.A1J;
            }
            return null;
        } else if (this instanceof LinkedAccountMediaViewFragment) {
            return ((C108855df) ((LinkedAccountMediaViewFragment) this).A0G.get(i)).A01.A04;
        } else {
            return AnonymousClass000.A0Y("_", AnonymousClass000.A0l(((CatalogMediaViewFragment) this).A02.A0F), i);
        }
    }

    public void A1Q() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            C71643cR r1 = mediaViewFragment.A0E;
            if (r1 != null) {
                r1.A03 = true;
                ((Thread) r1.A02).interrupt();
                mediaViewFragment.A0E = null;
            }
            C1229866p r0 = mediaViewFragment.A1E;
            if (r0 != null) {
                r0.BqB();
            }
            mediaViewFragment.A1N();
            return;
        }
        A1N();
    }

    public void A1R() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            if (mediaViewFragment.A14 == null || (mediaViewFragment.A1w && mediaViewFragment.A1S != null)) {
                mediaViewFragment.A1Q();
                return;
            }
            mediaViewFragment.A1S = null;
            Context A0G2 = mediaViewFragment.A0G();
            C95814uZ r3 = mediaViewFragment.A14;
            Intent A072 = C18320x8.A07();
            C627336j.A0E(A072, r3, A0G2.getPackageName(), "com.whatsapp.gallery.MediaGalleryActivity");
            mediaViewFragment.A0m(A072);
            mediaViewFragment.A1O();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (r3 != null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(int r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x014d
            r4 = r6
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            X.1mV r3 = r4.A1a(r7)
            X.3Wi r0 = r4.A0L
            java.lang.Runnable r5 = r4.A26
            r0.A0R(r5)
            X.5YG r0 = r4.A1n
            if (r0 == 0) goto L_0x0050
            X.1mV r0 = r4.A1U
            if (r0 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0022
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0052
        L_0x0022:
            X.5YG r0 = r4.A1n
            r0.A0C()
            java.util.HashMap r2 = r4.A27
            X.1mV r0 = r4.A1U
            X.2z0 r1 = r0.A1J
            X.5YG r0 = r4.A1n
            int r0 = r0.A05()
            X.AnonymousClass0x2.A1I(r1, r2, r0)
            X.5YG r0 = r4.A1n
            r0.A0G()
            X.5YG r0 = r4.A1n
            r0.A0D()
            X.5YG r1 = r4.A1n
            r0 = 4
            r1.A0S(r0)
            X.33d r1 = r4.A1B
            X.1mV r0 = r4.A1U
            r1.A0B(r0)
            r0 = 0
            r4.A1n = r0
        L_0x0050:
            if (r3 == 0) goto L_0x00ce
        L_0x0052:
            byte r1 = r3.A1I
            r0 = 2
            if (r1 != r0) goto L_0x00ce
            X.1mV r0 = r4.A1U
            if (r0 == 0) goto L_0x0063
            X.2z0 r0 = r0.A1J
            boolean r0 = X.C86664Kz.A1X(r3, r0)
            if (r0 != 0) goto L_0x0066
        L_0x0063:
            r4.A1o(r3)
        L_0x0066:
            int r0 = r4.A04
            if (r0 == r7) goto L_0x0086
            X.1mV r0 = r4.A1U
            if (r0 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x0086
            X.2z0 r0 = r3.A1J
            com.whatsapp.mediaview.PhotoView r2 = r4.A1J(r0)
            if (r2 == 0) goto L_0x0086
            android.graphics.Matrix r1 = r2.A0B
            android.graphics.Matrix r0 = r2.A0C
            r1.set(r0)
            float r0 = r2.A06
            r2.A00 = r0
            r2.setImageMatrix(r1)
        L_0x0086:
            X.1mV r0 = r4.A1U
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0093
            r0 = 1
            r4.A1x = r0
        L_0x0093:
            r4.A1c()
            r4.A1U = r3
            r4.A04 = r7
            X.1VX r1 = r4.A0z
            r0 = 6649(0x19f9, float:9.317E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00ca
            X.4FS r2 = r4.A1m
            r1 = 44
            X.5sM r0 = new X.5sM
            r0.<init>((java.lang.Object) r4, (int) r7, (int) r1)
            r2.BkM(r0)
        L_0x00b0:
            X.03q r0 = r4.A0R()
            android.view.View r0 = X.AnonymousClass001.A0Q(r0)
            int r0 = r0.getSystemUiVisibility()
            r1 = r0 & -3
            X.03q r0 = r4.A0R()
            android.view.View r0 = X.AnonymousClass001.A0Q(r0)
            r0.setSystemUiVisibility(r1)
        L_0x00c9:
            return
        L_0x00ca:
            r4.A1g(r7)
            goto L_0x00b0
        L_0x00ce:
            boolean r0 = r4.A1v
            if (r0 == 0) goto L_0x0129
            if (r3 == 0) goto L_0x0148
            byte r1 = r3.A1I
            boolean r0 = X.AnonymousClass35Z.A00(r1)
            if (r0 == 0) goto L_0x010a
            java.util.Map r0 = r4.A29
            X.2z0 r2 = r3.A1J
            java.lang.Object r1 = r0.get(r2)
            X.5YG r1 = (X.AnonymousClass5YG) r1
            r4.A1n = r1
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x0066
            if (r1 == 0) goto L_0x0066
            boolean r0 = r1.A0e()
            if (r0 != 0) goto L_0x0066
            r1.A0J()
            java.util.HashMap r0 = r4.A27
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r2, r0)
            if (r0 == 0) goto L_0x0066
            X.5YG r1 = r4.A1n
            int r0 = r0.intValue()
            r1.A0P(r0)
            goto L_0x0066
        L_0x010a:
            boolean r0 = X.C627636p.A0G(r1)
            if (r0 == 0) goto L_0x0148
            java.util.Map r1 = r4.A29
            X.2z0 r0 = r3.A1J
            java.lang.Object r0 = r1.get(r0)
            X.5YG r0 = (X.AnonymousClass5YG) r0
            r4.A1n = r0
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x0066
            X.3Wi r2 = r4.A0L
            r0 = 150(0x96, double:7.4E-322)
            r2.A0T(r5, r0)
            goto L_0x0066
        L_0x0129:
            if (r3 == 0) goto L_0x0148
            byte r0 = r3.A1I
            boolean r0 = X.C627636p.A0G(r0)
            if (r0 == 0) goto L_0x0148
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x0066
            java.util.Map r1 = r4.A28
            X.2z0 r0 = r3.A1J
            java.lang.Object r0 = r1.get(r0)
            X.5YG r0 = (X.AnonymousClass5YG) r0
            if (r0 == 0) goto L_0x0066
            r0.A0F()
            goto L_0x0066
        L_0x0148:
            r4.A1f()
            goto L_0x0066
        L_0x014d:
            boolean r0 = r6 instanceof com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment
            if (r0 == 0) goto L_0x00c9
            r2 = r6
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r2 = (com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment) r2
            r2.A01 = r7
            java.util.List r0 = r2.A0G
            java.lang.Object r0 = r0.get(r7)
            X.5df r0 = (X.C108855df) r0
            long r0 = r0.A00
            r2.A1a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewBaseFragment.A1S(int):void");
    }

    public final void A1T(View view) {
        AnonymousClass5NH r0;
        Log.d("mediaview/setWindowInsetsForPage");
        View findViewById = view.findViewById(R.id.footer);
        if (findViewById != null && (r0 = this.A0C) != null) {
            AnonymousClass0XU r02 = r0.A01;
            AnonymousClass0XU A002 = AnonymousClass0XU.A00(r02.A01, 0, r02.A02, 0);
            C162457s7.A0D(A002);
            AnonymousClass0XU A003 = this.A0C.A00();
            AnonymousClass0XU A004 = AnonymousClass0XU.A00(A003.A01, 0, A003.A02, 0);
            C162457s7.A0D(A004);
            AnonymousClass5NH r03 = this.A0C;
            AnonymousClass0XU A022 = AnonymousClass0XU.A02(r03.A00, r03.A01);
            C162457s7.A0D(A022);
            AnonymousClass0XU A005 = AnonymousClass0XU.A00(0, 0, 0, A022.A00);
            C162457s7.A0D(A005);
            ViewGroup.MarginLayoutParams A0O = C86634Kw.A0O(findViewById);
            A0O.leftMargin = A002.A01;
            A0O.topMargin = A002.A03;
            A0O.rightMargin = A002.A02;
            A0O.bottomMargin = A002.A00;
            findViewById.setLayoutParams(A0O);
            C106235Yd.A00(findViewById, AnonymousClass0XU.A00(A004.A01 + A005.A01, A004.A03 + A005.A03, A004.A02 + A005.A02, A004.A00 + A005.A00));
        }
    }

    public void A1U(C185718u8 r3) {
        C89074bR r1 = new C89074bR(r3, this);
        this.A08 = r1;
        this.A09.setAdapter(r1);
        this.A09.A0F(0, false);
    }

    public void A1V(boolean z, int i) {
        AlphaAnimation A0C2;
        int childCount = this.A09.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = this.A09.getChildAt(i2).findViewById(R.id.footer);
            int visibility = findViewById.getVisibility();
            if (z) {
                if (visibility != 0) {
                    A0C2 = AnonymousClass4L0.A0C(0.0f, 1.0f);
                    findViewById.setVisibility(0);
                }
            } else if (visibility != 4) {
                A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
                findViewById.setVisibility(4);
            }
            if (i > 0) {
                A0C2.setDuration((long) i);
                findViewById.startAnimation(A0C2);
            }
        }
    }

    public void A1W(boolean z, boolean z2) {
        AlphaAnimation A0C2;
        C003203q A0Q;
        if (!this.A0F && this.A0J != z) {
            this.A0J = z;
            A1V(z, 400);
            int A012 = C86634Kw.A01(this.A0J ? 1 : 0);
            if (z) {
                A0C2 = AnonymousClass4L0.A0C(0.0f, 1.0f);
            } else {
                A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
            }
            A0C2.setDuration(250);
            if (this.A02.getVisibility() != A012) {
                this.A02.setVisibility(A012);
                this.A02.startAnimation(A0C2);
            }
            if (this.A03.getVisibility() != A012) {
                this.A03.setVisibility(A012);
                this.A03.startAnimation(A0C2);
            }
            if (this.A07.getVisibility() != A012) {
                this.A07.setVisibility(A012);
                this.A07.startAnimation(A0C2);
            }
            if (z2 && (A0Q = A0Q()) != null) {
                boolean z3 = this.A0J;
                int i = 1280;
                if (!z3) {
                    i = 1285;
                }
                int i2 = i | EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH | 512;
                if (!z3) {
                    i2 |= 2;
                }
                AnonymousClass001.A0Q(A0Q).setSystemUiVisibility(i2);
            }
        }
    }

    public final boolean A1Y() {
        PhotoView A1J = A1J(A1M(this.A09.getCurrentItem()));
        if (A1J == null || !A1J.A0B()) {
            return false;
        }
        return true;
    }

    public void Bed(boolean z) {
        Runnable runnable = this.A0E;
        if (runnable != null && z) {
            runnable.run();
        }
        this.A0F = false;
        C182718os r0 = this.A0A;
        if (r0 != null) {
            r0.Bed(z);
            this.A0A = null;
        }
        if (this.A0G && this.A0I) {
            A1W(true, true);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        } catch (OutOfMemoryError e) {
            this.A0D = e;
            return null;
        }
    }

    public void A0f() {
        AnonymousClass1VX r2;
        AnonymousClass5ZR r0;
        super.A0f();
        if (!this.A0H) {
            boolean z = this instanceof MediaViewFragment;
            if (z) {
                r2 = ((MediaViewFragment) this).A0z;
            } else if (this instanceof LinkedAccountMediaViewFragment) {
                r2 = ((LinkedAccountMediaViewFragment) this).A0D;
            } else {
                r2 = ((CatalogMediaViewFragment) this).A07;
            }
            Context A0G2 = A0G();
            if (z) {
                r0 = ((MediaViewFragment) this).A0k;
            } else if (this instanceof LinkedAccountMediaViewFragment) {
                r0 = ((LinkedAccountMediaViewFragment) this).A0B;
            } else {
                r0 = ((CatalogMediaViewFragment) this).A06;
            }
            if (!RequestPermissionActivity.A0q(A0G2, r0, r2)) {
                this.A0H = true;
                A1O();
            }
        }
        A1W(true, true);
    }

    public void A0h() {
        super.A0h();
        A1W(true, true);
    }

    public void A0p(Bundle bundle) {
        C107275b2 r0;
        AnonymousClass1VX r2;
        AnonymousClass5ZR r02;
        AnonymousClass5MG r1 = new AnonymousClass5MG(A0R());
        if (C107275b2.A00) {
            r0 = new C96024vV(r1, this);
        } else {
            r0 = new C96014vU(this);
        }
        this.A0B = r0;
        super.A0p(bundle);
        if (!this.A0H) {
            boolean z = this instanceof MediaViewFragment;
            if (z) {
                r2 = ((MediaViewFragment) this).A0z;
            } else if (this instanceof LinkedAccountMediaViewFragment) {
                r2 = ((LinkedAccountMediaViewFragment) this).A0D;
            } else {
                r2 = ((CatalogMediaViewFragment) this).A07;
            }
            Context A0G2 = A0G();
            if (z) {
                r02 = ((MediaViewFragment) this).A0k;
            } else if (this instanceof LinkedAccountMediaViewFragment) {
                r02 = ((LinkedAccountMediaViewFragment) this).A0B;
            } else {
                r02 = ((CatalogMediaViewFragment) this).A06;
            }
            if (!RequestPermissionActivity.A0q(A0G2, r02, r2)) {
                this.A0H = true;
                A1O();
            }
        }
        this.A09 = new C134346ir(A0G(), this);
        Bundle bundle2 = this.A06;
        if (bundle2 == null) {
            A1O();
        } else {
            this.A00 = bundle2.getBundle("animation_bundle");
        }
    }

    public void A0w(Bundle bundle, View view) {
        ViewGroup A0I2 = C86644Kx.A0I(A0J(), R.id.toolbar_container);
        this.A03 = A0I2;
        A0I2.setFitsSystemWindows(false);
        Toolbar toolbar = (Toolbar) C06560Yg.A02(this.A03, R.id.toolbar);
        toolbar.A07();
        ((C009707r) A0R()).setSupportActionBar(toolbar);
        AnonymousClass0R8 A0R = C86634Kw.A0R((C009707r) A0R());
        A0R.A0Q(false);
        A0R.A0N(true);
        toolbar.setNavigationOnClickListener(new C109365eV(this, 46));
        View A0g = C86664Kz.A0g(LayoutInflater.from(((C009707r) A0R()).getSupportActionBar().A02()), R.layout.f8nameremoved);
        View A022 = C06560Yg.A02(A0g, R.id.title_holder);
        A022.setClickable(true);
        C18290x4.A1F(A022, this, 47);
        this.A06 = AnonymousClass0x7.A0K(A022, R.id.contact_name);
        this.A05 = C18300x5.A0G(A022, R.id.date_time);
        if (C1001059l.A07) {
            AnonymousClass0Y9.A06(this.A06, R.style.f12nameremoved);
            AnonymousClass0Y9.A06(this.A05, R.style.f12nameremoved);
            int A042 = AnonymousClass0Y8.A04(A0G(), AnonymousClass57A.A00.A00);
            this.A06.setTextColor(A042);
            this.A05.setTextColor(A042);
        }
        this.A01 = C06560Yg.A02(A0g, R.id.progress_bar);
        A0R.A0O(true);
        A0R.A0G(A0g);
        this.A07 = (InsetsDrawingView) C06560Yg.A02(view, R.id.insets_view);
        this.A02 = C06560Yg.A02(view, R.id.title_protection);
        ViewGroup A0I3 = C86644Kx.A0I(view, R.id.pager_container);
        this.A04 = A0I3;
        A0I3.addView(this.A09);
        AnonymousClass001.A0Q(A0R()).setSystemUiVisibility(1792);
        View view2 = C86664Kz.A0y(this).A00;
        C626936e.A04(view2);
        AnonymousClass6B8.A00(view2, this, 7);
        View findViewById = view.findViewById(R.id.background);
        findViewById.setBackground(new ColorDrawable(-16777216));
        AnonymousClass1 r1 = new VerticalSwipeDismissBehavior(A0G()) {
            public void A0B(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
                boolean z;
                MediaViewBaseFragment mediaViewBaseFragment = this;
                if (mediaViewBaseFragment instanceof MediaViewFragment) {
                    z = ((MediaViewFragment) mediaViewBaseFragment).A1t;
                } else {
                    if (mediaViewBaseFragment instanceof LinkedAccountMediaViewFragment) {
                        z = ((LinkedAccountMediaViewFragment) mediaViewBaseFragment).A0H;
                    }
                    super.A0B(view, view2, coordinatorLayout, iArr, i, i2, i3);
                }
                if (z) {
                    return;
                }
                super.A0B(view, view2, coordinatorLayout, iArr, i, i2, i3);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
                if (r0 != false) goto L_0x0019;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean A0E(android.view.MotionEvent r3, android.view.View r4, androidx.coordinatorlayout.widget.CoordinatorLayout r5) {
                /*
                    r2 = this;
                    int r1 = r3.getPointerCount()
                    r0 = 1
                    if (r1 > r0) goto L_0x0019
                    com.whatsapp.mediaview.MediaViewBaseFragment r1 = r5
                    boolean r0 = r1.A1Y()
                    if (r0 != 0) goto L_0x0019
                    boolean r0 = r1 instanceof com.whatsapp.mediaview.MediaViewFragment
                    if (r0 == 0) goto L_0x0022
                    com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
                    boolean r0 = r1.A1t
                L_0x0017:
                    if (r0 == 0) goto L_0x002b
                L_0x0019:
                    X.0WM r0 = r2.A04
                    if (r0 == 0) goto L_0x0020
                    r0.A03()
                L_0x0020:
                    r0 = 0
                    return r0
                L_0x0022:
                    boolean r0 = r1 instanceof com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment
                    if (r0 == 0) goto L_0x002b
                    com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r1 = (com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment) r1
                    boolean r0 = r1.A0H
                    goto L_0x0017
                L_0x002b:
                    boolean r0 = super.A0E(r3, r4, r5)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewBaseFragment.AnonymousClass1.A0E(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
            }
        };
        r1.A01 = 0.5f;
        r1.A0A = true;
        r1.A05 = new C114305mp(findViewById, this);
        C86634Kw.A1C(this.A04, r1);
        onConfigurationChanged(C86604Kt.A0A(this));
        this.A0I = true;
    }

    public void A1G(Context context) {
        super.A1G(context);
        C111095hX.A08(C86654Ky.A0J(this));
    }

    public void A1N() {
        C185918uS r0 = (C185918uS) A0Q();
        if (r0 != null) {
            r0.BRO();
        }
        Bundle bundle = this.A00;
        if (bundle != null) {
            this.A0F = true;
            this.A0B.A0C(bundle);
            return;
        }
        A1O();
    }

    public void A1O() {
        C003203q A0Q = A0Q();
        if (A0Q != null && !A0Q.isFinishing()) {
            if (A0R() instanceof C185918uS) {
                ((C185918uS) A0R()).BWN();
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("mediaview/finish called from non-host activity: ");
            C18260x0.A1K(A0o, A0R().getLocalClassName());
            A0R().finish();
        }
    }

    public void A1P() {
        C89074bR r0;
        if (A0Q() != null && (r0 = this.A08) != null) {
            r0.A05();
        }
    }

    public boolean A1X() {
        C003203q A0Q = A0Q();
        if (!(A0Q instanceof C185918uS) || !((C185918uS) A0Q).Boc()) {
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Window A0J2 = C86654Ky.A0J(this);
        A0J2.setStatusBarColor(0);
        A0J2.setNavigationBarColor(0);
        if (C107385bE.A07()) {
            A0J2.setStatusBarContrastEnforced(false);
            A0J2.setNavigationBarContrastEnforced(false);
        }
        A0J2.addFlags(Integer.MIN_VALUE);
    }
}
