package com.whatsapp.biz.catalog.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass2PX;
import X.AnonymousClass2XQ;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4GJ;
import X.AnonymousClass52i;
import X.AnonymousClass5T7;
import X.AnonymousClass5Y9;
import X.AnonymousClass7SU;
import X.AnonymousClass7SV;
import X.C06560Yg;
import X.C100905Cs;
import X.C105035Th;
import X.C105405Uu;
import X.C107315b6;
import X.C107695bk;
import X.C108985dt;
import X.C109015dw;
import X.C111095hX;
import X.C111705iY;
import X.C111965iy;
import X.C111975iz;
import X.C116855qy;
import X.C116985rC;
import X.C123876Ac;
import X.C149947On;
import X.C151257Ua;
import X.C152967aS;
import X.C179058iX;
import X.C18280x3;
import X.C186278v2;
import X.C29211iS;
import X.C50482iF;
import X.C56972sr;
import X.C615931l;
import X.C620433g;
import X.C626936e;
import X.C69263Wi;
import X.C85244Fm;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class CatalogMediaCard extends FrameLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public C151257Ua A02;
    public C152967aS A03;
    public C179058iX A04;
    public C111705iY A05;
    public C186278v2 A06;
    public UserJid A07;
    public AnonymousClass7SV A08;
    public AnonymousClass52i A09;
    public C116855qy A0A;
    public Boolean A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;

    public void A03(List list) {
        int i = 5;
        if (this.A0B.booleanValue() && (i = list.size()) > 3) {
            int i2 = i;
            i = 6;
            if (i2 < 6) {
                i = 3;
            }
        }
        this.A09.A09(list, i);
    }

    public void A01() {
        this.A03.A00();
        C111705iY r4 = this.A05;
        C186278v2[] r2 = {r4.A01, r4.A00};
        int i = 0;
        do {
            C186278v2 r0 = r2[i];
            if (r0 != null) {
                r0.cleanup();
            }
            i++;
        } while (i < 2);
        r4.A00 = null;
        r4.A01 = null;
    }

    public void A02(C108985dt r34, UserJid userJid, String str, boolean z, boolean z2) {
        C186278v2 r13;
        UserJid userJid2 = userJid;
        this.A07 = userJid2;
        boolean z3 = z2;
        this.A0E = z3;
        String str2 = str;
        this.A0C = str2;
        C111705iY r9 = this.A05;
        C105035Th r8 = r9.A07;
        C108985dt r12 = r34;
        if (r8.A02(r12)) {
            C111965iy r132 = r9.A01;
            if (r132 == null) {
                AnonymousClass4FV r4 = r9.A0H;
                C85244Fm r14 = r9.A05;
                C50482iF r3 = r9.A0E;
                r132 = new C111965iy(r14, r8, r9.A0B, r3, this, r9.A0F, r4, r9.A0K);
                r9.A01 = r132;
            }
            C626936e.A06(r12);
            r132.A00 = r12;
            r13 = r9.A01;
        } else {
            C111975iz r133 = r9.A00;
            C111975iz r134 = r133;
            if (r133 == null) {
                C69263Wi r19 = r9.A04;
                C56972sr r20 = r9.A06;
                C111095hX r18 = r9.A03;
                AnonymousClass4FS r16 = r9.A0J;
                C116985rC r15 = r9.A02;
                AnonymousClass5Y9 r7 = r9.A0D;
                AnonymousClass2PX r6 = r9.A0F;
                C105405Uu r5 = r9.A0C;
                C620433g r42 = r9.A08;
                C29211iS r32 = r9.A0A;
                AnonymousClass7SU r2 = r9.A0I;
                boolean z4 = z3;
                C105035Th r21 = r8;
                C620433g r22 = r42;
                AnonymousClass5T7 r23 = r9.A09;
                C29211iS r24 = r32;
                C105405Uu r25 = r5;
                C116985rC r17 = r15;
                C111975iz r162 = new C111975iz(r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, this, r6, r9.A0G, r2, r16, z4);
                r9.A00 = r162;
                r134 = r162;
            }
            r134.A01 = str2;
            r134.A00 = r12;
            r13 = r134;
        }
        this.A06 = r13;
        if (z && r13.BFE(userJid2)) {
            this.A06.BTJ(userJid2);
        } else if (this.A06.BoI()) {
            setVisibility(8);
        } else {
            this.A06.BG7(userJid2);
            this.A06.Awi();
            this.A06.B38(userJid2, this.A01);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public C179058iX getCatalogPreviewItemClickListener() {
        return this.A04;
    }

    public String getMediaCardViewErrorText() {
        return this.A09.getError();
    }

    public C186278v2 getMediaCardViewPresenter() {
        return this.A06;
    }

    public void setError(int i) {
        this.A09.setError(C86624Kv.A0b(this, i));
    }

    public void setupThumbnails(UserJid userJid, int i, List list) {
        C186278v2 r1 = this.A06;
        UserJid userJid2 = this.A07;
        C626936e.A06(userJid2);
        int BBk = r1.BBk(userJid2);
        if (BBk != this.A00) {
            A03(A00(userJid, C86624Kv.A0b(this, i), list, this.A0E));
            this.A00 = BBk;
        }
    }

    public CatalogMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0D) {
            this.A0D = true;
            C107695bk r2 = C88864av.A00(generatedComponent()).A00;
            this.A02 = (C151257Ua) r2.A2I.get();
            C111705iY r0 = (C111705iY) ((AnonymousClass2XQ) r2.ACP.AP3.get()).A00(C111705iY.class);
            C615931l.A00(r0);
            this.A05 = r0;
            this.A08 = (AnonymousClass7SV) r2.A2J.get();
        }
        this.A0B = Boolean.FALSE;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A04);
            this.A0B = Boolean.valueOf(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
        AnonymousClass52i r02 = (AnonymousClass52i) C06560Yg.A02(C86664Kz.A0h(C18280x3.A0D(this), this, this.A0B.booleanValue() ? R.layout.f8nameremoved : R.layout.f8nameremoved), R.id.product_catalog_media_card_view);
        this.A09 = r02;
        r02.setTopShadowVisibility(0);
        C86634Kw.A1B(this, this.A09, getPaddingLeft(), getPaddingTop(), getPaddingRight());
        this.A03 = new C152967aS(this.A02, this.A08);
        int thumbnailPixelSize = this.A09.getThumbnailPixelSize();
        this.A01 = thumbnailPixelSize;
        this.A02.A01 = thumbnailPixelSize;
    }

    public List A00(UserJid userJid, String str, List list, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list2 = list;
            if (i >= list2.size() || i2 >= 6) {
                return A0s;
            }
            C109015dw r6 = (C109015dw) list2.get(i);
            if (r6.A01() && !r6.A0F.equals(this.A0C)) {
                i2++;
                A0s.add(new C149947On((Drawable) null, this.A06.BDe(r6, userJid, z), new C123876Ac(r6, 0, this), (String) null, str, C107315b6.A06(AnonymousClass000.A0Y("_", AnonymousClass000.A0l(r6.A0F), 0))));
            }
            i++;
        }
        return A0s;
    }

    public void setCatalogPreviewItemClickListener(C179058iX r1) {
        this.A04 = r1;
    }

    public CatalogMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }
}
