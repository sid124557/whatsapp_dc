package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.608  reason: invalid class name */
public final class AnonymousClass608 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass608(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        super(1);
        this.this$0 = businessDirectorySERPMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.this$0;
        int A07 = C86644Kx.A07((Number) obj);
        if (A07 == 0) {
            DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener = businessDirectorySERPMapViewActivity.A04;
            if (directoryMapViewLocationUpdateListener != null) {
                directoryMapViewLocationUpdateListener.A00();
                Runnable runnable = businessDirectorySERPMapViewActivity.A09;
                if (runnable != null) {
                    businessDirectorySERPMapViewActivity.A0B.removeCallbacks(runnable);
                }
                C117125rQ r3 = new C117125rQ(businessDirectorySERPMapViewActivity, 29);
                businessDirectorySERPMapViewActivity.A09 = r3;
                businessDirectorySERPMapViewActivity.A0B.postDelayed(r3, 15000);
            } else {
                throw C18270x1.A0S("locationUpdateListener");
            }
        } else if (A07 == 1) {
            businessDirectorySERPMapViewActivity.A77(false);
        } else if (A07 != 2) {
            if (A07 == 3) {
                DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener2 = businessDirectorySERPMapViewActivity.A04;
                if (directoryMapViewLocationUpdateListener2 != null) {
                    directoryMapViewLocationUpdateListener2.A00();
                } else {
                    throw C18270x1.A0S("locationUpdateListener");
                }
            } else if (A07 == 7) {
                businessDirectorySERPMapViewActivity.A77(true);
            } else if (A07 == 8) {
                boolean A03 = C005205m.A03(businessDirectorySERPMapViewActivity, "android.permission.ACCESS_FINE_LOCATION");
                int i = R.string.f11nameremoved;
                int i2 = R.string.f11nameremoved;
                if (A03) {
                    i = R.string.f11nameremoved;
                    i2 = R.string.f11nameremoved;
                }
                C19340zH A00 = AnonymousClass5V0.A00(businessDirectorySERPMapViewActivity);
                A00.A0U(R.string.f11nameremoved);
                A00.A0T(i);
                A00.A0Y(new AnonymousClass914(1, businessDirectorySERPMapViewActivity, A03), i2);
                A00.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                C18280x3.A0q(A00);
            } else if (A07 == 9) {
                AnonymousClass4U8 A74 = businessDirectorySERPMapViewActivity.A74();
                boolean A0C = A74.A0S.A0C(A74.A01);
                if (businessDirectorySERPMapViewActivity.A0A || A0C) {
                    Intent A072 = C18320x8.A07();
                    if (A0C) {
                        businessDirectorySERPMapViewActivity.setResult(-1, A072.putExtra("arg_search_filters", businessDirectorySERPMapViewActivity.A74().A0S.A00()));
                    }
                    businessDirectorySERPMapViewActivity.setResult(-1, A072.putExtra("arg_location_access_changed", businessDirectorySERPMapViewActivity.A0A));
                    businessDirectorySERPMapViewActivity.finish();
                } else {
                    businessDirectorySERPMapViewActivity.finishAfterTransition();
                }
            } else if (A07 == 12) {
                RecyclerView recyclerView = businessDirectorySERPMapViewActivity.A02;
                if (recyclerView == null) {
                    throw C18270x1.A0S("horizontalBusinessListView");
                } else if (recyclerView.getVisibility() == 0) {
                    RecyclerView recyclerView2 = businessDirectorySERPMapViewActivity.A02;
                    if (recyclerView2 == null) {
                        throw C18270x1.A0S("horizontalBusinessListView");
                    }
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, C86664Kz.A02(recyclerView2));
                    C86644Kx.A19(translateAnimation, new C167077zj());
                    translateAnimation.setAnimationListener(new C1233368a(businessDirectorySERPMapViewActivity, 1));
                    RecyclerView recyclerView3 = businessDirectorySERPMapViewActivity.A02;
                    if (recyclerView3 == null) {
                        throw C18270x1.A0S("horizontalBusinessListView");
                    }
                    recyclerView3.startAnimation(translateAnimation);
                }
            }
        } else if (!RequestPermissionActivity.A0p(businessDirectorySERPMapViewActivity, C622534h.A09)) {
            C103415Mu r2 = businessDirectorySERPMapViewActivity.A05;
            if (r2 != null) {
                r2.A00(businessDirectorySERPMapViewActivity, new AnonymousClass8FB(businessDirectorySERPMapViewActivity), 0);
            } else {
                throw C18270x1.A0S("locationInfoDialogHelper");
            }
        } else {
            businessDirectorySERPMapViewActivity.A76();
        }
        return C59022wD.A00;
    }
}
