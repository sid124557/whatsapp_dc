package X;

import android.view.View;
import android.widget.ViewFlipper;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;
import java.util.List;

/* renamed from: X.41n  reason: invalid class name and case insensitive filesystem */
public final class C819041n extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ExpressionsKeyboardSearchBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C819041n(ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        super(1);
        this.this$0 = expressionsKeyboardSearchBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        WaEditText waEditText;
        C19420zy r0;
        C08310eF r2;
        MaterialButtonToggleGroup materialButtonToggleGroup;
        int i;
        Integer valueOf;
        int intValue;
        ViewFlipper viewFlipper;
        AnonymousClass26T r8 = (AnonymousClass26T) obj;
        C162457s7.A0J(r8, 0);
        if (r8 instanceof AnonymousClass1TQ) {
            ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = this.this$0;
            AnonymousClass1TQ r82 = (AnonymousClass1TQ) r8;
            ViewFlipper viewFlipper2 = expressionsKeyboardSearchBottomSheet.A04;
            if (viewFlipper2 != null) {
                view = viewFlipper2.getCurrentView();
            } else {
                view = null;
            }
            if (!C162457s7.A0P(view, expressionsKeyboardSearchBottomSheet.A00)) {
                ViewFlipper viewFlipper3 = expressionsKeyboardSearchBottomSheet.A04;
                if (!(viewFlipper3 == null || (valueOf = Integer.valueOf(viewFlipper3.indexOfChild(expressionsKeyboardSearchBottomSheet.A00))) == null || (intValue = valueOf.intValue()) == -1 || (viewFlipper = expressionsKeyboardSearchBottomSheet.A04) == null)) {
                    viewFlipper.setDisplayedChild(intValue);
                }
                C18270x1.A0p(expressionsKeyboardSearchBottomSheet.A01);
            }
            List list = r82.A03;
            C19420zy r3 = expressionsKeyboardSearchBottomSheet.A0E;
            if (r3 != null && !C162457s7.A0P(list, r3.A04)) {
                MaterialButton materialButton = expressionsKeyboardSearchBottomSheet.A07;
                if (materialButton != null) {
                    materialButton.setVisibility(AnonymousClass001.A08(list.contains(AnonymousClass1Ta.A00) ? 1 : 0));
                }
                MaterialButton materialButton2 = expressionsKeyboardSearchBottomSheet.A06;
                if (materialButton2 != null) {
                    materialButton2.setVisibility(AnonymousClass001.A08(list.contains(AnonymousClass1TY.A00) ? 1 : 0));
                }
                MaterialButton materialButton3 = expressionsKeyboardSearchBottomSheet.A08;
                if (materialButton3 != null) {
                    materialButton3.setVisibility(AnonymousClass001.A08(list.contains(AnonymousClass1Tb.A00) ? 1 : 0));
                }
                r3.A04 = list;
                r3.A05();
            }
            C41552Kr r4 = r82.A02;
            int i2 = r82.A00;
            if (i2 >= 0 && (r0 = expressionsKeyboardSearchBottomSheet.A0E) != null && i2 < r0.A04.size()) {
                C19420zy r02 = expressionsKeyboardSearchBottomSheet.A0E;
                AnonymousClass4A9 r32 = null;
                if (r02 != null) {
                    r2 = (C08310eF) r02.A01.get(i2);
                } else {
                    r2 = null;
                }
                if ((r2 instanceof AnonymousClass4A9) && (r32 = (AnonymousClass4A9) r2) != null) {
                    r32.BmS(true);
                }
                AnonymousClass4A9 r22 = expressionsKeyboardSearchBottomSheet.A0D;
                if (r22 != null && !r22.equals(r32)) {
                    r22.BmS(false);
                }
                expressionsKeyboardSearchBottomSheet.A0D = r32;
                ViewPager viewPager = expressionsKeyboardSearchBottomSheet.A05;
                if (viewPager != null) {
                    viewPager.setCurrentItem(i2);
                }
                if (C162457s7.A0P(r4, AnonymousClass1Ta.A00)) {
                    materialButtonToggleGroup = expressionsKeyboardSearchBottomSheet.A09;
                    if (materialButtonToggleGroup != null) {
                        i = R.id.gifs;
                    }
                } else if (C162457s7.A0P(r4, AnonymousClass1TY.A00)) {
                    materialButtonToggleGroup = expressionsKeyboardSearchBottomSheet.A09;
                    if (materialButtonToggleGroup != null) {
                        i = R.id.avatar_stickers;
                    }
                } else if (C162457s7.A0P(r4, AnonymousClass1Tb.A00) && (materialButtonToggleGroup = expressionsKeyboardSearchBottomSheet.A09) != null) {
                    i = R.id.stickers;
                }
                materialButtonToggleGroup.A02(i, true);
            }
            expressionsKeyboardSearchBottomSheet.A1Y(r82.A01, r4);
            if (r82.A04 && (waEditText = expressionsKeyboardSearchBottomSheet.A0A) != null) {
                waEditText.requestFocus();
                waEditText.A06();
            }
        } else if (!(r8 instanceof AnonymousClass1TO) && (r8 instanceof AnonymousClass1TP)) {
            ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet2 = this.this$0;
            AnonymousClass1TP r83 = (AnonymousClass1TP) r8;
            expressionsKeyboardSearchBottomSheet2.A1Y(r83.A00, r83.A01);
            boolean A1W = AnonymousClass001.A1W(r83.A02.length());
            View view2 = expressionsKeyboardSearchBottomSheet2.A01;
            if (view2 != null) {
                int i3 = 8;
                if (A1W) {
                    i3 = 0;
                }
                view2.setVisibility(i3);
            }
        }
        return C59022wD.A00;
    }
}
