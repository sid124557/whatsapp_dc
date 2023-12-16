package com.whatsapp.biz.catalog.view;

import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass0x9;
import X.AnonymousClass3ZH;
import X.AnonymousClass4CM;
import X.AnonymousClass4FS;
import X.AnonymousClass5YI;
import X.AnonymousClass5ZU;
import X.C06560Yg;
import X.C107335b8;
import X.C107555bV;
import X.C107575bX;
import X.C109665ez;
import X.C18270x1;
import X.C1898392v;
import X.C49712gy;
import X.C55502qS;
import X.C56422rx;
import X.C56972sr;
import X.C613330g;
import X.C620433g;
import X.C620733j;
import X.C64333Db;
import X.C64773Ex;
import X.C86614Ku;
import X.C86624Kv;
import X.C86644Kx;
import X.C86664Kz;
import X.C88864av;
import X.C990354e;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;

public class CatalogHeader extends AspectRatioFrameLayout implements AnonymousClass4CM {
    public ImageView A00;
    public TextView A01;
    public C56972sr A02;
    public TextEmojiLabel A03;
    public C49712gy A04;
    public C620433g A05;
    public C64773Ex A06;
    public C56422rx A07;
    public AnonymousClass5ZU A08;
    public C613330g A09;
    public C620733j A0A;
    public GetVNameCertificateJob A0B;
    public AnonymousClass4FS A0C;
    public boolean A0D;
    public boolean A0E;

    public void A01() {
        if (!this.A0D) {
            this.A0D = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A02 = C64333Db.A06(A002);
            this.A0C = C64333Db.A8y(A002);
            this.A04 = (C49712gy) A002.AaZ.get();
            this.A06 = C64333Db.A26(A002);
            this.A08 = C64333Db.A28(A002);
            this.A0A = C64333Db.A2t(A002);
            this.A07 = C86614Ku.A0T(A002);
            this.A05 = C86624Kv.A0K(A002);
            this.A09 = C86624Kv.A0P(A002);
        }
    }

    public void BU1() {
    }

    public void BU2() {
    }

    public float getAspectRatio() {
        return this.A00;
    }

    public void setOnTextClickListener(C109665ez r2) {
        TextView textView = this.A01;
        if (textView != null && !C86664Kz.A1V(textView)) {
            this.A01.setOnClickListener(r2);
        }
        TextEmojiLabel textEmojiLabel = this.A03;
        if (textEmojiLabel != null && !C86664Kz.A1V(textEmojiLabel)) {
            this.A03.setOnClickListener(r2);
        }
    }

    public CatalogHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A02(context, attributeSet);
    }

    public void setUp(UserJid userJid) {
        String str;
        this.A00 = AnonymousClass0x9.A0F(this, R.id.catalog_list_header_image);
        TextView A092 = AnonymousClass002.A09(this, R.id.catalog_list_header_business_name);
        this.A01 = A092;
        C06560Yg.A0T(A092, true);
        if (!this.A02.A0a(userJid)) {
            C107335b8.A0B(AnonymousClass0RP.A00(getContext(), R.drawable.chevron_right), -1);
            C107555bV.A0B(this.A01, this.A0A, R.drawable.chevron_right);
            TextView textView = this.A01;
            if (textView != null) {
                textView.setCompoundDrawablePadding(AnonymousClass5YI.A04(getContext(), 8.0f));
            }
        }
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.catalog_list_header_business_description);
        this.A03 = A0M;
        C06560Yg.A0T(A0M, true);
        C55502qS A012 = this.A07.A01(userJid);
        if (A012 == null) {
            if (this.A0B == null) {
                GetVNameCertificateJob getVNameCertificateJob = new GetVNameCertificateJob(userJid);
                this.A0B = getVNameCertificateJob;
                this.A04.A02(getVNameCertificateJob);
            }
            str = null;
        } else {
            str = A012.A08;
        }
        AnonymousClass3ZH A0A2 = this.A06.A0A(userJid);
        TextView textView2 = this.A01;
        if (textView2 != null) {
            if (C107575bX.A0F(str)) {
                str = this.A08.A0H(A0A2);
            }
            textView2.setText(str);
        }
        this.A05.A06(new C1898392v(userJid, 2, this), userJid);
        C18270x1.A0w(new C990354e(this, this.A09, A0A2), this.A0C);
    }

    public CatalogHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogHeader(Context context) {
        this(context, (AttributeSet) null);
    }
}
