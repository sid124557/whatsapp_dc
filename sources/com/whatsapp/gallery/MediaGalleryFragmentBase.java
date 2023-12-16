package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R6;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass1nF;
import X.AnonymousClass2z0;
import X.AnonymousClass30B;
import X.AnonymousClass4C1;
import X.AnonymousClass4FS;
import X.AnonymousClass55F;
import X.AnonymousClass5MG;
import X.AnonymousClass5O9;
import X.AnonymousClass5P1;
import X.AnonymousClass5Q0;
import X.AnonymousClass5ZR;
import X.AnonymousClass677;
import X.AnonymousClass6BE;
import X.AnonymousClass8GZ;
import X.AnonymousClass8WK;
import X.AnonymousClass8X1;
import X.C003203q;
import X.C105025Tg;
import X.C107105ah;
import X.C107275b2;
import X.C107295b4;
import X.C113975mI;
import X.C114205mf;
import X.C114225mh;
import X.C138136pp;
import X.C147347Dt;
import X.C147357Du;
import X.C162457s7;
import X.C171198Gd;
import X.C182348oG;
import X.C182468oS;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C186058ug;
import X.C186308v5;
import X.C188688zK;
import X.C30471mV;
import X.C48042eF;
import X.C53492nB;
import X.C54292oU;
import X.C55682qk;
import X.C58392vB;
import X.C620633i;
import X.C620733j;
import X.C69263Wi;
import X.C72173dI;
import X.C73723fy;
import X.C86644Kx;
import X.C89654ea;
import X.C95294tG;
import X.C991654r;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.scroller.RecyclerFastScroller;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public abstract class MediaGalleryFragmentBase extends Hilt_MediaGalleryFragmentBase {
    public int A00 = 10;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public View A06;
    public View A07;
    public View A08;
    public Toast A09;
    public AnonymousClass0R6 A0A;
    public C69263Wi A0B;
    public StickyHeadersRecyclerView A0C;
    public AnonymousClass30B A0D;
    public C620633i A0E;
    public C54292oU A0F;
    public AnonymousClass5ZR A0G;
    public C182348oG A0H;
    public C620733j A0I;
    public AnonymousClass1VX A0J;
    public C138136pp A0K;
    public C186308v5 A0L;
    public C991654r A0M;
    public AnonymousClass55F A0N;
    public AnonymousClass5Q0 A0O;
    public AnonymousClass5O9 A0P;
    public C53492nB A0Q;
    public RecyclerFastScroller A0R;
    public C113975mI A0S;
    public C72173dI A0T;
    public C72173dI A0U;
    public AnonymousClass4FS A0V;
    public AnonymousClass4C1 A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final ContentObserver A0a;
    public final Handler A0b;
    public final C147357Du A0c = new C147357Du(this);
    public final List A0d = AnonymousClass001.A0s();

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        bundle.putInt("sort_type", this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ff, code lost:
        if (r2 == 1) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(android.os.Bundle r6, android.view.View r7) {
        /*
            r5 = this;
            r4 = 0
            X.C162457s7.A0J(r7, r4)
            X.4FS r1 = r5.A0V
            if (r1 == 0) goto L_0x0157
            X.3dI r0 = new X.3dI
            r0.<init>(r1, r4)
            r5.A0U = r0
            X.4FS r1 = r5.A0V
            if (r1 == 0) goto L_0x0150
            X.3dI r0 = new X.3dI
            r0.<init>(r1, r4)
            r5.A0T = r0
            if (r6 == 0) goto L_0x012e
            java.lang.String r0 = "sort_type"
            int r0 = r6.getInt(r0, r4)
        L_0x0022:
            r5.A03 = r0
            int r1 = r5.A02
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r5.A05 = r0
            android.content.Context r3 = r5.A0G()
            android.content.Context r2 = r5.A1D()
            r1 = 2130969697(0x7f040461, float:1.7548083E38)
            r0 = 2131101118(0x7f0605be, float:1.7814637E38)
            int r0 = X.AnonymousClass5Yj.A03(r2, r3, r1, r0)
            r5.A02 = r0
            android.content.res.Resources r1 = X.C08310eF.A09(r5)
            r0 = 2131166628(0x7f0705a4, float:1.7947507E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A04 = r0
            boolean r0 = r5 instanceof com.whatsapp.storage.StorageUsageMediaGalleryFragment
            r5.A0Y = r0
            r0 = 2131431841(0x7f0b11a1, float:1.8485423E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A06 = r0
            r0 = 2131430294(0x7f0b0b96, float:1.8482285E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A07 = r0
            r0 = 2131431843(0x7f0b11a3, float:1.8485427E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A08 = r0
            r0 = 2131430438(0x7f0b0c26, float:1.8482577E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.StickyHeadersRecyclerView r0 = (com.whatsapp.StickyHeadersRecyclerView) r0
            r5.A0C = r0
            X.1VX r0 = r5.A1L()
            X.4XI r1 = new X.4XI
            r1.<init>(r0, r5, r5)
            r0 = 1
            r1.A0E(r0)
            r5.A0A = r1
            com.whatsapp.StickyHeadersRecyclerView r0 = r5.A0C
            if (r0 == 0) goto L_0x008e
            r0.setAdapter(r1)
        L_0x008e:
            r0 = 2131433260(0x7f0b172c, float:1.84883E38)
            android.view.View r1 = X.C06560Yg.A02(r7, r0)
            com.whatsapp.scroller.RecyclerFastScroller r1 = (com.whatsapp.scroller.RecyclerFastScroller) r1
            X.33j r0 = r5.A1K()
            boolean r0 = X.C102805Ki.A00(r0)
            r1.A0C = r0
            com.whatsapp.StickyHeadersRecyclerView r0 = r5.A0C
            r1.setRecyclerView(r0)
            r5.A0R = r1
            android.content.Context r0 = r5.A1D()
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r0)
            X.33j r2 = r5.A1K()
            android.content.Context r1 = r5.A0G()
            r0 = 2131231573(0x7f080355, float:1.807923E38)
            X.C18270x1.A0d(r1, r3, r2, r0)
            com.whatsapp.scroller.RecyclerFastScroller r0 = r5.A0R
            if (r0 == 0) goto L_0x00c6
            r0.setThumbView(r3)
        L_0x00c6:
            android.view.LayoutInflater r2 = X.C86634Kw.A0K(r5)
            r1 = 2131625389(0x7f0e05ad, float:1.8877985E38)
            com.whatsapp.StickyHeadersRecyclerView r0 = r5.A0C
            android.view.View r4 = r2.inflate(r1, r0, r4)
            r0 = 2131430091(0x7f0b0acb, float:1.8481873E38)
            com.whatsapp.WaTextView r3 = X.C86644Kx.A0O(r4, r0)
            X.C106905aM.A04(r3)
            r1 = 14
            X.934 r0 = new X.934
            r0.<init>(r5, r1)
            X.3dY r2 = X.C72333dY.A06(r0)
            com.whatsapp.scroller.RecyclerFastScroller r1 = r5.A0R
            if (r1 == 0) goto L_0x00f4
            X.5oo r0 = new X.5oo
            r0.<init>(r3, r5, r2)
            r1.setBubbleView(r4, r0)
        L_0x00f4:
            com.whatsapp.scroller.RecyclerFastScroller r3 = r5.A0R
            if (r3 == 0) goto L_0x0105
            int r2 = r5.A03
            if (r2 == 0) goto L_0x0101
            r1 = 1
            r0 = 8
            if (r2 != r1) goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            r3.setVisibility(r0)
        L_0x0105:
            X.30B r4 = r5.A0D
            if (r4 == 0) goto L_0x0149
            X.33i r3 = r5.A0E
            if (r3 == 0) goto L_0x0142
            android.os.Handler r2 = X.AnonymousClass000.A0A()
            java.lang.String r1 = "media-gallery-fragment"
            X.2nB r0 = new X.2nB
            r0.<init>(r2, r4, r3, r1)
            r5.A0Q = r0
            X.5Q0 r1 = r5.A0O
            if (r1 == 0) goto L_0x013b
            X.03q r0 = r5.A0R()
            r1.A00(r7, r0)
            X.8WJ r0 = new X.8WJ
            r0.<init>(r5)
            X.AnonymousClass5B2.A00(r7, r5, r0)
            return
        L_0x012e:
            android.os.Bundle r1 = r5.A06
            r0 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "sort_type"
            int r0 = r1.getInt(r0, r4)
            goto L_0x0022
        L_0x013b:
            java.lang.String r0 = "galleryPartialPermissionProvider"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0142:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0149:
            java.lang.String r0 = "caches"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0150:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0157:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryFragmentBase.A0w(android.os.Bundle, android.view.View):void");
    }

    public abstract boolean A1X(C186058ug r1, C95294tG r2);

    public void A0a() {
        Log.i("MediaGalleryFragmentBase/destroy");
        super.A0a();
        Toast toast = this.A09;
        if (toast != null) {
            toast.cancel();
        }
        this.A09 = null;
        A1N();
        this.A0X = false;
        C53492nB r0 = this.A0Q;
        if (r0 != null) {
            r0.A00();
        }
        this.A0Q = null;
        C186308v5 r1 = this.A0L;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0a);
        }
        C186308v5 r02 = this.A0L;
        if (r02 != null) {
            r02.close();
        }
        this.A0L = null;
        this.A0A = null;
        this.A01 = 0;
    }

    public final C69263Wi A1J() {
        C69263Wi r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C620733j A1K() {
        C620733j r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final AnonymousClass1VX A1L() {
        AnonymousClass1VX r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public C182468oS A1M() {
        if (this instanceof StorageUsageMediaGalleryFragment) {
            return new AnonymousClass6BE(this, 1);
        }
        if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            C003203q A0Q2 = mediaPickerFragment.A0Q();
            if (A0Q2 == null) {
                return null;
            }
            Uri data = A0Q2.getIntent().getData();
            AnonymousClass1VX A1L = mediaPickerFragment.A1L();
            AnonymousClass5O9 r5 = mediaPickerFragment.A0P;
            if (r5 != null) {
                C620633i r3 = mediaPickerFragment.A0E;
                if (r3 != null) {
                    C58392vB r6 = mediaPickerFragment.A0C;
                    if (r6 != null) {
                        return new C114225mh(data, r3, A1L, r5, r6, mediaPickerFragment.A00, mediaPickerFragment.A0F);
                    }
                    throw C18270x1.A0S("perfTimerFactory");
                }
                throw C18270x1.A0S("systemServices");
            }
            throw C18270x1.A0S("mediaManager");
        } else if (this instanceof MediaGalleryFragment) {
            return new AnonymousClass6BE(this, 0);
        } else {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) this;
            Bundle bundle = galleryRecentsFragment.A06;
            if (bundle == null || bundle.getInt("include", 7) == 7) {
                AnonymousClass5O9 r1 = galleryRecentsFragment.A0P;
                if (r1 != null) {
                    return new C171198Gd(r1, galleryRecentsFragment.A07);
                }
                throw C18270x1.A0S("mediaManager");
            }
            AnonymousClass1VX A1L2 = galleryRecentsFragment.A1L();
            AnonymousClass5O9 r7 = galleryRecentsFragment.A0P;
            if (r7 != null) {
                C620633i r52 = galleryRecentsFragment.A0E;
                if (r52 != null) {
                    C58392vB r8 = galleryRecentsFragment.A05;
                    if (r8 != null) {
                        Bundle bundle2 = galleryRecentsFragment.A06;
                        int i = 7;
                        if (bundle2 != null) {
                            i = bundle2.getInt("include", 7);
                        }
                        return new C114225mh((Uri) null, r52, A1L2, r7, r8, i, false);
                    }
                    throw C18270x1.A0S("perfTimerFactory");
                }
                throw C18270x1.A0S("systemServices");
            }
            throw C18270x1.A0S("mediaManager");
        }
    }

    public final void A1N() {
        C72173dI r0 = this.A0U;
        if (r0 != null) {
            r0.A02();
        }
        C72173dI r02 = this.A0T;
        if (r02 != null) {
            r02.A02();
        }
        boolean A1a = C86644Kx.A1a(this.A0M);
        this.A0M = null;
        AnonymousClass55F r03 = this.A0N;
        if (r03 != null) {
            r03.A0D(A1a);
        }
        this.A0N = null;
        C138136pp r04 = this.A0K;
        if (r04 != null) {
            r04.A0D(A1a);
        }
        this.A0K = null;
    }

    public final void A1O() {
        C186308v5 r2 = this.A0L;
        if (r2 != null && this.A0Y) {
            C18290x4.A1L(this.A0K);
            this.A0K = new C138136pp(this, r2, new AnonymousClass8X1(r2, this));
            this.A0X = false;
            A1P();
            C138136pp r1 = this.A0K;
            if (r1 != null) {
                AnonymousClass4FS r0 = this.A0V;
                if (r0 != null) {
                    AnonymousClass0x7.A1B(r1, r0);
                    return;
                }
                throw C18270x1.A0S("waWorkers");
            }
        }
    }

    public final void A1P() {
        AnonymousClass0R6 r0 = this.A0A;
        if (r0 != null) {
            r0.A05();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1.getCount() <= 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1Q() {
        /*
            r6 = this;
            X.8v5 r1 = r6.A0L
            if (r1 == 0) goto L_0x0051
            X.5ZR r0 = r6.A0G
            if (r0 == 0) goto L_0x007e
            X.57z r0 = r0.A04()
            X.57z r5 = X.C997357z.DENIED
            r3 = 0
            if (r0 == r5) goto L_0x0018
            int r0 = r1.getCount()
            r4 = 1
            if (r0 > 0) goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            android.view.View r2 = r6.A06
            r1 = 8
            if (r2 == 0) goto L_0x0028
            r0 = r4 ^ 1
            int r0 = X.AnonymousClass001.A08(r0)
            r2.setVisibility(r0)
        L_0x0028:
            if (r4 == 0) goto L_0x0052
            android.view.View r0 = r6.A07
            if (r0 == 0) goto L_0x0031
            r0.setVisibility(r1)
        L_0x0031:
            android.view.View r0 = r6.A08
            if (r0 == 0) goto L_0x0038
            r0.setVisibility(r1)
        L_0x0038:
            com.whatsapp.StickyHeadersRecyclerView r0 = r6.A0C
            if (r0 == 0) goto L_0x0043
            if (r4 != 0) goto L_0x0040
            r3 = 8
        L_0x0040:
            r0.setVisibility(r3)
        L_0x0043:
            android.view.View r0 = r6.A07
            if (r0 == 0) goto L_0x004a
            r0.requestLayout()
        L_0x004a:
            android.view.View r0 = r6.A08
            if (r0 == 0) goto L_0x0051
            r0.requestLayout()
        L_0x0051:
            return
        L_0x0052:
            X.5ZR r0 = r6.A0G
            if (r0 == 0) goto L_0x0077
            X.57z r0 = r0.A04()
            boolean r2 = X.AnonymousClass000.A1Y(r0, r5)
            android.view.View r1 = r6.A07
            if (r1 == 0) goto L_0x0069
            int r0 = X.C86614Ku.A09(r2)
            r1.setVisibility(r0)
        L_0x0069:
            android.view.View r1 = r6.A08
            if (r1 == 0) goto L_0x0038
            r0 = r2 ^ 1
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            goto L_0x0038
        L_0x0077:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x007e:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryFragmentBase.A1Q():void");
    }

    public void A1S(C186058ug r14, C95294tG r15) {
        if (this instanceof StorageUsageMediaGalleryFragment) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
            C30471mV r9 = ((AnonymousClass8GZ) r14).A03;
            if (storageUsageMediaGalleryFragment.A1V()) {
                r15.setChecked(((AnonymousClass677) storageUsageMediaGalleryFragment.A0R()).Bqw(r9));
                storageUsageMediaGalleryFragment.A1P();
            } else if (r14.getType() != 4) {
                AnonymousClass5P1 r1 = new AnonymousClass5P1(storageUsageMediaGalleryFragment.A0R());
                r1.A07 = true;
                AnonymousClass2z0 r4 = r9.A1J;
                r1.A05 = r4.A00;
                r1.A06 = r4;
                r1.A03 = 2;
                r1.A01 = 2;
                Intent A012 = r1.A01();
                C107275b2.A08(storageUsageMediaGalleryFragment.A0R(), A012, r15);
                AnonymousClass5MG.A02(storageUsageMediaGalleryFragment.A0R(), storageUsageMediaGalleryFragment.A0G(), A012, r15, r4);
            } else if (r9 instanceof AnonymousClass1nF) {
                C105025Tg r10 = storageUsageMediaGalleryFragment.A09;
                C69263Wi r7 = storageUsageMediaGalleryFragment.A0B;
                C55682qk r5 = storageUsageMediaGalleryFragment.A02;
                AnonymousClass4FS r12 = storageUsageMediaGalleryFragment.A0V;
                C48042eF r8 = storageUsageMediaGalleryFragment.A06;
                C107105ah.A02(storageUsageMediaGalleryFragment.A01, r5, (C89654ea) storageUsageMediaGalleryFragment.A0Q(), r7, r8, (AnonymousClass1nF) r9, r10, storageUsageMediaGalleryFragment.A0B, r12);
            }
        } else if (this instanceof MediaPickerFragment) {
            ((MediaPickerFragment) this).A1a(r14);
        } else {
            MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this;
            C30471mV r2 = ((AnonymousClass8GZ) r14).A03;
            if (r2 == null) {
                return;
            }
            if (mediaGalleryFragment.A1V()) {
                r15.setChecked(((AnonymousClass677) mediaGalleryFragment.A0Q()).Bqw(r2));
                return;
            }
            AnonymousClass5P1 r13 = new AnonymousClass5P1(mediaGalleryFragment.A0R());
            r13.A07 = true;
            r13.A05 = mediaGalleryFragment.A03;
            AnonymousClass2z0 r3 = r2.A1J;
            r13.A06 = r3;
            r13.A03 = 2;
            r13.A00 = 34;
            Intent A013 = r13.A01();
            C107275b2.A08(mediaGalleryFragment.A0R(), A013, r15);
            AnonymousClass5MG.A02(mediaGalleryFragment.A0R(), mediaGalleryFragment.A0G(), A013, r15, r3);
        }
    }

    public final void A1U(boolean z) {
        View findViewById;
        View view = this.A0B;
        if (view != null && (findViewById = view.findViewById(R.id.progress_bar)) != null) {
            findViewById.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
    }

    public boolean A1V() {
        C003203q A0Q2;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            A0Q2 = A0R();
        } else if (this instanceof MediaPickerFragment) {
            return AnonymousClass000.A1W(((MediaPickerFragment) this).A05);
        } else {
            if (this instanceof MediaGalleryFragment) {
                A0Q2 = A0Q();
            } else {
                GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) this;
                if (galleryRecentsFragment.A06 || (!galleryRecentsFragment.A08.isEmpty())) {
                    return true;
                }
                return false;
            }
        }
        return ((AnonymousClass677) A0Q2).BFW();
    }

    public boolean A1W(int i) {
        C186058ug B9S;
        AnonymousClass8GZ A012;
        C30471mV r1;
        C186058ug r0;
        Uri uri;
        C30471mV r12;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            C186308v5 r02 = this.A0L;
            if (r02 == null) {
                return false;
            }
            C186058ug B9S2 = r02.B9S(i);
            if (!(B9S2 instanceof AnonymousClass8GZ) || (r12 = ((AnonymousClass8GZ) B9S2).A03) == null || !((AnonymousClass677) A0R()).BIB(r12)) {
                return false;
            }
            return true;
        } else if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            if (mediaPickerFragment instanceof NewMediaPickerFragment) {
                NewMediaPickerFragment newMediaPickerFragment = (NewMediaPickerFragment) mediaPickerFragment;
                C186308v5 r03 = newMediaPickerFragment.A0L;
                if (r03 != null) {
                    return C73723fy.A0U(newMediaPickerFragment.A05, r03.B9S(i));
                }
                return false;
            }
            C186308v5 r04 = mediaPickerFragment.A0L;
            if (r04 != null) {
                r0 = r04.B9S(i);
            } else {
                r0 = null;
            }
            HashSet hashSet = mediaPickerFragment.A0L;
            if (r0 != null) {
                uri = r0.B3d();
            } else {
                uri = null;
            }
            return C73723fy.A0U(hashSet, uri);
        } else if (this instanceof MediaGalleryFragment) {
            C114205mf r05 = (C114205mf) this.A0L;
            if (r05 == null || (A012 = r05.B9S(i)) == null || (r1 = A012.A03) == null) {
                return false;
            }
            return ((AnonymousClass677) A0Q()).BIB(r1);
        } else {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) this;
            C186308v5 r06 = galleryRecentsFragment.A0L;
            if (r06 == null || (B9S = r06.B9S(i)) == null) {
                return false;
            }
            Map map = galleryRecentsFragment.A08;
            Uri B3d = B9S.B3d();
            C162457s7.A0D(B3d);
            return map.containsKey(B3d);
        }
    }

    public MediaGalleryFragmentBase() {
        Handler A0A2 = AnonymousClass000.A0A();
        this.A0b = A0A2;
        this.A0a = new C188688zK(A0A2, this);
    }

    public void A0f() {
        super.A0f();
        A1Q();
        AnonymousClass5Q0 r1 = this.A0O;
        if (r1 != null) {
            r1.A01(new AnonymousClass8WK(this));
            return;
        }
        throw C18270x1.A0S("galleryPartialPermissionProvider");
    }

    public final void A1R(int i) {
        C003203q A0Q2 = A0Q();
        if (A0Q2 != null) {
            C620633i r5 = this.A0E;
            if (r5 != null) {
                Object[] A0L2 = AnonymousClass002.A0L();
                C18270x1.A1Q(A0L2, i);
                C107295b4.A00(A0Q2, r5, A1K().A0L(A0L2, R.plurals.f9nameremoved, (long) i));
                return;
            }
            throw C18270x1.A0S("systemServices");
        }
    }

    public final void A1T(boolean z) {
        boolean z2 = z;
        C18260x0.A1E("MediaGalleryFragmentBase/rebake unmounted:", AnonymousClass001.A0o(), z);
        A1N();
        C186308v5 r1 = this.A0L;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0a);
        }
        C186308v5 r0 = this.A0L;
        if (r0 != null) {
            r0.close();
        }
        this.A0L = null;
        A1U(true);
        this.A01 = 0;
        A1P();
        this.A0d.clear();
        C182468oS A1M = A1M();
        if (A1M != null) {
            C991654r r12 = new C991654r(A0V(), A1L(), new C147347Dt(this), A1M, z2);
            this.A0M = r12;
            AnonymousClass4FS r02 = this.A0V;
            if (r02 != null) {
                AnonymousClass0x7.A1B(r12, r02);
                return;
            }
            throw C18270x1.A0S("waWorkers");
        }
    }
}
