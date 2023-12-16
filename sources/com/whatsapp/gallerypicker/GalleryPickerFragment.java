package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R6;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass30B;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass55Y;
import X.AnonymousClass5B2;
import X.AnonymousClass5O9;
import X.AnonymousClass5Q0;
import X.AnonymousClass5UR;
import X.AnonymousClass5YI;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZR;
import X.AnonymousClass67O;
import X.AnonymousClass8WL;
import X.C003203q;
import X.C08310eF;
import X.C106995aW;
import X.C119735xS;
import X.C149497Mr;
import X.C154317cy;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C188678zJ;
import X.C53492nB;
import X.C54292oU;
import X.C58392vB;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87824Wg;
import X.C997357z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.SquareImageView;
import com.whatsapp.WaTextView;
import java.util.Iterator;
import java.util.Locale;

public final class GalleryPickerFragment extends Hilt_GalleryPickerFragment {
    public static final String A0Q;
    public static final C149497Mr[] A0R;
    public static final C149497Mr[] A0S;
    public int A00 = 1;
    public int A01;
    public int A02;
    public BroadcastReceiver A03;
    public ContentObserver A04;
    public Drawable A05;
    public View A06;
    public RecyclerView A07;
    public WaTextView A08;
    public AnonymousClass30B A09;
    public C106995aW A0A;
    public C620633i A0B;
    public C54292oU A0C;
    public AnonymousClass5ZR A0D;
    public C620733j A0E;
    public AnonymousClass1VX A0F;
    public AnonymousClass5Q0 A0G;
    public AnonymousClass55Y A0H;
    public C87824Wg A0I;
    public AnonymousClass5O9 A0J;
    public C53492nB A0K;
    public C58392vB A0L;
    public AnonymousClass4FS A0M;
    public boolean A0N;
    public boolean A0O;
    public final Handler A0P = AnonymousClass000.A0A();

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(Environment.getExternalStorageDirectory(), A0o);
        String A0X = AnonymousClass000.A0X("/DCIM/Camera", A0o);
        Locale locale = Locale.getDefault();
        C162457s7.A0D(locale);
        String valueOf = String.valueOf(C18320x8.A0g(locale, A0X).hashCode());
        A0Q = valueOf;
        A0R = new C149497Mr[]{new C149497Mr(4, 1, valueOf, R.string.f11nameremoved), new C149497Mr(5, 4, valueOf, R.string.f11nameremoved), new C149497Mr(6, 2, valueOf, R.string.f11nameremoved), new C149497Mr(0, 1, (String) null, R.string.f11nameremoved), new C149497Mr(1, 4, (String) null, R.string.f11nameremoved), new C149497Mr(2, 2, (String) null, R.string.f11nameremoved)};
        A0S = new C149497Mr[]{new C149497Mr(7, 7, valueOf, R.string.f11nameremoved), new C149497Mr(3, 7, (String) null, R.string.f11nameremoved), new C149497Mr(1, 4, (String) null, R.string.f11nameremoved)};
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        this.A00 = A0H().getInt("include");
        int A032 = AnonymousClass5Yj.A03(A0G(), A0G(), R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A01 = A032;
        this.A05 = new ColorDrawable(A032);
        this.A02 = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        RecyclerView A0w = C86664Kz.A0w(A0J(), R.id.albums);
        A0w.setClipToPadding(false);
        A0w.setPadding(0, AnonymousClass5YI.A04(view.getContext(), 2.0f), 0, 0);
        this.A07 = A0w;
        View inflate = C86664Kz.A0n(A0J(), R.id.noMediaViewStub).inflate();
        C162457s7.A0K(inflate, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        WaTextView waTextView = (WaTextView) inflate;
        this.A08 = waTextView;
        C18270x1.A0p(waTextView);
        this.A03 = new C188678zJ(this, 4);
        Handler handler = this.A0P;
        this.A04 = new AnonymousClass67O(handler, this, 1);
        C87824Wg r1 = new C87824Wg(this);
        this.A0I = r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.setAdapter(r1);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        C54292oU r0 = this.A0C;
        if (r0 != null) {
            Context context = r0.A00;
            C162457s7.A0D(context);
            BroadcastReceiver broadcastReceiver = this.A03;
            if (broadcastReceiver == null) {
                throw C18270x1.A0S("mediaStorageStateReceiver");
            }
            C154317cy.A01(broadcastReceiver, context, intentFilter, true);
            C620633i r02 = this.A0B;
            if (r02 != null) {
                AnonymousClass5UR A0R2 = r02.A0R();
                if (A0R2 != null) {
                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    ContentObserver contentObserver = this.A04;
                    if (contentObserver == null) {
                        throw C18270x1.A0S("mediaContentObserver");
                    }
                    C162457s7.A0J(uri, 0);
                    A0R2.A02().registerContentObserver(uri, true, contentObserver);
                }
                AnonymousClass30B r3 = this.A09;
                if (r3 != null) {
                    C620633i r2 = this.A0B;
                    if (r2 != null) {
                        this.A0K = new C53492nB(handler, r3, r2, "gallery-picker-fragment");
                        this.A0O = false;
                        this.A0N = false;
                        A1K();
                        AnonymousClass5Q0 r12 = this.A0G;
                        if (r12 != null) {
                            r12.A00(view, A0R());
                            return;
                        }
                        throw C18270x1.A0S("galleryPartialPermissionProvider");
                    }
                    throw C18270x1.A0S("systemServices");
                }
                throw C18270x1.A0S("caches");
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("waContext");
    }

    public final void A1K() {
        WindowManager windowManager;
        Display defaultDisplay;
        C626936e.A0D(AnonymousClass000.A1X(this.A0H), "galleryFoldersTask must be cancelled");
        AnonymousClass5ZR r0 = this.A0D;
        if (r0 == null) {
            throw C18270x1.A0S("waPermissionsHelper");
        } else if (r0.A04() == C997357z.DENIED) {
            A1J();
        } else {
            Point A072 = AnonymousClass4L0.A07();
            C003203q A0Q2 = A0Q();
            if (!(A0Q2 == null || (windowManager = A0Q2.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getSize(A072);
            }
            int i = A072.y * A072.x;
            int i2 = this.A02;
            int i3 = (i / (i2 * i2)) + 1;
            AnonymousClass1VX r6 = this.A0F;
            if (r6 != null) {
                C54292oU r4 = this.A0C;
                if (r4 != null) {
                    AnonymousClass5O9 r8 = this.A0J;
                    if (r8 != null) {
                        C620733j r5 = this.A0E;
                        if (r5 != null) {
                            C620633i r3 = this.A0B;
                            if (r3 != null) {
                                C106995aW r2 = this.A0A;
                                if (r2 != null) {
                                    C58392vB r9 = this.A0L;
                                    if (r9 != null) {
                                        AnonymousClass55Y r1 = new AnonymousClass55Y(r2, r3, r4, r5, r6, this, r8, r9, this.A00, i3);
                                        this.A0H = r1;
                                        AnonymousClass4FS r02 = this.A0M;
                                        if (r02 != null) {
                                            AnonymousClass0x7.A1B(r1, r02);
                                            return;
                                        }
                                        throw C18270x1.A0S("workers");
                                    }
                                    throw C18270x1.A0S("perfTimerFactory");
                                }
                                throw C18270x1.A0S("chatLockManager");
                            }
                            throw C18270x1.A0S("systemServices");
                        }
                        throw C18270x1.A0S("whatsAppLocale");
                    }
                    throw C18270x1.A0S("mediaManager");
                }
                throw C18270x1.A0S("waContext");
            }
            throw C18270x1.A0R();
        }
    }

    public final void A1J() {
        if (this.A06 == null) {
            ViewGroup A0J2 = C86644Kx.A0J(A0J(), R.id.root);
            C86634Kw.A0K(this).inflate(R.layout.f8nameremoved, A0J2);
            View findViewById = A0J2.findViewById(R.id.no_media);
            this.A06 = findViewById;
            if (findViewById != null) {
                AnonymousClass5B2.A00(findViewById, this, new AnonymousClass8WL(this));
            }
        }
        AnonymousClass0x2.A0x(this.A06);
        C18270x1.A0p(this.A08);
    }

    public void A0c() {
        ImageView imageView;
        super.A0c();
        C18290x4.A1L(this.A0H);
        this.A0H = null;
        C53492nB r0 = this.A0K;
        if (r0 != null) {
            r0.A00();
        }
        this.A0K = null;
        C54292oU r02 = this.A0C;
        if (r02 != null) {
            Context context = r02.A00;
            BroadcastReceiver broadcastReceiver = this.A03;
            if (broadcastReceiver == null) {
                throw C18270x1.A0S("mediaStorageStateReceiver");
            }
            context.unregisterReceiver(broadcastReceiver);
            C620633i r03 = this.A0B;
            if (r03 != null) {
                AnonymousClass5UR A0R2 = r03.A0R();
                if (A0R2 != null) {
                    ContentObserver contentObserver = this.A04;
                    if (contentObserver == null) {
                        throw C18270x1.A0S("mediaContentObserver");
                    }
                    A0R2.A02().unregisterContentObserver(contentObserver);
                }
                RecyclerView recyclerView = this.A07;
                if (recyclerView != null) {
                    Iterator A11 = C86634Kw.A11(recyclerView);
                    while (A11.hasNext()) {
                        View A0H2 = C86654Ky.A0H(A11);
                        if (A0H2 instanceof FrameLayout) {
                            ViewGroup viewGroup = (ViewGroup) A0H2;
                            C162457s7.A0J(viewGroup, 0);
                            Iterator A112 = C86634Kw.A11(viewGroup);
                            while (A112.hasNext()) {
                                View A0H3 = C86654Ky.A0H(A112);
                                if ((A0H3 instanceof SquareImageView) && (imageView = (ImageView) A0H3) != null) {
                                    imageView.setImageDrawable((Drawable) null);
                                }
                            }
                        }
                    }
                    this.A0I = null;
                    recyclerView.setAdapter((AnonymousClass0R6) null);
                    AnonymousClass30B r04 = this.A09;
                    if (r04 != null) {
                        r04.A02().A02.A07(-1);
                        return;
                    }
                    throw C18270x1.A0S("caches");
                }
                return;
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("waContext");
    }

    public void A0f() {
        super.A0f();
        AnonymousClass5Q0 r1 = this.A0G;
        if (r1 != null) {
            r1.A01(new C119735xS(this));
            return;
        }
        throw C18270x1.A0S("galleryPartialPermissionProvider");
    }

    public final void A1L(boolean z, boolean z2) {
        C003203q A0Q2 = A0Q();
        if (A0Q2 != null && !A0Q2.isFinishing()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("gallerypicker/");
            A0o.append(this.A00);
            A0o.append("/rebake unmounted:");
            A0o.append(z);
            A0o.append(" scanning:");
            A0o.append(z2);
            A0o.append(" oldunmounted:");
            A0o.append(this.A0O);
            A0o.append(" oldscanning:");
            C18260x0.A1V(A0o, this.A0N);
            if (z != this.A0O || z2 != this.A0N) {
                this.A0O = z;
                this.A0N = z2;
                C18290x4.A1L(this.A0H);
                this.A0H = null;
                if (!this.A0O) {
                    AnonymousClass5ZR r0 = this.A0D;
                    if (r0 == null) {
                        throw C18270x1.A0S("waPermissionsHelper");
                    } else if (r0.A04() != C997357z.DENIED) {
                        C18270x1.A0p(this.A08);
                        C18270x1.A0p(this.A06);
                        A1K();
                        return;
                    }
                }
                A1J();
            }
        }
    }
}
