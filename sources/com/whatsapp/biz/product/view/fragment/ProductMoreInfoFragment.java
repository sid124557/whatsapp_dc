package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass08M;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass64B;
import X.AnonymousClass6C6;
import X.AnonymousClass7PB;
import X.C06270Wx;
import X.C06560Yg;
import X.C106675Zy;
import X.C18300x5;
import X.C52332lJ;
import X.C620733j;
import X.C71323bv;
import X.C86604Kt;
import X.C989453v;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Group;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.jid.UserJid;

public class ProductMoreInfoFragment extends Hilt_ProductMoreInfoFragment implements AnonymousClass64B {
    public ProgressBar A00;
    public Group A01;
    public Group A02;
    public Group A03;
    public TextEmojiLabel A04;
    public TextEmojiLabel A05;
    public TextEmojiLabel A06;
    public WaTextView A07;
    public ComplianceInfoViewModel A08;
    public C620733j A09;
    public C106675Zy A0A;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        View A022 = C06560Yg.A02(inflate, R.id.close_button);
        C18300x5.A13(A0G(), A022, R.string.f11nameremoved);
        C989453v.A00(A022, this, 32);
        this.A00 = (ProgressBar) C06560Yg.A02(inflate, R.id.more_info_progress);
        this.A04 = AnonymousClass0x7.A0K(inflate, R.id.more_info_country_description);
        this.A06 = AnonymousClass0x7.A0K(inflate, R.id.more_info_name_description);
        this.A05 = AnonymousClass0x7.A0K(inflate, R.id.more_info_address_description);
        this.A02 = (Group) C06560Yg.A02(inflate, R.id.importer_country_group);
        this.A03 = (Group) C06560Yg.A02(inflate, R.id.importer_name_group);
        this.A01 = (Group) C06560Yg.A02(inflate, R.id.importer_address_group);
        this.A07 = AnonymousClass0x7.A0L(inflate, R.id.compliance_network_error_info);
        String string = A0H().getString("product_id");
        ComplianceInfoViewModel complianceInfoViewModel = this.A08;
        AnonymousClass08M r2 = complianceInfoViewModel.A01;
        r2.A0H(0);
        if (!complianceInfoViewModel.A04.A09(new AnonymousClass7PB((C52332lJ) null, (UserJid) A0H().getParcelable("product_owner_jid"), 0, (Integer) null, string, complianceInfoViewModel.A03.A02, true))) {
            C06270Wx.A03(r2, 3);
        } else {
            complianceInfoViewModel.A05.BkM(new C71323bv(10, string, complianceInfoViewModel));
        }
        AnonymousClass6C6.A02(A0V(), this.A08.A00, this, 28);
        C86604Kt.A1N(A0V(), this.A08.A01, this, 47);
        return inflate;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A08 = (ComplianceInfoViewModel) AnonymousClass0x9.A0H(this).A01(ComplianceInfoViewModel.class);
    }
}
