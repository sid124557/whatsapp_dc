package com.whatsapp.biz.order.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2z0;
import X.AnonymousClass31C;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4UZ;
import X.AnonymousClass4XJ;
import X.AnonymousClass5LD;
import X.AnonymousClass5P6;
import X.AnonymousClass5UY;
import X.AnonymousClass68K;
import X.AnonymousClass6C6;
import X.AnonymousClass7H0;
import X.AnonymousClass7SV;
import X.AnonymousClass800;
import X.C06560Yg;
import X.C103065Lk;
import X.C104095Pq;
import X.C105145Tt;
import X.C105255Ue;
import X.C107395bF;
import X.C110665gp;
import X.C113905mB;
import X.C116985rC;
import X.C117715sN;
import X.C146837Bu;
import X.C146847Bv;
import X.C146857Bw;
import X.C147017Cm;
import X.C149687Nm;
import X.C151257Ua;
import X.C152967aS;
import X.C153087ae;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C195219Wq;
import X.C55832qz;
import X.C55942rA;
import X.C56422rx;
import X.C56612sH;
import X.C56972sr;
import X.C620433g;
import X.C626936e;
import X.C64333Db;
import X.C66543Lv;
import X.C86604Kt;
import X.C86654Ky;
import X.C90154go;
import X.C989453v;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.order.viewmodel.OrderInfoViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Hashtable;
import java.util.concurrent.Future;

public class OrderDetailFragment extends Hilt_OrderDetailFragment {
    public ProgressBar A00;
    public C116985rC A01;
    public C116985rC A02;
    public C146837Bu A03;
    public C146847Bv A04;
    public C146857Bw A05;
    public C56972sr A06;
    public WaTextView A07;
    public C104095Pq A08;
    public C105145Tt A09;
    public C151257Ua A0A;
    public C152967aS A0B;
    public AnonymousClass4XJ A0C;
    public AnonymousClass4UZ A0D;
    public OrderInfoViewModel A0E;
    public C56422rx A0F;
    public C113905mB A0G;
    public C56612sH A0H;
    public C66543Lv A0I;
    public AnonymousClass1VX A0J;
    public UserJid A0K;
    public UserJid A0L;
    public C153087ae A0M;
    public C195219Wq A0N;
    public C105255Ue A0O;
    public AnonymousClass7SV A0P;
    public AnonymousClass2z0 A0Q;
    public C55942rA A0R;
    public C55832qz A0S;
    public AnonymousClass5UY A0T;
    public AnonymousClass4FS A0U;
    public WDSButton A0V;
    public String A0W;

    public static OrderDetailFragment A00(UserJid userJid, UserJid userJid2, AnonymousClass2z0 r6, String str, String str2) {
        OrderDetailFragment orderDetailFragment = new OrderDetailFragment();
        Bundle A082 = AnonymousClass002.A08();
        C107395bF.A07(A082, r6);
        A082.putParcelable("extra_key_seller_jid", userJid);
        A082.putParcelable("extra_key_buyer_jid", userJid2);
        A082.putString("extra_key_order_id", str);
        A082.putString("extra_key_token", str2);
        A082.putBoolean("extra_key_enable_create_order", false);
        orderDetailFragment.A0u(A082);
        return orderDetailFragment;
    }

