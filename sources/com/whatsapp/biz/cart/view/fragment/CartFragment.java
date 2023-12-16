package com.whatsapp.biz.cart.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2V3;
import X.AnonymousClass30V;
import X.AnonymousClass31C;
import X.AnonymousClass33p;
import X.AnonymousClass3ZH;
import X.AnonymousClass4CE;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4SQ;
import X.AnonymousClass4V6;
import X.AnonymousClass4XK;
import X.AnonymousClass5IY;
import X.AnonymousClass5TF;
import X.AnonymousClass5UW;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass681;
import X.AnonymousClass7C3;
import X.AnonymousClass7C8;
import X.AnonymousClass7CH;
import X.AnonymousClass7SU;
import X.AnonymousClass7SV;
import X.C003203q;
import X.C06560Yg;
import X.C08310eF;
import X.C104095Pq;
import X.C104705Sa;
import X.C105145Tt;
import X.C105255Ue;
import X.C105405Uu;
import X.C105895Wv;
import X.C105915Wx;
import X.C106665Zw;
import X.C108635dJ;
import X.C108745dU;
import X.C108755dV;
import X.C108815db;
import X.C109015dw;
import X.C117115rP;
import X.C125186Gr;
import X.C132146em;
import X.C132166eo;
import X.C132176ep;
import X.C1448173b;
import X.C146937Ce;
import X.C151257Ua;
import X.C152217Ya;
import X.C152967aS;
import X.C154197cm;
import X.C158357jq;
import X.C160617ny;
import X.C162457s7;
import X.C166357yY;
import X.C18260x0;
import X.C18270x1;
import X.C18300x5;
import X.C1891990j;
import X.C27821ej;
import X.C29201iR;
import X.C29221iT;
import X.C29421in;
import X.C48922fh;
import X.C49712gy;
import X.C55502qS;
import X.C55682qk;
import X.C56422rx;
import X.C56602sG;
import X.C56612sH;
import X.C56962sq;
import X.C56972sr;
import X.C60152y5;
import X.C620433g;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C626936e;
import X.C64393Dh;
import X.C69263Wi;
import X.C86604Kt;
import X.C86644Kx;
import X.C86664Kz;
import X.C89224c7;
import X.C89654ea;
import X.C989053r;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.order.viewmodel.OrderInfoViewModel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.wds.components.button.WDSButton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CartFragment extends Hilt_CartFragment {
    public static final HashMap A1B = AnonymousClass001.A0t();
    public static final HashMap A1C = AnonymousClass001.A0t();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public LinearLayout A08;
    public TextView A09;
    public RecyclerView A0A;
    public C55682qk A0B;
    public AnonymousClass7C3 A0C;
    public AnonymousClass7C8 A0D;
    public AnonymousClass7CH A0E;
    public AnonymousClass2V3 A0F;
    public C64393Dh A0G;
    public C69263Wi A0H;
    public KeyboardPopupLayout A0I;
    public C56972sr A0J;
    public C621033m A0K;
    public C49712gy A0L;
    public WaTextView A0M;
    public WaTextView A0N;
    public WaTextView A0O;
    public C620433g A0P;
    public C29201iR A0Q;
    public AnonymousClass5UW A0R;
    public C1448173b A0S;
    public C154197cm A0T;
    public C104095Pq A0U;
    public AnonymousClass4XK A0V;
    public AnonymousClass4V6 A0W;
    public C125186Gr A0X;
    public C29221iT A0Y;
    public C105405Uu A0Z;
    public C105145Tt A0a;
    public C151257Ua A0b;
    public C152967aS A0c;
    public OrderInfoViewModel A0d;
    public C106665Zw A0e;
    public C56962sq A0f;
    public C48922fh A0g;
    public C29421in A0h;
    public C56422rx A0i;
    public AnonymousClass5ZU A0j;
    public C620633i A0k;
    public C56612sH A0l;
    public AnonymousClass33p A0m;
    public C620733j A0n;
    public C89224c7 A0o;
    public AnonymousClass5IY A0p;
    public C27821ej A0q;
    public AnonymousClass5Y0 A0r;
    public EmojiSearchProvider A0s;
    public AnonymousClass1VX A0t;
    public UserJid A0u;
    public MentionableEntry A0v;
    public C105915Wx A0w;
    public AnonymousClass31C A0x;
    public C105255Ue A0y;
    public C60152y5 A0z;
    public AnonymousClass7SU A10;
    public AnonymousClass7SV A11;
    public C104705Sa A12;
    public AnonymousClass30V A13;
    public C105895Wv A14;
    public C989053r A15;
    public AnonymousClass4FS A16;
    public WDSButton A17;
    public boolean A18 = false;
    public final AnonymousClass4CE A19 = new C1891990j(this, 0);
    public final C56602sG A1A = AnonymousClass681.A00(this, 2);

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x042d, code lost:
        if (r3 == 1) goto L_0x042f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0K(android.os.Bundle r40, android.view.LayoutInflater r41, android.view.ViewGroup r42) {
        /*
            r39 = this;
            r0 = r39
            android.os.Bundle r2 = r0.A0H()
            java.lang.String r1 = "extra_business_id"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            X.C626936e.A06(r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0.A0u = r1
            android.os.Bundle r2 = r0.A0H()
            java.lang.String r1 = "extra_entry_point"
            int r6 = r2.getInt(r1)
            r0.A00 = r6
            com.whatsapp.jid.UserJid r2 = r0.A0u
            X.5Ue r5 = r0.A0y
            X.2sr r1 = r0.A0J
            boolean r1 = r1.A0a(r2)
            r3 = 1
            r2 = r1 ^ 1
            java.lang.String r4 = "cart_view_tag"
            java.lang.String r1 = "IsConsumer"
            r5.A07(r4, r2, r1)
            if (r6 == 0) goto L_0x050b
            if (r6 == r3) goto L_0x0507
            r1 = 2
            if (r6 == r1) goto L_0x0503
            r1 = 3
            if (r6 == r1) goto L_0x04ff
            r1 = 4
            if (r6 == r1) goto L_0x04fb
            r1 = 5
            if (r6 != r1) goto L_0x050f
            java.lang.String r3 = "CatalogSearch"
        L_0x0045:
            X.5Ue r2 = r0.A0y
            java.lang.String r1 = "EntryPoint"
            r2.A05(r4, r1, r3)
            r2 = 2131624945(0x7f0e03f1, float:1.8877084E38)
            r1 = 0
            r4 = r41
            r3 = r42
            android.view.View r3 = r4.inflate(r2, r3, r1)
            r0.A06 = r3
            r2 = 2131431974(0x7f0b1226, float:1.8485692E38)
            com.whatsapp.WaTextView r2 = X.AnonymousClass0x7.A0L(r3, r2)
            r0.A0O = r2
            android.view.View r3 = r0.A06
            r2 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r2 = X.C06560Yg.A02(r3, r2)
            com.whatsapp.KeyboardPopupLayout r2 = (com.whatsapp.KeyboardPopupLayout) r2
            r0.A0I = r2
            android.view.View r3 = r0.A06
            r2 = 2131429844(0x7f0b09d4, float:1.8481372E38)
            android.view.View r2 = X.C06560Yg.A02(r3, r2)
            com.whatsapp.mentions.MentionableEntry r2 = (com.whatsapp.mentions.MentionableEntry) r2
            r0.A0v = r2
            android.view.View r3 = r0.A06
            r2 = 2131429711(0x7f0b094f, float:1.8481102E38)
            android.widget.ImageButton r17 = X.C86664Kz.A0t(r3, r2)
            android.view.View r3 = r0.A06
            r2 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r2 = X.C06560Yg.A02(r3, r2)
            r0.A05 = r2
            android.view.View r3 = r0.A06
            r2 = 2131428559(0x7f0b04cf, float:1.8478766E38)
            android.view.View r2 = X.C06560Yg.A02(r3, r2)
            r0.A04 = r2
            android.view.View r3 = r0.A06
            r2 = 2131429742(0x7f0b096e, float:1.8481165E38)
            com.whatsapp.WaTextView r2 = X.AnonymousClass0x7.A0L(r3, r2)
            r0.A0N = r2
            android.view.View r3 = r0.A06
            r2 = 2131429741(0x7f0b096d, float:1.8481163E38)
            com.whatsapp.WaTextView r2 = X.AnonymousClass0x7.A0L(r3, r2)
            r0.A0M = r2
            android.view.View r3 = r0.A06
            r2 = 2131428561(0x7f0b04d1, float:1.847877E38)
            android.view.View r2 = X.C06560Yg.A02(r3, r2)
            r0.A07 = r2
            android.view.View r3 = r0.A06
            r2 = 2131428575(0x7f0b04df, float:1.8478798E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.C86654Ky.A0P(r3, r2)
            r0.A0A = r2
            android.view.View r2 = r0.A06
            r12 = 2131433504(0x7f0b1820, float:1.8488796E38)
            android.widget.LinearLayout r2 = X.C86654Ky.A0N(r2, r12)
            r0.A08 = r2
            X.5Pq r2 = r0.A0U
            X.1VX r3 = r2.A02
            r2 = 1867(0x74b, float:2.616E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x00ea
            android.view.View r3 = r0.A06
            r2 = 2131433509(0x7f0b1825, float:1.8488806E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r3, r2)
            r0.A09 = r2
        L_0x00ea:
            android.view.View r3 = r0.A06
            r2 = 2131433496(0x7f0b1818, float:1.848878E38)
            X.C06560Yg.A02(r3, r2)
            android.view.View r3 = r0.A06
            r2 = 2131433507(0x7f0b1823, float:1.8488802E38)
            com.whatsapp.wds.components.button.WDSButton r2 = X.C86654Ky.A0f(r3, r2)
            r0.A17 = r2
            android.view.View r3 = r0.A06
            r2 = 2131428556(0x7f0b04cc, float:1.847876E38)
            android.view.View r13 = X.C06560Yg.A02(r3, r2)
            android.view.View r5 = r0.A06
            android.graphics.Point r3 = X.AnonymousClass4L0.A07()
            X.03q r2 = r0.A0R()
            X.C86604Kt.A0x(r2, r3)
            android.graphics.Rect r4 = X.AnonymousClass001.A0N()
            X.03q r2 = r0.A0R()
            android.view.View r2 = X.AnonymousClass001.A0Q(r2)
            r2.getWindowVisibleDisplayFrame(r4)
            int r3 = r3.y
            int r2 = r4.top
            int r3 = r3 - r2
            r5.setMinimumHeight(r3)
            android.view.View r3 = r0.A06
            r2 = 2131434216(0x7f0b1ae8, float:1.849024E38)
            android.view.View r5 = X.C06560Yg.A02(r3, r2)
            int r3 = r5.getPaddingLeft()
            int r2 = r5.getPaddingRight()
            int r4 = java.lang.Math.max(r3, r2)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            X.33j r2 = r0.A0n
            boolean r2 = X.C620733j.A04(r2)
            if (r2 == 0) goto L_0x04f7
            r3.rightMargin = r4
        L_0x014f:
            r5.setLayoutParams(r3)
            android.content.res.Resources r3 = X.C08310eF.A09(r0)
            r2 = 2131167699(0x7f0709d3, float:1.7949679E38)
            int r2 = r3.getDimensionPixelSize(r2)
            r0.A03 = r2
            android.content.res.Resources r3 = X.C08310eF.A09(r0)
            r2 = 2131167698(0x7f0709d2, float:1.7949677E38)
            int r2 = r3.getDimensionPixelSize(r2)
            r0.A02 = r2
            android.app.Dialog r2 = r0.A03
            if (r2 == 0) goto L_0x0181
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L_0x0181
            android.app.Dialog r2 = r0.A03
            android.view.Window r3 = r2.getWindow()
            r2 = 16
            r3.setSoftInputMode(r2)
        L_0x0181:
            com.whatsapp.mentions.MentionableEntry r4 = r0.A0v
            android.content.Context r3 = r0.A0G()
            r2 = 2131896067(0x7f122703, float:1.9426985E38)
            java.lang.String r2 = r3.getString(r2)
            r4.setHint(r2)
            X.7CH r3 = r0.A0E
            com.whatsapp.jid.UserJid r15 = r0.A0u
            X.5sv r2 = r3.A00
            X.3Db r2 = r2.A04
            X.3Wi r19 = X.C64333Db.A04(r2)
            X.5sv r4 = r3.A00
            X.3Db r2 = r4.A04
            X.4FS r28 = X.C64333Db.A8y(r2)
            X.4C1 r3 = r2.A4T
            java.lang.Object r11 = r3.get()
            X.5UW r11 = (X.AnonymousClass5UW) r11
            X.4C1 r3 = r2.ARg
            java.lang.Object r10 = r3.get()
            X.1iT r10 = (X.C29221iT) r10
            X.4C1 r3 = r2.A4W
            java.lang.Object r9 = r3.get()
            X.5Uu r9 = (X.C105405Uu) r9
            X.4au r4 = r4.A03
            X.3Db r3 = r4.A1B
            X.3Wi r30 = X.C86614Ku.A0K(r3)
            X.4C1 r5 = r3.A2Q
            java.lang.Object r6 = r5.get()
            X.5Ue r6 = (X.C105255Ue) r6
            X.31C r36 = X.C86614Ku.A0c(r3)
            X.33g r31 = X.C86634Kw.A0W(r3)
            X.5Lk r5 = new X.5Lk
            r5.<init>()
            X.7Cl r7 = new X.7Cl
            r7.<init>(r5)
            X.4C1 r5 = r3.AG3
            java.lang.Object r5 = r5.get()
            X.5Wx r5 = (X.C105915Wx) r5
            X.33p r34 = X.C86614Ku.A0W(r3)
            X.4as r4 = r4.A18
            X.5Pq r32 = r4.ABU()
            X.4C1 r4 = r3.A4e
            java.lang.Object r4 = r4.get()
            X.5Sa r4 = (X.C104705Sa) r4
            X.4gs r26 = new X.4gs
            r29 = r26
            r33 = r7
            r35 = r5
            r37 = r6
            r38 = r4
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.33g r31 = X.C86634Kw.A0W(r3)
            X.3Wi r30 = X.C86614Ku.A0K(r3)
            X.4C1 r4 = r3.A2Q
            java.lang.Object r6 = r4.get()
            X.5Ue r6 = (X.C105255Ue) r6
            X.31C r35 = X.C86614Ku.A0c(r3)
            X.5Lk r8 = new X.5Lk
            r8.<init>()
            X.5Zw r5 = new X.5Zw
            r14 = 0
            r5.<init>(r1)
            X.73c r4 = new X.73c
            r4.<init>()
            X.7KF r7 = new X.7KF
            r7.<init>(r4, r5, r8)
            X.4C1 r4 = r3.AG3
            java.lang.Object r5 = r4.get()
            X.5Wx r5 = (X.C105915Wx) r5
            X.4C1 r4 = r3.A4e
            java.lang.Object r4 = r4.get()
            X.5Sa r4 = (X.C104705Sa) r4
            X.1VX r33 = X.C86604Kt.A0Y(r3)
            X.4gr r22 = new X.4gr
            r29 = r22
            r32 = r7
            r34 = r5
            r36 = r6
            r37 = r4
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            X.33g r20 = X.C86624Kv.A0K(r2)
            X.5Tt r25 = X.C86644Kx.A0P(r2)
            X.5PC r2 = new X.5PC
            r23 = r10
            r24 = r9
            r27 = r15
            r18 = r2
            r21 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.7aS r6 = r0.A0c
            X.7C8 r5 = r0.A0D
            com.whatsapp.jid.UserJid r4 = r0.A0u
            X.4XK r3 = new X.4XK
            r22 = r0
            r23 = r0
            r19 = r5
            r20 = r2
            r21 = r0
            r24 = r6
            r25 = r4
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0.A0V = r3
            com.whatsapp.jid.UserJid r5 = r0.A0u
            X.7C3 r4 = r0.A0C
            X.5gg r3 = new X.5gg
            r3.<init>(r4, r2, r5)
            X.0XL r3 = X.AnonymousClass4L0.A0F(r3, r0)
            java.lang.Class<X.4V6> r2 = X.AnonymousClass4V6.class
            X.0Ty r2 = r3.A01(r2)
            X.4V6 r2 = (X.AnonymousClass4V6) r2
            r0.A0W = r2
            X.2V3 r3 = r0.A0F
            com.whatsapp.jid.UserJid r2 = r0.A0u
            X.5Ox r3 = r3.A00(r2)
            X.80M r2 = new X.80M
            r2.<init>(r3)
            X.0XL r3 = X.AnonymousClass4L0.A0F(r2, r0)
            java.lang.Class<X.6Gr> r2 = X.C125186Gr.class
            X.0Ty r2 = r3.A01(r2)
            X.6Gr r2 = (X.C125186Gr) r2
            r0.A0X = r2
            r2 = 11
            X.53v r3 = new X.53v
            r3.<init>(r0, r2)
            com.whatsapp.wds.components.button.WDSButton r2 = r0.A17
            r2.setOnClickListener(r3)
            X.4V6 r2 = r0.A0W
            X.08M r2 = r2.A0E
            r4 = 12
            X.C86604Kt.A1M(r0, r2, r4)
            X.4FS r3 = r0.A16
            r2 = 19
            X.C117115rP.A01(r3, r0, r2)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A0A
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r3.setMargins(r1, r1, r1, r1)
            r2 = 2
            r3.addRule(r2, r12)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A0A
            r2.setLayoutParams(r3)
            android.widget.LinearLayout r2 = r0.A08
            r2.setVisibility(r1)
            android.view.View r3 = r0.A05
            r2 = 8
            r3.setVisibility(r2)
            X.C989453v.A00(r13, r0, r4)
            android.view.View r3 = r0.A07
            r2 = 13
            X.C989453v.A00(r3, r0, r2)
            androidx.recyclerview.widget.RecyclerView r3 = r0.A0A
            r2 = 1
            r3.A0h = r2
            X.4XK r2 = r0.A0V
            r3.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r0.A0A
            X.0UY r3 = r2.A0R
            boolean r2 = r3 instanceof X.AnonymousClass09N
            if (r2 == 0) goto L_0x031a
            X.09N r3 = (X.AnonymousClass09N) r3
            r3.A00 = r1
        L_0x031a:
            X.0XL r3 = X.AnonymousClass0x9.A0H(r0)
            java.lang.Class<com.whatsapp.biz.order.viewmodel.OrderInfoViewModel> r2 = com.whatsapp.biz.order.viewmodel.OrderInfoViewModel.class
            X.0Ty r2 = r3.A01(r2)
            com.whatsapp.biz.order.viewmodel.OrderInfoViewModel r2 = (com.whatsapp.biz.order.viewmodel.OrderInfoViewModel) r2
            r0.A0d = r2
            X.4V6 r2 = r0.A0W
            X.08M r3 = r2.A08
            X.0sA r2 = r0.A0V()
            r5 = 7
            X.C86604Kt.A1N(r2, r3, r0, r5)
            X.4V6 r2 = r0.A0W
            X.08M r4 = r2.A0C
            X.0sA r3 = r0.A0V()
            r2 = 5
            X.AnonymousClass6C6.A02(r3, r4, r0, r2)
            X.4V6 r2 = r0.A0W
            X.08M r4 = r2.A03
            X.0sA r3 = r0.A0V()
            r2 = 6
            X.AnonymousClass6C6.A02(r3, r4, r0, r2)
            X.4V6 r2 = r0.A0W
            X.08M r3 = r2.A00
            X.0sA r2 = r0.A0V()
            X.AnonymousClass6C6.A02(r2, r3, r0, r5)
            X.6Gr r2 = r0.A0X
            X.08J r3 = r2.A00
            X.0sA r2 = r0.A0V()
            r7 = 8
            X.C86604Kt.A1N(r2, r3, r0, r7)
            X.4V6 r2 = r0.A0W
            X.08M r3 = r2.A0A
            X.0sA r2 = r0.A0V()
            r6 = 9
            X.C86604Kt.A1N(r2, r3, r0, r6)
            X.4V6 r2 = r0.A0W
            X.08M r3 = r2.A07
            X.0sA r2 = r0.A0V()
            r4 = 10
            X.C86604Kt.A1N(r2, r3, r0, r4)
            X.4V6 r2 = r0.A0W
            X.08M r5 = r2.A06
            X.0sA r3 = r0.A0V()
            r2 = 11
            X.C86604Kt.A1N(r3, r5, r0, r2)
            X.4V6 r2 = r0.A0W
            X.08M r5 = r2.A09
            X.0sA r3 = r0.A0V()
            r2 = 13
            X.C86604Kt.A1N(r3, r5, r0, r2)
            X.4V6 r2 = r0.A0W
            X.08M r3 = r2.A05
            X.0sA r2 = r0.A0V()
            X.AnonymousClass6C6.A02(r2, r3, r0, r7)
            X.4V6 r2 = r0.A0W
            X.08M r3 = r2.A0D
            X.0sA r2 = r0.A0V()
            X.AnonymousClass6C6.A02(r2, r3, r0, r6)
            X.4V6 r2 = r0.A0W
            X.08M r3 = r2.A04
            X.0sA r2 = r0.A0V()
            X.AnonymousClass6C6.A02(r2, r3, r0, r4)
            X.5Pq r2 = r0.A0U
            X.1VX r3 = r2.A02
            r2 = 1867(0x74b, float:2.616E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 == 0) goto L_0x03f1
            android.widget.TextView r2 = r0.A09
            if (r2 == 0) goto L_0x03f1
            X.4V6 r2 = r0.A0W
            X.08M r4 = r2.A0B
            X.0sA r3 = r0.A0V()
            r2 = 14
            X.C86604Kt.A1N(r3, r4, r0, r2)
            X.4V6 r2 = r0.A0W
            com.whatsapp.jid.UserJid r6 = r0.A0u
            X.5Pq r5 = r2.A0I
            X.8ER r4 = new X.8ER
            r4.<init>(r2)
            X.C162457s7.A0J(r6, r1)
            X.1VX r3 = r5.A02
            r2 = 1867(0x74b, float:2.616E-42)
            boolean r2 = r3.A0X(r2)
            if (r2 != 0) goto L_0x04eb
            r4.BaR(r1)
        L_0x03f1:
            X.4V6 r2 = r0.A0W
            r2.A01 = r1
            r1 = 1
            r2.A02 = r1
            X.5PC r3 = r2.A0J
            X.4FS r2 = r3.A0M
            r1 = 14
            X.C117115rP.A01(r2, r3, r1)
            X.4V6 r1 = r0.A0W
            X.5PC r4 = r1.A0J
            X.33g r3 = r4.A0C
            com.whatsapp.jid.UserJid r2 = r4.A0J
            r6 = 2
            X.92s r1 = new X.92s
            r1.<init>(r4, r6)
            r3.A06(r1, r2)
            r0.A1e()
            com.whatsapp.WaTextView r5 = r0.A0M
            X.4V6 r1 = r0.A0W
            X.2rx r4 = r1.A0N
            com.whatsapp.jid.UserJid r3 = r1.A0R
            r2 = 0
            X.34n r1 = new X.34n
            r1.<init>((X.C56422rx) r4, (X.C48952fk) r2, (com.whatsapp.jid.UserJid) r3)
            X.3ZC r1 = r1.A03
            int r3 = r1.hostStorage
            if (r3 == r6) goto L_0x042f
            r2 = 1
            r1 = 2131888890(0x7f120afa, float:1.9412428E38)
            if (r3 != r2) goto L_0x0432
        L_0x042f:
            r1 = 2131888891(0x7f120afb, float:1.941243E38)
        L_0x0432:
            r5.setText(r1)
            X.03q r16 = r0.A0R()
            X.1VX r13 = r0.A0t
            X.5Wv r12 = r0.A14
            X.2qk r11 = r0.A0B
            X.5Y0 r10 = r0.A0r
            X.1ej r9 = r0.A0q
            X.33i r8 = r0.A0k
            X.33j r7 = r0.A0n
            X.5IY r6 = r0.A0p
            com.whatsapp.emoji.search.EmojiSearchProvider r5 = r0.A0s
            X.33p r4 = r0.A0m
            X.2y5 r3 = r0.A0z
            com.whatsapp.KeyboardPopupLayout r2 = r0.A0I
            com.whatsapp.mentions.MentionableEntry r1 = r0.A0v
            X.4c7 r15 = new X.4c7
            r22 = r4
            r23 = r7
            r24 = r6
            r25 = r9
            r26 = r10
            r27 = r5
            r28 = r13
            r29 = r3
            r30 = r12
            r18 = r11
            r19 = r2
            r20 = r1
            r21 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0.A0o = r15
            com.whatsapp.KeyboardPopupLayout r2 = r0.A0I
            r1 = 2131429717(0x7f0b0955, float:1.8481115E38)
            android.view.View r8 = r2.findViewById(r1)
            com.whatsapp.emoji.search.EmojiSearchContainer r8 = (com.whatsapp.emoji.search.EmojiSearchContainer) r8
            X.4c7 r5 = r0.A0o
            X.03q r3 = r0.A0R()
            X.5Y0 r7 = r0.A0r
            X.1ej r6 = r0.A0q
            X.33j r4 = r0.A0n
            X.2y5 r1 = r0.A0z
            X.5S9 r2 = new X.5S9
            r9 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.91e r1 = new X.91e
            r1.<init>(r0, r14)
            r2.A00 = r1
            X.4c7 r3 = r0.A0o
            X.4CE r1 = r0.A19
            r3.A0C(r1)
            r2 = 21
            X.5rP r1 = new X.5rP
            r1.<init>(r0, r2)
            r3.A0E = r1
            java.util.HashMap r2 = A1C
            com.whatsapp.jid.UserJid r1 = r0.A0u
            java.lang.String r3 = X.C18320x8.A0e(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x04c9
            java.util.HashMap r2 = A1B
            com.whatsapp.jid.UserJid r1 = r0.A0u
            java.lang.String r1 = X.C18320x8.A0e(r1, r2)
            java.util.List r2 = X.C624435a.A03(r1)
            com.whatsapp.mentions.MentionableEntry r1 = r0.A0v
            r1.setMentionableText(r3, r2)
        L_0x04c9:
            X.5Tt r3 = r0.A0a
            X.5P6 r2 = X.AnonymousClass5P6.A00(r3)
            X.5Tt r1 = r0.A0a
            X.AnonymousClass5P6.A04(r2, r1)
            r1 = 37
            X.AnonymousClass5P6.A02(r2, r1)
            r1 = 52
            X.AnonymousClass5P6.A03(r2, r1)
            com.whatsapp.jid.UserJid r1 = r0.A0u
            r2.A00 = r1
            r3.A03(r2)
            r0.A1d()
            android.view.View r0 = r0.A06
            return r0
        L_0x04eb:
            X.33g r3 = r5.A00
            X.8EJ r2 = new X.8EJ
            r2.<init>(r4)
            r3.A05(r2, r6)
            goto L_0x03f1
        L_0x04f7:
            r3.leftMargin = r4
            goto L_0x014f
        L_0x04fb:
            java.lang.String r3 = "Conversation"
            goto L_0x0045
        L_0x04ff:
            java.lang.String r3 = "PLM"
            goto L_0x0045
        L_0x0503:
            java.lang.String r3 = "Collection"
            goto L_0x0045
        L_0x0507:
            java.lang.String r3 = "Product"
            goto L_0x0045
        L_0x050b:
            java.lang.String r3 = "Catalog"
            goto L_0x0045
        L_0x050f:
            java.lang.String r0 = "CartFragment/logQplCartViewAnnotations/unhandled entry point"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A0K(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A0g() {
        if (this.A0t.A0X(6715)) {
            this.A13.A02(this.A0u, 62);
        }
        super.A0g();
    }

    public void A0p(Bundle bundle) {
        this.A0y.A02(774774619, "cart_view_tag", "CartFragment");
        super.A0p(bundle);
        this.A0h.A06(this.A1A);
        this.A0c = new C152967aS(this.A0b, this.A11);
        if (bundle == null) {
            this.A01 = 2;
            return;
        }
        this.A01 = bundle.getInt("extra_input_method");
        this.A18 = bundle.getBoolean("extra_is_sending_order");
    }

    public final void A1a() {
        C132176ep r5;
        C158357jq r1 = (C158357jq) this.A0X.A00.A07();
        Object A072 = this.A0W.A03.A07();
        if (r1 != null && A072 != null) {
            if (r1.A01) {
                r5 = new C132176ep(r1.A00);
            } else {
                r5 = null;
            }
            AnonymousClass4XK r4 = this.A0V;
            List list = r4.A09;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                }
                Object obj = list.get(size);
                if (!(obj instanceof C132176ep)) {
                    if (obj instanceof C132146em) {
                        size++;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (r5 == null) {
                if (r4.A0L(size) != null) {
                    list.remove(size);
                }
                A1c();
            } else if (size == list.size()) {
                list.add(r5);
            } else if (r4.A0L(size) != null) {
                list.set(size, r5);
            } else if (size != -1) {
                list.add(size, r5);
            }
            r4.A05();
            A1c();
        }
    }

    public final void A1c() {
        AnonymousClass5TF r1;
        String str;
        String str2;
        int i;
        BigDecimal bigDecimal;
        C160617ny r12;
        C166357yY r9;
        int A0K2 = this.A0V.A0K();
        List A0M2 = this.A0V.A0M();
        Date date = this.A0V.A01;
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0M2.iterator();
        while (it.hasNext()) {
            C152217Ya A0J2 = AnonymousClass4L0.A0J(it);
            C109015dw r5 = A0J2.A02;
            List list = r5.A07;
            if (!list.isEmpty()) {
                r9 = new C166357yY(((C108815db) list.get(0)).A04, ((C108815db) list.get(0)).A00);
            } else {
                r9 = null;
            }
            BigDecimal bigDecimal2 = r5.A06;
            C108745dU r13 = r5.A02;
            if (bigDecimal2 == null) {
                bigDecimal2 = null;
            } else if (r13 != null && r13.A00(date)) {
                bigDecimal2 = r13.A01;
            }
            String str3 = r5.A0F;
            String str4 = r5.A05;
            C160617ny r52 = r5.A04;
            C18260x0.A0Q(str3, str4);
            A0s2.add(new C108635dJ((C108755dV) null, r9, r52, str3, str4, bigDecimal2, (int) A0J2.A00, 0));
        }
        C158357jq r0 = (C158357jq) this.A0X.A00.A07();
        if (r0 != null) {
            r1 = r0.A00;
        } else {
            r1 = null;
        }
        String A0D2 = this.A0d.A0D(r1, A0s2);
        TextView A0G2 = C18300x5.A0G(this.A06, R.id.send_cart_cta_save_label);
        View A022 = C06560Yg.A02(this.A06, R.id.send_cart_cta_before_promotion_label);
        TextView A0G3 = C18300x5.A0G(this.A06, R.id.send_cart_cta_before_promotion_amount);
        TextView A0G4 = C18300x5.A0G(this.A06, R.id.send_cart_cta_subtotal_or_total_label);
        if (r1 == null) {
            OrderInfoViewModel orderInfoViewModel = this.A0d;
            HashMap A0t2 = AnonymousClass001.A0t();
            Iterator it2 = A0s2.iterator();
            str2 = null;
            C160617ny r4 = null;
            while (true) {
                if (it2.hasNext()) {
                    C108635dJ r3 = (C108635dJ) it2.next();
                    BigDecimal bigDecimal3 = r3.A02;
                    if (bigDecimal3 == null || (r12 = r3.A01) == null || (r4 != null && !r12.equals(r4))) {
                        break;
                    }
                    A0t2.put(r3.A07, bigDecimal3);
                    r4 = r12;
                } else if (r4 != null) {
                    BigDecimal bigDecimal4 = new BigDecimal(0);
                    Iterator it3 = A0M2.iterator();
                    while (it3.hasNext()) {
                        C152217Ya A0J3 = AnonymousClass4L0.A0J(it3);
                        C109015dw r14 = A0J3.A02;
                        long j = A0J3.A00;
                        BigDecimal bigDecimal5 = (BigDecimal) A0t2.get(r14.A0F);
                        if (!(bigDecimal5 == null || (bigDecimal = r14.A06) == null || bigDecimal.subtract(bigDecimal5).compareTo(BigDecimal.ZERO) <= 0)) {
                            bigDecimal4 = bigDecimal4.add(bigDecimal.subtract(bigDecimal5).multiply(new BigDecimal(j)));
                            C162457s7.A0D(bigDecimal4);
                        }
                    }
                    if (bigDecimal4.compareTo(BigDecimal.ZERO) > 0) {
                        str2 = r4.A04(orderInfoViewModel.A01, bigDecimal4, true);
                    }
                }
            }
            A0G2.setText(R.string.f11nameremoved);
            A022.setVisibility(8);
            A0G3.setVisibility(8);
            i = R.string.f11nameremoved;
        } else {
            OrderInfoViewModel orderInfoViewModel2 = this.A0d;
            BigDecimal A012 = OrderInfoViewModel.A01(A0s2);
            if (A012 == null || A0s2.isEmpty() || ((C108635dJ) A0s2.get(0)).A01 == null) {
                str = null;
            } else {
                C160617ny r53 = ((C108635dJ) A0s2.get(0)).A01;
                C626936e.A06(r53);
                C162457s7.A0H(r53);
                BigDecimal A002 = OrderInfoViewModel.A00(r1, r53, A012);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(8722);
                str = AnonymousClass000.A0X(r53.A04(orderInfoViewModel2.A01, A012.subtract(A002), true), A0o2);
            }
            A0G2.setText(R.string.f11nameremoved);
            A022.setVisibility(0);
            A0G3.setVisibility(0);
            A0G3.setText(this.A0d.A0D((AnonymousClass5TF) null, A0s2));
            i = R.string.f11nameremoved;
        }
        A0G4.setText(i);
        TextView A0G5 = C18300x5.A0G(this.A06, R.id.send_cart_cta_save_amount);
        TextView A0G6 = C18300x5.A0G(this.A06, R.id.send_cart_cta_subtotal_or_total_label);
        TextView A0G7 = C18300x5.A0G(this.A06, R.id.send_cart_cta_subtotal_or_total_amount);
        if (TextUtils.isEmpty(str2)) {
            A0G2.setVisibility(8);
            A0G5.setVisibility(8);
        } else {
            A0G2.setVisibility(0);
            A0G5.setVisibility(0);
            A0G5.setText(str2);
        }
        if (TextUtils.isEmpty(A0D2)) {
            A0G6.setText(R.string.f11nameremoved);
            A0G7.setVisibility(8);
        } else {
            A0G7.setText(A0D2);
            A0G7.setVisibility(0);
        }
        AnonymousClass4XK r32 = this.A0V;
        int i2 = 0;
        while (true) {
            List list2 = r32.A09;
            if (i2 < list2.size()) {
                C146937Ce r15 = (C146937Ce) list2.get(i2);
                if (r15 instanceof C132166eo) {
                    ((C132166eo) r15).A00 = A0K2;
                    r32.A06(i2);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void A1e() {
        String A0H2;
        AnonymousClass4V6 r1 = this.A0W;
        C56422rx r0 = r1.A0N;
        UserJid userJid = r1.A0R;
        C55502qS A012 = r0.A01(userJid);
        if (A012 != null) {
            A0H2 = A012.A08;
        } else {
            A0H2 = r1.A0O.A0H(new AnonymousClass3ZH(userJid));
        }
        if (!TextUtils.isEmpty(A0H2)) {
            View A022 = C06560Yg.A02(this.A06, R.id.recipient_name_layout);
            ImageView A0E2 = AnonymousClass0x9.A0E(this.A06, R.id.recipient_name_prompt_icon);
            TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(this.A06, R.id.recipient_name_text);
            A022.setVisibility(0);
            C18270x1.A0d(A0G(), A0E2, this.A0n, R.drawable.chevron);
            A0K2.A0K((List) null, A0H2);
        }
    }

    public final void A1f(boolean z) {
        if (z) {
            C86664Kz.A0y(this).BjL();
            C86644Kx.A16(A0J(), A0G().getString(R.string.f11nameremoved), 0);
        }
    }

    public void A0a() {
        super.A0a();
        this.A0c.A00();
        this.A0h.A07(this.A1A);
        this.A0y.A06("cart_view_tag", false);
    }

    public void A0e() {
        MentionableEntry mentionableEntry;
        super.A0e();
        UserJid userJid = this.A0u;
        if (!(userJid == null || (mentionableEntry = this.A0v) == null)) {
            A1C.put(userJid, mentionableEntry.getStringText());
            A1B.put(this.A0u, AnonymousClass4SQ.A00(this.A0v));
        }
        if (this.A00 == 1) {
            A0R().setRequestedOrientation(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r1 != 2) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0f() {
        /*
            r6 = this;
            super.A0f()
            X.03q r4 = r6.A0R()
            int r1 = r6.A01
            if (r1 == 0) goto L_0x0064
            r0 = 1
            r3 = 2
            if (r1 == r0) goto L_0x0048
            if (r1 == r3) goto L_0x005c
        L_0x0011:
            X.4V6 r1 = r6.A0W
            r0 = 0
            r1.A01 = r0
            r0 = 1
            r1.A02 = r0
            X.5PC r2 = r1.A0J
            X.4FS r1 = r2.A0M
            r0 = 14
            X.C117115rP.A01(r1, r2, r0)
            X.6Gr r0 = r6.A0X
            X.5Ox r5 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0A
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "Already fetching promotions"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0034:
            r0 = 10
            r4.setRequestedOrientation(r0)
            return
        L_0x003a:
            X.33g r3 = r5.A02
            com.whatsapp.jid.UserJid r2 = r5.A07
            r1 = 0
            X.5AW r0 = new X.5AW
            r0.<init>(r5, r1)
            r3.A06(r0, r2)
            goto L_0x0034
        L_0x0048:
            X.4c7 r0 = r6.A0o
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x005c
            com.whatsapp.KeyboardPopupLayout r2 = r6.A0I
            r1 = 18
            X.5rP r0 = new X.5rP
            r0.<init>(r6, r1)
            r2.post(r0)
        L_0x005c:
            android.view.Window r0 = r4.getWindow()
            r0.setSoftInputMode(r3)
            goto L_0x0011
        L_0x0064:
            android.view.Window r1 = r4.getWindow()
            r0 = 4
            r1.setSoftInputMode(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.CartFragment.A0f():void");
    }

    public void A0q(Bundle bundle) {
        int i;
        super.A0q(bundle);
        if (this.A0o.isShowing()) {
            i = 1;
        } else {
            i = 2;
            if (C105895Wv.A00(this.A0I)) {
                i = 0;
            }
        }
        this.A01 = i;
        bundle.putInt("extra_input_method", i);
        bundle.putBoolean("extra_is_sending_order", this.A18);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        AnonymousClass0YZ.A0G(view, true);
    }

    public void A1X(View view) {
        super.A1X(view);
        BottomSheetBehavior.A01(view).A0d(false);
    }

    public final void A1b() {
        View view;
        A1c();
        if (this.A0V.A0K() == 0) {
            this.A04.setVisibility(0);
            this.A0A.setVisibility(8);
            this.A05.setVisibility(8);
            view = this.A08;
        } else {
            this.A0A.setVisibility(0);
            this.A08.setVisibility(0);
            view = this.A04;
        }
        view.setVisibility(8);
        this.A0Q.A08();
    }

    public final void A1d() {
        int i;
        int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        if (C86604Kt.A0A(this).orientation == 1) {
            i = dimensionPixelSize * 2;
        } else {
            dimensionPixelSize /= 2;
            i = dimensionPixelSize;
        }
        LinearLayout.LayoutParams A0U2 = AnonymousClass001.A0U(this.A0N);
        A0U2.topMargin = i;
        this.A0N.setLayoutParams(A0U2);
        LinearLayout.LayoutParams A0U3 = AnonymousClass001.A0U(this.A0M);
        A0U3.topMargin = dimensionPixelSize;
        this.A0M.setLayoutParams(A0U3);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1d();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A0t.A0X(6715)) {
            C117115rP.A01(this.A16, this, 20);
        }
        C003203q A0Q2 = A0Q();
        if (A0Q2 instanceof C89654ea) {
            ((C89654ea) A0Q2).A6O(0);
        }
    }
}
