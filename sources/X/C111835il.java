package X;

import com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5il  reason: invalid class name and case insensitive filesystem */
public class C111835il implements C184048rA {
    public final /* synthetic */ ComplianceInfoViewModel A00;
    public final /* synthetic */ String A01;

    public C111835il(ComplianceInfoViewModel complianceInfoViewModel, String str) {
        this.A00 = complianceInfoViewModel;
        this.A01 = str;
    }

    public void BTH(String str, int i) {
        AnonymousClass08M r1;
        int i2;
        boolean equals = this.A01.equals(str);
        ComplianceInfoViewModel complianceInfoViewModel = this.A00;
        if (equals) {
            complianceInfoViewModel.A04.A0P.remove(this);
            r1 = complianceInfoViewModel.A01;
            i2 = 3;
        } else {
            r1 = complianceInfoViewModel.A01;
            i2 = 2;
        }
        C06270Wx.A03(r1, i2);
    }

    public void BTI(AnonymousClass7PB r5, String str) {
        AnonymousClass08M r1;
        int i;
        C166017y0 r12;
        String str2 = this.A01;
        if (str2.equals(str)) {
            ComplianceInfoViewModel complianceInfoViewModel = this.A00;
            complianceInfoViewModel.A04.A0P.remove(this);
            C109015dw A08 = complianceInfoViewModel.A02.A08((UserJid) null, str2);
            if (!(A08 == null || (r12 = A08.A0A) == null)) {
                complianceInfoViewModel.A00.A0H(r12);
                r1 = complianceInfoViewModel.A01;
                i = 1;
                C06270Wx.A03(r1, i);
            }
        }
        r1 = this.A00.A01;
        i = 2;
        C06270Wx.A03(r1, i);
    }
}