    public void A0p(Bundle bundle) {
        this.A0O.A02(774769843, "order_view_tag", "OrderDetailFragment");
        super.A0p(bundle);
        this.A0B = new C152967aS(this.A0A, this.A0P);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C18320x8.A15(inflate.findViewById(R.id.order_detail_close_btn), this, 47);
        this.A00 = (ProgressBar) C06560Yg.A02(inflate, R.id.order_detail_loading_spinner);
        this.A0T = C18290x4.A0X(inflate, R.id.message_btn_layout);
        RecyclerView A0P2 = C86654Ky.A0P(inflate, R.id.order_detail_recycler_view);
        A0P2.A0h = true;
        Parcelable parcelable = A0H().getParcelable("extra_key_seller_jid");
        C626936e.A06(parcelable);
        UserJid userJid = (UserJid) parcelable;
        this.A0L = userJid;
        C146857Bw r5 = this.A05;
        AnonymousClass4XJ r8 = new AnonymousClass4XJ((C146847Bv) r5.A00.A03.A05.get(), this.A0B, this, C64333Db.A4B(r5.A00.A04), userJid);
        this.A0C = r8;
        A0P2.setAdapter(r8);
        AnonymousClass0YZ.A0G(A0P2, false);
        Point A072 = AnonymousClass4L0.A07();
        C86604Kt.A0x(A0R(), A072);
        Rect A0N2 = AnonymousClass001.A0N();
        AnonymousClass001.A0Q(A0R()).getWindowVisibleDisplayFrame(A0N2);
        inflate.setMinimumHeight(A072.y - A0N2.top);
        Parcelable parcelable2 = A0H().getParcelable("extra_key_buyer_jid");
        C626936e.A06(parcelable2);
        this.A0K = (UserJid) parcelable2;
        String string = A0H().getString("extra_key_order_id");
        C626936e.A06(string);
        this.A0W = string;
        String string2 = A0H().getString("extra_key_token");
        C626936e.A06(string2);
        AnonymousClass2z0 A032 = C107395bF.A03(A0H(), "");
        this.A0Q = A032;
        String str = this.A0W;
        AnonymousClass4UZ r4 = (AnonymousClass4UZ) AnonymousClass4L0.A0F(new C110665gp(this.A03, this.A0L, A032, string2, str), this).A01(AnonymousClass4UZ.class);
        this.A0D = r4;
        AnonymousClass6C6.A02(A0V(), r4.A02, this, 20);
        AnonymousClass6C6.A02(A0V(), this.A0D.A01, this, 21);
        this.A07 = AnonymousClass0x7.A0L(inflate, R.id.order_detail_title);
        AnonymousClass4UZ r42 = this.A0D;
        if (r42.A08.A0a(r42.A0E)) {
            this.A07.setText(R.string.f11nameremoved);
        } else {
            AnonymousClass6C6.A02(A0V(), this.A0D.A03, this, 22);
            AnonymousClass4UZ r7 = this.A0D;
            UserJid userJid2 = this.A0L;
            C162457s7.A0J(userJid2, 0);
            C18290x4.A1M(r7.A0G, r7, userJid2, 5);
        }
        this.A0E = (OrderInfoViewModel) AnonymousClass0x9.A0H(this).A01(OrderInfoViewModel.class);
        AnonymousClass4UZ r43 = this.A0D;
        AnonymousClass5LD r6 = r43.A0A;
        UserJid userJid3 = r43.A0E;
        String str2 = r43.A0H;
        String str3 = r43.A0I;
        Object obj2 = r6.A05.A00.get(str2);
        if (obj2 != null) {
            AnonymousClass08M r44 = r6.A00;
            if (r44 != null) {
                r44.A0G(obj2);
            }
        } else {
            C149687Nm r15 = new C149687Nm(userJid3, str2, str3, r6.A03, r6.A02);
            C105255Ue r9 = r6.A0A;
            AnonymousClass31C r82 = r6.A09;
            C620433g r13 = r6.A04;
            C147017Cm r52 = new C147017Cm(new C103065Lk());
            C90154go r12 = new C90154go(r13, r6.A07, r15, r52, r6.A08, r82, r9);
            AnonymousClass7H0 r83 = r6.A06;
            synchronized (r83) {
                Hashtable hashtable = r83.A00;
                obj = (Future) hashtable.get(str2);
                if (obj == null) {
                    String A033 = r12.A04.A03();
                    r12.A05.A04("order_view_tag");
                    r12.A03.A02(r12, r12.A02(A033), A033, 248);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("GetOrderProtocol/sendGetOrderRequest/jid=");
                    C18260x0.A0o(r12.A01.A02, A0o);
                    obj = r12.A06;
                    hashtable.put(str2, obj);
                    C117715sN.A00(r83.A01, r83, obj, str2, 13);
                }
            }
            C18290x4.A1M(r6.A0B, r6, obj, 4);
        }
        C105145Tt r62 = this.A09;
        AnonymousClass5P6 A002 = AnonymousClass5P6.A00(r62);
        AnonymousClass5P6.A04(A002, this.A09);
        AnonymousClass5P6.A02(A002, 35);
        AnonymousClass5P6.A03(A002, 45);
        A002.A00 = this.A0L;
        A002.A0F = this.A0W;
        r62.A03(A002);
        if (A0H().getBoolean("extra_key_enable_create_order")) {
            View A022 = C06560Yg.A02(inflate, R.id.button_container);
            A022.setVisibility(0);
            TextView A0G2 = C18300x5.A0G(A022, R.id.create_order);
            C86604Kt.A1N(A0V(), this.A0D.A00, A0G2, 37);
            A0G2.setOnClickListener(new AnonymousClass68K(this, 1));
            int[] iArr = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
            AnonymousClass1VX r45 = this.A0J;
            C162457s7.A0J(r45, 0);
            A0G2.setText(iArr[r45.A0N(4248)]);
            View A023 = C06560Yg.A02(A022, R.id.decline_order);
            A023.setVisibility(0);
            C989453v.A00(A023, this, 23);
        }
        this.A0G.A03(new AnonymousClass800(0), this.A0L);
        return inflate;
    }

    public void A0a() {
        super.A0a();
        this.A0B.A00();
        this.A0O.A06("order_view_tag", false);
    }
}
