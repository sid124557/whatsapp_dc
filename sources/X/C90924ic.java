package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.4ic  reason: invalid class name and case insensitive filesystem */
public final class C90924ic extends C134576jG {
    public C97834zK A00;
    public AnonymousClass3ZH A01;
    public final C69263Wi A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final C64773Ex A05;
    public final C29421in A06;
    public final AnonymousClass681 A07 = AnonymousClass681.A00(this, 4);
    public final C105365Uq A08;
    public final C64223Cq A09;
    public final C620733j A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4FS A0C;
    public final WDSProfilePhoto A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90924ic(View view, C69263Wi r3, C64773Ex r4, C29421in r5, C105365Uq r6, C64223Cq r7, C620733j r8, AnonymousClass1VX r9, AnonymousClass4FS r10) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A0B = r9;
        this.A02 = r3;
        this.A0C = r10;
        this.A0A = r8;
        this.A05 = r4;
        this.A06 = r5;
        this.A09 = r7;
        this.A08 = r6;
        this.A03 = C86614Ku.A0M(view, R.id.business_header);
        this.A0D = (WDSProfilePhoto) C18280x3.A0E(view, R.id.profile_photo);
        this.A04 = C86614Ku.A0M(view, R.id.business_sub_text);
    }

    public void A09() {
        this.A06.A07(this.A07);
    }

    public /* bridge */ /* synthetic */ void A0D(Object obj, List list) {
        Double d;
        Double d2;
        Double d3;
        Double d4;
        int i;
        C97834zK r14 = (C97834zK) obj;
        C162457s7.A0J(r14, 0);
        this.A00 = r14;
        C106405Yw r1 = C95814uZ.A00;
        AnonymousClass5T8 r2 = r14.A01;
        this.A01 = new AnonymousClass3ZH(r1.A05(r2.A04));
        TextEmojiLabel textEmojiLabel = this.A03;
        String str = r2.A06;
        List<C104465Rb> list2 = r2.A07;
        SpannableStringBuilder A002 = C18330xA.A00(str);
        for (C104465Rb r0 : list2) {
            int i2 = r0.A01;
            if (i2 >= 0 && (i = r0.A00) < str.length()) {
                A002.setSpan(C86634Kw.A0I(textEmojiLabel.getContext(), R.color.f5nameremoved), i2, i + 1, 33);
            }
        }
        textEmojiLabel.setText(A002);
        Integer num = r2.A02;
        if (num == null || num.intValue() != 2) {
            textEmojiLabel.A0E();
        } else {
            textEmojiLabel.A0F(AnonymousClass29N.A00(this.A0B), R.dimen.f6nameremoved);
        }
        String str2 = r2.A05;
        if (!TextUtils.isEmpty(str2)) {
            TextEmojiLabel textEmojiLabel2 = this.A04;
            textEmojiLabel2.setVisibility(0);
            C626936e.A06(str2);
            C162457s7.A0H(str2);
            if (C175728Zm.A0S(str2, "{distance}", false)) {
                AnonymousClass5ZO r10 = r14.A00;
                if (!(!r10.A09() || (d = r2.A00) == null || (d2 = r2.A01) == null)) {
                    double doubleValue = d.doubleValue();
                    if (!Double.isNaN(doubleValue)) {
                        double doubleValue2 = d2.doubleValue();
                        if (!(Double.isNaN(doubleValue2) || doubleValue == 0.0d || doubleValue2 == 0.0d || (d3 = r10.A04) == null || (d4 = r10.A05) == null)) {
                            C626936e.A06(d3);
                            double doubleValue3 = d3.doubleValue();
                            C626936e.A06(d4);
                            LatLng A0H = C86624Kv.A0H(d4, doubleValue3);
                            C626936e.A06(d);
                            double doubleValue4 = d.doubleValue();
                            C626936e.A06(d2);
                            String A003 = AnonymousClass5A8.A00(C86664Kz.A0T(this), C620733j.A02(this.A0A), C1451974o.A00(A0H, C86624Kv.A0H(d2, doubleValue4)));
                            C162457s7.A0H(str2);
                            C162457s7.A0H(A003);
                            str2 = C175738Zn.A0U(str2, "{distance}", A003, false);
                        }
                    }
                }
            }
            textEmojiLabel2.setText(str2);
        } else {
            this.A04.setVisibility(8);
        }
        C109705f3.A00(this.A0H, this, r14, 37);
        C29421in r22 = this.A06;
        Iterable A052 = r22.A05();
        AnonymousClass681 r12 = this.A07;
        if (!C73723fy.A0U(A052, r12)) {
            r22.A06(r12);
        }
        AnonymousClass3ZH r23 = this.A01;
        if (r23 != null) {
            this.A08.A08(this.A0D, r23);
        }
    }
}
