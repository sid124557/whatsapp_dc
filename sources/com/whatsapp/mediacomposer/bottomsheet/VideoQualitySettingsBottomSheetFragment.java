package com.whatsapp.mediacomposer.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass35V;
import X.AnonymousClass3Z6;
import X.AnonymousClass7YH;
import X.C08310eF;
import X.C162287rd;
import X.C162457s7;
import X.C182648ol;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C620733j;
import X.C73813g7;
import X.C86644Kx;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.radio.RadioButtonWithSubtitle;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class VideoQualitySettingsBottomSheetFragment extends Hilt_VideoQualitySettingsBottomSheetFragment {
    public C162287rd A00;
    public final long A01;
    public final long A02;
    public final SortedMap A03;
    public final AnonymousClass3Z6 A04;
    public final AnonymousClass3Z6 A05;

    public VideoQualitySettingsBottomSheetFragment(C182648ol r6, Integer num, AnonymousClass3Z6 r8, AnonymousClass3Z6 r9, long j, long j2) {
        super(r6, C18310x6.A06(num));
        this.A04 = r8;
        this.A05 = r9;
        this.A01 = j;
        this.A02 = j2;
        AnonymousClass3Z6[] r4 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A09(Integer.valueOf(R.id.media_quality_default), new AnonymousClass7YH(0, R.string.f11nameremoved), r4, 0);
        AnonymousClass3Z6.A05(Integer.valueOf(R.id.media_quality_hd), new AnonymousClass7YH(3, R.string.f11nameremoved), r4);
        TreeMap treeMap = new TreeMap();
        C73813g7.A0H(treeMap, r4);
        this.A03 = treeMap;
    }

    public void A0w(Bundle bundle, View view) {
        AnonymousClass3Z6 r8;
        long j;
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        String str;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Iterator A0q = AnonymousClass000.A0q(this.A03);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Number number = (Number) A0w.getKey();
            if (((AnonymousClass7YH) A0w.getValue()).A00 == 0) {
                r8 = this.A05;
                j = this.A02;
            } else {
                r8 = this.A04;
                j = this.A01;
            }
            View view2 = this.A0B;
            if (!(view2 == null || (radioButtonWithSubtitle = (RadioButtonWithSubtitle) view2.findViewById(C86644Kx.A07(number))) == null)) {
                if (r8 != null) {
                    Object[] A0M = AnonymousClass002.A0M();
                    A0M[0] = r8.second;
                    str = AnonymousClass0x7.A0n(this, r8.first, A0M, 1, R.string.f11nameremoved);
                } else {
                    str = null;
                }
                C620733j r0 = this.A03;
                if (r0 != null) {
                    String A032 = AnonymousClass35V.A03(r0, j);
                    if (!(str == null || A032 == null)) {
                        Object[] A0M2 = AnonymousClass002.A0M();
                        C18280x3.A19(str, A032, A0M2);
                        A032 = C08310eF.A09(this).getString(R.string.f11nameremoved, A0M2);
                    }
                    radioButtonWithSubtitle.setSubTitle(A032);
                } else {
                    throw C18270x1.A0S("whatsAppLocale");
                }
            }
        }
    }
}
