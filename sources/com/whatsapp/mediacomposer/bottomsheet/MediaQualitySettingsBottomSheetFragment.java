package com.whatsapp.mediacomposer.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass69B;
import X.AnonymousClass7YH;
import X.C08310eF;
import X.C162457s7;
import X.C182648ol;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C55852r1;
import X.C620733j;
import X.C69263Wi;
import X.C86644Kx;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.radio.RadioButtonWithSubtitle;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public abstract class MediaQualitySettingsBottomSheetFragment extends Hilt_MediaQualitySettingsBottomSheetFragment {
    public int A00;
    public RadioButton A01;
    public C69263Wi A02;
    public C620733j A03;
    public AnonymousClass1VX A04;
    public C55852r1 A05;
    public AnonymousClass4FS A06;
    public final C182648ol A07;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        SortedMap sortedMap;
        int i;
        int i2;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        TextView A09 = AnonymousClass002.A09(view, R.id.media_quality_bottom_sheet_title);
        if (A09 != null) {
            if (this instanceof VideoQualitySettingsBottomSheetFragment) {
                i2 = R.string.f11nameremoved;
            } else {
                i2 = R.string.f11nameremoved;
            }
            A09.setText(i2);
            A09.setVisibility(0);
        }
        TextView A092 = AnonymousClass002.A09(view, R.id.media_bottom_sheet_description);
        if (A092 != null) {
            if (this instanceof VideoQualitySettingsBottomSheetFragment) {
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
            }
            A092.setText(i);
            A092.setVisibility(0);
        }
        if (this instanceof VideoQualitySettingsBottomSheetFragment) {
            sortedMap = ((VideoQualitySettingsBottomSheetFragment) this).A03;
        } else {
            sortedMap = ((ImageQualitySettingsBottomSheetFragment) this).A04;
        }
        Iterator A0q = AnonymousClass000.A0q(sortedMap);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            AnonymousClass7YH r1 = (AnonymousClass7YH) A0w.getValue();
            CompoundButton compoundButton = (CompoundButton) view.findViewById(C86644Kx.A07((Number) A0w.getKey()));
            if (compoundButton != null) {
                compoundButton.setChecked(AnonymousClass000.A1U(r1.A00, this.A00));
            }
        }
        View findViewById = view.findViewById(R.id.done_btn);
        AnonymousClass1VX r12 = this.A04;
        if (r12 != null) {
            if (r12.A0X(4244)) {
                C162457s7.A0H(findViewById);
                findViewById.setVisibility(8);
                View findViewById2 = view.findViewById(R.id.media_quality_bottom_sheet);
                if (findViewById2 != null) {
                    findViewById2.layout(findViewById2.getPaddingRight(), findViewById2.getPaddingTop(), findViewById2.getPaddingRight(), 0);
                }
            } else {
                C18290x4.A1F(findViewById, this, 28);
            }
            RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.media_quality);
            if (radioGroup != null) {
                Iterator A0q2 = AnonymousClass000.A0q(sortedMap);
                while (A0q2.hasNext()) {
                    Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                    AnonymousClass7YH r6 = (AnonymousClass7YH) A0w2.getValue();
                    RadioButtonWithSubtitle radioButtonWithSubtitle = new RadioButtonWithSubtitle(A0G(), (AttributeSet) null, 16842878);
                    radioButtonWithSubtitle.setId(C86644Kx.A07((Number) A0w2.getKey()));
                    radioButtonWithSubtitle.setTitle(C08310eF.A09(this).getString(r6.A01));
                    boolean z = true;
                    if (this.A00 != r6.A00) {
                        z = false;
                    }
                    radioButtonWithSubtitle.setChecked(z);
                    radioGroup.addView(radioButtonWithSubtitle);
                }
                radioGroup.setOnCheckedChangeListener(new AnonymousClass69B(this, 0));
            }
            this.A01 = (RadioButton) view.findViewById(R.id.media_quality_default);
            return;
        }
        throw C18270x1.A0R();
    }

    public MediaQualitySettingsBottomSheetFragment(C182648ol r1, int i) {
        this.A07 = r1;
        this.A00 = i;
    }

    public void A0c() {
        super.A0c();
        this.A01 = null;
    }
}
