package X;

import android.animation.Animator;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.36s  reason: invalid class name and case insensitive filesystem */
public final class C627836s implements Animator.AnimatorListener {
    public final /* synthetic */ IndiaUpiFcsTransactionConfirmationActivity A00;

    public C627836s(IndiaUpiFcsTransactionConfirmationActivity indiaUpiFcsTransactionConfirmationActivity) {
        this.A00 = indiaUpiFcsTransactionConfirmationActivity;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        int i;
        int i2;
        WaImageView waImageView;
        IndiaUpiFcsTransactionConfirmationActivity indiaUpiFcsTransactionConfirmationActivity = this.A00;
        int i3 = indiaUpiFcsTransactionConfirmationActivity.A00;
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            return;
        }
        if (indiaUpiFcsTransactionConfirmationActivity.A0F) {
            if (i3 == 1) {
                i = 360;
                i2 = 449;
            } else if (i3 != 2) {
                i = 270;
                i2 = 359;
            } else {
                i = 180;
                i2 = 269;
            }
            AnonymousClass3Z6 A01 = AnonymousClass3Z6.A01(i, i2);
            if (A01 != null) {
                LottieAnimationView lottieAnimationView = indiaUpiFcsTransactionConfirmationActivity.A01;
                if (lottieAnimationView == null) {
                    throw C18270x1.A0S("lottieAnimationView");
                }
                lottieAnimationView.A0F.A0A(AnonymousClass3Z6.A00(A01), AnonymousClass001.A0K(A01.second));
                LottieAnimationView lottieAnimationView2 = indiaUpiFcsTransactionConfirmationActivity.A01;
                if (lottieAnimationView2 == null) {
                    throw C18270x1.A0S("lottieAnimationView");
                }
                lottieAnimationView2.setRepeatCount(1);
            }
            int i4 = indiaUpiFcsTransactionConfirmationActivity.A00;
            if (i4 == 1) {
                WaTextView waTextView = indiaUpiFcsTransactionConfirmationActivity.A05;
                if (waTextView == null) {
                    throw C18270x1.A0S("amountTextView");
                }
                waTextView.setVisibility(8);
                WaTextView waTextView2 = indiaUpiFcsTransactionConfirmationActivity.A07;
                if (waTextView2 == null) {
                    throw C18270x1.A0S("primaryStatus");
                }
                waTextView2.setText(R.string.f11nameremoved);
                WaTextView waTextView3 = indiaUpiFcsTransactionConfirmationActivity.A07;
                if (waTextView3 == null) {
                    throw C18270x1.A0S("primaryStatus");
                }
                ViewGroup.LayoutParams layoutParams = waTextView3.getLayoutParams();
                C162457s7.A0K(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = indiaUpiFcsTransactionConfirmationActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                WaTextView waTextView4 = indiaUpiFcsTransactionConfirmationActivity.A07;
                if (waTextView4 == null) {
                    throw C18270x1.A0S("primaryStatus");
                }
                waTextView4.setLayoutParams(marginLayoutParams);
                WaTextView waTextView5 = indiaUpiFcsTransactionConfirmationActivity.A08;
                if (waTextView5 == null) {
                    throw C18270x1.A0S("secondaryStatus");
                }
                waTextView5.setText(R.string.f11nameremoved);
                waTextView5.setVisibility(0);
                WDSButton wDSButton = indiaUpiFcsTransactionConfirmationActivity.A0C;
                if (wDSButton == null) {
                    throw C18270x1.A0S("doneButton");
                }
                wDSButton.setVisibility(0);
                waImageView = indiaUpiFcsTransactionConfirmationActivity.A04;
                if (waImageView == null) {
                    throw C18270x1.A0S("closeButton");
                }
            } else if (i4 == 2) {
                WaTextView waTextView6 = indiaUpiFcsTransactionConfirmationActivity.A05;
                if (waTextView6 == null) {
                    throw C18270x1.A0S("amountTextView");
                }
                Resources resources = indiaUpiFcsTransactionConfirmationActivity.getResources();
                WaTextView waTextView7 = indiaUpiFcsTransactionConfirmationActivity.A05;
                if (waTextView7 == null) {
                    throw C18270x1.A0S("amountTextView");
                }
                C18320x8.A11(resources, waTextView6, AnonymousClass5Yj.A02(waTextView7.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
                WaTextView waTextView8 = indiaUpiFcsTransactionConfirmationActivity.A07;
                if (waTextView8 == null) {
                    throw C18270x1.A0S("primaryStatus");
                }
                waTextView8.setText(R.string.f11nameremoved);
                C18320x8.A11(waTextView8.getResources(), waTextView8, R.color.f5nameremoved);
                waTextView8.setVisibility(0);
                WaTextView waTextView9 = indiaUpiFcsTransactionConfirmationActivity.A08;
                if (waTextView9 == null) {
                    throw C18270x1.A0S("secondaryStatus");
                }
                Object[] objArr = new Object[1];
                String str = indiaUpiFcsTransactionConfirmationActivity.A0E;
                if (str == null) {
                    throw C18270x1.A0S("merchantName");
                }
                objArr[0] = str;
                AnonymousClass001.A0y(indiaUpiFcsTransactionConfirmationActivity, waTextView9, objArr, R.string.f11nameremoved);
                waTextView9.setVisibility(0);
                WaTextView waTextView10 = indiaUpiFcsTransactionConfirmationActivity.A06;
                if (waTextView10 == null) {
                    throw C18270x1.A0S("dateTextView");
                }
                C620733j whatsAppLocale = waTextView10.getWhatsAppLocale();
                C620733j whatsAppLocale2 = waTextView10.getWhatsAppLocale();
                C56612sH r8 = indiaUpiFcsTransactionConfirmationActivity.A06;
                String A03 = C107505bQ.A03(whatsAppLocale2, r8.A0I(r8.A0D()));
                C620733j whatsAppLocale3 = waTextView10.getWhatsAppLocale();
                C56612sH r82 = indiaUpiFcsTransactionConfirmationActivity.A06;
                AnonymousClass001.A0y(indiaUpiFcsTransactionConfirmationActivity, waTextView10, new Object[]{C107175ap.A04(whatsAppLocale, A03, C107145am.A00(whatsAppLocale3, r82.A0I(r82.A0D())))}, R.string.f11nameremoved);
                waTextView10.setVisibility(0);
                WDSButton wDSButton2 = indiaUpiFcsTransactionConfirmationActivity.A0C;
                if (wDSButton2 == null) {
                    throw C18270x1.A0S("doneButton");
                }
                wDSButton2.setVisibility(0);
                waImageView = indiaUpiFcsTransactionConfirmationActivity.A04;
                if (waImageView == null) {
                    throw C18270x1.A0S("closeButton");
                }
            } else if (i4 == 3) {
                WaTextView waTextView11 = indiaUpiFcsTransactionConfirmationActivity.A05;
                if (waTextView11 == null) {
                    throw C18270x1.A0S("amountTextView");
                }
                waTextView11.setPaintFlags(waTextView11.getPaintFlags() | 16);
                WaTextView waTextView12 = indiaUpiFcsTransactionConfirmationActivity.A07;
                if (waTextView12 == null) {
                    throw C18270x1.A0S("primaryStatus");
                }
                waTextView12.setText(R.string.f11nameremoved);
                C18320x8.A11(waTextView12.getResources(), waTextView12, R.color.f5nameremoved);
                WaTextView waTextView13 = indiaUpiFcsTransactionConfirmationActivity.A08;
                if (waTextView13 == null) {
                    throw C18270x1.A0S("secondaryStatus");
                }
                waTextView13.setText(R.string.f11nameremoved);
                waTextView13.setVisibility(0);
                WDSButton wDSButton3 = indiaUpiFcsTransactionConfirmationActivity.A0C;
                if (wDSButton3 == null) {
                    throw C18270x1.A0S("doneButton");
                }
                wDSButton3.setVisibility(0);
                waImageView = indiaUpiFcsTransactionConfirmationActivity.A04;
                if (waImageView == null) {
                    throw C18270x1.A0S("closeButton");
                }
            } else {
                return;
            }
            waImageView.setVisibility(4);
            return;
        }
        LottieAnimationView lottieAnimationView3 = indiaUpiFcsTransactionConfirmationActivity.A01;
        if (lottieAnimationView3 == null) {
            throw C18270x1.A0S("lottieAnimationView");
        }
        lottieAnimationView3.A0F.A0A(90, 179);
        indiaUpiFcsTransactionConfirmationActivity.A0F = true;
    }

    public void onAnimationStart(Animator animator) {
    }
}
