package com.whatsapp.gallery;

import X.AnonymousClass001;
import X.AnonymousClass0QU;
import X.AnonymousClass0YZ;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass4FW;
import X.AnonymousClass4X2;
import X.AnonymousClass55P;
import X.AnonymousClass55X;
import X.AnonymousClass5ZR;
import X.AnonymousClass665;
import X.C003203q;
import X.C106405Yw;
import X.C124166Bf;
import X.C18270x1;
import X.C28761hj;
import X.C29431io;
import X.C55832qz;
import X.C56532s8;
import X.C56612sH;
import X.C620733j;
import X.C626936e;
import X.C66543Lv;
import X.C86664Kz;
import X.C86684Lb;
import X.C95814uZ;
import X.C997357z;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;

public abstract class GalleryFragmentBase extends Hilt_GalleryFragmentBase implements AnonymousClass665 {
    public int A00 = -1;
    public View A01;
    public RecyclerView A02;
    public C56612sH A03;
    public AnonymousClass5ZR A04;
    public C620733j A05;
    public C66543Lv A06;
    public C29431io A07;
    public C28761hj A08;
    public AnonymousClass1VX A09;
    public AnonymousClass4X2 A0A;
    public AnonymousClass55P A0B;
    public AnonymousClass55X A0C;
    public C95814uZ A0D;
    public C56532s8 A0E;
    public C55832qz A0F;
    public AnonymousClass4FS A0G;
    public String A0H = "";
    public final AnonymousClass4FW A0I = new C124166Bf(this, 12);
    public final String A0J;
    public final ArrayList A0K = AnonymousClass001.A0s();

    public void A0o(Bundle bundle) {
        this.A0X = true;
        C95814uZ A002 = C106405Yw.A00(A0R());
        C626936e.A06(A002);
        this.A0D = A002;
        View A0J2 = A0J();
        this.A01 = A0J2.findViewById(16908292);
        RecyclerView A0w = C86664Kz.A0w(A0J2, R.id.grid);
        this.A02 = A0w;
        AnonymousClass0YZ.A0G(A0w, true);
        AnonymousClass0YZ.A0G(this.A0B.findViewById(16908292), true);
        C003203q A0Q = A0Q();
        if (A0Q instanceof MediaGalleryActivity) {
            this.A02.A0q(((MediaGalleryActivity) A0Q).A0m);
        }
        this.A07.A06(this.A0I);
        View view = this.A0B;
        if (view != null) {
            view.findViewById(R.id.progress_bar).setVisibility(0);
        }
        A1K();
    }

    public Cursor A1J(AnonymousClass0QU r5, C95814uZ r6, C56532s8 r7) {
        if (this instanceof LinksGalleryFragment) {
            return ((LinksGalleryFragment) this).A07.B9f(r5, r6, r7);
        }
        DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) this;
        return new C86684Lb(documentsGalleryFragment.A04.B9f(r5, r6, r7), (AnonymousClass1VX) null, r6, documentsGalleryFragment.A0F);
    }

    public final void A1K() {
        AnonymousClass55P r1 = this.A0B;
        if (r1 != null) {
            r1.A0D(true);
            synchronized (r1) {
                AnonymousClass0QU r0 = r1.A00;
                if (r0 != null) {
                    r0.A01();
                }
            }
        }
        AnonymousClass55X r02 = this.A0C;
        if (r02 != null) {
            r02.A0G();
        }
        AnonymousClass55P r12 = new AnonymousClass55P(this, this.A0D, this.A0E);
        this.A0B = r12;
        C18270x1.A0w(r12, this.A0G);
    }

    public final void A1L() {
        if (this.A00 == -1) {
            return;
        }
        if (this.A04.A04() == C997357z.DENIED || this.A00 <= 0) {
            this.A01.setVisibility(0);
            this.A02.setVisibility(8);
            return;
        }
        this.A01.setVisibility(8);
        this.A02.setVisibility(0);
    }

    public void Bay(C56532s8 r3) {
        if (!TextUtils.equals(this.A0H, r3.A02())) {
            this.A0H = r3.A02();
            this.A0E = r3;
            A1K();
        }
    }

    public void BbA() {
        this.A0A.A05();
    }

    public GalleryFragmentBase(String str) {
        this.A0J = str;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0a() {
        super.A0a();
        this.A07.A07(this.A0I);
        Cursor A0K2 = this.A0A.A0K((Cursor) null);
        if (A0K2 != null) {
            A0K2.close();
        }
        AnonymousClass55X r0 = this.A0C;
        if (r0 != null) {
            r0.A0G();
            this.A0C = null;
        }
        AnonymousClass55P r1 = this.A0B;
        if (r1 != null) {
            r1.A0D(true);
            synchronized (r1) {
                AnonymousClass0QU r02 = r1.A00;
                if (r02 != null) {
                    r02.A01();
                }
            }
            this.A0B = null;
        }
    }

    public void A0f() {
        super.A0f();
        A1L();
    }

    public void A1G(Context context) {
        super.A1G(context);
        this.A0E = new C56532s8(this.A05);
    }
}
