package com.whatsapp.group;

import X.AnonymousClass002;
import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass20D;
import X.AnonymousClass29F;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass58H;
import X.AnonymousClass5Yj;
import X.AnonymousClass66R;
import X.C106715a2;
import X.C107695bk;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C27991fJ;
import X.C378924l;
import X.C616131n;
import X.C620733j;
import X.C635439q;
import X.C64333Db;
import X.C64773Ex;
import X.C66433Lk;
import X.C78693vQ;
import X.C80703yf;
import X.C84814Du;
import X.C85494Gl;
import X.C89644eZ;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class HistorySettingActivity extends C89644eZ {
    public SwitchCompat A00;
    public C64773Ex A01;
    public C66433Lk A02;
    public C106715a2 A03;
    public boolean A04 = false;
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;

    public void onDestroy() {
        this.A00 = null;
        super.onDestroy();
    }

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = C64333Db.A26(A002);
            this.A02 = C64333Db.A8X(A002);
            this.A03 = C18280x3.A0Q(r1);
        }
    }

    public HistorySettingActivity() {
        super(R.layout.f8nameremoved);
        AnonymousClass4HY.A00(this, 65);
        this.A05 = C154517dI.A00(AnonymousClass58H.NONE, new C80703yf(this));
        this.A06 = C154517dI.A01(new C78693vQ(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C620733j r1 = this.A00;
        C162457s7.A0C(r1);
        AnonymousClass29F.A00(this, (Toolbar) C18290x4.A0N(this, R.id.toolbar), r1, C18290x4.A0l(this, R.string.f11nameremoved));
        getWindow().setNavigationBarColor(AnonymousClass0Y8.A04(this.A00.getContext(), AnonymousClass5Yj.A02(this.A00.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
        C18310x6.A0L(this, R.id.title).setText(R.string.f11nameremoved);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.shared_time_text);
        C106715a2 r5 = this.A03;
        if (r5 != null) {
            Context context = textEmojiLabel.getContext();
            Object[] A0L = AnonymousClass002.A0L();
            C66433Lk r12 = this.A02;
            if (r12 != null) {
                textEmojiLabel.setText(r5.A03(context, AnonymousClass002.A0F(this, r12.A03("330159992681779").toString(), A0L, 0, R.string.f11nameremoved)));
                C18270x1.A0q(textEmojiLabel, textEmojiLabel.getAbProps());
                AnonymousClass0x2.A12(textEmojiLabel, this.A08);
                WDSSwitch wDSSwitch = new WDSSwitch(C18290x4.A0F(this.A00), (AttributeSet) null, 0, 6, (C378924l) null);
                wDSSwitch.setId(R.id.history_settings_switch);
                this.A00 = wDSSwitch;
                ((ViewGroup) findViewById(R.id.switch_layout)).addView(wDSSwitch);
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A06.getValue();
                C27991fJ r0 = (C27991fJ) this.A05.getValue();
                C162457s7.A0J(r0, 0);
                historySettingViewModel.A01 = r0;
                C616131n.A02((C85494Gl) null, new HistorySettingViewModel$updateChecked$1(historySettingViewModel, (C84814Du) null), AnonymousClass0IV.A00(historySettingViewModel), (AnonymousClass20D) null, 3);
                C616131n.A02((C85494Gl) null, new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C84814Du) null), AnonymousClass0IV.A00(historySettingViewModel), (AnonymousClass20D) null, 3);
                C616131n.A02((C85494Gl) null, new HistorySettingActivity$bindSwitch$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                SwitchCompat switchCompat = this.A00;
                if (switchCompat != null) {
                    C635439q.A00(switchCompat, this, 4);
                }
                C616131n.A02((C85494Gl) null, new HistorySettingActivity$bindError$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                return;
            }
            throw C18270x1.A0S("faqLinkFactory");
        }
        throw C18270x1.A0S("linkifier");
    }
}
