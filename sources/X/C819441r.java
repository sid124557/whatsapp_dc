package X;

import android.text.Editable;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.41r  reason: invalid class name and case insensitive filesystem */
public final class C819441r extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C819441r(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C003203q A0R;
        SearchFunStickersBottomSheet searchFunStickersBottomSheet;
        C620633i r2;
        int i;
        int i2;
        String str;
        AnonymousClass00H r0;
        Editable text;
        C381926c r6 = (C381926c) obj;
        if (r6 instanceof AnonymousClass1UJ) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet2 = this.this$0;
            searchFunStickersBottomSheet2.A0R = null;
            int A05 = C18290x4.A05(searchFunStickersBottomSheet2.A0D);
            WaTextView waTextView = searchFunStickersBottomSheet2.A0E;
            if (waTextView != null) {
                waTextView.setVisibility(A05);
            }
            SearchFunStickersBottomSheet searchFunStickersBottomSheet3 = this.this$0;
            searchFunStickersBottomSheet3.A1Z();
            searchFunStickersBottomSheet3.A1a();
            WaTextView waTextView2 = searchFunStickersBottomSheet3.A0C;
            if (waTextView2 != null) {
                waTextView2.setAlpha(0.0f);
            }
            WaTextView waTextView3 = searchFunStickersBottomSheet3.A0F;
            if (waTextView3 != null) {
                waTextView3.setAlpha(1.0f);
            }
            WaTextView waTextView4 = searchFunStickersBottomSheet3.A0F;
            if (waTextView4 != null) {
                waTextView4.setVisibility(0);
            }
            FrameLayout frameLayout = searchFunStickersBottomSheet3.A03;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            C18270x1.A0p(searchFunStickersBottomSheet3.A05);
            C18300x5.A1H(this.this$0.A0P);
            SearchFunStickersViewModel A0O = C18300x5.A0O(this.this$0);
            C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$stopRollingPrompt$1(A0O, (C84814Du) null), AnonymousClass0IV.A00(A0O), (AnonymousClass20D) null, 3);
            C18300x5.A0O(this.this$0).A0G();
        } else {
            if (r6 instanceof AnonymousClass1UF) {
                SearchFunStickersBottomSheet searchFunStickersBottomSheet4 = this.this$0;
                WaEditText waEditText = searchFunStickersBottomSheet4.A08;
                if (waEditText == null || (text = waEditText.getText()) == null || (str = text.toString()) == null) {
                    str = "";
                }
                searchFunStickersBottomSheet4.A0R = str;
                this.this$0.A1a();
                SearchFunStickersBottomSheet searchFunStickersBottomSheet5 = this.this$0;
                LottieAnimationView lottieAnimationView = searchFunStickersBottomSheet5.A06;
                if (lottieAnimationView == null || (r0 = lottieAnimationView.A0F.A0K) == null || !r0.A07) {
                    int A052 = C18290x4.A05(searchFunStickersBottomSheet5.A0F);
                    FrameLayout frameLayout2 = searchFunStickersBottomSheet5.A03;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(A052);
                    }
                    LottieAnimationView lottieAnimationView2 = searchFunStickersBottomSheet5.A06;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setRepeatCount(-1);
                        lottieAnimationView2.A01();
                    }
                    int A053 = C18290x4.A05(searchFunStickersBottomSheet5.A0D);
                    WaTextView waTextView5 = searchFunStickersBottomSheet5.A0E;
                    if (waTextView5 != null) {
                        waTextView5.setVisibility(A053);
                    }
                    C194711h r22 = searchFunStickersBottomSheet5.A0J;
                    if (r22 != null) {
                        Log.d("SearchFunStickersAdapter/configureLoadingState");
                        List A0F = C73723fy.A0F(r22.A08);
                        Log.d("SearchFunStickersAdapter/refreshContent");
                        if (C18310x6.A1X(A0F)) {
                            r22.A0L(A0F);
                        }
                    }
                    AnonymousClass0x2.A0x(searchFunStickersBottomSheet5.A05);
                }
                SearchFunStickersBottomSheet searchFunStickersBottomSheet6 = this.this$0;
                int A054 = C18290x4.A05(searchFunStickersBottomSheet6.A0D);
                WaTextView waTextView6 = searchFunStickersBottomSheet6.A0E;
                if (waTextView6 != null) {
                    waTextView6.setVisibility(A054);
                }
                AnonymousClass5UY r02 = this.this$0.A0P;
                if (r02 != null) {
                    r02.A06(A054);
                }
                A0R = this.this$0.A0R();
                searchFunStickersBottomSheet = this.this$0;
                r2 = searchFunStickersBottomSheet.A0H;
                if (r2 != null) {
                    i = R.string.f11nameremoved;
                } else {
                    throw C18270x1.A0S("systemServices");
                }
            } else if (r6 instanceof AnonymousClass1UG) {
                SearchFunStickersBottomSheet searchFunStickersBottomSheet7 = this.this$0;
                WaTextView waTextView7 = searchFunStickersBottomSheet7.A0C;
                if (waTextView7 != null) {
                    waTextView7.setAlpha(0.0f);
                }
                int A055 = C18290x4.A05(searchFunStickersBottomSheet7.A0F);
                FrameLayout frameLayout3 = searchFunStickersBottomSheet7.A03;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(A055);
                }
                SearchFunStickersBottomSheet searchFunStickersBottomSheet8 = this.this$0;
                C162457s7.A0H(r6);
                AnonymousClass1UG r62 = (AnonymousClass1UG) r6;
                int A056 = C18290x4.A05(searchFunStickersBottomSheet8.A05);
                WaTextView waTextView8 = searchFunStickersBottomSheet8.A0D;
                if (waTextView8 != null) {
                    waTextView8.setVisibility(0);
                    Exception exc = r62.A00;
                    if (exc instanceof C375923f) {
                        i2 = R.string.f11nameremoved;
                    } else if (exc instanceof C376023g) {
                        i2 = R.string.f11nameremoved;
                    } else if (exc instanceof C376123h) {
                        i2 = R.string.f11nameremoved;
                    } else {
                        boolean z = exc instanceof C377823z;
                        i2 = R.string.f11nameremoved;
                        if (z) {
                            i2 = R.string.f11nameremoved;
                        }
                    }
                    waTextView8.setText(C08310eF.A09(searchFunStickersBottomSheet8).getString(i2));
                }
                WaTextView waTextView9 = searchFunStickersBottomSheet8.A0E;
                if (waTextView9 != null) {
                    if (r62.A00 instanceof C375923f) {
                        A056 = 0;
                    }
                    waTextView9.setVisibility(A056);
                }
                searchFunStickersBottomSheet8.A1Z();
                C18300x5.A1H(this.this$0.A0P);
                this.this$0.A1Y();
            } else if (r6 instanceof AnonymousClass1UI) {
                SearchFunStickersBottomSheet.A01(this.this$0, ((AnonymousClass1UI) r6).A01);
                this.this$0.A1c();
                A0R = this.this$0.A0R();
                searchFunStickersBottomSheet = this.this$0;
                r2 = searchFunStickersBottomSheet.A0H;
                if (r2 != null) {
                    i = R.string.f11nameremoved;
                } else {
                    throw C18270x1.A0S("systemServices");
                }
            } else if (r6 instanceof AnonymousClass1UH) {
                SearchFunStickersBottomSheet searchFunStickersBottomSheet9 = this.this$0;
                AnonymousClass1UH r63 = (AnonymousClass1UH) r6;
                String str2 = r63.A00;
                searchFunStickersBottomSheet9.A0R = str2;
                SearchFunStickersBottomSheet.A01(searchFunStickersBottomSheet9, r63.A01);
                this.this$0.A1c();
                SearchFunStickersBottomSheet searchFunStickersBottomSheet10 = this.this$0;
                WaEditText waEditText2 = searchFunStickersBottomSheet10.A08;
                if (waEditText2 != null) {
                    waEditText2.removeTextChangedListener(searchFunStickersBottomSheet10.A0U);
                }
                WaEditText waEditText3 = searchFunStickersBottomSheet10.A08;
                if (waEditText3 != null) {
                    waEditText3.setText(str2);
                }
                WaEditText waEditText4 = searchFunStickersBottomSheet10.A08;
                if (waEditText4 != null) {
                    waEditText4.selectAll();
                }
                WaEditText waEditText5 = searchFunStickersBottomSheet10.A08;
                if (waEditText5 != null) {
                    waEditText5.addTextChangedListener(searchFunStickersBottomSheet10.A0U);
                }
            }
            C107295b4.A00(A0R, r2, C08310eF.A09(searchFunStickersBottomSheet).getString(i));
        }
        return C59022wD.A00;
    }
}
